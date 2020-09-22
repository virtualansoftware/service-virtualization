
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
 * <p>Java class for RecordTypeCompactLayoutMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordTypeCompactLayoutMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="compactLayoutId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="compactLayoutName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordTypeId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="recordTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTypeCompactLayoutMapping", propOrder = {
    "available",
    "compactLayoutId",
    "compactLayoutName",
    "recordTypeId",
    "recordTypeName"
})
public class RecordTypeCompactLayoutMapping
    implements Equals, HashCode, ToString
{

    protected boolean available;
    @XmlElement(required = true, nillable = true)
    protected String compactLayoutId;
    @XmlElement(required = true)
    protected String compactLayoutName;
    @XmlElement(required = true)
    protected String recordTypeId;
    @XmlElement(required = true)
    protected String recordTypeName;

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the compactLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompactLayoutId() {
        return compactLayoutId;
    }

    /**
     * Sets the value of the compactLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompactLayoutId(String value) {
        this.compactLayoutId = value;
    }

    /**
     * Gets the value of the compactLayoutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompactLayoutName() {
        return compactLayoutName;
    }

    /**
     * Sets the value of the compactLayoutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompactLayoutName(String value) {
        this.compactLayoutName = value;
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
     * Gets the value of the recordTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeName() {
        return recordTypeName;
    }

    /**
     * Sets the value of the recordTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeName(String value) {
        this.recordTypeName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RecordTypeCompactLayoutMapping)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecordTypeCompactLayoutMapping that = ((RecordTypeCompactLayoutMapping) object);
        {
            boolean lhsAvailable;
            lhsAvailable = (true?this.isAvailable():false);
            boolean rhsAvailable;
            rhsAvailable = (true?that.isAvailable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "available", lhsAvailable), LocatorUtils.property(thatLocator, "available", rhsAvailable), lhsAvailable, rhsAvailable)) {
                return false;
            }
        }
        {
            String lhsCompactLayoutId;
            lhsCompactLayoutId = this.getCompactLayoutId();
            String rhsCompactLayoutId;
            rhsCompactLayoutId = that.getCompactLayoutId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compactLayoutId", lhsCompactLayoutId), LocatorUtils.property(thatLocator, "compactLayoutId", rhsCompactLayoutId), lhsCompactLayoutId, rhsCompactLayoutId)) {
                return false;
            }
        }
        {
            String lhsCompactLayoutName;
            lhsCompactLayoutName = this.getCompactLayoutName();
            String rhsCompactLayoutName;
            rhsCompactLayoutName = that.getCompactLayoutName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compactLayoutName", lhsCompactLayoutName), LocatorUtils.property(thatLocator, "compactLayoutName", rhsCompactLayoutName), lhsCompactLayoutName, rhsCompactLayoutName)) {
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
            String lhsRecordTypeName;
            lhsRecordTypeName = this.getRecordTypeName();
            String rhsRecordTypeName;
            rhsRecordTypeName = that.getRecordTypeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeName", lhsRecordTypeName), LocatorUtils.property(thatLocator, "recordTypeName", rhsRecordTypeName), lhsRecordTypeName, rhsRecordTypeName)) {
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
            boolean theAvailable;
            theAvailable = (true?this.isAvailable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "available", theAvailable), currentHashCode, theAvailable);
        }
        {
            String theCompactLayoutId;
            theCompactLayoutId = this.getCompactLayoutId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compactLayoutId", theCompactLayoutId), currentHashCode, theCompactLayoutId);
        }
        {
            String theCompactLayoutName;
            theCompactLayoutName = this.getCompactLayoutName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compactLayoutName", theCompactLayoutName), currentHashCode, theCompactLayoutName);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeId", theRecordTypeId), currentHashCode, theRecordTypeId);
        }
        {
            String theRecordTypeName;
            theRecordTypeName = this.getRecordTypeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeName", theRecordTypeName), currentHashCode, theRecordTypeName);
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
            boolean theAvailable;
            theAvailable = (true?this.isAvailable():false);
            strategy.appendField(locator, this, "available", buffer, theAvailable);
        }
        {
            String theCompactLayoutId;
            theCompactLayoutId = this.getCompactLayoutId();
            strategy.appendField(locator, this, "compactLayoutId", buffer, theCompactLayoutId);
        }
        {
            String theCompactLayoutName;
            theCompactLayoutName = this.getCompactLayoutName();
            strategy.appendField(locator, this, "compactLayoutName", buffer, theCompactLayoutName);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            strategy.appendField(locator, this, "recordTypeId", buffer, theRecordTypeId);
        }
        {
            String theRecordTypeName;
            theRecordTypeName = this.getRecordTypeName();
            strategy.appendField(locator, this, "recordTypeName", buffer, theRecordTypeName);
        }
        return buffer;
    }

}
