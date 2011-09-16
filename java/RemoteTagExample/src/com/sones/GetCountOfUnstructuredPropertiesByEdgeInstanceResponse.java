
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
 *         &lt;element name="GetCountOfUnstructuredPropertiesByEdgeInstanceResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "getCountOfUnstructuredPropertiesByEdgeInstanceResult"
})
@XmlRootElement(name = "GetCountOfUnstructuredPropertiesByEdgeInstanceResponse")
public class GetCountOfUnstructuredPropertiesByEdgeInstanceResponse {

    @XmlElement(name = "GetCountOfUnstructuredPropertiesByEdgeInstanceResult")
    protected Integer getCountOfUnstructuredPropertiesByEdgeInstanceResult;

    /**
     * Gets the value of the getCountOfUnstructuredPropertiesByEdgeInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetCountOfUnstructuredPropertiesByEdgeInstanceResult() {
        return getCountOfUnstructuredPropertiesByEdgeInstanceResult;
    }

    /**
     * Sets the value of the getCountOfUnstructuredPropertiesByEdgeInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetCountOfUnstructuredPropertiesByEdgeInstanceResult(Integer value) {
        this.getCountOfUnstructuredPropertiesByEdgeInstanceResult = value;
    }

}
