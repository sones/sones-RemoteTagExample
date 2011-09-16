
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
 *         &lt;element name="GetIncomingVerticesResult" type="{http://www.sones.com}ArrayOfServiceVertexInstance" minOccurs="0"/>
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
    "getIncomingVerticesResult"
})
@XmlRootElement(name = "GetIncomingVerticesResponse")
public class GetIncomingVerticesResponse {

    @XmlElement(name = "GetIncomingVerticesResult", nillable = true)
    protected ArrayOfServiceVertexInstance getIncomingVerticesResult;

    /**
     * Gets the value of the getIncomingVerticesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceVertexInstance }
     *     
     */
    public ArrayOfServiceVertexInstance getGetIncomingVerticesResult() {
        return getIncomingVerticesResult;
    }

    /**
     * Sets the value of the getIncomingVerticesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceVertexInstance }
     *     
     */
    public void setGetIncomingVerticesResult(ArrayOfServiceVertexInstance value) {
        this.getIncomingVerticesResult = value;
    }

}
