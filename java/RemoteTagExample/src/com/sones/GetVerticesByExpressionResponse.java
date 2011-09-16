
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
 *         &lt;element name="GetVerticesByExpressionResult" type="{http://www.sones.com}ArrayOfServiceVertexInstance" minOccurs="0"/>
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
    "getVerticesByExpressionResult"
})
@XmlRootElement(name = "GetVerticesByExpressionResponse")
public class GetVerticesByExpressionResponse {

    @XmlElement(name = "GetVerticesByExpressionResult", nillable = true)
    protected ArrayOfServiceVertexInstance getVerticesByExpressionResult;

    /**
     * Gets the value of the getVerticesByExpressionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceVertexInstance }
     *     
     */
    public ArrayOfServiceVertexInstance getGetVerticesByExpressionResult() {
        return getVerticesByExpressionResult;
    }

    /**
     * Sets the value of the getVerticesByExpressionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceVertexInstance }
     *     
     */
    public void setGetVerticesByExpressionResult(ArrayOfServiceVertexInstance value) {
        this.getVerticesByExpressionResult = value;
    }

}
