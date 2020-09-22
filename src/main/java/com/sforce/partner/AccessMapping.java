
package com.sforce.partner;

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
 * <p>Java class for AccessMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accessible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessMapping", propOrder = {
    "accessName",
    "accessible"
})
public class AccessMapping
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String accessName;
    protected boolean accessible;

    /**
     * Gets the value of the accessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessName() {
        return accessName;
    }

    /**
     * Sets the value of the accessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessName(String value) {
        this.accessName = value;
    }

    /**
     * Gets the value of the accessible property.
     * 
     */
    public boolean isAccessible() {
        return accessible;
    }

    /**
     * Sets the value of the accessible property.
     * 
     */
    public void setAccessible(boolean value) {
        this.accessible = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AccessMapping)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AccessMapping that = ((AccessMapping) object);
        {
            String lhsAccessName;
            lhsAccessName = this.getAccessName();
            String rhsAccessName;
            rhsAccessName = that.getAccessName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessName", lhsAccessName), LocatorUtils.property(thatLocator, "accessName", rhsAccessName), lhsAccessName, rhsAccessName)) {
                return false;
            }
        }
        {
            boolean lhsAccessible;
            lhsAccessible = (true?this.isAccessible():false);
            boolean rhsAccessible;
            rhsAccessible = (true?that.isAccessible():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessible", lhsAccessible), LocatorUtils.property(thatLocator, "accessible", rhsAccessible), lhsAccessible, rhsAccessible)) {
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
            String theAccessName;
            theAccessName = this.getAccessName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessName", theAccessName), currentHashCode, theAccessName);
        }
        {
            boolean theAccessible;
            theAccessible = (true?this.isAccessible():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessible", theAccessible), currentHashCode, theAccessible);
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
            String theAccessName;
            theAccessName = this.getAccessName();
            strategy.appendField(locator, this, "accessName", buffer, theAccessName);
        }
        {
            boolean theAccessible;
            theAccessible = (true?this.isAccessible():false);
            strategy.appendField(locator, this, "accessible", buffer, theAccessible);
        }
        return buffer;
    }

}
