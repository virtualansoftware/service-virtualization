
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
 *         &lt;element name="includeRealTimeEntities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "includeRealTimeEntities"
})
@XmlRootElement(name = "describeSearchScopeOrder")
public class DescribeSearchScopeOrder
    implements Equals, HashCode, ToString
{

    protected Boolean includeRealTimeEntities;

    /**
     * Gets the value of the includeRealTimeEntities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRealTimeEntities() {
        return includeRealTimeEntities;
    }

    /**
     * Sets the value of the includeRealTimeEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRealTimeEntities(Boolean value) {
        this.includeRealTimeEntities = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSearchScopeOrder)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSearchScopeOrder that = ((DescribeSearchScopeOrder) object);
        {
            Boolean lhsIncludeRealTimeEntities;
            lhsIncludeRealTimeEntities = this.isIncludeRealTimeEntities();
            Boolean rhsIncludeRealTimeEntities;
            rhsIncludeRealTimeEntities = that.isIncludeRealTimeEntities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeRealTimeEntities", lhsIncludeRealTimeEntities), LocatorUtils.property(thatLocator, "includeRealTimeEntities", rhsIncludeRealTimeEntities), lhsIncludeRealTimeEntities, rhsIncludeRealTimeEntities)) {
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
            Boolean theIncludeRealTimeEntities;
            theIncludeRealTimeEntities = this.isIncludeRealTimeEntities();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeRealTimeEntities", theIncludeRealTimeEntities), currentHashCode, theIncludeRealTimeEntities);
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
            Boolean theIncludeRealTimeEntities;
            theIncludeRealTimeEntities = this.isIncludeRealTimeEntities();
            strategy.appendField(locator, this, "includeRealTimeEntities", buffer, theIncludeRealTimeEntities);
        }
        return buffer;
    }

}
