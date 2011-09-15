
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
 *         &lt;element name="GetKinsmenVertexTypesResult" type="{http://www.sones.com}ArrayOfServiceVertexType" minOccurs="0"/>
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
    "getKinsmenVertexTypesResult"
})
@XmlRootElement(name = "GetKinsmenVertexTypesResponse")
public class GetKinsmenVertexTypesResponse {

    @XmlElement(name = "GetKinsmenVertexTypesResult", nillable = true)
    protected ArrayOfServiceVertexType getKinsmenVertexTypesResult;

    /**
     * Gets the value of the getKinsmenVertexTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceVertexType }
     *     
     */
    public ArrayOfServiceVertexType getGetKinsmenVertexTypesResult() {
        return getKinsmenVertexTypesResult;
    }

    /**
     * Sets the value of the getKinsmenVertexTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceVertexType }
     *     
     */
    public void setGetKinsmenVertexTypesResult(ArrayOfServiceVertexType value) {
        this.getKinsmenVertexTypesResult = value;
    }

}
