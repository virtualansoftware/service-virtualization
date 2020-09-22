
package com.sforce.apex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Debugonly"/&gt;
 *     &lt;enumeration value="Db"/&gt;
 *     &lt;enumeration value="Profiling"/&gt;
 *     &lt;enumeration value="Callout"/&gt;
 *     &lt;enumeration value="Detail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogType")
@XmlEnum
public enum LogType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Debugonly")
    DEBUGONLY("Debugonly"),
    @XmlEnumValue("Db")
    DB("Db"),
    @XmlEnumValue("Profiling")
    PROFILING("Profiling"),
    @XmlEnumValue("Callout")
    CALLOUT("Callout"),
    @XmlEnumValue("Detail")
    DETAIL("Detail");
    private final String value;

    LogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogType fromValue(String v) {
        for (LogType c: LogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
