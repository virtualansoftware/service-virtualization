
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailSyncConflictResolution.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailSyncConflictResolution"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SFDCWins"/&gt;
 *     &lt;enumeration value="ClientWins"/&gt;
 *     &lt;enumeration value="ServerWins"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailSyncConflictResolution")
@XmlEnum
public enum EmailSyncConflictResolution {

    @XmlEnumValue("SFDCWins")
    SFDC_WINS("SFDCWins"),
    @XmlEnumValue("ClientWins")
    CLIENT_WINS("ClientWins"),
    @XmlEnumValue("ServerWins")
    SERVER_WINS("ServerWins");
    private final String value;

    EmailSyncConflictResolution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailSyncConflictResolution fromValue(String v) {
        for (EmailSyncConflictResolution c: EmailSyncConflictResolution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
