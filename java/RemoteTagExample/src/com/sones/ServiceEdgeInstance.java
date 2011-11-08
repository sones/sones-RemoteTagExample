
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceEdgeInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEdgeInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sones.com}AGraphElement">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EdgePropertyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceVertex" type="{http://www.sones.com}ServiceVertexInstance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEdgeInstance", propOrder = {
    "comment",
    "edgePropertyID",
    "sourceVertex"
})
@XmlSeeAlso({
    ServiceHyperEdgeInstance.class,
    ServiceSingleEdgeInstance.class
})
public class ServiceEdgeInstance
    extends AGraphElement
{

    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "EdgePropertyID", nillable = true)
    protected Long edgePropertyID;
    @XmlElement(name = "SourceVertex", nillable = true)
    protected ServiceVertexInstance sourceVertex;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the edgePropertyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEdgePropertyID() {
        return edgePropertyID;
    }

    /**
     * Sets the value of the edgePropertyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEdgePropertyID(Long value) {
        this.edgePropertyID = value;
    }

    /**
     * Gets the value of the sourceVertex property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public ServiceVertexInstance getSourceVertex() {
        return sourceVertex;
    }

    /**
     * Sets the value of the sourceVertex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVertexInstance }
     *     
     */
    public void setSourceVertex(ServiceVertexInstance value) {
        this.sourceVertex = value;
    }

}
