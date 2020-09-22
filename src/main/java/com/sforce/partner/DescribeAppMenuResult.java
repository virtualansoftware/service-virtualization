
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
 * <p>Java class for DescribeAppMenuResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeAppMenuResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appMenuItems" type="{urn:partner.soap.sforce.com}DescribeAppMenuItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeAppMenuResult", propOrder = {
    "appMenuItems"
})
public class DescribeAppMenuResult
    implements Equals, HashCode, ToString
{

    protected List<DescribeAppMenuItem> appMenuItems;

    /**
     * Gets the value of the appMenuItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appMenuItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppMenuItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeAppMenuItem }
     * 
     * 
     */
    public List<DescribeAppMenuItem> getAppMenuItems() {
        if (appMenuItems == null) {
            appMenuItems = new ArrayList<DescribeAppMenuItem>();
        }
        return this.appMenuItems;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeAppMenuResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeAppMenuResult that = ((DescribeAppMenuResult) object);
        {
            List<DescribeAppMenuItem> lhsAppMenuItems;
            lhsAppMenuItems = (((this.appMenuItems!= null)&&(!this.appMenuItems.isEmpty()))?this.getAppMenuItems():null);
            List<DescribeAppMenuItem> rhsAppMenuItems;
            rhsAppMenuItems = (((that.appMenuItems!= null)&&(!that.appMenuItems.isEmpty()))?that.getAppMenuItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appMenuItems", lhsAppMenuItems), LocatorUtils.property(thatLocator, "appMenuItems", rhsAppMenuItems), lhsAppMenuItems, rhsAppMenuItems)) {
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
            List<DescribeAppMenuItem> theAppMenuItems;
            theAppMenuItems = (((this.appMenuItems!= null)&&(!this.appMenuItems.isEmpty()))?this.getAppMenuItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appMenuItems", theAppMenuItems), currentHashCode, theAppMenuItems);
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
            List<DescribeAppMenuItem> theAppMenuItems;
            theAppMenuItems = (((this.appMenuItems!= null)&&(!this.appMenuItems.isEmpty()))?this.getAppMenuItems():null);
            strategy.appendField(locator, this, "appMenuItems", buffer, theAppMenuItems);
        }
        return buffer;
    }

}
