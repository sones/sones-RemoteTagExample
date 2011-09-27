
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceHyperEdgeView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHyperEdgeView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceEdgeView">
 *       &lt;sequence>
 *         &lt;element name="Edges" type="{http://www.sones.com}ArrayOfServiceSingleEdgeView" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHyperEdgeView", propOrder = {
    "edges"
})
public class ServiceHyperEdgeView
    extends ServiceEdgeView
{

    @XmlElement(name = "Edges", nillable = true)
    protected ArrayOfServiceSingleEdgeView edges;

    /**
     * Gets the value of the edges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceSingleEdgeView }
     *     
     */
    public ArrayOfServiceSingleEdgeView getEdges() {
        return edges;
    }

    /**
     * Sets the value of the edges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceSingleEdgeView }
     *     
     */
    public void setEdges(ArrayOfServiceSingleEdgeView value) {
        this.edges = value;
    }

}
