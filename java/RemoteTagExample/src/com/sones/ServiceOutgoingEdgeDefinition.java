
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOutgoingEdgeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOutgoingEdgeDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceAttributeDefinition">
 *       &lt;sequence>
 *         &lt;element name="EdgeType" type="{http://www.sones.com}ServiceEdgeType" minOccurs="0"/>
 *         &lt;element name="InnerEdgeType" type="{http://www.sones.com}ServiceEdgeType" minOccurs="0"/>
 *         &lt;element name="Multiplicity" type="{http://www.sones.com}ServiceEdgeMultiplicity" minOccurs="0"/>
 *         &lt;element name="SourceVertexType" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
 *         &lt;element name="TargetVertexType" type="{http://www.sones.com}ServiceVertexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOutgoingEdgeDefinition", propOrder = {
    "edgeType",
    "innerEdgeType",
    "multiplicity",
    "sourceVertexType",
    "targetVertexType"
})
public class ServiceOutgoingEdgeDefinition
    extends ServiceAttributeDefinition
{

    @XmlElement(name = "EdgeType", nillable = true)
    protected ServiceEdgeType edgeType;
    @XmlElement(name = "InnerEdgeType", nillable = true)
    protected ServiceEdgeType innerEdgeType;
    @XmlElement(name = "Multiplicity")
    protected ServiceEdgeMultiplicity multiplicity;
    @XmlElement(name = "SourceVertexType", nillable = true)
    protected ServiceVertexType sourceVertexType;
    @XmlElement(name = "TargetVertexType", nillable = true)
    protected ServiceVertexType targetVertexType;

    /**
     * Gets the value of the edgeType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEdgeType }
     *     
     */
    public ServiceEdgeType getEdgeType() {
        return edgeType;
    }

    /**
     * Sets the value of the edgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEdgeType }
     *     
     */
    public void setEdgeType(ServiceEdgeType value) {
        this.edgeType = value;
    }

    /**
     * Gets the value of the innerEdgeType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEdgeType }
     *     
     */
    public ServiceEdgeType getInnerEdgeType() {
        return innerEdgeType;
    }

    /**
     * Sets the value of the innerEdgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEdgeType }
     *     
     */
    public void setInnerEdgeType(ServiceEdgeType value) {
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

    /**
     * Gets the value of the sourceVertexType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getSourceVertexType() {
        return sourceVertexType;
    }

    /**
     * Sets the value of the sourceVertexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setSourceVertexType(ServiceVertexType value) {
        this.sourceVertexType = value;
    }

    /**
     * Gets the value of the targetVertexType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexType }
     *     
     */
    public ServiceVertexType getTargetVertexType() {
        return targetVertexType;
    }

    /**
     * Sets the value of the targetVertexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexType }
     *     
     */
    public void setTargetVertexType(ServiceVertexType value) {
        this.targetVertexType = value;
    }

}
