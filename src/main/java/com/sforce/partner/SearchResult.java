
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
 * <p>Java class for SearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="searchRecords" type="{urn:partner.soap.sforce.com}SearchRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="searchResultsMetadata" type="{urn:partner.soap.sforce.com}SearchResultsMetadata" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult", propOrder = {
    "queryId",
    "searchRecords",
    "searchResultsMetadata"
})
public class SearchResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String queryId;
    protected List<SearchRecord> searchRecords;
    @XmlElement(nillable = true)
    protected SearchResultsMetadata searchResultsMetadata;

    /**
     * Gets the value of the queryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryId(String value) {
        this.queryId = value;
    }

    /**
     * Gets the value of the searchRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchRecord }
     * 
     * 
     */
    public List<SearchRecord> getSearchRecords() {
        if (searchRecords == null) {
            searchRecords = new ArrayList<SearchRecord>();
        }
        return this.searchRecords;
    }

    /**
     * Gets the value of the searchResultsMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsMetadata }
     *     
     */
    public SearchResultsMetadata getSearchResultsMetadata() {
        return searchResultsMetadata;
    }

    /**
     * Sets the value of the searchResultsMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsMetadata }
     *     
     */
    public void setSearchResultsMetadata(SearchResultsMetadata value) {
        this.searchResultsMetadata = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchResult that = ((SearchResult) object);
        {
            String lhsQueryId;
            lhsQueryId = this.getQueryId();
            String rhsQueryId;
            rhsQueryId = that.getQueryId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryId", lhsQueryId), LocatorUtils.property(thatLocator, "queryId", rhsQueryId), lhsQueryId, rhsQueryId)) {
                return false;
            }
        }
        {
            List<SearchRecord> lhsSearchRecords;
            lhsSearchRecords = (((this.searchRecords!= null)&&(!this.searchRecords.isEmpty()))?this.getSearchRecords():null);
            List<SearchRecord> rhsSearchRecords;
            rhsSearchRecords = (((that.searchRecords!= null)&&(!that.searchRecords.isEmpty()))?that.getSearchRecords():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchRecords", lhsSearchRecords), LocatorUtils.property(thatLocator, "searchRecords", rhsSearchRecords), lhsSearchRecords, rhsSearchRecords)) {
                return false;
            }
        }
        {
            SearchResultsMetadata lhsSearchResultsMetadata;
            lhsSearchResultsMetadata = this.getSearchResultsMetadata();
            SearchResultsMetadata rhsSearchResultsMetadata;
            rhsSearchResultsMetadata = that.getSearchResultsMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchResultsMetadata", lhsSearchResultsMetadata), LocatorUtils.property(thatLocator, "searchResultsMetadata", rhsSearchResultsMetadata), lhsSearchResultsMetadata, rhsSearchResultsMetadata)) {
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
            String theQueryId;
            theQueryId = this.getQueryId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryId", theQueryId), currentHashCode, theQueryId);
        }
        {
            List<SearchRecord> theSearchRecords;
            theSearchRecords = (((this.searchRecords!= null)&&(!this.searchRecords.isEmpty()))?this.getSearchRecords():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchRecords", theSearchRecords), currentHashCode, theSearchRecords);
        }
        {
            SearchResultsMetadata theSearchResultsMetadata;
            theSearchResultsMetadata = this.getSearchResultsMetadata();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchResultsMetadata", theSearchResultsMetadata), currentHashCode, theSearchResultsMetadata);
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
            String theQueryId;
            theQueryId = this.getQueryId();
            strategy.appendField(locator, this, "queryId", buffer, theQueryId);
        }
        {
            List<SearchRecord> theSearchRecords;
            theSearchRecords = (((this.searchRecords!= null)&&(!this.searchRecords.isEmpty()))?this.getSearchRecords():null);
            strategy.appendField(locator, this, "searchRecords", buffer, theSearchRecords);
        }
        {
            SearchResultsMetadata theSearchResultsMetadata;
            theSearchResultsMetadata = this.getSearchResultsMetadata();
            strategy.appendField(locator, this, "searchResultsMetadata", buffer, theSearchResultsMetadata);
        }
        return buffer;
    }

}
