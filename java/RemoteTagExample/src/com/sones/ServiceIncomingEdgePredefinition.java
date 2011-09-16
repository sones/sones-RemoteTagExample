
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceIncomingEdgePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceIncomingEdgePredefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceAttributePredefinition">
 *       &lt;sequence>
 *         &lt;element name="OutgoingEdgeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIncomingEdgePredefinition", propOrder = {
    "outgoingEdgeName"
})
public class ServiceIncomingEdgePredefinition
    extends ServiceAttributePredefinition
{

    @XmlElement(name = "OutgoingEdgeName", nillable = true)
    protected String outgoingEdgeName;

    /**
     * Gets the value of the outgoingEdgeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingEdgeName() {
        return outgoingEdgeName;
    }

    /**
     * Sets the value of the outgoingEdgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingEdgeName(String value) {
        this.outgoingEdgeName = value;
    }

}
