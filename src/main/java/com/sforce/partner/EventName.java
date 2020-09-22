
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ListViewEvent"/&gt;
 *     &lt;enumeration value="LightningURIEvent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventName")
@XmlEnum
public enum EventName {

    @XmlEnumValue("ListViewEvent")
    LIST_VIEW_EVENT("ListViewEvent"),
    @XmlEnumValue("LightningURIEvent")
    LIGHTNING_URI_EVENT("LightningURIEvent");
    private final String value;

    EventName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventName fromValue(String v) {
        for (EventName c: EventName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
