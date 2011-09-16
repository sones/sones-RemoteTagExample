
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
 *         &lt;element name="GetUnstructuredPropertyAsStringByVertexInstanceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getUnstructuredPropertyAsStringByVertexInstanceResult"
})
@XmlRootElement(name = "GetUnstructuredPropertyAsStringByVertexInstanceResponse")
public class GetUnstructuredPropertyAsStringByVertexInstanceResponse {

    @XmlElement(name = "GetUnstructuredPropertyAsStringByVertexInstanceResult", nillable = true)
    protected String getUnstructuredPropertyAsStringByVertexInstanceResult;

    /**
     * Gets the value of the getUnstructuredPropertyAsStringByVertexInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetUnstructuredPropertyAsStringByVertexInstanceResult() {
        return getUnstructuredPropertyAsStringByVertexInstanceResult;
    }

    /**
     * Sets the value of the getUnstructuredPropertyAsStringByVertexInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetUnstructuredPropertyAsStringByVertexInstanceResult(String value) {
        this.getUnstructuredPropertyAsStringByVertexInstanceResult = value;
    }

}
