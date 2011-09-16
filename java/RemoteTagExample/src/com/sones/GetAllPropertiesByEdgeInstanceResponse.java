
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
 *         &lt;element name="GetAllPropertiesByEdgeInstanceResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOflonganyType" minOccurs="0"/>
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
    "getAllPropertiesByEdgeInstanceResult"
})
@XmlRootElement(name = "GetAllPropertiesByEdgeInstanceResponse")
public class GetAllPropertiesByEdgeInstanceResponse {

    @XmlElement(name = "GetAllPropertiesByEdgeInstanceResult", nillable = true)
    protected ArrayOfTupleOflonganyType getAllPropertiesByEdgeInstanceResult;

    /**
     * Gets the value of the getAllPropertiesByEdgeInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOflonganyType }
     *     
     */
    public ArrayOfTupleOflonganyType getGetAllPropertiesByEdgeInstanceResult() {
        return getAllPropertiesByEdgeInstanceResult;
    }

    /**
     * Sets the value of the getAllPropertiesByEdgeInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOflonganyType }
     *     
     */
    public void setGetAllPropertiesByEdgeInstanceResult(ArrayOfTupleOflonganyType value) {
        this.getAllPropertiesByEdgeInstanceResult = value;
    }

}
