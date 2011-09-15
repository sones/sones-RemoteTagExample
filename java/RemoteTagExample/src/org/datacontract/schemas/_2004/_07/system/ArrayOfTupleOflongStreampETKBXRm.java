
package org.datacontract.schemas._2004._07.system;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTupleOflongStreampETKBXRm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTupleOflongStreampETKBXRm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TupleOflongStreampETKBXRm" type="{http://schemas.datacontract.org/2004/07/System}TupleOflongStreampETKBXRm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTupleOflongStreampETKBXRm", propOrder = {
    "tupleOflongStreampETKBXRm"
})
public class ArrayOfTupleOflongStreampETKBXRm {

    @XmlElement(name = "TupleOflongStreampETKBXRm", nillable = true)
    protected List<TupleOflongStreampETKBXRm> tupleOflongStreampETKBXRm;

    /**
     * Gets the value of the tupleOflongStreampETKBXRm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tupleOflongStreampETKBXRm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTupleOflongStreampETKBXRm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TupleOflongStreampETKBXRm }
     * 
     * 
     */
    public List<TupleOflongStreampETKBXRm> getTupleOflongStreampETKBXRm() {
        if (tupleOflongStreampETKBXRm == null) {
            tupleOflongStreampETKBXRm = new ArrayList<TupleOflongStreampETKBXRm>();
        }
        return this.tupleOflongStreampETKBXRm;
    }

}
