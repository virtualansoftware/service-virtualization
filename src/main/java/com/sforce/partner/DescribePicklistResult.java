
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
 * <p>Java class for DescribePicklistResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribePicklistResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultValue" type="{urn:partner.soap.sforce.com}PicklistEntry"/&gt;
 *         &lt;element name="multiSelectable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="picklistValues" type="{urn:partner.soap.sforce.com}PicklistEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribePicklistResult", propOrder = {
    "defaultValue",
    "multiSelectable",
    "picklistValues"
})
public class DescribePicklistResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected PicklistEntry defaultValue;
    protected boolean multiSelectable;
    protected List<PicklistEntry> picklistValues;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistEntry }
     *     
     */
    public PicklistEntry getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistEntry }
     *     
     */
    public void setDefaultValue(PicklistEntry value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the multiSelectable property.
     * 
     */
    public boolean isMultiSelectable() {
        return multiSelectable;
    }

    /**
     * Sets the value of the multiSelectable property.
     * 
     */
    public void setMultiSelectable(boolean value) {
        this.multiSelectable = value;
    }

    /**
     * Gets the value of the picklistValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picklistValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicklistValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistEntry }
     * 
     * 
     */
    public List<PicklistEntry> getPicklistValues() {
        if (picklistValues == null) {
            picklistValues = new ArrayList<PicklistEntry>();
        }
        return this.picklistValues;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribePicklistResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribePicklistResult that = ((DescribePicklistResult) object);
        {
            PicklistEntry lhsDefaultValue;
            lhsDefaultValue = this.getDefaultValue();
            PicklistEntry rhsDefaultValue;
            rhsDefaultValue = that.getDefaultValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultValue", lhsDefaultValue), LocatorUtils.property(thatLocator, "defaultValue", rhsDefaultValue), lhsDefaultValue, rhsDefaultValue)) {
                return false;
            }
        }
        {
            boolean lhsMultiSelectable;
            lhsMultiSelectable = (true?this.isMultiSelectable():false);
            boolean rhsMultiSelectable;
            rhsMultiSelectable = (true?that.isMultiSelectable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiSelectable", lhsMultiSelectable), LocatorUtils.property(thatLocator, "multiSelectable", rhsMultiSelectable), lhsMultiSelectable, rhsMultiSelectable)) {
                return false;
            }
        }
        {
            List<PicklistEntry> lhsPicklistValues;
            lhsPicklistValues = (((this.picklistValues!= null)&&(!this.picklistValues.isEmpty()))?this.getPicklistValues():null);
            List<PicklistEntry> rhsPicklistValues;
            rhsPicklistValues = (((that.picklistValues!= null)&&(!that.picklistValues.isEmpty()))?that.getPicklistValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picklistValues", lhsPicklistValues), LocatorUtils.property(thatLocator, "picklistValues", rhsPicklistValues), lhsPicklistValues, rhsPicklistValues)) {
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
            PicklistEntry theDefaultValue;
            theDefaultValue = this.getDefaultValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultValue", theDefaultValue), currentHashCode, theDefaultValue);
        }
        {
            boolean theMultiSelectable;
            theMultiSelectable = (true?this.isMultiSelectable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiSelectable", theMultiSelectable), currentHashCode, theMultiSelectable);
        }
        {
            List<PicklistEntry> thePicklistValues;
            thePicklistValues = (((this.picklistValues!= null)&&(!this.picklistValues.isEmpty()))?this.getPicklistValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistValues", thePicklistValues), currentHashCode, thePicklistValues);
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
            PicklistEntry theDefaultValue;
            theDefaultValue = this.getDefaultValue();
            strategy.appendField(locator, this, "defaultValue", buffer, theDefaultValue);
        }
        {
            boolean theMultiSelectable;
            theMultiSelectable = (true?this.isMultiSelectable():false);
            strategy.appendField(locator, this, "multiSelectable", buffer, theMultiSelectable);
        }
        {
            List<PicklistEntry> thePicklistValues;
            thePicklistValues = (((this.picklistValues!= null)&&(!this.picklistValues.isEmpty()))?this.getPicklistValues():null);
            strategy.appendField(locator, this, "picklistValues", buffer, thePicklistValues);
        }
        return buffer;
    }

}
