
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="picklist"/&gt;
 *     &lt;enumeration value="multipicklist"/&gt;
 *     &lt;enumeration value="combobox"/&gt;
 *     &lt;enumeration value="reference"/&gt;
 *     &lt;enumeration value="base64"/&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="currency"/&gt;
 *     &lt;enumeration value="textarea"/&gt;
 *     &lt;enumeration value="int"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *     &lt;enumeration value="percent"/&gt;
 *     &lt;enumeration value="phone"/&gt;
 *     &lt;enumeration value="id"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="datetime"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="url"/&gt;
 *     &lt;enumeration value="email"/&gt;
 *     &lt;enumeration value="encryptedstring"/&gt;
 *     &lt;enumeration value="datacategorygroupreference"/&gt;
 *     &lt;enumeration value="location"/&gt;
 *     &lt;enumeration value="address"/&gt;
 *     &lt;enumeration value="anyType"/&gt;
 *     &lt;enumeration value="json"/&gt;
 *     &lt;enumeration value="complexvalue"/&gt;
 *     &lt;enumeration value="long"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fieldType")
@XmlEnum
public enum FieldType {

    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("picklist")
    PICKLIST("picklist"),
    @XmlEnumValue("multipicklist")
    MULTIPICKLIST("multipicklist"),
    @XmlEnumValue("combobox")
    COMBOBOX("combobox"),
    @XmlEnumValue("reference")
    REFERENCE("reference"),
    @XmlEnumValue("base64")
    BASE_64("base64"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("currency")
    CURRENCY("currency"),
    @XmlEnumValue("textarea")
    TEXTAREA("textarea"),
    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("percent")
    PERCENT("percent"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("id")
    ID("id"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("url")
    URL("url"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("encryptedstring")
    ENCRYPTEDSTRING("encryptedstring"),
    @XmlEnumValue("datacategorygroupreference")
    DATACATEGORYGROUPREFERENCE("datacategorygroupreference"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("anyType")
    ANY_TYPE("anyType"),
    @XmlEnumValue("json")
    JSON("json"),
    @XmlEnumValue("complexvalue")
    COMPLEXVALUE("complexvalue"),
    @XmlEnumValue("long")
    LONG("long");
    private final String value;

    FieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldType fromValue(String v) {
        for (FieldType c: FieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
