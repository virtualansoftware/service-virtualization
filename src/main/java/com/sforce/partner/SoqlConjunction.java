
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soqlConjunction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="soqlConjunction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="and"/&gt;
 *     &lt;enumeration value="or"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "soqlConjunction")
@XmlEnum
public enum SoqlConjunction {

    @XmlEnumValue("and")
    AND("and"),
    @XmlEnumValue("or")
    OR("or");
    private final String value;

    SoqlConjunction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoqlConjunction fromValue(String v) {
        for (SoqlConjunction c: SoqlConjunction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
