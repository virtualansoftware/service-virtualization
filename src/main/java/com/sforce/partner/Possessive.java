
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Possessive.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Possessive"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="First"/&gt;
 *     &lt;enumeration value="Second"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Possessive")
@XmlEnum
public enum Possessive {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Second")
    SECOND("Second");
    private final String value;

    Possessive(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Possessive fromValue(String v) {
        for (Possessive c: Possessive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
