
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
 *         &lt;element name="AlterVertexTypeResult" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
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
    "alterVertexTypeResult"
})
@XmlRootElement(name = "AlterVertexTypeResponse")
public class AlterVertexTypeResponse {

    @XmlElement(name = "AlterVertexTypeResult", nillable = true)
    protected ServiceVertexType alterVertexTypeResult;

    /**
     * Gets the value of the alterVertexTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getAlterVertexTypeResult() {
        return alterVertexTypeResult;
    }

    /**
     * Sets the value of the alterVertexTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setAlterVertexTypeResult(ServiceVertexType value) {
        this.alterVertexTypeResult = value;
    }

}
