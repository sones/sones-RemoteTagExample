
package com.sones;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceVertexStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceVertexStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InDegree" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="OutDegree" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="Visits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceVertexStatistics", propOrder = {
    "inDegree",
    "outDegree",
    "visits"
})
public class ServiceVertexStatistics {

    @XmlElement(name = "InDegree")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger inDegree;
    @XmlElement(name = "OutDegree")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger outDegree;
    @XmlElement(name = "Visits")
    protected Long visits;

    /**
     * Gets the value of the inDegree property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInDegree() {
        return inDegree;
    }

    /**
     * Sets the value of the inDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInDegree(BigInteger value) {
        this.inDegree = value;
    }

    /**
     * Gets the value of the outDegree property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutDegree() {
        return outDegree;
    }

    /**
     * Sets the value of the outDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutDegree(BigInteger value) {
        this.outDegree = value;
    }

    /**
     * Gets the value of the visits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisits() {
        return visits;
    }

    /**
     * Sets the value of the visits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisits(Long value) {
        this.visits = value;
    }

}
