
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
 *         &lt;element name="mySecurityToken" type="{http://www.sones.com}ServiceSecurityToken" minOccurs="0"/>
 *         &lt;element name="myTransToken" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="myServiceEdgeType" type="{http://www.sones.com}ServiceEdgeType" minOccurs="0"/>
 *         &lt;element name="myPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mySecurityToken",
    "myTransToken",
    "myServiceEdgeType",
    "myPropertyName"
})
@XmlRootElement(name = "GetPropertyDefinitionByEdgeType")
public class GetPropertyDefinitionByEdgeType {

    @XmlElement(nillable = true)
    protected ServiceSecurityToken mySecurityToken;
    protected Long myTransToken;
    @XmlElement(nillable = true)
    protected ServiceEdgeType myServiceEdgeType;
    @XmlElement(nillable = true)
    protected String myPropertyName;

    /**
     * Gets the value of the mySecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSecurityToken }
     *     
     */
    public ServiceSecurityToken getMySecurityToken() {
        return mySecurityToken;
    }

    /**
     * Sets the value of the mySecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSecurityToken }
     *     
     */
    public void setMySecurityToken(ServiceSecurityToken value) {
        this.mySecurityToken = value;
    }

    /**
     * Gets the value of the myTransToken property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyTransToken() {
        return myTransToken;
    }

    /**
     * Sets the value of the myTransToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyTransToken(Long value) {
        this.myTransToken = value;
    }

    /**
     * Gets the value of the myServiceEdgeType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEdgeType }
     *     
     */
    public ServiceEdgeType getMyServiceEdgeType() {
        return myServiceEdgeType;
    }

    /**
     * Sets the value of the myServiceEdgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEdgeType }
     *     
     */
    public void setMyServiceEdgeType(ServiceEdgeType value) {
        this.myServiceEdgeType = value;
    }

    /**
     * Gets the value of the myPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyPropertyName() {
        return myPropertyName;
    }

    /**
     * Sets the value of the myPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyPropertyName(String value) {
        this.myPropertyName = value;
    }

}