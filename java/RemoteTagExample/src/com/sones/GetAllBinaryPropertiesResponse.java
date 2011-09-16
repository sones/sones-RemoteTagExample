
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflongStreampETKBXRm;


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
 *         &lt;element name="GetAllBinaryPropertiesResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOflongStreampETKBXRm" minOccurs="0"/>
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
    "getAllBinaryPropertiesResult"
})
@XmlRootElement(name = "GetAllBinaryPropertiesResponse")
public class GetAllBinaryPropertiesResponse {

    @XmlElement(name = "GetAllBinaryPropertiesResult", nillable = true)
    protected ArrayOfTupleOflongStreampETKBXRm getAllBinaryPropertiesResult;

    /**
     * Gets the value of the getAllBinaryPropertiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOflongStreampETKBXRm }
     *     
     */
    public ArrayOfTupleOflongStreampETKBXRm getGetAllBinaryPropertiesResult() {
        return getAllBinaryPropertiesResult;
    }

    /**
     * Sets the value of the getAllBinaryPropertiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOflongStreampETKBXRm }
     *     
     */
    public void setGetAllBinaryPropertiesResult(ArrayOfTupleOflongStreampETKBXRm value) {
        this.getAllBinaryPropertiesResult = value;
    }

}
