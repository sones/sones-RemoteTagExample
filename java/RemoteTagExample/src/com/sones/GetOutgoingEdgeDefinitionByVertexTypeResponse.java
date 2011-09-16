
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
 *         &lt;element name="GetOutgoingEdgeDefinitionByVertexTypeResult" type="{http://www.sones.com}ServiceOutgoingEdgeDefinition" minOccurs="0"/>
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
    "getOutgoingEdgeDefinitionByVertexTypeResult"
})
@XmlRootElement(name = "GetOutgoingEdgeDefinitionByVertexTypeResponse")
public class GetOutgoingEdgeDefinitionByVertexTypeResponse {

    @XmlElement(name = "GetOutgoingEdgeDefinitionByVertexTypeResult", nillable = true)
    protected ServiceOutgoingEdgeDefinition getOutgoingEdgeDefinitionByVertexTypeResult;

    /**
     * Gets the value of the getOutgoingEdgeDefinitionByVertexTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOutgoingEdgeDefinition }
     *     
     */
    public ServiceOutgoingEdgeDefinition getGetOutgoingEdgeDefinitionByVertexTypeResult() {
        return getOutgoingEdgeDefinitionByVertexTypeResult;
    }

    /**
     * Sets the value of the getOutgoingEdgeDefinitionByVertexTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOutgoingEdgeDefinition }
     *     
     */
    public void setGetOutgoingEdgeDefinitionByVertexTypeResult(ServiceOutgoingEdgeDefinition value) {
        this.getOutgoingEdgeDefinitionByVertexTypeResult = value;
    }

}
