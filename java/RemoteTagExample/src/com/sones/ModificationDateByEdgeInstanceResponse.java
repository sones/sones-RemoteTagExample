
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
 *         &lt;element name="ModificationDateByEdgeInstanceResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "modificationDateByEdgeInstanceResult"
})
@XmlRootElement(name = "ModificationDateByEdgeInstanceResponse")
public class ModificationDateByEdgeInstanceResponse {

    @XmlElement(name = "ModificationDateByEdgeInstanceResult")
    protected Long modificationDateByEdgeInstanceResult;

    /**
     * Gets the value of the modificationDateByEdgeInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModificationDateByEdgeInstanceResult() {
        return modificationDateByEdgeInstanceResult;
    }

    /**
     * Sets the value of the modificationDateByEdgeInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModificationDateByEdgeInstanceResult(Long value) {
        this.modificationDateByEdgeInstanceResult = value;
    }

}
