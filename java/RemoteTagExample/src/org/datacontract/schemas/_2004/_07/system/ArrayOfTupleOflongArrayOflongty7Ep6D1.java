
package org.datacontract.schemas._2004._07.system;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTupleOflongArrayOflongty7Ep6D1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTupleOflongArrayOflongty7Ep6D1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TupleOflongArrayOflongty7Ep6D1" type="{http://schemas.datacontract.org/2004/07/System}TupleOflongArrayOflongty7Ep6D1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTupleOflongArrayOflongty7Ep6D1", propOrder = {
    "tupleOflongArrayOflongty7Ep6D1"
})
public class ArrayOfTupleOflongArrayOflongty7Ep6D1 {

    @XmlElement(name = "TupleOflongArrayOflongty7Ep6D1", nillable = true)
    protected List<TupleOflongArrayOflongty7Ep6D1> tupleOflongArrayOflongty7Ep6D1;

    /**
     * Gets the value of the tupleOflongArrayOflongty7Ep6D1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tupleOflongArrayOflongty7Ep6D1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTupleOflongArrayOflongty7Ep6D1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TupleOflongArrayOflongty7Ep6D1 }
     * 
     * 
     */
    public List<TupleOflongArrayOflongty7Ep6D1> getTupleOflongArrayOflongty7Ep6D1() {
        if (tupleOflongArrayOflongty7Ep6D1 == null) {
            tupleOflongArrayOflongty7Ep6D1 = new ArrayList<TupleOflongArrayOflongty7Ep6D1>();
        }
        return this.tupleOflongArrayOflongty7Ep6D1;
    }

}
