
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eventValues" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eventName" type="{urn:partner.soap.sforce.com}EventName"/&gt;
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
    "appName",
    "eventValues",
    "eventName"
})
@XmlRootElement(name = "captureCommonEvent")
public class CaptureCommonEvent
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String appName;
    @XmlElement(required = true)
    protected String eventValues;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EventName eventName;

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
     * Gets the value of the eventValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventValues() {
        return eventValues;
    }

    /**
     * Sets the value of the eventValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventValues(String value) {
        this.eventValues = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link EventName }
     *     
     */
    public EventName getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventName }
     *     
     */
    public void setEventName(EventName value) {
        this.eventName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CaptureCommonEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CaptureCommonEvent that = ((CaptureCommonEvent) object);
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
            String lhsEventValues;
            lhsEventValues = this.getEventValues();
            String rhsEventValues;
            rhsEventValues = that.getEventValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventValues", lhsEventValues), LocatorUtils.property(thatLocator, "eventValues", rhsEventValues), lhsEventValues, rhsEventValues)) {
                return false;
            }
        }
        {
            EventName lhsEventName;
            lhsEventName = this.getEventName();
            EventName rhsEventName;
            rhsEventName = that.getEventName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventName", lhsEventName), LocatorUtils.property(thatLocator, "eventName", rhsEventName), lhsEventName, rhsEventName)) {
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
            String theEventValues;
            theEventValues = this.getEventValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventValues", theEventValues), currentHashCode, theEventValues);
        }
        {
            EventName theEventName;
            theEventName = this.getEventName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventName", theEventName), currentHashCode, theEventName);
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
            String theEventValues;
            theEventValues = this.getEventValues();
            strategy.appendField(locator, this, "eventValues", buffer, theEventValues);
        }
        {
            EventName theEventName;
            theEventName = this.getEventName();
            strategy.appendField(locator, this, "eventName", buffer, theEventName);
        }
        return buffer;
    }

}
