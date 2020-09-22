
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
 * <p>Java class for LimitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitInfo", propOrder = {
    "appName",
    "current",
    "limit",
    "type"
})
public class LimitInfo
    implements Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected String appName;
    protected int current;
    protected int limit;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the current property.
     * 
     */
    public int getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(int value) {
        this.current = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LimitInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LimitInfo that = ((LimitInfo) object);
        {
            String lhsAppName;
            lhsAppName = this.getAppName();
            String rhsAppName;
            rhsAppName = that.getAppName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appName", lhsAppName), LocatorUtils.property(thatLocator, "appName", rhsAppName), lhsAppName, rhsAppName)) {
                return false;
            }
        }
        {
            int lhsCurrent;
            lhsCurrent = (true?this.getCurrent(): 0);
            int rhsCurrent;
            rhsCurrent = (true?that.getCurrent(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "current", lhsCurrent), LocatorUtils.property(thatLocator, "current", rhsCurrent), lhsCurrent, rhsCurrent)) {
                return false;
            }
        }
        {
            int lhsLimit;
            lhsLimit = (true?this.getLimit(): 0);
            int rhsLimit;
            rhsLimit = (true?that.getLimit(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limit", lhsLimit), LocatorUtils.property(thatLocator, "limit", rhsLimit), lhsLimit, rhsLimit)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
            String theAppName;
            theAppName = this.getAppName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appName", theAppName), currentHashCode, theAppName);
        }
        {
            int theCurrent;
            theCurrent = (true?this.getCurrent(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "current", theCurrent), currentHashCode, theCurrent);
        }
        {
            int theLimit;
            theLimit = (true?this.getLimit(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limit", theLimit), currentHashCode, theLimit);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
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
            String theAppName;
            theAppName = this.getAppName();
            strategy.appendField(locator, this, "appName", buffer, theAppName);
        }
        {
            int theCurrent;
            theCurrent = (true?this.getCurrent(): 0);
            strategy.appendField(locator, this, "current", buffer, theCurrent);
        }
        {
            int theLimit;
            theLimit = (true?this.getLimit(): 0);
            strategy.appendField(locator, this, "limit", buffer, theLimit);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        return buffer;
    }

}
