
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sones.ServiceEdgePredefinition;


/**
 * <p>Java class for ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3f8r2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3f8r2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringServiceEdgePredefinition7AF3f8r2" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://www.sones.com}ServiceEdgePredefinition"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3f8r2", propOrder = {
    "keyValueOfstringServiceEdgePredefinition7AF3F8R2"
})
public class ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 {

    @XmlElement(name = "KeyValueOfstringServiceEdgePredefinition7AF3f8r2")
    protected List<ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 .KeyValueOfstringServiceEdgePredefinition7AF3F8R2> keyValueOfstringServiceEdgePredefinition7AF3F8R2;

    /**
     * Gets the value of the keyValueOfstringServiceEdgePredefinition7AF3F8R2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringServiceEdgePredefinition7AF3F8R2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringServiceEdgePredefinition7AF3F8R2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 .KeyValueOfstringServiceEdgePredefinition7AF3F8R2 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 .KeyValueOfstringServiceEdgePredefinition7AF3F8R2> getKeyValueOfstringServiceEdgePredefinition7AF3F8R2() {
        if (keyValueOfstringServiceEdgePredefinition7AF3F8R2 == null) {
            keyValueOfstringServiceEdgePredefinition7AF3F8R2 = new ArrayList<ArrayOfKeyValueOfstringServiceEdgePredefinition7AF3F8R2 .KeyValueOfstringServiceEdgePredefinition7AF3F8R2>();
        }
        return this.keyValueOfstringServiceEdgePredefinition7AF3F8R2;
    }


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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://www.sones.com}ServiceEdgePredefinition"/>
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
        "key",
        "value"
    })
    public static class KeyValueOfstringServiceEdgePredefinition7AF3F8R2 {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ServiceEdgePredefinition value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceEdgePredefinition }
         *     
         */
        public ServiceEdgePredefinition getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceEdgePredefinition }
         *     
         */
        public void setValue(ServiceEdgePredefinition value) {
            this.value = value;
        }

    }

}
