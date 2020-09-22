
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailPriority"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Highest"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Lowest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailPriority")
@XmlEnum
public enum EmailPriority {

    @XmlEnumValue("Highest")
    HIGHEST("Highest"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Lowest")
    LOWEST("Lowest");
    private final String value;

    EmailPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailPriority fromValue(String v) {
        for (EmailPriority c: EmailPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
