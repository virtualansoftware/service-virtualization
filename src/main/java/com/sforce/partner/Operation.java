
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RetrieveTokens"/&gt;
 *     &lt;enumeration value="ErrorOnNewerVersion"/&gt;
 *     &lt;enumeration value="SkipOnSameVersion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Operation")
@XmlEnum
public enum Operation {

    @XmlEnumValue("RetrieveTokens")
    RETRIEVE_TOKENS("RetrieveTokens"),
    @XmlEnumValue("ErrorOnNewerVersion")
    ERROR_ON_NEWER_VERSION("ErrorOnNewerVersion"),
    @XmlEnumValue("SkipOnSameVersion")
    SKIP_ON_SAME_VERSION("SkipOnSameVersion");
    private final String value;

    Operation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Operation fromValue(String v) {
        for (Operation c: Operation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
