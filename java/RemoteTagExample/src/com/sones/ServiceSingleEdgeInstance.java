
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSingleEdgeInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSingleEdgeInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceEdgeInstance">
 *       &lt;sequence>
 *         &lt;element name="HyperEdgeSourceVertex" type="{http://www.sones.com}ServiceVertexInstance" minOccurs="0"/>
 *         &lt;element name="TargetVertex" type="{http://www.sones.com}ServiceVertexInstance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSingleEdgeInstance", propOrder = {
    "hyperEdgeSourceVertex",
    "targetVertex"
})
public class ServiceSingleEdgeInstance
    extends ServiceEdgeInstance
{

    @XmlElement(name = "HyperEdgeSourceVertex", nillable = true)
    protected ServiceVertexInstance hyperEdgeSourceVertex;
    @XmlElement(name = "TargetVertex", nillable = true)
    protected ServiceVertexInstance targetVertex;

    /**
     * Gets the value of the hyperEdgeSourceVertex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public ServiceVertexInstance getHyperEdgeSourceVertex() {
        return hyperEdgeSourceVertex;
    }

    /**
     * Sets the value of the hyperEdgeSourceVertex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public void setHyperEdgeSourceVertex(ServiceVertexInstance value) {
        this.hyperEdgeSourceVertex = value;
    }

    /**
     * Gets the value of the targetVertex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public ServiceVertexInstance getTargetVertex() {
        return targetVertex;
    }

    /**
     * Sets the value of the targetVertex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public void setTargetVertex(ServiceVertexInstance value) {
        this.targetVertex = value;
    }

}
