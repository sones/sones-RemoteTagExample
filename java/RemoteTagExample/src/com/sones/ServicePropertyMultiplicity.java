
package com.sones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicePropertyMultiplicity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServicePropertyMultiplicity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="List"/>
 *     &lt;enumeration value="Set"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServicePropertyMultiplicity")
@XmlEnum
public enum ServicePropertyMultiplicity {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("List")
    LIST("List"),
    @XmlEnumValue("Set")
    SET("Set");
    private final String value;

    ServicePropertyMultiplicity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServicePropertyMultiplicity fromValue(String v) {
        for (ServicePropertyMultiplicity c: ServicePropertyMultiplicity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
