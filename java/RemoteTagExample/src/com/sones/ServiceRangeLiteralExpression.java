
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRangeLiteralExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRangeLiteralExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceBaseExpression">
 *       &lt;sequence>
 *         &lt;element name="IncludeBorders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Lower" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Upper" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRangeLiteralExpression", propOrder = {
    "includeBorders",
    "lower",
    "upper"
})
public class ServiceRangeLiteralExpression
    extends ServiceBaseExpression
{

    @XmlElement(name = "IncludeBorders")
    protected Boolean includeBorders;
    @XmlElement(name = "Lower", nillable = true)
    protected Object lower;
    @XmlElement(name = "Upper", nillable = true)
    protected Object upper;

    /**
     * Gets the value of the includeBorders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBorders() {
        return includeBorders;
    }

    /**
     * Sets the value of the includeBorders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBorders(Boolean value) {
        this.includeBorders = value;
    }

    /**
     * Gets the value of the lower property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLower(Object value) {
        this.lower = value;
    }

    /**
     * Gets the value of the upper property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUpper(Object value) {
        this.upper = value;
    }

}
