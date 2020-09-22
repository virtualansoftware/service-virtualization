
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="appMenuType" type="{urn:partner.soap.sforce.com}AppMenuType"/&gt;
 *         &lt;element name="networkId" type="{urn:partner.soap.sforce.com}ID"/&gt;
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
    "appMenuType",
    "networkId"
})
@XmlRootElement(name = "describeAppMenu")
public class DescribeAppMenu
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AppMenuType appMenuType;
    @XmlElement(required = true, nillable = true)
    protected String networkId;

    /**
     * Gets the value of the appMenuType property.
     * 
     * @return
     *     possible object is
     *     {@link AppMenuType }
     *     
     */
    public AppMenuType getAppMenuType() {
        return appMenuType;
    }

    /**
     * Sets the value of the appMenuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppMenuType }
     *     
     */
    public void setAppMenuType(AppMenuType value) {
        this.appMenuType = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeAppMenu)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeAppMenu that = ((DescribeAppMenu) object);
        {
            AppMenuType lhsAppMenuType;
            lhsAppMenuType = this.getAppMenuType();
            AppMenuType rhsAppMenuType;
            rhsAppMenuType = that.getAppMenuType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appMenuType", lhsAppMenuType), LocatorUtils.property(thatLocator, "appMenuType", rhsAppMenuType), lhsAppMenuType, rhsAppMenuType)) {
                return false;
            }
        }
        {
            String lhsNetworkId;
            lhsNetworkId = this.getNetworkId();
            String rhsNetworkId;
            rhsNetworkId = that.getNetworkId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkId", lhsNetworkId), LocatorUtils.property(thatLocator, "networkId", rhsNetworkId), lhsNetworkId, rhsNetworkId)) {
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
            AppMenuType theAppMenuType;
            theAppMenuType = this.getAppMenuType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appMenuType", theAppMenuType), currentHashCode, theAppMenuType);
        }
        {
            String theNetworkId;
            theNetworkId = this.getNetworkId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkId", theNetworkId), currentHashCode, theNetworkId);
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
            AppMenuType theAppMenuType;
            theAppMenuType = this.getAppMenuType();
            strategy.appendField(locator, this, "appMenuType", buffer, theAppMenuType);
        }
        {
            String theNetworkId;
            theNetworkId = this.getNetworkId();
            strategy.appendField(locator, this, "networkId", buffer, theNetworkId);
        }
        return buffer;
    }

}
