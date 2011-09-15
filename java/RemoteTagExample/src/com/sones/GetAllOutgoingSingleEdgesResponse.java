
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflongServiceSingleEdgeInstance7AF3F8R2;


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
 *         &lt;element name="GetAllOutgoingSingleEdgesResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOflongServiceSingleEdgeInstance7AF3f8r2" minOccurs="0"/>
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
    "getAllOutgoingSingleEdgesResult"
})
@XmlRootElement(name = "GetAllOutgoingSingleEdgesResponse")
public class GetAllOutgoingSingleEdgesResponse {

    @XmlElement(name = "GetAllOutgoingSingleEdgesResult", nillable = true)
    protected ArrayOfTupleOflongServiceSingleEdgeInstance7AF3F8R2 getAllOutgoingSingleEdgesResult;

    /**
     * Gets the value of the getAllOutgoingSingleEdgesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOflongServiceSingleEdgeInstance7AF3F8R2 }
     *     
     */
    public ArrayOfTupleOflongServiceSingleEdgeInstance7AF3F8R2 getGetAllOutgoingSingleEdgesResult() {
        return getAllOutgoingSingleEdgesResult;
    }

    /**
     * Sets the value of the getAllOutgoingSingleEdgesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOflongServiceSingleEdgeInstance7AF3F8R2 }
     *     
     */
    public void setGetAllOutgoingSingleEdgesResult(ArrayOfTupleOflongServiceSingleEdgeInstance7AF3F8R2 value) {
        this.getAllOutgoingSingleEdgesResult = value;
    }

}
