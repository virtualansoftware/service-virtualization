
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareAccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareAccessLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Read"/&gt;
 *     &lt;enumeration value="Edit"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShareAccessLevel")
@XmlEnum
public enum ShareAccessLevel {

    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Edit")
    EDIT("Edit"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ShareAccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareAccessLevel fromValue(String v) {
        for (ShareAccessLevel c: ShareAccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
