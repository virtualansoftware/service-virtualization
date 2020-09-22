
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="debugLog" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "debugLog"
})
@XmlRootElement(name = "DebuggingInfo")
public class DebuggingInfo
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String debugLog;

    /**
     * Gets the value of the debugLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebugLog() {
        return debugLog;
    }

    /**
     * Sets the value of the debugLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebugLog(String value) {
        this.debugLog = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DebuggingInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DebuggingInfo that = ((DebuggingInfo) object);
        {
            String lhsDebugLog;
            lhsDebugLog = this.getDebugLog();
            String rhsDebugLog;
            rhsDebugLog = that.getDebugLog();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debugLog", lhsDebugLog), LocatorUtils.property(thatLocator, "debugLog", rhsDebugLog), lhsDebugLog, rhsDebugLog)) {
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
            String theDebugLog;
            theDebugLog = this.getDebugLog();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debugLog", theDebugLog), currentHashCode, theDebugLog);
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
            String theDebugLog;
            theDebugLog = this.getDebugLog();
            strategy.appendField(locator, this, "debugLog", buffer, theDebugLog);
        }
        return buffer;
    }

}
