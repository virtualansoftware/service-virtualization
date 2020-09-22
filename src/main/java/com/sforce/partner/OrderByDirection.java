
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderByDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderByDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ascending"/&gt;
 *     &lt;enumeration value="descending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "orderByDirection")
@XmlEnum
public enum OrderByDirection {

    @XmlEnumValue("ascending")
    ASCENDING("ascending"),
    @XmlEnumValue("descending")
    DESCENDING("descending");
    private final String value;

    OrderByDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderByDirection fromValue(String v) {
        for (OrderByDirection c: OrderByDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
