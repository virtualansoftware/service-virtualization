
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for EmailSyncRoutingAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailSyncRoutingAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fromAddressFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailSyncRoutingAddress", propOrder = {
    "emailAddress",
    "fromAddressFilters",
    "name"
})
public class EmailSyncRoutingAddress
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String emailAddress;
    @XmlElement(name = "fromAddressFilter")
    protected List<String> fromAddressFilters;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the fromAddressFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromAddressFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromAddressFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFromAddressFilters() {
        if (fromAddressFilters == null) {
            fromAddressFilters = new ArrayList<String>();
        }
        return this.fromAddressFilters;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EmailSyncRoutingAddress)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EmailSyncRoutingAddress that = ((EmailSyncRoutingAddress) object);
        {
            String lhsEmailAddress;
            lhsEmailAddress = this.getEmailAddress();
            String rhsEmailAddress;
            rhsEmailAddress = that.getEmailAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailAddress", lhsEmailAddress), LocatorUtils.property(thatLocator, "emailAddress", rhsEmailAddress), lhsEmailAddress, rhsEmailAddress)) {
                return false;
            }
        }
        {
            List<String> lhsFromAddressFilters;
            lhsFromAddressFilters = (((this.fromAddressFilters!= null)&&(!this.fromAddressFilters.isEmpty()))?this.getFromAddressFilters():null);
            List<String> rhsFromAddressFilters;
            rhsFromAddressFilters = (((that.fromAddressFilters!= null)&&(!that.fromAddressFilters.isEmpty()))?that.getFromAddressFilters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromAddressFilters", lhsFromAddressFilters), LocatorUtils.property(thatLocator, "fromAddressFilters", rhsFromAddressFilters), lhsFromAddressFilters, rhsFromAddressFilters)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            String theEmailAddress;
            theEmailAddress = this.getEmailAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emailAddress", theEmailAddress), currentHashCode, theEmailAddress);
        }
        {
            List<String> theFromAddressFilters;
            theFromAddressFilters = (((this.fromAddressFilters!= null)&&(!this.fromAddressFilters.isEmpty()))?this.getFromAddressFilters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromAddressFilters", theFromAddressFilters), currentHashCode, theFromAddressFilters);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
            String theEmailAddress;
            theEmailAddress = this.getEmailAddress();
            strategy.appendField(locator, this, "emailAddress", buffer, theEmailAddress);
        }
        {
            List<String> theFromAddressFilters;
            theFromAddressFilters = (((this.fromAddressFilters!= null)&&(!this.fromAddressFilters.isEmpty()))?this.getFromAddressFilters():null);
            strategy.appendField(locator, this, "fromAddressFilters", buffer, theFromAddressFilters);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        return buffer;
    }

}
