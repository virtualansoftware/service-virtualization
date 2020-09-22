
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLinkPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebLinkPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fullScreen"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="topLeft"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WebLinkPosition")
@XmlEnum
public enum WebLinkPosition {

    @XmlEnumValue("fullScreen")
    FULL_SCREEN("fullScreen"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("topLeft")
    TOP_LEFT("topLeft");
    private final String value;

    WebLinkPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLinkPosition fromValue(String v) {
        for (WebLinkPosition c: WebLinkPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
