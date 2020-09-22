
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailSyncMatchPreference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailSyncMatchPreference"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LastModified"/&gt;
 *     &lt;enumeration value="LastActivity"/&gt;
 *     &lt;enumeration value="Oldest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailSyncMatchPreference")
@XmlEnum
public enum EmailSyncMatchPreference {

    @XmlEnumValue("LastModified")
    LAST_MODIFIED("LastModified"),
    @XmlEnumValue("LastActivity")
    LAST_ACTIVITY("LastActivity"),
    @XmlEnumValue("Oldest")
    OLDEST("Oldest");
    private final String value;

    EmailSyncMatchPreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailSyncMatchPreference fromValue(String v) {
        for (EmailSyncMatchPreference c: EmailSyncMatchPreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
