
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for FlowInterviewDebugInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowInterviewDebugInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectApexLimitUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableRollbackMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableTrace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useLatestSubflow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowInterviewDebugInput", propOrder = {
    "collectApexLimitUsage",
    "enableRollbackMode",
    "enableTrace",
    "useLatestSubflow"
})
public class FlowInterviewDebugInput
    implements Equals, HashCode, ToString
{

    protected Boolean collectApexLimitUsage;
    protected Boolean enableRollbackMode;
    protected Boolean enableTrace;
    protected Boolean useLatestSubflow;

    /**
     * Gets the value of the collectApexLimitUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectApexLimitUsage() {
        return collectApexLimitUsage;
    }

    /**
     * Sets the value of the collectApexLimitUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectApexLimitUsage(Boolean value) {
        this.collectApexLimitUsage = value;
    }

    /**
     * Gets the value of the enableRollbackMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRollbackMode() {
        return enableRollbackMode;
    }

    /**
     * Sets the value of the enableRollbackMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRollbackMode(Boolean value) {
        this.enableRollbackMode = value;
    }

    /**
     * Gets the value of the enableTrace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTrace() {
        return enableTrace;
    }

    /**
     * Sets the value of the enableTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTrace(Boolean value) {
        this.enableTrace = value;
    }

    /**
     * Gets the value of the useLatestSubflow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLatestSubflow() {
        return useLatestSubflow;
    }

    /**
     * Sets the value of the useLatestSubflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLatestSubflow(Boolean value) {
        this.useLatestSubflow = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlowInterviewDebugInput)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FlowInterviewDebugInput that = ((FlowInterviewDebugInput) object);
        {
            Boolean lhsCollectApexLimitUsage;
            lhsCollectApexLimitUsage = this.isCollectApexLimitUsage();
            Boolean rhsCollectApexLimitUsage;
            rhsCollectApexLimitUsage = that.isCollectApexLimitUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collectApexLimitUsage", lhsCollectApexLimitUsage), LocatorUtils.property(thatLocator, "collectApexLimitUsage", rhsCollectApexLimitUsage), lhsCollectApexLimitUsage, rhsCollectApexLimitUsage)) {
                return false;
            }
        }
        {
            Boolean lhsEnableRollbackMode;
            lhsEnableRollbackMode = this.isEnableRollbackMode();
            Boolean rhsEnableRollbackMode;
            rhsEnableRollbackMode = that.isEnableRollbackMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableRollbackMode", lhsEnableRollbackMode), LocatorUtils.property(thatLocator, "enableRollbackMode", rhsEnableRollbackMode), lhsEnableRollbackMode, rhsEnableRollbackMode)) {
                return false;
            }
        }
        {
            Boolean lhsEnableTrace;
            lhsEnableTrace = this.isEnableTrace();
            Boolean rhsEnableTrace;
            rhsEnableTrace = that.isEnableTrace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableTrace", lhsEnableTrace), LocatorUtils.property(thatLocator, "enableTrace", rhsEnableTrace), lhsEnableTrace, rhsEnableTrace)) {
                return false;
            }
        }
        {
            Boolean lhsUseLatestSubflow;
            lhsUseLatestSubflow = this.isUseLatestSubflow();
            Boolean rhsUseLatestSubflow;
            rhsUseLatestSubflow = that.isUseLatestSubflow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useLatestSubflow", lhsUseLatestSubflow), LocatorUtils.property(thatLocator, "useLatestSubflow", rhsUseLatestSubflow), lhsUseLatestSubflow, rhsUseLatestSubflow)) {
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
            Boolean theCollectApexLimitUsage;
            theCollectApexLimitUsage = this.isCollectApexLimitUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collectApexLimitUsage", theCollectApexLimitUsage), currentHashCode, theCollectApexLimitUsage);
        }
        {
            Boolean theEnableRollbackMode;
            theEnableRollbackMode = this.isEnableRollbackMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableRollbackMode", theEnableRollbackMode), currentHashCode, theEnableRollbackMode);
        }
        {
            Boolean theEnableTrace;
            theEnableTrace = this.isEnableTrace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableTrace", theEnableTrace), currentHashCode, theEnableTrace);
        }
        {
            Boolean theUseLatestSubflow;
            theUseLatestSubflow = this.isUseLatestSubflow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useLatestSubflow", theUseLatestSubflow), currentHashCode, theUseLatestSubflow);
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
            Boolean theCollectApexLimitUsage;
            theCollectApexLimitUsage = this.isCollectApexLimitUsage();
            strategy.appendField(locator, this, "collectApexLimitUsage", buffer, theCollectApexLimitUsage);
        }
        {
            Boolean theEnableRollbackMode;
            theEnableRollbackMode = this.isEnableRollbackMode();
            strategy.appendField(locator, this, "enableRollbackMode", buffer, theEnableRollbackMode);
        }
        {
            Boolean theEnableTrace;
            theEnableTrace = this.isEnableTrace();
            strategy.appendField(locator, this, "enableTrace", buffer, theEnableTrace);
        }
        {
            Boolean theUseLatestSubflow;
            theUseLatestSubflow = this.isUseLatestSubflow();
            strategy.appendField(locator, this, "useLatestSubflow", buffer, theUseLatestSubflow);
        }
        return buffer;
    }

}
