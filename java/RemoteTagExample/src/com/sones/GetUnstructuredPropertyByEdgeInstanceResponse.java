
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
 *         &lt;element name="GetUnstructuredPropertyByEdgeInstanceResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "getUnstructuredPropertyByEdgeInstanceResult"
})
@XmlRootElement(name = "GetUnstructuredPropertyByEdgeInstanceResponse")
public class GetUnstructuredPropertyByEdgeInstanceResponse {

    @XmlElement(name = "GetUnstructuredPropertyByEdgeInstanceResult", nillable = true)
    protected Object getUnstructuredPropertyByEdgeInstanceResult;

    /**
     * Gets the value of the getUnstructuredPropertyByEdgeInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGetUnstructuredPropertyByEdgeInstanceResult() {
        return getUnstructuredPropertyByEdgeInstanceResult;
    }

    /**
     * Sets the value of the getUnstructuredPropertyByEdgeInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGetUnstructuredPropertyByEdgeInstanceResult(Object value) {
        this.getUnstructuredPropertyByEdgeInstanceResult = value;
    }

}
