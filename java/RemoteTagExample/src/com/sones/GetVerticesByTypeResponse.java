
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
 *         &lt;element name="GetVerticesByTypeResult" type="{http://www.sones.com}ArrayOfServiceVertexInstance" minOccurs="0"/>
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
    "getVerticesByTypeResult"
})
@XmlRootElement(name = "GetVerticesByTypeResponse")
public class GetVerticesByTypeResponse {

    @XmlElement(name = "GetVerticesByTypeResult", nillable = true)
    protected ArrayOfServiceVertexInstance getVerticesByTypeResult;

    /**
     * Gets the value of the getVerticesByTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceVertexInstance }
     *     
     */
    public ArrayOfServiceVertexInstance getGetVerticesByTypeResult() {
        return getVerticesByTypeResult;
    }

    /**
     * Sets the value of the getVerticesByTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceVertexInstance }
     *     
     */
    public void setGetVerticesByTypeResult(ArrayOfServiceVertexInstance value) {
        this.getVerticesByTypeResult = value;
    }

}
