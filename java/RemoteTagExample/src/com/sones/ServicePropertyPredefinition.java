
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicePropertyPredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePropertyPredefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceAttributePredefinition">
 *       &lt;sequence>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsIndexed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUnique" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Multiplicity" type="{http://www.sones.com}ServicePropertyMultiplicity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePropertyPredefinition", propOrder = {
    "defaultValue",
    "isIndexed",
    "isMandatory",
    "isUnique",
    "multiplicity"
})
public class ServicePropertyPredefinition
    extends ServiceAttributePredefinition
{

    @XmlElement(name = "DefaultValue", nillable = true)
    protected String defaultValue;
    @XmlElement(name = "IsIndexed")
    protected Boolean isIndexed;
    @XmlElement(name = "IsMandatory")
    protected Boolean isMandatory;
    @XmlElement(name = "IsUnique")
    protected Boolean isUnique;
    @XmlElement(name = "Multiplicity")
    protected ServicePropertyMultiplicity multiplicity;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the isIndexed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIndexed() {
        return isIndexed;
    }

    /**
     * Sets the value of the isIndexed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIndexed(Boolean value) {
        this.isIndexed = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the isUnique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnique() {
        return isUnique;
    }

    /**
     * Sets the value of the isUnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnique(Boolean value) {
        this.isUnique = value;
    }

    /**
     * Gets the value of the multiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePropertyMultiplicity }
     *     
     */
    public ServicePropertyMultiplicity getMultiplicity() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePropertyMultiplicity }
     *     
     */
    public void setMultiplicity(ServicePropertyMultiplicity value) {
        this.multiplicity = value;
    }

}
