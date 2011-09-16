
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSingleLiteralExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSingleLiteralExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceBaseExpression">
 *       &lt;sequence>
 *         &lt;element name="Constant" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSingleLiteralExpression", propOrder = {
    "constant"
})
public class ServiceSingleLiteralExpression
    extends ServiceBaseExpression
{

    @XmlElement(name = "Constant", nillable = true)
    protected Object constant;

    /**
     * Gets the value of the constant property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConstant() {
        return constant;
    }

    /**
     * Sets the value of the constant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConstant(Object value) {
        this.constant = value;
    }

}
