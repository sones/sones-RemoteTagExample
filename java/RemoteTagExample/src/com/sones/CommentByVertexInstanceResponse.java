
package com.sones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentByVertexInstanceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "commentByVertexInstanceResult"
})
@XmlRootElement(name = "CommentByVertexInstanceResponse")
public class CommentByVertexInstanceResponse {

    @XmlElement(name = "CommentByVertexInstanceResult", nillable = true)
    protected String commentByVertexInstanceResult;

    /**
     * Gets the value of the commentByVertexInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentByVertexInstanceResult() {
        return commentByVertexInstanceResult;
    }

    /**
     * Sets the value of the commentByVertexInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentByVertexInstanceResult(String value) {
        this.commentByVertexInstanceResult = value;
    }

}
