
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
 * <p>Java class for AnalyticsCloudComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticsCloudComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}DescribeLayoutComponent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hideOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showSharing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showTitle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsCloudComponent", propOrder = {
    "error",
    "filter",
    "height",
    "hideOnError",
    "showSharing",
    "showTitle",
    "width"
})
public class AnalyticsCloudComponent
    extends DescribeLayoutComponent
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String error;
    @XmlElement(required = true)
    protected String filter;
    @XmlElement(required = true)
    protected String height;
    protected boolean hideOnError;
    protected boolean showSharing;
    protected boolean showTitle;
    @XmlElement(required = true)
    protected String width;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the hideOnError property.
     * 
     */
    public boolean isHideOnError() {
        return hideOnError;
    }

    /**
     * Sets the value of the hideOnError property.
     * 
     */
    public void setHideOnError(boolean value) {
        this.hideOnError = value;
    }

    /**
     * Gets the value of the showSharing property.
     * 
     */
    public boolean isShowSharing() {
        return showSharing;
    }

    /**
     * Sets the value of the showSharing property.
     * 
     */
    public void setShowSharing(boolean value) {
        this.showSharing = value;
    }

    /**
     * Gets the value of the showTitle property.
     * 
     */
    public boolean isShowTitle() {
        return showTitle;
    }

    /**
     * Sets the value of the showTitle property.
     * 
     */
    public void setShowTitle(boolean value) {
        this.showTitle = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AnalyticsCloudComponent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AnalyticsCloudComponent that = ((AnalyticsCloudComponent) object);
        {
            String lhsError;
            lhsError = this.getError();
            String rhsError;
            rhsError = that.getError();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "error", lhsError), LocatorUtils.property(thatLocator, "error", rhsError), lhsError, rhsError)) {
                return false;
            }
        }
        {
            String lhsFilter;
            lhsFilter = this.getFilter();
            String rhsFilter;
            rhsFilter = that.getFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filter", lhsFilter), LocatorUtils.property(thatLocator, "filter", rhsFilter), lhsFilter, rhsFilter)) {
                return false;
            }
        }
        {
            String lhsHeight;
            lhsHeight = this.getHeight();
            String rhsHeight;
            rhsHeight = that.getHeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "height", lhsHeight), LocatorUtils.property(thatLocator, "height", rhsHeight), lhsHeight, rhsHeight)) {
                return false;
            }
        }
        {
            boolean lhsHideOnError;
            lhsHideOnError = (true?this.isHideOnError():false);
            boolean rhsHideOnError;
            rhsHideOnError = (true?that.isHideOnError():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hideOnError", lhsHideOnError), LocatorUtils.property(thatLocator, "hideOnError", rhsHideOnError), lhsHideOnError, rhsHideOnError)) {
                return false;
            }
        }
        {
            boolean lhsShowSharing;
            lhsShowSharing = (true?this.isShowSharing():false);
            boolean rhsShowSharing;
            rhsShowSharing = (true?that.isShowSharing():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showSharing", lhsShowSharing), LocatorUtils.property(thatLocator, "showSharing", rhsShowSharing), lhsShowSharing, rhsShowSharing)) {
                return false;
            }
        }
        {
            boolean lhsShowTitle;
            lhsShowTitle = (true?this.isShowTitle():false);
            boolean rhsShowTitle;
            rhsShowTitle = (true?that.isShowTitle():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showTitle", lhsShowTitle), LocatorUtils.property(thatLocator, "showTitle", rhsShowTitle), lhsShowTitle, rhsShowTitle)) {
                return false;
            }
        }
        {
            String lhsWidth;
            lhsWidth = this.getWidth();
            String rhsWidth;
            rhsWidth = that.getWidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "width", lhsWidth), LocatorUtils.property(thatLocator, "width", rhsWidth), lhsWidth, rhsWidth)) {
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
            String theError;
            theError = this.getError();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "error", theError), currentHashCode, theError);
        }
        {
            String theFilter;
            theFilter = this.getFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filter", theFilter), currentHashCode, theFilter);
        }
        {
            String theHeight;
            theHeight = this.getHeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "height", theHeight), currentHashCode, theHeight);
        }
        {
            boolean theHideOnError;
            theHideOnError = (true?this.isHideOnError():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hideOnError", theHideOnError), currentHashCode, theHideOnError);
        }
        {
            boolean theShowSharing;
            theShowSharing = (true?this.isShowSharing():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showSharing", theShowSharing), currentHashCode, theShowSharing);
        }
        {
            boolean theShowTitle;
            theShowTitle = (true?this.isShowTitle():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showTitle", theShowTitle), currentHashCode, theShowTitle);
        }
        {
            String theWidth;
            theWidth = this.getWidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "width", theWidth), currentHashCode, theWidth);
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
            String theError;
            theError = this.getError();
            strategy.appendField(locator, this, "error", buffer, theError);
        }
        {
            String theFilter;
            theFilter = this.getFilter();
            strategy.appendField(locator, this, "filter", buffer, theFilter);
        }
        {
            String theHeight;
            theHeight = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theHeight);
        }
        {
            boolean theHideOnError;
            theHideOnError = (true?this.isHideOnError():false);
            strategy.appendField(locator, this, "hideOnError", buffer, theHideOnError);
        }
        {
            boolean theShowSharing;
            theShowSharing = (true?this.isShowSharing():false);
            strategy.appendField(locator, this, "showSharing", buffer, theShowSharing);
        }
        {
            boolean theShowTitle;
            theShowTitle = (true?this.isShowTitle():false);
            strategy.appendField(locator, this, "showTitle", buffer, theShowTitle);
        }
        {
            String theWidth;
            theWidth = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theWidth);
        }
        return buffer;
    }

}
