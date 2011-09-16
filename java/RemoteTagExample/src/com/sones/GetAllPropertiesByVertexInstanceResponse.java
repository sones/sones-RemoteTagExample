
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflonganyType;


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
 *         &lt;element name="GetAllPropertiesByVertexInstanceResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOflonganyType" minOccurs="0"/>
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
    "getAllPropertiesByVertexInstanceResult"
})
@XmlRootElement(name = "GetAllPropertiesByVertexInstanceResponse")
public class GetAllPropertiesByVertexInstanceResponse {

    @XmlElement(name = "GetAllPropertiesByVertexInstanceResult", nillable = true)
    protected ArrayOfTupleOflonganyType getAllPropertiesByVertexInstanceResult;

    /**
     * Gets the value of the getAllPropertiesByVertexInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOflonganyType }
     *     
     */
    public ArrayOfTupleOflonganyType getGetAllPropertiesByVertexInstanceResult() {
        return getAllPropertiesByVertexInstanceResult;
    }

    /**
     * Sets the value of the getAllPropertiesByVertexInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOflonganyType }
     *     
     */
    public void setGetAllPropertiesByVertexInstanceResult(ArrayOfTupleOflonganyType value) {
        this.getAllPropertiesByVertexInstanceResult = value;
    }

}
