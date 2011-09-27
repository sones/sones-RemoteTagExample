
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOfstringServiceHyperEdgeView7AF3F8R2;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOfstringServiceSingleEdgeView7AF3F8R2;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOfstringanyType;


/**
 * <p>Java class for ServiceVertexView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceVertexView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HyperEdges" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOfstringServiceHyperEdgeView7AF3f8r2" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOfstringanyType" minOccurs="0"/>
 *         &lt;element name="SingleEdges" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfTupleOfstringServiceSingleEdgeView7AF3f8r2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceVertexView", propOrder = {
    "hyperEdges",
    "properties",
    "singleEdges"
})
public class ServiceVertexView {

    @XmlElement(name = "HyperEdges", nillable = true)
    protected ArrayOfTupleOfstringServiceHyperEdgeView7AF3F8R2 hyperEdges;
    @XmlElement(name = "Properties", nillable = true)
    protected ArrayOfTupleOfstringanyType properties;
    @XmlElement(name = "SingleEdges", nillable = true)
    protected ArrayOfTupleOfstringServiceSingleEdgeView7AF3F8R2 singleEdges;

    /**
     * Gets the value of the hyperEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOfstringServiceHyperEdgeView7AF3F8R2 }
     *     
     */
    public ArrayOfTupleOfstringServiceHyperEdgeView7AF3F8R2 getHyperEdges() {
        return hyperEdges;
    }

    /**
     * Sets the value of the hyperEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOfstringServiceHyperEdgeView7AF3F8R2 }
     *     
     */
    public void setHyperEdges(ArrayOfTupleOfstringServiceHyperEdgeView7AF3F8R2 value) {
        this.hyperEdges = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOfstringanyType }
     *     
     */
    public ArrayOfTupleOfstringanyType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOfstringanyType }
     *     
     */
    public void setProperties(ArrayOfTupleOfstringanyType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the singleEdges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTupleOfstringServiceSingleEdgeView7AF3F8R2 }
     *     
     */
    public ArrayOfTupleOfstringServiceSingleEdgeView7AF3F8R2 getSingleEdges() {
        return singleEdges;
    }

    /**
     * Sets the value of the singleEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTupleOfstringServiceSingleEdgeView7AF3F8R2 }
     *     
     */
    public void setSingleEdges(ArrayOfTupleOfstringServiceSingleEdgeView7AF3F8R2 value) {
        this.singleEdges = value;
    }

}
