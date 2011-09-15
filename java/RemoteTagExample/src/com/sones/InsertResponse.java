
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
 *         &lt;element name="InsertResult" type="{http://www.sones.com}ServiceVertexInstance" minOccurs="0"/>
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
    "insertResult"
})
@XmlRootElement(name = "InsertResponse")
public class InsertResponse {

    @XmlElement(name = "InsertResult", nillable = true)
    protected ServiceVertexInstance insertResult;

    /**
     * Gets the value of the insertResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public ServiceVertexInstance getInsertResult() {
        return insertResult;
    }

    /**
     * Sets the value of the insertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public void setInsertResult(ServiceVertexInstance value) {
        this.insertResult = value;
    }

}
