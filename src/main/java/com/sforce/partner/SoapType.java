
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="soapType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tns:ID"/&gt;
 *     &lt;enumeration value="xsd:base64Binary"/&gt;
 *     &lt;enumeration value="xsd:boolean"/&gt;
 *     &lt;enumeration value="xsd:double"/&gt;
 *     &lt;enumeration value="xsd:int"/&gt;
 *     &lt;enumeration value="xsd:string"/&gt;
 *     &lt;enumeration value="xsd:date"/&gt;
 *     &lt;enumeration value="xsd:dateTime"/&gt;
 *     &lt;enumeration value="xsd:time"/&gt;
 *     &lt;enumeration value="tns:location"/&gt;
 *     &lt;enumeration value="tns:address"/&gt;
 *     &lt;enumeration value="xsd:anyType"/&gt;
 *     &lt;enumeration value="tns:json"/&gt;
 *     &lt;enumeration value="urn:RelationshipReferenceTo"/&gt;
 *     &lt;enumeration value="urn:JunctionIdListNames"/&gt;
 *     &lt;enumeration value="urn:SearchLayoutFieldsDisplayed"/&gt;
 *     &lt;enumeration value="urn:SearchLayoutField"/&gt;
 *     &lt;enumeration value="urn:SearchLayoutButtonsDisplayed"/&gt;
 *     &lt;enumeration value="urn:SearchLayoutButton"/&gt;
 *     &lt;enumeration value="urn:RecordTypesSupported"/&gt;
 *     &lt;enumeration value="tns:FieldCriteria"/&gt;
 *     &lt;enumeration value="tns:FieldCriterion"/&gt;
 *     &lt;enumeration value="tns:DurableIdList"/&gt;
 *     &lt;enumeration value="tns:StringList"/&gt;
 *     &lt;enumeration value="tns:ChangeEventHeader"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "soapType")
@XmlEnum
public enum SoapType {

    @XmlEnumValue("tns:ID")
    TNS_ID("tns:ID"),
    @XmlEnumValue("xsd:base64Binary")
    XSD_BASE_64_BINARY("xsd:base64Binary"),
    @XmlEnumValue("xsd:boolean")
    XSD_BOOLEAN("xsd:boolean"),
    @XmlEnumValue("xsd:double")
    XSD_DOUBLE("xsd:double"),
    @XmlEnumValue("xsd:int")
    XSD_INT("xsd:int"),
    @XmlEnumValue("xsd:string")
    XSD_STRING("xsd:string"),
    @XmlEnumValue("xsd:date")
    XSD_DATE("xsd:date"),
    @XmlEnumValue("xsd:dateTime")
    XSD_DATE_TIME("xsd:dateTime"),
    @XmlEnumValue("xsd:time")
    XSD_TIME("xsd:time"),
    @XmlEnumValue("tns:location")
    TNS_LOCATION("tns:location"),
    @XmlEnumValue("tns:address")
    TNS_ADDRESS("tns:address"),
    @XmlEnumValue("xsd:anyType")
    XSD_ANY_TYPE("xsd:anyType"),
    @XmlEnumValue("tns:json")
    TNS_JSON("tns:json"),
    @XmlEnumValue("urn:RelationshipReferenceTo")
    URN_RELATIONSHIP_REFERENCE_TO("urn:RelationshipReferenceTo"),
    @XmlEnumValue("urn:JunctionIdListNames")
    URN_JUNCTION_ID_LIST_NAMES("urn:JunctionIdListNames"),
    @XmlEnumValue("urn:SearchLayoutFieldsDisplayed")
    URN_SEARCH_LAYOUT_FIELDS_DISPLAYED("urn:SearchLayoutFieldsDisplayed"),
    @XmlEnumValue("urn:SearchLayoutField")
    URN_SEARCH_LAYOUT_FIELD("urn:SearchLayoutField"),
    @XmlEnumValue("urn:SearchLayoutButtonsDisplayed")
    URN_SEARCH_LAYOUT_BUTTONS_DISPLAYED("urn:SearchLayoutButtonsDisplayed"),
    @XmlEnumValue("urn:SearchLayoutButton")
    URN_SEARCH_LAYOUT_BUTTON("urn:SearchLayoutButton"),
    @XmlEnumValue("urn:RecordTypesSupported")
    URN_RECORD_TYPES_SUPPORTED("urn:RecordTypesSupported"),
    @XmlEnumValue("tns:FieldCriteria")
    TNS_FIELD_CRITERIA("tns:FieldCriteria"),
    @XmlEnumValue("tns:FieldCriterion")
    TNS_FIELD_CRITERION("tns:FieldCriterion"),
    @XmlEnumValue("tns:DurableIdList")
    TNS_DURABLE_ID_LIST("tns:DurableIdList"),
    @XmlEnumValue("tns:StringList")
    TNS_STRING_LIST("tns:StringList"),
    @XmlEnumValue("tns:ChangeEventHeader")
    TNS_CHANGE_EVENT_HEADER("tns:ChangeEventHeader");
    private final String value;

    SoapType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapType fromValue(String v) {
        for (SoapType c: SoapType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
