
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceSingleEdgeInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceSingleEdgeInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceSingleEdgeInstance" type="{http://www.sones.com}ServiceSingleEdgeInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceSingleEdgeInstance", propOrder = {
    "serviceSingleEdgeInstance"
})
public class ArrayOfServiceSingleEdgeInstance {

    @XmlElement(name = "ServiceSingleEdgeInstance", nillable = true)
    protected List<ServiceSingleEdgeInstance> serviceSingleEdgeInstance;

    /**
     * Gets the value of the serviceSingleEdgeInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSingleEdgeInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSingleEdgeInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSingleEdgeInstance }
     * 
     * 
     */
    public List<ServiceSingleEdgeInstance> getServiceSingleEdgeInstance() {
        if (serviceSingleEdgeInstance == null) {
            serviceSingleEdgeInstance = new ArrayList<ServiceSingleEdgeInstance>();
        }
        return this.serviceSingleEdgeInstance;
    }

}
