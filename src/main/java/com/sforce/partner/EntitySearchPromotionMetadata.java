
package com.sforce.partner;

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
 * <p>Java class for EntitySearchPromotionMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitySearchPromotionMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promotedResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitySearchPromotionMetadata", propOrder = {
    "promotedResultCount"
})
public class EntitySearchPromotionMetadata
    implements Equals, HashCode, ToString
{

    protected int promotedResultCount;

    /**
     * Gets the value of the promotedResultCount property.
     * 
     */
    public int getPromotedResultCount() {
        return promotedResultCount;
    }

    /**
     * Sets the value of the promotedResultCount property.
     * 
     */
    public void setPromotedResultCount(int value) {
        this.promotedResultCount = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EntitySearchPromotionMetadata)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EntitySearchPromotionMetadata that = ((EntitySearchPromotionMetadata) object);
        {
            int lhsPromotedResultCount;
            lhsPromotedResultCount = (true?this.getPromotedResultCount(): 0);
            int rhsPromotedResultCount;
            rhsPromotedResultCount = (true?that.getPromotedResultCount(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "promotedResultCount", lhsPromotedResultCount), LocatorUtils.property(thatLocator, "promotedResultCount", rhsPromotedResultCount), lhsPromotedResultCount, rhsPromotedResultCount)) {
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
            int thePromotedResultCount;
            thePromotedResultCount = (true?this.getPromotedResultCount(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "promotedResultCount", thePromotedResultCount), currentHashCode, thePromotedResultCount);
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
            int thePromotedResultCount;
            thePromotedResultCount = (true?this.getPromotedResultCount(): 0);
            strategy.appendField(locator, this, "promotedResultCount", buffer, thePromotedResultCount);
        }
        return buffer;
    }

}
