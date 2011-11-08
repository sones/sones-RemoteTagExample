
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
 *         &lt;element name="GetVertexTypeByNameResult" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
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
    "getVertexTypeByNameResult"
})
@XmlRootElement(name = "GetVertexTypeByNameResponse")
public class GetVertexTypeByNameResponse {

    @XmlElement(name = "GetVertexTypeByNameResult", nillable = true)
    protected ServiceVertexType getVertexTypeByNameResult;

    /**
     * Gets the value of the getVertexTypeByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getGetVertexTypeByNameResult() {
        return getVertexTypeByNameResult;
    }

    /**
     * Sets the value of the getVertexTypeByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setGetVertexTypeByNameResult(ServiceVertexType value) {
        this.getVertexTypeByNameResult = value;
    }

}
