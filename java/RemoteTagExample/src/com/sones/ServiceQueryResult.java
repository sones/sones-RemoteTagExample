
package com.sones;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceQueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceQueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameOfQueryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfAffectedVertices" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vertices" type="{http://www.sones.com}ArrayOfServiceVertexView" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceQueryResult", propOrder = {
    "duration",
    "error",
    "nameOfQueryLanguage",
    "numberOfAffectedVertices",
    "query",
    "typeOfResult",
    "vertices"
})
public class ServiceQueryResult {

    @XmlElement(name = "Duration")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger duration;
    @XmlElement(name = "Error", nillable = true)
    protected String error;
    @XmlElement(name = "NameOfQueryLanguage", nillable = true)
    protected String nameOfQueryLanguage;
    @XmlElement(name = "NumberOfAffectedVertices")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger numberOfAffectedVertices;
    @XmlElement(name = "Query", nillable = true)
    protected String query;
    @XmlElement(name = "TypeOfResult", nillable = true)
    protected String typeOfResult;
    @XmlElement(name = "Vertices", nillable = true)
    protected ArrayOfServiceVertexView vertices;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the nameOfQueryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfQueryLanguage() {
        return nameOfQueryLanguage;
    }

    /**
     * Sets the value of the nameOfQueryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfQueryLanguage(String value) {
        this.nameOfQueryLanguage = value;
    }

    /**
     * Gets the value of the numberOfAffectedVertices property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAffectedVertices() {
        return numberOfAffectedVertices;
    }

    /**
     * Sets the value of the numberOfAffectedVertices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAffectedVertices(BigInteger value) {
        this.numberOfAffectedVertices = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the typeOfResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfResult() {
        return typeOfResult;
    }

    /**
     * Sets the value of the typeOfResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfResult(String value) {
        this.typeOfResult = value;
    }

    /**
     * Gets the value of the vertices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceVertexView }
     *     
     */
    public ArrayOfServiceVertexView getVertices() {
        return vertices;
    }

    /**
     * Sets the value of the vertices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceVertexView }
     *     
     */
    public void setVertices(ArrayOfServiceVertexView value) {
        this.vertices = value;
    }

}
