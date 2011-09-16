
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
 *         &lt;element name="GetAncestorVertexTypesResult" type="{http://www.sones.com}ArrayOfServiceVertexType" minOccurs="0"/>
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
    "getAncestorVertexTypesResult"
})
@XmlRootElement(name = "GetAncestorVertexTypesResponse")
public class GetAncestorVertexTypesResponse {

    @XmlElement(name = "GetAncestorVertexTypesResult", nillable = true)
    protected ArrayOfServiceVertexType getAncestorVertexTypesResult;

    /**
     * Gets the value of the getAncestorVertexTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceVertexType }
     *     
     */
    public ArrayOfServiceVertexType getGetAncestorVertexTypesResult() {
        return getAncestorVertexTypesResult;
    }

    /**
     * Sets the value of the getAncestorVertexTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceVertexType }
     *     
     */
    public void setGetAncestorVertexTypesResult(ArrayOfServiceVertexType value) {
        this.getAncestorVertexTypesResult = value;
    }

}
