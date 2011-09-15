
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceOutgoingEdgeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceOutgoingEdgeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceOutgoingEdgeDefinition" type="{http://www.sones.com}ServiceOutgoingEdgeDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceOutgoingEdgeDefinition", propOrder = {
    "serviceOutgoingEdgeDefinition"
})
public class ArrayOfServiceOutgoingEdgeDefinition {

    @XmlElement(name = "ServiceOutgoingEdgeDefinition", nillable = true)
    protected List<ServiceOutgoingEdgeDefinition> serviceOutgoingEdgeDefinition;

    /**
     * Gets the value of the serviceOutgoingEdgeDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOutgoingEdgeDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOutgoingEdgeDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOutgoingEdgeDefinition }
     * 
     * 
     */
    public List<ServiceOutgoingEdgeDefinition> getServiceOutgoingEdgeDefinition() {
        if (serviceOutgoingEdgeDefinition == null) {
            serviceOutgoingEdgeDefinition = new ArrayList<ServiceOutgoingEdgeDefinition>();
        }
        return this.serviceOutgoingEdgeDefinition;
    }

}
