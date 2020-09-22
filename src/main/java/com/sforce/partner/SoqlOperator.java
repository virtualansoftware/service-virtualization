
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soqlOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="soqlOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="equals"/&gt;
 *     &lt;enumeration value="excludes"/&gt;
 *     &lt;enumeration value="greaterThan"/&gt;
 *     &lt;enumeration value="greaterThanOrEqualTo"/&gt;
 *     &lt;enumeration value="in"/&gt;
 *     &lt;enumeration value="includes"/&gt;
 *     &lt;enumeration value="lessThan"/&gt;
 *     &lt;enumeration value="lessThanOrEqualTo"/&gt;
 *     &lt;enumeration value="like"/&gt;
 *     &lt;enumeration value="notEquals"/&gt;
 *     &lt;enumeration value="notIn"/&gt;
 *     &lt;enumeration value="within"/&gt;
 *     &lt;enumeration value="notLike"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "soqlOperator")
@XmlEnum
public enum SoqlOperator {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("excludes")
    EXCLUDES("excludes"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("greaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("greaterThanOrEqualTo"),
    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("includes")
    INCLUDES("includes"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("lessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("lessThanOrEqualTo"),
    @XmlEnumValue("like")
    LIKE("like"),
    @XmlEnumValue("notEquals")
    NOT_EQUALS("notEquals"),
    @XmlEnumValue("notIn")
    NOT_IN("notIn"),
    @XmlEnumValue("within")
    WITHIN("within"),
    @XmlEnumValue("notLike")
    NOT_LIKE("notLike");
    private final String value;

    SoqlOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoqlOperator fromValue(String v) {
        for (SoqlOperator c: SoqlOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
