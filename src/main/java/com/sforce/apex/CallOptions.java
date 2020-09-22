
package com.sforce.apex;

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
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="perfOption" type="{http://soap.sforce.com/2006/08/apex}PerfOption"/&gt;
 *         &lt;element name="uiRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "client",
    "perfOption",
    "uiRequestId"
})
@XmlRootElement(name = "CallOptions")
public class CallOptions
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String client;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerfOption perfOption;
    @XmlElement(required = true)
    protected String uiRequestId;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Gets the value of the perfOption property.
     * 
     * @return
     *     possible object is
     *     {@link PerfOption }
     *     
     */
    public PerfOption getPerfOption() {
        return perfOption;
    }

    /**
     * Sets the value of the perfOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfOption }
     *     
     */
    public void setPerfOption(PerfOption value) {
        this.perfOption = value;
    }

    /**
     * Gets the value of the uiRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiRequestId() {
        return uiRequestId;
    }

    /**
     * Sets the value of the uiRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiRequestId(String value) {
        this.uiRequestId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CallOptions)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CallOptions that = ((CallOptions) object);
        {
            String lhsClient;
            lhsClient = this.getClient();
            String rhsClient;
            rhsClient = that.getClient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "client", lhsClient), LocatorUtils.property(thatLocator, "client", rhsClient), lhsClient, rhsClient)) {
                return false;
            }
        }
        {
            PerfOption lhsPerfOption;
            lhsPerfOption = this.getPerfOption();
            PerfOption rhsPerfOption;
            rhsPerfOption = that.getPerfOption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perfOption", lhsPerfOption), LocatorUtils.property(thatLocator, "perfOption", rhsPerfOption), lhsPerfOption, rhsPerfOption)) {
                return false;
            }
        }
        {
            String lhsUiRequestId;
            lhsUiRequestId = this.getUiRequestId();
            String rhsUiRequestId;
            rhsUiRequestId = that.getUiRequestId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uiRequestId", lhsUiRequestId), LocatorUtils.property(thatLocator, "uiRequestId", rhsUiRequestId), lhsUiRequestId, rhsUiRequestId)) {
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
            String theClient;
            theClient = this.getClient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "client", theClient), currentHashCode, theClient);
        }
        {
            PerfOption thePerfOption;
            thePerfOption = this.getPerfOption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perfOption", thePerfOption), currentHashCode, thePerfOption);
        }
        {
            String theUiRequestId;
            theUiRequestId = this.getUiRequestId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uiRequestId", theUiRequestId), currentHashCode, theUiRequestId);
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
            String theClient;
            theClient = this.getClient();
            strategy.appendField(locator, this, "client", buffer, theClient);
        }
        {
            PerfOption thePerfOption;
            thePerfOption = this.getPerfOption();
            strategy.appendField(locator, this, "perfOption", buffer, thePerfOption);
        }
        {
            String theUiRequestId;
            theUiRequestId = this.getUiRequestId();
            strategy.appendField(locator, this, "uiRequestId", buffer, theUiRequestId);
        }
        return buffer;
    }

}
