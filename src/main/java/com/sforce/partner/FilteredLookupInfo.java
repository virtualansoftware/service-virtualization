
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for FilteredLookupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilteredLookupInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controllingFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dependent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="optionalFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilteredLookupInfo", propOrder = {
    "controllingFields",
    "dependent",
    "optionalFilter"
})
public class FilteredLookupInfo
    implements Equals, HashCode, ToString
{

    protected List<String> controllingFields;
    protected boolean dependent;
    protected boolean optionalFilter;

    /**
     * Gets the value of the controllingFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controllingFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControllingFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getControllingFields() {
        if (controllingFields == null) {
            controllingFields = new ArrayList<String>();
        }
        return this.controllingFields;
    }

    /**
     * Gets the value of the dependent property.
     * 
     */
    public boolean isDependent() {
        return dependent;
    }

    /**
     * Sets the value of the dependent property.
     * 
     */
    public void setDependent(boolean value) {
        this.dependent = value;
    }

    /**
     * Gets the value of the optionalFilter property.
     * 
     */
    public boolean isOptionalFilter() {
        return optionalFilter;
    }

    /**
     * Sets the value of the optionalFilter property.
     * 
     */
    public void setOptionalFilter(boolean value) {
        this.optionalFilter = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FilteredLookupInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FilteredLookupInfo that = ((FilteredLookupInfo) object);
        {
            List<String> lhsControllingFields;
            lhsControllingFields = (((this.controllingFields!= null)&&(!this.controllingFields.isEmpty()))?this.getControllingFields():null);
            List<String> rhsControllingFields;
            rhsControllingFields = (((that.controllingFields!= null)&&(!that.controllingFields.isEmpty()))?that.getControllingFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "controllingFields", lhsControllingFields), LocatorUtils.property(thatLocator, "controllingFields", rhsControllingFields), lhsControllingFields, rhsControllingFields)) {
                return false;
            }
        }
        {
            boolean lhsDependent;
            lhsDependent = (true?this.isDependent():false);
            boolean rhsDependent;
            rhsDependent = (true?that.isDependent():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dependent", lhsDependent), LocatorUtils.property(thatLocator, "dependent", rhsDependent), lhsDependent, rhsDependent)) {
                return false;
            }
        }
        {
            boolean lhsOptionalFilter;
            lhsOptionalFilter = (true?this.isOptionalFilter():false);
            boolean rhsOptionalFilter;
            rhsOptionalFilter = (true?that.isOptionalFilter():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionalFilter", lhsOptionalFilter), LocatorUtils.property(thatLocator, "optionalFilter", rhsOptionalFilter), lhsOptionalFilter, rhsOptionalFilter)) {
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
            List<String> theControllingFields;
            theControllingFields = (((this.controllingFields!= null)&&(!this.controllingFields.isEmpty()))?this.getControllingFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "controllingFields", theControllingFields), currentHashCode, theControllingFields);
        }
        {
            boolean theDependent;
            theDependent = (true?this.isDependent():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dependent", theDependent), currentHashCode, theDependent);
        }
        {
            boolean theOptionalFilter;
            theOptionalFilter = (true?this.isOptionalFilter():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionalFilter", theOptionalFilter), currentHashCode, theOptionalFilter);
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
            List<String> theControllingFields;
            theControllingFields = (((this.controllingFields!= null)&&(!this.controllingFields.isEmpty()))?this.getControllingFields():null);
            strategy.appendField(locator, this, "controllingFields", buffer, theControllingFields);
        }
        {
            boolean theDependent;
            theDependent = (true?this.isDependent():false);
            strategy.appendField(locator, this, "dependent", buffer, theDependent);
        }
        {
            boolean theOptionalFilter;
            theOptionalFilter = (true?this.isOptionalFilter():false);
            strategy.appendField(locator, this, "optionalFilter", buffer, theOptionalFilter);
        }
        return buffer;
    }

}
