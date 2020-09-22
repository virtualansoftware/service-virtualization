
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
 * <p>Java class for OutlookDescribeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutlookDescribeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inboundEmailType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outboundEmailType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordTypeId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutlookDescribeResult", propOrder = {
    "inboundEmailType",
    "outboundEmailType",
    "priority",
    "recordTypeId",
    "status"
})
public class OutlookDescribeResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String inboundEmailType;
    @XmlElement(required = true, nillable = true)
    protected String outboundEmailType;
    @XmlElement(required = true, nillable = true)
    protected String priority;
    @XmlElement(required = true, nillable = true)
    protected String recordTypeId;
    @XmlElement(required = true, nillable = true)
    protected String status;

    /**
     * Gets the value of the inboundEmailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundEmailType() {
        return inboundEmailType;
    }

    /**
     * Sets the value of the inboundEmailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundEmailType(String value) {
        this.inboundEmailType = value;
    }

    /**
     * Gets the value of the outboundEmailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundEmailType() {
        return outboundEmailType;
    }

    /**
     * Sets the value of the outboundEmailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundEmailType(String value) {
        this.outboundEmailType = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the recordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * Sets the value of the recordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeId(String value) {
        this.recordTypeId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OutlookDescribeResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OutlookDescribeResult that = ((OutlookDescribeResult) object);
        {
            String lhsInboundEmailType;
            lhsInboundEmailType = this.getInboundEmailType();
            String rhsInboundEmailType;
            rhsInboundEmailType = that.getInboundEmailType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inboundEmailType", lhsInboundEmailType), LocatorUtils.property(thatLocator, "inboundEmailType", rhsInboundEmailType), lhsInboundEmailType, rhsInboundEmailType)) {
                return false;
            }
        }
        {
            String lhsOutboundEmailType;
            lhsOutboundEmailType = this.getOutboundEmailType();
            String rhsOutboundEmailType;
            rhsOutboundEmailType = that.getOutboundEmailType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundEmailType", lhsOutboundEmailType), LocatorUtils.property(thatLocator, "outboundEmailType", rhsOutboundEmailType), lhsOutboundEmailType, rhsOutboundEmailType)) {
                return false;
            }
        }
        {
            String lhsPriority;
            lhsPriority = this.getPriority();
            String rhsPriority;
            rhsPriority = that.getPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priority", lhsPriority), LocatorUtils.property(thatLocator, "priority", rhsPriority), lhsPriority, rhsPriority)) {
                return false;
            }
        }
        {
            String lhsRecordTypeId;
            lhsRecordTypeId = this.getRecordTypeId();
            String rhsRecordTypeId;
            rhsRecordTypeId = that.getRecordTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeId", lhsRecordTypeId), LocatorUtils.property(thatLocator, "recordTypeId", rhsRecordTypeId), lhsRecordTypeId, rhsRecordTypeId)) {
                return false;
            }
        }
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
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
            String theInboundEmailType;
            theInboundEmailType = this.getInboundEmailType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inboundEmailType", theInboundEmailType), currentHashCode, theInboundEmailType);
        }
        {
            String theOutboundEmailType;
            theOutboundEmailType = this.getOutboundEmailType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundEmailType", theOutboundEmailType), currentHashCode, theOutboundEmailType);
        }
        {
            String thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeId", theRecordTypeId), currentHashCode, theRecordTypeId);
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
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
            String theInboundEmailType;
            theInboundEmailType = this.getInboundEmailType();
            strategy.appendField(locator, this, "inboundEmailType", buffer, theInboundEmailType);
        }
        {
            String theOutboundEmailType;
            theOutboundEmailType = this.getOutboundEmailType();
            strategy.appendField(locator, this, "outboundEmailType", buffer, theOutboundEmailType);
        }
        {
            String thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            strategy.appendField(locator, this, "recordTypeId", buffer, theRecordTypeId);
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        return buffer;
    }

}
