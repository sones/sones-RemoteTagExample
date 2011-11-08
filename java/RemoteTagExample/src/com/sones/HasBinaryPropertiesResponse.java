
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasBinaryPropertiesResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hasBinaryPropertiesResult"
})
@XmlRootElement(name = "HasBinaryPropertiesResponse")
public class HasBinaryPropertiesResponse {

    @XmlElement(name = "HasBinaryPropertiesResult")
    protected Boolean hasBinaryPropertiesResult;

    /**
     * Gets the value of the hasBinaryPropertiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBinaryPropertiesResult() {
        return hasBinaryPropertiesResult;
    }

    /**
     * Sets the value of the hasBinaryPropertiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBinaryPropertiesResult(Boolean value) {
        this.hasBinaryPropertiesResult = value;
    }

}
