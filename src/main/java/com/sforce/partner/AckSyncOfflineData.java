
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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="syncStateId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "token",
    "syncStateId"
})
@XmlRootElement(name = "ackSyncOfflineData")
public class AckSyncOfflineData
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String syncStateId;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the syncStateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncStateId() {
        return syncStateId;
    }

    /**
     * Sets the value of the syncStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncStateId(String value) {
        this.syncStateId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AckSyncOfflineData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AckSyncOfflineData that = ((AckSyncOfflineData) object);
        {
            String lhsToken;
            lhsToken = this.getToken();
            String rhsToken;
            rhsToken = that.getToken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "token", lhsToken), LocatorUtils.property(thatLocator, "token", rhsToken), lhsToken, rhsToken)) {
                return false;
            }
        }
        {
            String lhsSyncStateId;
            lhsSyncStateId = this.getSyncStateId();
            String rhsSyncStateId;
            rhsSyncStateId = that.getSyncStateId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncStateId", lhsSyncStateId), LocatorUtils.property(thatLocator, "syncStateId", rhsSyncStateId), lhsSyncStateId, rhsSyncStateId)) {
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
            String theToken;
            theToken = this.getToken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "token", theToken), currentHashCode, theToken);
        }
        {
            String theSyncStateId;
            theSyncStateId = this.getSyncStateId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncStateId", theSyncStateId), currentHashCode, theSyncStateId);
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
            String theToken;
            theToken = this.getToken();
            strategy.appendField(locator, this, "token", buffer, theToken);
        }
        {
            String theSyncStateId;
            theSyncStateId = this.getSyncStateId();
            strategy.appendField(locator, this, "syncStateId", buffer, theSyncStateId);
        }
        return buffer;
    }

}
