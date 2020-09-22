
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listViewIsSoqlCompatible.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listViewIsSoqlCompatible"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRUE"/&gt;
 *     &lt;enumeration value="FALSE"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "listViewIsSoqlCompatible")
@XmlEnum
public enum ListViewIsSoqlCompatible {

    TRUE,
    FALSE,
    ALL;

    public String value() {
        return name();
    }

    public static ListViewIsSoqlCompatible fromValue(String v) {
        return valueOf(v);
    }

}
