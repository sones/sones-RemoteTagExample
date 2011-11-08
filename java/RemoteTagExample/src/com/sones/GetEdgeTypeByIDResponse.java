
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
 *         &lt;element name="GetEdgeTypeByIDResult" type="{http://www.sones.com}ServiceEdgeType" minOccurs="0"/>
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
    "getEdgeTypeByIDResult"
})
@XmlRootElement(name = "GetEdgeTypeByIDResponse")
public class GetEdgeTypeByIDResponse {

    @XmlElement(name = "GetEdgeTypeByIDResult", nillable = true)
    protected ServiceEdgeType getEdgeTypeByIDResult;

    /**
     * Gets the value of the getEdgeTypeByIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEdgeType }
     *     
     */
    public ServiceEdgeType getGetEdgeTypeByIDResult() {
        return getEdgeTypeByIDResult;
    }

    /**
     * Sets the value of the getEdgeTypeByIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEdgeType }
     *     
     */
    public void setGetEdgeTypeByIDResult(ServiceEdgeType value) {
        this.getEdgeTypeByIDResult = value;
    }

}
