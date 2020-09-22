
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
 *         &lt;element name="organizationId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="portalId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
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
    "organizationId",
    "portalId"
})
@XmlRootElement(name = "LoginScopeHeader")
public class LoginScopeHeader
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String organizationId;
    protected String portalId;

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the portalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalId() {
        return portalId;
    }

    /**
     * Sets the value of the portalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalId(String value) {
        this.portalId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LoginScopeHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LoginScopeHeader that = ((LoginScopeHeader) object);
        {
            String lhsOrganizationId;
            lhsOrganizationId = this.getOrganizationId();
            String rhsOrganizationId;
            rhsOrganizationId = that.getOrganizationId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationId", lhsOrganizationId), LocatorUtils.property(thatLocator, "organizationId", rhsOrganizationId), lhsOrganizationId, rhsOrganizationId)) {
                return false;
            }
        }
        {
            String lhsPortalId;
            lhsPortalId = this.getPortalId();
            String rhsPortalId;
            rhsPortalId = that.getPortalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portalId", lhsPortalId), LocatorUtils.property(thatLocator, "portalId", rhsPortalId), lhsPortalId, rhsPortalId)) {
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
            String theOrganizationId;
            theOrganizationId = this.getOrganizationId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organizationId", theOrganizationId), currentHashCode, theOrganizationId);
        }
        {
            String thePortalId;
            thePortalId = this.getPortalId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portalId", thePortalId), currentHashCode, thePortalId);
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
            String theOrganizationId;
            theOrganizationId = this.getOrganizationId();
            strategy.appendField(locator, this, "organizationId", buffer, theOrganizationId);
        }
        {
            String thePortalId;
            thePortalId = this.getPortalId();
            strategy.appendField(locator, this, "portalId", buffer, thePortalId);
        }
        return buffer;
    }

}
