
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1;


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
 *         &lt;element name="GetAllIncomingVerticesResult" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1" minOccurs="0"/>
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
    "getAllIncomingVerticesResult"
})
@XmlRootElement(name = "GetAllIncomingVerticesResponse")
public class GetAllIncomingVerticesResponse {

    @XmlElement(name = "GetAllIncomingVerticesResult", nillable = true)
    protected ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 getAllIncomingVerticesResult;

    /**
     * Gets the value of the getAllIncomingVerticesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 }
     *     
     */
    public ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 getGetAllIncomingVerticesResult() {
        return getAllIncomingVerticesResult;
    }

    /**
     * Sets the value of the getAllIncomingVerticesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 }
     *     
     */
    public void setGetAllIncomingVerticesResult(ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 value) {
        this.getAllIncomingVerticesResult = value;
    }

}
