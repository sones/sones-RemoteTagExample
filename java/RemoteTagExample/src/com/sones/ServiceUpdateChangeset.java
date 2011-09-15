
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;


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
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToBeUpdatedEdges" type="{http://www.sones.com}ArrayOfServiceEdgeInstance" minOccurs="0"/>
 *         &lt;element name="ToBeUpdatedStructuredProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
 *         &lt;element name="ToBeUpdatedUnstructuredProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
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
    "comment",
    "edition",
    "toBeUpdatedEdges",
    "toBeUpdatedStructuredProperties",
    "toBeUpdatedUnstructuredProperties"
})
public class ServiceUpdateChangeset {

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "Edition", nillable = true)
    protected String edition;
    @XmlElement(name = "ToBeUpdatedEdges", nillable = true)
    protected ArrayOfServiceEdgeInstance toBeUpdatedEdges;
    @XmlElement(name = "ToBeUpdatedStructuredProperties", nillable = true)
    protected ArrayOfKeyValueOfstringanyType toBeUpdatedStructuredProperties;
    @XmlElement(name = "ToBeUpdatedUnstructuredProperties", nillable = true)
    protected ArrayOfKeyValueOfstringanyType toBeUpdatedUnstructuredProperties;

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
     * Gets the value of the toBeUpdatedEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceEdgeInstance }
     *     
     */
    public ArrayOfServiceEdgeInstance getToBeUpdatedEdges() {
        return toBeUpdatedEdges;
    }

    /**
     * Sets the value of the toBeUpdatedEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceEdgeInstance }
     *     
     */
    public void setToBeUpdatedEdges(ArrayOfServiceEdgeInstance value) {
        this.toBeUpdatedEdges = value;
    }

    /**
     * Gets the value of the toBeUpdatedStructuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public ArrayOfKeyValueOfstringanyType getToBeUpdatedStructuredProperties() {
        return toBeUpdatedStructuredProperties;
    }

    /**
     * Sets the value of the toBeUpdatedStructuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public void setToBeUpdatedStructuredProperties(ArrayOfKeyValueOfstringanyType value) {
        this.toBeUpdatedStructuredProperties = value;
    }

    /**
     * Gets the value of the toBeUpdatedUnstructuredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public ArrayOfKeyValueOfstringanyType getToBeUpdatedUnstructuredProperties() {
        return toBeUpdatedUnstructuredProperties;
    }

    /**
     * Sets the value of the toBeUpdatedUnstructuredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public void setToBeUpdatedUnstructuredProperties(ArrayOfKeyValueOfstringanyType value) {
        this.toBeUpdatedUnstructuredProperties = value;
    }

}
