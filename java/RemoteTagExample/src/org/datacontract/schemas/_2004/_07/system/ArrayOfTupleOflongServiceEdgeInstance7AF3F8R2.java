
package org.datacontract.schemas._2004._07.system;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTupleOflongServiceEdgeInstance7AF3f8r2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTupleOflongServiceEdgeInstance7AF3f8r2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TupleOflongServiceEdgeInstance7AF3f8r2" type="{http://schemas.datacontract.org/2004/07/System}TupleOflongServiceEdgeInstance7AF3f8r2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTupleOflongServiceEdgeInstance7AF3f8r2", propOrder = {
    "tupleOflongServiceEdgeInstance7AF3F8R2"
})
public class ArrayOfTupleOflongServiceEdgeInstance7AF3F8R2 {

    @XmlElement(name = "TupleOflongServiceEdgeInstance7AF3f8r2", nillable = true)
    protected List<TupleOflongServiceEdgeInstance7AF3F8R2> tupleOflongServiceEdgeInstance7AF3F8R2;

    /**
     * Gets the value of the tupleOflongServiceEdgeInstance7AF3F8R2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tupleOflongServiceEdgeInstance7AF3F8R2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTupleOflongServiceEdgeInstance7AF3F8R2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TupleOflongServiceEdgeInstance7AF3F8R2 }
     * 
     * 
     */
    public List<TupleOflongServiceEdgeInstance7AF3F8R2> getTupleOflongServiceEdgeInstance7AF3F8R2() {
        if (tupleOflongServiceEdgeInstance7AF3F8R2 == null) {
            tupleOflongServiceEdgeInstance7AF3F8R2 = new ArrayList<TupleOflongServiceEdgeInstance7AF3F8R2>();
        }
        return this.tupleOflongServiceEdgeInstance7AF3F8R2;
    }

}
