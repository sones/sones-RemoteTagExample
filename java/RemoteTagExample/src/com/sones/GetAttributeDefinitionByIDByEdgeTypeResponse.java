
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
 *         &lt;element name="GetAttributeDefinitionByIDByEdgeTypeResult" type="{http://www.sones.com}ServiceAttributeDefinition" minOccurs="0"/>
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
    "getAttributeDefinitionByIDByEdgeTypeResult"
})
@XmlRootElement(name = "GetAttributeDefinitionByIDByEdgeTypeResponse")
public class GetAttributeDefinitionByIDByEdgeTypeResponse {

    @XmlElement(name = "GetAttributeDefinitionByIDByEdgeTypeResult", nillable = true)
    protected ServiceAttributeDefinition getAttributeDefinitionByIDByEdgeTypeResult;

    /**
     * Gets the value of the getAttributeDefinitionByIDByEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAttributeDefinition }
     *     
     */
    public ServiceAttributeDefinition getGetAttributeDefinitionByIDByEdgeTypeResult() {
        return getAttributeDefinitionByIDByEdgeTypeResult;
    }

    /**
     * Sets the value of the getAttributeDefinitionByIDByEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAttributeDefinition }
     *     
     */
    public void setGetAttributeDefinitionByIDByEdgeTypeResult(ServiceAttributeDefinition value) {
        this.getAttributeDefinitionByIDByEdgeTypeResult = value;
    }

}
