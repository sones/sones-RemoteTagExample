
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
 *         &lt;element name="mySecToken" type="{http://schemas.datacontract.org/2004/07/sones.Library.Commons.Security}SecurityToken" minOccurs="0"/>
 *         &lt;element name="myTransactionToken" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="myQueryString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="myLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mySecToken",
    "myTransactionToken",
    "myQueryString",
    "myLanguage"
})
@XmlRootElement(name = "Query")
public class Query {

    @XmlElement(nillable = true)
    protected SecurityToken mySecToken;
    protected Long myTransactionToken;
    @XmlElement(nillable = true)
    protected String myQueryString;
    @XmlElement(nillable = true)
    protected String myLanguage;

    /**
     * Gets the value of the mySecToken property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityToken }
     *     
     */
    public SecurityToken getMySecToken() {
        return mySecToken;
    }

    /**
     * Sets the value of the mySecToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityToken }
     *     
     */
    public void setMySecToken(SecurityToken value) {
        this.mySecToken = value;
    }

    /**
     * Gets the value of the myTransactionToken property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyTransactionToken() {
        return myTransactionToken;
    }

    /**
     * Sets the value of the myTransactionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyTransactionToken(Long value) {
        this.myTransactionToken = value;
    }

    /**
     * Gets the value of the myQueryString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyQueryString() {
        return myQueryString;
    }

    /**
     * Sets the value of the myQueryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyQueryString(String value) {
        this.myQueryString = value;
    }

    /**
     * Gets the value of the myLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyLanguage() {
        return myLanguage;
    }

    /**
     * Sets the value of the myLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyLanguage(String value) {
        this.myLanguage = value;
    }

}
