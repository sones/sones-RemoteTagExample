
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceVertexTypePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceVertexTypePredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncomingEdges" type="{http://www.sones.com}ArrayOfServiceIncomingEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="Indices" type="{http://www.sones.com}ArrayOfServiceIndexPredefinition" minOccurs="0"/>
 *         &lt;element name="IsAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSealed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OutgoingEdges" type="{http://www.sones.com}ArrayOfServiceOutgoingEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://www.sones.com}ArrayOfServicePropertyPredefinition" minOccurs="0"/>
 *         &lt;element name="SuperVertexTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Uniques" type="{http://www.sones.com}ArrayOfServiceUniquePredefinition" minOccurs="0"/>
 *         &lt;element name="VertexTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceVertexTypePredefinition", propOrder = {
    "comment",
    "incomingEdges",
    "indices",
    "isAbstract",
    "isSealed",
    "outgoingEdges",
    "properties",
    "superVertexTypeName",
    "uniques",
    "vertexTypeName"
})
public class ServiceVertexTypePredefinition {

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "IncomingEdges", nillable = true)
    protected ArrayOfServiceIncomingEdgePredefinition incomingEdges;
    @XmlElement(name = "Indices", nillable = true)
    protected ArrayOfServiceIndexPredefinition indices;
    @XmlElement(name = "IsAbstract")
    protected Boolean isAbstract;
    @XmlElement(name = "IsSealed")
    protected Boolean isSealed;
    @XmlElement(name = "OutgoingEdges", nillable = true)
    protected ArrayOfServiceOutgoingEdgePredefinition outgoingEdges;
    @XmlElement(name = "Properties", nillable = true)
    protected ArrayOfServicePropertyPredefinition properties;
    @XmlElement(name = "SuperVertexTypeName", nillable = true)
    protected String superVertexTypeName;
    @XmlElement(name = "Uniques", nillable = true)
    protected ArrayOfServiceUniquePredefinition uniques;
    @XmlElement(name = "VertexTypeName", required = true, nillable = true)
    protected String vertexTypeName;

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
     * Gets the value of the incomingEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIncomingEdgePredefinition }
     *     
     */
    public ArrayOfServiceIncomingEdgePredefinition getIncomingEdges() {
        return incomingEdges;
    }

    /**
     * Sets the value of the incomingEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIncomingEdgePredefinition }
     *     
     */
    public void setIncomingEdges(ArrayOfServiceIncomingEdgePredefinition value) {
        this.incomingEdges = value;
    }

    /**
     * Gets the value of the indices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIndexPredefinition }
     *     
     */
    public ArrayOfServiceIndexPredefinition getIndices() {
        return indices;
    }

    /**
     * Sets the value of the indices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIndexPredefinition }
     *     
     */
    public void setIndices(ArrayOfServiceIndexPredefinition value) {
        this.indices = value;
    }

    /**
     * Gets the value of the isAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * Sets the value of the isAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAbstract(Boolean value) {
        this.isAbstract = value;
    }

    /**
     * Gets the value of the isSealed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSealed() {
        return isSealed;
    }

    /**
     * Sets the value of the isSealed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSealed(Boolean value) {
        this.isSealed = value;
    }

    /**
     * Gets the value of the outgoingEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOutgoingEdgePredefinition }
     *     
     */
    public ArrayOfServiceOutgoingEdgePredefinition getOutgoingEdges() {
        return outgoingEdges;
    }

    /**
     * Sets the value of the outgoingEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOutgoingEdgePredefinition }
     *     
     */
    public void setOutgoingEdges(ArrayOfServiceOutgoingEdgePredefinition value) {
        this.outgoingEdges = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServicePropertyPredefinition }
     *     
     */
    public ArrayOfServicePropertyPredefinition getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServicePropertyPredefinition }
     *     
     */
    public void setProperties(ArrayOfServicePropertyPredefinition value) {
        this.properties = value;
    }

    /**
     * Gets the value of the superVertexTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperVertexTypeName() {
        return superVertexTypeName;
    }

    /**
     * Sets the value of the superVertexTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperVertexTypeName(String value) {
        this.superVertexTypeName = value;
    }

    /**
     * Gets the value of the uniques property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceUniquePredefinition }
     *     
     */
    public ArrayOfServiceUniquePredefinition getUniques() {
        return uniques;
    }

    /**
     * Sets the value of the uniques property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceUniquePredefinition }
     *     
     */
    public void setUniques(ArrayOfServiceUniquePredefinition value) {
        this.uniques = value;
    }

    /**
     * Gets the value of the vertexTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertexTypeName() {
        return vertexTypeName;
    }

    /**
     * Sets the value of the vertexTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertexTypeName(String value) {
        this.vertexTypeName = value;
    }

}
