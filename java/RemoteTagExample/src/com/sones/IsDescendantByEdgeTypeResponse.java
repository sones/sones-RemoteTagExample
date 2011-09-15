
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
 *         &lt;element name="IsDescendantByEdgeTypeResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "isDescendantByEdgeTypeResult"
})
@XmlRootElement(name = "IsDescendantByEdgeTypeResponse")
public class IsDescendantByEdgeTypeResponse {

    @XmlElement(name = "IsDescendantByEdgeTypeResult")
    protected Boolean isDescendantByEdgeTypeResult;

    /**
     * Gets the value of the isDescendantByEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDescendantByEdgeTypeResult() {
        return isDescendantByEdgeTypeResult;
    }

    /**
     * Sets the value of the isDescendantByEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDescendantByEdgeTypeResult(Boolean value) {
        this.isDescendantByEdgeTypeResult = value;
    }

}
