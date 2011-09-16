
package org.datacontract.schemas._2004._07.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sones.ArrayOfServiceVertexInstance;


/**
 * <p>Java class for TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="m_Item1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="m_Item2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="m_Item3" type="{http://www.sones.com}ArrayOfServiceVertexInstance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1", propOrder = {
    "mItem1",
    "mItem2",
    "mItem3"
})
public class TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 {

    @XmlElement(name = "m_Item1")
    protected long mItem1;
    @XmlElement(name = "m_Item2")
    protected long mItem2;
    @XmlElement(name = "m_Item3", required = true, nillable = true)
    protected ArrayOfServiceVertexInstance mItem3;

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
     */
    public long getMItem2() {
        return mItem2;
    }

    /**
     * Sets the value of the mItem2 property.
     * 
     */
    public void setMItem2(long value) {
        this.mItem2 = value;
    }

    /**
     * Gets the value of the mItem3 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceVertexInstance }
     *     
     */
    public ArrayOfServiceVertexInstance getMItem3() {
        return mItem3;
    }

    /**
     * Sets the value of the mItem3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceVertexInstance }
     *     
     */
    public void setMItem3(ArrayOfServiceVertexInstance value) {
        this.mItem3 = value;
    }

}
