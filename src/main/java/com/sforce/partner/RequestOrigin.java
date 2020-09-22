
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestOrigin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestOrigin"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ListViewMetadata"/&gt;
 *     &lt;enumeration value="ListViewRecords"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestOrigin")
@XmlEnum
public enum RequestOrigin {

    @XmlEnumValue("ListViewMetadata")
    LIST_VIEW_METADATA("ListViewMetadata"),
    @XmlEnumValue("ListViewRecords")
    LIST_VIEW_RECORDS("ListViewRecords");
    private final String value;

    RequestOrigin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestOrigin fromValue(String v) {
        for (RequestOrigin c: RequestOrigin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
