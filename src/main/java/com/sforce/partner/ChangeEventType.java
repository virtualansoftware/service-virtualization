
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="changeEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREATE"/&gt;
 *     &lt;enumeration value="UPDATE"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *     &lt;enumeration value="UNDELETE"/&gt;
 *     &lt;enumeration value="GAP_CREATE"/&gt;
 *     &lt;enumeration value="GAP_UPDATE"/&gt;
 *     &lt;enumeration value="GAP_DELETE"/&gt;
 *     &lt;enumeration value="GAP_UNDELETE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "changeEventType")
@XmlEnum
public enum ChangeEventType {

    CREATE,
    UPDATE,
    DELETE,
    UNDELETE,
    GAP_CREATE,
    GAP_UPDATE,
    GAP_DELETE,
    GAP_UNDELETE;

    public String value() {
        return name();
    }

    public static ChangeEventType fromValue(String v) {
        return valueOf(v);
    }

}
