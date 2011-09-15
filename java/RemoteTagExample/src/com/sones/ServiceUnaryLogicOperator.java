
package com.sones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceUnaryLogicOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceUnaryLogicOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Not"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceUnaryLogicOperator")
@XmlEnum
public enum ServiceUnaryLogicOperator {

    @XmlEnumValue("Not")
    NOT("Not");
    private final String value;

    ServiceUnaryLogicOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceUnaryLogicOperator fromValue(String v) {
        for (ServiceUnaryLogicOperator c: ServiceUnaryLogicOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
