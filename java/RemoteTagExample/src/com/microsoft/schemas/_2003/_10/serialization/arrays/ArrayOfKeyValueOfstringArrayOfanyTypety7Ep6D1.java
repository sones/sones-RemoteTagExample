
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringArrayOfanyTypety7Ep6D1" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType"/>
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
@XmlType(name = "ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1", propOrder = {
    "keyValueOfstringArrayOfanyTypety7Ep6D1"
})
public class ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 {

    @XmlElement(name = "KeyValueOfstringArrayOfanyTypety7Ep6D1")
    protected List<ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 .KeyValueOfstringArrayOfanyTypety7Ep6D1> keyValueOfstringArrayOfanyTypety7Ep6D1;

    /**
     * Gets the value of the keyValueOfstringArrayOfanyTypety7Ep6D1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringArrayOfanyTypety7Ep6D1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringArrayOfanyTypety7Ep6D1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 .KeyValueOfstringArrayOfanyTypety7Ep6D1 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 .KeyValueOfstringArrayOfanyTypety7Ep6D1> getKeyValueOfstringArrayOfanyTypety7Ep6D1() {
        if (keyValueOfstringArrayOfanyTypety7Ep6D1 == null) {
            keyValueOfstringArrayOfanyTypety7Ep6D1 = new ArrayList<ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 .KeyValueOfstringArrayOfanyTypety7Ep6D1>();
        }
        return this.keyValueOfstringArrayOfanyTypety7Ep6D1;
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
     *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType"/>
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
    public static class KeyValueOfstringArrayOfanyTypety7Ep6D1 {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfanyType value;

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
         *     {@link ArrayOfanyType }
         *     
         */
        public ArrayOfanyType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfanyType }
         *     
         */
        public void setValue(ArrayOfanyType value) {
            this.value = value;
        }

    }

}
