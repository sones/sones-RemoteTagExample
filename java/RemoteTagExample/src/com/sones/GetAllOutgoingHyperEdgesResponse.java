
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
 *         &lt;element name="GetAllOutgoingHyperEdgesResult" type="{http://www.sones.com}ArrayOfServiceHyperEdgeInstance" minOccurs="0"/>
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
    "getAllOutgoingHyperEdgesResult"
})
@XmlRootElement(name = "GetAllOutgoingHyperEdgesResponse")
public class GetAllOutgoingHyperEdgesResponse {

    @XmlElement(name = "GetAllOutgoingHyperEdgesResult", nillable = true)
    protected ArrayOfServiceHyperEdgeInstance getAllOutgoingHyperEdgesResult;

    /**
     * Gets the value of the getAllOutgoingHyperEdgesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceHyperEdgeInstance }
     *     
     */
    public ArrayOfServiceHyperEdgeInstance getGetAllOutgoingHyperEdgesResult() {
        return getAllOutgoingHyperEdgesResult;
    }

    /**
     * Sets the value of the getAllOutgoingHyperEdgesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceHyperEdgeInstance }
     *     
     */
    public void setGetAllOutgoingHyperEdgesResult(ArrayOfServiceHyperEdgeInstance value) {
        this.getAllOutgoingHyperEdgesResult = value;
    }

}
