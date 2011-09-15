
package org.datacontract.schemas._2004._07.system;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTupleOflongServiceSingleEdgeInstance7AF3f8r2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTupleOflongServiceSingleEdgeInstance7AF3f8r2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TupleOflongServiceSingleEdgeInstance7AF3f8r2" type="{http://schemas.datacontract.org/2004/07/System}TupleOflongServiceSingleEdgeInstance7AF3f8r2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTupleOflongServiceSingleEdgeInstance7AF3f8r2", propOrder = {
    "tupleOflongServiceSingleEdgeInstance7AF3F8R2"
})
public class ArrayOfTupleOflongServiceSingleEdgeInstance7AF3F8R2 {

    @XmlElement(name = "TupleOflongServiceSingleEdgeInstance7AF3f8r2", nillable = true)
    protected List<TupleOflongServiceSingleEdgeInstance7AF3F8R2> tupleOflongServiceSingleEdgeInstance7AF3F8R2;

    /**
     * Gets the value of the tupleOflongServiceSingleEdgeInstance7AF3F8R2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tupleOflongServiceSingleEdgeInstance7AF3F8R2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTupleOflongServiceSingleEdgeInstance7AF3F8R2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TupleOflongServiceSingleEdgeInstance7AF3F8R2 }
     * 
     * 
     */
    public List<TupleOflongServiceSingleEdgeInstance7AF3F8R2> getTupleOflongServiceSingleEdgeInstance7AF3F8R2() {
        if (tupleOflongServiceSingleEdgeInstance7AF3F8R2 == null) {
            tupleOflongServiceSingleEdgeInstance7AF3F8R2 = new ArrayList<TupleOflongServiceSingleEdgeInstance7AF3F8R2>();
        }
        return this.tupleOflongServiceSingleEdgeInstance7AF3F8R2;
    }

}
