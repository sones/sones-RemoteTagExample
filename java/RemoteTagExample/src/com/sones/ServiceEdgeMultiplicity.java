
package com.sones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceEdgeMultiplicity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceEdgeMultiplicity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleEdge"/>
 *     &lt;enumeration value="MultiEdge"/>
 *     &lt;enumeration value="HyperEdge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceEdgeMultiplicity")
@XmlEnum
public enum ServiceEdgeMultiplicity {

    @XmlEnumValue("SingleEdge")
    SINGLE_EDGE("SingleEdge"),
    @XmlEnumValue("MultiEdge")
    MULTI_EDGE("MultiEdge"),
    @XmlEnumValue("HyperEdge")
    HYPER_EDGE("HyperEdge");
    private final String value;

    ServiceEdgeMultiplicity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceEdgeMultiplicity fromValue(String v) {
        for (ServiceEdgeMultiplicity c: ServiceEdgeMultiplicity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
