
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
 *         &lt;element name="VertexStatisticsResult" type="{http://www.sones.com}ServiceVertexStatistics" minOccurs="0"/>
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
    "vertexStatisticsResult"
})
@XmlRootElement(name = "VertexStatisticsResponse")
public class VertexStatisticsResponse {

    @XmlElement(name = "VertexStatisticsResult", nillable = true)
    protected ServiceVertexStatistics vertexStatisticsResult;

    /**
     * Gets the value of the vertexStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexStatistics }
     *     
     */
    public ServiceVertexStatistics getVertexStatisticsResult() {
        return vertexStatisticsResult;
    }

    /**
     * Sets the value of the vertexStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexStatistics }
     *     
     */
    public void setVertexStatisticsResult(ServiceVertexStatistics value) {
        this.vertexStatisticsResult = value;
    }

}
