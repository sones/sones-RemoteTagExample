
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicePropertyExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePropertyExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceBaseExpression">
 *       &lt;sequence>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameOfProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameOfVertexType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePropertyExpression", propOrder = {
    "edition",
    "nameOfProperty",
    "nameOfVertexType"
})
public class ServicePropertyExpression
    extends ServiceBaseExpression
{

    @XmlElement(name = "Edition", nillable = true)
    protected String edition;
    @XmlElement(name = "NameOfProperty", nillable = true)
    protected String nameOfProperty;
    @XmlElement(name = "NameOfVertexType", nillable = true)
    protected String nameOfVertexType;

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
     * Gets the value of the nameOfProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfProperty() {
        return nameOfProperty;
    }

    /**
     * Sets the value of the nameOfProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfProperty(String value) {
        this.nameOfProperty = value;
    }

    /**
     * Gets the value of the nameOfVertexType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfVertexType() {
        return nameOfVertexType;
    }

    /**
     * Sets the value of the nameOfVertexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfVertexType(String value) {
        this.nameOfVertexType = value;
    }

}
