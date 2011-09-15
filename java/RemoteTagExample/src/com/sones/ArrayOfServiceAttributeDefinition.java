
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceAttributeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceAttributeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceAttributeDefinition" type="{http://www.sones.com}ServiceAttributeDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceAttributeDefinition", propOrder = {
    "serviceAttributeDefinition"
})
public class ArrayOfServiceAttributeDefinition {

    @XmlElement(name = "ServiceAttributeDefinition", nillable = true)
    protected List<ServiceAttributeDefinition> serviceAttributeDefinition;

    /**
     * Gets the value of the serviceAttributeDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAttributeDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAttributeDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceAttributeDefinition }
     * 
     * 
     */
    public List<ServiceAttributeDefinition> getServiceAttributeDefinition() {
        if (serviceAttributeDefinition == null) {
            serviceAttributeDefinition = new ArrayList<ServiceAttributeDefinition>();
        }
        return this.serviceAttributeDefinition;
    }

}
