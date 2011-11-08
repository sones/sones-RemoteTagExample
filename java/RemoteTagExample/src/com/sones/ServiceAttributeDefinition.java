
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAttributeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAttributeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsUserDefined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Kind" type="{http://www.sones.com}ServiceAttributeType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedType" type="{http://www.sones.com}ServiceBaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAttributeDefinition", propOrder = {
    "id",
    "isUserDefined",
    "kind",
    "name",
    "relatedType"
})
@XmlSeeAlso({
    ServicePropertyDefinition.class,
    ServiceBinaryPropertyDefinition.class,
    ServiceOutgoingEdgeDefinition.class,
    ServiceIncomingEdgeDefinition.class
})
public class ServiceAttributeDefinition {

    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "IsUserDefined")
    protected Boolean isUserDefined;
    @XmlElement(name = "Kind")
    protected ServiceAttributeType kind;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "RelatedType", nillable = true)
    protected ServiceBaseType relatedType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isUserDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserDefined() {
        return isUserDefined;
    }

    /**
     * Sets the value of the isUserDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserDefined(Boolean value) {
        this.isUserDefined = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAttributeType }
     *     
     */
    public ServiceAttributeType getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAttributeType }
     *     
     */
    public void setKind(ServiceAttributeType value) {
        this.kind = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relatedType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBaseType }
     *     
     */
    public ServiceBaseType getRelatedType() {
        return relatedType;
    }

    /**
     * Sets the value of the relatedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBaseType }
     *     
     */
    public void setRelatedType(ServiceBaseType value) {
        this.relatedType = value;
    }

}
