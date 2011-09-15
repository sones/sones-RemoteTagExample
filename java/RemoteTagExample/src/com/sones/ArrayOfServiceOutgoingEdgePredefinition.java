
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceOutgoingEdgePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceOutgoingEdgePredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceOutgoingEdgePredefinition" type="{http://www.sones.com}ServiceOutgoingEdgePredefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceOutgoingEdgePredefinition", propOrder = {
    "serviceOutgoingEdgePredefinition"
})
public class ArrayOfServiceOutgoingEdgePredefinition {

    @XmlElement(name = "ServiceOutgoingEdgePredefinition", nillable = true)
    protected List<ServiceOutgoingEdgePredefinition> serviceOutgoingEdgePredefinition;

    /**
     * Gets the value of the serviceOutgoingEdgePredefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOutgoingEdgePredefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOutgoingEdgePredefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOutgoingEdgePredefinition }
     * 
     * 
     */
    public List<ServiceOutgoingEdgePredefinition> getServiceOutgoingEdgePredefinition() {
        if (serviceOutgoingEdgePredefinition == null) {
            serviceOutgoingEdgePredefinition = new ArrayList<ServiceOutgoingEdgePredefinition>();
        }
        return this.serviceOutgoingEdgePredefinition;
    }

}
