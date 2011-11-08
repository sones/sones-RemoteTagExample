
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.TupleOfArrayOfanyTypeArrayOfanyType0DMmj3Sh;


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
 *         &lt;element name="DeleteResult" type="{http://schemas.datacontract.org/2004/07/System}TupleOfArrayOfanyTypeArrayOfanyType0dMmj3_Sh" minOccurs="0"/>
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
    "deleteResult"
})
@XmlRootElement(name = "DeleteResponse")
public class DeleteResponse {

    @XmlElement(name = "DeleteResult", nillable = true)
    protected TupleOfArrayOfanyTypeArrayOfanyType0DMmj3Sh deleteResult;

    /**
     * Gets the value of the deleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link TupleOfArrayOfanyTypeArrayOfanyType0DMmj3Sh }
     *     
     */
    public TupleOfArrayOfanyTypeArrayOfanyType0DMmj3Sh getDeleteResult() {
        return deleteResult;
    }

    /**
     * Sets the value of the deleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TupleOfArrayOfanyTypeArrayOfanyType0DMmj3Sh }
     *     
     */
    public void setDeleteResult(TupleOfArrayOfanyTypeArrayOfanyType0DMmj3Sh value) {
        this.deleteResult = value;
    }

}
