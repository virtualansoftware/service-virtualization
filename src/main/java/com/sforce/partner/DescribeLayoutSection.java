
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
 * <p>Java class for DescribeLayoutSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collapsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="columns" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="layoutRows" type="{urn:partner.soap.sforce.com}DescribeLayoutRow" maxOccurs="unbounded"/&gt;
 *         &lt;element name="layoutSectionId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="parentLayoutId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tabOrder" type="{urn:partner.soap.sforce.com}TabOrderType"/&gt;
 *         &lt;element name="useCollapsibleSection" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useHeading" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutSection", propOrder = {
    "collapsed",
    "columns",
    "heading",
    "layoutRows",
    "layoutSectionId",
    "parentLayoutId",
    "rows",
    "tabOrder",
    "useCollapsibleSection",
    "useHeading"
})
public class DescribeLayoutSection
    implements Equals, HashCode, ToString
{

    protected boolean collapsed;
    protected int columns;
    @XmlElement(required = true, nillable = true)
    protected String heading;
    @XmlElement(required = true)
    protected List<DescribeLayoutRow> layoutRows;
    @XmlElement(required = true, nillable = true)
    protected String layoutSectionId;
    @XmlElement(required = true)
    protected String parentLayoutId;
    protected int rows;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TabOrderType tabOrder;
    protected boolean useCollapsibleSection;
    protected boolean useHeading;

    /**
     * Gets the value of the collapsed property.
     * 
     */
    public boolean isCollapsed() {
        return collapsed;
    }

    /**
     * Sets the value of the collapsed property.
     * 
     */
    public void setCollapsed(boolean value) {
        this.collapsed = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     */
    public void setColumns(int value) {
        this.columns = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeading(String value) {
        this.heading = value;
    }

    /**
     * Gets the value of the layoutRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutRow }
     * 
     * 
     */
    public List<DescribeLayoutRow> getLayoutRows() {
        if (layoutRows == null) {
            layoutRows = new ArrayList<DescribeLayoutRow>();
        }
        return this.layoutRows;
    }

    /**
     * Gets the value of the layoutSectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutSectionId() {
        return layoutSectionId;
    }

    /**
     * Sets the value of the layoutSectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutSectionId(String value) {
        this.layoutSectionId = value;
    }

    /**
     * Gets the value of the parentLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentLayoutId() {
        return parentLayoutId;
    }

    /**
     * Sets the value of the parentLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentLayoutId(String value) {
        this.parentLayoutId = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     */
    public int getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     */
    public void setRows(int value) {
        this.rows = value;
    }

    /**
     * Gets the value of the tabOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TabOrderType }
     *     
     */
    public TabOrderType getTabOrder() {
        return tabOrder;
    }

    /**
     * Sets the value of the tabOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TabOrderType }
     *     
     */
    public void setTabOrder(TabOrderType value) {
        this.tabOrder = value;
    }

    /**
     * Gets the value of the useCollapsibleSection property.
     * 
     */
    public boolean isUseCollapsibleSection() {
        return useCollapsibleSection;
    }

    /**
     * Sets the value of the useCollapsibleSection property.
     * 
     */
    public void setUseCollapsibleSection(boolean value) {
        this.useCollapsibleSection = value;
    }

    /**
     * Gets the value of the useHeading property.
     * 
     */
    public boolean isUseHeading() {
        return useHeading;
    }

    /**
     * Sets the value of the useHeading property.
     * 
     */
    public void setUseHeading(boolean value) {
        this.useHeading = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayoutSection)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayoutSection that = ((DescribeLayoutSection) object);
        {
            boolean lhsCollapsed;
            lhsCollapsed = (true?this.isCollapsed():false);
            boolean rhsCollapsed;
            rhsCollapsed = (true?that.isCollapsed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collapsed", lhsCollapsed), LocatorUtils.property(thatLocator, "collapsed", rhsCollapsed), lhsCollapsed, rhsCollapsed)) {
                return false;
            }
        }
        {
            int lhsColumns;
            lhsColumns = (true?this.getColumns(): 0);
            int rhsColumns;
            rhsColumns = (true?that.getColumns(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columns", lhsColumns), LocatorUtils.property(thatLocator, "columns", rhsColumns), lhsColumns, rhsColumns)) {
                return false;
            }
        }
        {
            String lhsHeading;
            lhsHeading = this.getHeading();
            String rhsHeading;
            rhsHeading = that.getHeading();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heading", lhsHeading), LocatorUtils.property(thatLocator, "heading", rhsHeading), lhsHeading, rhsHeading)) {
                return false;
            }
        }
        {
            List<DescribeLayoutRow> lhsLayoutRows;
            lhsLayoutRows = (((this.layoutRows!= null)&&(!this.layoutRows.isEmpty()))?this.getLayoutRows():null);
            List<DescribeLayoutRow> rhsLayoutRows;
            rhsLayoutRows = (((that.layoutRows!= null)&&(!that.layoutRows.isEmpty()))?that.getLayoutRows():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutRows", lhsLayoutRows), LocatorUtils.property(thatLocator, "layoutRows", rhsLayoutRows), lhsLayoutRows, rhsLayoutRows)) {
                return false;
            }
        }
        {
            String lhsLayoutSectionId;
            lhsLayoutSectionId = this.getLayoutSectionId();
            String rhsLayoutSectionId;
            rhsLayoutSectionId = that.getLayoutSectionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutSectionId", lhsLayoutSectionId), LocatorUtils.property(thatLocator, "layoutSectionId", rhsLayoutSectionId), lhsLayoutSectionId, rhsLayoutSectionId)) {
                return false;
            }
        }
        {
            String lhsParentLayoutId;
            lhsParentLayoutId = this.getParentLayoutId();
            String rhsParentLayoutId;
            rhsParentLayoutId = that.getParentLayoutId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentLayoutId", lhsParentLayoutId), LocatorUtils.property(thatLocator, "parentLayoutId", rhsParentLayoutId), lhsParentLayoutId, rhsParentLayoutId)) {
                return false;
            }
        }
        {
            int lhsRows;
            lhsRows = (true?this.getRows(): 0);
            int rhsRows;
            rhsRows = (true?that.getRows(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rows", lhsRows), LocatorUtils.property(thatLocator, "rows", rhsRows), lhsRows, rhsRows)) {
                return false;
            }
        }
        {
            TabOrderType lhsTabOrder;
            lhsTabOrder = this.getTabOrder();
            TabOrderType rhsTabOrder;
            rhsTabOrder = that.getTabOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tabOrder", lhsTabOrder), LocatorUtils.property(thatLocator, "tabOrder", rhsTabOrder), lhsTabOrder, rhsTabOrder)) {
                return false;
            }
        }
        {
            boolean lhsUseCollapsibleSection;
            lhsUseCollapsibleSection = (true?this.isUseCollapsibleSection():false);
            boolean rhsUseCollapsibleSection;
            rhsUseCollapsibleSection = (true?that.isUseCollapsibleSection():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useCollapsibleSection", lhsUseCollapsibleSection), LocatorUtils.property(thatLocator, "useCollapsibleSection", rhsUseCollapsibleSection), lhsUseCollapsibleSection, rhsUseCollapsibleSection)) {
                return false;
            }
        }
        {
            boolean lhsUseHeading;
            lhsUseHeading = (true?this.isUseHeading():false);
            boolean rhsUseHeading;
            rhsUseHeading = (true?that.isUseHeading():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useHeading", lhsUseHeading), LocatorUtils.property(thatLocator, "useHeading", rhsUseHeading), lhsUseHeading, rhsUseHeading)) {
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
            boolean theCollapsed;
            theCollapsed = (true?this.isCollapsed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collapsed", theCollapsed), currentHashCode, theCollapsed);
        }
        {
            int theColumns;
            theColumns = (true?this.getColumns(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columns", theColumns), currentHashCode, theColumns);
        }
        {
            String theHeading;
            theHeading = this.getHeading();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "heading", theHeading), currentHashCode, theHeading);
        }
        {
            List<DescribeLayoutRow> theLayoutRows;
            theLayoutRows = (((this.layoutRows!= null)&&(!this.layoutRows.isEmpty()))?this.getLayoutRows():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layoutRows", theLayoutRows), currentHashCode, theLayoutRows);
        }
        {
            String theLayoutSectionId;
            theLayoutSectionId = this.getLayoutSectionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layoutSectionId", theLayoutSectionId), currentHashCode, theLayoutSectionId);
        }
        {
            String theParentLayoutId;
            theParentLayoutId = this.getParentLayoutId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentLayoutId", theParentLayoutId), currentHashCode, theParentLayoutId);
        }
        {
            int theRows;
            theRows = (true?this.getRows(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rows", theRows), currentHashCode, theRows);
        }
        {
            TabOrderType theTabOrder;
            theTabOrder = this.getTabOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tabOrder", theTabOrder), currentHashCode, theTabOrder);
        }
        {
            boolean theUseCollapsibleSection;
            theUseCollapsibleSection = (true?this.isUseCollapsibleSection():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useCollapsibleSection", theUseCollapsibleSection), currentHashCode, theUseCollapsibleSection);
        }
        {
            boolean theUseHeading;
            theUseHeading = (true?this.isUseHeading():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useHeading", theUseHeading), currentHashCode, theUseHeading);
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
            boolean theCollapsed;
            theCollapsed = (true?this.isCollapsed():false);
            strategy.appendField(locator, this, "collapsed", buffer, theCollapsed);
        }
        {
            int theColumns;
            theColumns = (true?this.getColumns(): 0);
            strategy.appendField(locator, this, "columns", buffer, theColumns);
        }
        {
            String theHeading;
            theHeading = this.getHeading();
            strategy.appendField(locator, this, "heading", buffer, theHeading);
        }
        {
            List<DescribeLayoutRow> theLayoutRows;
            theLayoutRows = (((this.layoutRows!= null)&&(!this.layoutRows.isEmpty()))?this.getLayoutRows():null);
            strategy.appendField(locator, this, "layoutRows", buffer, theLayoutRows);
        }
        {
            String theLayoutSectionId;
            theLayoutSectionId = this.getLayoutSectionId();
            strategy.appendField(locator, this, "layoutSectionId", buffer, theLayoutSectionId);
        }
        {
            String theParentLayoutId;
            theParentLayoutId = this.getParentLayoutId();
            strategy.appendField(locator, this, "parentLayoutId", buffer, theParentLayoutId);
        }
        {
            int theRows;
            theRows = (true?this.getRows(): 0);
            strategy.appendField(locator, this, "rows", buffer, theRows);
        }
        {
            TabOrderType theTabOrder;
            theTabOrder = this.getTabOrder();
            strategy.appendField(locator, this, "tabOrder", buffer, theTabOrder);
        }
        {
            boolean theUseCollapsibleSection;
            theUseCollapsibleSection = (true?this.isUseCollapsibleSection():false);
            strategy.appendField(locator, this, "useCollapsibleSection", buffer, theUseCollapsibleSection);
        }
        {
            boolean theUseHeading;
            theUseHeading = (true?this.isUseHeading():false);
            strategy.appendField(locator, this, "useHeading", buffer, theUseHeading);
        }
        return buffer;
    }

}
