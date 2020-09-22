
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for EmailSyncEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailSyncEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientFolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conflictResolution" type="{urn:partner.soap.sforce.com}EmailSyncConflictResolution"/&gt;
 *         &lt;element name="dataSetFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldMapping" type="{urn:partner.soap.sforce.com}EmailSyncFieldMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchPreference" type="{urn:partner.soap.sforce.com}EmailSyncMatchPreference"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordTypeId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="syncDirection" type="{urn:partner.soap.sforce.com}EmailSyncDirection"/&gt;
 *         &lt;element name="syncFollowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailSyncEntity", propOrder = {
    "clientFolderName",
    "conflictResolution",
    "dataSetFilter",
    "fieldMappings",
    "matchPreference",
    "name",
    "recordTypeId",
    "syncDirection",
    "syncFollowed"
})
public class EmailSyncEntity
    implements Equals, HashCode, ToString
{

    protected String clientFolderName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EmailSyncConflictResolution conflictResolution;
    protected String dataSetFilter;
    @XmlElement(name = "fieldMapping")
    protected List<EmailSyncFieldMapping> fieldMappings;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EmailSyncMatchPreference matchPreference;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String recordTypeId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EmailSyncDirection syncDirection;
    protected boolean syncFollowed;

    /**
     * Gets the value of the clientFolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFolderName() {
        return clientFolderName;
    }

    /**
     * Sets the value of the clientFolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFolderName(String value) {
        this.clientFolderName = value;
    }

    /**
     * Gets the value of the conflictResolution property.
     * 
     * @return
     *     possible object is
     *     {@link EmailSyncConflictResolution }
     *     
     */
    public EmailSyncConflictResolution getConflictResolution() {
        return conflictResolution;
    }

    /**
     * Sets the value of the conflictResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailSyncConflictResolution }
     *     
     */
    public void setConflictResolution(EmailSyncConflictResolution value) {
        this.conflictResolution = value;
    }

    /**
     * Gets the value of the dataSetFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetFilter() {
        return dataSetFilter;
    }

    /**
     * Sets the value of the dataSetFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetFilter(String value) {
        this.dataSetFilter = value;
    }

    /**
     * Gets the value of the fieldMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailSyncFieldMapping }
     * 
     * 
     */
    public List<EmailSyncFieldMapping> getFieldMappings() {
        if (fieldMappings == null) {
            fieldMappings = new ArrayList<EmailSyncFieldMapping>();
        }
        return this.fieldMappings;
    }

    /**
     * Gets the value of the matchPreference property.
     * 
     * @return
     *     possible object is
     *     {@link EmailSyncMatchPreference }
     *     
     */
    public EmailSyncMatchPreference getMatchPreference() {
        return matchPreference;
    }

    /**
     * Sets the value of the matchPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailSyncMatchPreference }
     *     
     */
    public void setMatchPreference(EmailSyncMatchPreference value) {
        this.matchPreference = value;
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

    /**
     * Gets the value of the syncDirection property.
     * 
     * @return
     *     possible object is
     *     {@link EmailSyncDirection }
     *     
     */
    public EmailSyncDirection getSyncDirection() {
        return syncDirection;
    }

    /**
     * Sets the value of the syncDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailSyncDirection }
     *     
     */
    public void setSyncDirection(EmailSyncDirection value) {
        this.syncDirection = value;
    }

    /**
     * Gets the value of the syncFollowed property.
     * 
     */
    public boolean isSyncFollowed() {
        return syncFollowed;
    }

    /**
     * Sets the value of the syncFollowed property.
     * 
     */
    public void setSyncFollowed(boolean value) {
        this.syncFollowed = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EmailSyncEntity)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EmailSyncEntity that = ((EmailSyncEntity) object);
        {
            String lhsClientFolderName;
            lhsClientFolderName = this.getClientFolderName();
            String rhsClientFolderName;
            rhsClientFolderName = that.getClientFolderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientFolderName", lhsClientFolderName), LocatorUtils.property(thatLocator, "clientFolderName", rhsClientFolderName), lhsClientFolderName, rhsClientFolderName)) {
                return false;
            }
        }
        {
            EmailSyncConflictResolution lhsConflictResolution;
            lhsConflictResolution = this.getConflictResolution();
            EmailSyncConflictResolution rhsConflictResolution;
            rhsConflictResolution = that.getConflictResolution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conflictResolution", lhsConflictResolution), LocatorUtils.property(thatLocator, "conflictResolution", rhsConflictResolution), lhsConflictResolution, rhsConflictResolution)) {
                return false;
            }
        }
        {
            String lhsDataSetFilter;
            lhsDataSetFilter = this.getDataSetFilter();
            String rhsDataSetFilter;
            rhsDataSetFilter = that.getDataSetFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSetFilter", lhsDataSetFilter), LocatorUtils.property(thatLocator, "dataSetFilter", rhsDataSetFilter), lhsDataSetFilter, rhsDataSetFilter)) {
                return false;
            }
        }
        {
            List<EmailSyncFieldMapping> lhsFieldMappings;
            lhsFieldMappings = (((this.fieldMappings!= null)&&(!this.fieldMappings.isEmpty()))?this.getFieldMappings():null);
            List<EmailSyncFieldMapping> rhsFieldMappings;
            rhsFieldMappings = (((that.fieldMappings!= null)&&(!that.fieldMappings.isEmpty()))?that.getFieldMappings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldMappings", lhsFieldMappings), LocatorUtils.property(thatLocator, "fieldMappings", rhsFieldMappings), lhsFieldMappings, rhsFieldMappings)) {
                return false;
            }
        }
        {
            EmailSyncMatchPreference lhsMatchPreference;
            lhsMatchPreference = this.getMatchPreference();
            EmailSyncMatchPreference rhsMatchPreference;
            rhsMatchPreference = that.getMatchPreference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchPreference", lhsMatchPreference), LocatorUtils.property(thatLocator, "matchPreference", rhsMatchPreference), lhsMatchPreference, rhsMatchPreference)) {
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
        {
            EmailSyncDirection lhsSyncDirection;
            lhsSyncDirection = this.getSyncDirection();
            EmailSyncDirection rhsSyncDirection;
            rhsSyncDirection = that.getSyncDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncDirection", lhsSyncDirection), LocatorUtils.property(thatLocator, "syncDirection", rhsSyncDirection), lhsSyncDirection, rhsSyncDirection)) {
                return false;
            }
        }
        {
            boolean lhsSyncFollowed;
            lhsSyncFollowed = (true?this.isSyncFollowed():false);
            boolean rhsSyncFollowed;
            rhsSyncFollowed = (true?that.isSyncFollowed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncFollowed", lhsSyncFollowed), LocatorUtils.property(thatLocator, "syncFollowed", rhsSyncFollowed), lhsSyncFollowed, rhsSyncFollowed)) {
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
            String theClientFolderName;
            theClientFolderName = this.getClientFolderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientFolderName", theClientFolderName), currentHashCode, theClientFolderName);
        }
        {
            EmailSyncConflictResolution theConflictResolution;
            theConflictResolution = this.getConflictResolution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conflictResolution", theConflictResolution), currentHashCode, theConflictResolution);
        }
        {
            String theDataSetFilter;
            theDataSetFilter = this.getDataSetFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSetFilter", theDataSetFilter), currentHashCode, theDataSetFilter);
        }
        {
            List<EmailSyncFieldMapping> theFieldMappings;
            theFieldMappings = (((this.fieldMappings!= null)&&(!this.fieldMappings.isEmpty()))?this.getFieldMappings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldMappings", theFieldMappings), currentHashCode, theFieldMappings);
        }
        {
            EmailSyncMatchPreference theMatchPreference;
            theMatchPreference = this.getMatchPreference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchPreference", theMatchPreference), currentHashCode, theMatchPreference);
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
        {
            EmailSyncDirection theSyncDirection;
            theSyncDirection = this.getSyncDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncDirection", theSyncDirection), currentHashCode, theSyncDirection);
        }
        {
            boolean theSyncFollowed;
            theSyncFollowed = (true?this.isSyncFollowed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncFollowed", theSyncFollowed), currentHashCode, theSyncFollowed);
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
            String theClientFolderName;
            theClientFolderName = this.getClientFolderName();
            strategy.appendField(locator, this, "clientFolderName", buffer, theClientFolderName);
        }
        {
            EmailSyncConflictResolution theConflictResolution;
            theConflictResolution = this.getConflictResolution();
            strategy.appendField(locator, this, "conflictResolution", buffer, theConflictResolution);
        }
        {
            String theDataSetFilter;
            theDataSetFilter = this.getDataSetFilter();
            strategy.appendField(locator, this, "dataSetFilter", buffer, theDataSetFilter);
        }
        {
            List<EmailSyncFieldMapping> theFieldMappings;
            theFieldMappings = (((this.fieldMappings!= null)&&(!this.fieldMappings.isEmpty()))?this.getFieldMappings():null);
            strategy.appendField(locator, this, "fieldMappings", buffer, theFieldMappings);
        }
        {
            EmailSyncMatchPreference theMatchPreference;
            theMatchPreference = this.getMatchPreference();
            strategy.appendField(locator, this, "matchPreference", buffer, theMatchPreference);
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
        {
            EmailSyncDirection theSyncDirection;
            theSyncDirection = this.getSyncDirection();
            strategy.appendField(locator, this, "syncDirection", buffer, theSyncDirection);
        }
        {
            boolean theSyncFollowed;
            theSyncFollowed = (true?this.isSyncFollowed():false);
            strategy.appendField(locator, this, "syncFollowed", buffer, theSyncFollowed);
        }
        return buffer;
    }

}
