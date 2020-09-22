
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogCategoryLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogCategoryLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Finest"/&gt;
 *     &lt;enumeration value="Finer"/&gt;
 *     &lt;enumeration value="Fine"/&gt;
 *     &lt;enumeration value="Debug"/&gt;
 *     &lt;enumeration value="Info"/&gt;
 *     &lt;enumeration value="Warn"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogCategoryLevel")
@XmlEnum
public enum LogCategoryLevel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Finest")
    FINEST("Finest"),
    @XmlEnumValue("Finer")
    FINER("Finer"),
    @XmlEnumValue("Fine")
    FINE("Fine"),
    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Warn")
    WARN("Warn"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    LogCategoryLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogCategoryLevel fromValue(String v) {
        for (LogCategoryLevel c: LogCategoryLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
