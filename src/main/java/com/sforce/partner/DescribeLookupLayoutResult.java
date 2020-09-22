
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
 * <p>Java class for DescribeLookupLayoutResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLookupLayoutResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="limitRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lookupColumns" type="{urn:partner.soap.sforce.com}DescribeColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLookupLayoutResult", propOrder = {
    "label",
    "limitRows",
    "lookupColumns"
})
public class DescribeLookupLayoutResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String label;
    protected int limitRows;
    protected List<DescribeColumn> lookupColumns;

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
     * Gets the value of the lookupColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookupColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeColumn }
     * 
     * 
     */
    public List<DescribeColumn> getLookupColumns() {
        if (lookupColumns == null) {
            lookupColumns = new ArrayList<DescribeColumn>();
        }
        return this.lookupColumns;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLookupLayoutResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLookupLayoutResult that = ((DescribeLookupLayoutResult) object);
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
            List<DescribeColumn> lhsLookupColumns;
            lhsLookupColumns = (((this.lookupColumns!= null)&&(!this.lookupColumns.isEmpty()))?this.getLookupColumns():null);
            List<DescribeColumn> rhsLookupColumns;
            rhsLookupColumns = (((that.lookupColumns!= null)&&(!that.lookupColumns.isEmpty()))?that.getLookupColumns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lookupColumns", lhsLookupColumns), LocatorUtils.property(thatLocator, "lookupColumns", rhsLookupColumns), lhsLookupColumns, rhsLookupColumns)) {
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
            List<DescribeColumn> theLookupColumns;
            theLookupColumns = (((this.lookupColumns!= null)&&(!this.lookupColumns.isEmpty()))?this.getLookupColumns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lookupColumns", theLookupColumns), currentHashCode, theLookupColumns);
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
            List<DescribeColumn> theLookupColumns;
            theLookupColumns = (((this.lookupColumns!= null)&&(!this.lookupColumns.isEmpty()))?this.getLookupColumns():null);
            strategy.appendField(locator, this, "lookupColumns", buffer, theLookupColumns);
        }
        return buffer;
    }

}
