
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Db"/&gt;
 *     &lt;enumeration value="Workflow"/&gt;
 *     &lt;enumeration value="Validation"/&gt;
 *     &lt;enumeration value="Callout"/&gt;
 *     &lt;enumeration value="Apex_code"/&gt;
 *     &lt;enumeration value="Apex_profiling"/&gt;
 *     &lt;enumeration value="Visualforce"/&gt;
 *     &lt;enumeration value="System"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogCategory")
@XmlEnum
public enum LogCategory {

    @XmlEnumValue("Db")
    DB("Db"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow"),
    @XmlEnumValue("Validation")
    VALIDATION("Validation"),
    @XmlEnumValue("Callout")
    CALLOUT("Callout"),
    @XmlEnumValue("Apex_code")
    APEX_CODE("Apex_code"),
    @XmlEnumValue("Apex_profiling")
    APEX_PROFILING("Apex_profiling"),
    @XmlEnumValue("Visualforce")
    VISUALFORCE("Visualforce"),
    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    LogCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogCategory fromValue(String v) {
        for (LogCategory c: LogCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
