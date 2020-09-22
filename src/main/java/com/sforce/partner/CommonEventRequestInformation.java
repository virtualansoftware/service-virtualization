
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
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestOrigin" type="{urn:partner.soap.sforce.com}RequestOrigin"/&gt;
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
    "appName",
    "entityId",
    "requestOrigin"
})
@XmlRootElement(name = "CommonEventRequestInformation")
public class CommonEventRequestInformation
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String appName;
    @XmlElement(required = true)
    protected String entityId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RequestOrigin requestOrigin;

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the requestOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link RequestOrigin }
     *     
     */
    public RequestOrigin getRequestOrigin() {
        return requestOrigin;
    }

    /**
     * Sets the value of the requestOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOrigin }
     *     
     */
    public void setRequestOrigin(RequestOrigin value) {
        this.requestOrigin = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CommonEventRequestInformation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CommonEventRequestInformation that = ((CommonEventRequestInformation) object);
        {
            String lhsAppName;
            lhsAppName = this.getAppName();
            String rhsAppName;
            rhsAppName = that.getAppName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appName", lhsAppName), LocatorUtils.property(thatLocator, "appName", rhsAppName), lhsAppName, rhsAppName)) {
                return false;
            }
        }
        {
            String lhsEntityId;
            lhsEntityId = this.getEntityId();
            String rhsEntityId;
            rhsEntityId = that.getEntityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityId", lhsEntityId), LocatorUtils.property(thatLocator, "entityId", rhsEntityId), lhsEntityId, rhsEntityId)) {
                return false;
            }
        }
        {
            RequestOrigin lhsRequestOrigin;
            lhsRequestOrigin = this.getRequestOrigin();
            RequestOrigin rhsRequestOrigin;
            rhsRequestOrigin = that.getRequestOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestOrigin", lhsRequestOrigin), LocatorUtils.property(thatLocator, "requestOrigin", rhsRequestOrigin), lhsRequestOrigin, rhsRequestOrigin)) {
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
            String theAppName;
            theAppName = this.getAppName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appName", theAppName), currentHashCode, theAppName);
        }
        {
            String theEntityId;
            theEntityId = this.getEntityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityId", theEntityId), currentHashCode, theEntityId);
        }
        {
            RequestOrigin theRequestOrigin;
            theRequestOrigin = this.getRequestOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestOrigin", theRequestOrigin), currentHashCode, theRequestOrigin);
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
            String theAppName;
            theAppName = this.getAppName();
            strategy.appendField(locator, this, "appName", buffer, theAppName);
        }
        {
            String theEntityId;
            theEntityId = this.getEntityId();
            strategy.appendField(locator, this, "entityId", buffer, theEntityId);
        }
        {
            RequestOrigin theRequestOrigin;
            theRequestOrigin = this.getRequestOrigin();
            strategy.appendField(locator, this, "requestOrigin", buffer, theRequestOrigin);
        }
        return buffer;
    }

}
