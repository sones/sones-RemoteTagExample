
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
 *         &lt;element name="HasParentTypeByEdgeTypeResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "hasParentTypeByEdgeTypeResult"
})
@XmlRootElement(name = "HasParentTypeByEdgeTypeResponse")
public class HasParentTypeByEdgeTypeResponse {

    @XmlElement(name = "HasParentTypeByEdgeTypeResult")
    protected Boolean hasParentTypeByEdgeTypeResult;

    /**
     * Gets the value of the hasParentTypeByEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasParentTypeByEdgeTypeResult() {
        return hasParentTypeByEdgeTypeResult;
    }

    /**
     * Sets the value of the hasParentTypeByEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasParentTypeByEdgeTypeResult(Boolean value) {
        this.hasParentTypeByEdgeTypeResult = value;
    }

}
