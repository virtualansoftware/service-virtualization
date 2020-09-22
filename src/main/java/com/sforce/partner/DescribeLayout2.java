
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
 * <p>Java class for DescribeLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buttonLayoutSection" type="{urn:partner.soap.sforce.com}DescribeLayoutButtonSection" minOccurs="0"/&gt;
 *         &lt;element name="detailLayoutSections" type="{urn:partner.soap.sforce.com}DescribeLayoutSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="editLayoutSections" type="{urn:partner.soap.sforce.com}DescribeLayoutSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedView" type="{urn:partner.soap.sforce.com}DescribeLayoutFeedView" minOccurs="0"/&gt;
 *         &lt;element name="highlightsPanelLayoutSection" type="{urn:partner.soap.sforce.com}DescribeLayoutSection" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="multirowEditLayoutSections" type="{urn:partner.soap.sforce.com}DescribeLayoutSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offlineLinks" type="{urn:partner.soap.sforce.com}OfflineLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quickActionList" type="{urn:partner.soap.sforce.com}DescribeQuickActionListResult" minOccurs="0"/&gt;
 *         &lt;element name="relatedContent" type="{urn:partner.soap.sforce.com}RelatedContent" minOccurs="0"/&gt;
 *         &lt;element name="relatedLists" type="{urn:partner.soap.sforce.com}RelatedList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="saveOptions" type="{urn:partner.soap.sforce.com}DescribeLayoutSaveOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayout", propOrder = {
    "buttonLayoutSection",
    "detailLayoutSections",
    "editLayoutSections",
    "feedView",
    "highlightsPanelLayoutSection",
    "id",
    "multirowEditLayoutSections",
    "offlineLinks",
    "quickActionList",
    "relatedContent",
    "relatedLists",
    "saveOptions"
})
public class DescribeLayout2
    implements Equals, HashCode, ToString
{

    protected DescribeLayoutButtonSection buttonLayoutSection;
    protected List<DescribeLayoutSection> detailLayoutSections;
    protected List<DescribeLayoutSection> editLayoutSections;
    protected DescribeLayoutFeedView feedView;
    protected DescribeLayoutSection highlightsPanelLayoutSection;
    @XmlElement(required = true, nillable = true)
    protected String id;
    protected List<DescribeLayoutSection> multirowEditLayoutSections;
    protected List<OfflineLink> offlineLinks;
    protected DescribeQuickActionListResult quickActionList;
    protected RelatedContent relatedContent;
    protected List<RelatedList> relatedLists;
    protected List<DescribeLayoutSaveOption> saveOptions;

    /**
     * Gets the value of the buttonLayoutSection property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutButtonSection }
     *     
     */
    public DescribeLayoutButtonSection getButtonLayoutSection() {
        return buttonLayoutSection;
    }

    /**
     * Sets the value of the buttonLayoutSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutButtonSection }
     *     
     */
    public void setButtonLayoutSection(DescribeLayoutButtonSection value) {
        this.buttonLayoutSection = value;
    }

    /**
     * Gets the value of the detailLayoutSections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailLayoutSections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailLayoutSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutSection }
     * 
     * 
     */
    public List<DescribeLayoutSection> getDetailLayoutSections() {
        if (detailLayoutSections == null) {
            detailLayoutSections = new ArrayList<DescribeLayoutSection>();
        }
        return this.detailLayoutSections;
    }

    /**
     * Gets the value of the editLayoutSections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editLayoutSections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditLayoutSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutSection }
     * 
     * 
     */
    public List<DescribeLayoutSection> getEditLayoutSections() {
        if (editLayoutSections == null) {
            editLayoutSections = new ArrayList<DescribeLayoutSection>();
        }
        return this.editLayoutSections;
    }

    /**
     * Gets the value of the feedView property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutFeedView }
     *     
     */
    public DescribeLayoutFeedView getFeedView() {
        return feedView;
    }

    /**
     * Sets the value of the feedView property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutFeedView }
     *     
     */
    public void setFeedView(DescribeLayoutFeedView value) {
        this.feedView = value;
    }

    /**
     * Gets the value of the highlightsPanelLayoutSection property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutSection }
     *     
     */
    public DescribeLayoutSection getHighlightsPanelLayoutSection() {
        return highlightsPanelLayoutSection;
    }

    /**
     * Sets the value of the highlightsPanelLayoutSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutSection }
     *     
     */
    public void setHighlightsPanelLayoutSection(DescribeLayoutSection value) {
        this.highlightsPanelLayoutSection = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the multirowEditLayoutSections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multirowEditLayoutSections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultirowEditLayoutSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutSection }
     * 
     * 
     */
    public List<DescribeLayoutSection> getMultirowEditLayoutSections() {
        if (multirowEditLayoutSections == null) {
            multirowEditLayoutSections = new ArrayList<DescribeLayoutSection>();
        }
        return this.multirowEditLayoutSections;
    }

    /**
     * Gets the value of the offlineLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offlineLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfflineLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfflineLink }
     * 
     * 
     */
    public List<OfflineLink> getOfflineLinks() {
        if (offlineLinks == null) {
            offlineLinks = new ArrayList<OfflineLink>();
        }
        return this.offlineLinks;
    }

    /**
     * Gets the value of the quickActionList property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeQuickActionListResult }
     *     
     */
    public DescribeQuickActionListResult getQuickActionList() {
        return quickActionList;
    }

    /**
     * Sets the value of the quickActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeQuickActionListResult }
     *     
     */
    public void setQuickActionList(DescribeQuickActionListResult value) {
        this.quickActionList = value;
    }

    /**
     * Gets the value of the relatedContent property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedContent }
     *     
     */
    public RelatedContent getRelatedContent() {
        return relatedContent;
    }

    /**
     * Sets the value of the relatedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedContent }
     *     
     */
    public void setRelatedContent(RelatedContent value) {
        this.relatedContent = value;
    }

    /**
     * Gets the value of the relatedLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedList }
     * 
     * 
     */
    public List<RelatedList> getRelatedLists() {
        if (relatedLists == null) {
            relatedLists = new ArrayList<RelatedList>();
        }
        return this.relatedLists;
    }

    /**
     * Gets the value of the saveOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saveOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaveOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutSaveOption }
     * 
     * 
     */
    public List<DescribeLayoutSaveOption> getSaveOptions() {
        if (saveOptions == null) {
            saveOptions = new ArrayList<DescribeLayoutSaveOption>();
        }
        return this.saveOptions;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayout2)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayout2 that = ((DescribeLayout2) object);
        {
            DescribeLayoutButtonSection lhsButtonLayoutSection;
            lhsButtonLayoutSection = this.getButtonLayoutSection();
            DescribeLayoutButtonSection rhsButtonLayoutSection;
            rhsButtonLayoutSection = that.getButtonLayoutSection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buttonLayoutSection", lhsButtonLayoutSection), LocatorUtils.property(thatLocator, "buttonLayoutSection", rhsButtonLayoutSection), lhsButtonLayoutSection, rhsButtonLayoutSection)) {
                return false;
            }
        }
        {
            List<DescribeLayoutSection> lhsDetailLayoutSections;
            lhsDetailLayoutSections = (((this.detailLayoutSections!= null)&&(!this.detailLayoutSections.isEmpty()))?this.getDetailLayoutSections():null);
            List<DescribeLayoutSection> rhsDetailLayoutSections;
            rhsDetailLayoutSections = (((that.detailLayoutSections!= null)&&(!that.detailLayoutSections.isEmpty()))?that.getDetailLayoutSections():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detailLayoutSections", lhsDetailLayoutSections), LocatorUtils.property(thatLocator, "detailLayoutSections", rhsDetailLayoutSections), lhsDetailLayoutSections, rhsDetailLayoutSections)) {
                return false;
            }
        }
        {
            List<DescribeLayoutSection> lhsEditLayoutSections;
            lhsEditLayoutSections = (((this.editLayoutSections!= null)&&(!this.editLayoutSections.isEmpty()))?this.getEditLayoutSections():null);
            List<DescribeLayoutSection> rhsEditLayoutSections;
            rhsEditLayoutSections = (((that.editLayoutSections!= null)&&(!that.editLayoutSections.isEmpty()))?that.getEditLayoutSections():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "editLayoutSections", lhsEditLayoutSections), LocatorUtils.property(thatLocator, "editLayoutSections", rhsEditLayoutSections), lhsEditLayoutSections, rhsEditLayoutSections)) {
                return false;
            }
        }
        {
            DescribeLayoutFeedView lhsFeedView;
            lhsFeedView = this.getFeedView();
            DescribeLayoutFeedView rhsFeedView;
            rhsFeedView = that.getFeedView();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedView", lhsFeedView), LocatorUtils.property(thatLocator, "feedView", rhsFeedView), lhsFeedView, rhsFeedView)) {
                return false;
            }
        }
        {
            DescribeLayoutSection lhsHighlightsPanelLayoutSection;
            lhsHighlightsPanelLayoutSection = this.getHighlightsPanelLayoutSection();
            DescribeLayoutSection rhsHighlightsPanelLayoutSection;
            rhsHighlightsPanelLayoutSection = that.getHighlightsPanelLayoutSection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "highlightsPanelLayoutSection", lhsHighlightsPanelLayoutSection), LocatorUtils.property(thatLocator, "highlightsPanelLayoutSection", rhsHighlightsPanelLayoutSection), lhsHighlightsPanelLayoutSection, rhsHighlightsPanelLayoutSection)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            List<DescribeLayoutSection> lhsMultirowEditLayoutSections;
            lhsMultirowEditLayoutSections = (((this.multirowEditLayoutSections!= null)&&(!this.multirowEditLayoutSections.isEmpty()))?this.getMultirowEditLayoutSections():null);
            List<DescribeLayoutSection> rhsMultirowEditLayoutSections;
            rhsMultirowEditLayoutSections = (((that.multirowEditLayoutSections!= null)&&(!that.multirowEditLayoutSections.isEmpty()))?that.getMultirowEditLayoutSections():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multirowEditLayoutSections", lhsMultirowEditLayoutSections), LocatorUtils.property(thatLocator, "multirowEditLayoutSections", rhsMultirowEditLayoutSections), lhsMultirowEditLayoutSections, rhsMultirowEditLayoutSections)) {
                return false;
            }
        }
        {
            List<OfflineLink> lhsOfflineLinks;
            lhsOfflineLinks = (((this.offlineLinks!= null)&&(!this.offlineLinks.isEmpty()))?this.getOfflineLinks():null);
            List<OfflineLink> rhsOfflineLinks;
            rhsOfflineLinks = (((that.offlineLinks!= null)&&(!that.offlineLinks.isEmpty()))?that.getOfflineLinks():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offlineLinks", lhsOfflineLinks), LocatorUtils.property(thatLocator, "offlineLinks", rhsOfflineLinks), lhsOfflineLinks, rhsOfflineLinks)) {
                return false;
            }
        }
        {
            DescribeQuickActionListResult lhsQuickActionList;
            lhsQuickActionList = this.getQuickActionList();
            DescribeQuickActionListResult rhsQuickActionList;
            rhsQuickActionList = that.getQuickActionList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quickActionList", lhsQuickActionList), LocatorUtils.property(thatLocator, "quickActionList", rhsQuickActionList), lhsQuickActionList, rhsQuickActionList)) {
                return false;
            }
        }
        {
            RelatedContent lhsRelatedContent;
            lhsRelatedContent = this.getRelatedContent();
            RelatedContent rhsRelatedContent;
            rhsRelatedContent = that.getRelatedContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relatedContent", lhsRelatedContent), LocatorUtils.property(thatLocator, "relatedContent", rhsRelatedContent), lhsRelatedContent, rhsRelatedContent)) {
                return false;
            }
        }
        {
            List<RelatedList> lhsRelatedLists;
            lhsRelatedLists = (((this.relatedLists!= null)&&(!this.relatedLists.isEmpty()))?this.getRelatedLists():null);
            List<RelatedList> rhsRelatedLists;
            rhsRelatedLists = (((that.relatedLists!= null)&&(!that.relatedLists.isEmpty()))?that.getRelatedLists():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relatedLists", lhsRelatedLists), LocatorUtils.property(thatLocator, "relatedLists", rhsRelatedLists), lhsRelatedLists, rhsRelatedLists)) {
                return false;
            }
        }
        {
            List<DescribeLayoutSaveOption> lhsSaveOptions;
            lhsSaveOptions = (((this.saveOptions!= null)&&(!this.saveOptions.isEmpty()))?this.getSaveOptions():null);
            List<DescribeLayoutSaveOption> rhsSaveOptions;
            rhsSaveOptions = (((that.saveOptions!= null)&&(!that.saveOptions.isEmpty()))?that.getSaveOptions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saveOptions", lhsSaveOptions), LocatorUtils.property(thatLocator, "saveOptions", rhsSaveOptions), lhsSaveOptions, rhsSaveOptions)) {
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
            DescribeLayoutButtonSection theButtonLayoutSection;
            theButtonLayoutSection = this.getButtonLayoutSection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buttonLayoutSection", theButtonLayoutSection), currentHashCode, theButtonLayoutSection);
        }
        {
            List<DescribeLayoutSection> theDetailLayoutSections;
            theDetailLayoutSections = (((this.detailLayoutSections!= null)&&(!this.detailLayoutSections.isEmpty()))?this.getDetailLayoutSections():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detailLayoutSections", theDetailLayoutSections), currentHashCode, theDetailLayoutSections);
        }
        {
            List<DescribeLayoutSection> theEditLayoutSections;
            theEditLayoutSections = (((this.editLayoutSections!= null)&&(!this.editLayoutSections.isEmpty()))?this.getEditLayoutSections():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editLayoutSections", theEditLayoutSections), currentHashCode, theEditLayoutSections);
        }
        {
            DescribeLayoutFeedView theFeedView;
            theFeedView = this.getFeedView();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feedView", theFeedView), currentHashCode, theFeedView);
        }
        {
            DescribeLayoutSection theHighlightsPanelLayoutSection;
            theHighlightsPanelLayoutSection = this.getHighlightsPanelLayoutSection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "highlightsPanelLayoutSection", theHighlightsPanelLayoutSection), currentHashCode, theHighlightsPanelLayoutSection);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            List<DescribeLayoutSection> theMultirowEditLayoutSections;
            theMultirowEditLayoutSections = (((this.multirowEditLayoutSections!= null)&&(!this.multirowEditLayoutSections.isEmpty()))?this.getMultirowEditLayoutSections():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multirowEditLayoutSections", theMultirowEditLayoutSections), currentHashCode, theMultirowEditLayoutSections);
        }
        {
            List<OfflineLink> theOfflineLinks;
            theOfflineLinks = (((this.offlineLinks!= null)&&(!this.offlineLinks.isEmpty()))?this.getOfflineLinks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offlineLinks", theOfflineLinks), currentHashCode, theOfflineLinks);
        }
        {
            DescribeQuickActionListResult theQuickActionList;
            theQuickActionList = this.getQuickActionList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quickActionList", theQuickActionList), currentHashCode, theQuickActionList);
        }
        {
            RelatedContent theRelatedContent;
            theRelatedContent = this.getRelatedContent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relatedContent", theRelatedContent), currentHashCode, theRelatedContent);
        }
        {
            List<RelatedList> theRelatedLists;
            theRelatedLists = (((this.relatedLists!= null)&&(!this.relatedLists.isEmpty()))?this.getRelatedLists():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relatedLists", theRelatedLists), currentHashCode, theRelatedLists);
        }
        {
            List<DescribeLayoutSaveOption> theSaveOptions;
            theSaveOptions = (((this.saveOptions!= null)&&(!this.saveOptions.isEmpty()))?this.getSaveOptions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saveOptions", theSaveOptions), currentHashCode, theSaveOptions);
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
            DescribeLayoutButtonSection theButtonLayoutSection;
            theButtonLayoutSection = this.getButtonLayoutSection();
            strategy.appendField(locator, this, "buttonLayoutSection", buffer, theButtonLayoutSection);
        }
        {
            List<DescribeLayoutSection> theDetailLayoutSections;
            theDetailLayoutSections = (((this.detailLayoutSections!= null)&&(!this.detailLayoutSections.isEmpty()))?this.getDetailLayoutSections():null);
            strategy.appendField(locator, this, "detailLayoutSections", buffer, theDetailLayoutSections);
        }
        {
            List<DescribeLayoutSection> theEditLayoutSections;
            theEditLayoutSections = (((this.editLayoutSections!= null)&&(!this.editLayoutSections.isEmpty()))?this.getEditLayoutSections():null);
            strategy.appendField(locator, this, "editLayoutSections", buffer, theEditLayoutSections);
        }
        {
            DescribeLayoutFeedView theFeedView;
            theFeedView = this.getFeedView();
            strategy.appendField(locator, this, "feedView", buffer, theFeedView);
        }
        {
            DescribeLayoutSection theHighlightsPanelLayoutSection;
            theHighlightsPanelLayoutSection = this.getHighlightsPanelLayoutSection();
            strategy.appendField(locator, this, "highlightsPanelLayoutSection", buffer, theHighlightsPanelLayoutSection);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            List<DescribeLayoutSection> theMultirowEditLayoutSections;
            theMultirowEditLayoutSections = (((this.multirowEditLayoutSections!= null)&&(!this.multirowEditLayoutSections.isEmpty()))?this.getMultirowEditLayoutSections():null);
            strategy.appendField(locator, this, "multirowEditLayoutSections", buffer, theMultirowEditLayoutSections);
        }
        {
            List<OfflineLink> theOfflineLinks;
            theOfflineLinks = (((this.offlineLinks!= null)&&(!this.offlineLinks.isEmpty()))?this.getOfflineLinks():null);
            strategy.appendField(locator, this, "offlineLinks", buffer, theOfflineLinks);
        }
        {
            DescribeQuickActionListResult theQuickActionList;
            theQuickActionList = this.getQuickActionList();
            strategy.appendField(locator, this, "quickActionList", buffer, theQuickActionList);
        }
        {
            RelatedContent theRelatedContent;
            theRelatedContent = this.getRelatedContent();
            strategy.appendField(locator, this, "relatedContent", buffer, theRelatedContent);
        }
        {
            List<RelatedList> theRelatedLists;
            theRelatedLists = (((this.relatedLists!= null)&&(!this.relatedLists.isEmpty()))?this.getRelatedLists():null);
            strategy.appendField(locator, this, "relatedLists", buffer, theRelatedLists);
        }
        {
            List<DescribeLayoutSaveOption> theSaveOptions;
            theSaveOptions = (((this.saveOptions!= null)&&(!this.saveOptions.isEmpty()))?this.getSaveOptions():null);
            strategy.appendField(locator, this, "saveOptions", buffer, theSaveOptions);
        }
        return buffer;
    }

}
