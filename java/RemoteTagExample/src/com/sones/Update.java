
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
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
 *         &lt;element name="myVertexType" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
 *         &lt;element name="myVertexIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="myUpdateChangeset" type="{http://www.sones.com}ServiceUpdateChangeset" minOccurs="0"/>
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
    "myVertexType",
    "myVertexIDs",
    "myUpdateChangeset"
})
@XmlRootElement(name = "Update")
public class Update {

    @XmlElement(nillable = true)
    protected SecurityToken mySecurityToken;
    protected Long myTransToken;
    @XmlElement(nillable = true)
    protected ServiceVertexType myVertexType;
    @XmlElement(nillable = true)
    protected ArrayOflong myVertexIDs;
    @XmlElement(nillable = true)
    protected ServiceUpdateChangeset myUpdateChangeset;

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
     * Gets the value of the myVertexType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getMyVertexType() {
        return myVertexType;
    }

    /**
     * Sets the value of the myVertexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setMyVertexType(ServiceVertexType value) {
        this.myVertexType = value;
    }

    /**
     * Gets the value of the myVertexIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getMyVertexIDs() {
        return myVertexIDs;
    }

    /**
     * Sets the value of the myVertexIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setMyVertexIDs(ArrayOflong value) {
        this.myVertexIDs = value;
    }

    /**
     * Gets the value of the myUpdateChangeset property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceUpdateChangeset }
     *     
     */
    public ServiceUpdateChangeset getMyUpdateChangeset() {
        return myUpdateChangeset;
    }

    /**
     * Sets the value of the myUpdateChangeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceUpdateChangeset }
     *     
     */
    public void setMyUpdateChangeset(ServiceUpdateChangeset value) {
        this.myUpdateChangeset = value;
    }

}
