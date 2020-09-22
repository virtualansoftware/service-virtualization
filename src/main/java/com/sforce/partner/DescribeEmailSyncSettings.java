
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for DescribeEmailSyncSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeEmailSyncSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addCase" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="addEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="addEmailAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="advancedSetting" type="{urn:partner.soap.sforce.com}EmailSyncAdvancedSetting" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attachmentSizeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="automaticallySyncOutlookObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cannotChangeClientSyncSetting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="clientVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailToCaseRoutingAddress" type="{urn:partner.soap.sforce.com}EmailSyncRoutingAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entitySetting" type="{urn:partner.soap.sforce.com}EmailSyncEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expandedRecurringEventSyncWindow" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isSyncThrottlingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="logActivityEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personAccountRecordTypeId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="recurringEvents" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="recurringTasks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showPersonAccountsAsAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showPersonAccountsAsContacts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sidePanel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="upgradeNotification" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeEmailSyncSettings", propOrder = {
    "addCase",
    "addEmail",
    "addEmailAttachment",
    "advancedSettings",
    "attachmentSizeLimit",
    "automaticallySyncOutlookObjects",
    "cannotChangeClientSyncSetting",
    "clientVersionNumber",
    "emailToCaseRoutingAddresses",
    "entitySettings",
    "expandedRecurringEventSyncWindow",
    "isSyncThrottlingEnabled",
    "logActivityEmailAddress",
    "personAccountRecordTypeId",
    "recurringEvents",
    "recurringTasks",
    "showPersonAccountsAsAccounts",
    "showPersonAccountsAsContacts",
    "sidePanel",
    "upgradeNotification"
})
public class DescribeEmailSyncSettings
    implements Equals, HashCode, ToString
{

    protected boolean addCase;
    protected boolean addEmail;
    protected boolean addEmailAttachment;
    @XmlElement(name = "advancedSetting")
    protected List<EmailSyncAdvancedSetting> advancedSettings;
    protected Integer attachmentSizeLimit;
    protected boolean automaticallySyncOutlookObjects;
    protected boolean cannotChangeClientSyncSetting;
    protected String clientVersionNumber;
    @XmlElement(name = "emailToCaseRoutingAddress")
    protected List<EmailSyncRoutingAddress> emailToCaseRoutingAddresses;
    @XmlElement(name = "entitySetting")
    protected List<EmailSyncEntity> entitySettings;
    protected boolean expandedRecurringEventSyncWindow;
    protected boolean isSyncThrottlingEnabled;
    protected String logActivityEmailAddress;
    @XmlElement(required = true, nillable = true)
    protected String personAccountRecordTypeId;
    protected boolean recurringEvents;
    protected boolean recurringTasks;
    protected boolean showPersonAccountsAsAccounts;
    protected boolean showPersonAccountsAsContacts;
    protected boolean sidePanel;
    protected boolean upgradeNotification;

    /**
     * Gets the value of the addCase property.
     * 
     */
    public boolean isAddCase() {
        return addCase;
    }

    /**
     * Sets the value of the addCase property.
     * 
     */
    public void setAddCase(boolean value) {
        this.addCase = value;
    }

    /**
     * Gets the value of the addEmail property.
     * 
     */
    public boolean isAddEmail() {
        return addEmail;
    }

    /**
     * Sets the value of the addEmail property.
     * 
     */
    public void setAddEmail(boolean value) {
        this.addEmail = value;
    }

    /**
     * Gets the value of the addEmailAttachment property.
     * 
     */
    public boolean isAddEmailAttachment() {
        return addEmailAttachment;
    }

    /**
     * Sets the value of the addEmailAttachment property.
     * 
     */
    public void setAddEmailAttachment(boolean value) {
        this.addEmailAttachment = value;
    }

    /**
     * Gets the value of the advancedSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancedSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancedSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailSyncAdvancedSetting }
     * 
     * 
     */
    public List<EmailSyncAdvancedSetting> getAdvancedSettings() {
        if (advancedSettings == null) {
            advancedSettings = new ArrayList<EmailSyncAdvancedSetting>();
        }
        return this.advancedSettings;
    }

    /**
     * Gets the value of the attachmentSizeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttachmentSizeLimit() {
        return attachmentSizeLimit;
    }

    /**
     * Sets the value of the attachmentSizeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttachmentSizeLimit(Integer value) {
        this.attachmentSizeLimit = value;
    }

    /**
     * Gets the value of the automaticallySyncOutlookObjects property.
     * 
     */
    public boolean isAutomaticallySyncOutlookObjects() {
        return automaticallySyncOutlookObjects;
    }

    /**
     * Sets the value of the automaticallySyncOutlookObjects property.
     * 
     */
    public void setAutomaticallySyncOutlookObjects(boolean value) {
        this.automaticallySyncOutlookObjects = value;
    }

    /**
     * Gets the value of the cannotChangeClientSyncSetting property.
     * 
     */
    public boolean isCannotChangeClientSyncSetting() {
        return cannotChangeClientSyncSetting;
    }

    /**
     * Sets the value of the cannotChangeClientSyncSetting property.
     * 
     */
    public void setCannotChangeClientSyncSetting(boolean value) {
        this.cannotChangeClientSyncSetting = value;
    }

    /**
     * Gets the value of the clientVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientVersionNumber() {
        return clientVersionNumber;
    }

    /**
     * Sets the value of the clientVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientVersionNumber(String value) {
        this.clientVersionNumber = value;
    }

    /**
     * Gets the value of the emailToCaseRoutingAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailToCaseRoutingAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailToCaseRoutingAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailSyncRoutingAddress }
     * 
     * 
     */
    public List<EmailSyncRoutingAddress> getEmailToCaseRoutingAddresses() {
        if (emailToCaseRoutingAddresses == null) {
            emailToCaseRoutingAddresses = new ArrayList<EmailSyncRoutingAddress>();
        }
        return this.emailToCaseRoutingAddresses;
    }

    /**
     * Gets the value of the entitySettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitySettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitySettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailSyncEntity }
     * 
     * 
     */
    public List<EmailSyncEntity> getEntitySettings() {
        if (entitySettings == null) {
            entitySettings = new ArrayList<EmailSyncEntity>();
        }
        return this.entitySettings;
    }

    /**
     * Gets the value of the expandedRecurringEventSyncWindow property.
     * 
     */
    public boolean isExpandedRecurringEventSyncWindow() {
        return expandedRecurringEventSyncWindow;
    }

    /**
     * Sets the value of the expandedRecurringEventSyncWindow property.
     * 
     */
    public void setExpandedRecurringEventSyncWindow(boolean value) {
        this.expandedRecurringEventSyncWindow = value;
    }

    /**
     * Gets the value of the isSyncThrottlingEnabled property.
     * 
     */
    public boolean isIsSyncThrottlingEnabled() {
        return isSyncThrottlingEnabled;
    }

    /**
     * Sets the value of the isSyncThrottlingEnabled property.
     * 
     */
    public void setIsSyncThrottlingEnabled(boolean value) {
        this.isSyncThrottlingEnabled = value;
    }

    /**
     * Gets the value of the logActivityEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogActivityEmailAddress() {
        return logActivityEmailAddress;
    }

    /**
     * Sets the value of the logActivityEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogActivityEmailAddress(String value) {
        this.logActivityEmailAddress = value;
    }

    /**
     * Gets the value of the personAccountRecordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonAccountRecordTypeId() {
        return personAccountRecordTypeId;
    }

    /**
     * Sets the value of the personAccountRecordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonAccountRecordTypeId(String value) {
        this.personAccountRecordTypeId = value;
    }

    /**
     * Gets the value of the recurringEvents property.
     * 
     */
    public boolean isRecurringEvents() {
        return recurringEvents;
    }

    /**
     * Sets the value of the recurringEvents property.
     * 
     */
    public void setRecurringEvents(boolean value) {
        this.recurringEvents = value;
    }

    /**
     * Gets the value of the recurringTasks property.
     * 
     */
    public boolean isRecurringTasks() {
        return recurringTasks;
    }

    /**
     * Sets the value of the recurringTasks property.
     * 
     */
    public void setRecurringTasks(boolean value) {
        this.recurringTasks = value;
    }

    /**
     * Gets the value of the showPersonAccountsAsAccounts property.
     * 
     */
    public boolean isShowPersonAccountsAsAccounts() {
        return showPersonAccountsAsAccounts;
    }

    /**
     * Sets the value of the showPersonAccountsAsAccounts property.
     * 
     */
    public void setShowPersonAccountsAsAccounts(boolean value) {
        this.showPersonAccountsAsAccounts = value;
    }

    /**
     * Gets the value of the showPersonAccountsAsContacts property.
     * 
     */
    public boolean isShowPersonAccountsAsContacts() {
        return showPersonAccountsAsContacts;
    }

    /**
     * Sets the value of the showPersonAccountsAsContacts property.
     * 
     */
    public void setShowPersonAccountsAsContacts(boolean value) {
        this.showPersonAccountsAsContacts = value;
    }

    /**
     * Gets the value of the sidePanel property.
     * 
     */
    public boolean isSidePanel() {
        return sidePanel;
    }

    /**
     * Sets the value of the sidePanel property.
     * 
     */
    public void setSidePanel(boolean value) {
        this.sidePanel = value;
    }

    /**
     * Gets the value of the upgradeNotification property.
     * 
     */
    public boolean isUpgradeNotification() {
        return upgradeNotification;
    }

    /**
     * Sets the value of the upgradeNotification property.
     * 
     */
    public void setUpgradeNotification(boolean value) {
        this.upgradeNotification = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeEmailSyncSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeEmailSyncSettings that = ((DescribeEmailSyncSettings) object);
        {
            boolean lhsAddCase;
            lhsAddCase = (true?this.isAddCase():false);
            boolean rhsAddCase;
            rhsAddCase = (true?that.isAddCase():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addCase", lhsAddCase), LocatorUtils.property(thatLocator, "addCase", rhsAddCase), lhsAddCase, rhsAddCase)) {
                return false;
            }
        }
        {
            boolean lhsAddEmail;
            lhsAddEmail = (true?this.isAddEmail():false);
            boolean rhsAddEmail;
            rhsAddEmail = (true?that.isAddEmail():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addEmail", lhsAddEmail), LocatorUtils.property(thatLocator, "addEmail", rhsAddEmail), lhsAddEmail, rhsAddEmail)) {
                return false;
            }
        }
        {
            boolean lhsAddEmailAttachment;
            lhsAddEmailAttachment = (true?this.isAddEmailAttachment():false);
            boolean rhsAddEmailAttachment;
            rhsAddEmailAttachment = (true?that.isAddEmailAttachment():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addEmailAttachment", lhsAddEmailAttachment), LocatorUtils.property(thatLocator, "addEmailAttachment", rhsAddEmailAttachment), lhsAddEmailAttachment, rhsAddEmailAttachment)) {
                return false;
            }
        }
        {
            List<EmailSyncAdvancedSetting> lhsAdvancedSettings;
            lhsAdvancedSettings = (((this.advancedSettings!= null)&&(!this.advancedSettings.isEmpty()))?this.getAdvancedSettings():null);
            List<EmailSyncAdvancedSetting> rhsAdvancedSettings;
            rhsAdvancedSettings = (((that.advancedSettings!= null)&&(!that.advancedSettings.isEmpty()))?that.getAdvancedSettings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advancedSettings", lhsAdvancedSettings), LocatorUtils.property(thatLocator, "advancedSettings", rhsAdvancedSettings), lhsAdvancedSettings, rhsAdvancedSettings)) {
                return false;
            }
        }
        {
            Integer lhsAttachmentSizeLimit;
            lhsAttachmentSizeLimit = this.getAttachmentSizeLimit();
            Integer rhsAttachmentSizeLimit;
            rhsAttachmentSizeLimit = that.getAttachmentSizeLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachmentSizeLimit", lhsAttachmentSizeLimit), LocatorUtils.property(thatLocator, "attachmentSizeLimit", rhsAttachmentSizeLimit), lhsAttachmentSizeLimit, rhsAttachmentSizeLimit)) {
                return false;
            }
        }
        {
            boolean lhsAutomaticallySyncOutlookObjects;
            lhsAutomaticallySyncOutlookObjects = (true?this.isAutomaticallySyncOutlookObjects():false);
            boolean rhsAutomaticallySyncOutlookObjects;
            rhsAutomaticallySyncOutlookObjects = (true?that.isAutomaticallySyncOutlookObjects():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "automaticallySyncOutlookObjects", lhsAutomaticallySyncOutlookObjects), LocatorUtils.property(thatLocator, "automaticallySyncOutlookObjects", rhsAutomaticallySyncOutlookObjects), lhsAutomaticallySyncOutlookObjects, rhsAutomaticallySyncOutlookObjects)) {
                return false;
            }
        }
        {
            boolean lhsCannotChangeClientSyncSetting;
            lhsCannotChangeClientSyncSetting = (true?this.isCannotChangeClientSyncSetting():false);
            boolean rhsCannotChangeClientSyncSetting;
            rhsCannotChangeClientSyncSetting = (true?that.isCannotChangeClientSyncSetting():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cannotChangeClientSyncSetting", lhsCannotChangeClientSyncSetting), LocatorUtils.property(thatLocator, "cannotChangeClientSyncSetting", rhsCannotChangeClientSyncSetting), lhsCannotChangeClientSyncSetting, rhsCannotChangeClientSyncSetting)) {
                return false;
            }
        }
        {
            String lhsClientVersionNumber;
            lhsClientVersionNumber = this.getClientVersionNumber();
            String rhsClientVersionNumber;
            rhsClientVersionNumber = that.getClientVersionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientVersionNumber", lhsClientVersionNumber), LocatorUtils.property(thatLocator, "clientVersionNumber", rhsClientVersionNumber), lhsClientVersionNumber, rhsClientVersionNumber)) {
                return false;
            }
        }
        {
            List<EmailSyncRoutingAddress> lhsEmailToCaseRoutingAddresses;
            lhsEmailToCaseRoutingAddresses = (((this.emailToCaseRoutingAddresses!= null)&&(!this.emailToCaseRoutingAddresses.isEmpty()))?this.getEmailToCaseRoutingAddresses():null);
            List<EmailSyncRoutingAddress> rhsEmailToCaseRoutingAddresses;
            rhsEmailToCaseRoutingAddresses = (((that.emailToCaseRoutingAddresses!= null)&&(!that.emailToCaseRoutingAddresses.isEmpty()))?that.getEmailToCaseRoutingAddresses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailToCaseRoutingAddresses", lhsEmailToCaseRoutingAddresses), LocatorUtils.property(thatLocator, "emailToCaseRoutingAddresses", rhsEmailToCaseRoutingAddresses), lhsEmailToCaseRoutingAddresses, rhsEmailToCaseRoutingAddresses)) {
                return false;
            }
        }
        {
            List<EmailSyncEntity> lhsEntitySettings;
            lhsEntitySettings = (((this.entitySettings!= null)&&(!this.entitySettings.isEmpty()))?this.getEntitySettings():null);
            List<EmailSyncEntity> rhsEntitySettings;
            rhsEntitySettings = (((that.entitySettings!= null)&&(!that.entitySettings.isEmpty()))?that.getEntitySettings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entitySettings", lhsEntitySettings), LocatorUtils.property(thatLocator, "entitySettings", rhsEntitySettings), lhsEntitySettings, rhsEntitySettings)) {
                return false;
            }
        }
        {
            boolean lhsExpandedRecurringEventSyncWindow;
            lhsExpandedRecurringEventSyncWindow = (true?this.isExpandedRecurringEventSyncWindow():false);
            boolean rhsExpandedRecurringEventSyncWindow;
            rhsExpandedRecurringEventSyncWindow = (true?that.isExpandedRecurringEventSyncWindow():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expandedRecurringEventSyncWindow", lhsExpandedRecurringEventSyncWindow), LocatorUtils.property(thatLocator, "expandedRecurringEventSyncWindow", rhsExpandedRecurringEventSyncWindow), lhsExpandedRecurringEventSyncWindow, rhsExpandedRecurringEventSyncWindow)) {
                return false;
            }
        }
        {
            boolean lhsIsSyncThrottlingEnabled;
            lhsIsSyncThrottlingEnabled = (true?this.isIsSyncThrottlingEnabled():false);
            boolean rhsIsSyncThrottlingEnabled;
            rhsIsSyncThrottlingEnabled = (true?that.isIsSyncThrottlingEnabled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSyncThrottlingEnabled", lhsIsSyncThrottlingEnabled), LocatorUtils.property(thatLocator, "isSyncThrottlingEnabled", rhsIsSyncThrottlingEnabled), lhsIsSyncThrottlingEnabled, rhsIsSyncThrottlingEnabled)) {
                return false;
            }
        }
        {
            String lhsLogActivityEmailAddress;
            lhsLogActivityEmailAddress = this.getLogActivityEmailAddress();
            String rhsLogActivityEmailAddress;
            rhsLogActivityEmailAddress = that.getLogActivityEmailAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logActivityEmailAddress", lhsLogActivityEmailAddress), LocatorUtils.property(thatLocator, "logActivityEmailAddress", rhsLogActivityEmailAddress), lhsLogActivityEmailAddress, rhsLogActivityEmailAddress)) {
                return false;
            }
        }
        {
            String lhsPersonAccountRecordTypeId;
            lhsPersonAccountRecordTypeId = this.getPersonAccountRecordTypeId();
            String rhsPersonAccountRecordTypeId;
            rhsPersonAccountRecordTypeId = that.getPersonAccountRecordTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personAccountRecordTypeId", lhsPersonAccountRecordTypeId), LocatorUtils.property(thatLocator, "personAccountRecordTypeId", rhsPersonAccountRecordTypeId), lhsPersonAccountRecordTypeId, rhsPersonAccountRecordTypeId)) {
                return false;
            }
        }
        {
            boolean lhsRecurringEvents;
            lhsRecurringEvents = (true?this.isRecurringEvents():false);
            boolean rhsRecurringEvents;
            rhsRecurringEvents = (true?that.isRecurringEvents():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurringEvents", lhsRecurringEvents), LocatorUtils.property(thatLocator, "recurringEvents", rhsRecurringEvents), lhsRecurringEvents, rhsRecurringEvents)) {
                return false;
            }
        }
        {
            boolean lhsRecurringTasks;
            lhsRecurringTasks = (true?this.isRecurringTasks():false);
            boolean rhsRecurringTasks;
            rhsRecurringTasks = (true?that.isRecurringTasks():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurringTasks", lhsRecurringTasks), LocatorUtils.property(thatLocator, "recurringTasks", rhsRecurringTasks), lhsRecurringTasks, rhsRecurringTasks)) {
                return false;
            }
        }
        {
            boolean lhsShowPersonAccountsAsAccounts;
            lhsShowPersonAccountsAsAccounts = (true?this.isShowPersonAccountsAsAccounts():false);
            boolean rhsShowPersonAccountsAsAccounts;
            rhsShowPersonAccountsAsAccounts = (true?that.isShowPersonAccountsAsAccounts():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showPersonAccountsAsAccounts", lhsShowPersonAccountsAsAccounts), LocatorUtils.property(thatLocator, "showPersonAccountsAsAccounts", rhsShowPersonAccountsAsAccounts), lhsShowPersonAccountsAsAccounts, rhsShowPersonAccountsAsAccounts)) {
                return false;
            }
        }
        {
            boolean lhsShowPersonAccountsAsContacts;
            lhsShowPersonAccountsAsContacts = (true?this.isShowPersonAccountsAsContacts():false);
            boolean rhsShowPersonAccountsAsContacts;
            rhsShowPersonAccountsAsContacts = (true?that.isShowPersonAccountsAsContacts():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showPersonAccountsAsContacts", lhsShowPersonAccountsAsContacts), LocatorUtils.property(thatLocator, "showPersonAccountsAsContacts", rhsShowPersonAccountsAsContacts), lhsShowPersonAccountsAsContacts, rhsShowPersonAccountsAsContacts)) {
                return false;
            }
        }
        {
            boolean lhsSidePanel;
            lhsSidePanel = (true?this.isSidePanel():false);
            boolean rhsSidePanel;
            rhsSidePanel = (true?that.isSidePanel():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sidePanel", lhsSidePanel), LocatorUtils.property(thatLocator, "sidePanel", rhsSidePanel), lhsSidePanel, rhsSidePanel)) {
                return false;
            }
        }
        {
            boolean lhsUpgradeNotification;
            lhsUpgradeNotification = (true?this.isUpgradeNotification():false);
            boolean rhsUpgradeNotification;
            rhsUpgradeNotification = (true?that.isUpgradeNotification():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upgradeNotification", lhsUpgradeNotification), LocatorUtils.property(thatLocator, "upgradeNotification", rhsUpgradeNotification), lhsUpgradeNotification, rhsUpgradeNotification)) {
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
            boolean theAddCase;
            theAddCase = (true?this.isAddCase():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addCase", theAddCase), currentHashCode, theAddCase);
        }
        {
            boolean theAddEmail;
            theAddEmail = (true?this.isAddEmail():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addEmail", theAddEmail), currentHashCode, theAddEmail);
        }
        {
            boolean theAddEmailAttachment;
            theAddEmailAttachment = (true?this.isAddEmailAttachment():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addEmailAttachment", theAddEmailAttachment), currentHashCode, theAddEmailAttachment);
        }
        {
            List<EmailSyncAdvancedSetting> theAdvancedSettings;
            theAdvancedSettings = (((this.advancedSettings!= null)&&(!this.advancedSettings.isEmpty()))?this.getAdvancedSettings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advancedSettings", theAdvancedSettings), currentHashCode, theAdvancedSettings);
        }
        {
            Integer theAttachmentSizeLimit;
            theAttachmentSizeLimit = this.getAttachmentSizeLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachmentSizeLimit", theAttachmentSizeLimit), currentHashCode, theAttachmentSizeLimit);
        }
        {
            boolean theAutomaticallySyncOutlookObjects;
            theAutomaticallySyncOutlookObjects = (true?this.isAutomaticallySyncOutlookObjects():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "automaticallySyncOutlookObjects", theAutomaticallySyncOutlookObjects), currentHashCode, theAutomaticallySyncOutlookObjects);
        }
        {
            boolean theCannotChangeClientSyncSetting;
            theCannotChangeClientSyncSetting = (true?this.isCannotChangeClientSyncSetting():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cannotChangeClientSyncSetting", theCannotChangeClientSyncSetting), currentHashCode, theCannotChangeClientSyncSetting);
        }
        {
            String theClientVersionNumber;
            theClientVersionNumber = this.getClientVersionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientVersionNumber", theClientVersionNumber), currentHashCode, theClientVersionNumber);
        }
        {
            List<EmailSyncRoutingAddress> theEmailToCaseRoutingAddresses;
            theEmailToCaseRoutingAddresses = (((this.emailToCaseRoutingAddresses!= null)&&(!this.emailToCaseRoutingAddresses.isEmpty()))?this.getEmailToCaseRoutingAddresses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emailToCaseRoutingAddresses", theEmailToCaseRoutingAddresses), currentHashCode, theEmailToCaseRoutingAddresses);
        }
        {
            List<EmailSyncEntity> theEntitySettings;
            theEntitySettings = (((this.entitySettings!= null)&&(!this.entitySettings.isEmpty()))?this.getEntitySettings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entitySettings", theEntitySettings), currentHashCode, theEntitySettings);
        }
        {
            boolean theExpandedRecurringEventSyncWindow;
            theExpandedRecurringEventSyncWindow = (true?this.isExpandedRecurringEventSyncWindow():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expandedRecurringEventSyncWindow", theExpandedRecurringEventSyncWindow), currentHashCode, theExpandedRecurringEventSyncWindow);
        }
        {
            boolean theIsSyncThrottlingEnabled;
            theIsSyncThrottlingEnabled = (true?this.isIsSyncThrottlingEnabled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSyncThrottlingEnabled", theIsSyncThrottlingEnabled), currentHashCode, theIsSyncThrottlingEnabled);
        }
        {
            String theLogActivityEmailAddress;
            theLogActivityEmailAddress = this.getLogActivityEmailAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logActivityEmailAddress", theLogActivityEmailAddress), currentHashCode, theLogActivityEmailAddress);
        }
        {
            String thePersonAccountRecordTypeId;
            thePersonAccountRecordTypeId = this.getPersonAccountRecordTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "personAccountRecordTypeId", thePersonAccountRecordTypeId), currentHashCode, thePersonAccountRecordTypeId);
        }
        {
            boolean theRecurringEvents;
            theRecurringEvents = (true?this.isRecurringEvents():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recurringEvents", theRecurringEvents), currentHashCode, theRecurringEvents);
        }
        {
            boolean theRecurringTasks;
            theRecurringTasks = (true?this.isRecurringTasks():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recurringTasks", theRecurringTasks), currentHashCode, theRecurringTasks);
        }
        {
            boolean theShowPersonAccountsAsAccounts;
            theShowPersonAccountsAsAccounts = (true?this.isShowPersonAccountsAsAccounts():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showPersonAccountsAsAccounts", theShowPersonAccountsAsAccounts), currentHashCode, theShowPersonAccountsAsAccounts);
        }
        {
            boolean theShowPersonAccountsAsContacts;
            theShowPersonAccountsAsContacts = (true?this.isShowPersonAccountsAsContacts():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showPersonAccountsAsContacts", theShowPersonAccountsAsContacts), currentHashCode, theShowPersonAccountsAsContacts);
        }
        {
            boolean theSidePanel;
            theSidePanel = (true?this.isSidePanel():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sidePanel", theSidePanel), currentHashCode, theSidePanel);
        }
        {
            boolean theUpgradeNotification;
            theUpgradeNotification = (true?this.isUpgradeNotification():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upgradeNotification", theUpgradeNotification), currentHashCode, theUpgradeNotification);
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
            boolean theAddCase;
            theAddCase = (true?this.isAddCase():false);
            strategy.appendField(locator, this, "addCase", buffer, theAddCase);
        }
        {
            boolean theAddEmail;
            theAddEmail = (true?this.isAddEmail():false);
            strategy.appendField(locator, this, "addEmail", buffer, theAddEmail);
        }
        {
            boolean theAddEmailAttachment;
            theAddEmailAttachment = (true?this.isAddEmailAttachment():false);
            strategy.appendField(locator, this, "addEmailAttachment", buffer, theAddEmailAttachment);
        }
        {
            List<EmailSyncAdvancedSetting> theAdvancedSettings;
            theAdvancedSettings = (((this.advancedSettings!= null)&&(!this.advancedSettings.isEmpty()))?this.getAdvancedSettings():null);
            strategy.appendField(locator, this, "advancedSettings", buffer, theAdvancedSettings);
        }
        {
            Integer theAttachmentSizeLimit;
            theAttachmentSizeLimit = this.getAttachmentSizeLimit();
            strategy.appendField(locator, this, "attachmentSizeLimit", buffer, theAttachmentSizeLimit);
        }
        {
            boolean theAutomaticallySyncOutlookObjects;
            theAutomaticallySyncOutlookObjects = (true?this.isAutomaticallySyncOutlookObjects():false);
            strategy.appendField(locator, this, "automaticallySyncOutlookObjects", buffer, theAutomaticallySyncOutlookObjects);
        }
        {
            boolean theCannotChangeClientSyncSetting;
            theCannotChangeClientSyncSetting = (true?this.isCannotChangeClientSyncSetting():false);
            strategy.appendField(locator, this, "cannotChangeClientSyncSetting", buffer, theCannotChangeClientSyncSetting);
        }
        {
            String theClientVersionNumber;
            theClientVersionNumber = this.getClientVersionNumber();
            strategy.appendField(locator, this, "clientVersionNumber", buffer, theClientVersionNumber);
        }
        {
            List<EmailSyncRoutingAddress> theEmailToCaseRoutingAddresses;
            theEmailToCaseRoutingAddresses = (((this.emailToCaseRoutingAddresses!= null)&&(!this.emailToCaseRoutingAddresses.isEmpty()))?this.getEmailToCaseRoutingAddresses():null);
            strategy.appendField(locator, this, "emailToCaseRoutingAddresses", buffer, theEmailToCaseRoutingAddresses);
        }
        {
            List<EmailSyncEntity> theEntitySettings;
            theEntitySettings = (((this.entitySettings!= null)&&(!this.entitySettings.isEmpty()))?this.getEntitySettings():null);
            strategy.appendField(locator, this, "entitySettings", buffer, theEntitySettings);
        }
        {
            boolean theExpandedRecurringEventSyncWindow;
            theExpandedRecurringEventSyncWindow = (true?this.isExpandedRecurringEventSyncWindow():false);
            strategy.appendField(locator, this, "expandedRecurringEventSyncWindow", buffer, theExpandedRecurringEventSyncWindow);
        }
        {
            boolean theIsSyncThrottlingEnabled;
            theIsSyncThrottlingEnabled = (true?this.isIsSyncThrottlingEnabled():false);
            strategy.appendField(locator, this, "isSyncThrottlingEnabled", buffer, theIsSyncThrottlingEnabled);
        }
        {
            String theLogActivityEmailAddress;
            theLogActivityEmailAddress = this.getLogActivityEmailAddress();
            strategy.appendField(locator, this, "logActivityEmailAddress", buffer, theLogActivityEmailAddress);
        }
        {
            String thePersonAccountRecordTypeId;
            thePersonAccountRecordTypeId = this.getPersonAccountRecordTypeId();
            strategy.appendField(locator, this, "personAccountRecordTypeId", buffer, thePersonAccountRecordTypeId);
        }
        {
            boolean theRecurringEvents;
            theRecurringEvents = (true?this.isRecurringEvents():false);
            strategy.appendField(locator, this, "recurringEvents", buffer, theRecurringEvents);
        }
        {
            boolean theRecurringTasks;
            theRecurringTasks = (true?this.isRecurringTasks():false);
            strategy.appendField(locator, this, "recurringTasks", buffer, theRecurringTasks);
        }
        {
            boolean theShowPersonAccountsAsAccounts;
            theShowPersonAccountsAsAccounts = (true?this.isShowPersonAccountsAsAccounts():false);
            strategy.appendField(locator, this, "showPersonAccountsAsAccounts", buffer, theShowPersonAccountsAsAccounts);
        }
        {
            boolean theShowPersonAccountsAsContacts;
            theShowPersonAccountsAsContacts = (true?this.isShowPersonAccountsAsContacts():false);
            strategy.appendField(locator, this, "showPersonAccountsAsContacts", buffer, theShowPersonAccountsAsContacts);
        }
        {
            boolean theSidePanel;
            theSidePanel = (true?this.isSidePanel():false);
            strategy.appendField(locator, this, "sidePanel", buffer, theSidePanel);
        }
        {
            boolean theUpgradeNotification;
            theUpgradeNotification = (true?this.isUpgradeNotification():false);
            strategy.appendField(locator, this, "upgradeNotification", buffer, theUpgradeNotification);
        }
        return buffer;
    }

}
