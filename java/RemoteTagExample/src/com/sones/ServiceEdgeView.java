
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOfstringanyType;


/**
 * <p>Java class for ServiceEdgeView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEdgeView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PropertyList" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOfstringanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEdgeView", propOrder = {
    "propertyList"
})
@XmlSeeAlso({
    ServiceSingleEdgeView.class,
    ServiceHyperEdgeView.class
})
public class ServiceEdgeView {

    @XmlElement(name = "PropertyList", nillable = true)
    protected ArrayOfTupleOfstringanyType propertyList;

    /**
     * Gets the value of the propertyList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOfstringanyType }
     *     
     */
    public ArrayOfTupleOfstringanyType getPropertyList() {
        return propertyList;
    }

    /**
     * Sets the value of the propertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOfstringanyType }
     *     
     */
    public void setPropertyList(ArrayOfTupleOfstringanyType value) {
        this.propertyList = value;
    }

}
