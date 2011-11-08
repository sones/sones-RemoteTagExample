
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
 *         &lt;element name="PartitionIDResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "partitionIDResult"
})
@XmlRootElement(name = "PartitionIDResponse")
public class PartitionIDResponse {

    @XmlElement(name = "PartitionIDResult")
    protected Long partitionIDResult;

    /**
     * Gets the value of the partitionIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartitionIDResult() {
        return partitionIDResult;
    }

    /**
     * Sets the value of the partitionIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartitionIDResult(Long value) {
        this.partitionIDResult = value;
    }

}
