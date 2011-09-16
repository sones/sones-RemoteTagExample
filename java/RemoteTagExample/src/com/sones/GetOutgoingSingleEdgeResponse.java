
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
 *         &lt;element name="GetOutgoingSingleEdgeResult" type="{http://www.sones.com}ServiceSingleEdgeInstance" minOccurs="0"/>
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
    "getOutgoingSingleEdgeResult"
})
@XmlRootElement(name = "GetOutgoingSingleEdgeResponse")
public class GetOutgoingSingleEdgeResponse {

    @XmlElement(name = "GetOutgoingSingleEdgeResult", nillable = true)
    protected ServiceSingleEdgeInstance getOutgoingSingleEdgeResult;

    /**
     * Gets the value of the getOutgoingSingleEdgeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSingleEdgeInstance }
     *     
     */
    public ServiceSingleEdgeInstance getGetOutgoingSingleEdgeResult() {
        return getOutgoingSingleEdgeResult;
    }

    /**
     * Sets the value of the getOutgoingSingleEdgeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSingleEdgeInstance }
     *     
     */
    public void setGetOutgoingSingleEdgeResult(ServiceSingleEdgeInstance value) {
        this.getOutgoingSingleEdgeResult = value;
    }

}
