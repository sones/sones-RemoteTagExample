
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
 *         &lt;element name="GetAncestorEdgeTypesAndSelfResult" type="{http://www.sones.com}ArrayOfServiceEdgeType" minOccurs="0"/>
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
    "getAncestorEdgeTypesAndSelfResult"
})
@XmlRootElement(name = "GetAncestorEdgeTypesAndSelfResponse")
public class GetAncestorEdgeTypesAndSelfResponse {

    @XmlElement(name = "GetAncestorEdgeTypesAndSelfResult", nillable = true)
    protected ArrayOfServiceEdgeType getAncestorEdgeTypesAndSelfResult;

    /**
     * Gets the value of the getAncestorEdgeTypesAndSelfResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceEdgeType }
     *     
     */
    public ArrayOfServiceEdgeType getGetAncestorEdgeTypesAndSelfResult() {
        return getAncestorEdgeTypesAndSelfResult;
    }

    /**
     * Sets the value of the getAncestorEdgeTypesAndSelfResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceEdgeType }
     *     
     */
    public void setGetAncestorEdgeTypesAndSelfResult(ArrayOfServiceEdgeType value) {
        this.getAncestorEdgeTypesAndSelfResult = value;
    }

}
