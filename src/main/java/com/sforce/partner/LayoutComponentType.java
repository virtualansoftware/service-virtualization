
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for layoutComponentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="layoutComponentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReportChart"/&gt;
 *     &lt;enumeration value="Field"/&gt;
 *     &lt;enumeration value="Separator"/&gt;
 *     &lt;enumeration value="SControl"/&gt;
 *     &lt;enumeration value="EmptySpace"/&gt;
 *     &lt;enumeration value="VisualforcePage"/&gt;
 *     &lt;enumeration value="ExpandedLookup"/&gt;
 *     &lt;enumeration value="AuraComponent"/&gt;
 *     &lt;enumeration value="Canvas"/&gt;
 *     &lt;enumeration value="CustomLink"/&gt;
 *     &lt;enumeration value="AnalyticsCloud"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "layoutComponentType")
@XmlEnum
public enum LayoutComponentType {

    @XmlEnumValue("ReportChart")
    REPORT_CHART("ReportChart"),
    @XmlEnumValue("Field")
    FIELD("Field"),
    @XmlEnumValue("Separator")
    SEPARATOR("Separator"),
    @XmlEnumValue("SControl")
    S_CONTROL("SControl"),
    @XmlEnumValue("EmptySpace")
    EMPTY_SPACE("EmptySpace"),
    @XmlEnumValue("VisualforcePage")
    VISUALFORCE_PAGE("VisualforcePage"),
    @XmlEnumValue("ExpandedLookup")
    EXPANDED_LOOKUP("ExpandedLookup"),
    @XmlEnumValue("AuraComponent")
    AURA_COMPONENT("AuraComponent"),
    @XmlEnumValue("Canvas")
    CANVAS("Canvas"),
    @XmlEnumValue("CustomLink")
    CUSTOM_LINK("CustomLink"),
    @XmlEnumValue("AnalyticsCloud")
    ANALYTICS_CLOUD("AnalyticsCloud");
    private final String value;

    LayoutComponentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayoutComponentType fromValue(String v) {
        for (LayoutComponentType c: LayoutComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
