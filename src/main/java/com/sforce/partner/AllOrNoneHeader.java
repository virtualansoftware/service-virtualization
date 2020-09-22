
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
 *         &lt;element name="allOrNone" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "allOrNone"
})
@XmlRootElement(name = "AllOrNoneHeader")
public class AllOrNoneHeader
    implements Equals, HashCode, ToString
{

    protected boolean allOrNone;

    /**
     * Gets the value of the allOrNone property.
     * 
     */
    public boolean isAllOrNone() {
        return allOrNone;
    }

    /**
     * Sets the value of the allOrNone property.
     * 
     */
    public void setAllOrNone(boolean value) {
        this.allOrNone = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AllOrNoneHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AllOrNoneHeader that = ((AllOrNoneHeader) object);
        {
            boolean lhsAllOrNone;
            lhsAllOrNone = (true?this.isAllOrNone():false);
            boolean rhsAllOrNone;
            rhsAllOrNone = (true?that.isAllOrNone():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allOrNone", lhsAllOrNone), LocatorUtils.property(thatLocator, "allOrNone", rhsAllOrNone), lhsAllOrNone, rhsAllOrNone)) {
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
            boolean theAllOrNone;
            theAllOrNone = (true?this.isAllOrNone():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allOrNone", theAllOrNone), currentHashCode, theAllOrNone);
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
            boolean theAllOrNone;
            theAllOrNone = (true?this.isAllOrNone():false);
            strategy.appendField(locator, this, "allOrNone", buffer, theAllOrNone);
        }
        return buffer;
    }

}
