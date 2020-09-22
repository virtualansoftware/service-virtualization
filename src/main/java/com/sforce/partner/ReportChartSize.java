
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportChartSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportChartSize"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMALL"/&gt;
 *     &lt;enumeration value="MEDIUM"/&gt;
 *     &lt;enumeration value="LARGE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportChartSize")
@XmlEnum
public enum ReportChartSize {

    SMALL,
    MEDIUM,
    LARGE;

    public String value() {
        return name();
    }

    public static ReportChartSize fromValue(String v) {
        return valueOf(v);
    }

}
