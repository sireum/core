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
 * <p>Java class for Function_Declaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function_Declaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="is_overriding_declaration_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="overriding" type="{}Overriding"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="is_not_overriding_declaration_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="not_overriding" type="{}Not_Overriding"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="parameter_profile_ql" type="{}Parameter_Specification_List"/>
 *         &lt;element name="is_not_null_return_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="not_null_return" type="{}Not_Null_Return"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="result_profile_q" type="{}Element_Class"/>
 *         &lt;element name="has_abstract_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="abstract" type="{}Abstract"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="aspect_specifications_ql" type="{}Element_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Function_Declaration", propOrder = {
    "sloc",
    "isOverridingDeclarationQ",
    "isNotOverridingDeclarationQ",
    "namesQl",
    "parameterProfileQl",
    "isNotNullReturnQ",
    "resultProfileQ",
    "hasAbstractQ",
    "aspectSpecificationsQl"
})
public class FunctionDeclaration {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "is_overriding_declaration_q", required = true)
    protected FunctionDeclaration.IsOverridingDeclarationQ isOverridingDeclarationQ;
    @XmlElement(name = "is_not_overriding_declaration_q", required = true)
    protected FunctionDeclaration.IsNotOverridingDeclarationQ isNotOverridingDeclarationQ;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "parameter_profile_ql", required = true)
    protected ParameterSpecificationList parameterProfileQl;
    @XmlElement(name = "is_not_null_return_q", required = true)
    protected FunctionDeclaration.IsNotNullReturnQ isNotNullReturnQ;
    @XmlElement(name = "result_profile_q", required = true)
    protected ElementClass resultProfileQ;
    @XmlElement(name = "has_abstract_q", required = true)
    protected FunctionDeclaration.HasAbstractQ hasAbstractQ;
    @XmlElement(name = "aspect_specifications_ql", required = true)
    protected ElementList aspectSpecificationsQl;

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
     * Gets the value of the isOverridingDeclarationQ property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionDeclaration.IsOverridingDeclarationQ }
     *     
     */
    public FunctionDeclaration.IsOverridingDeclarationQ getIsOverridingDeclarationQ() {
        return isOverridingDeclarationQ;
    }

    /**
     * Sets the value of the isOverridingDeclarationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionDeclaration.IsOverridingDeclarationQ }
     *     
     */
    public void setIsOverridingDeclarationQ(FunctionDeclaration.IsOverridingDeclarationQ value) {
        this.isOverridingDeclarationQ = value;
    }

    /**
     * Gets the value of the isNotOverridingDeclarationQ property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionDeclaration.IsNotOverridingDeclarationQ }
     *     
     */
    public FunctionDeclaration.IsNotOverridingDeclarationQ getIsNotOverridingDeclarationQ() {
        return isNotOverridingDeclarationQ;
    }

    /**
     * Sets the value of the isNotOverridingDeclarationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionDeclaration.IsNotOverridingDeclarationQ }
     *     
     */
    public void setIsNotOverridingDeclarationQ(FunctionDeclaration.IsNotOverridingDeclarationQ value) {
        this.isNotOverridingDeclarationQ = value;
    }

    /**
     * Gets the value of the namesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getNamesQl() {
        return namesQl;
    }

    /**
     * Sets the value of the namesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setNamesQl(DefiningNameList value) {
        this.namesQl = value;
    }

    /**
     * Gets the value of the parameterProfileQl property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterSpecificationList }
     *     
     */
    public ParameterSpecificationList getParameterProfileQl() {
        return parameterProfileQl;
    }

    /**
     * Sets the value of the parameterProfileQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterSpecificationList }
     *     
     */
    public void setParameterProfileQl(ParameterSpecificationList value) {
        this.parameterProfileQl = value;
    }

    /**
     * Gets the value of the isNotNullReturnQ property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionDeclaration.IsNotNullReturnQ }
     *     
     */
    public FunctionDeclaration.IsNotNullReturnQ getIsNotNullReturnQ() {
        return isNotNullReturnQ;
    }

    /**
     * Sets the value of the isNotNullReturnQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionDeclaration.IsNotNullReturnQ }
     *     
     */
    public void setIsNotNullReturnQ(FunctionDeclaration.IsNotNullReturnQ value) {
        this.isNotNullReturnQ = value;
    }

    /**
     * Gets the value of the resultProfileQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getResultProfileQ() {
        return resultProfileQ;
    }

    /**
     * Sets the value of the resultProfileQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setResultProfileQ(ElementClass value) {
        this.resultProfileQ = value;
    }

    /**
     * Gets the value of the hasAbstractQ property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionDeclaration.HasAbstractQ }
     *     
     */
    public FunctionDeclaration.HasAbstractQ getHasAbstractQ() {
        return hasAbstractQ;
    }

    /**
     * Sets the value of the hasAbstractQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionDeclaration.HasAbstractQ }
     *     
     */
    public void setHasAbstractQ(FunctionDeclaration.HasAbstractQ value) {
        this.hasAbstractQ = value;
    }

    /**
     * Gets the value of the aspectSpecificationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getAspectSpecificationsQl() {
        return aspectSpecificationsQl;
    }

    /**
     * Sets the value of the aspectSpecificationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setAspectSpecificationsQl(ElementList value) {
        this.aspectSpecificationsQl = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="abstract" type="{}Abstract"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "_abstract",
        "notAnElement"
    })
    public static class HasAbstractQ {

        @XmlElement(name = "abstract")
        protected Abstract _abstract;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the abstract property.
         * 
         * @return
         *     possible object is
         *     {@link Abstract }
         *     
         */
        public Abstract getAbstract() {
            return _abstract;
        }

        /**
         * Sets the value of the abstract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Abstract }
         *     
         */
        public void setAbstract(Abstract value) {
            this._abstract = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="not_null_return" type="{}Not_Null_Return"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notNullReturn",
        "notAnElement"
    })
    public static class IsNotNullReturnQ {

        @XmlElement(name = "not_null_return")
        protected NotNullReturn notNullReturn;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the notNullReturn property.
         * 
         * @return
         *     possible object is
         *     {@link NotNullReturn }
         *     
         */
        public NotNullReturn getNotNullReturn() {
            return notNullReturn;
        }

        /**
         * Sets the value of the notNullReturn property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotNullReturn }
         *     
         */
        public void setNotNullReturn(NotNullReturn value) {
            this.notNullReturn = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="not_overriding" type="{}Not_Overriding"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notOverriding",
        "notAnElement"
    })
    public static class IsNotOverridingDeclarationQ {

        @XmlElement(name = "not_overriding")
        protected NotOverriding notOverriding;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the notOverriding property.
         * 
         * @return
         *     possible object is
         *     {@link NotOverriding }
         *     
         */
        public NotOverriding getNotOverriding() {
            return notOverriding;
        }

        /**
         * Sets the value of the notOverriding property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotOverriding }
         *     
         */
        public void setNotOverriding(NotOverriding value) {
            this.notOverriding = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="overriding" type="{}Overriding"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "overriding",
        "notAnElement"
    })
    public static class IsOverridingDeclarationQ {

        protected Overriding overriding;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the overriding property.
         * 
         * @return
         *     possible object is
         *     {@link Overriding }
         *     
         */
        public Overriding getOverriding() {
            return overriding;
        }

        /**
         * Sets the value of the overriding property.
         * 
         * @param value
         *     allowed object is
         *     {@link Overriding }
         *     
         */
        public void setOverriding(Overriding value) {
            this.overriding = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }

}
