
package com.sones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceBinaryOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceBinaryOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equals"/>
 *     &lt;enumeration value="GreaterOrEqualsThan"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="InRange"/>
 *     &lt;enumeration value="LessOrEqualsThan"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="NotEquals"/>
 *     &lt;enumeration value="Like"/>
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceBinaryOperator")
@XmlEnum
public enum ServiceBinaryOperator {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("GreaterOrEqualsThan")
    GREATER_OR_EQUALS_THAN("GreaterOrEqualsThan"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("InRange")
    IN_RANGE("InRange"),
    @XmlEnumValue("LessOrEqualsThan")
    LESS_OR_EQUALS_THAN("LessOrEqualsThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("NotEquals")
    NOT_EQUALS("NotEquals"),
    @XmlEnumValue("Like")
    LIKE("Like"),
    AND("AND"),
    OR("OR");
    private final String value;

    ServiceBinaryOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceBinaryOperator fromValue(String v) {
        for (ServiceBinaryOperator c: ServiceBinaryOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
