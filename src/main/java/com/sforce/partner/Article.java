
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Article.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Article"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Indefinite"/&gt;
 *     &lt;enumeration value="Definite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Article")
@XmlEnum
public enum Article {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Indefinite")
    INDEFINITE("Indefinite"),
    @XmlEnumValue("Definite")
    DEFINITE("Definite");
    private final String value;

    Article(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Article fromValue(String v) {
        for (Article c: Article.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
