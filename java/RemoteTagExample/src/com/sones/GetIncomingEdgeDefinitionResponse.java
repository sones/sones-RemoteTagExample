
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
 *         &lt;element name="GetIncomingEdgeDefinitionResult" type="{http://www.sones.com}ServiceIncomingEdgeDefinition" minOccurs="0"/>
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
    "getIncomingEdgeDefinitionResult"
})
@XmlRootElement(name = "GetIncomingEdgeDefinitionResponse")
public class GetIncomingEdgeDefinitionResponse {

    @XmlElement(name = "GetIncomingEdgeDefinitionResult", nillable = true)
    protected ServiceIncomingEdgeDefinition getIncomingEdgeDefinitionResult;

    /**
     * Gets the value of the getIncomingEdgeDefinitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIncomingEdgeDefinition }
     *     
     */
    public ServiceIncomingEdgeDefinition getGetIncomingEdgeDefinitionResult() {
        return getIncomingEdgeDefinitionResult;
    }

    /**
     * Sets the value of the getIncomingEdgeDefinitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIncomingEdgeDefinition }
     *     
     */
    public void setGetIncomingEdgeDefinitionResult(ServiceIncomingEdgeDefinition value) {
        this.getIncomingEdgeDefinitionResult = value;
    }

}
