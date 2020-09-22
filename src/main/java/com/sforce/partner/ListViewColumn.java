
package com.sforce.partner;

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
 * <p>Java class for ListViewColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListViewColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ascendingLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descendingLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fieldNameOrPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="searchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="selectListItem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sortDirection" type="{urn:partner.soap.sforce.com}orderByDirection"/&gt;
 *         &lt;element name="sortIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sortable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="type" type="{urn:partner.soap.sforce.com}fieldType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListViewColumn", propOrder = {
    "ascendingLabel",
    "descendingLabel",
    "fieldNameOrPath",
    "hidden",
    "label",
    "searchable",
    "selectListItem",
    "sortDirection",
    "sortIndex",
    "sortable",
    "type"
})
public class ListViewColumn
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String ascendingLabel;
    @XmlElement(required = true, nillable = true)
    protected String descendingLabel;
    @XmlElement(required = true)
    protected String fieldNameOrPath;
    protected boolean hidden;
    @XmlElement(required = true)
    protected String label;
    protected boolean searchable;
    @XmlElement(required = true)
    protected String selectListItem;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected OrderByDirection sortDirection;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sortIndex;
    protected boolean sortable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FieldType type;

    /**
     * Gets the value of the ascendingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAscendingLabel() {
        return ascendingLabel;
    }

    /**
     * Sets the value of the ascendingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAscendingLabel(String value) {
        this.ascendingLabel = value;
    }

    /**
     * Gets the value of the descendingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescendingLabel() {
        return descendingLabel;
    }

    /**
     * Sets the value of the descendingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescendingLabel(String value) {
        this.descendingLabel = value;
    }

    /**
     * Gets the value of the fieldNameOrPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldNameOrPath() {
        return fieldNameOrPath;
    }

    /**
     * Sets the value of the fieldNameOrPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldNameOrPath(String value) {
        this.fieldNameOrPath = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     */
    public boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     */
    public void setSearchable(boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the selectListItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectListItem() {
        return selectListItem;
    }

    /**
     * Sets the value of the selectListItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectListItem(String value) {
        this.selectListItem = value;
    }

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByDirection }
     *     
     */
    public OrderByDirection getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByDirection }
     *     
     */
    public void setSortDirection(OrderByDirection value) {
        this.sortDirection = value;
    }

    /**
     * Gets the value of the sortIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortIndex() {
        return sortIndex;
    }

    /**
     * Sets the value of the sortIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortIndex(Integer value) {
        this.sortIndex = value;
    }

    /**
     * Gets the value of the sortable property.
     * 
     */
    public boolean isSortable() {
        return sortable;
    }

    /**
     * Sets the value of the sortable property.
     * 
     */
    public void setSortable(boolean value) {
        this.sortable = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setType(FieldType value) {
        this.type = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ListViewColumn)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ListViewColumn that = ((ListViewColumn) object);
        {
            String lhsAscendingLabel;
            lhsAscendingLabel = this.getAscendingLabel();
            String rhsAscendingLabel;
            rhsAscendingLabel = that.getAscendingLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ascendingLabel", lhsAscendingLabel), LocatorUtils.property(thatLocator, "ascendingLabel", rhsAscendingLabel), lhsAscendingLabel, rhsAscendingLabel)) {
                return false;
            }
        }
        {
            String lhsDescendingLabel;
            lhsDescendingLabel = this.getDescendingLabel();
            String rhsDescendingLabel;
            rhsDescendingLabel = that.getDescendingLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descendingLabel", lhsDescendingLabel), LocatorUtils.property(thatLocator, "descendingLabel", rhsDescendingLabel), lhsDescendingLabel, rhsDescendingLabel)) {
                return false;
            }
        }
        {
            String lhsFieldNameOrPath;
            lhsFieldNameOrPath = this.getFieldNameOrPath();
            String rhsFieldNameOrPath;
            rhsFieldNameOrPath = that.getFieldNameOrPath();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldNameOrPath", lhsFieldNameOrPath), LocatorUtils.property(thatLocator, "fieldNameOrPath", rhsFieldNameOrPath), lhsFieldNameOrPath, rhsFieldNameOrPath)) {
                return false;
            }
        }
        {
            boolean lhsHidden;
            lhsHidden = (true?this.isHidden():false);
            boolean rhsHidden;
            rhsHidden = (true?that.isHidden():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hidden", lhsHidden), LocatorUtils.property(thatLocator, "hidden", rhsHidden), lhsHidden, rhsHidden)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            boolean lhsSearchable;
            lhsSearchable = (true?this.isSearchable():false);
            boolean rhsSearchable;
            rhsSearchable = (true?that.isSearchable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchable", lhsSearchable), LocatorUtils.property(thatLocator, "searchable", rhsSearchable), lhsSearchable, rhsSearchable)) {
                return false;
            }
        }
        {
            String lhsSelectListItem;
            lhsSelectListItem = this.getSelectListItem();
            String rhsSelectListItem;
            rhsSelectListItem = that.getSelectListItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selectListItem", lhsSelectListItem), LocatorUtils.property(thatLocator, "selectListItem", rhsSelectListItem), lhsSelectListItem, rhsSelectListItem)) {
                return false;
            }
        }
        {
            OrderByDirection lhsSortDirection;
            lhsSortDirection = this.getSortDirection();
            OrderByDirection rhsSortDirection;
            rhsSortDirection = that.getSortDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortDirection", lhsSortDirection), LocatorUtils.property(thatLocator, "sortDirection", rhsSortDirection), lhsSortDirection, rhsSortDirection)) {
                return false;
            }
        }
        {
            Integer lhsSortIndex;
            lhsSortIndex = this.getSortIndex();
            Integer rhsSortIndex;
            rhsSortIndex = that.getSortIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortIndex", lhsSortIndex), LocatorUtils.property(thatLocator, "sortIndex", rhsSortIndex), lhsSortIndex, rhsSortIndex)) {
                return false;
            }
        }
        {
            boolean lhsSortable;
            lhsSortable = (true?this.isSortable():false);
            boolean rhsSortable;
            rhsSortable = (true?that.isSortable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortable", lhsSortable), LocatorUtils.property(thatLocator, "sortable", rhsSortable), lhsSortable, rhsSortable)) {
                return false;
            }
        }
        {
            FieldType lhsType;
            lhsType = this.getType();
            FieldType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
            String theAscendingLabel;
            theAscendingLabel = this.getAscendingLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ascendingLabel", theAscendingLabel), currentHashCode, theAscendingLabel);
        }
        {
            String theDescendingLabel;
            theDescendingLabel = this.getDescendingLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "descendingLabel", theDescendingLabel), currentHashCode, theDescendingLabel);
        }
        {
            String theFieldNameOrPath;
            theFieldNameOrPath = this.getFieldNameOrPath();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldNameOrPath", theFieldNameOrPath), currentHashCode, theFieldNameOrPath);
        }
        {
            boolean theHidden;
            theHidden = (true?this.isHidden():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hidden", theHidden), currentHashCode, theHidden);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            boolean theSearchable;
            theSearchable = (true?this.isSearchable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchable", theSearchable), currentHashCode, theSearchable);
        }
        {
            String theSelectListItem;
            theSelectListItem = this.getSelectListItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selectListItem", theSelectListItem), currentHashCode, theSelectListItem);
        }
        {
            OrderByDirection theSortDirection;
            theSortDirection = this.getSortDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortDirection", theSortDirection), currentHashCode, theSortDirection);
        }
        {
            Integer theSortIndex;
            theSortIndex = this.getSortIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortIndex", theSortIndex), currentHashCode, theSortIndex);
        }
        {
            boolean theSortable;
            theSortable = (true?this.isSortable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortable", theSortable), currentHashCode, theSortable);
        }
        {
            FieldType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
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
            String theAscendingLabel;
            theAscendingLabel = this.getAscendingLabel();
            strategy.appendField(locator, this, "ascendingLabel", buffer, theAscendingLabel);
        }
        {
            String theDescendingLabel;
            theDescendingLabel = this.getDescendingLabel();
            strategy.appendField(locator, this, "descendingLabel", buffer, theDescendingLabel);
        }
        {
            String theFieldNameOrPath;
            theFieldNameOrPath = this.getFieldNameOrPath();
            strategy.appendField(locator, this, "fieldNameOrPath", buffer, theFieldNameOrPath);
        }
        {
            boolean theHidden;
            theHidden = (true?this.isHidden():false);
            strategy.appendField(locator, this, "hidden", buffer, theHidden);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            boolean theSearchable;
            theSearchable = (true?this.isSearchable():false);
            strategy.appendField(locator, this, "searchable", buffer, theSearchable);
        }
        {
            String theSelectListItem;
            theSelectListItem = this.getSelectListItem();
            strategy.appendField(locator, this, "selectListItem", buffer, theSelectListItem);
        }
        {
            OrderByDirection theSortDirection;
            theSortDirection = this.getSortDirection();
            strategy.appendField(locator, this, "sortDirection", buffer, theSortDirection);
        }
        {
            Integer theSortIndex;
            theSortIndex = this.getSortIndex();
            strategy.appendField(locator, this, "sortIndex", buffer, theSortIndex);
        }
        {
            boolean theSortable;
            theSortable = (true?this.isSortable():false);
            strategy.appendField(locator, this, "sortable", buffer, theSortable);
        }
        {
            FieldType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        return buffer;
    }

}
