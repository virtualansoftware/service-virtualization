
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
 * <p>Java class for DescribeSoqlListView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoqlListView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="columns" type="{urn:partner.soap.sforce.com}ListViewColumn" maxOccurs="unbounded"/&gt;
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="orderBy" type="{urn:partner.soap.sforce.com}ListViewOrderBy" maxOccurs="unbounded"/&gt;
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="relatedEntityId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scopeEntityId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="sobjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="whereCondition" type="{urn:partner.soap.sforce.com}SoqlWhereCondition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoqlListView", propOrder = {
    "columns",
    "id",
    "orderBies",
    "query",
    "relatedEntityId",
    "scope",
    "scopeEntityId",
    "sobjectType",
    "whereCondition"
})
public class DescribeSoqlListView
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<ListViewColumn> columns;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "orderBy", required = true)
    protected List<ListViewOrderBy> orderBies;
    @XmlElement(required = true)
    protected String query;
    @XmlElement(nillable = true)
    protected String relatedEntityId;
    @XmlElement(required = true, nillable = true)
    protected String scope;
    @XmlElement(nillable = true)
    protected String scopeEntityId;
    @XmlElement(required = true)
    protected String sobjectType;
    protected SoqlWhereCondition whereCondition;

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListViewColumn }
     * 
     * 
     */
    public List<ListViewColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<ListViewColumn>();
        }
        return this.columns;
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
     * Gets the value of the orderBies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListViewOrderBy }
     * 
     * 
     */
    public List<ListViewOrderBy> getOrderBies() {
        if (orderBies == null) {
            orderBies = new ArrayList<ListViewOrderBy>();
        }
        return this.orderBies;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
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
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
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
     * Gets the value of the sobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobjectType() {
        return sobjectType;
    }

    /**
     * Sets the value of the sobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobjectType(String value) {
        this.sobjectType = value;
    }

    /**
     * Gets the value of the whereCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SoqlWhereCondition }
     *     
     */
    public SoqlWhereCondition getWhereCondition() {
        return whereCondition;
    }

    /**
     * Sets the value of the whereCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoqlWhereCondition }
     *     
     */
    public void setWhereCondition(SoqlWhereCondition value) {
        this.whereCondition = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSoqlListView)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSoqlListView that = ((DescribeSoqlListView) object);
        {
            List<ListViewColumn> lhsColumns;
            lhsColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            List<ListViewColumn> rhsColumns;
            rhsColumns = (((that.columns!= null)&&(!that.columns.isEmpty()))?that.getColumns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columns", lhsColumns), LocatorUtils.property(thatLocator, "columns", rhsColumns), lhsColumns, rhsColumns)) {
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
            List<ListViewOrderBy> lhsOrderBies;
            lhsOrderBies = (((this.orderBies!= null)&&(!this.orderBies.isEmpty()))?this.getOrderBies():null);
            List<ListViewOrderBy> rhsOrderBies;
            rhsOrderBies = (((that.orderBies!= null)&&(!that.orderBies.isEmpty()))?that.getOrderBies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderBies", lhsOrderBies), LocatorUtils.property(thatLocator, "orderBies", rhsOrderBies), lhsOrderBies, rhsOrderBies)) {
                return false;
            }
        }
        {
            String lhsQuery;
            lhsQuery = this.getQuery();
            String rhsQuery;
            rhsQuery = that.getQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "query", lhsQuery), LocatorUtils.property(thatLocator, "query", rhsQuery), lhsQuery, rhsQuery)) {
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
            String lhsScope;
            lhsScope = this.getScope();
            String rhsScope;
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
            String lhsSobjectType;
            lhsSobjectType = this.getSobjectType();
            String rhsSobjectType;
            rhsSobjectType = that.getSobjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobjectType", lhsSobjectType), LocatorUtils.property(thatLocator, "sobjectType", rhsSobjectType), lhsSobjectType, rhsSobjectType)) {
                return false;
            }
        }
        {
            SoqlWhereCondition lhsWhereCondition;
            lhsWhereCondition = this.getWhereCondition();
            SoqlWhereCondition rhsWhereCondition;
            rhsWhereCondition = that.getWhereCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whereCondition", lhsWhereCondition), LocatorUtils.property(thatLocator, "whereCondition", rhsWhereCondition), lhsWhereCondition, rhsWhereCondition)) {
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
            List<ListViewColumn> theColumns;
            theColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columns", theColumns), currentHashCode, theColumns);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            List<ListViewOrderBy> theOrderBies;
            theOrderBies = (((this.orderBies!= null)&&(!this.orderBies.isEmpty()))?this.getOrderBies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderBies", theOrderBies), currentHashCode, theOrderBies);
        }
        {
            String theQuery;
            theQuery = this.getQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "query", theQuery), currentHashCode, theQuery);
        }
        {
            String theRelatedEntityId;
            theRelatedEntityId = this.getRelatedEntityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relatedEntityId", theRelatedEntityId), currentHashCode, theRelatedEntityId);
        }
        {
            String theScope;
            theScope = this.getScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scope", theScope), currentHashCode, theScope);
        }
        {
            String theScopeEntityId;
            theScopeEntityId = this.getScopeEntityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scopeEntityId", theScopeEntityId), currentHashCode, theScopeEntityId);
        }
        {
            String theSobjectType;
            theSobjectType = this.getSobjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobjectType", theSobjectType), currentHashCode, theSobjectType);
        }
        {
            SoqlWhereCondition theWhereCondition;
            theWhereCondition = this.getWhereCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whereCondition", theWhereCondition), currentHashCode, theWhereCondition);
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
            List<ListViewColumn> theColumns;
            theColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            strategy.appendField(locator, this, "columns", buffer, theColumns);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            List<ListViewOrderBy> theOrderBies;
            theOrderBies = (((this.orderBies!= null)&&(!this.orderBies.isEmpty()))?this.getOrderBies():null);
            strategy.appendField(locator, this, "orderBies", buffer, theOrderBies);
        }
        {
            String theQuery;
            theQuery = this.getQuery();
            strategy.appendField(locator, this, "query", buffer, theQuery);
        }
        {
            String theRelatedEntityId;
            theRelatedEntityId = this.getRelatedEntityId();
            strategy.appendField(locator, this, "relatedEntityId", buffer, theRelatedEntityId);
        }
        {
            String theScope;
            theScope = this.getScope();
            strategy.appendField(locator, this, "scope", buffer, theScope);
        }
        {
            String theScopeEntityId;
            theScopeEntityId = this.getScopeEntityId();
            strategy.appendField(locator, this, "scopeEntityId", buffer, theScopeEntityId);
        }
        {
            String theSobjectType;
            theSobjectType = this.getSobjectType();
            strategy.appendField(locator, this, "sobjectType", buffer, theSobjectType);
        }
        {
            SoqlWhereCondition theWhereCondition;
            theWhereCondition = this.getWhereCondition();
            strategy.appendField(locator, this, "whereCondition", buffer, theWhereCondition);
        }
        return buffer;
    }

}
