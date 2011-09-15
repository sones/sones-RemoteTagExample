
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceMandatoryPredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceMandatoryPredefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceMandatoryPredefinition" type="{http://www.sones.com}ServiceMandatoryPredefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceMandatoryPredefinition", propOrder = {
    "serviceMandatoryPredefinition"
})
public class ArrayOfServiceMandatoryPredefinition {

    @XmlElement(name = "ServiceMandatoryPredefinition", nillable = true)
    protected List<ServiceMandatoryPredefinition> serviceMandatoryPredefinition;

    /**
     * Gets the value of the serviceMandatoryPredefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMandatoryPredefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMandatoryPredefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMandatoryPredefinition }
     * 
     * 
     */
    public List<ServiceMandatoryPredefinition> getServiceMandatoryPredefinition() {
        if (serviceMandatoryPredefinition == null) {
            serviceMandatoryPredefinition = new ArrayList<ServiceMandatoryPredefinition>();
        }
        return this.serviceMandatoryPredefinition;
    }

}
