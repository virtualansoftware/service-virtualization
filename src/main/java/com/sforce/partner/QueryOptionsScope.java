
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryOptionsScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="queryOptionsScope"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Briefcase"/&gt;
 *     &lt;enumeration value="Mine"/&gt;
 *     &lt;enumeration value="Mru"/&gt;
 *     &lt;enumeration value="ContactList"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "queryOptionsScope")
@XmlEnum
public enum QueryOptionsScope {

    @XmlEnumValue("Briefcase")
    BRIEFCASE("Briefcase"),
    @XmlEnumValue("Mine")
    MINE("Mine"),
    @XmlEnumValue("Mru")
    MRU("Mru"),
    @XmlEnumValue("ContactList")
    CONTACT_LIST("ContactList");
    private final String value;

    QueryOptionsScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryOptionsScope fromValue(String v) {
        for (QueryOptionsScope c: QueryOptionsScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
