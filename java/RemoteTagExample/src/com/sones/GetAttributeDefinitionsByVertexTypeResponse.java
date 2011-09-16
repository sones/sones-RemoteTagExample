
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
 *         &lt;element name="GetAttributeDefinitionsByVertexTypeResult" type="{http://www.sones.com}ArrayOfServiceAttributeDefinition" minOccurs="0"/>
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
    "getAttributeDefinitionsByVertexTypeResult"
})
@XmlRootElement(name = "GetAttributeDefinitionsByVertexTypeResponse")
public class GetAttributeDefinitionsByVertexTypeResponse {

    @XmlElement(name = "GetAttributeDefinitionsByVertexTypeResult", nillable = true)
    protected ArrayOfServiceAttributeDefinition getAttributeDefinitionsByVertexTypeResult;

    /**
     * Gets the value of the getAttributeDefinitionsByVertexTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceAttributeDefinition }
     *     
     */
    public ArrayOfServiceAttributeDefinition getGetAttributeDefinitionsByVertexTypeResult() {
        return getAttributeDefinitionsByVertexTypeResult;
    }

    /**
     * Sets the value of the getAttributeDefinitionsByVertexTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceAttributeDefinition }
     *     
     */
    public void setGetAttributeDefinitionsByVertexTypeResult(ArrayOfServiceAttributeDefinition value) {
        this.getAttributeDefinitionsByVertexTypeResult = value;
    }

}
