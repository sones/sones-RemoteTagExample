
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServicePropertyPredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServicePropertyPredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePropertyPredefinition" type="{http://www.sones.com}ServicePropertyPredefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServicePropertyPredefinition", propOrder = {
    "servicePropertyPredefinition"
})
public class ArrayOfServicePropertyPredefinition {

    @XmlElement(name = "ServicePropertyPredefinition", nillable = true)
    protected List<ServicePropertyPredefinition> servicePropertyPredefinition;

    /**
     * Gets the value of the servicePropertyPredefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicePropertyPredefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicePropertyPredefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePropertyPredefinition }
     * 
     * 
     */
    public List<ServicePropertyPredefinition> getServicePropertyPredefinition() {
        if (servicePropertyPredefinition == null) {
            servicePropertyPredefinition = new ArrayList<ServicePropertyPredefinition>();
        }
        return this.servicePropertyPredefinition;
    }

}
