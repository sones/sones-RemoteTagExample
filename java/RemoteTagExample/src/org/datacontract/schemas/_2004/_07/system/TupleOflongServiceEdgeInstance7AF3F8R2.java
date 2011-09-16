
package org.datacontract.schemas._2004._07.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sones.ServiceEdgeInstance;


/**
 * <p>Java class for TupleOflongServiceEdgeInstance7AF3f8r2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TupleOflongServiceEdgeInstance7AF3f8r2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="m_Item1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="m_Item2" type="{http://www.sones.com}ServiceEdgeInstance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TupleOflongServiceEdgeInstance7AF3f8r2", propOrder = {
    "mItem1",
    "mItem2"
})
public class TupleOflongServiceEdgeInstance7AF3F8R2 {

    @XmlElement(name = "m_Item1")
    protected long mItem1;
    @XmlElement(name = "m_Item2", required = true, nillable = true)
    protected ServiceEdgeInstance mItem2;

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
     *     {@link ServiceEdgeInstance }
     *     
     */
    public ServiceEdgeInstance getMItem2() {
        return mItem2;
    }

    /**
     * Sets the value of the mItem2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEdgeInstance }
     *     
     */
    public void setMItem2(ServiceEdgeInstance value) {
        this.mItem2 = value;
    }

}
