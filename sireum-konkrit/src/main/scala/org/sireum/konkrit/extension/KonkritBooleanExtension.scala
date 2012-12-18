/*
Copyright (c) 2011-2012 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.konkrit.extension

import org.sireum.extension._
import org.sireum.extension.BooleanExtension._
import org.sireum.extension.annotation._
import org.sireum.pilar.ast._
import org.sireum.pilar.eval._
import org.sireum.pilar.state._
import org.sireum.util._
import org.sireum.util.math._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait KonkritBooleanValue extends BooleanValue with ConcreteValue with IsBoolean {
  def value : Boolean
  def asBoolean = value
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object KonkritBooleanExtension extends ExtensionCompanion {
  def create[S <: State[S]](
    config : EvaluatorConfiguration[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]]) =
    new KonkritBooleanExtension(config)

  val Type = "pilar://typeext/" + UriUtil.classUri(this) + "/Type"

  @inline
  def b2v(b : Boolean) = if (b) TT else FF

  private type Op = String

  @inline
  def binopEquSem(opEqu : Op)(b1 : Boolean, b2 : Boolean) =
    opEqu match {
      case "==" => b1 == b2
      case "!=" => b1 != b2
    }

  @inline
  def binopLSem(opL : Op)(b1 : Boolean, b2 : Boolean) =
    opL match {
      case "=="   => b1 == b2
      case "!="   => b1 != b2
      case "&&&"  => b1 && b2
      case "|||"  => b1 || b2
      case "<===" => b1 || !b2
      case "===>" => !b1 || b2
    }

  @inline
  def binopSCSem(opA : Op)(b1 : Boolean) : Either[Boolean, Boolean => Boolean] =
    opA match {
      case "&&"  => if (b1) Right(identity) else Left(false)
      case "||"  => if (b1) Left(true) else Right(identity)
      case "<==" => if (b1) Left(true) else Right(!_)
      case "==>" => if (!b1) Left(true) else Right(identity)
    }

  private type CV = IsBoolean
  private type V = Value
  private type Cnd[S] = (S, V) --> ISeq[(S, Boolean)]

  import language.implicitConversions

  @inline
  private implicit def re2r[S, T](p : (S, T)) = ilist(p)

  @inline
  def cast[S] : (S, V, ResourceUri) --> ISeq[(S, V)] = {
    case (s, v : CV, BooleanExtension.Type)        => (s, v)
    case (s, v : CV, KonkritBooleanExtension.Type) => (s, v)
  }

  @inline
  def cond[S] : (S, V) --> ISeq[(S, Boolean)] = {
    case (s, b : CV) => (s, b.asBoolean)
  }

  @inline
  def trueLit[S] : S --> ISeq[(S, V)] = { case s => (s, TT) }

  @inline
  def falseLit[S] : S --> ISeq[(S, V)] = { case s => (s, FF) }

  @inline
  def defValue[S] : (S, ResourceUri) --> ISeq[(S, V)] = {
    case (s, BooleanExtension.Type) => (s, FF)
  }

  @inline
  def binopLEval[S](cond : Cnd[S]) : (S, V, Op, V) --> ISeq[(S, V)] = {
    case (s, v1 : V, opL : Op, v2 : V) =>
      for {
        (s2, b1) <- cond(s, v1)
        (s3, b2) <- cond(s2, v2)
      } yield (s3, b2v(binopLSem(opL)(b1, b2)))
  }

  @inline
  def binopEqu[S] : (S, V, Op, V) --> ISeq[(S, V)] = {
    case (s, b1 : CV, opEqu, b2 : CV) =>
      (s, b2v(opEqu match {
        case "==" => b1.asBoolean == b2.asBoolean
        case "!=" => b1.asBoolean != b2.asBoolean
      }))
  }

  @inline
  def binopSCEval[S](cond : Cnd[S]) : //
  (S, V, String, S => ISeq[(S, V)]) --> ISeq[(S, V)] = {
    case (s, v1 : V, opSC : String, f) =>
      for {
        (s2, b1) <- cond(s, v1)
        (s5, v) <- {
          binopSCSem(opSC)(b1) match {
            case Left(b) => ilist((s2, b2v(b)))
            case Right(fb) =>
              for {
                (s3, v2) <- f(s2)
                (s4, b2) <- cond(s3, v2)
              } yield (s4, b2v(fb(b2)))
          }
        }
      } yield (s5, v)
  }

  @inline
  def notEval[S](cond : Cnd[S]) : (S, V) --> ISeq[(S, V)] = {
    case (s, v : V) =>
      for {
        (s2, b) <- cond(s, v)
      } yield (s2, b2v(!b))
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object TT extends KonkritBooleanValue {
    val typeUri = KonkritBooleanExtension.Type
    val value = true
  }

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  object FF extends KonkritBooleanValue {
    val typeUri = KonkritBooleanExtension.Type
    val value = false
  }
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
final class KonkritBooleanExtension[S <: State[S]](
  config : EvaluatorConfiguration[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]])
    extends Extension[S, Value, ISeq[(S, Value)], ISeq[(S, Boolean)], ISeq[S]] {

  import KonkritBooleanExtension._

  val uriPath = UriUtil.classUri(this)

  @inline
  def cnd = config.semanticsExtension.cond

  @Cast
  def cast = KonkritBooleanExtension.cast[S]

  @Cond
  def cond = KonkritBooleanExtension.cond[S]

  @Literal(value = classOf[Boolean], isTrue = true)
  def trueLit = KonkritBooleanExtension.trueLit[S]

  @Literal(value = classOf[Boolean], isTrue = false)
  def falseLit = KonkritBooleanExtension.falseLit[S]

  @DefaultValue
  def defValue = KonkritBooleanExtension.defValue[S]

  @Binaries(Array("&&&", "|||", "===>", "<==="))
  def binopLEval = KonkritBooleanExtension.binopLEval(cnd)

  @Binaries(Array("==", "!="))
  def binopEqu = KonkritBooleanExtension.binopEqu[S]

  @RBinaries(Array("&&", "||", "==>", "<=="))
  def binopSCEval = KonkritBooleanExtension.binopSCEval(cnd)

  @Unary("!")
  def notEval = KonkritBooleanExtension.notEval(cnd)
}