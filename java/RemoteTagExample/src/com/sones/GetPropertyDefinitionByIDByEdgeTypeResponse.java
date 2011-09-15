
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
 *         &lt;element name="GetPropertyDefinitionByIDByEdgeTypeResult" type="{http://www.sones.com}ServicePropertyDefinition" minOccurs="0"/>
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
    "getPropertyDefinitionByIDByEdgeTypeResult"
})
@XmlRootElement(name = "GetPropertyDefinitionByIDByEdgeTypeResponse")
public class GetPropertyDefinitionByIDByEdgeTypeResponse {

    @XmlElement(name = "GetPropertyDefinitionByIDByEdgeTypeResult", nillable = true)
    protected ServicePropertyDefinition getPropertyDefinitionByIDByEdgeTypeResult;

    /**
     * Gets the value of the getPropertyDefinitionByIDByEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePropertyDefinition }
     *     
     */
    public ServicePropertyDefinition getGetPropertyDefinitionByIDByEdgeTypeResult() {
        return getPropertyDefinitionByIDByEdgeTypeResult;
    }

    /**
     * Sets the value of the getPropertyDefinitionByIDByEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePropertyDefinition }
     *     
     */
    public void setGetPropertyDefinitionByIDByEdgeTypeResult(ServicePropertyDefinition value) {
        this.getPropertyDefinitionByIDByEdgeTypeResult = value;
    }

}
