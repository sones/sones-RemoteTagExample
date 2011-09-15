
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceIncomingEdgeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceIncomingEdgeDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceAttributeDefinition">
 *       &lt;sequence>
 *         &lt;element name="RelatedEdgeDefinition" type="{http://www.sones.com}ServiceOutgoingEdgeDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIncomingEdgeDefinition", propOrder = {
    "relatedEdgeDefinition"
})
public class ServiceIncomingEdgeDefinition
    extends ServiceAttributeDefinition
{

    @XmlElement(name = "RelatedEdgeDefinition", nillable = true)
    protected ServiceOutgoingEdgeDefinition relatedEdgeDefinition;

    /**
     * Gets the value of the relatedEdgeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOutgoingEdgeDefinition }
     *     
     */
    public ServiceOutgoingEdgeDefinition getRelatedEdgeDefinition() {
        return relatedEdgeDefinition;
    }

    /**
     * Sets the value of the relatedEdgeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOutgoingEdgeDefinition }
     *     
     */
    public void setRelatedEdgeDefinition(ServiceOutgoingEdgeDefinition value) {
        this.relatedEdgeDefinition = value;
    }

}
