
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
 *         &lt;element name="updateMru" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "updateMru"
})
@XmlRootElement(name = "MruHeader")
public class MruHeader
    implements Equals, HashCode, ToString
{

    protected boolean updateMru;

    /**
     * Gets the value of the updateMru property.
     * 
     */
    public boolean isUpdateMru() {
        return updateMru;
    }

    /**
     * Sets the value of the updateMru property.
     * 
     */
    public void setUpdateMru(boolean value) {
        this.updateMru = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MruHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MruHeader that = ((MruHeader) object);
        {
            boolean lhsUpdateMru;
            lhsUpdateMru = (true?this.isUpdateMru():false);
            boolean rhsUpdateMru;
            rhsUpdateMru = (true?that.isUpdateMru():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateMru", lhsUpdateMru), LocatorUtils.property(thatLocator, "updateMru", rhsUpdateMru), lhsUpdateMru, rhsUpdateMru)) {
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
            boolean theUpdateMru;
            theUpdateMru = (true?this.isUpdateMru():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateMru", theUpdateMru), currentHashCode, theUpdateMru);
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
            boolean theUpdateMru;
            theUpdateMru = (true?this.isUpdateMru():false);
            strategy.appendField(locator, this, "updateMru", buffer, theUpdateMru);
        }
        return buffer;
    }

}
