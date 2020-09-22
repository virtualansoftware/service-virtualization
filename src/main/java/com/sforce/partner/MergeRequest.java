
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
 * <p>Java class for MergeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalInformationMap" type="{urn:partner.soap.sforce.com}AdditionalInformationMap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="masterRecord" type="{urn:sobject.partner.soap.sforce.com}sObject"/&gt;
 *         &lt;element name="recordToMergeIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeRequest", propOrder = {
    "additionalInformationMaps",
    "masterRecord",
    "recordToMergeIds"
})
public class MergeRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "additionalInformationMap")
    protected List<AdditionalInformationMap> additionalInformationMaps;
    @XmlElement(required = true)
    protected SObject masterRecord;
    @XmlElement(required = true)
    protected List<String> recordToMergeIds;

    /**
     * Gets the value of the additionalInformationMaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformationMaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformationMaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationMap }
     * 
     * 
     */
    public List<AdditionalInformationMap> getAdditionalInformationMaps() {
        if (additionalInformationMaps == null) {
            additionalInformationMaps = new ArrayList<AdditionalInformationMap>();
        }
        return this.additionalInformationMaps;
    }

    /**
     * Gets the value of the masterRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getMasterRecord() {
        return masterRecord;
    }

    /**
     * Sets the value of the masterRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setMasterRecord(SObject value) {
        this.masterRecord = value;
    }

    /**
     * Gets the value of the recordToMergeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordToMergeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordToMergeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecordToMergeIds() {
        if (recordToMergeIds == null) {
            recordToMergeIds = new ArrayList<String>();
        }
        return this.recordToMergeIds;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MergeRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MergeRequest that = ((MergeRequest) object);
        {
            List<AdditionalInformationMap> lhsAdditionalInformationMaps;
            lhsAdditionalInformationMaps = (((this.additionalInformationMaps!= null)&&(!this.additionalInformationMaps.isEmpty()))?this.getAdditionalInformationMaps():null);
            List<AdditionalInformationMap> rhsAdditionalInformationMaps;
            rhsAdditionalInformationMaps = (((that.additionalInformationMaps!= null)&&(!that.additionalInformationMaps.isEmpty()))?that.getAdditionalInformationMaps():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInformationMaps", lhsAdditionalInformationMaps), LocatorUtils.property(thatLocator, "additionalInformationMaps", rhsAdditionalInformationMaps), lhsAdditionalInformationMaps, rhsAdditionalInformationMaps)) {
                return false;
            }
        }
        {
            SObject lhsMasterRecord;
            lhsMasterRecord = this.getMasterRecord();
            SObject rhsMasterRecord;
            rhsMasterRecord = that.getMasterRecord();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "masterRecord", lhsMasterRecord), LocatorUtils.property(thatLocator, "masterRecord", rhsMasterRecord), lhsMasterRecord, rhsMasterRecord)) {
                return false;
            }
        }
        {
            List<String> lhsRecordToMergeIds;
            lhsRecordToMergeIds = (((this.recordToMergeIds!= null)&&(!this.recordToMergeIds.isEmpty()))?this.getRecordToMergeIds():null);
            List<String> rhsRecordToMergeIds;
            rhsRecordToMergeIds = (((that.recordToMergeIds!= null)&&(!that.recordToMergeIds.isEmpty()))?that.getRecordToMergeIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordToMergeIds", lhsRecordToMergeIds), LocatorUtils.property(thatLocator, "recordToMergeIds", rhsRecordToMergeIds), lhsRecordToMergeIds, rhsRecordToMergeIds)) {
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
            List<AdditionalInformationMap> theAdditionalInformationMaps;
            theAdditionalInformationMaps = (((this.additionalInformationMaps!= null)&&(!this.additionalInformationMaps.isEmpty()))?this.getAdditionalInformationMaps():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInformationMaps", theAdditionalInformationMaps), currentHashCode, theAdditionalInformationMaps);
        }
        {
            SObject theMasterRecord;
            theMasterRecord = this.getMasterRecord();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "masterRecord", theMasterRecord), currentHashCode, theMasterRecord);
        }
        {
            List<String> theRecordToMergeIds;
            theRecordToMergeIds = (((this.recordToMergeIds!= null)&&(!this.recordToMergeIds.isEmpty()))?this.getRecordToMergeIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordToMergeIds", theRecordToMergeIds), currentHashCode, theRecordToMergeIds);
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
            List<AdditionalInformationMap> theAdditionalInformationMaps;
            theAdditionalInformationMaps = (((this.additionalInformationMaps!= null)&&(!this.additionalInformationMaps.isEmpty()))?this.getAdditionalInformationMaps():null);
            strategy.appendField(locator, this, "additionalInformationMaps", buffer, theAdditionalInformationMaps);
        }
        {
            SObject theMasterRecord;
            theMasterRecord = this.getMasterRecord();
            strategy.appendField(locator, this, "masterRecord", buffer, theMasterRecord);
        }
        {
            List<String> theRecordToMergeIds;
            theRecordToMergeIds = (((this.recordToMergeIds!= null)&&(!this.recordToMergeIds.isEmpty()))?this.getRecordToMergeIds():null);
            strategy.appendField(locator, this, "recordToMergeIds", buffer, theRecordToMergeIds);
        }
        return buffer;
    }

}
