
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedLayoutFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedLayoutFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AllUpdates"/&gt;
 *     &lt;enumeration value="FeedItemType"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeedLayoutFilterType")
@XmlEnum
public enum FeedLayoutFilterType {

    @XmlEnumValue("AllUpdates")
    ALL_UPDATES("AllUpdates"),
    @XmlEnumValue("FeedItemType")
    FEED_ITEM_TYPE("FeedItemType"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    FeedLayoutFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedLayoutFilterType fromValue(String v) {
        for (FeedLayoutFilterType c: FeedLayoutFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
