
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
 * <p>Java class for DescribeColor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeColor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeColor", propOrder = {
    "color",
    "context",
    "theme"
})
public class DescribeColor
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String color;
    @XmlElement(required = true)
    protected String context;
    @XmlElement(required = true)
    protected String theme;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeColor)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeColor that = ((DescribeColor) object);
        {
            String lhsColor;
            lhsColor = this.getColor();
            String rhsColor;
            rhsColor = that.getColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "color", lhsColor), LocatorUtils.property(thatLocator, "color", rhsColor), lhsColor, rhsColor)) {
                return false;
            }
        }
        {
            String lhsContext;
            lhsContext = this.getContext();
            String rhsContext;
            rhsContext = that.getContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "context", lhsContext), LocatorUtils.property(thatLocator, "context", rhsContext), lhsContext, rhsContext)) {
                return false;
            }
        }
        {
            String lhsTheme;
            lhsTheme = this.getTheme();
            String rhsTheme;
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
            String theColor;
            theColor = this.getColor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "color", theColor), currentHashCode, theColor);
        }
        {
            String theContext;
            theContext = this.getContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "context", theContext), currentHashCode, theContext);
        }
        {
            String theTheme;
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
            String theColor;
            theColor = this.getColor();
            strategy.appendField(locator, this, "color", buffer, theColor);
        }
        {
            String theContext;
            theContext = this.getContext();
            strategy.appendField(locator, this, "context", buffer, theContext);
        }
        {
            String theTheme;
            theTheme = this.getTheme();
            strategy.appendField(locator, this, "theme", buffer, theTheme);
        }
        return buffer;
    }

}
