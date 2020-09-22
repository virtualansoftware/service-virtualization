
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplicateActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Allow"/&gt;
 *     &lt;enumeration value="Block"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DuplicateActionType")
@XmlEnum
public enum DuplicateActionType {

    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("Block")
    BLOCK("Block");
    private final String value;

    DuplicateActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DuplicateActionType fromValue(String v) {
        for (DuplicateActionType c: DuplicateActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
