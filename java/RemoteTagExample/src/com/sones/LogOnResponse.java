
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sones_library_commons.SecurityToken;


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
 *         &lt;element name="LogOnResult" type="{http://schemas.datacontract.org/2004/07/sones.Library.Commons.Security}SecurityToken" minOccurs="0"/>
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
    "logOnResult"
})
@XmlRootElement(name = "LogOnResponse")
public class LogOnResponse {

    @XmlElement(name = "LogOnResult", nillable = true)
    protected SecurityToken logOnResult;

    /**
     * Gets the value of the logOnResult property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityToken }
     *     
     */
    public SecurityToken getLogOnResult() {
        return logOnResult;
    }

    /**
     * Sets the value of the logOnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityToken }
     *     
     */
    public void setLogOnResult(SecurityToken value) {
        this.logOnResult = value;
    }

}
