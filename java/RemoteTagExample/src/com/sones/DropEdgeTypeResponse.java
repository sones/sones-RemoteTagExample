
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongstring;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DropEdgeTypeResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dropEdgeTypeResult"
})
@XmlRootElement(name = "DropEdgeTypeResponse")
public class DropEdgeTypeResponse {

    @XmlElement(name = "DropEdgeTypeResult", nillable = true)
    protected ArrayOfKeyValueOflongstring dropEdgeTypeResult;

    /**
     * Gets the value of the dropEdgeTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOflongstring }
     *     
     */
    public ArrayOfKeyValueOflongstring getDropEdgeTypeResult() {
        return dropEdgeTypeResult;
    }

    /**
     * Sets the value of the dropEdgeTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOflongstring }
     *     
     */
    public void setDropEdgeTypeResult(ArrayOfKeyValueOflongstring value) {
        this.dropEdgeTypeResult = value;
    }

}
