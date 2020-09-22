
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerChangeOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnerChangeOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EnforceNewOwnerHasReadAccess"/&gt;
 *     &lt;enumeration value="TransferOpenActivities"/&gt;
 *     &lt;enumeration value="TransferNotesAndAttachments"/&gt;
 *     &lt;enumeration value="TransferOthersOpenOpportunities"/&gt;
 *     &lt;enumeration value="TransferOwnedOpenOpportunities"/&gt;
 *     &lt;enumeration value="TransferOwnedClosedOpportunities"/&gt;
 *     &lt;enumeration value="TransferOwnedOpenCases"/&gt;
 *     &lt;enumeration value="TransferAllOwnedCases"/&gt;
 *     &lt;enumeration value="TransferContracts"/&gt;
 *     &lt;enumeration value="TransferOrders"/&gt;
 *     &lt;enumeration value="TransferContacts"/&gt;
 *     &lt;enumeration value="KeepAccountTeam"/&gt;
 *     &lt;enumeration value="KeepSalesTeam"/&gt;
 *     &lt;enumeration value="KeepSalesTeamGrantCurrentOwnerReadWriteAccess"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OwnerChangeOptionType")
@XmlEnum
public enum OwnerChangeOptionType {

    @XmlEnumValue("EnforceNewOwnerHasReadAccess")
    ENFORCE_NEW_OWNER_HAS_READ_ACCESS("EnforceNewOwnerHasReadAccess"),
    @XmlEnumValue("TransferOpenActivities")
    TRANSFER_OPEN_ACTIVITIES("TransferOpenActivities"),
    @XmlEnumValue("TransferNotesAndAttachments")
    TRANSFER_NOTES_AND_ATTACHMENTS("TransferNotesAndAttachments"),
    @XmlEnumValue("TransferOthersOpenOpportunities")
    TRANSFER_OTHERS_OPEN_OPPORTUNITIES("TransferOthersOpenOpportunities"),
    @XmlEnumValue("TransferOwnedOpenOpportunities")
    TRANSFER_OWNED_OPEN_OPPORTUNITIES("TransferOwnedOpenOpportunities"),
    @XmlEnumValue("TransferOwnedClosedOpportunities")
    TRANSFER_OWNED_CLOSED_OPPORTUNITIES("TransferOwnedClosedOpportunities"),
    @XmlEnumValue("TransferOwnedOpenCases")
    TRANSFER_OWNED_OPEN_CASES("TransferOwnedOpenCases"),
    @XmlEnumValue("TransferAllOwnedCases")
    TRANSFER_ALL_OWNED_CASES("TransferAllOwnedCases"),
    @XmlEnumValue("TransferContracts")
    TRANSFER_CONTRACTS("TransferContracts"),
    @XmlEnumValue("TransferOrders")
    TRANSFER_ORDERS("TransferOrders"),
    @XmlEnumValue("TransferContacts")
    TRANSFER_CONTACTS("TransferContacts"),
    @XmlEnumValue("KeepAccountTeam")
    KEEP_ACCOUNT_TEAM("KeepAccountTeam"),
    @XmlEnumValue("KeepSalesTeam")
    KEEP_SALES_TEAM("KeepSalesTeam"),
    @XmlEnumValue("KeepSalesTeamGrantCurrentOwnerReadWriteAccess")
    KEEP_SALES_TEAM_GRANT_CURRENT_OWNER_READ_WRITE_ACCESS("KeepSalesTeamGrantCurrentOwnerReadWriteAccess");
    private final String value;

    OwnerChangeOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnerChangeOptionType fromValue(String v) {
        for (OwnerChangeOptionType c: OwnerChangeOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
