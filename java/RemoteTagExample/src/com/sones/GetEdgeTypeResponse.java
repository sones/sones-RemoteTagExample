
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
 *         &lt;element name="GetEdgeTypeResult" type="{http://www.sones.com}ServiceEdgeType" minOccurs="0"/>
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
    "getEdgeTypeResult"
})
@XmlRootElement(name = "GetEdgeTypeResponse")
public class GetEdgeTypeResponse {

    @XmlElement(name = "GetEdgeTypeResult", nillable = true)
    protected ServiceEdgeType getEdgeTypeResult;

    /**
     * Gets the value of the getEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEdgeType }
     *     
     */
    public ServiceEdgeType getGetEdgeTypeResult() {
        return getEdgeTypeResult;
    }

    /**
     * Sets the value of the getEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEdgeType }
     *     
     */
    public void setGetEdgeTypeResult(ServiceEdgeType value) {
        this.getEdgeTypeResult = value;
    }

}
