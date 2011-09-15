
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;


/**
 * <p>Java class for ServiceAlterVertexChangeset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAlterVertexChangeset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToBeAddedIncomingEdges" type="{http://www.sones.com}ArrayOfServiceIncomingEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeAddedIndices" type="{http://www.sones.com}ArrayOfServiceIndexPredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeAddedMandatories" type="{http://www.sones.com}ArrayOfServiceMandatoryPredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeAddedOutgoingEdges" type="{http://www.sones.com}ArrayOfServiceOutgoingEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeAddedProperties" type="{http://www.sones.com}ArrayOfServicePropertyPredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeAddedUniques" type="{http://www.sones.com}ArrayOfServiceUniquePredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeRemovedIncomingEdges" type="{http://www.sones.com}ArrayOfServiceIncomingEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeRemovedIndices" type="{http://www.sones.com}ArrayOfServiceIndexPredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeRemovedMandatories" type="{http://www.sones.com}ArrayOfServiceMandatoryPredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeRemovedOutgoingEdges" type="{http://www.sones.com}ArrayOfServiceOutgoingEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeRemovedProperties" type="{http://www.sones.com}ArrayOfServicePropertyPredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeRemovedUniques" type="{http://www.sones.com}ArrayOfServiceUniquePredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeRenamedProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAlterVertexChangeset", propOrder = {
    "comment",
    "newTypeName",
    "toBeAddedIncomingEdges",
    "toBeAddedIndices",
    "toBeAddedMandatories",
    "toBeAddedOutgoingEdges",
    "toBeAddedProperties",
    "toBeAddedUniques",
    "toBeRemovedIncomingEdges",
    "toBeRemovedIndices",
    "toBeRemovedMandatories",
    "toBeRemovedOutgoingEdges",
    "toBeRemovedProperties",
    "toBeRemovedUniques",
    "toBeRenamedProperties"
})
public class ServiceAlterVertexChangeset {

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "NewTypeName", nillable = true)
    protected String newTypeName;
    @XmlElement(name = "ToBeAddedIncomingEdges", nillable = true)
    protected ArrayOfServiceIncomingEdgePredefinition toBeAddedIncomingEdges;
    @XmlElement(name = "ToBeAddedIndices", nillable = true)
    protected ArrayOfServiceIndexPredefinition toBeAddedIndices;
    @XmlElement(name = "ToBeAddedMandatories", nillable = true)
    protected ArrayOfServiceMandatoryPredefinition toBeAddedMandatories;
    @XmlElement(name = "ToBeAddedOutgoingEdges", nillable = true)
    protected ArrayOfServiceOutgoingEdgePredefinition toBeAddedOutgoingEdges;
    @XmlElement(name = "ToBeAddedProperties", nillable = true)
    protected ArrayOfServicePropertyPredefinition toBeAddedProperties;
    @XmlElement(name = "ToBeAddedUniques", nillable = true)
    protected ArrayOfServiceUniquePredefinition toBeAddedUniques;
    @XmlElement(name = "ToBeRemovedIncomingEdges", nillable = true)
    protected ArrayOfServiceIncomingEdgePredefinition toBeRemovedIncomingEdges;
    @XmlElement(name = "ToBeRemovedIndices", nillable = true)
    protected ArrayOfServiceIndexPredefinition toBeRemovedIndices;
    @XmlElement(name = "ToBeRemovedMandatories", nillable = true)
    protected ArrayOfServiceMandatoryPredefinition toBeRemovedMandatories;
    @XmlElement(name = "ToBeRemovedOutgoingEdges", nillable = true)
    protected ArrayOfServiceOutgoingEdgePredefinition toBeRemovedOutgoingEdges;
    @XmlElement(name = "ToBeRemovedProperties", nillable = true)
    protected ArrayOfServicePropertyPredefinition toBeRemovedProperties;
    @XmlElement(name = "ToBeRemovedUniques", nillable = true)
    protected ArrayOfServiceUniquePredefinition toBeRemovedUniques;
    @XmlElement(name = "ToBeRenamedProperties", nillable = true)
    protected ArrayOfKeyValueOfstringstring toBeRenamedProperties;

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
     * Gets the value of the newTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTypeName() {
        return newTypeName;
    }

    /**
     * Sets the value of the newTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTypeName(String value) {
        this.newTypeName = value;
    }

    /**
     * Gets the value of the toBeAddedIncomingEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIncomingEdgePredefinition }
     *     
     */
    public ArrayOfServiceIncomingEdgePredefinition getToBeAddedIncomingEdges() {
        return toBeAddedIncomingEdges;
    }

    /**
     * Sets the value of the toBeAddedIncomingEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIncomingEdgePredefinition }
     *     
     */
    public void setToBeAddedIncomingEdges(ArrayOfServiceIncomingEdgePredefinition value) {
        this.toBeAddedIncomingEdges = value;
    }

    /**
     * Gets the value of the toBeAddedIndices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIndexPredefinition }
     *     
     */
    public ArrayOfServiceIndexPredefinition getToBeAddedIndices() {
        return toBeAddedIndices;
    }

    /**
     * Sets the value of the toBeAddedIndices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIndexPredefinition }
     *     
     */
    public void setToBeAddedIndices(ArrayOfServiceIndexPredefinition value) {
        this.toBeAddedIndices = value;
    }

    /**
     * Gets the value of the toBeAddedMandatories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceMandatoryPredefinition }
     *     
     */
    public ArrayOfServiceMandatoryPredefinition getToBeAddedMandatories() {
        return toBeAddedMandatories;
    }

    /**
     * Sets the value of the toBeAddedMandatories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceMandatoryPredefinition }
     *     
     */
    public void setToBeAddedMandatories(ArrayOfServiceMandatoryPredefinition value) {
        this.toBeAddedMandatories = value;
    }

    /**
     * Gets the value of the toBeAddedOutgoingEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOutgoingEdgePredefinition }
     *     
     */
    public ArrayOfServiceOutgoingEdgePredefinition getToBeAddedOutgoingEdges() {
        return toBeAddedOutgoingEdges;
    }

    /**
     * Sets the value of the toBeAddedOutgoingEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOutgoingEdgePredefinition }
     *     
     */
    public void setToBeAddedOutgoingEdges(ArrayOfServiceOutgoingEdgePredefinition value) {
        this.toBeAddedOutgoingEdges = value;
    }

    /**
     * Gets the value of the toBeAddedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServicePropertyPredefinition }
     *     
     */
    public ArrayOfServicePropertyPredefinition getToBeAddedProperties() {
        return toBeAddedProperties;
    }

    /**
     * Sets the value of the toBeAddedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServicePropertyPredefinition }
     *     
     */
    public void setToBeAddedProperties(ArrayOfServicePropertyPredefinition value) {
        this.toBeAddedProperties = value;
    }

    /**
     * Gets the value of the toBeAddedUniques property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceUniquePredefinition }
     *     
     */
    public ArrayOfServiceUniquePredefinition getToBeAddedUniques() {
        return toBeAddedUniques;
    }

    /**
     * Sets the value of the toBeAddedUniques property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceUniquePredefinition }
     *     
     */
    public void setToBeAddedUniques(ArrayOfServiceUniquePredefinition value) {
        this.toBeAddedUniques = value;
    }

    /**
     * Gets the value of the toBeRemovedIncomingEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIncomingEdgePredefinition }
     *     
     */
    public ArrayOfServiceIncomingEdgePredefinition getToBeRemovedIncomingEdges() {
        return toBeRemovedIncomingEdges;
    }

    /**
     * Sets the value of the toBeRemovedIncomingEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIncomingEdgePredefinition }
     *     
     */
    public void setToBeRemovedIncomingEdges(ArrayOfServiceIncomingEdgePredefinition value) {
        this.toBeRemovedIncomingEdges = value;
    }

    /**
     * Gets the value of the toBeRemovedIndices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIndexPredefinition }
     *     
     */
    public ArrayOfServiceIndexPredefinition getToBeRemovedIndices() {
        return toBeRemovedIndices;
    }

    /**
     * Sets the value of the toBeRemovedIndices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIndexPredefinition }
     *     
     */
    public void setToBeRemovedIndices(ArrayOfServiceIndexPredefinition value) {
        this.toBeRemovedIndices = value;
    }

    /**
     * Gets the value of the toBeRemovedMandatories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceMandatoryPredefinition }
     *     
     */
    public ArrayOfServiceMandatoryPredefinition getToBeRemovedMandatories() {
        return toBeRemovedMandatories;
    }

    /**
     * Sets the value of the toBeRemovedMandatories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceMandatoryPredefinition }
     *     
     */
    public void setToBeRemovedMandatories(ArrayOfServiceMandatoryPredefinition value) {
        this.toBeRemovedMandatories = value;
    }

    /**
     * Gets the value of the toBeRemovedOutgoingEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOutgoingEdgePredefinition }
     *     
     */
    public ArrayOfServiceOutgoingEdgePredefinition getToBeRemovedOutgoingEdges() {
        return toBeRemovedOutgoingEdges;
    }

    /**
     * Sets the value of the toBeRemovedOutgoingEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOutgoingEdgePredefinition }
     *     
     */
    public void setToBeRemovedOutgoingEdges(ArrayOfServiceOutgoingEdgePredefinition value) {
        this.toBeRemovedOutgoingEdges = value;
    }

    /**
     * Gets the value of the toBeRemovedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServicePropertyPredefinition }
     *     
     */
    public ArrayOfServicePropertyPredefinition getToBeRemovedProperties() {
        return toBeRemovedProperties;
    }

    /**
     * Sets the value of the toBeRemovedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServicePropertyPredefinition }
     *     
     */
    public void setToBeRemovedProperties(ArrayOfServicePropertyPredefinition value) {
        this.toBeRemovedProperties = value;
    }

    /**
     * Gets the value of the toBeRemovedUniques property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceUniquePredefinition }
     *     
     */
    public ArrayOfServiceUniquePredefinition getToBeRemovedUniques() {
        return toBeRemovedUniques;
    }

    /**
     * Sets the value of the toBeRemovedUniques property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceUniquePredefinition }
     *     
     */
    public void setToBeRemovedUniques(ArrayOfServiceUniquePredefinition value) {
        this.toBeRemovedUniques = value;
    }

    /**
     * Gets the value of the toBeRenamedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringstring }
     *     
     */
    public ArrayOfKeyValueOfstringstring getToBeRenamedProperties() {
        return toBeRenamedProperties;
    }

    /**
     * Sets the value of the toBeRenamedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringstring }
     *     
     */
    public void setToBeRenamedProperties(ArrayOfKeyValueOfstringstring value) {
        this.toBeRenamedProperties = value;
    }

}
