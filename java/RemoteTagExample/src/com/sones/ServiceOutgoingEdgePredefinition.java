
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOutgoingEdgePredefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOutgoingEdgePredefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceAttributePredefinition">
 *       &lt;sequence>
 *         &lt;element name="EdgeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InnerEdgeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiplicity" type="{http://www.sones.com}ServiceEdgeMultiplicity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOutgoingEdgePredefinition", propOrder = {
    "edgeType",
    "innerEdgeType",
    "multiplicity"
})
public class ServiceOutgoingEdgePredefinition
    extends ServiceAttributePredefinition
{

    @XmlElement(name = "EdgeType", nillable = true)
    protected String edgeType;
    @XmlElement(name = "InnerEdgeType", nillable = true)
    protected String innerEdgeType;
    @XmlElement(name = "Multiplicity")
    protected ServiceEdgeMultiplicity multiplicity;

    /**
     * Gets the value of the edgeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeType() {
        return edgeType;
    }

    /**
     * Sets the value of the edgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeType(String value) {
        this.edgeType = value;
    }

    /**
     * Gets the value of the innerEdgeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInnerEdgeType() {
        return innerEdgeType;
    }

    /**
     * Sets the value of the innerEdgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInnerEdgeType(String value) {
        this.innerEdgeType = value;
    }

    /**
     * Gets the value of the multiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEdgeMultiplicity }
     *     
     */
    public ServiceEdgeMultiplicity getMultiplicity() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEdgeMultiplicity }
     *     
     */
    public void setMultiplicity(ServiceEdgeMultiplicity value) {
        this.multiplicity = value;
    }

}
