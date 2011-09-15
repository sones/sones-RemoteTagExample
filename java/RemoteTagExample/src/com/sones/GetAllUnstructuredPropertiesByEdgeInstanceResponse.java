
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
 *         &lt;element name="GetAllUnstructuredPropertiesByEdgeInstanceResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOfstringanyType" minOccurs="0"/>
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
    "getAllUnstructuredPropertiesByEdgeInstanceResult"
})
@XmlRootElement(name = "GetAllUnstructuredPropertiesByEdgeInstanceResponse")
public class GetAllUnstructuredPropertiesByEdgeInstanceResponse {

    @XmlElement(name = "GetAllUnstructuredPropertiesByEdgeInstanceResult", nillable = true)
    protected ArrayOfTupleOfstringanyType getAllUnstructuredPropertiesByEdgeInstanceResult;

    /**
     * Gets the value of the getAllUnstructuredPropertiesByEdgeInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOfstringanyType }
     *     
     */
    public ArrayOfTupleOfstringanyType getGetAllUnstructuredPropertiesByEdgeInstanceResult() {
        return getAllUnstructuredPropertiesByEdgeInstanceResult;
    }

    /**
     * Sets the value of the getAllUnstructuredPropertiesByEdgeInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOfstringanyType }
     *     
     */
    public void setGetAllUnstructuredPropertiesByEdgeInstanceResult(ArrayOfTupleOfstringanyType value) {
        this.getAllUnstructuredPropertiesByEdgeInstanceResult = value;
    }

}
