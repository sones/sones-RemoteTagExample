
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflongServiceHyperEdgeInstance7AF3F8R2;


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
 *         &lt;element name="GetAllOutgoingHyperEdgesResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOflongServiceHyperEdgeInstance7AF3f8r2" minOccurs="0"/>
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
    "getAllOutgoingHyperEdgesResult"
})
@XmlRootElement(name = "GetAllOutgoingHyperEdgesResponse")
public class GetAllOutgoingHyperEdgesResponse {

    @XmlElement(name = "GetAllOutgoingHyperEdgesResult", nillable = true)
    protected ArrayOfTupleOflongServiceHyperEdgeInstance7AF3F8R2 getAllOutgoingHyperEdgesResult;

    /**
     * Gets the value of the getAllOutgoingHyperEdgesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOflongServiceHyperEdgeInstance7AF3F8R2 }
     *     
     */
    public ArrayOfTupleOflongServiceHyperEdgeInstance7AF3F8R2 getGetAllOutgoingHyperEdgesResult() {
        return getAllOutgoingHyperEdgesResult;
    }

    /**
     * Sets the value of the getAllOutgoingHyperEdgesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOflongServiceHyperEdgeInstance7AF3F8R2 }
     *     
     */
    public void setGetAllOutgoingHyperEdgesResult(ArrayOfTupleOflongServiceHyperEdgeInstance7AF3F8R2 value) {
        this.getAllOutgoingHyperEdgesResult = value;
    }

}
