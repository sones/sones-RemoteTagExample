
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceIncomingEdgePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceIncomingEdgePredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceIncomingEdgePredefinition" type="{http://www.sones.com}ServiceIncomingEdgePredefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceIncomingEdgePredefinition", propOrder = {
    "serviceIncomingEdgePredefinition"
})
public class ArrayOfServiceIncomingEdgePredefinition {

    @XmlElement(name = "ServiceIncomingEdgePredefinition", nillable = true)
    protected List<ServiceIncomingEdgePredefinition> serviceIncomingEdgePredefinition;

    /**
     * Gets the value of the serviceIncomingEdgePredefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceIncomingEdgePredefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceIncomingEdgePredefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceIncomingEdgePredefinition }
     * 
     * 
     */
    public List<ServiceIncomingEdgePredefinition> getServiceIncomingEdgePredefinition() {
        if (serviceIncomingEdgePredefinition == null) {
            serviceIncomingEdgePredefinition = new ArrayList<ServiceIncomingEdgePredefinition>();
        }
        return this.serviceIncomingEdgePredefinition;
    }

}
