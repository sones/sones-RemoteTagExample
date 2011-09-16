
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflongServiceEdgeInstance7AF3F8R2;


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
 *         &lt;element name="GetAllOutgoingEdgesResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOflongServiceEdgeInstance7AF3f8r2" minOccurs="0"/>
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
    "getAllOutgoingEdgesResult"
})
@XmlRootElement(name = "GetAllOutgoingEdgesResponse")
public class GetAllOutgoingEdgesResponse {

    @XmlElement(name = "GetAllOutgoingEdgesResult", nillable = true)
    protected ArrayOfTupleOflongServiceEdgeInstance7AF3F8R2 getAllOutgoingEdgesResult;

    /**
     * Gets the value of the getAllOutgoingEdgesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOflongServiceEdgeInstance7AF3F8R2 }
     *     
     */
    public ArrayOfTupleOflongServiceEdgeInstance7AF3F8R2 getGetAllOutgoingEdgesResult() {
        return getAllOutgoingEdgesResult;
    }

    /**
     * Sets the value of the getAllOutgoingEdgesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOflongServiceEdgeInstance7AF3F8R2 }
     *     
     */
    public void setGetAllOutgoingEdgesResult(ArrayOfTupleOflongServiceEdgeInstance7AF3F8R2 value) {
        this.getAllOutgoingEdgesResult = value;
    }

}
