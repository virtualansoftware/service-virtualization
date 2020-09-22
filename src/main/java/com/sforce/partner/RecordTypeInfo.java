
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
 * <p>Java class for RecordTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordTypeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="defaultRecordTypeMapping" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordTypeId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTypeInfo", propOrder = {
    "active",
    "available",
    "defaultRecordTypeMapping",
    "developerName",
    "master",
    "name",
    "recordTypeId"
})
public class RecordTypeInfo
    implements Equals, HashCode, ToString
{

    protected boolean active;
    protected boolean available;
    protected boolean defaultRecordTypeMapping;
    @XmlElement(required = true)
    protected String developerName;
    protected boolean master;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String recordTypeId;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

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
     * Gets the value of the defaultRecordTypeMapping property.
     * 
     */
    public boolean isDefaultRecordTypeMapping() {
        return defaultRecordTypeMapping;
    }

    /**
     * Sets the value of the defaultRecordTypeMapping property.
     * 
     */
    public void setDefaultRecordTypeMapping(boolean value) {
        this.defaultRecordTypeMapping = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the master property.
     * 
     */
    public boolean isMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     */
    public void setMaster(boolean value) {
        this.master = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RecordTypeInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecordTypeInfo that = ((RecordTypeInfo) object);
        {
            boolean lhsActive;
            lhsActive = (true?this.isActive():false);
            boolean rhsActive;
            rhsActive = (true?that.isActive():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
                return false;
            }
        }
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
            boolean lhsDefaultRecordTypeMapping;
            lhsDefaultRecordTypeMapping = (true?this.isDefaultRecordTypeMapping():false);
            boolean rhsDefaultRecordTypeMapping;
            rhsDefaultRecordTypeMapping = (true?that.isDefaultRecordTypeMapping():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultRecordTypeMapping", lhsDefaultRecordTypeMapping), LocatorUtils.property(thatLocator, "defaultRecordTypeMapping", rhsDefaultRecordTypeMapping), lhsDefaultRecordTypeMapping, rhsDefaultRecordTypeMapping)) {
                return false;
            }
        }
        {
            String lhsDeveloperName;
            lhsDeveloperName = this.getDeveloperName();
            String rhsDeveloperName;
            rhsDeveloperName = that.getDeveloperName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "developerName", lhsDeveloperName), LocatorUtils.property(thatLocator, "developerName", rhsDeveloperName), lhsDeveloperName, rhsDeveloperName)) {
                return false;
            }
        }
        {
            boolean lhsMaster;
            lhsMaster = (true?this.isMaster():false);
            boolean rhsMaster;
            rhsMaster = (true?that.isMaster():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "master", lhsMaster), LocatorUtils.property(thatLocator, "master", rhsMaster), lhsMaster, rhsMaster)) {
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
            String lhsRecordTypeId;
            lhsRecordTypeId = this.getRecordTypeId();
            String rhsRecordTypeId;
            rhsRecordTypeId = that.getRecordTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeId", lhsRecordTypeId), LocatorUtils.property(thatLocator, "recordTypeId", rhsRecordTypeId), lhsRecordTypeId, rhsRecordTypeId)) {
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
            boolean theActive;
            theActive = (true?this.isActive():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        {
            boolean theAvailable;
            theAvailable = (true?this.isAvailable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "available", theAvailable), currentHashCode, theAvailable);
        }
        {
            boolean theDefaultRecordTypeMapping;
            theDefaultRecordTypeMapping = (true?this.isDefaultRecordTypeMapping():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultRecordTypeMapping", theDefaultRecordTypeMapping), currentHashCode, theDefaultRecordTypeMapping);
        }
        {
            String theDeveloperName;
            theDeveloperName = this.getDeveloperName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "developerName", theDeveloperName), currentHashCode, theDeveloperName);
        }
        {
            boolean theMaster;
            theMaster = (true?this.isMaster():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "master", theMaster), currentHashCode, theMaster);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeId", theRecordTypeId), currentHashCode, theRecordTypeId);
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
            boolean theActive;
            theActive = (true?this.isActive():false);
            strategy.appendField(locator, this, "active", buffer, theActive);
        }
        {
            boolean theAvailable;
            theAvailable = (true?this.isAvailable():false);
            strategy.appendField(locator, this, "available", buffer, theAvailable);
        }
        {
            boolean theDefaultRecordTypeMapping;
            theDefaultRecordTypeMapping = (true?this.isDefaultRecordTypeMapping():false);
            strategy.appendField(locator, this, "defaultRecordTypeMapping", buffer, theDefaultRecordTypeMapping);
        }
        {
            String theDeveloperName;
            theDeveloperName = this.getDeveloperName();
            strategy.appendField(locator, this, "developerName", buffer, theDeveloperName);
        }
        {
            boolean theMaster;
            theMaster = (true?this.isMaster():false);
            strategy.appendField(locator, this, "master", buffer, theMaster);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            strategy.appendField(locator, this, "recordTypeId", buffer, theRecordTypeId);
        }
        return buffer;
    }

}
