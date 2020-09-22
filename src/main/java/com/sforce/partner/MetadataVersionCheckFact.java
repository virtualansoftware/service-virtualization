
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataVersionCheckFact.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetadataVersionCheckFact"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DescribeLayoutVersion"/&gt;
 *     &lt;enumeration value="DescribeSObjectVersion"/&gt;
 *     &lt;enumeration value="SystemConfigurationVersion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MetadataVersionCheckFact")
@XmlEnum
public enum MetadataVersionCheckFact {

    @XmlEnumValue("DescribeLayoutVersion")
    DESCRIBE_LAYOUT_VERSION("DescribeLayoutVersion"),
    @XmlEnumValue("DescribeSObjectVersion")
    DESCRIBE_S_OBJECT_VERSION("DescribeSObjectVersion"),
    @XmlEnumValue("SystemConfigurationVersion")
    SYSTEM_CONFIGURATION_VERSION("SystemConfigurationVersion");
    private final String value;

    MetadataVersionCheckFact(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetadataVersionCheckFact fromValue(String v) {
        for (MetadataVersionCheckFact c: MetadataVersionCheckFact.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
