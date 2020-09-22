
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
 * <p>Java class for RecordTypeMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordTypeMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="defaultRecordTypeMapping" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="layoutId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="picklistsForRecordType" type="{urn:partner.soap.sforce.com}PicklistForRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RecordTypeMapping", propOrder = {
    "active",
    "available",
    "defaultRecordTypeMapping",
    "developerName",
    "layoutId",
    "master",
    "name",
    "picklistsForRecordTypes",
    "recordTypeId"
})
public class RecordTypeMapping
    implements Equals, HashCode, ToString
{

    protected boolean active;
    protected boolean available;
    protected boolean defaultRecordTypeMapping;
    @XmlElement(required = true)
    protected String developerName;
    @XmlElement(required = true)
    protected String layoutId;
    protected boolean master;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "picklistsForRecordType", nillable = true)
    protected List<PicklistForRecordType> picklistsForRecordTypes;
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
     * Gets the value of the layoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutId() {
        return layoutId;
    }

    /**
     * Sets the value of the layoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutId(String value) {
        this.layoutId = value;
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
     * Gets the value of the picklistsForRecordTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picklistsForRecordTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicklistsForRecordTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistForRecordType }
     * 
     * 
     */
    public List<PicklistForRecordType> getPicklistsForRecordTypes() {
        if (picklistsForRecordTypes == null) {
            picklistsForRecordTypes = new ArrayList<PicklistForRecordType>();
        }
        return this.picklistsForRecordTypes;
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
        if (!(object instanceof RecordTypeMapping)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecordTypeMapping that = ((RecordTypeMapping) object);
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
            String lhsLayoutId;
            lhsLayoutId = this.getLayoutId();
            String rhsLayoutId;
            rhsLayoutId = that.getLayoutId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutId", lhsLayoutId), LocatorUtils.property(thatLocator, "layoutId", rhsLayoutId), lhsLayoutId, rhsLayoutId)) {
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
            List<PicklistForRecordType> lhsPicklistsForRecordTypes;
            lhsPicklistsForRecordTypes = (((this.picklistsForRecordTypes!= null)&&(!this.picklistsForRecordTypes.isEmpty()))?this.getPicklistsForRecordTypes():null);
            List<PicklistForRecordType> rhsPicklistsForRecordTypes;
            rhsPicklistsForRecordTypes = (((that.picklistsForRecordTypes!= null)&&(!that.picklistsForRecordTypes.isEmpty()))?that.getPicklistsForRecordTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picklistsForRecordTypes", lhsPicklistsForRecordTypes), LocatorUtils.property(thatLocator, "picklistsForRecordTypes", rhsPicklistsForRecordTypes), lhsPicklistsForRecordTypes, rhsPicklistsForRecordTypes)) {
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
            String theLayoutId;
            theLayoutId = this.getLayoutId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layoutId", theLayoutId), currentHashCode, theLayoutId);
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
            List<PicklistForRecordType> thePicklistsForRecordTypes;
            thePicklistsForRecordTypes = (((this.picklistsForRecordTypes!= null)&&(!this.picklistsForRecordTypes.isEmpty()))?this.getPicklistsForRecordTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistsForRecordTypes", thePicklistsForRecordTypes), currentHashCode, thePicklistsForRecordTypes);
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
            String theLayoutId;
            theLayoutId = this.getLayoutId();
            strategy.appendField(locator, this, "layoutId", buffer, theLayoutId);
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
            List<PicklistForRecordType> thePicklistsForRecordTypes;
            thePicklistsForRecordTypes = (((this.picklistsForRecordTypes!= null)&&(!this.picklistsForRecordTypes.isEmpty()))?this.getPicklistsForRecordTypes():null);
            strategy.appendField(locator, this, "picklistsForRecordTypes", buffer, thePicklistsForRecordTypes);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            strategy.appendField(locator, this, "recordTypeId", buffer, theRecordTypeId);
        }
        return buffer;
    }

}
