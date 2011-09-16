
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicePropertyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePropertyDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceAttributeDefinition">
 *       &lt;sequence>
 *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIndices" type="{http://www.sones.com}ArrayOfServiceIndexDefinition" minOccurs="0"/>
 *         &lt;element name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUserDefinedType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ServicePropertyDefinition", propOrder = {
    "baseType",
    "inIndices",
    "isMandatory",
    "isUserDefinedType",
    "multiplicity"
})
public class ServicePropertyDefinition
    extends ServiceAttributeDefinition
{

    @XmlElement(name = "BaseType", nillable = true)
    protected String baseType;
    @XmlElement(name = "InIndices", nillable = true)
    protected ArrayOfServiceIndexDefinition inIndices;
    @XmlElement(name = "IsMandatory")
    protected Boolean isMandatory;
    @XmlElement(name = "IsUserDefinedType")
    protected Boolean isUserDefinedType;
    @XmlElement(name = "Multiplicity")
    protected ServicePropertyMultiplicity multiplicity;

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the inIndices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIndexDefinition }
     *     
     */
    public ArrayOfServiceIndexDefinition getInIndices() {
        return inIndices;
    }

    /**
     * Sets the value of the inIndices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIndexDefinition }
     *     
     */
    public void setInIndices(ArrayOfServiceIndexDefinition value) {
        this.inIndices = value;
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
     * Gets the value of the isUserDefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserDefinedType() {
        return isUserDefinedType;
    }

    /**
     * Sets the value of the isUserDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserDefinedType(Boolean value) {
        this.isUserDefinedType = value;
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
