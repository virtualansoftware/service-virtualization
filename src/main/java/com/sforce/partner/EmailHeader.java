
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
 *         &lt;element name="triggerAutoResponseEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="triggerOtherEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="triggerUserEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "triggerAutoResponseEmail",
    "triggerOtherEmail",
    "triggerUserEmail"
})
@XmlRootElement(name = "EmailHeader")
public class EmailHeader
    implements Equals, HashCode, ToString
{

    protected boolean triggerAutoResponseEmail;
    protected boolean triggerOtherEmail;
    protected boolean triggerUserEmail;

    /**
     * Gets the value of the triggerAutoResponseEmail property.
     * 
     */
    public boolean isTriggerAutoResponseEmail() {
        return triggerAutoResponseEmail;
    }

    /**
     * Sets the value of the triggerAutoResponseEmail property.
     * 
     */
    public void setTriggerAutoResponseEmail(boolean value) {
        this.triggerAutoResponseEmail = value;
    }

    /**
     * Gets the value of the triggerOtherEmail property.
     * 
     */
    public boolean isTriggerOtherEmail() {
        return triggerOtherEmail;
    }

    /**
     * Sets the value of the triggerOtherEmail property.
     * 
     */
    public void setTriggerOtherEmail(boolean value) {
        this.triggerOtherEmail = value;
    }

    /**
     * Gets the value of the triggerUserEmail property.
     * 
     */
    public boolean isTriggerUserEmail() {
        return triggerUserEmail;
    }

    /**
     * Sets the value of the triggerUserEmail property.
     * 
     */
    public void setTriggerUserEmail(boolean value) {
        this.triggerUserEmail = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EmailHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EmailHeader that = ((EmailHeader) object);
        {
            boolean lhsTriggerAutoResponseEmail;
            lhsTriggerAutoResponseEmail = (true?this.isTriggerAutoResponseEmail():false);
            boolean rhsTriggerAutoResponseEmail;
            rhsTriggerAutoResponseEmail = (true?that.isTriggerAutoResponseEmail():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "triggerAutoResponseEmail", lhsTriggerAutoResponseEmail), LocatorUtils.property(thatLocator, "triggerAutoResponseEmail", rhsTriggerAutoResponseEmail), lhsTriggerAutoResponseEmail, rhsTriggerAutoResponseEmail)) {
                return false;
            }
        }
        {
            boolean lhsTriggerOtherEmail;
            lhsTriggerOtherEmail = (true?this.isTriggerOtherEmail():false);
            boolean rhsTriggerOtherEmail;
            rhsTriggerOtherEmail = (true?that.isTriggerOtherEmail():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "triggerOtherEmail", lhsTriggerOtherEmail), LocatorUtils.property(thatLocator, "triggerOtherEmail", rhsTriggerOtherEmail), lhsTriggerOtherEmail, rhsTriggerOtherEmail)) {
                return false;
            }
        }
        {
            boolean lhsTriggerUserEmail;
            lhsTriggerUserEmail = (true?this.isTriggerUserEmail():false);
            boolean rhsTriggerUserEmail;
            rhsTriggerUserEmail = (true?that.isTriggerUserEmail():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "triggerUserEmail", lhsTriggerUserEmail), LocatorUtils.property(thatLocator, "triggerUserEmail", rhsTriggerUserEmail), lhsTriggerUserEmail, rhsTriggerUserEmail)) {
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
            boolean theTriggerAutoResponseEmail;
            theTriggerAutoResponseEmail = (true?this.isTriggerAutoResponseEmail():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "triggerAutoResponseEmail", theTriggerAutoResponseEmail), currentHashCode, theTriggerAutoResponseEmail);
        }
        {
            boolean theTriggerOtherEmail;
            theTriggerOtherEmail = (true?this.isTriggerOtherEmail():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "triggerOtherEmail", theTriggerOtherEmail), currentHashCode, theTriggerOtherEmail);
        }
        {
            boolean theTriggerUserEmail;
            theTriggerUserEmail = (true?this.isTriggerUserEmail():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "triggerUserEmail", theTriggerUserEmail), currentHashCode, theTriggerUserEmail);
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
            boolean theTriggerAutoResponseEmail;
            theTriggerAutoResponseEmail = (true?this.isTriggerAutoResponseEmail():false);
            strategy.appendField(locator, this, "triggerAutoResponseEmail", buffer, theTriggerAutoResponseEmail);
        }
        {
            boolean theTriggerOtherEmail;
            theTriggerOtherEmail = (true?this.isTriggerOtherEmail():false);
            strategy.appendField(locator, this, "triggerOtherEmail", buffer, theTriggerOtherEmail);
        }
        {
            boolean theTriggerUserEmail;
            theTriggerUserEmail = (true?this.isTriggerUserEmail():false);
            strategy.appendField(locator, this, "triggerUserEmail", buffer, theTriggerUserEmail);
        }
        return buffer;
    }

}
