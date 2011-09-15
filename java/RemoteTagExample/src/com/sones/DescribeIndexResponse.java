
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
 *         &lt;element name="DescribeIndexResult" type="{http://www.sones.com}ServiceIndexDefinition" minOccurs="0"/>
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
    "describeIndexResult"
})
@XmlRootElement(name = "DescribeIndexResponse")
public class DescribeIndexResponse {

    @XmlElement(name = "DescribeIndexResult", nillable = true)
    protected ServiceIndexDefinition describeIndexResult;

    /**
     * Gets the value of the describeIndexResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIndexDefinition }
     *     
     */
    public ServiceIndexDefinition getDescribeIndexResult() {
        return describeIndexResult;
    }

    /**
     * Sets the value of the describeIndexResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIndexDefinition }
     *     
     */
    public void setDescribeIndexResult(ServiceIndexDefinition value) {
        this.describeIndexResult = value;
    }

}
