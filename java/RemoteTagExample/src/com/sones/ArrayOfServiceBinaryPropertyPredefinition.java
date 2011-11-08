
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceBinaryPropertyPredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceBinaryPropertyPredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceBinaryPropertyPredefinition" type="{http://www.sones.com}ServiceBinaryPropertyPredefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceBinaryPropertyPredefinition", propOrder = {
    "serviceBinaryPropertyPredefinition"
})
public class ArrayOfServiceBinaryPropertyPredefinition {

    @XmlElement(name = "ServiceBinaryPropertyPredefinition", nillable = true)
    protected List<ServiceBinaryPropertyPredefinition> serviceBinaryPropertyPredefinition;

    /**
     * Gets the value of the serviceBinaryPropertyPredefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceBinaryPropertyPredefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceBinaryPropertyPredefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceBinaryPropertyPredefinition }
     * 
     * 
     */
    public List<ServiceBinaryPropertyPredefinition> getServiceBinaryPropertyPredefinition() {
        if (serviceBinaryPropertyPredefinition == null) {
            serviceBinaryPropertyPredefinition = new ArrayList<ServiceBinaryPropertyPredefinition>();
        }
        return this.serviceBinaryPropertyPredefinition;
    }

}
