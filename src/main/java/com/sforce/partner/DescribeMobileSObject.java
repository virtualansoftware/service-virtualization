
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
 * <p>Java class for DescribeMobileSObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeMobileSObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="layout" type="{urn:partner.soap.sforce.com}DescribeLayoutResult" minOccurs="0"/&gt;
 *         &lt;element name="searchLayout" type="{urn:partner.soap.sforce.com}DescribeSearchLayoutResult" minOccurs="0"/&gt;
 *         &lt;element name="sobject" type="{urn:partner.soap.sforce.com}DescribeSObjectResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeMobileSObject", propOrder = {
    "iconUrl",
    "layout",
    "searchLayout",
    "sobject"
})
public class DescribeMobileSObject
    implements Equals, HashCode, ToString
{

    protected String iconUrl;
    protected DescribeLayoutResult layout;
    @XmlElement(nillable = true)
    protected DescribeSearchLayoutResult searchLayout;
    @XmlElement(required = true)
    protected DescribeSObjectResult sobject;

    /**
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrl(String value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutResult }
     *     
     */
    public DescribeLayoutResult getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutResult }
     *     
     */
    public void setLayout(DescribeLayoutResult value) {
        this.layout = value;
    }

    /**
     * Gets the value of the searchLayout property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeSearchLayoutResult }
     *     
     */
    public DescribeSearchLayoutResult getSearchLayout() {
        return searchLayout;
    }

    /**
     * Sets the value of the searchLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeSearchLayoutResult }
     *     
     */
    public void setSearchLayout(DescribeSearchLayoutResult value) {
        this.searchLayout = value;
    }

    /**
     * Gets the value of the sobject property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeSObjectResult }
     *     
     */
    public DescribeSObjectResult getSobject() {
        return sobject;
    }

    /**
     * Sets the value of the sobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeSObjectResult }
     *     
     */
    public void setSobject(DescribeSObjectResult value) {
        this.sobject = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeMobileSObject)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeMobileSObject that = ((DescribeMobileSObject) object);
        {
            String lhsIconUrl;
            lhsIconUrl = this.getIconUrl();
            String rhsIconUrl;
            rhsIconUrl = that.getIconUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "iconUrl", lhsIconUrl), LocatorUtils.property(thatLocator, "iconUrl", rhsIconUrl), lhsIconUrl, rhsIconUrl)) {
                return false;
            }
        }
        {
            DescribeLayoutResult lhsLayout;
            lhsLayout = this.getLayout();
            DescribeLayoutResult rhsLayout;
            rhsLayout = that.getLayout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layout", lhsLayout), LocatorUtils.property(thatLocator, "layout", rhsLayout), lhsLayout, rhsLayout)) {
                return false;
            }
        }
        {
            DescribeSearchLayoutResult lhsSearchLayout;
            lhsSearchLayout = this.getSearchLayout();
            DescribeSearchLayoutResult rhsSearchLayout;
            rhsSearchLayout = that.getSearchLayout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchLayout", lhsSearchLayout), LocatorUtils.property(thatLocator, "searchLayout", rhsSearchLayout), lhsSearchLayout, rhsSearchLayout)) {
                return false;
            }
        }
        {
            DescribeSObjectResult lhsSobject;
            lhsSobject = this.getSobject();
            DescribeSObjectResult rhsSobject;
            rhsSobject = that.getSobject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobject", lhsSobject), LocatorUtils.property(thatLocator, "sobject", rhsSobject), lhsSobject, rhsSobject)) {
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
            String theIconUrl;
            theIconUrl = this.getIconUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "iconUrl", theIconUrl), currentHashCode, theIconUrl);
        }
        {
            DescribeLayoutResult theLayout;
            theLayout = this.getLayout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layout", theLayout), currentHashCode, theLayout);
        }
        {
            DescribeSearchLayoutResult theSearchLayout;
            theSearchLayout = this.getSearchLayout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchLayout", theSearchLayout), currentHashCode, theSearchLayout);
        }
        {
            DescribeSObjectResult theSobject;
            theSobject = this.getSobject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobject", theSobject), currentHashCode, theSobject);
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
            String theIconUrl;
            theIconUrl = this.getIconUrl();
            strategy.appendField(locator, this, "iconUrl", buffer, theIconUrl);
        }
        {
            DescribeLayoutResult theLayout;
            theLayout = this.getLayout();
            strategy.appendField(locator, this, "layout", buffer, theLayout);
        }
        {
            DescribeSearchLayoutResult theSearchLayout;
            theSearchLayout = this.getSearchLayout();
            strategy.appendField(locator, this, "searchLayout", buffer, theSearchLayout);
        }
        {
            DescribeSObjectResult theSobject;
            theSobject = this.getSobject();
            strategy.appendField(locator, this, "sobject", buffer, theSobject);
        }
        return buffer;
    }

}
