
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
 *         &lt;element name="AlterEdgeTypeResult" type="{http://www.sones.com}ServiceEdgeType" minOccurs="0"/>
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
    "alterEdgeTypeResult"
})
@XmlRootElement(name = "AlterEdgeTypeResponse")
public class AlterEdgeTypeResponse {

    @XmlElement(name = "AlterEdgeTypeResult", nillable = true)
    protected ServiceEdgeType alterEdgeTypeResult;

    /**
     * Gets the value of the alterEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEdgeType }
     *     
     */
    public ServiceEdgeType getAlterEdgeTypeResult() {
        return alterEdgeTypeResult;
    }

    /**
     * Sets the value of the alterEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEdgeType }
     *     
     */
    public void setAlterEdgeTypeResult(ServiceEdgeType value) {
        this.alterEdgeTypeResult = value;
    }

}
