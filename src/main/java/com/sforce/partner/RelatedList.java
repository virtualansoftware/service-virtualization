
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
 * <p>Java class for RelatedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessLevelRequiredForCreate" type="{urn:partner.soap.sforce.com}ShareAccessLevel"/&gt;
 *         &lt;element name="buttons" type="{urn:partner.soap.sforce.com}DescribeLayoutButton" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="columns" type="{urn:partner.soap.sforce.com}RelatedListColumn" maxOccurs="unbounded"/&gt;
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="limitRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sobject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sort" type="{urn:partner.soap.sforce.com}RelatedListSort" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedList", propOrder = {
    "accessLevelRequiredForCreate",
    "buttons",
    "columns",
    "custom",
    "field",
    "label",
    "limitRows",
    "name",
    "sobject",
    "sorts"
})
public class RelatedList
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ShareAccessLevel accessLevelRequiredForCreate;
    @XmlElement(nillable = true)
    protected List<DescribeLayoutButton> buttons;
    @XmlElement(required = true)
    protected List<RelatedListColumn> columns;
    protected boolean custom;
    @XmlElement(required = true, nillable = true)
    protected String field;
    @XmlElement(required = true)
    protected String label;
    protected int limitRows;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String sobject;
    @XmlElement(name = "sort")
    protected List<RelatedListSort> sorts;

    /**
     * Gets the value of the accessLevelRequiredForCreate property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevel }
     *     
     */
    public ShareAccessLevel getAccessLevelRequiredForCreate() {
        return accessLevelRequiredForCreate;
    }

    /**
     * Sets the value of the accessLevelRequiredForCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevel }
     *     
     */
    public void setAccessLevelRequiredForCreate(ShareAccessLevel value) {
        this.accessLevelRequiredForCreate = value;
    }

    /**
     * Gets the value of the buttons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutButton }
     * 
     * 
     */
    public List<DescribeLayoutButton> getButtons() {
        if (buttons == null) {
            buttons = new ArrayList<DescribeLayoutButton>();
        }
        return this.buttons;
    }

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
     * {@link RelatedListColumn }
     * 
     * 
     */
    public List<RelatedListColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<RelatedListColumn>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
    }

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
     * Gets the value of the sobject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobject() {
        return sobject;
    }

    /**
     * Sets the value of the sobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobject(String value) {
        this.sobject = value;
    }

    /**
     * Gets the value of the sorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedListSort }
     * 
     * 
     */
    public List<RelatedListSort> getSorts() {
        if (sorts == null) {
            sorts = new ArrayList<RelatedListSort>();
        }
        return this.sorts;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RelatedList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RelatedList that = ((RelatedList) object);
        {
            ShareAccessLevel lhsAccessLevelRequiredForCreate;
            lhsAccessLevelRequiredForCreate = this.getAccessLevelRequiredForCreate();
            ShareAccessLevel rhsAccessLevelRequiredForCreate;
            rhsAccessLevelRequiredForCreate = that.getAccessLevelRequiredForCreate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessLevelRequiredForCreate", lhsAccessLevelRequiredForCreate), LocatorUtils.property(thatLocator, "accessLevelRequiredForCreate", rhsAccessLevelRequiredForCreate), lhsAccessLevelRequiredForCreate, rhsAccessLevelRequiredForCreate)) {
                return false;
            }
        }
        {
            List<DescribeLayoutButton> lhsButtons;
            lhsButtons = (((this.buttons!= null)&&(!this.buttons.isEmpty()))?this.getButtons():null);
            List<DescribeLayoutButton> rhsButtons;
            rhsButtons = (((that.buttons!= null)&&(!that.buttons.isEmpty()))?that.getButtons():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buttons", lhsButtons), LocatorUtils.property(thatLocator, "buttons", rhsButtons), lhsButtons, rhsButtons)) {
                return false;
            }
        }
        {
            List<RelatedListColumn> lhsColumns;
            lhsColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            List<RelatedListColumn> rhsColumns;
            rhsColumns = (((that.columns!= null)&&(!that.columns.isEmpty()))?that.getColumns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columns", lhsColumns), LocatorUtils.property(thatLocator, "columns", rhsColumns), lhsColumns, rhsColumns)) {
                return false;
            }
        }
        {
            boolean lhsCustom;
            lhsCustom = (true?this.isCustom():false);
            boolean rhsCustom;
            rhsCustom = (true?that.isCustom():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "custom", lhsCustom), LocatorUtils.property(thatLocator, "custom", rhsCustom), lhsCustom, rhsCustom)) {
                return false;
            }
        }
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
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsSobject;
            lhsSobject = this.getSobject();
            String rhsSobject;
            rhsSobject = that.getSobject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobject", lhsSobject), LocatorUtils.property(thatLocator, "sobject", rhsSobject), lhsSobject, rhsSobject)) {
                return false;
            }
        }
        {
            List<RelatedListSort> lhsSorts;
            lhsSorts = (((this.sorts!= null)&&(!this.sorts.isEmpty()))?this.getSorts():null);
            List<RelatedListSort> rhsSorts;
            rhsSorts = (((that.sorts!= null)&&(!that.sorts.isEmpty()))?that.getSorts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sorts", lhsSorts), LocatorUtils.property(thatLocator, "sorts", rhsSorts), lhsSorts, rhsSorts)) {
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
            ShareAccessLevel theAccessLevelRequiredForCreate;
            theAccessLevelRequiredForCreate = this.getAccessLevelRequiredForCreate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessLevelRequiredForCreate", theAccessLevelRequiredForCreate), currentHashCode, theAccessLevelRequiredForCreate);
        }
        {
            List<DescribeLayoutButton> theButtons;
            theButtons = (((this.buttons!= null)&&(!this.buttons.isEmpty()))?this.getButtons():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buttons", theButtons), currentHashCode, theButtons);
        }
        {
            List<RelatedListColumn> theColumns;
            theColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columns", theColumns), currentHashCode, theColumns);
        }
        {
            boolean theCustom;
            theCustom = (true?this.isCustom():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "custom", theCustom), currentHashCode, theCustom);
        }
        {
            String theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            int theLimitRows;
            theLimitRows = (true?this.getLimitRows(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limitRows", theLimitRows), currentHashCode, theLimitRows);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theSobject;
            theSobject = this.getSobject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobject", theSobject), currentHashCode, theSobject);
        }
        {
            List<RelatedListSort> theSorts;
            theSorts = (((this.sorts!= null)&&(!this.sorts.isEmpty()))?this.getSorts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sorts", theSorts), currentHashCode, theSorts);
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
            ShareAccessLevel theAccessLevelRequiredForCreate;
            theAccessLevelRequiredForCreate = this.getAccessLevelRequiredForCreate();
            strategy.appendField(locator, this, "accessLevelRequiredForCreate", buffer, theAccessLevelRequiredForCreate);
        }
        {
            List<DescribeLayoutButton> theButtons;
            theButtons = (((this.buttons!= null)&&(!this.buttons.isEmpty()))?this.getButtons():null);
            strategy.appendField(locator, this, "buttons", buffer, theButtons);
        }
        {
            List<RelatedListColumn> theColumns;
            theColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            strategy.appendField(locator, this, "columns", buffer, theColumns);
        }
        {
            boolean theCustom;
            theCustom = (true?this.isCustom():false);
            strategy.appendField(locator, this, "custom", buffer, theCustom);
        }
        {
            String theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            int theLimitRows;
            theLimitRows = (true?this.getLimitRows(): 0);
            strategy.appendField(locator, this, "limitRows", buffer, theLimitRows);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theSobject;
            theSobject = this.getSobject();
            strategy.appendField(locator, this, "sobject", buffer, theSobject);
        }
        {
            List<RelatedListSort> theSorts;
            theSorts = (((this.sorts!= null)&&(!this.sorts.isEmpty()))?this.getSorts():null);
            strategy.appendField(locator, this, "sorts", buffer, theSorts);
        }
        return buffer;
    }

}
