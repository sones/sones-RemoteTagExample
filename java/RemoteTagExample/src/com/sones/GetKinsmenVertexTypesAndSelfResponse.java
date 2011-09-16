
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
 *         &lt;element name="GetKinsmenVertexTypesAndSelfResult" type="{http://www.sones.com}ArrayOfServiceVertexType" minOccurs="0"/>
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
    "getKinsmenVertexTypesAndSelfResult"
})
@XmlRootElement(name = "GetKinsmenVertexTypesAndSelfResponse")
public class GetKinsmenVertexTypesAndSelfResponse {

    @XmlElement(name = "GetKinsmenVertexTypesAndSelfResult", nillable = true)
    protected ArrayOfServiceVertexType getKinsmenVertexTypesAndSelfResult;

    /**
     * Gets the value of the getKinsmenVertexTypesAndSelfResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceVertexType }
     *     
     */
    public ArrayOfServiceVertexType getGetKinsmenVertexTypesAndSelfResult() {
        return getKinsmenVertexTypesAndSelfResult;
    }

    /**
     * Sets the value of the getKinsmenVertexTypesAndSelfResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceVertexType }
     *     
     */
    public void setGetKinsmenVertexTypesAndSelfResult(ArrayOfServiceVertexType value) {
        this.getKinsmenVertexTypesAndSelfResult = value;
    }

}
