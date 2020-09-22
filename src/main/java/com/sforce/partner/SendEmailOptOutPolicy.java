
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendEmailOptOutPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SendEmailOptOutPolicy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEND"/&gt;
 *     &lt;enumeration value="FILTER"/&gt;
 *     &lt;enumeration value="REJECT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SendEmailOptOutPolicy")
@XmlEnum
public enum SendEmailOptOutPolicy {

    SEND,
    FILTER,
    REJECT;

    public String value() {
        return name();
    }

    public static SendEmailOptOutPolicy fromValue(String v) {
        return valueOf(v);
    }

}
