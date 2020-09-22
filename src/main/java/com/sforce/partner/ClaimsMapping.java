
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
 * <p>Java class for ClaimsMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimsMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="claimValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimsMapping", propOrder = {
    "claimKey",
    "claimValue"
})
public class ClaimsMapping
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String claimKey;
    @XmlElement(required = true)
    protected String claimValue;

    /**
     * Gets the value of the claimKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimKey() {
        return claimKey;
    }

    /**
     * Sets the value of the claimKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimKey(String value) {
        this.claimKey = value;
    }

    /**
     * Gets the value of the claimValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimValue() {
        return claimValue;
    }

    /**
     * Sets the value of the claimValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimValue(String value) {
        this.claimValue = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClaimsMapping)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClaimsMapping that = ((ClaimsMapping) object);
        {
            String lhsClaimKey;
            lhsClaimKey = this.getClaimKey();
            String rhsClaimKey;
            rhsClaimKey = that.getClaimKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claimKey", lhsClaimKey), LocatorUtils.property(thatLocator, "claimKey", rhsClaimKey), lhsClaimKey, rhsClaimKey)) {
                return false;
            }
        }
        {
            String lhsClaimValue;
            lhsClaimValue = this.getClaimValue();
            String rhsClaimValue;
            rhsClaimValue = that.getClaimValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claimValue", lhsClaimValue), LocatorUtils.property(thatLocator, "claimValue", rhsClaimValue), lhsClaimValue, rhsClaimValue)) {
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
            String theClaimKey;
            theClaimKey = this.getClaimKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimKey", theClaimKey), currentHashCode, theClaimKey);
        }
        {
            String theClaimValue;
            theClaimValue = this.getClaimValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimValue", theClaimValue), currentHashCode, theClaimValue);
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
            String theClaimKey;
            theClaimKey = this.getClaimKey();
            strategy.appendField(locator, this, "claimKey", buffer, theClaimKey);
        }
        {
            String theClaimValue;
            theClaimValue = this.getClaimValue();
            strategy.appendField(locator, this, "claimValue", buffer, theClaimValue);
        }
        return buffer;
    }

}
