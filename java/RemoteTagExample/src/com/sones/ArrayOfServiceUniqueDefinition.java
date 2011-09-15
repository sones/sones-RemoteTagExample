
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceUniqueDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceUniqueDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceUniqueDefinition" type="{http://www.sones.com}ServiceUniqueDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceUniqueDefinition", propOrder = {
    "serviceUniqueDefinition"
})
public class ArrayOfServiceUniqueDefinition {

    @XmlElement(name = "ServiceUniqueDefinition", nillable = true)
    protected List<ServiceUniqueDefinition> serviceUniqueDefinition;

    /**
     * Gets the value of the serviceUniqueDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceUniqueDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceUniqueDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceUniqueDefinition }
     * 
     * 
     */
    public List<ServiceUniqueDefinition> getServiceUniqueDefinition() {
        if (serviceUniqueDefinition == null) {
            serviceUniqueDefinition = new ArrayList<ServiceUniqueDefinition>();
        }
        return this.serviceUniqueDefinition;
    }

}
