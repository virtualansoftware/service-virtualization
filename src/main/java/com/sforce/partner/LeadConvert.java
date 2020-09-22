
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for LeadConvert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadConvert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="accountRecord" type="{urn:sobject.partner.soap.sforce.com}sObject"/&gt;
 *         &lt;element name="bypassAccountDedupeCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bypassContactDedupeCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contactId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="contactRecord" type="{urn:sobject.partner.soap.sforce.com}sObject"/&gt;
 *         &lt;element name="convertedStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="doNotCreateOpportunity" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="leadId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="opportunityId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="opportunityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="opportunityRecord" type="{urn:sobject.partner.soap.sforce.com}sObject"/&gt;
 *         &lt;element name="overwriteLeadSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ownerId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="sendNotificationEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeadConvert", propOrder = {
    "accountId",
    "accountRecord",
    "bypassAccountDedupeCheck",
    "bypassContactDedupeCheck",
    "contactId",
    "contactRecord",
    "convertedStatus",
    "doNotCreateOpportunity",
    "leadId",
    "opportunityId",
    "opportunityName",
    "opportunityRecord",
    "overwriteLeadSource",
    "ownerId",
    "sendNotificationEmail"
})
public class LeadConvert
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String accountId;
    @XmlElement(required = true, nillable = true)
    protected SObject accountRecord;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean bypassAccountDedupeCheck;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean bypassContactDedupeCheck;
    @XmlElement(required = true, nillable = true)
    protected String contactId;
    @XmlElement(required = true, nillable = true)
    protected SObject contactRecord;
    @XmlElement(required = true)
    protected String convertedStatus;
    protected boolean doNotCreateOpportunity;
    @XmlElement(required = true)
    protected String leadId;
    @XmlElement(required = true, nillable = true)
    protected String opportunityId;
    @XmlElement(required = true, nillable = true)
    protected String opportunityName;
    @XmlElement(required = true, nillable = true)
    protected SObject opportunityRecord;
    protected boolean overwriteLeadSource;
    @XmlElement(required = true, nillable = true)
    protected String ownerId;
    protected boolean sendNotificationEmail;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getAccountRecord() {
        return accountRecord;
    }

    /**
     * Sets the value of the accountRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setAccountRecord(SObject value) {
        this.accountRecord = value;
    }

    /**
     * Gets the value of the bypassAccountDedupeCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassAccountDedupeCheck() {
        return bypassAccountDedupeCheck;
    }

    /**
     * Sets the value of the bypassAccountDedupeCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassAccountDedupeCheck(Boolean value) {
        this.bypassAccountDedupeCheck = value;
    }

    /**
     * Gets the value of the bypassContactDedupeCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassContactDedupeCheck() {
        return bypassContactDedupeCheck;
    }

    /**
     * Sets the value of the bypassContactDedupeCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassContactDedupeCheck(Boolean value) {
        this.bypassContactDedupeCheck = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getContactRecord() {
        return contactRecord;
    }

    /**
     * Sets the value of the contactRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setContactRecord(SObject value) {
        this.contactRecord = value;
    }

    /**
     * Gets the value of the convertedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertedStatus() {
        return convertedStatus;
    }

    /**
     * Sets the value of the convertedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertedStatus(String value) {
        this.convertedStatus = value;
    }

    /**
     * Gets the value of the doNotCreateOpportunity property.
     * 
     */
    public boolean isDoNotCreateOpportunity() {
        return doNotCreateOpportunity;
    }

    /**
     * Sets the value of the doNotCreateOpportunity property.
     * 
     */
    public void setDoNotCreateOpportunity(boolean value) {
        this.doNotCreateOpportunity = value;
    }

    /**
     * Gets the value of the leadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadId() {
        return leadId;
    }

    /**
     * Sets the value of the leadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadId(String value) {
        this.leadId = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityId(String value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the opportunityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityName() {
        return opportunityName;
    }

    /**
     * Sets the value of the opportunityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityName(String value) {
        this.opportunityName = value;
    }

    /**
     * Gets the value of the opportunityRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getOpportunityRecord() {
        return opportunityRecord;
    }

    /**
     * Sets the value of the opportunityRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setOpportunityRecord(SObject value) {
        this.opportunityRecord = value;
    }

    /**
     * Gets the value of the overwriteLeadSource property.
     * 
     */
    public boolean isOverwriteLeadSource() {
        return overwriteLeadSource;
    }

    /**
     * Sets the value of the overwriteLeadSource property.
     * 
     */
    public void setOverwriteLeadSource(boolean value) {
        this.overwriteLeadSource = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the sendNotificationEmail property.
     * 
     */
    public boolean isSendNotificationEmail() {
        return sendNotificationEmail;
    }

    /**
     * Sets the value of the sendNotificationEmail property.
     * 
     */
    public void setSendNotificationEmail(boolean value) {
        this.sendNotificationEmail = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LeadConvert)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LeadConvert that = ((LeadConvert) object);
        {
            String lhsAccountId;
            lhsAccountId = this.getAccountId();
            String rhsAccountId;
            rhsAccountId = that.getAccountId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountId", lhsAccountId), LocatorUtils.property(thatLocator, "accountId", rhsAccountId), lhsAccountId, rhsAccountId)) {
                return false;
            }
        }
        {
            SObject lhsAccountRecord;
            lhsAccountRecord = this.getAccountRecord();
            SObject rhsAccountRecord;
            rhsAccountRecord = that.getAccountRecord();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountRecord", lhsAccountRecord), LocatorUtils.property(thatLocator, "accountRecord", rhsAccountRecord), lhsAccountRecord, rhsAccountRecord)) {
                return false;
            }
        }
        {
            Boolean lhsBypassAccountDedupeCheck;
            lhsBypassAccountDedupeCheck = this.isBypassAccountDedupeCheck();
            Boolean rhsBypassAccountDedupeCheck;
            rhsBypassAccountDedupeCheck = that.isBypassAccountDedupeCheck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bypassAccountDedupeCheck", lhsBypassAccountDedupeCheck), LocatorUtils.property(thatLocator, "bypassAccountDedupeCheck", rhsBypassAccountDedupeCheck), lhsBypassAccountDedupeCheck, rhsBypassAccountDedupeCheck)) {
                return false;
            }
        }
        {
            Boolean lhsBypassContactDedupeCheck;
            lhsBypassContactDedupeCheck = this.isBypassContactDedupeCheck();
            Boolean rhsBypassContactDedupeCheck;
            rhsBypassContactDedupeCheck = that.isBypassContactDedupeCheck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bypassContactDedupeCheck", lhsBypassContactDedupeCheck), LocatorUtils.property(thatLocator, "bypassContactDedupeCheck", rhsBypassContactDedupeCheck), lhsBypassContactDedupeCheck, rhsBypassContactDedupeCheck)) {
                return false;
            }
        }
        {
            String lhsContactId;
            lhsContactId = this.getContactId();
            String rhsContactId;
            rhsContactId = that.getContactId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactId", lhsContactId), LocatorUtils.property(thatLocator, "contactId", rhsContactId), lhsContactId, rhsContactId)) {
                return false;
            }
        }
        {
            SObject lhsContactRecord;
            lhsContactRecord = this.getContactRecord();
            SObject rhsContactRecord;
            rhsContactRecord = that.getContactRecord();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactRecord", lhsContactRecord), LocatorUtils.property(thatLocator, "contactRecord", rhsContactRecord), lhsContactRecord, rhsContactRecord)) {
                return false;
            }
        }
        {
            String lhsConvertedStatus;
            lhsConvertedStatus = this.getConvertedStatus();
            String rhsConvertedStatus;
            rhsConvertedStatus = that.getConvertedStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convertedStatus", lhsConvertedStatus), LocatorUtils.property(thatLocator, "convertedStatus", rhsConvertedStatus), lhsConvertedStatus, rhsConvertedStatus)) {
                return false;
            }
        }
        {
            boolean lhsDoNotCreateOpportunity;
            lhsDoNotCreateOpportunity = (true?this.isDoNotCreateOpportunity():false);
            boolean rhsDoNotCreateOpportunity;
            rhsDoNotCreateOpportunity = (true?that.isDoNotCreateOpportunity():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doNotCreateOpportunity", lhsDoNotCreateOpportunity), LocatorUtils.property(thatLocator, "doNotCreateOpportunity", rhsDoNotCreateOpportunity), lhsDoNotCreateOpportunity, rhsDoNotCreateOpportunity)) {
                return false;
            }
        }
        {
            String lhsLeadId;
            lhsLeadId = this.getLeadId();
            String rhsLeadId;
            rhsLeadId = that.getLeadId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadId", lhsLeadId), LocatorUtils.property(thatLocator, "leadId", rhsLeadId), lhsLeadId, rhsLeadId)) {
                return false;
            }
        }
        {
            String lhsOpportunityId;
            lhsOpportunityId = this.getOpportunityId();
            String rhsOpportunityId;
            rhsOpportunityId = that.getOpportunityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opportunityId", lhsOpportunityId), LocatorUtils.property(thatLocator, "opportunityId", rhsOpportunityId), lhsOpportunityId, rhsOpportunityId)) {
                return false;
            }
        }
        {
            String lhsOpportunityName;
            lhsOpportunityName = this.getOpportunityName();
            String rhsOpportunityName;
            rhsOpportunityName = that.getOpportunityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opportunityName", lhsOpportunityName), LocatorUtils.property(thatLocator, "opportunityName", rhsOpportunityName), lhsOpportunityName, rhsOpportunityName)) {
                return false;
            }
        }
        {
            SObject lhsOpportunityRecord;
            lhsOpportunityRecord = this.getOpportunityRecord();
            SObject rhsOpportunityRecord;
            rhsOpportunityRecord = that.getOpportunityRecord();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opportunityRecord", lhsOpportunityRecord), LocatorUtils.property(thatLocator, "opportunityRecord", rhsOpportunityRecord), lhsOpportunityRecord, rhsOpportunityRecord)) {
                return false;
            }
        }
        {
            boolean lhsOverwriteLeadSource;
            lhsOverwriteLeadSource = (true?this.isOverwriteLeadSource():false);
            boolean rhsOverwriteLeadSource;
            rhsOverwriteLeadSource = (true?that.isOverwriteLeadSource():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overwriteLeadSource", lhsOverwriteLeadSource), LocatorUtils.property(thatLocator, "overwriteLeadSource", rhsOverwriteLeadSource), lhsOverwriteLeadSource, rhsOverwriteLeadSource)) {
                return false;
            }
        }
        {
            String lhsOwnerId;
            lhsOwnerId = this.getOwnerId();
            String rhsOwnerId;
            rhsOwnerId = that.getOwnerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownerId", lhsOwnerId), LocatorUtils.property(thatLocator, "ownerId", rhsOwnerId), lhsOwnerId, rhsOwnerId)) {
                return false;
            }
        }
        {
            boolean lhsSendNotificationEmail;
            lhsSendNotificationEmail = (true?this.isSendNotificationEmail():false);
            boolean rhsSendNotificationEmail;
            rhsSendNotificationEmail = (true?that.isSendNotificationEmail():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendNotificationEmail", lhsSendNotificationEmail), LocatorUtils.property(thatLocator, "sendNotificationEmail", rhsSendNotificationEmail), lhsSendNotificationEmail, rhsSendNotificationEmail)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theAccountId;
            theAccountId = this.getAccountId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountId", theAccountId), currentHashCode, theAccountId);
        }
        {
            SObject theAccountRecord;
            theAccountRecord = this.getAccountRecord();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountRecord", theAccountRecord), currentHashCode, theAccountRecord);
        }
        {
            Boolean theBypassAccountDedupeCheck;
            theBypassAccountDedupeCheck = this.isBypassAccountDedupeCheck();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bypassAccountDedupeCheck", theBypassAccountDedupeCheck), currentHashCode, theBypassAccountDedupeCheck);
        }
        {
            Boolean theBypassContactDedupeCheck;
            theBypassContactDedupeCheck = this.isBypassContactDedupeCheck();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bypassContactDedupeCheck", theBypassContactDedupeCheck), currentHashCode, theBypassContactDedupeCheck);
        }
        {
            String theContactId;
            theContactId = this.getContactId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactId", theContactId), currentHashCode, theContactId);
        }
        {
            SObject theContactRecord;
            theContactRecord = this.getContactRecord();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactRecord", theContactRecord), currentHashCode, theContactRecord);
        }
        {
            String theConvertedStatus;
            theConvertedStatus = this.getConvertedStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "convertedStatus", theConvertedStatus), currentHashCode, theConvertedStatus);
        }
        {
            boolean theDoNotCreateOpportunity;
            theDoNotCreateOpportunity = (true?this.isDoNotCreateOpportunity():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doNotCreateOpportunity", theDoNotCreateOpportunity), currentHashCode, theDoNotCreateOpportunity);
        }
        {
            String theLeadId;
            theLeadId = this.getLeadId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadId", theLeadId), currentHashCode, theLeadId);
        }
        {
            String theOpportunityId;
            theOpportunityId = this.getOpportunityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "opportunityId", theOpportunityId), currentHashCode, theOpportunityId);
        }
        {
            String theOpportunityName;
            theOpportunityName = this.getOpportunityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "opportunityName", theOpportunityName), currentHashCode, theOpportunityName);
        }
        {
            SObject theOpportunityRecord;
            theOpportunityRecord = this.getOpportunityRecord();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "opportunityRecord", theOpportunityRecord), currentHashCode, theOpportunityRecord);
        }
        {
            boolean theOverwriteLeadSource;
            theOverwriteLeadSource = (true?this.isOverwriteLeadSource():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "overwriteLeadSource", theOverwriteLeadSource), currentHashCode, theOverwriteLeadSource);
        }
        {
            String theOwnerId;
            theOwnerId = this.getOwnerId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ownerId", theOwnerId), currentHashCode, theOwnerId);
        }
        {
            boolean theSendNotificationEmail;
            theSendNotificationEmail = (true?this.isSendNotificationEmail():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendNotificationEmail", theSendNotificationEmail), currentHashCode, theSendNotificationEmail);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theAccountId;
            theAccountId = this.getAccountId();
            strategy.appendField(locator, this, "accountId", buffer, theAccountId);
        }
        {
            SObject theAccountRecord;
            theAccountRecord = this.getAccountRecord();
            strategy.appendField(locator, this, "accountRecord", buffer, theAccountRecord);
        }
        {
            Boolean theBypassAccountDedupeCheck;
            theBypassAccountDedupeCheck = this.isBypassAccountDedupeCheck();
            strategy.appendField(locator, this, "bypassAccountDedupeCheck", buffer, theBypassAccountDedupeCheck);
        }
        {
            Boolean theBypassContactDedupeCheck;
            theBypassContactDedupeCheck = this.isBypassContactDedupeCheck();
            strategy.appendField(locator, this, "bypassContactDedupeCheck", buffer, theBypassContactDedupeCheck);
        }
        {
            String theContactId;
            theContactId = this.getContactId();
            strategy.appendField(locator, this, "contactId", buffer, theContactId);
        }
        {
            SObject theContactRecord;
            theContactRecord = this.getContactRecord();
            strategy.appendField(locator, this, "contactRecord", buffer, theContactRecord);
        }
        {
            String theConvertedStatus;
            theConvertedStatus = this.getConvertedStatus();
            strategy.appendField(locator, this, "convertedStatus", buffer, theConvertedStatus);
        }
        {
            boolean theDoNotCreateOpportunity;
            theDoNotCreateOpportunity = (true?this.isDoNotCreateOpportunity():false);
            strategy.appendField(locator, this, "doNotCreateOpportunity", buffer, theDoNotCreateOpportunity);
        }
        {
            String theLeadId;
            theLeadId = this.getLeadId();
            strategy.appendField(locator, this, "leadId", buffer, theLeadId);
        }
        {
            String theOpportunityId;
            theOpportunityId = this.getOpportunityId();
            strategy.appendField(locator, this, "opportunityId", buffer, theOpportunityId);
        }
        {
            String theOpportunityName;
            theOpportunityName = this.getOpportunityName();
            strategy.appendField(locator, this, "opportunityName", buffer, theOpportunityName);
        }
        {
            SObject theOpportunityRecord;
            theOpportunityRecord = this.getOpportunityRecord();
            strategy.appendField(locator, this, "opportunityRecord", buffer, theOpportunityRecord);
        }
        {
            boolean theOverwriteLeadSource;
            theOverwriteLeadSource = (true?this.isOverwriteLeadSource():false);
            strategy.appendField(locator, this, "overwriteLeadSource", buffer, theOverwriteLeadSource);
        }
        {
            String theOwnerId;
            theOwnerId = this.getOwnerId();
            strategy.appendField(locator, this, "ownerId", buffer, theOwnerId);
        }
        {
            boolean theSendNotificationEmail;
            theSendNotificationEmail = (true?this.isSendNotificationEmail():false);
            strategy.appendField(locator, this, "sendNotificationEmail", buffer, theSendNotificationEmail);
        }
        return buffer;
    }

}
