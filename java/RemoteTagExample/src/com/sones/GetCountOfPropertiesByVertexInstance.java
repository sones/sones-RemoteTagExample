
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
 *         &lt;element name="mySecurityToken" type="{http://schemas.datacontract.org/2004/07/sones.Library.Commons.Security}SecurityToken" minOccurs="0"/>
 *         &lt;element name="myTransToken" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="myGraphElement" type="{http://www.sones.com}ServiceVertexInstance" minOccurs="0"/>
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
    "myGraphElement"
})
@XmlRootElement(name = "GetCountOfPropertiesByVertexInstance")
public class GetCountOfPropertiesByVertexInstance {

    @XmlElement(nillable = true)
    protected SecurityToken mySecurityToken;
    protected Long myTransToken;
    @XmlElement(nillable = true)
    protected ServiceVertexInstance myGraphElement;

    /**
     * Gets the value of the mySecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityToken }
     *     
     */
    public SecurityToken getMySecurityToken() {
        return mySecurityToken;
    }

    /**
     * Sets the value of the mySecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityToken }
     *     
     */
    public void setMySecurityToken(SecurityToken value) {
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
     * Gets the value of the myGraphElement property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public ServiceVertexInstance getMyGraphElement() {
        return myGraphElement;
    }

    /**
     * Sets the value of the myGraphElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public void setMyGraphElement(ServiceVertexInstance value) {
        this.myGraphElement = value;
    }

}
