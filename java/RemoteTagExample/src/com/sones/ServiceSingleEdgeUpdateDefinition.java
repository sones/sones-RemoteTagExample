
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSingleEdgeUpdateDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSingleEdgeUpdateDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}ServiceGraphElementUpdateDefinition">
 *       &lt;sequence>
 *         &lt;element name="EdgeTypeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceVertex" type="{http://www.sones.com}ServiceSingleEdgeUpdateDefinition.ServiceVertexInformation" minOccurs="0"/>
 *         &lt;element name="TargetVertex" type="{http://www.sones.com}ServiceSingleEdgeUpdateDefinition.ServiceVertexInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSingleEdgeUpdateDefinition", propOrder = {
    "edgeTypeID",
    "sourceVertex",
    "targetVertex"
})
public class ServiceSingleEdgeUpdateDefinition
    extends ServiceGraphElementUpdateDefinition
{

    @XmlElement(name = "EdgeTypeID")
    protected Long edgeTypeID;
    @XmlElement(name = "SourceVertex", nillable = true)
    protected ServiceSingleEdgeUpdateDefinitionServiceVertexInformation sourceVertex;
    @XmlElement(name = "TargetVertex", nillable = true)
    protected ServiceSingleEdgeUpdateDefinitionServiceVertexInformation targetVertex;

    /**
     * Gets the value of the edgeTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEdgeTypeID() {
        return edgeTypeID;
    }

    /**
     * Sets the value of the edgeTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEdgeTypeID(Long value) {
        this.edgeTypeID = value;
    }

    /**
     * Gets the value of the sourceVertex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSingleEdgeUpdateDefinitionServiceVertexInformation }
     *     
     */
    public ServiceSingleEdgeUpdateDefinitionServiceVertexInformation getSourceVertex() {
        return sourceVertex;
    }

    /**
     * Sets the value of the sourceVertex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSingleEdgeUpdateDefinitionServiceVertexInformation }
     *     
     */
    public void setSourceVertex(ServiceSingleEdgeUpdateDefinitionServiceVertexInformation value) {
        this.sourceVertex = value;
    }

    /**
     * Gets the value of the targetVertex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSingleEdgeUpdateDefinitionServiceVertexInformation }
     *     
     */
    public ServiceSingleEdgeUpdateDefinitionServiceVertexInformation getTargetVertex() {
        return targetVertex;
    }

    /**
     * Sets the value of the targetVertex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSingleEdgeUpdateDefinitionServiceVertexInformation }
     *     
     */
    public void setTargetVertex(ServiceSingleEdgeUpdateDefinitionServiceVertexInformation value) {
        this.targetVertex = value;
    }

}
