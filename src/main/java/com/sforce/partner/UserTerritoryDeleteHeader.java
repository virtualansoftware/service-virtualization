
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="transferToUserId" type="{urn:partner.soap.sforce.com}ID"/&gt;
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
    "transferToUserId"
})
@XmlRootElement(name = "UserTerritoryDeleteHeader")
public class UserTerritoryDeleteHeader
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String transferToUserId;

    /**
     * Gets the value of the transferToUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToUserId() {
        return transferToUserId;
    }

    /**
     * Sets the value of the transferToUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToUserId(String value) {
        this.transferToUserId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UserTerritoryDeleteHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UserTerritoryDeleteHeader that = ((UserTerritoryDeleteHeader) object);
        {
            String lhsTransferToUserId;
            lhsTransferToUserId = this.getTransferToUserId();
            String rhsTransferToUserId;
            rhsTransferToUserId = that.getTransferToUserId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferToUserId", lhsTransferToUserId), LocatorUtils.property(thatLocator, "transferToUserId", rhsTransferToUserId), lhsTransferToUserId, rhsTransferToUserId)) {
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
            String theTransferToUserId;
            theTransferToUserId = this.getTransferToUserId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferToUserId", theTransferToUserId), currentHashCode, theTransferToUserId);
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
            String theTransferToUserId;
            theTransferToUserId = this.getTransferToUserId();
            strategy.appendField(locator, this, "transferToUserId", buffer, theTransferToUserId);
        }
        return buffer;
    }

}
