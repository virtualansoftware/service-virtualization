
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for briefcaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="briefcaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BriefcaseAndAccount"/&gt;
 *     &lt;enumeration value="BriefcaseAndActivity"/&gt;
 *     &lt;enumeration value="BriefcaseAndOpportunity"/&gt;
 *     &lt;enumeration value="Briefcase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "briefcaseType")
@XmlEnum
public enum BriefcaseType {

    @XmlEnumValue("BriefcaseAndAccount")
    BRIEFCASE_AND_ACCOUNT("BriefcaseAndAccount"),
    @XmlEnumValue("BriefcaseAndActivity")
    BRIEFCASE_AND_ACTIVITY("BriefcaseAndActivity"),
    @XmlEnumValue("BriefcaseAndOpportunity")
    BRIEFCASE_AND_OPPORTUNITY("BriefcaseAndOpportunity"),
    @XmlEnumValue("Briefcase")
    BRIEFCASE("Briefcase");
    private final String value;

    BriefcaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BriefcaseType fromValue(String v) {
        for (BriefcaseType c: BriefcaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
