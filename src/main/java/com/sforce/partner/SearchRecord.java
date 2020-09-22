
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
 * <p>Java class for SearchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="record" type="{urn:sobject.partner.soap.sforce.com}sObject"/&gt;
 *         &lt;element name="searchRecordMetadata" type="{urn:partner.soap.sforce.com}SearchRecordMetadata" minOccurs="0"/&gt;
 *         &lt;element name="snippet" type="{urn:partner.soap.sforce.com}SearchSnippet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRecord", propOrder = {
    "record",
    "searchRecordMetadata",
    "snippet"
})
public class SearchRecord
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected SObject record;
    protected SearchRecordMetadata searchRecordMetadata;
    @XmlElement(nillable = true)
    protected SearchSnippet snippet;

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

    /**
     * Gets the value of the searchRecordMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRecordMetadata }
     *     
     */
    public SearchRecordMetadata getSearchRecordMetadata() {
        return searchRecordMetadata;
    }

    /**
     * Sets the value of the searchRecordMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRecordMetadata }
     *     
     */
    public void setSearchRecordMetadata(SearchRecordMetadata value) {
        this.searchRecordMetadata = value;
    }

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSnippet }
     *     
     */
    public SearchSnippet getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSnippet }
     *     
     */
    public void setSnippet(SearchSnippet value) {
        this.snippet = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchRecord)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchRecord that = ((SearchRecord) object);
        {
            SObject lhsRecord;
            lhsRecord = this.getRecord();
            SObject rhsRecord;
            rhsRecord = that.getRecord();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "record", lhsRecord), LocatorUtils.property(thatLocator, "record", rhsRecord), lhsRecord, rhsRecord)) {
                return false;
            }
        }
        {
            SearchRecordMetadata lhsSearchRecordMetadata;
            lhsSearchRecordMetadata = this.getSearchRecordMetadata();
            SearchRecordMetadata rhsSearchRecordMetadata;
            rhsSearchRecordMetadata = that.getSearchRecordMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchRecordMetadata", lhsSearchRecordMetadata), LocatorUtils.property(thatLocator, "searchRecordMetadata", rhsSearchRecordMetadata), lhsSearchRecordMetadata, rhsSearchRecordMetadata)) {
                return false;
            }
        }
        {
            SearchSnippet lhsSnippet;
            lhsSnippet = this.getSnippet();
            SearchSnippet rhsSnippet;
            rhsSnippet = that.getSnippet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "snippet", lhsSnippet), LocatorUtils.property(thatLocator, "snippet", rhsSnippet), lhsSnippet, rhsSnippet)) {
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
            SObject theRecord;
            theRecord = this.getRecord();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "record", theRecord), currentHashCode, theRecord);
        }
        {
            SearchRecordMetadata theSearchRecordMetadata;
            theSearchRecordMetadata = this.getSearchRecordMetadata();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchRecordMetadata", theSearchRecordMetadata), currentHashCode, theSearchRecordMetadata);
        }
        {
            SearchSnippet theSnippet;
            theSnippet = this.getSnippet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "snippet", theSnippet), currentHashCode, theSnippet);
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
            SObject theRecord;
            theRecord = this.getRecord();
            strategy.appendField(locator, this, "record", buffer, theRecord);
        }
        {
            SearchRecordMetadata theSearchRecordMetadata;
            theSearchRecordMetadata = this.getSearchRecordMetadata();
            strategy.appendField(locator, this, "searchRecordMetadata", buffer, theSearchRecordMetadata);
        }
        {
            SearchSnippet theSnippet;
            theSnippet = this.getSnippet();
            strategy.appendField(locator, this, "snippet", buffer, theSnippet);
        }
        return buffer;
    }

}
