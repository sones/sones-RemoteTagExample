
package com.sones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceQueryResult.ServiceResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceQueryResult.ServiceResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Successful"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceQueryResult.ServiceResultType")
@XmlEnum
public enum ServiceQueryResultServiceResultType {

    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    ServiceQueryResultServiceResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceQueryResultServiceResultType fromValue(String v) {
        for (ServiceQueryResultServiceResultType c: ServiceQueryResultServiceResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
