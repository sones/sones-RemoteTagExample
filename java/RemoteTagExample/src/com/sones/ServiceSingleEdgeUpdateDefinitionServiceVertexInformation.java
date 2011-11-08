
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSingleEdgeUpdateDefinition.ServiceVertexInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSingleEdgeUpdateDefinition.ServiceVertexInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VertexEditionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VertexID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VertexRevisionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VertexTypeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSingleEdgeUpdateDefinition.ServiceVertexInformation", propOrder = {
    "vertexEditionName",
    "vertexID",
    "vertexRevisionID",
    "vertexTypeID"
})
public class ServiceSingleEdgeUpdateDefinitionServiceVertexInformation {

    @XmlElement(name = "VertexEditionName", nillable = true)
    protected String vertexEditionName;
    @XmlElement(name = "VertexID")
    protected Long vertexID;
    @XmlElement(name = "VertexRevisionID")
    protected Long vertexRevisionID;
    @XmlElement(name = "VertexTypeID")
    protected Long vertexTypeID;

    /**
     * Gets the value of the vertexEditionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertexEditionName() {
        return vertexEditionName;
    }

    /**
     * Sets the value of the vertexEditionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertexEditionName(String value) {
        this.vertexEditionName = value;
    }

    /**
     * Gets the value of the vertexID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVertexID() {
        return vertexID;
    }

    /**
     * Sets the value of the vertexID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVertexID(Long value) {
        this.vertexID = value;
    }

    /**
     * Gets the value of the vertexRevisionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVertexRevisionID() {
        return vertexRevisionID;
    }

    /**
     * Sets the value of the vertexRevisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVertexRevisionID(Long value) {
        this.vertexRevisionID = value;
    }

    /**
     * Gets the value of the vertexTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVertexTypeID() {
        return vertexTypeID;
    }

    /**
     * Sets the value of the vertexTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVertexTypeID(Long value) {
        this.vertexTypeID = value;
    }

}
