
package org.datacontract.schemas._2004._07.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;


/**
 * <p>Java class for TupleOfArrayOfanyTypeArrayOfanyType0dMmj3_Sh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TupleOfArrayOfanyTypeArrayOfanyType0dMmj3_Sh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="m_Item1" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType"/>
 *         &lt;element name="m_Item2" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TupleOfArrayOfanyTypeArrayOfanyType0dMmj3_Sh", propOrder = {
    "mItem1",
    "mItem2"
})
public class TupleOfArrayOfanyTypeArrayOfanyType0DMmj3Sh {

    @XmlElement(name = "m_Item1", required = true, nillable = true)
    protected ArrayOfanyType mItem1;
    @XmlElement(name = "m_Item2", required = true, nillable = true)
    protected ArrayOfanyType mItem2;

    /**
     * Gets the value of the mItem1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfanyType }
     *     
     */
    public ArrayOfanyType getMItem1() {
        return mItem1;
    }

    /**
     * Sets the value of the mItem1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfanyType }
     *     
     */
    public void setMItem1(ArrayOfanyType value) {
        this.mItem1 = value;
    }

    /**
     * Gets the value of the mItem2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfanyType }
     *     
     */
    public ArrayOfanyType getMItem2() {
        return mItem2;
    }

    /**
     * Sets the value of the mItem2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfanyType }
     *     
     */
    public void setMItem2(ArrayOfanyType value) {
        this.mItem2 = value;
    }

}
