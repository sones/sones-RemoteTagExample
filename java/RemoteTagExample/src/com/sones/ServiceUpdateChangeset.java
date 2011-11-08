
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for ServiceUpdateChangeset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceUpdateChangeset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddedElementsToCollectionEdges" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3f8r2" minOccurs="0"/>
 *         &lt;element name="AddedElementsToCollectionProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemovedAttributes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="RemovedElementsFromCollectionEdges" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3f8r2" minOccurs="0"/>
 *         &lt;element name="RemovedElementsFromCollectionProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1" minOccurs="0"/>
 *         &lt;element name="UpdateOutgoingEdgesProperties" type="{http://www.sones.com}ArrayOfServiceSingleEdgeUpdateDefinition" minOccurs="0"/>
 *         &lt;element name="UpdatedOutgoingEdges" type="{http://www.sones.com}ArrayOfServiceEdgePredefinition" minOccurs="0"/>
 *         &lt;element name="UpdatedStructuredProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
 *         &lt;element name="UpdatedUnknownProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
 *         &lt;element name="UpdatedUnstructuredProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceUpdateChangeset", propOrder = {
    "addedElementsToCollectionEdges",
    "addedElementsToCollectionProperties",
    "comment",
    "edition",
    "removedAttributes",
    "removedElementsFromCollectionEdges",
    "removedElementsFromCollectionProperties",
    "updateOutgoingEdgesProperties",
    "updatedOutgoingEdges",
    "updatedStructuredProperties",
    "updatedUnknownProperties",
    "updatedUnstructuredProperties"
})
public class ServiceUpdateChangeset {

    @XmlElement(name = "AddedElementsToCollectionEdges", nillable = true)
    protected ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 addedElementsToCollectionEdges;
    @XmlElement(name = "AddedElementsToCollectionProperties", nillable = true)
    protected ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 addedElementsToCollectionProperties;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "Edition", nillable = true)
    protected String edition;
    @XmlElement(name = "RemovedAttributes", nillable = true)
    protected ArrayOfstring removedAttributes;
    @XmlElement(name = "RemovedElementsFromCollectionEdges", nillable = true)
    protected ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 removedElementsFromCollectionEdges;
    @XmlElement(name = "RemovedElementsFromCollectionProperties", nillable = true)
    protected ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 removedElementsFromCollectionProperties;
    @XmlElement(name = "UpdateOutgoingEdgesProperties", nillable = true)
    protected ArrayOfServiceSingleEdgeUpdateDefinition updateOutgoingEdgesProperties;
    @XmlElement(name = "UpdatedOutgoingEdges", nillable = true)
    protected ArrayOfServiceEdgePredefinition updatedOutgoingEdges;
    @XmlElement(name = "UpdatedStructuredProperties", nillable = true)
    protected ArrayOfKeyValueOfstringanyType updatedStructuredProperties;
    @XmlElement(name = "UpdatedUnknownProperties", nillable = true)
    protected ArrayOfKeyValueOfstringanyType updatedUnknownProperties;
    @XmlElement(name = "UpdatedUnstructuredProperties", nillable = true)
    protected ArrayOfKeyValueOfstringanyType updatedUnstructuredProperties;

    /**
     * Gets the value of the addedElementsToCollectionEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 }
     *     
     */
    public ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 getAddedElementsToCollectionEdges() {
        return addedElementsToCollectionEdges;
    }

    /**
     * Sets the value of the addedElementsToCollectionEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 }
     *     
     */
    public void setAddedElementsToCollectionEdges(ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 value) {
        this.addedElementsToCollectionEdges = value;
    }

    /**
     * Gets the value of the addedElementsToCollectionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 }
     *     
     */
    public ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 getAddedElementsToCollectionProperties() {
        return addedElementsToCollectionProperties;
    }

    /**
     * Sets the value of the addedElementsToCollectionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 }
     *     
     */
    public void setAddedElementsToCollectionProperties(ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 value) {
        this.addedElementsToCollectionProperties = value;
    }

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
     * Gets the value of the removedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getRemovedAttributes() {
        return removedAttributes;
    }

    /**
     * Sets the value of the removedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setRemovedAttributes(ArrayOfstring value) {
        this.removedAttributes = value;
    }

    /**
     * Gets the value of the removedElementsFromCollectionEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 }
     *     
     */
    public ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 getRemovedElementsFromCollectionEdges() {
        return removedElementsFromCollectionEdges;
    }

    /**
     * Sets the value of the removedElementsFromCollectionEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 }
     *     
     */
    public void setRemovedElementsFromCollectionEdges(ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 value) {
        this.removedElementsFromCollectionEdges = value;
    }

    /**
     * Gets the value of the removedElementsFromCollectionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 }
     *     
     */
    public ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 getRemovedElementsFromCollectionProperties() {
        return removedElementsFromCollectionProperties;
    }

    /**
     * Sets the value of the removedElementsFromCollectionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 }
     *     
     */
    public void setRemovedElementsFromCollectionProperties(ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 value) {
        this.removedElementsFromCollectionProperties = value;
    }

    /**
     * Gets the value of the updateOutgoingEdgesProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceSingleEdgeUpdateDefinition }
     *     
     */
    public ArrayOfServiceSingleEdgeUpdateDefinition getUpdateOutgoingEdgesProperties() {
        return updateOutgoingEdgesProperties;
    }

    /**
     * Sets the value of the updateOutgoingEdgesProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceSingleEdgeUpdateDefinition }
     *     
     */
    public void setUpdateOutgoingEdgesProperties(ArrayOfServiceSingleEdgeUpdateDefinition value) {
        this.updateOutgoingEdgesProperties = value;
    }

    /**
     * Gets the value of the updatedOutgoingEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceEdgePredefinition }
     *     
     */
    public ArrayOfServiceEdgePredefinition getUpdatedOutgoingEdges() {
        return updatedOutgoingEdges;
    }

    /**
     * Sets the value of the updatedOutgoingEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceEdgePredefinition }
     *     
     */
    public void setUpdatedOutgoingEdges(ArrayOfServiceEdgePredefinition value) {
        this.updatedOutgoingEdges = value;
    }

    /**
     * Gets the value of the updatedStructuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public ArrayOfKeyValueOfstringanyType getUpdatedStructuredProperties() {
        return updatedStructuredProperties;
    }

    /**
     * Sets the value of the updatedStructuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public void setUpdatedStructuredProperties(ArrayOfKeyValueOfstringanyType value) {
        this.updatedStructuredProperties = value;
    }

    /**
     * Gets the value of the updatedUnknownProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public ArrayOfKeyValueOfstringanyType getUpdatedUnknownProperties() {
        return updatedUnknownProperties;
    }

    /**
     * Sets the value of the updatedUnknownProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public void setUpdatedUnknownProperties(ArrayOfKeyValueOfstringanyType value) {
        this.updatedUnknownProperties = value;
    }

    /**
     * Gets the value of the updatedUnstructuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public ArrayOfKeyValueOfstringanyType getUpdatedUnstructuredProperties() {
        return updatedUnstructuredProperties;
    }

    /**
     * Sets the value of the updatedUnstructuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public void setUpdatedUnstructuredProperties(ArrayOfKeyValueOfstringanyType value) {
        this.updatedUnstructuredProperties = value;
    }

}
