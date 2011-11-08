
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
 *         &lt;element name="GetBinaryPropertyDefinitionsResult" type="{http://www.sones.com}ArrayOfServiceBinaryPropertyDefinition" minOccurs="0"/>
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
    "getBinaryPropertyDefinitionsResult"
})
@XmlRootElement(name = "GetBinaryPropertyDefinitionsResponse")
public class GetBinaryPropertyDefinitionsResponse {

    @XmlElement(name = "GetBinaryPropertyDefinitionsResult", nillable = true)
    protected ArrayOfServiceBinaryPropertyDefinition getBinaryPropertyDefinitionsResult;

    /**
     * Gets the value of the getBinaryPropertyDefinitionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceBinaryPropertyDefinition }
     *     
     */
    public ArrayOfServiceBinaryPropertyDefinition getGetBinaryPropertyDefinitionsResult() {
        return getBinaryPropertyDefinitionsResult;
    }

    /**
     * Sets the value of the getBinaryPropertyDefinitionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceBinaryPropertyDefinition }
     *     
     */
    public void setGetBinaryPropertyDefinitionsResult(ArrayOfServiceBinaryPropertyDefinition value) {
        this.getBinaryPropertyDefinitionsResult = value;
    }

}
