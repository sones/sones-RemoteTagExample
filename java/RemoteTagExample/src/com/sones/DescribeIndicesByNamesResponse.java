
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
 *         &lt;element name="DescribeIndicesByNamesResult" type="{http://www.sones.com}ArrayOfServiceIndexDefinition" minOccurs="0"/>
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
    "describeIndicesByNamesResult"
})
@XmlRootElement(name = "DescribeIndicesByNamesResponse")
public class DescribeIndicesByNamesResponse {

    @XmlElement(name = "DescribeIndicesByNamesResult", nillable = true)
    protected ArrayOfServiceIndexDefinition describeIndicesByNamesResult;

    /**
     * Gets the value of the describeIndicesByNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIndexDefinition }
     *     
     */
    public ArrayOfServiceIndexDefinition getDescribeIndicesByNamesResult() {
        return describeIndicesByNamesResult;
    }

    /**
     * Sets the value of the describeIndicesByNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIndexDefinition }
     *     
     */
    public void setDescribeIndicesByNamesResult(ArrayOfServiceIndexDefinition value) {
        this.describeIndicesByNamesResult = value;
    }

}
