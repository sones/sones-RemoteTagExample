
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
 *         &lt;element name="CreateEdgeTypesResult" type="{http://www.sones.com}ArrayOfServiceEdgeType" minOccurs="0"/>
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
    "createEdgeTypesResult"
})
@XmlRootElement(name = "CreateEdgeTypesResponse")
public class CreateEdgeTypesResponse {

    @XmlElement(name = "CreateEdgeTypesResult", nillable = true)
    protected ArrayOfServiceEdgeType createEdgeTypesResult;

    /**
     * Gets the value of the createEdgeTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceEdgeType }
     *     
     */
    public ArrayOfServiceEdgeType getCreateEdgeTypesResult() {
        return createEdgeTypesResult;
    }

    /**
     * Sets the value of the createEdgeTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceEdgeType }
     *     
     */
    public void setCreateEdgeTypesResult(ArrayOfServiceEdgeType value) {
        this.createEdgeTypesResult = value;
    }

}
