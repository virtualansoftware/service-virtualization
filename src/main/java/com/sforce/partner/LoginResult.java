
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
 * <p>Java class for LoginResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metadataServerUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="passwordExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sandbox" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="serverUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="upgradeMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upgradeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="userInfo" type="{urn:partner.soap.sforce.com}GetUserInfoResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResult", propOrder = {
    "metadataServerUrl",
    "passwordExpired",
    "sandbox",
    "serverUrl",
    "sessionId",
    "upgradeMessage",
    "upgradeURL",
    "userId",
    "userInfo"
})
public class LoginResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String metadataServerUrl;
    protected boolean passwordExpired;
    protected boolean sandbox;
    @XmlElement(required = true, nillable = true)
    protected String serverUrl;
    @XmlElement(required = true, nillable = true)
    protected String sessionId;
    protected String upgradeMessage;
    protected String upgradeURL;
    @XmlElement(required = true, nillable = true)
    protected String userId;
    protected GetUserInfoResult userInfo;

    /**
     * Gets the value of the metadataServerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataServerUrl() {
        return metadataServerUrl;
    }

    /**
     * Sets the value of the metadataServerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataServerUrl(String value) {
        this.metadataServerUrl = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     */
    public boolean isPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     */
    public void setPasswordExpired(boolean value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the sandbox property.
     * 
     */
    public boolean isSandbox() {
        return sandbox;
    }

    /**
     * Sets the value of the sandbox property.
     * 
     */
    public void setSandbox(boolean value) {
        this.sandbox = value;
    }

    /**
     * Gets the value of the serverUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * Sets the value of the serverUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerUrl(String value) {
        this.serverUrl = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the upgradeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeMessage() {
        return upgradeMessage;
    }

    /**
     * Sets the value of the upgradeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeMessage(String value) {
        this.upgradeMessage = value;
    }

    /**
     * Gets the value of the upgradeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeURL() {
        return upgradeURL;
    }

    /**
     * Sets the value of the upgradeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeURL(String value) {
        this.upgradeURL = value;
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
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserInfoResult }
     *     
     */
    public GetUserInfoResult getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserInfoResult }
     *     
     */
    public void setUserInfo(GetUserInfoResult value) {
        this.userInfo = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LoginResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoginResult that = ((LoginResult) object);
        {
            String lhsMetadataServerUrl;
            lhsMetadataServerUrl = this.getMetadataServerUrl();
            String rhsMetadataServerUrl;
            rhsMetadataServerUrl = that.getMetadataServerUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metadataServerUrl", lhsMetadataServerUrl), LocatorUtils.property(thatLocator, "metadataServerUrl", rhsMetadataServerUrl), lhsMetadataServerUrl, rhsMetadataServerUrl)) {
                return false;
            }
        }
        {
            boolean lhsPasswordExpired;
            lhsPasswordExpired = (true?this.isPasswordExpired():false);
            boolean rhsPasswordExpired;
            rhsPasswordExpired = (true?that.isPasswordExpired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passwordExpired", lhsPasswordExpired), LocatorUtils.property(thatLocator, "passwordExpired", rhsPasswordExpired), lhsPasswordExpired, rhsPasswordExpired)) {
                return false;
            }
        }
        {
            boolean lhsSandbox;
            lhsSandbox = (true?this.isSandbox():false);
            boolean rhsSandbox;
            rhsSandbox = (true?that.isSandbox():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sandbox", lhsSandbox), LocatorUtils.property(thatLocator, "sandbox", rhsSandbox), lhsSandbox, rhsSandbox)) {
                return false;
            }
        }
        {
            String lhsServerUrl;
            lhsServerUrl = this.getServerUrl();
            String rhsServerUrl;
            rhsServerUrl = that.getServerUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serverUrl", lhsServerUrl), LocatorUtils.property(thatLocator, "serverUrl", rhsServerUrl), lhsServerUrl, rhsServerUrl)) {
                return false;
            }
        }
        {
            String lhsSessionId;
            lhsSessionId = this.getSessionId();
            String rhsSessionId;
            rhsSessionId = that.getSessionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sessionId", lhsSessionId), LocatorUtils.property(thatLocator, "sessionId", rhsSessionId), lhsSessionId, rhsSessionId)) {
                return false;
            }
        }
        {
            String lhsUpgradeMessage;
            lhsUpgradeMessage = this.getUpgradeMessage();
            String rhsUpgradeMessage;
            rhsUpgradeMessage = that.getUpgradeMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upgradeMessage", lhsUpgradeMessage), LocatorUtils.property(thatLocator, "upgradeMessage", rhsUpgradeMessage), lhsUpgradeMessage, rhsUpgradeMessage)) {
                return false;
            }
        }
        {
            String lhsUpgradeURL;
            lhsUpgradeURL = this.getUpgradeURL();
            String rhsUpgradeURL;
            rhsUpgradeURL = that.getUpgradeURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upgradeURL", lhsUpgradeURL), LocatorUtils.property(thatLocator, "upgradeURL", rhsUpgradeURL), lhsUpgradeURL, rhsUpgradeURL)) {
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
            GetUserInfoResult lhsUserInfo;
            lhsUserInfo = this.getUserInfo();
            GetUserInfoResult rhsUserInfo;
            rhsUserInfo = that.getUserInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userInfo", lhsUserInfo), LocatorUtils.property(thatLocator, "userInfo", rhsUserInfo), lhsUserInfo, rhsUserInfo)) {
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
            String theMetadataServerUrl;
            theMetadataServerUrl = this.getMetadataServerUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metadataServerUrl", theMetadataServerUrl), currentHashCode, theMetadataServerUrl);
        }
        {
            boolean thePasswordExpired;
            thePasswordExpired = (true?this.isPasswordExpired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passwordExpired", thePasswordExpired), currentHashCode, thePasswordExpired);
        }
        {
            boolean theSandbox;
            theSandbox = (true?this.isSandbox():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sandbox", theSandbox), currentHashCode, theSandbox);
        }
        {
            String theServerUrl;
            theServerUrl = this.getServerUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serverUrl", theServerUrl), currentHashCode, theServerUrl);
        }
        {
            String theSessionId;
            theSessionId = this.getSessionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sessionId", theSessionId), currentHashCode, theSessionId);
        }
        {
            String theUpgradeMessage;
            theUpgradeMessage = this.getUpgradeMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upgradeMessage", theUpgradeMessage), currentHashCode, theUpgradeMessage);
        }
        {
            String theUpgradeURL;
            theUpgradeURL = this.getUpgradeURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upgradeURL", theUpgradeURL), currentHashCode, theUpgradeURL);
        }
        {
            String theUserId;
            theUserId = this.getUserId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userId", theUserId), currentHashCode, theUserId);
        }
        {
            GetUserInfoResult theUserInfo;
            theUserInfo = this.getUserInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userInfo", theUserInfo), currentHashCode, theUserInfo);
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
            String theMetadataServerUrl;
            theMetadataServerUrl = this.getMetadataServerUrl();
            strategy.appendField(locator, this, "metadataServerUrl", buffer, theMetadataServerUrl);
        }
        {
            boolean thePasswordExpired;
            thePasswordExpired = (true?this.isPasswordExpired():false);
            strategy.appendField(locator, this, "passwordExpired", buffer, thePasswordExpired);
        }
        {
            boolean theSandbox;
            theSandbox = (true?this.isSandbox():false);
            strategy.appendField(locator, this, "sandbox", buffer, theSandbox);
        }
        {
            String theServerUrl;
            theServerUrl = this.getServerUrl();
            strategy.appendField(locator, this, "serverUrl", buffer, theServerUrl);
        }
        {
            String theSessionId;
            theSessionId = this.getSessionId();
            strategy.appendField(locator, this, "sessionId", buffer, theSessionId);
        }
        {
            String theUpgradeMessage;
            theUpgradeMessage = this.getUpgradeMessage();
            strategy.appendField(locator, this, "upgradeMessage", buffer, theUpgradeMessage);
        }
        {
            String theUpgradeURL;
            theUpgradeURL = this.getUpgradeURL();
            strategy.appendField(locator, this, "upgradeURL", buffer, theUpgradeURL);
        }
        {
            String theUserId;
            theUserId = this.getUserId();
            strategy.appendField(locator, this, "userId", buffer, theUserId);
        }
        {
            GetUserInfoResult theUserInfo;
            theUserInfo = this.getUserInfo();
            strategy.appendField(locator, this, "userInfo", buffer, theUserInfo);
        }
        return buffer;
    }

}
