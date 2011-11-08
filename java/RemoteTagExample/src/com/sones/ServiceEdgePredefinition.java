
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflongArrayOflongty7Ep6D1;


/**
 * <p>Java class for ServiceEdgePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEdgePredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContainedEdges" type="{http://www.sones.com}ArrayOfServiceEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="EdgeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StructuredProperties" type="{http://www.sones.com}ArrayOfStructuredProperty" minOccurs="0"/>
 *         &lt;element name="UnstructuredProperties" type="{http://www.sones.com}ArrayOfUnstructuredProperty" minOccurs="0"/>
 *         &lt;element name="VertexIDsByID" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOflongArrayOflongty7Ep6D1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEdgePredefinition", propOrder = {
    "comment",
    "containedEdges",
    "edgeName",
    "structuredProperties",
    "unstructuredProperties",
    "vertexIDsByID"
})
public class ServiceEdgePredefinition {

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "ContainedEdges", nillable = true)
    protected ArrayOfServiceEdgePredefinition containedEdges;
    @XmlElement(name = "EdgeName", nillable = true)
    protected String edgeName;
    @XmlElement(name = "StructuredProperties", nillable = true)
    protected ArrayOfStructuredProperty structuredProperties;
    @XmlElement(name = "UnstructuredProperties", nillable = true)
    protected ArrayOfUnstructuredProperty unstructuredProperties;
    @XmlElement(name = "VertexIDsByID", nillable = true)
    protected ArrayOfTupleOflongArrayOflongty7Ep6D1 vertexIDsByID;

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
     * Gets the value of the containedEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceEdgePredefinition }
     *     
     */
    public ArrayOfServiceEdgePredefinition getContainedEdges() {
        return containedEdges;
    }

    /**
     * Sets the value of the containedEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceEdgePredefinition }
     *     
     */
    public void setContainedEdges(ArrayOfServiceEdgePredefinition value) {
        this.containedEdges = value;
    }

    /**
     * Gets the value of the edgeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeName() {
        return edgeName;
    }

    /**
     * Sets the value of the edgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeName(String value) {
        this.edgeName = value;
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

    /**
     * Gets the value of the vertexIDsByID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOflongArrayOflongty7Ep6D1 }
     *     
     */
    public ArrayOfTupleOflongArrayOflongty7Ep6D1 getVertexIDsByID() {
        return vertexIDsByID;
    }

    /**
     * Sets the value of the vertexIDsByID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOflongArrayOflongty7Ep6D1 }
     *     
     */
    public void setVertexIDsByID(ArrayOfTupleOflongArrayOflongty7Ep6D1 value) {
        this.vertexIDsByID = value;
    }

}
