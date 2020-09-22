
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerfOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerfOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="BASIC"/&gt;
 *     &lt;enumeration value="DETAILED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PerfOption")
@XmlEnum
public enum PerfOption {

    NONE,
    BASIC,
    DETAILED;

    public String value() {
        return name();
    }

    public static PerfOption fromValue(String v) {
        return valueOf(v);
    }

}
