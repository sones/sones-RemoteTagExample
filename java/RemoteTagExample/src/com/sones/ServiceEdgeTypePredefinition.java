
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceEdgeTypePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEdgeTypePredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EdgeTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IncomingEdges" type="{http://www.sones.com}ArrayOfServiceIncomingEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="IsAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSealed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OutgoingEdges" type="{http://www.sones.com}ArrayOfServiceOutgoingEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://www.sones.com}ArrayOfServicePropertyPredefinition" minOccurs="0"/>
 *         &lt;element name="SuperVertexTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEdgeTypePredefinition", propOrder = {
    "comment",
    "edgeTypeName",
    "incomingEdges",
    "isAbstract",
    "isSealed",
    "outgoingEdges",
    "properties",
    "superVertexTypeName"
})
public class ServiceEdgeTypePredefinition {

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "EdgeTypeName", required = true, nillable = true)
    protected String edgeTypeName;
    @XmlElement(name = "IncomingEdges", nillable = true)
    protected ArrayOfServiceIncomingEdgePredefinition incomingEdges;
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
     * Gets the value of the edgeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeTypeName() {
        return edgeTypeName;
    }

    /**
     * Sets the value of the edgeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeTypeName(String value) {
        this.edgeTypeName = value;
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

}
