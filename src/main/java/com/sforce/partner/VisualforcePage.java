
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
 * <p>Java class for VisualforcePage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisualforcePage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}DescribeLayoutComponent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="showLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showScrollbars" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="suggestedHeight" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="suggestedWidth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisualforcePage", propOrder = {
    "showLabel",
    "showScrollbars",
    "suggestedHeight",
    "suggestedWidth",
    "url"
})
public class VisualforcePage
    extends DescribeLayoutComponent
    implements Equals, HashCode, ToString
{

    protected boolean showLabel;
    protected boolean showScrollbars;
    @XmlElement(required = true)
    protected String suggestedHeight;
    @XmlElement(required = true)
    protected String suggestedWidth;
    @XmlElement(required = true)
    protected String url;

    /**
     * Gets the value of the showLabel property.
     * 
     */
    public boolean isShowLabel() {
        return showLabel;
    }

    /**
     * Sets the value of the showLabel property.
     * 
     */
    public void setShowLabel(boolean value) {
        this.showLabel = value;
    }

    /**
     * Gets the value of the showScrollbars property.
     * 
     */
    public boolean isShowScrollbars() {
        return showScrollbars;
    }

    /**
     * Sets the value of the showScrollbars property.
     * 
     */
    public void setShowScrollbars(boolean value) {
        this.showScrollbars = value;
    }

    /**
     * Gets the value of the suggestedHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedHeight() {
        return suggestedHeight;
    }

    /**
     * Sets the value of the suggestedHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedHeight(String value) {
        this.suggestedHeight = value;
    }

    /**
     * Gets the value of the suggestedWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedWidth() {
        return suggestedWidth;
    }

    /**
     * Sets the value of the suggestedWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedWidth(String value) {
        this.suggestedWidth = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VisualforcePage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final VisualforcePage that = ((VisualforcePage) object);
        {
            boolean lhsShowLabel;
            lhsShowLabel = (true?this.isShowLabel():false);
            boolean rhsShowLabel;
            rhsShowLabel = (true?that.isShowLabel():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showLabel", lhsShowLabel), LocatorUtils.property(thatLocator, "showLabel", rhsShowLabel), lhsShowLabel, rhsShowLabel)) {
                return false;
            }
        }
        {
            boolean lhsShowScrollbars;
            lhsShowScrollbars = (true?this.isShowScrollbars():false);
            boolean rhsShowScrollbars;
            rhsShowScrollbars = (true?that.isShowScrollbars():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showScrollbars", lhsShowScrollbars), LocatorUtils.property(thatLocator, "showScrollbars", rhsShowScrollbars), lhsShowScrollbars, rhsShowScrollbars)) {
                return false;
            }
        }
        {
            String lhsSuggestedHeight;
            lhsSuggestedHeight = this.getSuggestedHeight();
            String rhsSuggestedHeight;
            rhsSuggestedHeight = that.getSuggestedHeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suggestedHeight", lhsSuggestedHeight), LocatorUtils.property(thatLocator, "suggestedHeight", rhsSuggestedHeight), lhsSuggestedHeight, rhsSuggestedHeight)) {
                return false;
            }
        }
        {
            String lhsSuggestedWidth;
            lhsSuggestedWidth = this.getSuggestedWidth();
            String rhsSuggestedWidth;
            rhsSuggestedWidth = that.getSuggestedWidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suggestedWidth", lhsSuggestedWidth), LocatorUtils.property(thatLocator, "suggestedWidth", rhsSuggestedWidth), lhsSuggestedWidth, rhsSuggestedWidth)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theShowLabel;
            theShowLabel = (true?this.isShowLabel():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showLabel", theShowLabel), currentHashCode, theShowLabel);
        }
        {
            boolean theShowScrollbars;
            theShowScrollbars = (true?this.isShowScrollbars():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showScrollbars", theShowScrollbars), currentHashCode, theShowScrollbars);
        }
        {
            String theSuggestedHeight;
            theSuggestedHeight = this.getSuggestedHeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suggestedHeight", theSuggestedHeight), currentHashCode, theSuggestedHeight);
        }
        {
            String theSuggestedWidth;
            theSuggestedWidth = this.getSuggestedWidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suggestedWidth", theSuggestedWidth), currentHashCode, theSuggestedWidth);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theUrl), currentHashCode, theUrl);
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
        super.appendFields(locator, buffer, strategy);
        {
            boolean theShowLabel;
            theShowLabel = (true?this.isShowLabel():false);
            strategy.appendField(locator, this, "showLabel", buffer, theShowLabel);
        }
        {
            boolean theShowScrollbars;
            theShowScrollbars = (true?this.isShowScrollbars():false);
            strategy.appendField(locator, this, "showScrollbars", buffer, theShowScrollbars);
        }
        {
            String theSuggestedHeight;
            theSuggestedHeight = this.getSuggestedHeight();
            strategy.appendField(locator, this, "suggestedHeight", buffer, theSuggestedHeight);
        }
        {
            String theSuggestedWidth;
            theSuggestedWidth = this.getSuggestedWidth();
            strategy.appendField(locator, this, "suggestedWidth", buffer, theSuggestedWidth);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        return buffer;
    }

}
