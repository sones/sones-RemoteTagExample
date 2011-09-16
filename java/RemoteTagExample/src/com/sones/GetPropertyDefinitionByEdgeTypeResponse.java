
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
 *         &lt;element name="GetPropertyDefinitionByEdgeTypeResult" type="{http://www.sones.com}ServicePropertyDefinition" minOccurs="0"/>
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
    "getPropertyDefinitionByEdgeTypeResult"
})
@XmlRootElement(name = "GetPropertyDefinitionByEdgeTypeResponse")
public class GetPropertyDefinitionByEdgeTypeResponse {

    @XmlElement(name = "GetPropertyDefinitionByEdgeTypeResult", nillable = true)
    protected ServicePropertyDefinition getPropertyDefinitionByEdgeTypeResult;

    /**
     * Gets the value of the getPropertyDefinitionByEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePropertyDefinition }
     *     
     */
    public ServicePropertyDefinition getGetPropertyDefinitionByEdgeTypeResult() {
        return getPropertyDefinitionByEdgeTypeResult;
    }

    /**
     * Sets the value of the getPropertyDefinitionByEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePropertyDefinition }
     *     
     */
    public void setGetPropertyDefinitionByEdgeTypeResult(ServicePropertyDefinition value) {
        this.getPropertyDefinitionByEdgeTypeResult = value;
    }

}
