
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for ServiceAlterEdgeChangeset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAlterEdgeChangeset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToBeAddedProperties" type="{http://www.sones.com}ArrayOfServicePropertyPredefinition" minOccurs="0"/>
 *         &lt;element name="ToBeRemovedProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
@XmlType(name = "ServiceAlterEdgeChangeset", propOrder = {
    "comment",
    "newTypeName",
    "toBeAddedProperties",
    "toBeRemovedProperties",
    "toBeRenamedProperties"
})
public class ServiceAlterEdgeChangeset {

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "NewTypeName", nillable = true)
    protected String newTypeName;
    @XmlElement(name = "ToBeAddedProperties", nillable = true)
    protected ArrayOfServicePropertyPredefinition toBeAddedProperties;
    @XmlElement(name = "ToBeRemovedProperties", nillable = true)
    protected ArrayOfstring toBeRemovedProperties;
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
     * Gets the value of the toBeRemovedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getToBeRemovedProperties() {
        return toBeRemovedProperties;
    }

    /**
     * Sets the value of the toBeRemovedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setToBeRemovedProperties(ArrayOfstring value) {
        this.toBeRemovedProperties = value;
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
