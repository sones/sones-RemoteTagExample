
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServicePropertyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServicePropertyDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePropertyDefinition" type="{http://www.sones.com}ServicePropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServicePropertyDefinition", propOrder = {
    "servicePropertyDefinition"
})
public class ArrayOfServicePropertyDefinition {

    @XmlElement(name = "ServicePropertyDefinition", nillable = true)
    protected List<ServicePropertyDefinition> servicePropertyDefinition;

    /**
     * Gets the value of the servicePropertyDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicePropertyDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicePropertyDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePropertyDefinition }
     * 
     * 
     */
    public List<ServicePropertyDefinition> getServicePropertyDefinition() {
        if (servicePropertyDefinition == null) {
            servicePropertyDefinition = new ArrayList<ServicePropertyDefinition>();
        }
        return this.servicePropertyDefinition;
    }

}
