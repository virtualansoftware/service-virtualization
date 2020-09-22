
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
 * <p>Java class for DescribeMobileView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeMobileView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="matchAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="viewId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeMobileView", propOrder = {
    "sObject",
    "matchAll",
    "name",
    "viewId"
})
public class DescribeMobileView
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "SObject", required = true)
    protected String sObject;
    protected boolean matchAll;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String viewId;

    /**
     * Gets the value of the sObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObject() {
        return sObject;
    }

    /**
     * Sets the value of the sObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObject(String value) {
        this.sObject = value;
    }

    /**
     * Gets the value of the matchAll property.
     * 
     */
    public boolean isMatchAll() {
        return matchAll;
    }

    /**
     * Sets the value of the matchAll property.
     * 
     */
    public void setMatchAll(boolean value) {
        this.matchAll = value;
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
     * Gets the value of the viewId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * Sets the value of the viewId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewId(String value) {
        this.viewId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeMobileView)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeMobileView that = ((DescribeMobileView) object);
        {
            String lhsSObject;
            lhsSObject = this.getSObject();
            String rhsSObject;
            rhsSObject = that.getSObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sObject", lhsSObject), LocatorUtils.property(thatLocator, "sObject", rhsSObject), lhsSObject, rhsSObject)) {
                return false;
            }
        }
        {
            boolean lhsMatchAll;
            lhsMatchAll = (true?this.isMatchAll():false);
            boolean rhsMatchAll;
            rhsMatchAll = (true?that.isMatchAll():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchAll", lhsMatchAll), LocatorUtils.property(thatLocator, "matchAll", rhsMatchAll), lhsMatchAll, rhsMatchAll)) {
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
            String lhsViewId;
            lhsViewId = this.getViewId();
            String rhsViewId;
            rhsViewId = that.getViewId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "viewId", lhsViewId), LocatorUtils.property(thatLocator, "viewId", rhsViewId), lhsViewId, rhsViewId)) {
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
            String theSObject;
            theSObject = this.getSObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObject", theSObject), currentHashCode, theSObject);
        }
        {
            boolean theMatchAll;
            theMatchAll = (true?this.isMatchAll():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchAll", theMatchAll), currentHashCode, theMatchAll);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theViewId;
            theViewId = this.getViewId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "viewId", theViewId), currentHashCode, theViewId);
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
            String theSObject;
            theSObject = this.getSObject();
            strategy.appendField(locator, this, "sObject", buffer, theSObject);
        }
        {
            boolean theMatchAll;
            theMatchAll = (true?this.isMatchAll():false);
            strategy.appendField(locator, this, "matchAll", buffer, theMatchAll);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theViewId;
            theViewId = this.getViewId();
            strategy.appendField(locator, this, "viewId", buffer, theViewId);
        }
        return buffer;
    }

}
