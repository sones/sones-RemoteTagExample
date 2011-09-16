
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceVertexInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceVertexInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceVertexInstance" type="{http://www.sones.com}ServiceVertexInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceVertexInstance", propOrder = {
    "serviceVertexInstance"
})
public class ArrayOfServiceVertexInstance {

    @XmlElement(name = "ServiceVertexInstance", nillable = true)
    protected List<ServiceVertexInstance> serviceVertexInstance;

    /**
     * Gets the value of the serviceVertexInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceVertexInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceVertexInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceVertexInstance }
     * 
     * 
     */
    public List<ServiceVertexInstance> getServiceVertexInstance() {
        if (serviceVertexInstance == null) {
            serviceVertexInstance = new ArrayList<ServiceVertexInstance>();
        }
        return this.serviceVertexInstance;
    }

}
