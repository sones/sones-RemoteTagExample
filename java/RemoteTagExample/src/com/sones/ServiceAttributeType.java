
package com.sones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Property"/>
 *     &lt;enumeration value="IncomingEdge"/>
 *     &lt;enumeration value="OutgoingEdge"/>
 *     &lt;enumeration value="BinaryProperty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceAttributeType")
@XmlEnum
public enum ServiceAttributeType {

    @XmlEnumValue("Property")
    PROPERTY("Property"),
    @XmlEnumValue("IncomingEdge")
    INCOMING_EDGE("IncomingEdge"),
    @XmlEnumValue("OutgoingEdge")
    OUTGOING_EDGE("OutgoingEdge"),
    @XmlEnumValue("BinaryProperty")
    BINARY_PROPERTY("BinaryProperty");
    private final String value;

    ServiceAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceAttributeType fromValue(String v) {
        for (ServiceAttributeType c: ServiceAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
