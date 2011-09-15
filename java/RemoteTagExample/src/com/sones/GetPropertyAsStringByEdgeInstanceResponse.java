
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
 *         &lt;element name="GetPropertyAsStringByEdgeInstanceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPropertyAsStringByEdgeInstanceResult"
})
@XmlRootElement(name = "GetPropertyAsStringByEdgeInstanceResponse")
public class GetPropertyAsStringByEdgeInstanceResponse {

    @XmlElement(name = "GetPropertyAsStringByEdgeInstanceResult", nillable = true)
    protected String getPropertyAsStringByEdgeInstanceResult;

    /**
     * Gets the value of the getPropertyAsStringByEdgeInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPropertyAsStringByEdgeInstanceResult() {
        return getPropertyAsStringByEdgeInstanceResult;
    }

    /**
     * Sets the value of the getPropertyAsStringByEdgeInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPropertyAsStringByEdgeInstanceResult(String value) {
        this.getPropertyAsStringByEdgeInstanceResult = value;
    }

}
