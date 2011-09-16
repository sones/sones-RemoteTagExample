
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
 *         &lt;element name="HasAttributesByEdgeTypeResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "hasAttributesByEdgeTypeResult"
})
@XmlRootElement(name = "HasAttributesByEdgeTypeResponse")
public class HasAttributesByEdgeTypeResponse {

    @XmlElement(name = "HasAttributesByEdgeTypeResult")
    protected Boolean hasAttributesByEdgeTypeResult;

    /**
     * Gets the value of the hasAttributesByEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttributesByEdgeTypeResult() {
        return hasAttributesByEdgeTypeResult;
    }

    /**
     * Sets the value of the hasAttributesByEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttributesByEdgeTypeResult(Boolean value) {
        this.hasAttributesByEdgeTypeResult = value;
    }

}
