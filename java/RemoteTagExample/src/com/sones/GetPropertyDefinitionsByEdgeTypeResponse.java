
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
 *         &lt;element name="GetPropertyDefinitionsByEdgeTypeResult" type="{http://www.sones.com}ArrayOfServicePropertyDefinition" minOccurs="0"/>
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
    "getPropertyDefinitionsByEdgeTypeResult"
})
@XmlRootElement(name = "GetPropertyDefinitionsByEdgeTypeResponse")
public class GetPropertyDefinitionsByEdgeTypeResponse {

    @XmlElement(name = "GetPropertyDefinitionsByEdgeTypeResult", nillable = true)
    protected ArrayOfServicePropertyDefinition getPropertyDefinitionsByEdgeTypeResult;

    /**
     * Gets the value of the getPropertyDefinitionsByEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServicePropertyDefinition }
     *     
     */
    public ArrayOfServicePropertyDefinition getGetPropertyDefinitionsByEdgeTypeResult() {
        return getPropertyDefinitionsByEdgeTypeResult;
    }

    /**
     * Sets the value of the getPropertyDefinitionsByEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServicePropertyDefinition }
     *     
     */
    public void setGetPropertyDefinitionsByEdgeTypeResult(ArrayOfServicePropertyDefinition value) {
        this.getPropertyDefinitionsByEdgeTypeResult = value;
    }

}
