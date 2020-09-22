
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowSave" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeRecordDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="runAsCurrentUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allowSave",
    "includeRecordDetails",
    "runAsCurrentUser"
})
@XmlRootElement(name = "DuplicateRuleHeader")
public class DuplicateRuleHeader
    implements Equals, HashCode, ToString
{

    protected boolean allowSave;
    protected boolean includeRecordDetails;
    protected boolean runAsCurrentUser;

    /**
     * Gets the value of the allowSave property.
     * 
     */
    public boolean isAllowSave() {
        return allowSave;
    }

    /**
     * Sets the value of the allowSave property.
     * 
     */
    public void setAllowSave(boolean value) {
        this.allowSave = value;
    }

    /**
     * Gets the value of the includeRecordDetails property.
     * 
     */
    public boolean isIncludeRecordDetails() {
        return includeRecordDetails;
    }

    /**
     * Sets the value of the includeRecordDetails property.
     * 
     */
    public void setIncludeRecordDetails(boolean value) {
        this.includeRecordDetails = value;
    }

    /**
     * Gets the value of the runAsCurrentUser property.
     * 
     */
    public boolean isRunAsCurrentUser() {
        return runAsCurrentUser;
    }

    /**
     * Sets the value of the runAsCurrentUser property.
     * 
     */
    public void setRunAsCurrentUser(boolean value) {
        this.runAsCurrentUser = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DuplicateRuleHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DuplicateRuleHeader that = ((DuplicateRuleHeader) object);
        {
            boolean lhsAllowSave;
            lhsAllowSave = (true?this.isAllowSave():false);
            boolean rhsAllowSave;
            rhsAllowSave = (true?that.isAllowSave():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowSave", lhsAllowSave), LocatorUtils.property(thatLocator, "allowSave", rhsAllowSave), lhsAllowSave, rhsAllowSave)) {
                return false;
            }
        }
        {
            boolean lhsIncludeRecordDetails;
            lhsIncludeRecordDetails = (true?this.isIncludeRecordDetails():false);
            boolean rhsIncludeRecordDetails;
            rhsIncludeRecordDetails = (true?that.isIncludeRecordDetails():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeRecordDetails", lhsIncludeRecordDetails), LocatorUtils.property(thatLocator, "includeRecordDetails", rhsIncludeRecordDetails), lhsIncludeRecordDetails, rhsIncludeRecordDetails)) {
                return false;
            }
        }
        {
            boolean lhsRunAsCurrentUser;
            lhsRunAsCurrentUser = (true?this.isRunAsCurrentUser():false);
            boolean rhsRunAsCurrentUser;
            rhsRunAsCurrentUser = (true?that.isRunAsCurrentUser():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runAsCurrentUser", lhsRunAsCurrentUser), LocatorUtils.property(thatLocator, "runAsCurrentUser", rhsRunAsCurrentUser), lhsRunAsCurrentUser, rhsRunAsCurrentUser)) {
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
            boolean theAllowSave;
            theAllowSave = (true?this.isAllowSave():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowSave", theAllowSave), currentHashCode, theAllowSave);
        }
        {
            boolean theIncludeRecordDetails;
            theIncludeRecordDetails = (true?this.isIncludeRecordDetails():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeRecordDetails", theIncludeRecordDetails), currentHashCode, theIncludeRecordDetails);
        }
        {
            boolean theRunAsCurrentUser;
            theRunAsCurrentUser = (true?this.isRunAsCurrentUser():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runAsCurrentUser", theRunAsCurrentUser), currentHashCode, theRunAsCurrentUser);
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
            boolean theAllowSave;
            theAllowSave = (true?this.isAllowSave():false);
            strategy.appendField(locator, this, "allowSave", buffer, theAllowSave);
        }
        {
            boolean theIncludeRecordDetails;
            theIncludeRecordDetails = (true?this.isIncludeRecordDetails():false);
            strategy.appendField(locator, this, "includeRecordDetails", buffer, theIncludeRecordDetails);
        }
        {
            boolean theRunAsCurrentUser;
            theRunAsCurrentUser = (true?this.isRunAsCurrentUser():false);
            strategy.appendField(locator, this, "runAsCurrentUser", buffer, theRunAsCurrentUser);
        }
        return buffer;
    }

}
