
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
 * <p>Java class for DescribeMobileResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeMobileResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configured" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="defaultConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="emailSyncSettings" type="{urn:partner.soap.sforce.com}DescribeEmailSyncSettings" minOccurs="0"/&gt;
 *         &lt;element name="feedEnabledObjects" type="{urn:partner.soap.sforce.com}DescribeMobileSObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mobileSObject" type="{urn:partner.soap.sforce.com}DescribeMobileSObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mobileSettings" type="{urn:partner.soap.sforce.com}DescribeMobileSettings" minOccurs="0"/&gt;
 *         &lt;element name="mobileView" type="{urn:partner.soap.sforce.com}DescribeMobileView" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mobileViewDispColumn" type="{urn:partner.soap.sforce.com}DescribeMobileViewDispColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mobileViewFilter" type="{urn:partner.soap.sforce.com}DescribeMobileViewFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mobileViewSortOrder" type="{urn:partner.soap.sforce.com}DescribeMobileViewSortOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tabSet" type="{urn:partner.soap.sforce.com}DescribeTabSetResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeMobileResult", propOrder = {
    "configured",
    "defaultConfiguration",
    "emailSyncSettings",
    "feedEnabledObjects",
    "mobileSObjects",
    "mobileSettings",
    "mobileViews",
    "mobileViewDispColumns",
    "mobileViewFilters",
    "mobileViewSortOrders",
    "tabSets"
})
public class DescribeMobileResult
    implements Equals, HashCode, ToString
{

    protected boolean configured;
    protected boolean defaultConfiguration;
    protected DescribeEmailSyncSettings emailSyncSettings;
    protected List<DescribeMobileSObject> feedEnabledObjects;
    @XmlElement(name = "mobileSObject")
    protected List<DescribeMobileSObject> mobileSObjects;
    protected DescribeMobileSettings mobileSettings;
    @XmlElement(name = "mobileView")
    protected List<DescribeMobileView> mobileViews;
    @XmlElement(name = "mobileViewDispColumn")
    protected List<DescribeMobileViewDispColumn> mobileViewDispColumns;
    @XmlElement(name = "mobileViewFilter")
    protected List<DescribeMobileViewFilter> mobileViewFilters;
    @XmlElement(name = "mobileViewSortOrder")
    protected List<DescribeMobileViewSortOrder> mobileViewSortOrders;
    @XmlElement(name = "tabSet")
    protected List<DescribeTabSetResult> tabSets;

    /**
     * Gets the value of the configured property.
     * 
     */
    public boolean isConfigured() {
        return configured;
    }

    /**
     * Sets the value of the configured property.
     * 
     */
    public void setConfigured(boolean value) {
        this.configured = value;
    }

    /**
     * Gets the value of the defaultConfiguration property.
     * 
     */
    public boolean isDefaultConfiguration() {
        return defaultConfiguration;
    }

    /**
     * Sets the value of the defaultConfiguration property.
     * 
     */
    public void setDefaultConfiguration(boolean value) {
        this.defaultConfiguration = value;
    }

    /**
     * Gets the value of the emailSyncSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeEmailSyncSettings }
     *     
     */
    public DescribeEmailSyncSettings getEmailSyncSettings() {
        return emailSyncSettings;
    }

    /**
     * Sets the value of the emailSyncSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeEmailSyncSettings }
     *     
     */
    public void setEmailSyncSettings(DescribeEmailSyncSettings value) {
        this.emailSyncSettings = value;
    }

    /**
     * Gets the value of the feedEnabledObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedEnabledObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedEnabledObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeMobileSObject }
     * 
     * 
     */
    public List<DescribeMobileSObject> getFeedEnabledObjects() {
        if (feedEnabledObjects == null) {
            feedEnabledObjects = new ArrayList<DescribeMobileSObject>();
        }
        return this.feedEnabledObjects;
    }

    /**
     * Gets the value of the mobileSObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileSObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileSObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeMobileSObject }
     * 
     * 
     */
    public List<DescribeMobileSObject> getMobileSObjects() {
        if (mobileSObjects == null) {
            mobileSObjects = new ArrayList<DescribeMobileSObject>();
        }
        return this.mobileSObjects;
    }

    /**
     * Gets the value of the mobileSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeMobileSettings }
     *     
     */
    public DescribeMobileSettings getMobileSettings() {
        return mobileSettings;
    }

    /**
     * Sets the value of the mobileSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeMobileSettings }
     *     
     */
    public void setMobileSettings(DescribeMobileSettings value) {
        this.mobileSettings = value;
    }

    /**
     * Gets the value of the mobileViews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileViews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileViews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeMobileView }
     * 
     * 
     */
    public List<DescribeMobileView> getMobileViews() {
        if (mobileViews == null) {
            mobileViews = new ArrayList<DescribeMobileView>();
        }
        return this.mobileViews;
    }

    /**
     * Gets the value of the mobileViewDispColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileViewDispColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileViewDispColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeMobileViewDispColumn }
     * 
     * 
     */
    public List<DescribeMobileViewDispColumn> getMobileViewDispColumns() {
        if (mobileViewDispColumns == null) {
            mobileViewDispColumns = new ArrayList<DescribeMobileViewDispColumn>();
        }
        return this.mobileViewDispColumns;
    }

    /**
     * Gets the value of the mobileViewFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileViewFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileViewFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeMobileViewFilter }
     * 
     * 
     */
    public List<DescribeMobileViewFilter> getMobileViewFilters() {
        if (mobileViewFilters == null) {
            mobileViewFilters = new ArrayList<DescribeMobileViewFilter>();
        }
        return this.mobileViewFilters;
    }

    /**
     * Gets the value of the mobileViewSortOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileViewSortOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileViewSortOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeMobileViewSortOrder }
     * 
     * 
     */
    public List<DescribeMobileViewSortOrder> getMobileViewSortOrders() {
        if (mobileViewSortOrders == null) {
            mobileViewSortOrders = new ArrayList<DescribeMobileViewSortOrder>();
        }
        return this.mobileViewSortOrders;
    }

    /**
     * Gets the value of the tabSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeTabSetResult }
     * 
     * 
     */
    public List<DescribeTabSetResult> getTabSets() {
        if (tabSets == null) {
            tabSets = new ArrayList<DescribeTabSetResult>();
        }
        return this.tabSets;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeMobileResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeMobileResult that = ((DescribeMobileResult) object);
        {
            boolean lhsConfigured;
            lhsConfigured = (true?this.isConfigured():false);
            boolean rhsConfigured;
            rhsConfigured = (true?that.isConfigured():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "configured", lhsConfigured), LocatorUtils.property(thatLocator, "configured", rhsConfigured), lhsConfigured, rhsConfigured)) {
                return false;
            }
        }
        {
            boolean lhsDefaultConfiguration;
            lhsDefaultConfiguration = (true?this.isDefaultConfiguration():false);
            boolean rhsDefaultConfiguration;
            rhsDefaultConfiguration = (true?that.isDefaultConfiguration():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultConfiguration", lhsDefaultConfiguration), LocatorUtils.property(thatLocator, "defaultConfiguration", rhsDefaultConfiguration), lhsDefaultConfiguration, rhsDefaultConfiguration)) {
                return false;
            }
        }
        {
            DescribeEmailSyncSettings lhsEmailSyncSettings;
            lhsEmailSyncSettings = this.getEmailSyncSettings();
            DescribeEmailSyncSettings rhsEmailSyncSettings;
            rhsEmailSyncSettings = that.getEmailSyncSettings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailSyncSettings", lhsEmailSyncSettings), LocatorUtils.property(thatLocator, "emailSyncSettings", rhsEmailSyncSettings), lhsEmailSyncSettings, rhsEmailSyncSettings)) {
                return false;
            }
        }
        {
            List<DescribeMobileSObject> lhsFeedEnabledObjects;
            lhsFeedEnabledObjects = (((this.feedEnabledObjects!= null)&&(!this.feedEnabledObjects.isEmpty()))?this.getFeedEnabledObjects():null);
            List<DescribeMobileSObject> rhsFeedEnabledObjects;
            rhsFeedEnabledObjects = (((that.feedEnabledObjects!= null)&&(!that.feedEnabledObjects.isEmpty()))?that.getFeedEnabledObjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedEnabledObjects", lhsFeedEnabledObjects), LocatorUtils.property(thatLocator, "feedEnabledObjects", rhsFeedEnabledObjects), lhsFeedEnabledObjects, rhsFeedEnabledObjects)) {
                return false;
            }
        }
        {
            List<DescribeMobileSObject> lhsMobileSObjects;
            lhsMobileSObjects = (((this.mobileSObjects!= null)&&(!this.mobileSObjects.isEmpty()))?this.getMobileSObjects():null);
            List<DescribeMobileSObject> rhsMobileSObjects;
            rhsMobileSObjects = (((that.mobileSObjects!= null)&&(!that.mobileSObjects.isEmpty()))?that.getMobileSObjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileSObjects", lhsMobileSObjects), LocatorUtils.property(thatLocator, "mobileSObjects", rhsMobileSObjects), lhsMobileSObjects, rhsMobileSObjects)) {
                return false;
            }
        }
        {
            DescribeMobileSettings lhsMobileSettings;
            lhsMobileSettings = this.getMobileSettings();
            DescribeMobileSettings rhsMobileSettings;
            rhsMobileSettings = that.getMobileSettings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileSettings", lhsMobileSettings), LocatorUtils.property(thatLocator, "mobileSettings", rhsMobileSettings), lhsMobileSettings, rhsMobileSettings)) {
                return false;
            }
        }
        {
            List<DescribeMobileView> lhsMobileViews;
            lhsMobileViews = (((this.mobileViews!= null)&&(!this.mobileViews.isEmpty()))?this.getMobileViews():null);
            List<DescribeMobileView> rhsMobileViews;
            rhsMobileViews = (((that.mobileViews!= null)&&(!that.mobileViews.isEmpty()))?that.getMobileViews():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileViews", lhsMobileViews), LocatorUtils.property(thatLocator, "mobileViews", rhsMobileViews), lhsMobileViews, rhsMobileViews)) {
                return false;
            }
        }
        {
            List<DescribeMobileViewDispColumn> lhsMobileViewDispColumns;
            lhsMobileViewDispColumns = (((this.mobileViewDispColumns!= null)&&(!this.mobileViewDispColumns.isEmpty()))?this.getMobileViewDispColumns():null);
            List<DescribeMobileViewDispColumn> rhsMobileViewDispColumns;
            rhsMobileViewDispColumns = (((that.mobileViewDispColumns!= null)&&(!that.mobileViewDispColumns.isEmpty()))?that.getMobileViewDispColumns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileViewDispColumns", lhsMobileViewDispColumns), LocatorUtils.property(thatLocator, "mobileViewDispColumns", rhsMobileViewDispColumns), lhsMobileViewDispColumns, rhsMobileViewDispColumns)) {
                return false;
            }
        }
        {
            List<DescribeMobileViewFilter> lhsMobileViewFilters;
            lhsMobileViewFilters = (((this.mobileViewFilters!= null)&&(!this.mobileViewFilters.isEmpty()))?this.getMobileViewFilters():null);
            List<DescribeMobileViewFilter> rhsMobileViewFilters;
            rhsMobileViewFilters = (((that.mobileViewFilters!= null)&&(!that.mobileViewFilters.isEmpty()))?that.getMobileViewFilters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileViewFilters", lhsMobileViewFilters), LocatorUtils.property(thatLocator, "mobileViewFilters", rhsMobileViewFilters), lhsMobileViewFilters, rhsMobileViewFilters)) {
                return false;
            }
        }
        {
            List<DescribeMobileViewSortOrder> lhsMobileViewSortOrders;
            lhsMobileViewSortOrders = (((this.mobileViewSortOrders!= null)&&(!this.mobileViewSortOrders.isEmpty()))?this.getMobileViewSortOrders():null);
            List<DescribeMobileViewSortOrder> rhsMobileViewSortOrders;
            rhsMobileViewSortOrders = (((that.mobileViewSortOrders!= null)&&(!that.mobileViewSortOrders.isEmpty()))?that.getMobileViewSortOrders():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobileViewSortOrders", lhsMobileViewSortOrders), LocatorUtils.property(thatLocator, "mobileViewSortOrders", rhsMobileViewSortOrders), lhsMobileViewSortOrders, rhsMobileViewSortOrders)) {
                return false;
            }
        }
        {
            List<DescribeTabSetResult> lhsTabSets;
            lhsTabSets = (((this.tabSets!= null)&&(!this.tabSets.isEmpty()))?this.getTabSets():null);
            List<DescribeTabSetResult> rhsTabSets;
            rhsTabSets = (((that.tabSets!= null)&&(!that.tabSets.isEmpty()))?that.getTabSets():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tabSets", lhsTabSets), LocatorUtils.property(thatLocator, "tabSets", rhsTabSets), lhsTabSets, rhsTabSets)) {
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
            boolean theConfigured;
            theConfigured = (true?this.isConfigured():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "configured", theConfigured), currentHashCode, theConfigured);
        }
        {
            boolean theDefaultConfiguration;
            theDefaultConfiguration = (true?this.isDefaultConfiguration():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultConfiguration", theDefaultConfiguration), currentHashCode, theDefaultConfiguration);
        }
        {
            DescribeEmailSyncSettings theEmailSyncSettings;
            theEmailSyncSettings = this.getEmailSyncSettings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emailSyncSettings", theEmailSyncSettings), currentHashCode, theEmailSyncSettings);
        }
        {
            List<DescribeMobileSObject> theFeedEnabledObjects;
            theFeedEnabledObjects = (((this.feedEnabledObjects!= null)&&(!this.feedEnabledObjects.isEmpty()))?this.getFeedEnabledObjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feedEnabledObjects", theFeedEnabledObjects), currentHashCode, theFeedEnabledObjects);
        }
        {
            List<DescribeMobileSObject> theMobileSObjects;
            theMobileSObjects = (((this.mobileSObjects!= null)&&(!this.mobileSObjects.isEmpty()))?this.getMobileSObjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileSObjects", theMobileSObjects), currentHashCode, theMobileSObjects);
        }
        {
            DescribeMobileSettings theMobileSettings;
            theMobileSettings = this.getMobileSettings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileSettings", theMobileSettings), currentHashCode, theMobileSettings);
        }
        {
            List<DescribeMobileView> theMobileViews;
            theMobileViews = (((this.mobileViews!= null)&&(!this.mobileViews.isEmpty()))?this.getMobileViews():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileViews", theMobileViews), currentHashCode, theMobileViews);
        }
        {
            List<DescribeMobileViewDispColumn> theMobileViewDispColumns;
            theMobileViewDispColumns = (((this.mobileViewDispColumns!= null)&&(!this.mobileViewDispColumns.isEmpty()))?this.getMobileViewDispColumns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileViewDispColumns", theMobileViewDispColumns), currentHashCode, theMobileViewDispColumns);
        }
        {
            List<DescribeMobileViewFilter> theMobileViewFilters;
            theMobileViewFilters = (((this.mobileViewFilters!= null)&&(!this.mobileViewFilters.isEmpty()))?this.getMobileViewFilters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileViewFilters", theMobileViewFilters), currentHashCode, theMobileViewFilters);
        }
        {
            List<DescribeMobileViewSortOrder> theMobileViewSortOrders;
            theMobileViewSortOrders = (((this.mobileViewSortOrders!= null)&&(!this.mobileViewSortOrders.isEmpty()))?this.getMobileViewSortOrders():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobileViewSortOrders", theMobileViewSortOrders), currentHashCode, theMobileViewSortOrders);
        }
        {
            List<DescribeTabSetResult> theTabSets;
            theTabSets = (((this.tabSets!= null)&&(!this.tabSets.isEmpty()))?this.getTabSets():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tabSets", theTabSets), currentHashCode, theTabSets);
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
            boolean theConfigured;
            theConfigured = (true?this.isConfigured():false);
            strategy.appendField(locator, this, "configured", buffer, theConfigured);
        }
        {
            boolean theDefaultConfiguration;
            theDefaultConfiguration = (true?this.isDefaultConfiguration():false);
            strategy.appendField(locator, this, "defaultConfiguration", buffer, theDefaultConfiguration);
        }
        {
            DescribeEmailSyncSettings theEmailSyncSettings;
            theEmailSyncSettings = this.getEmailSyncSettings();
            strategy.appendField(locator, this, "emailSyncSettings", buffer, theEmailSyncSettings);
        }
        {
            List<DescribeMobileSObject> theFeedEnabledObjects;
            theFeedEnabledObjects = (((this.feedEnabledObjects!= null)&&(!this.feedEnabledObjects.isEmpty()))?this.getFeedEnabledObjects():null);
            strategy.appendField(locator, this, "feedEnabledObjects", buffer, theFeedEnabledObjects);
        }
        {
            List<DescribeMobileSObject> theMobileSObjects;
            theMobileSObjects = (((this.mobileSObjects!= null)&&(!this.mobileSObjects.isEmpty()))?this.getMobileSObjects():null);
            strategy.appendField(locator, this, "mobileSObjects", buffer, theMobileSObjects);
        }
        {
            DescribeMobileSettings theMobileSettings;
            theMobileSettings = this.getMobileSettings();
            strategy.appendField(locator, this, "mobileSettings", buffer, theMobileSettings);
        }
        {
            List<DescribeMobileView> theMobileViews;
            theMobileViews = (((this.mobileViews!= null)&&(!this.mobileViews.isEmpty()))?this.getMobileViews():null);
            strategy.appendField(locator, this, "mobileViews", buffer, theMobileViews);
        }
        {
            List<DescribeMobileViewDispColumn> theMobileViewDispColumns;
            theMobileViewDispColumns = (((this.mobileViewDispColumns!= null)&&(!this.mobileViewDispColumns.isEmpty()))?this.getMobileViewDispColumns():null);
            strategy.appendField(locator, this, "mobileViewDispColumns", buffer, theMobileViewDispColumns);
        }
        {
            List<DescribeMobileViewFilter> theMobileViewFilters;
            theMobileViewFilters = (((this.mobileViewFilters!= null)&&(!this.mobileViewFilters.isEmpty()))?this.getMobileViewFilters():null);
            strategy.appendField(locator, this, "mobileViewFilters", buffer, theMobileViewFilters);
        }
        {
            List<DescribeMobileViewSortOrder> theMobileViewSortOrders;
            theMobileViewSortOrders = (((this.mobileViewSortOrders!= null)&&(!this.mobileViewSortOrders.isEmpty()))?this.getMobileViewSortOrders():null);
            strategy.appendField(locator, this, "mobileViewSortOrders", buffer, theMobileViewSortOrders);
        }
        {
            List<DescribeTabSetResult> theTabSets;
            theTabSets = (((this.tabSets!= null)&&(!this.tabSets.isEmpty()))?this.getTabSets():null);
            strategy.appendField(locator, this, "tabSets", buffer, theTabSets);
        }
        return buffer;
    }

}
