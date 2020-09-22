
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebLinkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="url"/&gt;
 *     &lt;enumeration value="sControl"/&gt;
 *     &lt;enumeration value="javascript"/&gt;
 *     &lt;enumeration value="page"/&gt;
 *     &lt;enumeration value="flow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WebLinkType")
@XmlEnum
public enum WebLinkType {

    @XmlEnumValue("url")
    URL("url"),
    @XmlEnumValue("sControl")
    S_CONTROL("sControl"),
    @XmlEnumValue("javascript")
    JAVASCRIPT("javascript"),
    @XmlEnumValue("page")
    PAGE("page"),
    @XmlEnumValue("flow")
    FLOW("flow");
    private final String value;

    WebLinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLinkType fromValue(String v) {
        for (WebLinkType c: WebLinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
