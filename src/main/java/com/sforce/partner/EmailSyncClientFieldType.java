
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailSyncClientFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailSyncClientFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="datetime"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="int"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="picklist"/&gt;
 *     &lt;enumeration value="reference"/&gt;
 *     &lt;enumeration value="EventSensitivityType"/&gt;
 *     &lt;enumeration value="ReminderType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailSyncClientFieldType")
@XmlEnum
public enum EmailSyncClientFieldType {

    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("picklist")
    PICKLIST("picklist"),
    @XmlEnumValue("reference")
    REFERENCE("reference"),
    @XmlEnumValue("EventSensitivityType")
    EVENT_SENSITIVITY_TYPE("EventSensitivityType"),
    @XmlEnumValue("ReminderType")
    REMINDER_TYPE("ReminderType");
    private final String value;

    EmailSyncClientFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailSyncClientFieldType fromValue(String v) {
        for (EmailSyncClientFieldType c: EmailSyncClientFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
