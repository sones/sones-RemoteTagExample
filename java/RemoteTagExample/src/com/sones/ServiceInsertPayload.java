
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInsertPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInsertPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edges" type="{http://www.sones.com}ArrayOfServiceEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StructuredProperties" type="{http://www.sones.com}ArrayOfStructuredProperty" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UnstructuredProperties" type="{http://www.sones.com}ArrayOfUnstructuredProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInsertPayload", propOrder = {
    "comment",
    "edges",
    "edition",
    "structuredProperties",
    "uuid",
    "unstructuredProperties"
})
public class ServiceInsertPayload {

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "Edges", nillable = true)
    protected ArrayOfServiceEdgePredefinition edges;
    @XmlElement(name = "Edition", nillable = true)
    protected String edition;
    @XmlElement(name = "StructuredProperties", nillable = true)
    protected ArrayOfStructuredProperty structuredProperties;
    @XmlElement(name = "UUID", nillable = true)
    protected Long uuid;
    @XmlElement(name = "UnstructuredProperties", nillable = true)
    protected ArrayOfUnstructuredProperty unstructuredProperties;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the edges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceEdgePredefinition }
     *     
     */
    public ArrayOfServiceEdgePredefinition getEdges() {
        return edges;
    }

    /**
     * Sets the value of the edges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceEdgePredefinition }
     *     
     */
    public void setEdges(ArrayOfServiceEdgePredefinition value) {
        this.edges = value;
    }

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
     * Gets the value of the structuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStructuredProperty }
     *     
     */
    public ArrayOfStructuredProperty getStructuredProperties() {
        return structuredProperties;
    }

    /**
     * Sets the value of the structuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStructuredProperty }
     *     
     */
    public void setStructuredProperties(ArrayOfStructuredProperty value) {
        this.structuredProperties = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUUID(Long value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the unstructuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnstructuredProperty }
     *     
     */
    public ArrayOfUnstructuredProperty getUnstructuredProperties() {
        return unstructuredProperties;
    }

    /**
     * Sets the value of the unstructuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnstructuredProperty }
     *     
     */
    public void setUnstructuredProperties(ArrayOfUnstructuredProperty value) {
        this.unstructuredProperties = value;
    }

}
