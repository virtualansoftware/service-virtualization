
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexipageContextTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlexipageContextTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENTITYNAME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlexipageContextTypeEnum")
@XmlEnum
public enum FlexipageContextTypeEnum {

    ENTITYNAME;

    public String value() {
        return name();
    }

    public static FlexipageContextTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
