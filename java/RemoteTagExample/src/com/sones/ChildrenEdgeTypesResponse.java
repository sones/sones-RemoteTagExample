
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
 *         &lt;element name="ChildrenEdgeTypesResult" type="{http://www.sones.com}ArrayOfServiceEdgeType" minOccurs="0"/>
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
    "childrenEdgeTypesResult"
})
@XmlRootElement(name = "ChildrenEdgeTypesResponse")
public class ChildrenEdgeTypesResponse {

    @XmlElement(name = "ChildrenEdgeTypesResult", nillable = true)
    protected ArrayOfServiceEdgeType childrenEdgeTypesResult;

    /**
     * Gets the value of the childrenEdgeTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceEdgeType }
     *     
     */
    public ArrayOfServiceEdgeType getChildrenEdgeTypesResult() {
        return childrenEdgeTypesResult;
    }

    /**
     * Sets the value of the childrenEdgeTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceEdgeType }
     *     
     */
    public void setChildrenEdgeTypesResult(ArrayOfServiceEdgeType value) {
        this.childrenEdgeTypesResult = value;
    }

}
