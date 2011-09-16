
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
 *         &lt;element name="CreationDateByEdgeInstanceResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "creationDateByEdgeInstanceResult"
})
@XmlRootElement(name = "CreationDateByEdgeInstanceResponse")
public class CreationDateByEdgeInstanceResponse {

    @XmlElement(name = "CreationDateByEdgeInstanceResult")
    protected Long creationDateByEdgeInstanceResult;

    /**
     * Gets the value of the creationDateByEdgeInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreationDateByEdgeInstanceResult() {
        return creationDateByEdgeInstanceResult;
    }

    /**
     * Sets the value of the creationDateByEdgeInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreationDateByEdgeInstanceResult(Long value) {
        this.creationDateByEdgeInstanceResult = value;
    }

}
