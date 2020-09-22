
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
 *         &lt;element name="AddCampaignMemberOptions" type="{urn:partner.soap.sforce.com}AddCampaignMemberOptions"/&gt;
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
    "addCampaignMemberOptions"
})
@XmlRootElement(name = "addCampaignMember")
public class AddCampaignMember
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "AddCampaignMemberOptions", required = true)
    protected AddCampaignMemberOptions addCampaignMemberOptions;

    /**
     * Gets the value of the addCampaignMemberOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AddCampaignMemberOptions }
     *     
     */
    public AddCampaignMemberOptions getAddCampaignMemberOptions() {
        return addCampaignMemberOptions;
    }

    /**
     * Sets the value of the addCampaignMemberOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddCampaignMemberOptions }
     *     
     */
    public void setAddCampaignMemberOptions(AddCampaignMemberOptions value) {
        this.addCampaignMemberOptions = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AddCampaignMember)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AddCampaignMember that = ((AddCampaignMember) object);
        {
            AddCampaignMemberOptions lhsAddCampaignMemberOptions;
            lhsAddCampaignMemberOptions = this.getAddCampaignMemberOptions();
            AddCampaignMemberOptions rhsAddCampaignMemberOptions;
            rhsAddCampaignMemberOptions = that.getAddCampaignMemberOptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addCampaignMemberOptions", lhsAddCampaignMemberOptions), LocatorUtils.property(thatLocator, "addCampaignMemberOptions", rhsAddCampaignMemberOptions), lhsAddCampaignMemberOptions, rhsAddCampaignMemberOptions)) {
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
            AddCampaignMemberOptions theAddCampaignMemberOptions;
            theAddCampaignMemberOptions = this.getAddCampaignMemberOptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addCampaignMemberOptions", theAddCampaignMemberOptions), currentHashCode, theAddCampaignMemberOptions);
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
            AddCampaignMemberOptions theAddCampaignMemberOptions;
            theAddCampaignMemberOptions = this.getAddCampaignMemberOptions();
            strategy.appendField(locator, this, "addCampaignMemberOptions", buffer, theAddCampaignMemberOptions);
        }
        return buffer;
    }

}
