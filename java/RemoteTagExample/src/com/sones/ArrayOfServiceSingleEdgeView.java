
package com.sones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServiceSingleEdgeView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceSingleEdgeView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceSingleEdgeView" type="{http://www.sones.com}ServiceSingleEdgeView" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceSingleEdgeView", propOrder = {
    "serviceSingleEdgeView"
})
public class ArrayOfServiceSingleEdgeView {

    @XmlElement(name = "ServiceSingleEdgeView", nillable = true)
    protected List<ServiceSingleEdgeView> serviceSingleEdgeView;

    /**
     * Gets the value of the serviceSingleEdgeView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSingleEdgeView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSingleEdgeView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSingleEdgeView }
     * 
     * 
     */
    public List<ServiceSingleEdgeView> getServiceSingleEdgeView() {
        if (serviceSingleEdgeView == null) {
            serviceSingleEdgeView = new ArrayList<ServiceSingleEdgeView>();
        }
        return this.serviceSingleEdgeView;
    }

}
