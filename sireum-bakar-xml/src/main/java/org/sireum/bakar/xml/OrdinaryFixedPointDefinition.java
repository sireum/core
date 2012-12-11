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
 * <p>Java class for Ordinary_Fixed_Point_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ordinary_Fixed_Point_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="delta_expression_q" type="{}Expression_Class"/>
 *         &lt;element name="real_range_constraint_q" type="{}Range_Constraint_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ordinary_Fixed_Point_Definition", propOrder = {
    "sloc",
    "deltaExpressionQ",
    "realRangeConstraintQ"
})
public class OrdinaryFixedPointDefinition {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "delta_expression_q", required = true)
    protected ExpressionClass deltaExpressionQ;
    @XmlElement(name = "real_range_constraint_q", required = true)
    protected RangeConstraintClass realRangeConstraintQ;

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
     * Gets the value of the deltaExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getDeltaExpressionQ() {
        return deltaExpressionQ;
    }

    /**
     * Sets the value of the deltaExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setDeltaExpressionQ(ExpressionClass value) {
        this.deltaExpressionQ = value;
    }

    /**
     * Gets the value of the realRangeConstraintQ property.
     * 
     * @return
     *     possible object is
     *     {@link RangeConstraintClass }
     *     
     */
    public RangeConstraintClass getRealRangeConstraintQ() {
        return realRangeConstraintQ;
    }

    /**
     * Sets the value of the realRangeConstraintQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeConstraintClass }
     *     
     */
    public void setRealRangeConstraintQ(RangeConstraintClass value) {
        this.realRangeConstraintQ = value;
    }

}
