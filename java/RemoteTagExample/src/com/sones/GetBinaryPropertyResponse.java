
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
 *         &lt;element name="GetBinaryPropertyResult" type="{http://schemas.microsoft.com/Message}StreamBody"/>
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
    "getBinaryPropertyResult"
})
@XmlRootElement(name = "GetBinaryPropertyResponse")
public class GetBinaryPropertyResponse {

    @XmlElement(name = "GetBinaryPropertyResult", required = true)
    protected byte[] getBinaryPropertyResult;

    /**
     * Gets the value of the getBinaryPropertyResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetBinaryPropertyResult() {
        return getBinaryPropertyResult;
    }

    /**
     * Sets the value of the getBinaryPropertyResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetBinaryPropertyResult(byte[] value) {
        this.getBinaryPropertyResult = value;
    }

}
