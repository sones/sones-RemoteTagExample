
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceUniqueDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceUniqueDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrespondingIndex" type="{http://www.sones.com}ServiceIndexDefinition" minOccurs="0"/>
 *         &lt;element name="DefiningVertexType" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
 *         &lt;element name="UniquePropertyDefinition" type="{http://www.sones.com}ArrayOfServicePropertyDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceUniqueDefinition", propOrder = {
    "correspondingIndex",
    "definingVertexType",
    "uniquePropertyDefinition"
})
public class ServiceUniqueDefinition {

    @XmlElement(name = "CorrespondingIndex", nillable = true)
    protected ServiceIndexDefinition correspondingIndex;
    @XmlElement(name = "DefiningVertexType", nillable = true)
    protected ServiceVertexType definingVertexType;
    @XmlElement(name = "UniquePropertyDefinition", nillable = true)
    protected ArrayOfServicePropertyDefinition uniquePropertyDefinition;

    /**
     * Gets the value of the correspondingIndex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIndexDefinition }
     *     
     */
    public ServiceIndexDefinition getCorrespondingIndex() {
        return correspondingIndex;
    }

    /**
     * Sets the value of the correspondingIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIndexDefinition }
     *     
     */
    public void setCorrespondingIndex(ServiceIndexDefinition value) {
        this.correspondingIndex = value;
    }

    /**
     * Gets the value of the definingVertexType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getDefiningVertexType() {
        return definingVertexType;
    }

    /**
     * Sets the value of the definingVertexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setDefiningVertexType(ServiceVertexType value) {
        this.definingVertexType = value;
    }

    /**
     * Gets the value of the uniquePropertyDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServicePropertyDefinition }
     *     
     */
    public ArrayOfServicePropertyDefinition getUniquePropertyDefinition() {
        return uniquePropertyDefinition;
    }

    /**
     * Sets the value of the uniquePropertyDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServicePropertyDefinition }
     *     
     */
    public void setUniquePropertyDefinition(ArrayOfServicePropertyDefinition value) {
        this.uniquePropertyDefinition = value;
    }

}
