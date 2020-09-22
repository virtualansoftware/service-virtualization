
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for differenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="differenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIFFERENT"/&gt;
 *     &lt;enumeration value="NULL"/&gt;
 *     &lt;enumeration value="SAME"/&gt;
 *     &lt;enumeration value="SIMILAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "differenceType")
@XmlEnum
public enum DifferenceType {

    DIFFERENT,
    NULL,
    SAME,
    SIMILAR;

    public String value() {
        return name();
    }

    public static DifferenceType fromValue(String v) {
        return valueOf(v);
    }

}
