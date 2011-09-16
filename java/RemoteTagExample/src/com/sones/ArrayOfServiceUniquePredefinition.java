
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceUniquePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceUniquePredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceUniquePredefinition" type="{http://www.sones.com}ServiceUniquePredefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceUniquePredefinition", propOrder = {
    "serviceUniquePredefinition"
})
public class ArrayOfServiceUniquePredefinition {

    @XmlElement(name = "ServiceUniquePredefinition", nillable = true)
    protected List<ServiceUniquePredefinition> serviceUniquePredefinition;

    /**
     * Gets the value of the serviceUniquePredefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceUniquePredefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceUniquePredefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceUniquePredefinition }
     * 
     * 
     */
    public List<ServiceUniquePredefinition> getServiceUniquePredefinition() {
        if (serviceUniquePredefinition == null) {
            serviceUniquePredefinition = new ArrayList<ServiceUniquePredefinition>();
        }
        return this.serviceUniquePredefinition;
    }

}
