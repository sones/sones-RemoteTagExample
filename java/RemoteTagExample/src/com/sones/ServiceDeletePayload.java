
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for ServiceDeletePayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeletePayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToBeDeletedAttributes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeletePayload", propOrder = {
    "toBeDeletedAttributes"
})
public class ServiceDeletePayload {

    @XmlElement(name = "ToBeDeletedAttributes", nillable = true)
    protected ArrayOfstring toBeDeletedAttributes;

    /**
     * Gets the value of the toBeDeletedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getToBeDeletedAttributes() {
        return toBeDeletedAttributes;
    }

    /**
     * Sets the value of the toBeDeletedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setToBeDeletedAttributes(ArrayOfstring value) {
        this.toBeDeletedAttributes = value;
    }

}
