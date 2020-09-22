
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
 * <p>Java class for DescribeListView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeListView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="limitRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listViewAdvancedFilter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listViewColumns" type="{urn:partner.soap.sforce.com}DescribeColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listViewFilters" type="{urn:partner.soap.sforce.com}DescribeFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listViewName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listViewScopeFilters" type="{urn:partner.soap.sforce.com}DescribeFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedEntityId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{urn:partner.soap.sforce.com}queryOptionsScope" minOccurs="0"/&gt;
 *         &lt;element name="scopeEntityId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="sobjectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeListView", propOrder = {
    "filterLanguage",
    "id",
    "limitRows",
    "listViewAdvancedFilter",
    "listViewColumns",
    "listViewFilters",
    "listViewName",
    "listViewScopeFilters",
    "relatedEntityId",
    "scope",
    "scopeEntityId",
    "sobjectName"
})
public class DescribeListView
    implements Equals, HashCode, ToString
{

    protected String filterLanguage;
    @XmlElement(required = true)
    protected String id;
    protected int limitRows;
    @XmlElement(required = true, nillable = true)
    protected String listViewAdvancedFilter;
    protected List<DescribeColumn> listViewColumns;
    protected List<DescribeFilter> listViewFilters;
    @XmlElement(required = true)
    protected String listViewName;
    protected List<DescribeFilter> listViewScopeFilters;
    @XmlElement(nillable = true)
    protected String relatedEntityId;
    @XmlSchemaType(name = "string")
    protected QueryOptionsScope scope;
    @XmlElement(nillable = true)
    protected String scopeEntityId;
    @XmlElement(required = true, nillable = true)
    protected String sobjectName;

    /**
     * Gets the value of the filterLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterLanguage() {
        return filterLanguage;
    }

    /**
     * Sets the value of the filterLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterLanguage(String value) {
        this.filterLanguage = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the limitRows property.
     * 
     */
    public int getLimitRows() {
        return limitRows;
    }

    /**
     * Sets the value of the limitRows property.
     * 
     */
    public void setLimitRows(int value) {
        this.limitRows = value;
    }

    /**
     * Gets the value of the listViewAdvancedFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListViewAdvancedFilter() {
        return listViewAdvancedFilter;
    }

    /**
     * Sets the value of the listViewAdvancedFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListViewAdvancedFilter(String value) {
        this.listViewAdvancedFilter = value;
    }

    /**
     * Gets the value of the listViewColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listViewColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListViewColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeColumn }
     * 
     * 
     */
    public List<DescribeColumn> getListViewColumns() {
        if (listViewColumns == null) {
            listViewColumns = new ArrayList<DescribeColumn>();
        }
        return this.listViewColumns;
    }

    /**
     * Gets the value of the listViewFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listViewFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListViewFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeFilter }
     * 
     * 
     */
    public List<DescribeFilter> getListViewFilters() {
        if (listViewFilters == null) {
            listViewFilters = new ArrayList<DescribeFilter>();
        }
        return this.listViewFilters;
    }

    /**
     * Gets the value of the listViewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListViewName() {
        return listViewName;
    }

    /**
     * Sets the value of the listViewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListViewName(String value) {
        this.listViewName = value;
    }

    /**
     * Gets the value of the listViewScopeFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listViewScopeFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListViewScopeFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeFilter }
     * 
     * 
     */
    public List<DescribeFilter> getListViewScopeFilters() {
        if (listViewScopeFilters == null) {
            listViewScopeFilters = new ArrayList<DescribeFilter>();
        }
        return this.listViewScopeFilters;
    }

    /**
     * Gets the value of the relatedEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedEntityId() {
        return relatedEntityId;
    }

    /**
     * Sets the value of the relatedEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedEntityId(String value) {
        this.relatedEntityId = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOptionsScope }
     *     
     */
    public QueryOptionsScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOptionsScope }
     *     
     */
    public void setScope(QueryOptionsScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the scopeEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeEntityId() {
        return scopeEntityId;
    }

    /**
     * Sets the value of the scopeEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeEntityId(String value) {
        this.scopeEntityId = value;
    }

    /**
     * Gets the value of the sobjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobjectName() {
        return sobjectName;
    }

    /**
     * Sets the value of the sobjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobjectName(String value) {
        this.sobjectName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeListView)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeListView that = ((DescribeListView) object);
        {
            String lhsFilterLanguage;
            lhsFilterLanguage = this.getFilterLanguage();
            String rhsFilterLanguage;
            rhsFilterLanguage = that.getFilterLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filterLanguage", lhsFilterLanguage), LocatorUtils.property(thatLocator, "filterLanguage", rhsFilterLanguage), lhsFilterLanguage, rhsFilterLanguage)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            int lhsLimitRows;
            lhsLimitRows = (true?this.getLimitRows(): 0);
            int rhsLimitRows;
            rhsLimitRows = (true?that.getLimitRows(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limitRows", lhsLimitRows), LocatorUtils.property(thatLocator, "limitRows", rhsLimitRows), lhsLimitRows, rhsLimitRows)) {
                return false;
            }
        }
        {
            String lhsListViewAdvancedFilter;
            lhsListViewAdvancedFilter = this.getListViewAdvancedFilter();
            String rhsListViewAdvancedFilter;
            rhsListViewAdvancedFilter = that.getListViewAdvancedFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listViewAdvancedFilter", lhsListViewAdvancedFilter), LocatorUtils.property(thatLocator, "listViewAdvancedFilter", rhsListViewAdvancedFilter), lhsListViewAdvancedFilter, rhsListViewAdvancedFilter)) {
                return false;
            }
        }
        {
            List<DescribeColumn> lhsListViewColumns;
            lhsListViewColumns = (((this.listViewColumns!= null)&&(!this.listViewColumns.isEmpty()))?this.getListViewColumns():null);
            List<DescribeColumn> rhsListViewColumns;
            rhsListViewColumns = (((that.listViewColumns!= null)&&(!that.listViewColumns.isEmpty()))?that.getListViewColumns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listViewColumns", lhsListViewColumns), LocatorUtils.property(thatLocator, "listViewColumns", rhsListViewColumns), lhsListViewColumns, rhsListViewColumns)) {
                return false;
            }
        }
        {
            List<DescribeFilter> lhsListViewFilters;
            lhsListViewFilters = (((this.listViewFilters!= null)&&(!this.listViewFilters.isEmpty()))?this.getListViewFilters():null);
            List<DescribeFilter> rhsListViewFilters;
            rhsListViewFilters = (((that.listViewFilters!= null)&&(!that.listViewFilters.isEmpty()))?that.getListViewFilters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listViewFilters", lhsListViewFilters), LocatorUtils.property(thatLocator, "listViewFilters", rhsListViewFilters), lhsListViewFilters, rhsListViewFilters)) {
                return false;
            }
        }
        {
            String lhsListViewName;
            lhsListViewName = this.getListViewName();
            String rhsListViewName;
            rhsListViewName = that.getListViewName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listViewName", lhsListViewName), LocatorUtils.property(thatLocator, "listViewName", rhsListViewName), lhsListViewName, rhsListViewName)) {
                return false;
            }
        }
        {
            List<DescribeFilter> lhsListViewScopeFilters;
            lhsListViewScopeFilters = (((this.listViewScopeFilters!= null)&&(!this.listViewScopeFilters.isEmpty()))?this.getListViewScopeFilters():null);
            List<DescribeFilter> rhsListViewScopeFilters;
            rhsListViewScopeFilters = (((that.listViewScopeFilters!= null)&&(!that.listViewScopeFilters.isEmpty()))?that.getListViewScopeFilters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listViewScopeFilters", lhsListViewScopeFilters), LocatorUtils.property(thatLocator, "listViewScopeFilters", rhsListViewScopeFilters), lhsListViewScopeFilters, rhsListViewScopeFilters)) {
                return false;
            }
        }
        {
            String lhsRelatedEntityId;
            lhsRelatedEntityId = this.getRelatedEntityId();
            String rhsRelatedEntityId;
            rhsRelatedEntityId = that.getRelatedEntityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relatedEntityId", lhsRelatedEntityId), LocatorUtils.property(thatLocator, "relatedEntityId", rhsRelatedEntityId), lhsRelatedEntityId, rhsRelatedEntityId)) {
                return false;
            }
        }
        {
            QueryOptionsScope lhsScope;
            lhsScope = this.getScope();
            QueryOptionsScope rhsScope;
            rhsScope = that.getScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scope", lhsScope), LocatorUtils.property(thatLocator, "scope", rhsScope), lhsScope, rhsScope)) {
                return false;
            }
        }
        {
            String lhsScopeEntityId;
            lhsScopeEntityId = this.getScopeEntityId();
            String rhsScopeEntityId;
            rhsScopeEntityId = that.getScopeEntityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scopeEntityId", lhsScopeEntityId), LocatorUtils.property(thatLocator, "scopeEntityId", rhsScopeEntityId), lhsScopeEntityId, rhsScopeEntityId)) {
                return false;
            }
        }
        {
            String lhsSobjectName;
            lhsSobjectName = this.getSobjectName();
            String rhsSobjectName;
            rhsSobjectName = that.getSobjectName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobjectName", lhsSobjectName), LocatorUtils.property(thatLocator, "sobjectName", rhsSobjectName), lhsSobjectName, rhsSobjectName)) {
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
            String theFilterLanguage;
            theFilterLanguage = this.getFilterLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filterLanguage", theFilterLanguage), currentHashCode, theFilterLanguage);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            int theLimitRows;
            theLimitRows = (true?this.getLimitRows(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limitRows", theLimitRows), currentHashCode, theLimitRows);
        }
        {
            String theListViewAdvancedFilter;
            theListViewAdvancedFilter = this.getListViewAdvancedFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listViewAdvancedFilter", theListViewAdvancedFilter), currentHashCode, theListViewAdvancedFilter);
        }
        {
            List<DescribeColumn> theListViewColumns;
            theListViewColumns = (((this.listViewColumns!= null)&&(!this.listViewColumns.isEmpty()))?this.getListViewColumns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listViewColumns", theListViewColumns), currentHashCode, theListViewColumns);
        }
        {
            List<DescribeFilter> theListViewFilters;
            theListViewFilters = (((this.listViewFilters!= null)&&(!this.listViewFilters.isEmpty()))?this.getListViewFilters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listViewFilters", theListViewFilters), currentHashCode, theListViewFilters);
        }
        {
            String theListViewName;
            theListViewName = this.getListViewName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listViewName", theListViewName), currentHashCode, theListViewName);
        }
        {
            List<DescribeFilter> theListViewScopeFilters;
            theListViewScopeFilters = (((this.listViewScopeFilters!= null)&&(!this.listViewScopeFilters.isEmpty()))?this.getListViewScopeFilters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listViewScopeFilters", theListViewScopeFilters), currentHashCode, theListViewScopeFilters);
        }
        {
            String theRelatedEntityId;
            theRelatedEntityId = this.getRelatedEntityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relatedEntityId", theRelatedEntityId), currentHashCode, theRelatedEntityId);
        }
        {
            QueryOptionsScope theScope;
            theScope = this.getScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scope", theScope), currentHashCode, theScope);
        }
        {
            String theScopeEntityId;
            theScopeEntityId = this.getScopeEntityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scopeEntityId", theScopeEntityId), currentHashCode, theScopeEntityId);
        }
        {
            String theSobjectName;
            theSobjectName = this.getSobjectName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobjectName", theSobjectName), currentHashCode, theSobjectName);
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
            String theFilterLanguage;
            theFilterLanguage = this.getFilterLanguage();
            strategy.appendField(locator, this, "filterLanguage", buffer, theFilterLanguage);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            int theLimitRows;
            theLimitRows = (true?this.getLimitRows(): 0);
            strategy.appendField(locator, this, "limitRows", buffer, theLimitRows);
        }
        {
            String theListViewAdvancedFilter;
            theListViewAdvancedFilter = this.getListViewAdvancedFilter();
            strategy.appendField(locator, this, "listViewAdvancedFilter", buffer, theListViewAdvancedFilter);
        }
        {
            List<DescribeColumn> theListViewColumns;
            theListViewColumns = (((this.listViewColumns!= null)&&(!this.listViewColumns.isEmpty()))?this.getListViewColumns():null);
            strategy.appendField(locator, this, "listViewColumns", buffer, theListViewColumns);
        }
        {
            List<DescribeFilter> theListViewFilters;
            theListViewFilters = (((this.listViewFilters!= null)&&(!this.listViewFilters.isEmpty()))?this.getListViewFilters():null);
            strategy.appendField(locator, this, "listViewFilters", buffer, theListViewFilters);
        }
        {
            String theListViewName;
            theListViewName = this.getListViewName();
            strategy.appendField(locator, this, "listViewName", buffer, theListViewName);
        }
        {
            List<DescribeFilter> theListViewScopeFilters;
            theListViewScopeFilters = (((this.listViewScopeFilters!= null)&&(!this.listViewScopeFilters.isEmpty()))?this.getListViewScopeFilters():null);
            strategy.appendField(locator, this, "listViewScopeFilters", buffer, theListViewScopeFilters);
        }
        {
            String theRelatedEntityId;
            theRelatedEntityId = this.getRelatedEntityId();
            strategy.appendField(locator, this, "relatedEntityId", buffer, theRelatedEntityId);
        }
        {
            QueryOptionsScope theScope;
            theScope = this.getScope();
            strategy.appendField(locator, this, "scope", buffer, theScope);
        }
        {
            String theScopeEntityId;
            theScopeEntityId = this.getScopeEntityId();
            strategy.appendField(locator, this, "scopeEntityId", buffer, theScopeEntityId);
        }
        {
            String theSobjectName;
            theSobjectName = this.getSobjectName();
            strategy.appendField(locator, this, "sobjectName", buffer, theSobjectName);
        }
        return buffer;
    }

}
