
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
 *         &lt;element name="myUserCredentials" type="{http://www.sones.com}ServiceUserPasswordCredentials" minOccurs="0"/>
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
    "myUserCredentials"
})
@XmlRootElement(name = "LogOn")
public class LogOn {

    @XmlElement(nillable = true)
    protected ServiceUserPasswordCredentials myUserCredentials;

    /**
     * Gets the value of the myUserCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceUserPasswordCredentials }
     *     
     */
    public ServiceUserPasswordCredentials getMyUserCredentials() {
        return myUserCredentials;
    }

    /**
     * Sets the value of the myUserCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceUserPasswordCredentials }
     *     
     */
    public void setMyUserCredentials(ServiceUserPasswordCredentials value) {
        this.myUserCredentials = value;
    }

}
