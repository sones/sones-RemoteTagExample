
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
 *         &lt;element name="GetIncomingEdgeDefinitionsResult" type="{http://www.sones.com}ArrayOfServiceIncomingEdgeDefinition" minOccurs="0"/>
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
    "getIncomingEdgeDefinitionsResult"
})
@XmlRootElement(name = "GetIncomingEdgeDefinitionsResponse")
public class GetIncomingEdgeDefinitionsResponse {

    @XmlElement(name = "GetIncomingEdgeDefinitionsResult", nillable = true)
    protected ArrayOfServiceIncomingEdgeDefinition getIncomingEdgeDefinitionsResult;

    /**
     * Gets the value of the getIncomingEdgeDefinitionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIncomingEdgeDefinition }
     *     
     */
    public ArrayOfServiceIncomingEdgeDefinition getGetIncomingEdgeDefinitionsResult() {
        return getIncomingEdgeDefinitionsResult;
    }

    /**
     * Sets the value of the getIncomingEdgeDefinitionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIncomingEdgeDefinition }
     *     
     */
    public void setGetIncomingEdgeDefinitionsResult(ArrayOfServiceIncomingEdgeDefinition value) {
        this.getIncomingEdgeDefinitionsResult = value;
    }

}
