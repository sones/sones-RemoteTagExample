
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
 *         &lt;element name="mySecToken" type="{http://www.sones.com}ServiceSecurityToken" minOccurs="0"/>
 *         &lt;element name="myTransToken" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="myVertex" type="{http://www.sones.com}ServiceVertexInstance" minOccurs="0"/>
 *         &lt;element name="myPropertyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "myTransToken",
    "myVertex",
    "myPropertyID"
})
@XmlRootElement(name = "HasPropertyByVertexInstance")
public class HasPropertyByVertexInstance {

    @XmlElement(nillable = true)
    protected ServiceSecurityToken mySecToken;
    protected Long myTransToken;
    @XmlElement(nillable = true)
    protected ServiceVertexInstance myVertex;
    protected Long myPropertyID;

    /**
     * Gets the value of the mySecToken property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSecurityToken }
     *     
     */
    public ServiceSecurityToken getMySecToken() {
        return mySecToken;
    }

    /**
     * Sets the value of the mySecToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSecurityToken }
     *     
     */
    public void setMySecToken(ServiceSecurityToken value) {
        this.mySecToken = value;
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
     * Gets the value of the myVertex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public ServiceVertexInstance getMyVertex() {
        return myVertex;
    }

    /**
     * Sets the value of the myVertex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public void setMyVertex(ServiceVertexInstance value) {
        this.myVertex = value;
    }

    /**
     * Gets the value of the myPropertyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMyPropertyID() {
        return myPropertyID;
    }

    /**
     * Sets the value of the myPropertyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMyPropertyID(Long value) {
        this.myPropertyID = value;
    }

}
