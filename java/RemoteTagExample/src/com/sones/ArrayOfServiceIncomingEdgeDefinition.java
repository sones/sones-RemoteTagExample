
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceIncomingEdgeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceIncomingEdgeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceIncomingEdgeDefinition" type="{http://www.sones.com}ServiceIncomingEdgeDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceIncomingEdgeDefinition", propOrder = {
    "serviceIncomingEdgeDefinition"
})
public class ArrayOfServiceIncomingEdgeDefinition {

    @XmlElement(name = "ServiceIncomingEdgeDefinition", nillable = true)
    protected List<ServiceIncomingEdgeDefinition> serviceIncomingEdgeDefinition;

    /**
     * Gets the value of the serviceIncomingEdgeDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceIncomingEdgeDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceIncomingEdgeDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceIncomingEdgeDefinition }
     * 
     * 
     */
    public List<ServiceIncomingEdgeDefinition> getServiceIncomingEdgeDefinition() {
        if (serviceIncomingEdgeDefinition == null) {
            serviceIncomingEdgeDefinition = new ArrayList<ServiceIncomingEdgeDefinition>();
        }
        return this.serviceIncomingEdgeDefinition;
    }

}
