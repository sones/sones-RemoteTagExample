
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
 *         &lt;element name="GetPropertyAsStringByVertexInstanceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPropertyAsStringByVertexInstanceResult"
})
@XmlRootElement(name = "GetPropertyAsStringByVertexInstanceResponse")
public class GetPropertyAsStringByVertexInstanceResponse {

    @XmlElement(name = "GetPropertyAsStringByVertexInstanceResult", nillable = true)
    protected String getPropertyAsStringByVertexInstanceResult;

    /**
     * Gets the value of the getPropertyAsStringByVertexInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPropertyAsStringByVertexInstanceResult() {
        return getPropertyAsStringByVertexInstanceResult;
    }

    /**
     * Sets the value of the getPropertyAsStringByVertexInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPropertyAsStringByVertexInstanceResult(String value) {
        this.getPropertyAsStringByVertexInstanceResult = value;
    }

}
