
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceBinaryPropertyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceBinaryPropertyDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceBinaryPropertyDefinition" type="{http://www.sones.com}ServiceBinaryPropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceBinaryPropertyDefinition", propOrder = {
    "serviceBinaryPropertyDefinition"
})
public class ArrayOfServiceBinaryPropertyDefinition {

    @XmlElement(name = "ServiceBinaryPropertyDefinition", nillable = true)
    protected List<ServiceBinaryPropertyDefinition> serviceBinaryPropertyDefinition;

    /**
     * Gets the value of the serviceBinaryPropertyDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceBinaryPropertyDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceBinaryPropertyDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceBinaryPropertyDefinition }
     * 
     * 
     */
    public List<ServiceBinaryPropertyDefinition> getServiceBinaryPropertyDefinition() {
        if (serviceBinaryPropertyDefinition == null) {
            serviceBinaryPropertyDefinition = new ArrayList<ServiceBinaryPropertyDefinition>();
        }
        return this.serviceBinaryPropertyDefinition;
    }

}
