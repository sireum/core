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
 * <p>Java class for Exit_Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exit_Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="label_names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="exit_loop_name_q" type="{}Expression_Class"/>
 *         &lt;element name="exit_condition_q" type="{}Expression_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exit_Statement", propOrder = {
    "sloc",
    "labelNamesQl",
    "exitLoopNameQ",
    "exitConditionQ"
})
public class ExitStatement {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "label_names_ql", required = true)
    protected DefiningNameList labelNamesQl;
    @XmlElement(name = "exit_loop_name_q", required = true)
    protected ExpressionClass exitLoopNameQ;
    @XmlElement(name = "exit_condition_q", required = true)
    protected ExpressionClass exitConditionQ;

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
     * Gets the value of the exitLoopNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getExitLoopNameQ() {
        return exitLoopNameQ;
    }

    /**
     * Sets the value of the exitLoopNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setExitLoopNameQ(ExpressionClass value) {
        this.exitLoopNameQ = value;
    }

    /**
     * Gets the value of the exitConditionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getExitConditionQ() {
        return exitConditionQ;
    }

    /**
     * Sets the value of the exitConditionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setExitConditionQ(ExpressionClass value) {
        this.exitConditionQ = value;
    }

}
