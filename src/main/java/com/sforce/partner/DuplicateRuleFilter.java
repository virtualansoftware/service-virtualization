
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
 * <p>Java class for DuplicateRuleFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateRuleFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booleanFilter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filterItems" type="{urn:partner.soap.sforce.com}DuplicateRuleFilterItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ruleCritera" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateRuleFilter", propOrder = {
    "booleanFilter",
    "filterItems",
    "ruleCritera"
})
public class DuplicateRuleFilter
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String booleanFilter;
    protected List<DuplicateRuleFilterItem> filterItems;
    @XmlElement(required = true)
    protected String ruleCritera;

    /**
     * Gets the value of the booleanFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanFilter() {
        return booleanFilter;
    }

    /**
     * Sets the value of the booleanFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanFilter(String value) {
        this.booleanFilter = value;
    }

    /**
     * Gets the value of the filterItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DuplicateRuleFilterItem }
     * 
     * 
     */
    public List<DuplicateRuleFilterItem> getFilterItems() {
        if (filterItems == null) {
            filterItems = new ArrayList<DuplicateRuleFilterItem>();
        }
        return this.filterItems;
    }

    /**
     * Gets the value of the ruleCritera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCritera() {
        return ruleCritera;
    }

    /**
     * Sets the value of the ruleCritera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCritera(String value) {
        this.ruleCritera = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DuplicateRuleFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DuplicateRuleFilter that = ((DuplicateRuleFilter) object);
        {
            String lhsBooleanFilter;
            lhsBooleanFilter = this.getBooleanFilter();
            String rhsBooleanFilter;
            rhsBooleanFilter = that.getBooleanFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "booleanFilter", lhsBooleanFilter), LocatorUtils.property(thatLocator, "booleanFilter", rhsBooleanFilter), lhsBooleanFilter, rhsBooleanFilter)) {
                return false;
            }
        }
        {
            List<DuplicateRuleFilterItem> lhsFilterItems;
            lhsFilterItems = (((this.filterItems!= null)&&(!this.filterItems.isEmpty()))?this.getFilterItems():null);
            List<DuplicateRuleFilterItem> rhsFilterItems;
            rhsFilterItems = (((that.filterItems!= null)&&(!that.filterItems.isEmpty()))?that.getFilterItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filterItems", lhsFilterItems), LocatorUtils.property(thatLocator, "filterItems", rhsFilterItems), lhsFilterItems, rhsFilterItems)) {
                return false;
            }
        }
        {
            String lhsRuleCritera;
            lhsRuleCritera = this.getRuleCritera();
            String rhsRuleCritera;
            rhsRuleCritera = that.getRuleCritera();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ruleCritera", lhsRuleCritera), LocatorUtils.property(thatLocator, "ruleCritera", rhsRuleCritera), lhsRuleCritera, rhsRuleCritera)) {
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
            String theBooleanFilter;
            theBooleanFilter = this.getBooleanFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "booleanFilter", theBooleanFilter), currentHashCode, theBooleanFilter);
        }
        {
            List<DuplicateRuleFilterItem> theFilterItems;
            theFilterItems = (((this.filterItems!= null)&&(!this.filterItems.isEmpty()))?this.getFilterItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filterItems", theFilterItems), currentHashCode, theFilterItems);
        }
        {
            String theRuleCritera;
            theRuleCritera = this.getRuleCritera();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ruleCritera", theRuleCritera), currentHashCode, theRuleCritera);
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
            String theBooleanFilter;
            theBooleanFilter = this.getBooleanFilter();
            strategy.appendField(locator, this, "booleanFilter", buffer, theBooleanFilter);
        }
        {
            List<DuplicateRuleFilterItem> theFilterItems;
            theFilterItems = (((this.filterItems!= null)&&(!this.filterItems.isEmpty()))?this.getFilterItems():null);
            strategy.appendField(locator, this, "filterItems", buffer, theFilterItems);
        }
        {
            String theRuleCritera;
            theRuleCritera = this.getRuleCritera();
            strategy.appendField(locator, this, "ruleCritera", buffer, theRuleCritera);
        }
        return buffer;
    }

}
