
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOfstringanyType;


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
 *         &lt;element name="GetAllUnstructuredPropertiesByVertexInstanceResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOfstringanyType" minOccurs="0"/>
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
    "getAllUnstructuredPropertiesByVertexInstanceResult"
})
@XmlRootElement(name = "GetAllUnstructuredPropertiesByVertexInstanceResponse")
public class GetAllUnstructuredPropertiesByVertexInstanceResponse {

    @XmlElement(name = "GetAllUnstructuredPropertiesByVertexInstanceResult", nillable = true)
    protected ArrayOfTupleOfstringanyType getAllUnstructuredPropertiesByVertexInstanceResult;

    /**
     * Gets the value of the getAllUnstructuredPropertiesByVertexInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOfstringanyType }
     *     
     */
    public ArrayOfTupleOfstringanyType getGetAllUnstructuredPropertiesByVertexInstanceResult() {
        return getAllUnstructuredPropertiesByVertexInstanceResult;
    }

    /**
     * Sets the value of the getAllUnstructuredPropertiesByVertexInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOfstringanyType }
     *     
     */
    public void setGetAllUnstructuredPropertiesByVertexInstanceResult(ArrayOfTupleOfstringanyType value) {
        this.getAllUnstructuredPropertiesByVertexInstanceResult = value;
    }

}
