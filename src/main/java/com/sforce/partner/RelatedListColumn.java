
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
 * <p>Java class for RelatedListColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedListColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fieldApiName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sortable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedListColumn", propOrder = {
    "field",
    "fieldApiName",
    "format",
    "label",
    "lookupId",
    "name",
    "sortable"
})
public class RelatedListColumn
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String field;
    @XmlElement(required = true)
    protected String fieldApiName;
    @XmlElement(required = true, nillable = true)
    protected String format;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(nillable = true)
    protected String lookupId;
    @XmlElement(required = true)
    protected String name;
    protected boolean sortable;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the fieldApiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldApiName() {
        return fieldApiName;
    }

    /**
     * Sets the value of the fieldApiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldApiName(String value) {
        this.fieldApiName = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
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
     * Gets the value of the lookupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupId() {
        return lookupId;
    }

    /**
     * Sets the value of the lookupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupId(String value) {
        this.lookupId = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RelatedListColumn)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RelatedListColumn that = ((RelatedListColumn) object);
        {
            String lhsField;
            lhsField = this.getField();
            String rhsField;
            rhsField = that.getField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
                return false;
            }
        }
        {
            String lhsFieldApiName;
            lhsFieldApiName = this.getFieldApiName();
            String rhsFieldApiName;
            rhsFieldApiName = that.getFieldApiName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldApiName", lhsFieldApiName), LocatorUtils.property(thatLocator, "fieldApiName", rhsFieldApiName), lhsFieldApiName, rhsFieldApiName)) {
                return false;
            }
        }
        {
            String lhsFormat;
            lhsFormat = this.getFormat();
            String rhsFormat;
            rhsFormat = that.getFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "format", lhsFormat), LocatorUtils.property(thatLocator, "format", rhsFormat), lhsFormat, rhsFormat)) {
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
            String lhsLookupId;
            lhsLookupId = this.getLookupId();
            String rhsLookupId;
            rhsLookupId = that.getLookupId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lookupId", lhsLookupId), LocatorUtils.property(thatLocator, "lookupId", rhsLookupId), lhsLookupId, rhsLookupId)) {
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
            boolean lhsSortable;
            lhsSortable = (true?this.isSortable():false);
            boolean rhsSortable;
            rhsSortable = (true?that.isSortable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortable", lhsSortable), LocatorUtils.property(thatLocator, "sortable", rhsSortable), lhsSortable, rhsSortable)) {
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
            String theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        {
            String theFieldApiName;
            theFieldApiName = this.getFieldApiName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldApiName", theFieldApiName), currentHashCode, theFieldApiName);
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "format", theFormat), currentHashCode, theFormat);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theLookupId;
            theLookupId = this.getLookupId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lookupId", theLookupId), currentHashCode, theLookupId);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            boolean theSortable;
            theSortable = (true?this.isSortable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortable", theSortable), currentHashCode, theSortable);
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
            String theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            String theFieldApiName;
            theFieldApiName = this.getFieldApiName();
            strategy.appendField(locator, this, "fieldApiName", buffer, theFieldApiName);
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            strategy.appendField(locator, this, "format", buffer, theFormat);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theLookupId;
            theLookupId = this.getLookupId();
            strategy.appendField(locator, this, "lookupId", buffer, theLookupId);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            boolean theSortable;
            theSortable = (true?this.isSortable():false);
            strategy.appendField(locator, this, "sortable", buffer, theSortable);
        }
        return buffer;
    }

}
