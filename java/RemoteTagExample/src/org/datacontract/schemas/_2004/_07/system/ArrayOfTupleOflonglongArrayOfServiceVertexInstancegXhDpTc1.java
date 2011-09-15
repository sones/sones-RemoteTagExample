
package org.datacontract.schemas._2004._07.system;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1" type="{http://schemas.datacontract.org/2004/07/System}TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1", propOrder = {
    "tupleOflonglongArrayOfServiceVertexInstancegXhDpTc1"
})
public class ArrayOfTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 {

    @XmlElement(name = "TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1", nillable = true)
    protected List<TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1> tupleOflonglongArrayOfServiceVertexInstancegXhDpTc1;

    /**
     * Gets the value of the tupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 }
     * 
     * 
     */
    public List<TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1> getTupleOflonglongArrayOfServiceVertexInstancegXhDpTc1() {
        if (tupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 == null) {
            tupleOflonglongArrayOfServiceVertexInstancegXhDpTc1 = new ArrayList<TupleOflonglongArrayOfServiceVertexInstancegXhDpTc1>();
        }
        return this.tupleOflonglongArrayOfServiceVertexInstancegXhDpTc1;
    }

}
