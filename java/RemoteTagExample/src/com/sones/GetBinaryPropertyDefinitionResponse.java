
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
 *         &lt;element name="GetBinaryPropertyDefinitionResult" type="{http://www.sones.com}ServiceBinaryPropertyDefinition" minOccurs="0"/>
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
    "getBinaryPropertyDefinitionResult"
})
@XmlRootElement(name = "GetBinaryPropertyDefinitionResponse")
public class GetBinaryPropertyDefinitionResponse {

    @XmlElement(name = "GetBinaryPropertyDefinitionResult", nillable = true)
    protected ServiceBinaryPropertyDefinition getBinaryPropertyDefinitionResult;

    /**
     * Gets the value of the getBinaryPropertyDefinitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBinaryPropertyDefinition }
     *     
     */
    public ServiceBinaryPropertyDefinition getGetBinaryPropertyDefinitionResult() {
        return getBinaryPropertyDefinitionResult;
    }

    /**
     * Sets the value of the getBinaryPropertyDefinitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBinaryPropertyDefinition }
     *     
     */
    public void setGetBinaryPropertyDefinitionResult(ServiceBinaryPropertyDefinition value) {
        this.getBinaryPropertyDefinitionResult = value;
    }

}
