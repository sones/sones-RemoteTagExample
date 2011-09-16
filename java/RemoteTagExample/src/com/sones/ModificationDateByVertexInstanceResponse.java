
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
 *         &lt;element name="ModificationDateByVertexInstanceResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "modificationDateByVertexInstanceResult"
})
@XmlRootElement(name = "ModificationDateByVertexInstanceResponse")
public class ModificationDateByVertexInstanceResponse {

    @XmlElement(name = "ModificationDateByVertexInstanceResult")
    protected Long modificationDateByVertexInstanceResult;

    /**
     * Gets the value of the modificationDateByVertexInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModificationDateByVertexInstanceResult() {
        return modificationDateByVertexInstanceResult;
    }

    /**
     * Sets the value of the modificationDateByVertexInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModificationDateByVertexInstanceResult(Long value) {
        this.modificationDateByVertexInstanceResult = value;
    }

}
