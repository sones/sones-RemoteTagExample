
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
 *         &lt;element name="GetUniqueDefinitionsResult" type="{http://www.sones.com}ArrayOfServiceUniqueDefinition" minOccurs="0"/>
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
    "getUniqueDefinitionsResult"
})
@XmlRootElement(name = "GetUniqueDefinitionsResponse")
public class GetUniqueDefinitionsResponse {

    @XmlElement(name = "GetUniqueDefinitionsResult", nillable = true)
    protected ArrayOfServiceUniqueDefinition getUniqueDefinitionsResult;

    /**
     * Gets the value of the getUniqueDefinitionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceUniqueDefinition }
     *     
     */
    public ArrayOfServiceUniqueDefinition getGetUniqueDefinitionsResult() {
        return getUniqueDefinitionsResult;
    }

    /**
     * Sets the value of the getUniqueDefinitionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceUniqueDefinition }
     *     
     */
    public void setGetUniqueDefinitionsResult(ArrayOfServiceUniqueDefinition value) {
        this.getUniqueDefinitionsResult = value;
    }

}
