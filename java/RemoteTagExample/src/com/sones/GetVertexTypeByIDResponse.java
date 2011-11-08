
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
 *         &lt;element name="GetVertexTypeByIDResult" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
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
    "getVertexTypeByIDResult"
})
@XmlRootElement(name = "GetVertexTypeByIDResponse")
public class GetVertexTypeByIDResponse {

    @XmlElement(name = "GetVertexTypeByIDResult", nillable = true)
    protected ServiceVertexType getVertexTypeByIDResult;

    /**
     * Gets the value of the getVertexTypeByIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getGetVertexTypeByIDResult() {
        return getVertexTypeByIDResult;
    }

    /**
     * Sets the value of the getVertexTypeByIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setGetVertexTypeByIDResult(ServiceVertexType value) {
        this.getVertexTypeByIDResult = value;
    }

}
