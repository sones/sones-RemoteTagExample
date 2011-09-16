
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
 *         &lt;element name="GetAttributeDefinitionByIDByVertexTypeResult" type="{http://www.sones.com}ServiceAttributeDefinition" minOccurs="0"/>
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
    "getAttributeDefinitionByIDByVertexTypeResult"
})
@XmlRootElement(name = "GetAttributeDefinitionByIDByVertexTypeResponse")
public class GetAttributeDefinitionByIDByVertexTypeResponse {

    @XmlElement(name = "GetAttributeDefinitionByIDByVertexTypeResult", nillable = true)
    protected ServiceAttributeDefinition getAttributeDefinitionByIDByVertexTypeResult;

    /**
     * Gets the value of the getAttributeDefinitionByIDByVertexTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAttributeDefinition }
     *     
     */
    public ServiceAttributeDefinition getGetAttributeDefinitionByIDByVertexTypeResult() {
        return getAttributeDefinitionByIDByVertexTypeResult;
    }

    /**
     * Sets the value of the getAttributeDefinitionByIDByVertexTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAttributeDefinition }
     *     
     */
    public void setGetAttributeDefinitionByIDByVertexTypeResult(ServiceAttributeDefinition value) {
        this.getAttributeDefinitionByIDByVertexTypeResult = value;
    }

}
