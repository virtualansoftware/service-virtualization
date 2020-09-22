
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentInstancePropertyTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComponentInstancePropertyTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="decorator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComponentInstancePropertyTypeEnum")
@XmlEnum
public enum ComponentInstancePropertyTypeEnum {

    @XmlEnumValue("decorator")
    DECORATOR("decorator");
    private final String value;

    ComponentInstancePropertyTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComponentInstancePropertyTypeEnum fromValue(String v) {
        for (ComponentInstancePropertyTypeEnum c: ComponentInstancePropertyTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
