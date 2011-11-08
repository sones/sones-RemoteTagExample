
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
 *         &lt;element name="GetAllOutgoingSingleEdgesResult" type="{http://www.sones.com}ArrayOfServiceSingleEdgeInstance" minOccurs="0"/>
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
    "getAllOutgoingSingleEdgesResult"
})
@XmlRootElement(name = "GetAllOutgoingSingleEdgesResponse")
public class GetAllOutgoingSingleEdgesResponse {

    @XmlElement(name = "GetAllOutgoingSingleEdgesResult", nillable = true)
    protected ArrayOfServiceSingleEdgeInstance getAllOutgoingSingleEdgesResult;

    /**
     * Gets the value of the getAllOutgoingSingleEdgesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceSingleEdgeInstance }
     *     
     */
    public ArrayOfServiceSingleEdgeInstance getGetAllOutgoingSingleEdgesResult() {
        return getAllOutgoingSingleEdgesResult;
    }

    /**
     * Sets the value of the getAllOutgoingSingleEdgesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceSingleEdgeInstance }
     *     
     */
    public void setGetAllOutgoingSingleEdgesResult(ArrayOfServiceSingleEdgeInstance value) {
        this.getAllOutgoingSingleEdgesResult = value;
    }

}
