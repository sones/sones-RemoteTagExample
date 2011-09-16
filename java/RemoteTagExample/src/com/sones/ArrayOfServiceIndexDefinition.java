
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceIndexDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceIndexDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceIndexDefinition" type="{http://www.sones.com}ServiceIndexDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceIndexDefinition", propOrder = {
    "serviceIndexDefinition"
})
public class ArrayOfServiceIndexDefinition {

    @XmlElement(name = "ServiceIndexDefinition", nillable = true)
    protected List<ServiceIndexDefinition> serviceIndexDefinition;

    /**
     * Gets the value of the serviceIndexDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceIndexDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceIndexDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceIndexDefinition }
     * 
     * 
     */
    public List<ServiceIndexDefinition> getServiceIndexDefinition() {
        if (serviceIndexDefinition == null) {
            serviceIndexDefinition = new ArrayList<ServiceIndexDefinition>();
        }
        return this.serviceIndexDefinition;
    }

}
