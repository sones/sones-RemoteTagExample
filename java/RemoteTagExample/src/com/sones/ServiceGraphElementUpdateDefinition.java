
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflonganyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for ServiceGraphElementUpdateDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceGraphElementUpdateDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeletedStructuredProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="DeletedUnstructuredProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="UpdatedStructuredProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflonganyType" minOccurs="0"/>
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
@XmlType(name = "ServiceGraphElementUpdateDefinition", propOrder = {
    "commentUpdate",
    "deletedStructuredProperties",
    "deletedUnstructuredProperties",
    "updatedStructuredProperties",
    "updatedUnstructuredProperties"
})
@XmlSeeAlso({
    ServiceSingleEdgeUpdateDefinition.class
})
public class ServiceGraphElementUpdateDefinition {

    @XmlElement(name = "CommentUpdate", nillable = true)
    protected String commentUpdate;
    @XmlElement(name = "DeletedStructuredProperties", nillable = true)
    protected ArrayOflong deletedStructuredProperties;
    @XmlElement(name = "DeletedUnstructuredProperties", nillable = true)
    protected ArrayOfstring deletedUnstructuredProperties;
    @XmlElement(name = "UpdatedStructuredProperties", nillable = true)
    protected ArrayOfKeyValueOflonganyType updatedStructuredProperties;
    @XmlElement(name = "UpdatedUnstructuredProperties", nillable = true)
    protected ArrayOfKeyValueOfstringanyType updatedUnstructuredProperties;

    /**
     * Gets the value of the commentUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentUpdate() {
        return commentUpdate;
    }

    /**
     * Sets the value of the commentUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentUpdate(String value) {
        this.commentUpdate = value;
    }

    /**
     * Gets the value of the deletedStructuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getDeletedStructuredProperties() {
        return deletedStructuredProperties;
    }

    /**
     * Sets the value of the deletedStructuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setDeletedStructuredProperties(ArrayOflong value) {
        this.deletedStructuredProperties = value;
    }

    /**
     * Gets the value of the deletedUnstructuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getDeletedUnstructuredProperties() {
        return deletedUnstructuredProperties;
    }

    /**
     * Sets the value of the deletedUnstructuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setDeletedUnstructuredProperties(ArrayOfstring value) {
        this.deletedUnstructuredProperties = value;
    }

    /**
     * Gets the value of the updatedStructuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOflonganyType }
     *     
     */
    public ArrayOfKeyValueOflonganyType getUpdatedStructuredProperties() {
        return updatedStructuredProperties;
    }

    /**
     * Sets the value of the updatedStructuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOflonganyType }
     *     
     */
    public void setUpdatedStructuredProperties(ArrayOfKeyValueOflonganyType value) {
        this.updatedStructuredProperties = value;
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
