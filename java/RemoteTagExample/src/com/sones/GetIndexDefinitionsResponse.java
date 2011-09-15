
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
 *         &lt;element name="GetIndexDefinitionsResult" type="{http://www.sones.com}ArrayOfServiceIndexDefinition" minOccurs="0"/>
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
    "getIndexDefinitionsResult"
})
@XmlRootElement(name = "GetIndexDefinitionsResponse")
public class GetIndexDefinitionsResponse {

    @XmlElement(name = "GetIndexDefinitionsResult", nillable = true)
    protected ArrayOfServiceIndexDefinition getIndexDefinitionsResult;

    /**
     * Gets the value of the getIndexDefinitionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceIndexDefinition }
     *     
     */
    public ArrayOfServiceIndexDefinition getGetIndexDefinitionsResult() {
        return getIndexDefinitionsResult;
    }

    /**
     * Sets the value of the getIndexDefinitionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceIndexDefinition }
     *     
     */
    public void setGetIndexDefinitionsResult(ArrayOfServiceIndexDefinition value) {
        this.getIndexDefinitionsResult = value;
    }

}
