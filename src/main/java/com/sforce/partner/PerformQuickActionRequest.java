
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for PerformQuickActionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformQuickActionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contextId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="quickActionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="records" type="{urn:sobject.partner.soap.sforce.com}sObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformQuickActionRequest", propOrder = {
    "contextId",
    "quickActionName",
    "records"
})
public class PerformQuickActionRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String contextId;
    @XmlElement(required = true)
    protected String quickActionName;
    @XmlElement(nillable = true)
    protected List<SObject> records;

    /**
     * Gets the value of the contextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextId() {
        return contextId;
    }

    /**
     * Sets the value of the contextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextId(String value) {
        this.contextId = value;
    }

    /**
     * Gets the value of the quickActionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickActionName() {
        return quickActionName;
    }

    /**
     * Sets the value of the quickActionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickActionName(String value) {
        this.quickActionName = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the records property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SObject }
     * 
     * 
     */
    public List<SObject> getRecords() {
        if (records == null) {
            records = new ArrayList<SObject>();
        }
        return this.records;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PerformQuickActionRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PerformQuickActionRequest that = ((PerformQuickActionRequest) object);
        {
            String lhsContextId;
            lhsContextId = this.getContextId();
            String rhsContextId;
            rhsContextId = that.getContextId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextId", lhsContextId), LocatorUtils.property(thatLocator, "contextId", rhsContextId), lhsContextId, rhsContextId)) {
                return false;
            }
        }
        {
            String lhsQuickActionName;
            lhsQuickActionName = this.getQuickActionName();
            String rhsQuickActionName;
            rhsQuickActionName = that.getQuickActionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quickActionName", lhsQuickActionName), LocatorUtils.property(thatLocator, "quickActionName", rhsQuickActionName), lhsQuickActionName, rhsQuickActionName)) {
                return false;
            }
        }
        {
            List<SObject> lhsRecords;
            lhsRecords = (((this.records!= null)&&(!this.records.isEmpty()))?this.getRecords():null);
            List<SObject> rhsRecords;
            rhsRecords = (((that.records!= null)&&(!that.records.isEmpty()))?that.getRecords():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "records", lhsRecords), LocatorUtils.property(thatLocator, "records", rhsRecords), lhsRecords, rhsRecords)) {
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
            String theContextId;
            theContextId = this.getContextId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextId", theContextId), currentHashCode, theContextId);
        }
        {
            String theQuickActionName;
            theQuickActionName = this.getQuickActionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quickActionName", theQuickActionName), currentHashCode, theQuickActionName);
        }
        {
            List<SObject> theRecords;
            theRecords = (((this.records!= null)&&(!this.records.isEmpty()))?this.getRecords():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "records", theRecords), currentHashCode, theRecords);
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
            String theContextId;
            theContextId = this.getContextId();
            strategy.appendField(locator, this, "contextId", buffer, theContextId);
        }
        {
            String theQuickActionName;
            theQuickActionName = this.getQuickActionName();
            strategy.appendField(locator, this, "quickActionName", buffer, theQuickActionName);
        }
        {
            List<SObject> theRecords;
            theRecords = (((this.records!= null)&&(!this.records.isEmpty()))?this.getRecords():null);
            strategy.appendField(locator, this, "records", buffer, theRecords);
        }
        return buffer;
    }

}
