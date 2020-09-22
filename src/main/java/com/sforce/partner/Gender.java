
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Gender"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Neuter"/&gt;
 *     &lt;enumeration value="Masculine"/&gt;
 *     &lt;enumeration value="Feminine"/&gt;
 *     &lt;enumeration value="AnimateMasculine"/&gt;
 *     &lt;enumeration value="ClassI"/&gt;
 *     &lt;enumeration value="ClassIII"/&gt;
 *     &lt;enumeration value="ClassV"/&gt;
 *     &lt;enumeration value="ClassVII"/&gt;
 *     &lt;enumeration value="ClassIX"/&gt;
 *     &lt;enumeration value="ClassXI"/&gt;
 *     &lt;enumeration value="ClassXIV"/&gt;
 *     &lt;enumeration value="ClassXV"/&gt;
 *     &lt;enumeration value="ClassXVI"/&gt;
 *     &lt;enumeration value="ClassXVII"/&gt;
 *     &lt;enumeration value="ClassXVIII"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Gender")
@XmlEnum
public enum Gender {

    @XmlEnumValue("Neuter")
    NEUTER("Neuter"),
    @XmlEnumValue("Masculine")
    MASCULINE("Masculine"),
    @XmlEnumValue("Feminine")
    FEMININE("Feminine"),
    @XmlEnumValue("AnimateMasculine")
    ANIMATE_MASCULINE("AnimateMasculine"),
    @XmlEnumValue("ClassI")
    CLASS_I("ClassI"),
    @XmlEnumValue("ClassIII")
    CLASS_III("ClassIII"),
    @XmlEnumValue("ClassV")
    CLASS_V("ClassV"),
    @XmlEnumValue("ClassVII")
    CLASS_VII("ClassVII"),
    @XmlEnumValue("ClassIX")
    CLASS_IX("ClassIX"),
    @XmlEnumValue("ClassXI")
    CLASS_XI("ClassXI"),
    @XmlEnumValue("ClassXIV")
    CLASS_XIV("ClassXIV"),
    @XmlEnumValue("ClassXV")
    CLASS_XV("ClassXV"),
    @XmlEnumValue("ClassXVI")
    CLASS_XVI("ClassXVI"),
    @XmlEnumValue("ClassXVII")
    CLASS_XVII("ClassXVII"),
    @XmlEnumValue("ClassXVIII")
    CLASS_XVIII("ClassXVIII");
    private final String value;

    Gender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Gender fromValue(String v) {
        for (Gender c: Gender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
