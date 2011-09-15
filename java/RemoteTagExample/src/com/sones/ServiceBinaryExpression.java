
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceBinaryExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBinaryExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceBaseExpression">
 *       &lt;sequence>
 *         &lt;element name="Left" type="{http://www.sones.com}ServiceBaseExpression" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.sones.com}ServiceBinaryOperator" minOccurs="0"/>
 *         &lt;element name="Right" type="{http://www.sones.com}ServiceBaseExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBinaryExpression", propOrder = {
    "left",
    "operator",
    "right"
})
public class ServiceBinaryExpression
    extends ServiceBaseExpression
{

    @XmlElement(name = "Left", nillable = true)
    protected ServiceBaseExpression left;
    @XmlElement(name = "Operator")
    protected ServiceBinaryOperator operator;
    @XmlElement(name = "Right", nillable = true)
    protected ServiceBaseExpression right;

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBaseExpression }
     *     
     */
    public ServiceBaseExpression getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBaseExpression }
     *     
     */
    public void setLeft(ServiceBaseExpression value) {
        this.left = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBinaryOperator }
     *     
     */
    public ServiceBinaryOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBinaryOperator }
     *     
     */
    public void setOperator(ServiceBinaryOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBaseExpression }
     *     
     */
    public ServiceBaseExpression getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBaseExpression }
     *     
     */
    public void setRight(ServiceBaseExpression value) {
        this.right = value;
    }

}
