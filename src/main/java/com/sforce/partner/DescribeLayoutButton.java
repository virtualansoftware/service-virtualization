
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for DescribeLayoutButton complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutButton"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="behavior" type="{urn:partner.soap.sforce.com}WebLinkWindowType" minOccurs="0"/&gt;
 *         &lt;element name="colors" type="{urn:partner.soap.sforce.com}DescribeColor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contentSource" type="{urn:partner.soap.sforce.com}WebLinkType" minOccurs="0"/&gt;
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="icons" type="{urn:partner.soap.sforce.com}DescribeIcon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="menubar" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="overridden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="resizeable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="scrollbars" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showsLocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showsStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="toolbar" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="windowPosition" type="{urn:partner.soap.sforce.com}WebLinkPosition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutButton", propOrder = {
    "behavior",
    "colors",
    "content",
    "contentSource",
    "custom",
    "encoding",
    "height",
    "icons",
    "label",
    "menubar",
    "name",
    "overridden",
    "resizeable",
    "scrollbars",
    "showsLocation",
    "showsStatus",
    "toolbar",
    "url",
    "width",
    "windowPosition"
})
public class DescribeLayoutButton
    implements Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected WebLinkWindowType behavior;
    protected List<DescribeColor> colors;
    @XmlElement(nillable = true)
    protected String content;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected WebLinkType contentSource;
    protected boolean custom;
    @XmlElement(nillable = true)
    protected String encoding;
    @XmlElement(nillable = true)
    protected Integer height;
    protected List<DescribeIcon> icons;
    @XmlElement(required = true, nillable = true)
    protected String label;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean menubar;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean overridden;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean resizeable;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean scrollbars;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean showsLocation;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean showsStatus;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean toolbar;
    @XmlElement(nillable = true)
    protected String url;
    @XmlElement(nillable = true)
    protected Integer width;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected WebLinkPosition windowPosition;

    /**
     * Gets the value of the behavior property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkWindowType }
     *     
     */
    public WebLinkWindowType getBehavior() {
        return behavior;
    }

    /**
     * Sets the value of the behavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkWindowType }
     *     
     */
    public void setBehavior(WebLinkWindowType value) {
        this.behavior = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeColor }
     * 
     * 
     */
    public List<DescribeColor> getColors() {
        if (colors == null) {
            colors = new ArrayList<DescribeColor>();
        }
        return this.colors;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the contentSource property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkType }
     *     
     */
    public WebLinkType getContentSource() {
        return contentSource;
    }

    /**
     * Sets the value of the contentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkType }
     *     
     */
    public void setContentSource(WebLinkType value) {
        this.contentSource = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the icons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeIcon }
     * 
     * 
     */
    public List<DescribeIcon> getIcons() {
        if (icons == null) {
            icons = new ArrayList<DescribeIcon>();
        }
        return this.icons;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the menubar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMenubar() {
        return menubar;
    }

    /**
     * Sets the value of the menubar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMenubar(Boolean value) {
        this.menubar = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the overridden property.
     * 
     */
    public boolean isOverridden() {
        return overridden;
    }

    /**
     * Sets the value of the overridden property.
     * 
     */
    public void setOverridden(boolean value) {
        this.overridden = value;
    }

    /**
     * Gets the value of the resizeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResizeable() {
        return resizeable;
    }

    /**
     * Sets the value of the resizeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResizeable(Boolean value) {
        this.resizeable = value;
    }

    /**
     * Gets the value of the scrollbars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScrollbars() {
        return scrollbars;
    }

    /**
     * Sets the value of the scrollbars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScrollbars(Boolean value) {
        this.scrollbars = value;
    }

    /**
     * Gets the value of the showsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowsLocation() {
        return showsLocation;
    }

    /**
     * Sets the value of the showsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowsLocation(Boolean value) {
        this.showsLocation = value;
    }

    /**
     * Gets the value of the showsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowsStatus() {
        return showsStatus;
    }

    /**
     * Sets the value of the showsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowsStatus(Boolean value) {
        this.showsStatus = value;
    }

    /**
     * Gets the value of the toolbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToolbar() {
        return toolbar;
    }

    /**
     * Sets the value of the toolbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToolbar(Boolean value) {
        this.toolbar = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Gets the value of the windowPosition property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkPosition }
     *     
     */
    public WebLinkPosition getWindowPosition() {
        return windowPosition;
    }

    /**
     * Sets the value of the windowPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkPosition }
     *     
     */
    public void setWindowPosition(WebLinkPosition value) {
        this.windowPosition = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayoutButton)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayoutButton that = ((DescribeLayoutButton) object);
        {
            WebLinkWindowType lhsBehavior;
            lhsBehavior = this.getBehavior();
            WebLinkWindowType rhsBehavior;
            rhsBehavior = that.getBehavior();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "behavior", lhsBehavior), LocatorUtils.property(thatLocator, "behavior", rhsBehavior), lhsBehavior, rhsBehavior)) {
                return false;
            }
        }
        {
            List<DescribeColor> lhsColors;
            lhsColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            List<DescribeColor> rhsColors;
            rhsColors = (((that.colors!= null)&&(!that.colors.isEmpty()))?that.getColors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colors", lhsColors), LocatorUtils.property(thatLocator, "colors", rhsColors), lhsColors, rhsColors)) {
                return false;
            }
        }
        {
            String lhsContent;
            lhsContent = this.getContent();
            String rhsContent;
            rhsContent = that.getContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
                return false;
            }
        }
        {
            WebLinkType lhsContentSource;
            lhsContentSource = this.getContentSource();
            WebLinkType rhsContentSource;
            rhsContentSource = that.getContentSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentSource", lhsContentSource), LocatorUtils.property(thatLocator, "contentSource", rhsContentSource), lhsContentSource, rhsContentSource)) {
                return false;
            }
        }
        {
            boolean lhsCustom;
            lhsCustom = (true?this.isCustom():false);
            boolean rhsCustom;
            rhsCustom = (true?that.isCustom():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "custom", lhsCustom), LocatorUtils.property(thatLocator, "custom", rhsCustom), lhsCustom, rhsCustom)) {
                return false;
            }
        }
        {
            String lhsEncoding;
            lhsEncoding = this.getEncoding();
            String rhsEncoding;
            rhsEncoding = that.getEncoding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encoding", lhsEncoding), LocatorUtils.property(thatLocator, "encoding", rhsEncoding), lhsEncoding, rhsEncoding)) {
                return false;
            }
        }
        {
            Integer lhsHeight;
            lhsHeight = this.getHeight();
            Integer rhsHeight;
            rhsHeight = that.getHeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "height", lhsHeight), LocatorUtils.property(thatLocator, "height", rhsHeight), lhsHeight, rhsHeight)) {
                return false;
            }
        }
        {
            List<DescribeIcon> lhsIcons;
            lhsIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            List<DescribeIcon> rhsIcons;
            rhsIcons = (((that.icons!= null)&&(!that.icons.isEmpty()))?that.getIcons():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "icons", lhsIcons), LocatorUtils.property(thatLocator, "icons", rhsIcons), lhsIcons, rhsIcons)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            Boolean lhsMenubar;
            lhsMenubar = this.isMenubar();
            Boolean rhsMenubar;
            rhsMenubar = that.isMenubar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "menubar", lhsMenubar), LocatorUtils.property(thatLocator, "menubar", rhsMenubar), lhsMenubar, rhsMenubar)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            boolean lhsOverridden;
            lhsOverridden = (true?this.isOverridden():false);
            boolean rhsOverridden;
            rhsOverridden = (true?that.isOverridden():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overridden", lhsOverridden), LocatorUtils.property(thatLocator, "overridden", rhsOverridden), lhsOverridden, rhsOverridden)) {
                return false;
            }
        }
        {
            Boolean lhsResizeable;
            lhsResizeable = this.isResizeable();
            Boolean rhsResizeable;
            rhsResizeable = that.isResizeable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resizeable", lhsResizeable), LocatorUtils.property(thatLocator, "resizeable", rhsResizeable), lhsResizeable, rhsResizeable)) {
                return false;
            }
        }
        {
            Boolean lhsScrollbars;
            lhsScrollbars = this.isScrollbars();
            Boolean rhsScrollbars;
            rhsScrollbars = that.isScrollbars();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scrollbars", lhsScrollbars), LocatorUtils.property(thatLocator, "scrollbars", rhsScrollbars), lhsScrollbars, rhsScrollbars)) {
                return false;
            }
        }
        {
            Boolean lhsShowsLocation;
            lhsShowsLocation = this.isShowsLocation();
            Boolean rhsShowsLocation;
            rhsShowsLocation = that.isShowsLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showsLocation", lhsShowsLocation), LocatorUtils.property(thatLocator, "showsLocation", rhsShowsLocation), lhsShowsLocation, rhsShowsLocation)) {
                return false;
            }
        }
        {
            Boolean lhsShowsStatus;
            lhsShowsStatus = this.isShowsStatus();
            Boolean rhsShowsStatus;
            rhsShowsStatus = that.isShowsStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showsStatus", lhsShowsStatus), LocatorUtils.property(thatLocator, "showsStatus", rhsShowsStatus), lhsShowsStatus, rhsShowsStatus)) {
                return false;
            }
        }
        {
            Boolean lhsToolbar;
            lhsToolbar = this.isToolbar();
            Boolean rhsToolbar;
            rhsToolbar = that.isToolbar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toolbar", lhsToolbar), LocatorUtils.property(thatLocator, "toolbar", rhsToolbar), lhsToolbar, rhsToolbar)) {
                return false;
            }
        }
        {
            String lhsUrl;
            lhsUrl = this.getUrl();
            String rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
                return false;
            }
        }
        {
            Integer lhsWidth;
            lhsWidth = this.getWidth();
            Integer rhsWidth;
            rhsWidth = that.getWidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "width", lhsWidth), LocatorUtils.property(thatLocator, "width", rhsWidth), lhsWidth, rhsWidth)) {
                return false;
            }
        }
        {
            WebLinkPosition lhsWindowPosition;
            lhsWindowPosition = this.getWindowPosition();
            WebLinkPosition rhsWindowPosition;
            rhsWindowPosition = that.getWindowPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "windowPosition", lhsWindowPosition), LocatorUtils.property(thatLocator, "windowPosition", rhsWindowPosition), lhsWindowPosition, rhsWindowPosition)) {
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
            WebLinkWindowType theBehavior;
            theBehavior = this.getBehavior();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "behavior", theBehavior), currentHashCode, theBehavior);
        }
        {
            List<DescribeColor> theColors;
            theColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colors", theColors), currentHashCode, theColors);
        }
        {
            String theContent;
            theContent = this.getContent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
        }
        {
            WebLinkType theContentSource;
            theContentSource = this.getContentSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contentSource", theContentSource), currentHashCode, theContentSource);
        }
        {
            boolean theCustom;
            theCustom = (true?this.isCustom():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "custom", theCustom), currentHashCode, theCustom);
        }
        {
            String theEncoding;
            theEncoding = this.getEncoding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encoding", theEncoding), currentHashCode, theEncoding);
        }
        {
            Integer theHeight;
            theHeight = this.getHeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "height", theHeight), currentHashCode, theHeight);
        }
        {
            List<DescribeIcon> theIcons;
            theIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "icons", theIcons), currentHashCode, theIcons);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            Boolean theMenubar;
            theMenubar = this.isMenubar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "menubar", theMenubar), currentHashCode, theMenubar);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            boolean theOverridden;
            theOverridden = (true?this.isOverridden():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "overridden", theOverridden), currentHashCode, theOverridden);
        }
        {
            Boolean theResizeable;
            theResizeable = this.isResizeable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resizeable", theResizeable), currentHashCode, theResizeable);
        }
        {
            Boolean theScrollbars;
            theScrollbars = this.isScrollbars();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scrollbars", theScrollbars), currentHashCode, theScrollbars);
        }
        {
            Boolean theShowsLocation;
            theShowsLocation = this.isShowsLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showsLocation", theShowsLocation), currentHashCode, theShowsLocation);
        }
        {
            Boolean theShowsStatus;
            theShowsStatus = this.isShowsStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showsStatus", theShowsStatus), currentHashCode, theShowsStatus);
        }
        {
            Boolean theToolbar;
            theToolbar = this.isToolbar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toolbar", theToolbar), currentHashCode, theToolbar);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theUrl), currentHashCode, theUrl);
        }
        {
            Integer theWidth;
            theWidth = this.getWidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "width", theWidth), currentHashCode, theWidth);
        }
        {
            WebLinkPosition theWindowPosition;
            theWindowPosition = this.getWindowPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "windowPosition", theWindowPosition), currentHashCode, theWindowPosition);
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
            WebLinkWindowType theBehavior;
            theBehavior = this.getBehavior();
            strategy.appendField(locator, this, "behavior", buffer, theBehavior);
        }
        {
            List<DescribeColor> theColors;
            theColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            strategy.appendField(locator, this, "colors", buffer, theColors);
        }
        {
            String theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        {
            WebLinkType theContentSource;
            theContentSource = this.getContentSource();
            strategy.appendField(locator, this, "contentSource", buffer, theContentSource);
        }
        {
            boolean theCustom;
            theCustom = (true?this.isCustom():false);
            strategy.appendField(locator, this, "custom", buffer, theCustom);
        }
        {
            String theEncoding;
            theEncoding = this.getEncoding();
            strategy.appendField(locator, this, "encoding", buffer, theEncoding);
        }
        {
            Integer theHeight;
            theHeight = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theHeight);
        }
        {
            List<DescribeIcon> theIcons;
            theIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            strategy.appendField(locator, this, "icons", buffer, theIcons);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            Boolean theMenubar;
            theMenubar = this.isMenubar();
            strategy.appendField(locator, this, "menubar", buffer, theMenubar);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            boolean theOverridden;
            theOverridden = (true?this.isOverridden():false);
            strategy.appendField(locator, this, "overridden", buffer, theOverridden);
        }
        {
            Boolean theResizeable;
            theResizeable = this.isResizeable();
            strategy.appendField(locator, this, "resizeable", buffer, theResizeable);
        }
        {
            Boolean theScrollbars;
            theScrollbars = this.isScrollbars();
            strategy.appendField(locator, this, "scrollbars", buffer, theScrollbars);
        }
        {
            Boolean theShowsLocation;
            theShowsLocation = this.isShowsLocation();
            strategy.appendField(locator, this, "showsLocation", buffer, theShowsLocation);
        }
        {
            Boolean theShowsStatus;
            theShowsStatus = this.isShowsStatus();
            strategy.appendField(locator, this, "showsStatus", buffer, theShowsStatus);
        }
        {
            Boolean theToolbar;
            theToolbar = this.isToolbar();
            strategy.appendField(locator, this, "toolbar", buffer, theToolbar);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            Integer theWidth;
            theWidth = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theWidth);
        }
        {
            WebLinkPosition theWindowPosition;
            theWindowPosition = this.getWindowPosition();
            strategy.appendField(locator, this, "windowPosition", buffer, theWindowPosition);
        }
        return buffer;
    }

}
