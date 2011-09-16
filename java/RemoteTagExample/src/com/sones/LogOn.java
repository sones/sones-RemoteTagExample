
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
 *         &lt;element name="myLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="myPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "myLogin",
    "myPassword"
})
@XmlRootElement(name = "LogOn")
public class LogOn {

    @XmlElement(nillable = true)
    protected String myLogin;
    @XmlElement(nillable = true)
    protected String myPassword;

    /**
     * Gets the value of the myLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyLogin() {
        return myLogin;
    }

    /**
     * Sets the value of the myLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyLogin(String value) {
        this.myLogin = value;
    }

    /**
     * Gets the value of the myPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyPassword() {
        return myPassword;
    }

    /**
     * Sets the value of the myPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyPassword(String value) {
        this.myPassword = value;
    }

}
