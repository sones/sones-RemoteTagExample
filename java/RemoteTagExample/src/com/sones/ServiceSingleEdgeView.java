
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSingleEdgeView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSingleEdgeView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceEdgeView">
 *       &lt;sequence>
 *         &lt;element name="TargetVertex" type="{http://www.sones.com}ServiceVertexView" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSingleEdgeView", propOrder = {
    "targetVertex"
})
public class ServiceSingleEdgeView
    extends ServiceEdgeView
{

    @XmlElement(name = "TargetVertex", nillable = true)
    protected ServiceVertexView targetVertex;

    /**
     * Gets the value of the targetVertex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexView }
     *     
     */
    public ServiceVertexView getTargetVertex() {
        return targetVertex;
    }

    /**
     * Sets the value of the targetVertex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexView }
     *     
     */
    public void setTargetVertex(ServiceVertexView value) {
        this.targetVertex = value;
    }

}
