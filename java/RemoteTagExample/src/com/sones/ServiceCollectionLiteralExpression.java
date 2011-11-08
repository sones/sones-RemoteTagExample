
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;


/**
 * <p>Java class for ServiceCollectionLiteralExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCollectionLiteralExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceBaseExpression">
 *       &lt;sequence>
 *         &lt;element name="CollectionLiteral" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCollectionLiteralExpression", propOrder = {
    "collectionLiteral"
})
public class ServiceCollectionLiteralExpression
    extends ServiceBaseExpression
{

    @XmlElement(name = "CollectionLiteral", nillable = true)
    protected ArrayOfanyType collectionLiteral;

    /**
     * Gets the value of the collectionLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfanyType }
     *     
     */
    public ArrayOfanyType getCollectionLiteral() {
        return collectionLiteral;
    }

    /**
     * Sets the value of the collectionLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfanyType }
     *     
     */
    public void setCollectionLiteral(ArrayOfanyType value) {
        this.collectionLiteral = value;
    }

}
