
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
 *         &lt;element name="oldPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "oldPassword",
    "newPassword"
})
@XmlRootElement(name = "changeOwnPassword")
public class ChangeOwnPassword
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String oldPassword;
    @XmlElement(required = true)
    protected String newPassword;

    /**
     * Gets the value of the oldPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Sets the value of the oldPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPassword(String value) {
        this.oldPassword = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ChangeOwnPassword)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ChangeOwnPassword that = ((ChangeOwnPassword) object);
        {
            String lhsOldPassword;
            lhsOldPassword = this.getOldPassword();
            String rhsOldPassword;
            rhsOldPassword = that.getOldPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oldPassword", lhsOldPassword), LocatorUtils.property(thatLocator, "oldPassword", rhsOldPassword), lhsOldPassword, rhsOldPassword)) {
                return false;
            }
        }
        {
            String lhsNewPassword;
            lhsNewPassword = this.getNewPassword();
            String rhsNewPassword;
            rhsNewPassword = that.getNewPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newPassword", lhsNewPassword), LocatorUtils.property(thatLocator, "newPassword", rhsNewPassword), lhsNewPassword, rhsNewPassword)) {
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
            String theOldPassword;
            theOldPassword = this.getOldPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oldPassword", theOldPassword), currentHashCode, theOldPassword);
        }
        {
            String theNewPassword;
            theNewPassword = this.getNewPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newPassword", theNewPassword), currentHashCode, theNewPassword);
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
            String theOldPassword;
            theOldPassword = this.getOldPassword();
            strategy.appendField(locator, this, "oldPassword", buffer, theOldPassword);
        }
        {
            String theNewPassword;
            theNewPassword = this.getNewPassword();
            strategy.appendField(locator, this, "newPassword", buffer, theNewPassword);
        }
        return buffer;
    }

}
