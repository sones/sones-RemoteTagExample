
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
 *         &lt;element name="GetPropertyDefinitionByVertexTypeResult" type="{http://www.sones.com}ServicePropertyDefinition" minOccurs="0"/>
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
    "getPropertyDefinitionByVertexTypeResult"
})
@XmlRootElement(name = "GetPropertyDefinitionByVertexTypeResponse")
public class GetPropertyDefinitionByVertexTypeResponse {

    @XmlElement(name = "GetPropertyDefinitionByVertexTypeResult", nillable = true)
    protected ServicePropertyDefinition getPropertyDefinitionByVertexTypeResult;

    /**
     * Gets the value of the getPropertyDefinitionByVertexTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePropertyDefinition }
     *     
     */
    public ServicePropertyDefinition getGetPropertyDefinitionByVertexTypeResult() {
        return getPropertyDefinitionByVertexTypeResult;
    }

    /**
     * Sets the value of the getPropertyDefinitionByVertexTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePropertyDefinition }
     *     
     */
    public void setGetPropertyDefinitionByVertexTypeResult(ServicePropertyDefinition value) {
        this.getPropertyDefinitionByVertexTypeResult = value;
    }

}
