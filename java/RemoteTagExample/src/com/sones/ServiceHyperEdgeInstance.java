
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceHyperEdgeInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHyperEdgeInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceEdgeInstance">
 *       &lt;sequence>
 *         &lt;element name="SingleEdges" type="{http://www.sones.com}ArrayOfServiceSingleEdgeInstance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHyperEdgeInstance", propOrder = {
    "singleEdges"
})
public class ServiceHyperEdgeInstance
    extends ServiceEdgeInstance
{

    @XmlElement(name = "SingleEdges", nillable = true)
    protected ArrayOfServiceSingleEdgeInstance singleEdges;

    /**
     * Gets the value of the singleEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceSingleEdgeInstance }
     *     
     */
    public ArrayOfServiceSingleEdgeInstance getSingleEdges() {
        return singleEdges;
    }

    /**
     * Sets the value of the singleEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceSingleEdgeInstance }
     *     
     */
    public void setSingleEdges(ArrayOfServiceSingleEdgeInstance value) {
        this.singleEdges = value;
    }

}
