
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="includeOnlyEntitiesWithTabs" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "includeOnlyEntitiesWithTabs"
})
@XmlRootElement(name = "describeSearchableEntities")
public class DescribeSearchableEntities
    implements Equals, HashCode, ToString
{

    protected boolean includeOnlyEntitiesWithTabs;

    /**
     * Gets the value of the includeOnlyEntitiesWithTabs property.
     * 
     */
    public boolean isIncludeOnlyEntitiesWithTabs() {
        return includeOnlyEntitiesWithTabs;
    }

    /**
     * Sets the value of the includeOnlyEntitiesWithTabs property.
     * 
     */
    public void setIncludeOnlyEntitiesWithTabs(boolean value) {
        this.includeOnlyEntitiesWithTabs = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSearchableEntities)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSearchableEntities that = ((DescribeSearchableEntities) object);
        {
            boolean lhsIncludeOnlyEntitiesWithTabs;
            lhsIncludeOnlyEntitiesWithTabs = (true?this.isIncludeOnlyEntitiesWithTabs():false);
            boolean rhsIncludeOnlyEntitiesWithTabs;
            rhsIncludeOnlyEntitiesWithTabs = (true?that.isIncludeOnlyEntitiesWithTabs():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeOnlyEntitiesWithTabs", lhsIncludeOnlyEntitiesWithTabs), LocatorUtils.property(thatLocator, "includeOnlyEntitiesWithTabs", rhsIncludeOnlyEntitiesWithTabs), lhsIncludeOnlyEntitiesWithTabs, rhsIncludeOnlyEntitiesWithTabs)) {
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
            boolean theIncludeOnlyEntitiesWithTabs;
            theIncludeOnlyEntitiesWithTabs = (true?this.isIncludeOnlyEntitiesWithTabs():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeOnlyEntitiesWithTabs", theIncludeOnlyEntitiesWithTabs), currentHashCode, theIncludeOnlyEntitiesWithTabs);
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
            boolean theIncludeOnlyEntitiesWithTabs;
            theIncludeOnlyEntitiesWithTabs = (true?this.isIncludeOnlyEntitiesWithTabs():false);
            strategy.appendField(locator, this, "includeOnlyEntitiesWithTabs", buffer, theIncludeOnlyEntitiesWithTabs);
        }
        return buffer;
    }

}
