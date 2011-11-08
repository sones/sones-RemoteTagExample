
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for ServiceIndexDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceIndexDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IndexTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndexedProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="IsRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUserdefined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsVersioned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceIndex" type="{http://www.sones.com}ServiceIndexDefinition" minOccurs="0"/>
 *         &lt;element name="VertexType" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIndexDefinition", propOrder = {
    "edition",
    "id",
    "indexTypeName",
    "indexedProperties",
    "isRange",
    "isUserdefined",
    "isVersioned",
    "name",
    "sourceIndex",
    "vertexType"
})
public class ServiceIndexDefinition {

    @XmlElement(name = "Edition", nillable = true)
    protected String edition;
    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "IndexTypeName", nillable = true)
    protected String indexTypeName;
    @XmlElement(name = "IndexedProperties", nillable = true)
    protected ArrayOfstring indexedProperties;
    @XmlElement(name = "IsRange")
    protected Boolean isRange;
    @XmlElement(name = "IsUserdefined")
    protected Boolean isUserdefined;
    @XmlElement(name = "IsVersioned")
    protected Boolean isVersioned;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "SourceIndex", nillable = true)
    protected ServiceIndexDefinition sourceIndex;
    @XmlElement(name = "VertexType", nillable = true)
    protected ServiceVertexType vertexType;

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

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
     * Gets the value of the indexTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexTypeName() {
        return indexTypeName;
    }

    /**
     * Sets the value of the indexTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexTypeName(String value) {
        this.indexTypeName = value;
    }

    /**
     * Gets the value of the indexedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getIndexedProperties() {
        return indexedProperties;
    }

    /**
     * Sets the value of the indexedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setIndexedProperties(ArrayOfstring value) {
        this.indexedProperties = value;
    }

    /**
     * Gets the value of the isRange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRange() {
        return isRange;
    }

    /**
     * Sets the value of the isRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRange(Boolean value) {
        this.isRange = value;
    }

    /**
     * Gets the value of the isUserdefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserdefined() {
        return isUserdefined;
    }

    /**
     * Sets the value of the isUserdefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserdefined(Boolean value) {
        this.isUserdefined = value;
    }

    /**
     * Gets the value of the isVersioned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVersioned() {
        return isVersioned;
    }

    /**
     * Sets the value of the isVersioned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVersioned(Boolean value) {
        this.isVersioned = value;
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
     * Gets the value of the sourceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIndexDefinition }
     *     
     */
    public ServiceIndexDefinition getSourceIndex() {
        return sourceIndex;
    }

    /**
     * Sets the value of the sourceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIndexDefinition }
     *     
     */
    public void setSourceIndex(ServiceIndexDefinition value) {
        this.sourceIndex = value;
    }

    /**
     * Gets the value of the vertexType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getVertexType() {
        return vertexType;
    }

    /**
     * Sets the value of the vertexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setVertexType(ServiceVertexType value) {
        this.vertexType = value;
    }

}
