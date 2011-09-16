
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
 *         &lt;element name="GetPropertyByVertexInstanceResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "getPropertyByVertexInstanceResult"
})
@XmlRootElement(name = "GetPropertyByVertexInstanceResponse")
public class GetPropertyByVertexInstanceResponse {

    @XmlElement(name = "GetPropertyByVertexInstanceResult", nillable = true)
    protected Object getPropertyByVertexInstanceResult;

    /**
     * Gets the value of the getPropertyByVertexInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGetPropertyByVertexInstanceResult() {
        return getPropertyByVertexInstanceResult;
    }

    /**
     * Sets the value of the getPropertyByVertexInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGetPropertyByVertexInstanceResult(Object value) {
        this.getPropertyByVertexInstanceResult = value;
    }

}
