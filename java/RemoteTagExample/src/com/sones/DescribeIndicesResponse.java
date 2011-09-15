
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
 *         &lt;element name="DescribeIndicesResult" type="{http://www.sones.com}ArrayOfServiceIndexDefinition" minOccurs="0"/>
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
    "describeIndicesResult"
})
@XmlRootElement(name = "DescribeIndicesResponse")
public class DescribeIndicesResponse {

    @XmlElement(name = "DescribeIndicesResult", nillable = true)
    protected ArrayOfServiceIndexDefinition describeIndicesResult;

    /**
     * Gets the value of the describeIndicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIndexDefinition }
     *     
     */
    public ArrayOfServiceIndexDefinition getDescribeIndicesResult() {
        return describeIndicesResult;
    }

    /**
     * Sets the value of the describeIndicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIndexDefinition }
     *     
     */
    public void setDescribeIndicesResult(ArrayOfServiceIndexDefinition value) {
        this.describeIndicesResult = value;
    }

}
