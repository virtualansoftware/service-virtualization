
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailSyncDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailSyncDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Import"/&gt;
 *     &lt;enumeration value="Export"/&gt;
 *     &lt;enumeration value="Sync"/&gt;
 *     &lt;enumeration value="S2X"/&gt;
 *     &lt;enumeration value="X2S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailSyncDirection")
@XmlEnum
public enum EmailSyncDirection {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Import")
    IMPORT("Import"),
    @XmlEnumValue("Export")
    EXPORT("Export"),
    @XmlEnumValue("Sync")
    SYNC("Sync"),
    @XmlEnumValue("S2X")
    S_2_X("S2X"),
    @XmlEnumValue("X2S")
    X_2_S("X2S");
    private final String value;

    EmailSyncDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailSyncDirection fromValue(String v) {
        for (EmailSyncDirection c: EmailSyncDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
