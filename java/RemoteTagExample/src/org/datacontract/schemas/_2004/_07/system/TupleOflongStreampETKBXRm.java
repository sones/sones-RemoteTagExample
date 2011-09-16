
package org.datacontract.schemas._2004._07.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TupleOflongStreampETKBXRm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TupleOflongStreampETKBXRm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="m_Item1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="m_Item2" type="{http://schemas.datacontract.org/2004/07/System.IO}Stream"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TupleOflongStreampETKBXRm", propOrder = {
    "mItem1",
    "mItem2"
})
public class TupleOflongStreampETKBXRm {

    @XmlElement(name = "m_Item1")
    protected long mItem1;
    @XmlElement(name = "m_Item2", required = true, nillable = true)
    protected Stream mItem2;

    /**
     * Gets the value of the mItem1 property.
     * 
     */
    public long getMItem1() {
        return mItem1;
    }

    /**
     * Sets the value of the mItem1 property.
     * 
     */
    public void setMItem1(long value) {
        this.mItem1 = value;
    }

    /**
     * Gets the value of the mItem2 property.
     * 
     * @return
     *     possible object is
     *     {@link Stream }
     *     
     */
    public Stream getMItem2() {
        return mItem2;
    }

    /**
     * Sets the value of the mItem2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stream }
     *     
     */
    public void setMItem2(Stream value) {
        this.mItem2 = value;
    }

}
