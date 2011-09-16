
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
 *         &lt;element name="HasPropertyByEdgeInstanceResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "hasPropertyByEdgeInstanceResult"
})
@XmlRootElement(name = "HasPropertyByEdgeInstanceResponse")
public class HasPropertyByEdgeInstanceResponse {

    @XmlElement(name = "HasPropertyByEdgeInstanceResult")
    protected Boolean hasPropertyByEdgeInstanceResult;

    /**
     * Gets the value of the hasPropertyByEdgeInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPropertyByEdgeInstanceResult() {
        return hasPropertyByEdgeInstanceResult;
    }

    /**
     * Sets the value of the hasPropertyByEdgeInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPropertyByEdgeInstanceResult(Boolean value) {
        this.hasPropertyByEdgeInstanceResult = value;
    }

}
