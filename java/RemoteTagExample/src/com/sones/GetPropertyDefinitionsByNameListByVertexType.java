
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
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
 *         &lt;element name="myPropertyNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "myPropertyNames"
})
@XmlRootElement(name = "GetPropertyDefinitionsByNameListByVertexType")
public class GetPropertyDefinitionsByNameListByVertexType {

    @XmlElement(nillable = true)
    protected SecurityToken mySecurityToken;
    protected Long myTransToken;
    @XmlElement(nillable = true)
    protected ServiceVertexType myServiceVertexType;
    @XmlElement(nillable = true)
    protected ArrayOfstring myPropertyNames;

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
     * Gets the value of the myPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getMyPropertyNames() {
        return myPropertyNames;
    }

    /**
     * Sets the value of the myPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setMyPropertyNames(ArrayOfstring value) {
        this.myPropertyNames = value;
    }

}
