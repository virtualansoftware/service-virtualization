
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UiType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Aloha"/&gt;
 *     &lt;enumeration value="Lightning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UiType")
@XmlEnum
public enum UiType {

    @XmlEnumValue("Aloha")
    ALOHA("Aloha"),
    @XmlEnumValue("Lightning")
    LIGHTNING("Lightning");
    private final String value;

    UiType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UiType fromValue(String v) {
        for (UiType c: UiType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
