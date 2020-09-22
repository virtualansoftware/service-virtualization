
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
 * <p>Java class for DescribeQuickActionListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeQuickActionListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quickActionListItems" type="{urn:partner.soap.sforce.com}DescribeQuickActionListItemResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeQuickActionListResult", propOrder = {
    "quickActionListItems"
})
public class DescribeQuickActionListResult
    implements Equals, HashCode, ToString
{

    protected List<DescribeQuickActionListItemResult> quickActionListItems;

    /**
     * Gets the value of the quickActionListItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickActionListItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickActionListItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeQuickActionListItemResult }
     * 
     * 
     */
    public List<DescribeQuickActionListItemResult> getQuickActionListItems() {
        if (quickActionListItems == null) {
            quickActionListItems = new ArrayList<DescribeQuickActionListItemResult>();
        }
        return this.quickActionListItems;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeQuickActionListResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeQuickActionListResult that = ((DescribeQuickActionListResult) object);
        {
            List<DescribeQuickActionListItemResult> lhsQuickActionListItems;
            lhsQuickActionListItems = (((this.quickActionListItems!= null)&&(!this.quickActionListItems.isEmpty()))?this.getQuickActionListItems():null);
            List<DescribeQuickActionListItemResult> rhsQuickActionListItems;
            rhsQuickActionListItems = (((that.quickActionListItems!= null)&&(!that.quickActionListItems.isEmpty()))?that.getQuickActionListItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quickActionListItems", lhsQuickActionListItems), LocatorUtils.property(thatLocator, "quickActionListItems", rhsQuickActionListItems), lhsQuickActionListItems, rhsQuickActionListItems)) {
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
            List<DescribeQuickActionListItemResult> theQuickActionListItems;
            theQuickActionListItems = (((this.quickActionListItems!= null)&&(!this.quickActionListItems.isEmpty()))?this.getQuickActionListItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quickActionListItems", theQuickActionListItems), currentHashCode, theQuickActionListItems);
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
            List<DescribeQuickActionListItemResult> theQuickActionListItems;
            theQuickActionListItems = (((this.quickActionListItems!= null)&&(!this.quickActionListItems.isEmpty()))?this.getQuickActionListItems():null);
            strategy.appendField(locator, this, "quickActionListItems", buffer, theQuickActionListItems);
        }
        return buffer;
    }

}
