
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceVertexTypePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceVertexTypePredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceVertexTypePredefinition" type="{http://www.sones.com}ServiceVertexTypePredefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceVertexTypePredefinition", propOrder = {
    "serviceVertexTypePredefinition"
})
public class ArrayOfServiceVertexTypePredefinition {

    @XmlElement(name = "ServiceVertexTypePredefinition", nillable = true)
    protected List<ServiceVertexTypePredefinition> serviceVertexTypePredefinition;

    /**
     * Gets the value of the serviceVertexTypePredefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceVertexTypePredefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceVertexTypePredefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceVertexTypePredefinition }
     * 
     * 
     */
    public List<ServiceVertexTypePredefinition> getServiceVertexTypePredefinition() {
        if (serviceVertexTypePredefinition == null) {
            serviceVertexTypePredefinition = new ArrayList<ServiceVertexTypePredefinition>();
        }
        return this.serviceVertexTypePredefinition;
    }

}
