
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
 *         &lt;element name="ParentVertexTypeResult" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
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
    "parentVertexTypeResult"
})
@XmlRootElement(name = "ParentVertexTypeResponse")
public class ParentVertexTypeResponse {

    @XmlElement(name = "ParentVertexTypeResult", nillable = true)
    protected ServiceVertexType parentVertexTypeResult;

    /**
     * Gets the value of the parentVertexTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getParentVertexTypeResult() {
        return parentVertexTypeResult;
    }

    /**
     * Sets the value of the parentVertexTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setParentVertexTypeResult(ServiceVertexType value) {
        this.parentVertexTypeResult = value;
    }

}
