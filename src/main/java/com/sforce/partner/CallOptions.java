
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
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultNamespace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnFieldDataTypes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="clientLog" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="debugExceptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remoteApplication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uiRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="perfOption" type="{urn:partner.soap.sforce.com}PerfOption"/&gt;
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
    "defaultNamespace",
    "returnFieldDataTypes",
    "clientLog",
    "debugExceptions",
    "platform",
    "remoteApplication",
    "uiRequestId",
    "perfOption"
})
@XmlRootElement(name = "CallOptions")
public class CallOptions
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String client;
    @XmlElement(required = true, nillable = true)
    protected String defaultNamespace;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean returnFieldDataTypes;
    @XmlElement(required = true)
    protected String clientLog;
    protected boolean debugExceptions;
    @XmlElement(required = true)
    protected String platform;
    @XmlElement(required = true)
    protected String remoteApplication;
    @XmlElement(required = true)
    protected String uiRequestId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerfOption perfOption;

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
     * Gets the value of the defaultNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultNamespace() {
        return defaultNamespace;
    }

    /**
     * Sets the value of the defaultNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultNamespace(String value) {
        this.defaultNamespace = value;
    }

    /**
     * Gets the value of the returnFieldDataTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnFieldDataTypes() {
        return returnFieldDataTypes;
    }

    /**
     * Sets the value of the returnFieldDataTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnFieldDataTypes(Boolean value) {
        this.returnFieldDataTypes = value;
    }

    /**
     * Gets the value of the clientLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLog() {
        return clientLog;
    }

    /**
     * Sets the value of the clientLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLog(String value) {
        this.clientLog = value;
    }

    /**
     * Gets the value of the debugExceptions property.
     * 
     */
    public boolean isDebugExceptions() {
        return debugExceptions;
    }

    /**
     * Sets the value of the debugExceptions property.
     * 
     */
    public void setDebugExceptions(boolean value) {
        this.debugExceptions = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the remoteApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteApplication() {
        return remoteApplication;
    }

    /**
     * Sets the value of the remoteApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteApplication(String value) {
        this.remoteApplication = value;
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
            String lhsDefaultNamespace;
            lhsDefaultNamespace = this.getDefaultNamespace();
            String rhsDefaultNamespace;
            rhsDefaultNamespace = that.getDefaultNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultNamespace", lhsDefaultNamespace), LocatorUtils.property(thatLocator, "defaultNamespace", rhsDefaultNamespace), lhsDefaultNamespace, rhsDefaultNamespace)) {
                return false;
            }
        }
        {
            Boolean lhsReturnFieldDataTypes;
            lhsReturnFieldDataTypes = this.isReturnFieldDataTypes();
            Boolean rhsReturnFieldDataTypes;
            rhsReturnFieldDataTypes = that.isReturnFieldDataTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnFieldDataTypes", lhsReturnFieldDataTypes), LocatorUtils.property(thatLocator, "returnFieldDataTypes", rhsReturnFieldDataTypes), lhsReturnFieldDataTypes, rhsReturnFieldDataTypes)) {
                return false;
            }
        }
        {
            String lhsClientLog;
            lhsClientLog = this.getClientLog();
            String rhsClientLog;
            rhsClientLog = that.getClientLog();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientLog", lhsClientLog), LocatorUtils.property(thatLocator, "clientLog", rhsClientLog), lhsClientLog, rhsClientLog)) {
                return false;
            }
        }
        {
            boolean lhsDebugExceptions;
            lhsDebugExceptions = (true?this.isDebugExceptions():false);
            boolean rhsDebugExceptions;
            rhsDebugExceptions = (true?that.isDebugExceptions():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debugExceptions", lhsDebugExceptions), LocatorUtils.property(thatLocator, "debugExceptions", rhsDebugExceptions), lhsDebugExceptions, rhsDebugExceptions)) {
                return false;
            }
        }
        {
            String lhsPlatform;
            lhsPlatform = this.getPlatform();
            String rhsPlatform;
            rhsPlatform = that.getPlatform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "platform", lhsPlatform), LocatorUtils.property(thatLocator, "platform", rhsPlatform), lhsPlatform, rhsPlatform)) {
                return false;
            }
        }
        {
            String lhsRemoteApplication;
            lhsRemoteApplication = this.getRemoteApplication();
            String rhsRemoteApplication;
            rhsRemoteApplication = that.getRemoteApplication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteApplication", lhsRemoteApplication), LocatorUtils.property(thatLocator, "remoteApplication", rhsRemoteApplication), lhsRemoteApplication, rhsRemoteApplication)) {
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
        {
            PerfOption lhsPerfOption;
            lhsPerfOption = this.getPerfOption();
            PerfOption rhsPerfOption;
            rhsPerfOption = that.getPerfOption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perfOption", lhsPerfOption), LocatorUtils.property(thatLocator, "perfOption", rhsPerfOption), lhsPerfOption, rhsPerfOption)) {
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
            String theDefaultNamespace;
            theDefaultNamespace = this.getDefaultNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultNamespace", theDefaultNamespace), currentHashCode, theDefaultNamespace);
        }
        {
            Boolean theReturnFieldDataTypes;
            theReturnFieldDataTypes = this.isReturnFieldDataTypes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnFieldDataTypes", theReturnFieldDataTypes), currentHashCode, theReturnFieldDataTypes);
        }
        {
            String theClientLog;
            theClientLog = this.getClientLog();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientLog", theClientLog), currentHashCode, theClientLog);
        }
        {
            boolean theDebugExceptions;
            theDebugExceptions = (true?this.isDebugExceptions():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debugExceptions", theDebugExceptions), currentHashCode, theDebugExceptions);
        }
        {
            String thePlatform;
            thePlatform = this.getPlatform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "platform", thePlatform), currentHashCode, thePlatform);
        }
        {
            String theRemoteApplication;
            theRemoteApplication = this.getRemoteApplication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteApplication", theRemoteApplication), currentHashCode, theRemoteApplication);
        }
        {
            String theUiRequestId;
            theUiRequestId = this.getUiRequestId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uiRequestId", theUiRequestId), currentHashCode, theUiRequestId);
        }
        {
            PerfOption thePerfOption;
            thePerfOption = this.getPerfOption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perfOption", thePerfOption), currentHashCode, thePerfOption);
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
            String theDefaultNamespace;
            theDefaultNamespace = this.getDefaultNamespace();
            strategy.appendField(locator, this, "defaultNamespace", buffer, theDefaultNamespace);
        }
        {
            Boolean theReturnFieldDataTypes;
            theReturnFieldDataTypes = this.isReturnFieldDataTypes();
            strategy.appendField(locator, this, "returnFieldDataTypes", buffer, theReturnFieldDataTypes);
        }
        {
            String theClientLog;
            theClientLog = this.getClientLog();
            strategy.appendField(locator, this, "clientLog", buffer, theClientLog);
        }
        {
            boolean theDebugExceptions;
            theDebugExceptions = (true?this.isDebugExceptions():false);
            strategy.appendField(locator, this, "debugExceptions", buffer, theDebugExceptions);
        }
        {
            String thePlatform;
            thePlatform = this.getPlatform();
            strategy.appendField(locator, this, "platform", buffer, thePlatform);
        }
        {
            String theRemoteApplication;
            theRemoteApplication = this.getRemoteApplication();
            strategy.appendField(locator, this, "remoteApplication", buffer, theRemoteApplication);
        }
        {
            String theUiRequestId;
            theUiRequestId = this.getUiRequestId();
            strategy.appendField(locator, this, "uiRequestId", buffer, theUiRequestId);
        }
        {
            PerfOption thePerfOption;
            thePerfOption = this.getPerfOption();
            strategy.appendField(locator, this, "perfOption", buffer, thePerfOption);
        }
        return buffer;
    }

}
