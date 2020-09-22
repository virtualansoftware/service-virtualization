
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentRetrievalOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentRetrievalOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="MetadataOnly"/&gt;
 *     &lt;enumeration value="MetadataWithBody"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachmentRetrievalOption")
@XmlEnum
public enum AttachmentRetrievalOption {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("MetadataOnly")
    METADATA_ONLY("MetadataOnly"),
    @XmlEnumValue("MetadataWithBody")
    METADATA_WITH_BODY("MetadataWithBody");
    private final String value;

    AttachmentRetrievalOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentRetrievalOption fromValue(String v) {
        for (AttachmentRetrievalOption c: AttachmentRetrievalOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
