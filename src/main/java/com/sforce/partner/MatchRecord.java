
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
 * <p>Java class for MatchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalInformation" type="{urn:partner.soap.sforce.com}AdditionalInformationMap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fieldDiffs" type="{urn:partner.soap.sforce.com}FieldDiff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchConfidence" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="record" type="{urn:sobject.partner.soap.sforce.com}sObject"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchRecord", propOrder = {
    "additionalInformations",
    "fieldDiffs",
    "matchConfidence",
    "record"
})
public class MatchRecord
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "additionalInformation")
    protected List<AdditionalInformationMap> additionalInformations;
    protected List<FieldDiff> fieldDiffs;
    protected double matchConfidence;
    @XmlElement(required = true)
    protected SObject record;

    /**
     * Gets the value of the additionalInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationMap }
     * 
     * 
     */
    public List<AdditionalInformationMap> getAdditionalInformations() {
        if (additionalInformations == null) {
            additionalInformations = new ArrayList<AdditionalInformationMap>();
        }
        return this.additionalInformations;
    }

    /**
     * Gets the value of the fieldDiffs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldDiffs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldDiffs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDiff }
     * 
     * 
     */
    public List<FieldDiff> getFieldDiffs() {
        if (fieldDiffs == null) {
            fieldDiffs = new ArrayList<FieldDiff>();
        }
        return this.fieldDiffs;
    }

    /**
     * Gets the value of the matchConfidence property.
     * 
     */
    public double getMatchConfidence() {
        return matchConfidence;
    }

    /**
     * Sets the value of the matchConfidence property.
     * 
     */
    public void setMatchConfidence(double value) {
        this.matchConfidence = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setRecord(SObject value) {
        this.record = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MatchRecord)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MatchRecord that = ((MatchRecord) object);
        {
            List<AdditionalInformationMap> lhsAdditionalInformations;
            lhsAdditionalInformations = (((this.additionalInformations!= null)&&(!this.additionalInformations.isEmpty()))?this.getAdditionalInformations():null);
            List<AdditionalInformationMap> rhsAdditionalInformations;
            rhsAdditionalInformations = (((that.additionalInformations!= null)&&(!that.additionalInformations.isEmpty()))?that.getAdditionalInformations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInformations", lhsAdditionalInformations), LocatorUtils.property(thatLocator, "additionalInformations", rhsAdditionalInformations), lhsAdditionalInformations, rhsAdditionalInformations)) {
                return false;
            }
        }
        {
            List<FieldDiff> lhsFieldDiffs;
            lhsFieldDiffs = (((this.fieldDiffs!= null)&&(!this.fieldDiffs.isEmpty()))?this.getFieldDiffs():null);
            List<FieldDiff> rhsFieldDiffs;
            rhsFieldDiffs = (((that.fieldDiffs!= null)&&(!that.fieldDiffs.isEmpty()))?that.getFieldDiffs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldDiffs", lhsFieldDiffs), LocatorUtils.property(thatLocator, "fieldDiffs", rhsFieldDiffs), lhsFieldDiffs, rhsFieldDiffs)) {
                return false;
            }
        }
        {
            double lhsMatchConfidence;
            lhsMatchConfidence = (true?this.getMatchConfidence(): 0.0D);
            double rhsMatchConfidence;
            rhsMatchConfidence = (true?that.getMatchConfidence(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchConfidence", lhsMatchConfidence), LocatorUtils.property(thatLocator, "matchConfidence", rhsMatchConfidence), lhsMatchConfidence, rhsMatchConfidence)) {
                return false;
            }
        }
        {
            SObject lhsRecord;
            lhsRecord = this.getRecord();
            SObject rhsRecord;
            rhsRecord = that.getRecord();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "record", lhsRecord), LocatorUtils.property(thatLocator, "record", rhsRecord), lhsRecord, rhsRecord)) {
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
            List<AdditionalInformationMap> theAdditionalInformations;
            theAdditionalInformations = (((this.additionalInformations!= null)&&(!this.additionalInformations.isEmpty()))?this.getAdditionalInformations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInformations", theAdditionalInformations), currentHashCode, theAdditionalInformations);
        }
        {
            List<FieldDiff> theFieldDiffs;
            theFieldDiffs = (((this.fieldDiffs!= null)&&(!this.fieldDiffs.isEmpty()))?this.getFieldDiffs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldDiffs", theFieldDiffs), currentHashCode, theFieldDiffs);
        }
        {
            double theMatchConfidence;
            theMatchConfidence = (true?this.getMatchConfidence(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchConfidence", theMatchConfidence), currentHashCode, theMatchConfidence);
        }
        {
            SObject theRecord;
            theRecord = this.getRecord();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "record", theRecord), currentHashCode, theRecord);
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
            List<AdditionalInformationMap> theAdditionalInformations;
            theAdditionalInformations = (((this.additionalInformations!= null)&&(!this.additionalInformations.isEmpty()))?this.getAdditionalInformations():null);
            strategy.appendField(locator, this, "additionalInformations", buffer, theAdditionalInformations);
        }
        {
            List<FieldDiff> theFieldDiffs;
            theFieldDiffs = (((this.fieldDiffs!= null)&&(!this.fieldDiffs.isEmpty()))?this.getFieldDiffs():null);
            strategy.appendField(locator, this, "fieldDiffs", buffer, theFieldDiffs);
        }
        {
            double theMatchConfidence;
            theMatchConfidence = (true?this.getMatchConfidence(): 0.0D);
            strategy.appendField(locator, this, "matchConfidence", buffer, theMatchConfidence);
        }
        {
            SObject theRecord;
            theRecord = this.getRecord();
            strategy.appendField(locator, this, "record", buffer, theRecord);
        }
        return buffer;
    }

}
