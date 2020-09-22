
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
 * <p>Java class for DescribeGlobalTheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeGlobalTheme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="global" type="{urn:partner.soap.sforce.com}DescribeGlobalResult"/&gt;
 *         &lt;element name="theme" type="{urn:partner.soap.sforce.com}DescribeThemeResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeGlobalTheme", propOrder = {
    "global",
    "theme"
})
public class DescribeGlobalTheme2
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected DescribeGlobalResult global;
    @XmlElement(required = true)
    protected DescribeThemeResult theme;

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeGlobalResult }
     *     
     */
    public DescribeGlobalResult getGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeGlobalResult }
     *     
     */
    public void setGlobal(DescribeGlobalResult value) {
        this.global = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeThemeResult }
     *     
     */
    public DescribeThemeResult getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeThemeResult }
     *     
     */
    public void setTheme(DescribeThemeResult value) {
        this.theme = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeGlobalTheme2)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeGlobalTheme2 that = ((DescribeGlobalTheme2) object);
        {
            DescribeGlobalResult lhsGlobal;
            lhsGlobal = this.getGlobal();
            DescribeGlobalResult rhsGlobal;
            rhsGlobal = that.getGlobal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "global", lhsGlobal), LocatorUtils.property(thatLocator, "global", rhsGlobal), lhsGlobal, rhsGlobal)) {
                return false;
            }
        }
        {
            DescribeThemeResult lhsTheme;
            lhsTheme = this.getTheme();
            DescribeThemeResult rhsTheme;
            rhsTheme = that.getTheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "theme", lhsTheme), LocatorUtils.property(thatLocator, "theme", rhsTheme), lhsTheme, rhsTheme)) {
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
            DescribeGlobalResult theGlobal;
            theGlobal = this.getGlobal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "global", theGlobal), currentHashCode, theGlobal);
        }
        {
            DescribeThemeResult theTheme;
            theTheme = this.getTheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "theme", theTheme), currentHashCode, theTheme);
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
            DescribeGlobalResult theGlobal;
            theGlobal = this.getGlobal();
            strategy.appendField(locator, this, "global", buffer, theGlobal);
        }
        {
            DescribeThemeResult theTheme;
            theTheme = this.getTheme();
            strategy.appendField(locator, this, "theme", buffer, theTheme);
        }
        return buffer;
    }

}
