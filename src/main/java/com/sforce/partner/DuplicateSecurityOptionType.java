
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateSecurityOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplicateSecurityOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EnforceSharingRules"/&gt;
 *     &lt;enumeration value="BypassSharingRules"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DuplicateSecurityOptionType")
@XmlEnum
public enum DuplicateSecurityOptionType {

    @XmlEnumValue("EnforceSharingRules")
    ENFORCE_SHARING_RULES("EnforceSharingRules"),
    @XmlEnumValue("BypassSharingRules")
    BYPASS_SHARING_RULES("BypassSharingRules");
    private final String value;

    DuplicateSecurityOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DuplicateSecurityOptionType fromValue(String v) {
        for (DuplicateSecurityOptionType c: DuplicateSecurityOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
