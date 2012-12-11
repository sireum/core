//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for While_Loop_Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="While_Loop_Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="label_names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="statement_identifier_q" type="{}Defining_Name_Class"/>
 *         &lt;element name="while_condition_q" type="{}Expression_Class"/>
 *         &lt;element name="loop_statements_ql" type="{}Statement_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "While_Loop_Statement", propOrder = {
    "sloc",
    "labelNamesQl",
    "statementIdentifierQ",
    "whileConditionQ",
    "loopStatementsQl"
})
public class WhileLoopStatement {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "label_names_ql", required = true)
    protected DefiningNameList labelNamesQl;
    @XmlElement(name = "statement_identifier_q", required = true)
    protected DefiningNameClass statementIdentifierQ;
    @XmlElement(name = "while_condition_q", required = true)
    protected ExpressionClass whileConditionQ;
    @XmlElement(name = "loop_statements_ql", required = true)
    protected StatementList loopStatementsQl;

    /**
     * Gets the value of the sloc property.
     * 
     * @return
     *     possible object is
     *     {@link SourceLocation }
     *     
     */
    public SourceLocation getSloc() {
        return sloc;
    }

    /**
     * Sets the value of the sloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceLocation }
     *     
     */
    public void setSloc(SourceLocation value) {
        this.sloc = value;
    }

    /**
     * Gets the value of the labelNamesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getLabelNamesQl() {
        return labelNamesQl;
    }

    /**
     * Sets the value of the labelNamesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setLabelNamesQl(DefiningNameList value) {
        this.labelNamesQl = value;
    }

    /**
     * Gets the value of the statementIdentifierQ property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameClass }
     *     
     */
    public DefiningNameClass getStatementIdentifierQ() {
        return statementIdentifierQ;
    }

    /**
     * Sets the value of the statementIdentifierQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameClass }
     *     
     */
    public void setStatementIdentifierQ(DefiningNameClass value) {
        this.statementIdentifierQ = value;
    }

    /**
     * Gets the value of the whileConditionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getWhileConditionQ() {
        return whileConditionQ;
    }

    /**
     * Sets the value of the whileConditionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setWhileConditionQ(ExpressionClass value) {
        this.whileConditionQ = value;
    }

    /**
     * Gets the value of the loopStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getLoopStatementsQl() {
        return loopStatementsQl;
    }

    /**
     * Sets the value of the loopStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setLoopStatementsQl(StatementList value) {
        this.loopStatementsQl = value;
    }

}
