
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
 * <p>Java class for SearchLayoutFieldsDisplayed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchLayoutFieldsDisplayed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fields" type="{urn:partner.soap.sforce.com}SearchLayoutField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLayoutFieldsDisplayed", propOrder = {
    "applicable",
    "fields"
})
public class SearchLayoutFieldsDisplayed
    implements Equals, HashCode, ToString
{

    protected boolean applicable;
    protected List<SearchLayoutField> fields;

    /**
     * Gets the value of the applicable property.
     * 
     */
    public boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     */
    public void setApplicable(boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchLayoutField }
     * 
     * 
     */
    public List<SearchLayoutField> getFields() {
        if (fields == null) {
            fields = new ArrayList<SearchLayoutField>();
        }
        return this.fields;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchLayoutFieldsDisplayed)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchLayoutFieldsDisplayed that = ((SearchLayoutFieldsDisplayed) object);
        {
            boolean lhsApplicable;
            lhsApplicable = (true?this.isApplicable():false);
            boolean rhsApplicable;
            rhsApplicable = (true?that.isApplicable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicable", lhsApplicable), LocatorUtils.property(thatLocator, "applicable", rhsApplicable), lhsApplicable, rhsApplicable)) {
                return false;
            }
        }
        {
            List<SearchLayoutField> lhsFields;
            lhsFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            List<SearchLayoutField> rhsFields;
            rhsFields = (((that.fields!= null)&&(!that.fields.isEmpty()))?that.getFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields)) {
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
            boolean theApplicable;
            theApplicable = (true?this.isApplicable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicable", theApplicable), currentHashCode, theApplicable);
        }
        {
            List<SearchLayoutField> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fields", theFields), currentHashCode, theFields);
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
            boolean theApplicable;
            theApplicable = (true?this.isApplicable():false);
            strategy.appendField(locator, this, "applicable", buffer, theApplicable);
        }
        {
            List<SearchLayoutField> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            strategy.appendField(locator, this, "fields", buffer, theFields);
        }
        return buffer;
    }

}
