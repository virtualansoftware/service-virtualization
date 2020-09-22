
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
 * <p>Java class for DescribeMobileSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeMobileSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lockUserToMobileDevice" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mappingURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maxTextFieldSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mobileDeviceHelpUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileLite" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mobilizeFollowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="multiDayEventsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeMobileSettings", propOrder = {
    "lockUserToMobileDevice",
    "mappingURL",
    "maxTextFieldSize",
    "mobileDeviceHelpUrl",
    "mobileLite",
    "mobilizeFollowed",
    "multiDayEventsEnabled"
})
public class DescribeMobileSettings
    implements Equals, HashCode, ToString
{

    protected boolean lockUserToMobileDevice;
    @XmlElement(required = true)
    protected String mappingURL;
    protected Integer maxTextFieldSize;
    protected String mobileDeviceHelpUrl;
    protected boolean mobileLite;
    protected boolean mobilizeFollowed;
    protected boolean multiDayEventsEnabled;

    /**
     * Gets the value of the lockUserToMobileDevice property.
     * 
     */
    public boolean isLockUserToMobileDevice() {
        return lockUserToMobileDevice;
    }

    /**
     * Sets the value of the lockUserToMobileDevice property.
     * 
     */
    public void setLockUserToMobileDevice(boolean value) {
        this.lockUserToMobileDevice = value;
    }

    /**
     * Gets the value of the mappingURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingURL() {
        return mappingURL;
    }

    /**
     * Sets the value of the mappingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingURL(String value) {
        this.mappingURL = value;
    }

    /**
     * Gets the value of the maxTextFieldSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTextFieldSize() {
        return maxTextFieldSize;
    }

    /**
     * Sets the value of the maxTextFieldSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTextFieldSize(Integer value) {
        this.maxTextFieldSize = value;
    }

    /**
     * Gets the value of the mobileDeviceHelpUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileDeviceHelpUrl() {
        return mobileDeviceHelpUrl;
    }

    /**
     * Sets the value of the mobileDeviceHelpUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileDeviceHelpUrl(String value) {
        this.mobileDeviceHelpUrl = value;
    }

    /**
     * Gets the value of the mobileLite property.
     * 
     */
    public boolean isMobileLite() {
        return mobileLite;
    }

    /**
     * Sets the value of the mobileLite property.
     * 
     */
    public void setMobileLite(boolean value) {
        this.mobileLite = value;
    }

    /**
     * Gets the value of the mobilizeFollowed property.
     * 
     */
    public boolean isMobilizeFollowed() {
        return mobilizeFollowed;
    }

    /**
     * Sets the value of the mobilizeFollowed property.
     * 
     */
    public void setMobilizeFollowed(boolean value) {
        this.mobilizeFollowed = value;
    }

    /**
     * Gets the value of the multiDayEventsEnabled property.
     * 
     */
    public boolean isMultiDayEventsEnabled() {
        return multiDayEventsEnabled;
    }

    /**
     * Sets the value of the multiDayEventsEnabled property.
     * 
     */
    public void setMultiDayEventsEnabled(boolean value) {
        this.multiDayEventsEnabled = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeMobileSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeMobileSettings that = ((DescribeMobileSettings) object);
        {
            boolean lhsLockUserToMobileDevice;
            lhsLockUserToMobileDevice = (true?this.isLockUserToMobileDevice():false);
            boolean rhsLockUserToMobileDevice;
            rhsLockUserToMobileDevice = (true?that.isLockUserToMobileDevice():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockUserToMobileDevice", lhsLockUserToMobileDevice), LocatorUtils.property(thatLocator, "lockUserToMobileDevice", rhsLockUserToMobileDevice), lhsLockUserToMobileDevice, rhsLockUserToMobileDevice)) {
                return false;
            }
        }
        {
            String lhsMappingURL;
            lhsMappingURL = this.getMappingURL();
            String rhsMappingURL;
            rhsMappingURL = that.getMappingURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mappingURL", lhsMappingURL), LocatorUtils.property(thatLocator, "mappingURL", rhsMappingURL), lhsMappingURL, rhsMappingURL)) {
                return false;
            }
        }
        {
            Integer lhsMaxTextFieldSize;
            lhsMaxTextFieldSize = this.getMaxTextFieldSize();
            Integer rhsMaxTextFieldSize;
            rhsMaxTextFieldSize = that.getMaxTextFieldSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxTextFieldSize", lhsMaxTextFieldSize), LocatorUtils.property(thatLocator, "maxTextFieldSize", rhsMaxTextFieldSize), lhsMaxTextFieldSize, rhsMaxTextFieldSize)) {
                return false;
            }
        }
        {
            String lhsMobileDeviceHelpUrl;
            lhsMobileDeviceHelpUrl = this.getMobileDeviceHelpUrl();
            String rhsMobileDeviceHelpUrl;
            rhsMobileDeviceHelpUrl = that.getMobileDeviceHelpUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileDeviceHelpUrl", lhsMobileDeviceHelpUrl), LocatorUtils.property(thatLocator, "mobileDeviceHelpUrl", rhsMobileDeviceHelpUrl), lhsMobileDeviceHelpUrl, rhsMobileDeviceHelpUrl)) {
                return false;
            }
        }
        {
            boolean lhsMobileLite;
            lhsMobileLite = (true?this.isMobileLite():false);
            boolean rhsMobileLite;
            rhsMobileLite = (true?that.isMobileLite():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileLite", lhsMobileLite), LocatorUtils.property(thatLocator, "mobileLite", rhsMobileLite), lhsMobileLite, rhsMobileLite)) {
                return false;
            }
        }
        {
            boolean lhsMobilizeFollowed;
            lhsMobilizeFollowed = (true?this.isMobilizeFollowed():false);
            boolean rhsMobilizeFollowed;
            rhsMobilizeFollowed = (true?that.isMobilizeFollowed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobilizeFollowed", lhsMobilizeFollowed), LocatorUtils.property(thatLocator, "mobilizeFollowed", rhsMobilizeFollowed), lhsMobilizeFollowed, rhsMobilizeFollowed)) {
                return false;
            }
        }
        {
            boolean lhsMultiDayEventsEnabled;
            lhsMultiDayEventsEnabled = (true?this.isMultiDayEventsEnabled():false);
            boolean rhsMultiDayEventsEnabled;
            rhsMultiDayEventsEnabled = (true?that.isMultiDayEventsEnabled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiDayEventsEnabled", lhsMultiDayEventsEnabled), LocatorUtils.property(thatLocator, "multiDayEventsEnabled", rhsMultiDayEventsEnabled), lhsMultiDayEventsEnabled, rhsMultiDayEventsEnabled)) {
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
            boolean theLockUserToMobileDevice;
            theLockUserToMobileDevice = (true?this.isLockUserToMobileDevice():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockUserToMobileDevice", theLockUserToMobileDevice), currentHashCode, theLockUserToMobileDevice);
        }
        {
            String theMappingURL;
            theMappingURL = this.getMappingURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mappingURL", theMappingURL), currentHashCode, theMappingURL);
        }
        {
            Integer theMaxTextFieldSize;
            theMaxTextFieldSize = this.getMaxTextFieldSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxTextFieldSize", theMaxTextFieldSize), currentHashCode, theMaxTextFieldSize);
        }
        {
            String theMobileDeviceHelpUrl;
            theMobileDeviceHelpUrl = this.getMobileDeviceHelpUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileDeviceHelpUrl", theMobileDeviceHelpUrl), currentHashCode, theMobileDeviceHelpUrl);
        }
        {
            boolean theMobileLite;
            theMobileLite = (true?this.isMobileLite():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileLite", theMobileLite), currentHashCode, theMobileLite);
        }
        {
            boolean theMobilizeFollowed;
            theMobilizeFollowed = (true?this.isMobilizeFollowed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobilizeFollowed", theMobilizeFollowed), currentHashCode, theMobilizeFollowed);
        }
        {
            boolean theMultiDayEventsEnabled;
            theMultiDayEventsEnabled = (true?this.isMultiDayEventsEnabled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiDayEventsEnabled", theMultiDayEventsEnabled), currentHashCode, theMultiDayEventsEnabled);
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
            boolean theLockUserToMobileDevice;
            theLockUserToMobileDevice = (true?this.isLockUserToMobileDevice():false);
            strategy.appendField(locator, this, "lockUserToMobileDevice", buffer, theLockUserToMobileDevice);
        }
        {
            String theMappingURL;
            theMappingURL = this.getMappingURL();
            strategy.appendField(locator, this, "mappingURL", buffer, theMappingURL);
        }
        {
            Integer theMaxTextFieldSize;
            theMaxTextFieldSize = this.getMaxTextFieldSize();
            strategy.appendField(locator, this, "maxTextFieldSize", buffer, theMaxTextFieldSize);
        }
        {
            String theMobileDeviceHelpUrl;
            theMobileDeviceHelpUrl = this.getMobileDeviceHelpUrl();
            strategy.appendField(locator, this, "mobileDeviceHelpUrl", buffer, theMobileDeviceHelpUrl);
        }
        {
            boolean theMobileLite;
            theMobileLite = (true?this.isMobileLite():false);
            strategy.appendField(locator, this, "mobileLite", buffer, theMobileLite);
        }
        {
            boolean theMobilizeFollowed;
            theMobilizeFollowed = (true?this.isMobilizeFollowed():false);
            strategy.appendField(locator, this, "mobilizeFollowed", buffer, theMobilizeFollowed);
        }
        {
            boolean theMultiDayEventsEnabled;
            theMultiDayEventsEnabled = (true?this.isMultiDayEventsEnabled():false);
            strategy.appendField(locator, this, "multiDayEventsEnabled", buffer, theMultiDayEventsEnabled);
        }
        return buffer;
    }

}
