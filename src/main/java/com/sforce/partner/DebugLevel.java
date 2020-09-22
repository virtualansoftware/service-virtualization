
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebugLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DebugLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DebugOnly"/&gt;
 *     &lt;enumeration value="Db"/&gt;
 *     &lt;enumeration value="Profiling"/&gt;
 *     &lt;enumeration value="Callout"/&gt;
 *     &lt;enumeration value="Detail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DebugLevel")
@XmlEnum
public enum DebugLevel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DebugOnly")
    DEBUG_ONLY("DebugOnly"),
    @XmlEnumValue("Db")
    DB("Db"),
    @XmlEnumValue("Profiling")
    PROFILING("Profiling"),
    @XmlEnumValue("Callout")
    CALLOUT("Callout"),
    @XmlEnumValue("Detail")
    DETAIL("Detail");
    private final String value;

    DebugLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DebugLevel fromValue(String v) {
        for (DebugLevel c: DebugLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
