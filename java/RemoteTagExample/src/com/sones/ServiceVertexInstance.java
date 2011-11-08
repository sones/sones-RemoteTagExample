
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceVertexInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceVertexInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}AGraphElement">
 *       &lt;sequence>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VertexID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VertexRevisionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceVertexInstance", propOrder = {
    "edition",
    "vertexID",
    "vertexRevisionID"
})
public class ServiceVertexInstance
    extends AGraphElement
{

    @XmlElement(name = "Edition", nillable = true)
    protected String edition;
    @XmlElement(name = "VertexID")
    protected Long vertexID;
    @XmlElement(name = "VertexRevisionID")
    protected Long vertexRevisionID;

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
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

}
