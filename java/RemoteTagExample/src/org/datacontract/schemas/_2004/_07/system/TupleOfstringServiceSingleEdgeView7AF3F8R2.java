
package org.datacontract.schemas._2004._07.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sones.ServiceSingleEdgeView;


/**
 * <p>Java class for TupleOfstringServiceSingleEdgeView7AF3f8r2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TupleOfstringServiceSingleEdgeView7AF3f8r2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="m_Item1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="m_Item2" type="{http://www.sones.com}ServiceSingleEdgeView"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TupleOfstringServiceSingleEdgeView7AF3f8r2", propOrder = {
    "mItem1",
    "mItem2"
})
public class TupleOfstringServiceSingleEdgeView7AF3F8R2 {

    @XmlElement(name = "m_Item1", required = true, nillable = true)
    protected String mItem1;
    @XmlElement(name = "m_Item2", required = true, nillable = true)
    protected ServiceSingleEdgeView mItem2;

    /**
     * Gets the value of the mItem1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMItem1() {
        return mItem1;
    }

    /**
     * Sets the value of the mItem1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMItem1(String value) {
        this.mItem1 = value;
    }

    /**
     * Gets the value of the mItem2 property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSingleEdgeView }
     *     
     */
    public ServiceSingleEdgeView getMItem2() {
        return mItem2;
    }

    /**
     * Sets the value of the mItem2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSingleEdgeView }
     *     
     */
    public void setMItem2(ServiceSingleEdgeView value) {
        this.mItem2 = value;
    }

}
