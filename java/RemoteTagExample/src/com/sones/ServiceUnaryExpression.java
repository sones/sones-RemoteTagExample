
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceUnaryExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceUnaryExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceBaseExpression">
 *       &lt;sequence>
 *         &lt;element name="Expression" type="{http://www.sones.com}ServiceBaseExpression" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.sones.com}ServiceUnaryLogicOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceUnaryExpression", propOrder = {
    "expression",
    "operator"
})
public class ServiceUnaryExpression
    extends ServiceBaseExpression
{

    @XmlElement(name = "Expression", nillable = true)
    protected ServiceBaseExpression expression;
    @XmlElement(name = "Operator")
    protected ServiceUnaryLogicOperator operator;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBaseExpression }
     *     
     */
    public ServiceBaseExpression getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBaseExpression }
     *     
     */
    public void setExpression(ServiceBaseExpression value) {
        this.expression = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceUnaryLogicOperator }
     *     
     */
    public ServiceUnaryLogicOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceUnaryLogicOperator }
     *     
     */
    public void setOperator(ServiceUnaryLogicOperator value) {
        this.operator = value;
    }

}
