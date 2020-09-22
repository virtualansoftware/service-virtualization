
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
 * <p>Java class for GetUserInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessibilityMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="chatterExternal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="currencySymbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultAppIdForProfile" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="orgAttachmentFileSizeLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgDefaultCurrencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgDefaultCurrencyLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgDisallowHtmlAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="orgHasPersonAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="organizationId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="organizationMultiCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="profileId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="roleId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="sessionSecondsValid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userDefaultCurrencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="userLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userUiSkin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserInfoResult", propOrder = {
    "accessibilityMode",
    "chatterExternal",
    "currencySymbol",
    "defaultAppIdForProfile",
    "orgAttachmentFileSizeLimit",
    "orgDefaultCurrencyIsoCode",
    "orgDefaultCurrencyLocale",
    "orgDisallowHtmlAttachments",
    "orgHasPersonAccounts",
    "organizationId",
    "organizationMultiCurrency",
    "organizationName",
    "profileId",
    "roleId",
    "sessionSecondsValid",
    "userDefaultCurrencyIsoCode",
    "userEmail",
    "userFullName",
    "userId",
    "userLanguage",
    "userLocale",
    "userName",
    "userTimeZone",
    "userType",
    "userUiSkin"
})
public class GetUserInfoResult
    implements Equals, HashCode, ToString
{

    protected boolean accessibilityMode;
    protected boolean chatterExternal;
    @XmlElement(required = true, nillable = true)
    protected String currencySymbol;
    protected String defaultAppIdForProfile;
    protected int orgAttachmentFileSizeLimit;
    @XmlElement(required = true, nillable = true)
    protected String orgDefaultCurrencyIsoCode;
    @XmlElement(required = true, nillable = true)
    protected String orgDefaultCurrencyLocale;
    protected boolean orgDisallowHtmlAttachments;
    protected boolean orgHasPersonAccounts;
    @XmlElement(required = true)
    protected String organizationId;
    protected boolean organizationMultiCurrency;
    @XmlElement(required = true)
    protected String organizationName;
    @XmlElement(required = true)
    protected String profileId;
    @XmlElement(required = true, nillable = true)
    protected String roleId;
    protected int sessionSecondsValid;
    @XmlElement(required = true, nillable = true)
    protected String userDefaultCurrencyIsoCode;
    @XmlElement(required = true)
    protected String userEmail;
    @XmlElement(required = true)
    protected String userFullName;
    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String userLanguage;
    @XmlElement(required = true)
    protected String userLocale;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String userTimeZone;
    @XmlElement(required = true)
    protected String userType;
    @XmlElement(required = true)
    protected String userUiSkin;

    /**
     * Gets the value of the accessibilityMode property.
     * 
     */
    public boolean isAccessibilityMode() {
        return accessibilityMode;
    }

    /**
     * Sets the value of the accessibilityMode property.
     * 
     */
    public void setAccessibilityMode(boolean value) {
        this.accessibilityMode = value;
    }

    /**
     * Gets the value of the chatterExternal property.
     * 
     */
    public boolean isChatterExternal() {
        return chatterExternal;
    }

    /**
     * Sets the value of the chatterExternal property.
     * 
     */
    public void setChatterExternal(boolean value) {
        this.chatterExternal = value;
    }

    /**
     * Gets the value of the currencySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Sets the value of the currencySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /**
     * Gets the value of the defaultAppIdForProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAppIdForProfile() {
        return defaultAppIdForProfile;
    }

    /**
     * Sets the value of the defaultAppIdForProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAppIdForProfile(String value) {
        this.defaultAppIdForProfile = value;
    }

    /**
     * Gets the value of the orgAttachmentFileSizeLimit property.
     * 
     */
    public int getOrgAttachmentFileSizeLimit() {
        return orgAttachmentFileSizeLimit;
    }

    /**
     * Sets the value of the orgAttachmentFileSizeLimit property.
     * 
     */
    public void setOrgAttachmentFileSizeLimit(int value) {
        this.orgAttachmentFileSizeLimit = value;
    }

    /**
     * Gets the value of the orgDefaultCurrencyIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgDefaultCurrencyIsoCode() {
        return orgDefaultCurrencyIsoCode;
    }

    /**
     * Sets the value of the orgDefaultCurrencyIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgDefaultCurrencyIsoCode(String value) {
        this.orgDefaultCurrencyIsoCode = value;
    }

    /**
     * Gets the value of the orgDefaultCurrencyLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgDefaultCurrencyLocale() {
        return orgDefaultCurrencyLocale;
    }

    /**
     * Sets the value of the orgDefaultCurrencyLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgDefaultCurrencyLocale(String value) {
        this.orgDefaultCurrencyLocale = value;
    }

    /**
     * Gets the value of the orgDisallowHtmlAttachments property.
     * 
     */
    public boolean isOrgDisallowHtmlAttachments() {
        return orgDisallowHtmlAttachments;
    }

    /**
     * Sets the value of the orgDisallowHtmlAttachments property.
     * 
     */
    public void setOrgDisallowHtmlAttachments(boolean value) {
        this.orgDisallowHtmlAttachments = value;
    }

    /**
     * Gets the value of the orgHasPersonAccounts property.
     * 
     */
    public boolean isOrgHasPersonAccounts() {
        return orgHasPersonAccounts;
    }

    /**
     * Sets the value of the orgHasPersonAccounts property.
     * 
     */
    public void setOrgHasPersonAccounts(boolean value) {
        this.orgHasPersonAccounts = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the organizationMultiCurrency property.
     * 
     */
    public boolean isOrganizationMultiCurrency() {
        return organizationMultiCurrency;
    }

    /**
     * Sets the value of the organizationMultiCurrency property.
     * 
     */
    public void setOrganizationMultiCurrency(boolean value) {
        this.organizationMultiCurrency = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the roleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleId(String value) {
        this.roleId = value;
    }

    /**
     * Gets the value of the sessionSecondsValid property.
     * 
     */
    public int getSessionSecondsValid() {
        return sessionSecondsValid;
    }

    /**
     * Sets the value of the sessionSecondsValid property.
     * 
     */
    public void setSessionSecondsValid(int value) {
        this.sessionSecondsValid = value;
    }

    /**
     * Gets the value of the userDefaultCurrencyIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefaultCurrencyIsoCode() {
        return userDefaultCurrencyIsoCode;
    }

    /**
     * Sets the value of the userDefaultCurrencyIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefaultCurrencyIsoCode(String value) {
        this.userDefaultCurrencyIsoCode = value;
    }

    /**
     * Gets the value of the userEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Sets the value of the userEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Gets the value of the userFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * Sets the value of the userFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFullName(String value) {
        this.userFullName = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLanguage() {
        return userLanguage;
    }

    /**
     * Sets the value of the userLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLanguage(String value) {
        this.userLanguage = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocale(String value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTimeZone() {
        return userTimeZone;
    }

    /**
     * Sets the value of the userTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTimeZone(String value) {
        this.userTimeZone = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the userUiSkin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUiSkin() {
        return userUiSkin;
    }

    /**
     * Sets the value of the userUiSkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUiSkin(String value) {
        this.userUiSkin = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetUserInfoResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GetUserInfoResult that = ((GetUserInfoResult) object);
        {
            boolean lhsAccessibilityMode;
            lhsAccessibilityMode = (true?this.isAccessibilityMode():false);
            boolean rhsAccessibilityMode;
            rhsAccessibilityMode = (true?that.isAccessibilityMode():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessibilityMode", lhsAccessibilityMode), LocatorUtils.property(thatLocator, "accessibilityMode", rhsAccessibilityMode), lhsAccessibilityMode, rhsAccessibilityMode)) {
                return false;
            }
        }
        {
            boolean lhsChatterExternal;
            lhsChatterExternal = (true?this.isChatterExternal():false);
            boolean rhsChatterExternal;
            rhsChatterExternal = (true?that.isChatterExternal():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chatterExternal", lhsChatterExternal), LocatorUtils.property(thatLocator, "chatterExternal", rhsChatterExternal), lhsChatterExternal, rhsChatterExternal)) {
                return false;
            }
        }
        {
            String lhsCurrencySymbol;
            lhsCurrencySymbol = this.getCurrencySymbol();
            String rhsCurrencySymbol;
            rhsCurrencySymbol = that.getCurrencySymbol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencySymbol", lhsCurrencySymbol), LocatorUtils.property(thatLocator, "currencySymbol", rhsCurrencySymbol), lhsCurrencySymbol, rhsCurrencySymbol)) {
                return false;
            }
        }
        {
            String lhsDefaultAppIdForProfile;
            lhsDefaultAppIdForProfile = this.getDefaultAppIdForProfile();
            String rhsDefaultAppIdForProfile;
            rhsDefaultAppIdForProfile = that.getDefaultAppIdForProfile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultAppIdForProfile", lhsDefaultAppIdForProfile), LocatorUtils.property(thatLocator, "defaultAppIdForProfile", rhsDefaultAppIdForProfile), lhsDefaultAppIdForProfile, rhsDefaultAppIdForProfile)) {
                return false;
            }
        }
        {
            int lhsOrgAttachmentFileSizeLimit;
            lhsOrgAttachmentFileSizeLimit = (true?this.getOrgAttachmentFileSizeLimit(): 0);
            int rhsOrgAttachmentFileSizeLimit;
            rhsOrgAttachmentFileSizeLimit = (true?that.getOrgAttachmentFileSizeLimit(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgAttachmentFileSizeLimit", lhsOrgAttachmentFileSizeLimit), LocatorUtils.property(thatLocator, "orgAttachmentFileSizeLimit", rhsOrgAttachmentFileSizeLimit), lhsOrgAttachmentFileSizeLimit, rhsOrgAttachmentFileSizeLimit)) {
                return false;
            }
        }
        {
            String lhsOrgDefaultCurrencyIsoCode;
            lhsOrgDefaultCurrencyIsoCode = this.getOrgDefaultCurrencyIsoCode();
            String rhsOrgDefaultCurrencyIsoCode;
            rhsOrgDefaultCurrencyIsoCode = that.getOrgDefaultCurrencyIsoCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgDefaultCurrencyIsoCode", lhsOrgDefaultCurrencyIsoCode), LocatorUtils.property(thatLocator, "orgDefaultCurrencyIsoCode", rhsOrgDefaultCurrencyIsoCode), lhsOrgDefaultCurrencyIsoCode, rhsOrgDefaultCurrencyIsoCode)) {
                return false;
            }
        }
        {
            String lhsOrgDefaultCurrencyLocale;
            lhsOrgDefaultCurrencyLocale = this.getOrgDefaultCurrencyLocale();
            String rhsOrgDefaultCurrencyLocale;
            rhsOrgDefaultCurrencyLocale = that.getOrgDefaultCurrencyLocale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgDefaultCurrencyLocale", lhsOrgDefaultCurrencyLocale), LocatorUtils.property(thatLocator, "orgDefaultCurrencyLocale", rhsOrgDefaultCurrencyLocale), lhsOrgDefaultCurrencyLocale, rhsOrgDefaultCurrencyLocale)) {
                return false;
            }
        }
        {
            boolean lhsOrgDisallowHtmlAttachments;
            lhsOrgDisallowHtmlAttachments = (true?this.isOrgDisallowHtmlAttachments():false);
            boolean rhsOrgDisallowHtmlAttachments;
            rhsOrgDisallowHtmlAttachments = (true?that.isOrgDisallowHtmlAttachments():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgDisallowHtmlAttachments", lhsOrgDisallowHtmlAttachments), LocatorUtils.property(thatLocator, "orgDisallowHtmlAttachments", rhsOrgDisallowHtmlAttachments), lhsOrgDisallowHtmlAttachments, rhsOrgDisallowHtmlAttachments)) {
                return false;
            }
        }
        {
            boolean lhsOrgHasPersonAccounts;
            lhsOrgHasPersonAccounts = (true?this.isOrgHasPersonAccounts():false);
            boolean rhsOrgHasPersonAccounts;
            rhsOrgHasPersonAccounts = (true?that.isOrgHasPersonAccounts():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgHasPersonAccounts", lhsOrgHasPersonAccounts), LocatorUtils.property(thatLocator, "orgHasPersonAccounts", rhsOrgHasPersonAccounts), lhsOrgHasPersonAccounts, rhsOrgHasPersonAccounts)) {
                return false;
            }
        }
        {
            String lhsOrganizationId;
            lhsOrganizationId = this.getOrganizationId();
            String rhsOrganizationId;
            rhsOrganizationId = that.getOrganizationId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationId", lhsOrganizationId), LocatorUtils.property(thatLocator, "organizationId", rhsOrganizationId), lhsOrganizationId, rhsOrganizationId)) {
                return false;
            }
        }
        {
            boolean lhsOrganizationMultiCurrency;
            lhsOrganizationMultiCurrency = (true?this.isOrganizationMultiCurrency():false);
            boolean rhsOrganizationMultiCurrency;
            rhsOrganizationMultiCurrency = (true?that.isOrganizationMultiCurrency():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationMultiCurrency", lhsOrganizationMultiCurrency), LocatorUtils.property(thatLocator, "organizationMultiCurrency", rhsOrganizationMultiCurrency), lhsOrganizationMultiCurrency, rhsOrganizationMultiCurrency)) {
                return false;
            }
        }
        {
            String lhsOrganizationName;
            lhsOrganizationName = this.getOrganizationName();
            String rhsOrganizationName;
            rhsOrganizationName = that.getOrganizationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationName", lhsOrganizationName), LocatorUtils.property(thatLocator, "organizationName", rhsOrganizationName), lhsOrganizationName, rhsOrganizationName)) {
                return false;
            }
        }
        {
            String lhsProfileId;
            lhsProfileId = this.getProfileId();
            String rhsProfileId;
            rhsProfileId = that.getProfileId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profileId", lhsProfileId), LocatorUtils.property(thatLocator, "profileId", rhsProfileId), lhsProfileId, rhsProfileId)) {
                return false;
            }
        }
        {
            String lhsRoleId;
            lhsRoleId = this.getRoleId();
            String rhsRoleId;
            rhsRoleId = that.getRoleId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roleId", lhsRoleId), LocatorUtils.property(thatLocator, "roleId", rhsRoleId), lhsRoleId, rhsRoleId)) {
                return false;
            }
        }
        {
            int lhsSessionSecondsValid;
            lhsSessionSecondsValid = (true?this.getSessionSecondsValid(): 0);
            int rhsSessionSecondsValid;
            rhsSessionSecondsValid = (true?that.getSessionSecondsValid(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sessionSecondsValid", lhsSessionSecondsValid), LocatorUtils.property(thatLocator, "sessionSecondsValid", rhsSessionSecondsValid), lhsSessionSecondsValid, rhsSessionSecondsValid)) {
                return false;
            }
        }
        {
            String lhsUserDefaultCurrencyIsoCode;
            lhsUserDefaultCurrencyIsoCode = this.getUserDefaultCurrencyIsoCode();
            String rhsUserDefaultCurrencyIsoCode;
            rhsUserDefaultCurrencyIsoCode = that.getUserDefaultCurrencyIsoCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefaultCurrencyIsoCode", lhsUserDefaultCurrencyIsoCode), LocatorUtils.property(thatLocator, "userDefaultCurrencyIsoCode", rhsUserDefaultCurrencyIsoCode), lhsUserDefaultCurrencyIsoCode, rhsUserDefaultCurrencyIsoCode)) {
                return false;
            }
        }
        {
            String lhsUserEmail;
            lhsUserEmail = this.getUserEmail();
            String rhsUserEmail;
            rhsUserEmail = that.getUserEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userEmail", lhsUserEmail), LocatorUtils.property(thatLocator, "userEmail", rhsUserEmail), lhsUserEmail, rhsUserEmail)) {
                return false;
            }
        }
        {
            String lhsUserFullName;
            lhsUserFullName = this.getUserFullName();
            String rhsUserFullName;
            rhsUserFullName = that.getUserFullName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userFullName", lhsUserFullName), LocatorUtils.property(thatLocator, "userFullName", rhsUserFullName), lhsUserFullName, rhsUserFullName)) {
                return false;
            }
        }
        {
            String lhsUserId;
            lhsUserId = this.getUserId();
            String rhsUserId;
            rhsUserId = that.getUserId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userId", lhsUserId), LocatorUtils.property(thatLocator, "userId", rhsUserId), lhsUserId, rhsUserId)) {
                return false;
            }
        }
        {
            String lhsUserLanguage;
            lhsUserLanguage = this.getUserLanguage();
            String rhsUserLanguage;
            rhsUserLanguage = that.getUserLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userLanguage", lhsUserLanguage), LocatorUtils.property(thatLocator, "userLanguage", rhsUserLanguage), lhsUserLanguage, rhsUserLanguage)) {
                return false;
            }
        }
        {
            String lhsUserLocale;
            lhsUserLocale = this.getUserLocale();
            String rhsUserLocale;
            rhsUserLocale = that.getUserLocale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userLocale", lhsUserLocale), LocatorUtils.property(thatLocator, "userLocale", rhsUserLocale), lhsUserLocale, rhsUserLocale)) {
                return false;
            }
        }
        {
            String lhsUserName;
            lhsUserName = this.getUserName();
            String rhsUserName;
            rhsUserName = that.getUserName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userName", lhsUserName), LocatorUtils.property(thatLocator, "userName", rhsUserName), lhsUserName, rhsUserName)) {
                return false;
            }
        }
        {
            String lhsUserTimeZone;
            lhsUserTimeZone = this.getUserTimeZone();
            String rhsUserTimeZone;
            rhsUserTimeZone = that.getUserTimeZone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userTimeZone", lhsUserTimeZone), LocatorUtils.property(thatLocator, "userTimeZone", rhsUserTimeZone), lhsUserTimeZone, rhsUserTimeZone)) {
                return false;
            }
        }
        {
            String lhsUserType;
            lhsUserType = this.getUserType();
            String rhsUserType;
            rhsUserType = that.getUserType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userType", lhsUserType), LocatorUtils.property(thatLocator, "userType", rhsUserType), lhsUserType, rhsUserType)) {
                return false;
            }
        }
        {
            String lhsUserUiSkin;
            lhsUserUiSkin = this.getUserUiSkin();
            String rhsUserUiSkin;
            rhsUserUiSkin = that.getUserUiSkin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userUiSkin", lhsUserUiSkin), LocatorUtils.property(thatLocator, "userUiSkin", rhsUserUiSkin), lhsUserUiSkin, rhsUserUiSkin)) {
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
            boolean theAccessibilityMode;
            theAccessibilityMode = (true?this.isAccessibilityMode():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessibilityMode", theAccessibilityMode), currentHashCode, theAccessibilityMode);
        }
        {
            boolean theChatterExternal;
            theChatterExternal = (true?this.isChatterExternal():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chatterExternal", theChatterExternal), currentHashCode, theChatterExternal);
        }
        {
            String theCurrencySymbol;
            theCurrencySymbol = this.getCurrencySymbol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencySymbol", theCurrencySymbol), currentHashCode, theCurrencySymbol);
        }
        {
            String theDefaultAppIdForProfile;
            theDefaultAppIdForProfile = this.getDefaultAppIdForProfile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultAppIdForProfile", theDefaultAppIdForProfile), currentHashCode, theDefaultAppIdForProfile);
        }
        {
            int theOrgAttachmentFileSizeLimit;
            theOrgAttachmentFileSizeLimit = (true?this.getOrgAttachmentFileSizeLimit(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgAttachmentFileSizeLimit", theOrgAttachmentFileSizeLimit), currentHashCode, theOrgAttachmentFileSizeLimit);
        }
        {
            String theOrgDefaultCurrencyIsoCode;
            theOrgDefaultCurrencyIsoCode = this.getOrgDefaultCurrencyIsoCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgDefaultCurrencyIsoCode", theOrgDefaultCurrencyIsoCode), currentHashCode, theOrgDefaultCurrencyIsoCode);
        }
        {
            String theOrgDefaultCurrencyLocale;
            theOrgDefaultCurrencyLocale = this.getOrgDefaultCurrencyLocale();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgDefaultCurrencyLocale", theOrgDefaultCurrencyLocale), currentHashCode, theOrgDefaultCurrencyLocale);
        }
        {
            boolean theOrgDisallowHtmlAttachments;
            theOrgDisallowHtmlAttachments = (true?this.isOrgDisallowHtmlAttachments():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgDisallowHtmlAttachments", theOrgDisallowHtmlAttachments), currentHashCode, theOrgDisallowHtmlAttachments);
        }
        {
            boolean theOrgHasPersonAccounts;
            theOrgHasPersonAccounts = (true?this.isOrgHasPersonAccounts():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgHasPersonAccounts", theOrgHasPersonAccounts), currentHashCode, theOrgHasPersonAccounts);
        }
        {
            String theOrganizationId;
            theOrganizationId = this.getOrganizationId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organizationId", theOrganizationId), currentHashCode, theOrganizationId);
        }
        {
            boolean theOrganizationMultiCurrency;
            theOrganizationMultiCurrency = (true?this.isOrganizationMultiCurrency():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organizationMultiCurrency", theOrganizationMultiCurrency), currentHashCode, theOrganizationMultiCurrency);
        }
        {
            String theOrganizationName;
            theOrganizationName = this.getOrganizationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organizationName", theOrganizationName), currentHashCode, theOrganizationName);
        }
        {
            String theProfileId;
            theProfileId = this.getProfileId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileId", theProfileId), currentHashCode, theProfileId);
        }
        {
            String theRoleId;
            theRoleId = this.getRoleId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roleId", theRoleId), currentHashCode, theRoleId);
        }
        {
            int theSessionSecondsValid;
            theSessionSecondsValid = (true?this.getSessionSecondsValid(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sessionSecondsValid", theSessionSecondsValid), currentHashCode, theSessionSecondsValid);
        }
        {
            String theUserDefaultCurrencyIsoCode;
            theUserDefaultCurrencyIsoCode = this.getUserDefaultCurrencyIsoCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userDefaultCurrencyIsoCode", theUserDefaultCurrencyIsoCode), currentHashCode, theUserDefaultCurrencyIsoCode);
        }
        {
            String theUserEmail;
            theUserEmail = this.getUserEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userEmail", theUserEmail), currentHashCode, theUserEmail);
        }
        {
            String theUserFullName;
            theUserFullName = this.getUserFullName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userFullName", theUserFullName), currentHashCode, theUserFullName);
        }
        {
            String theUserId;
            theUserId = this.getUserId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userId", theUserId), currentHashCode, theUserId);
        }
        {
            String theUserLanguage;
            theUserLanguage = this.getUserLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userLanguage", theUserLanguage), currentHashCode, theUserLanguage);
        }
        {
            String theUserLocale;
            theUserLocale = this.getUserLocale();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userLocale", theUserLocale), currentHashCode, theUserLocale);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userName", theUserName), currentHashCode, theUserName);
        }
        {
            String theUserTimeZone;
            theUserTimeZone = this.getUserTimeZone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userTimeZone", theUserTimeZone), currentHashCode, theUserTimeZone);
        }
        {
            String theUserType;
            theUserType = this.getUserType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userType", theUserType), currentHashCode, theUserType);
        }
        {
            String theUserUiSkin;
            theUserUiSkin = this.getUserUiSkin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userUiSkin", theUserUiSkin), currentHashCode, theUserUiSkin);
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
            boolean theAccessibilityMode;
            theAccessibilityMode = (true?this.isAccessibilityMode():false);
            strategy.appendField(locator, this, "accessibilityMode", buffer, theAccessibilityMode);
        }
        {
            boolean theChatterExternal;
            theChatterExternal = (true?this.isChatterExternal():false);
            strategy.appendField(locator, this, "chatterExternal", buffer, theChatterExternal);
        }
        {
            String theCurrencySymbol;
            theCurrencySymbol = this.getCurrencySymbol();
            strategy.appendField(locator, this, "currencySymbol", buffer, theCurrencySymbol);
        }
        {
            String theDefaultAppIdForProfile;
            theDefaultAppIdForProfile = this.getDefaultAppIdForProfile();
            strategy.appendField(locator, this, "defaultAppIdForProfile", buffer, theDefaultAppIdForProfile);
        }
        {
            int theOrgAttachmentFileSizeLimit;
            theOrgAttachmentFileSizeLimit = (true?this.getOrgAttachmentFileSizeLimit(): 0);
            strategy.appendField(locator, this, "orgAttachmentFileSizeLimit", buffer, theOrgAttachmentFileSizeLimit);
        }
        {
            String theOrgDefaultCurrencyIsoCode;
            theOrgDefaultCurrencyIsoCode = this.getOrgDefaultCurrencyIsoCode();
            strategy.appendField(locator, this, "orgDefaultCurrencyIsoCode", buffer, theOrgDefaultCurrencyIsoCode);
        }
        {
            String theOrgDefaultCurrencyLocale;
            theOrgDefaultCurrencyLocale = this.getOrgDefaultCurrencyLocale();
            strategy.appendField(locator, this, "orgDefaultCurrencyLocale", buffer, theOrgDefaultCurrencyLocale);
        }
        {
            boolean theOrgDisallowHtmlAttachments;
            theOrgDisallowHtmlAttachments = (true?this.isOrgDisallowHtmlAttachments():false);
            strategy.appendField(locator, this, "orgDisallowHtmlAttachments", buffer, theOrgDisallowHtmlAttachments);
        }
        {
            boolean theOrgHasPersonAccounts;
            theOrgHasPersonAccounts = (true?this.isOrgHasPersonAccounts():false);
            strategy.appendField(locator, this, "orgHasPersonAccounts", buffer, theOrgHasPersonAccounts);
        }
        {
            String theOrganizationId;
            theOrganizationId = this.getOrganizationId();
            strategy.appendField(locator, this, "organizationId", buffer, theOrganizationId);
        }
        {
            boolean theOrganizationMultiCurrency;
            theOrganizationMultiCurrency = (true?this.isOrganizationMultiCurrency():false);
            strategy.appendField(locator, this, "organizationMultiCurrency", buffer, theOrganizationMultiCurrency);
        }
        {
            String theOrganizationName;
            theOrganizationName = this.getOrganizationName();
            strategy.appendField(locator, this, "organizationName", buffer, theOrganizationName);
        }
        {
            String theProfileId;
            theProfileId = this.getProfileId();
            strategy.appendField(locator, this, "profileId", buffer, theProfileId);
        }
        {
            String theRoleId;
            theRoleId = this.getRoleId();
            strategy.appendField(locator, this, "roleId", buffer, theRoleId);
        }
        {
            int theSessionSecondsValid;
            theSessionSecondsValid = (true?this.getSessionSecondsValid(): 0);
            strategy.appendField(locator, this, "sessionSecondsValid", buffer, theSessionSecondsValid);
        }
        {
            String theUserDefaultCurrencyIsoCode;
            theUserDefaultCurrencyIsoCode = this.getUserDefaultCurrencyIsoCode();
            strategy.appendField(locator, this, "userDefaultCurrencyIsoCode", buffer, theUserDefaultCurrencyIsoCode);
        }
        {
            String theUserEmail;
            theUserEmail = this.getUserEmail();
            strategy.appendField(locator, this, "userEmail", buffer, theUserEmail);
        }
        {
            String theUserFullName;
            theUserFullName = this.getUserFullName();
            strategy.appendField(locator, this, "userFullName", buffer, theUserFullName);
        }
        {
            String theUserId;
            theUserId = this.getUserId();
            strategy.appendField(locator, this, "userId", buffer, theUserId);
        }
        {
            String theUserLanguage;
            theUserLanguage = this.getUserLanguage();
            strategy.appendField(locator, this, "userLanguage", buffer, theUserLanguage);
        }
        {
            String theUserLocale;
            theUserLocale = this.getUserLocale();
            strategy.appendField(locator, this, "userLocale", buffer, theUserLocale);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            strategy.appendField(locator, this, "userName", buffer, theUserName);
        }
        {
            String theUserTimeZone;
            theUserTimeZone = this.getUserTimeZone();
            strategy.appendField(locator, this, "userTimeZone", buffer, theUserTimeZone);
        }
        {
            String theUserType;
            theUserType = this.getUserType();
            strategy.appendField(locator, this, "userType", buffer, theUserType);
        }
        {
            String theUserUiSkin;
            theUserUiSkin = this.getUserUiSkin();
            strategy.appendField(locator, this, "userUiSkin", buffer, theUserUiSkin);
        }
        return buffer;
    }

}
