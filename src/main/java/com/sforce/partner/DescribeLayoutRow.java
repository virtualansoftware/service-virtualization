
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
 * <p>Java class for DescribeLayoutRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="layoutItems" type="{urn:partner.soap.sforce.com}DescribeLayoutItem" maxOccurs="unbounded"/&gt;
 *         &lt;element name="numItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutRow", propOrder = {
    "layoutItems",
    "numItems"
})
public class DescribeLayoutRow
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<DescribeLayoutItem> layoutItems;
    protected int numItems;

    /**
     * Gets the value of the layoutItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutItem }
     * 
     * 
     */
    public List<DescribeLayoutItem> getLayoutItems() {
        if (layoutItems == null) {
            layoutItems = new ArrayList<DescribeLayoutItem>();
        }
        return this.layoutItems;
    }

    /**
     * Gets the value of the numItems property.
     * 
     */
    public int getNumItems() {
        return numItems;
    }

    /**
     * Sets the value of the numItems property.
     * 
     */
    public void setNumItems(int value) {
        this.numItems = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayoutRow)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayoutRow that = ((DescribeLayoutRow) object);
        {
            List<DescribeLayoutItem> lhsLayoutItems;
            lhsLayoutItems = (((this.layoutItems!= null)&&(!this.layoutItems.isEmpty()))?this.getLayoutItems():null);
            List<DescribeLayoutItem> rhsLayoutItems;
            rhsLayoutItems = (((that.layoutItems!= null)&&(!that.layoutItems.isEmpty()))?that.getLayoutItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutItems", lhsLayoutItems), LocatorUtils.property(thatLocator, "layoutItems", rhsLayoutItems), lhsLayoutItems, rhsLayoutItems)) {
                return false;
            }
        }
        {
            int lhsNumItems;
            lhsNumItems = (true?this.getNumItems(): 0);
            int rhsNumItems;
            rhsNumItems = (true?that.getNumItems(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numItems", lhsNumItems), LocatorUtils.property(thatLocator, "numItems", rhsNumItems), lhsNumItems, rhsNumItems)) {
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
            List<DescribeLayoutItem> theLayoutItems;
            theLayoutItems = (((this.layoutItems!= null)&&(!this.layoutItems.isEmpty()))?this.getLayoutItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layoutItems", theLayoutItems), currentHashCode, theLayoutItems);
        }
        {
            int theNumItems;
            theNumItems = (true?this.getNumItems(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numItems", theNumItems), currentHashCode, theNumItems);
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
            List<DescribeLayoutItem> theLayoutItems;
            theLayoutItems = (((this.layoutItems!= null)&&(!this.layoutItems.isEmpty()))?this.getLayoutItems():null);
            strategy.appendField(locator, this, "layoutItems", buffer, theLayoutItems);
        }
        {
            int theNumItems;
            theNumItems = (true?this.getNumItems(): 0);
            strategy.appendField(locator, this, "numItems", buffer, theNumItems);
        }
        return buffer;
    }

}
