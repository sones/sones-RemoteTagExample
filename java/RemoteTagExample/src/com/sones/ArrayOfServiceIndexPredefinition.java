
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceIndexPredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceIndexPredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceIndexPredefinition" type="{http://www.sones.com}ServiceIndexPredefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceIndexPredefinition", propOrder = {
    "serviceIndexPredefinition"
})
public class ArrayOfServiceIndexPredefinition {

    @XmlElement(name = "ServiceIndexPredefinition", nillable = true)
    protected List<ServiceIndexPredefinition> serviceIndexPredefinition;

    /**
     * Gets the value of the serviceIndexPredefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceIndexPredefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceIndexPredefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceIndexPredefinition }
     * 
     * 
     */
    public List<ServiceIndexPredefinition> getServiceIndexPredefinition() {
        if (serviceIndexPredefinition == null) {
            serviceIndexPredefinition = new ArrayList<ServiceIndexPredefinition>();
        }
        return this.serviceIndexPredefinition;
    }

}
