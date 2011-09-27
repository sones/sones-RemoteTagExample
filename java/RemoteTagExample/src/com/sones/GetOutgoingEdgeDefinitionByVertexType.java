
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
 *         &lt;element name="myServiceVertexType" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
 *         &lt;element name="myEdgeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "myServiceVertexType",
    "myEdgeName"
})
@XmlRootElement(name = "GetOutgoingEdgeDefinitionByVertexType")
public class GetOutgoingEdgeDefinitionByVertexType {

    @XmlElement(nillable = true)
    protected SecurityToken mySecurityToken;
    protected Long myTransToken;
    @XmlElement(nillable = true)
    protected ServiceVertexType myServiceVertexType;
    @XmlElement(nillable = true)
    protected String myEdgeName;

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
     * Gets the value of the myServiceVertexType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getMyServiceVertexType() {
        return myServiceVertexType;
    }

    /**
     * Sets the value of the myServiceVertexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setMyServiceVertexType(ServiceVertexType value) {
        this.myServiceVertexType = value;
    }

    /**
     * Gets the value of the myEdgeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyEdgeName() {
        return myEdgeName;
    }

    /**
     * Sets the value of the myEdgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyEdgeName(String value) {
        this.myEdgeName = value;
    }

}
