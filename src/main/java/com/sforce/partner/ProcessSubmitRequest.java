
package com.sforce.partner;

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
 * <p>Java class for ProcessSubmitRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessSubmitRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}ProcessRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objectId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="submitterId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="processDefinitionNameOrId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="skipEntryCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessSubmitRequest", propOrder = {
    "objectId",
    "submitterId",
    "processDefinitionNameOrId",
    "skipEntryCriteria"
})
public class ProcessSubmitRequest
    extends ProcessRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String objectId;
    @XmlElement(required = true, nillable = true)
    protected String submitterId;
    @XmlElement(required = true, nillable = true)
    protected String processDefinitionNameOrId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean skipEntryCriteria;

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the submitterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitterId() {
        return submitterId;
    }

    /**
     * Sets the value of the submitterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitterId(String value) {
        this.submitterId = value;
    }

    /**
     * Gets the value of the processDefinitionNameOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessDefinitionNameOrId() {
        return processDefinitionNameOrId;
    }

    /**
     * Sets the value of the processDefinitionNameOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessDefinitionNameOrId(String value) {
        this.processDefinitionNameOrId = value;
    }

    /**
     * Gets the value of the skipEntryCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipEntryCriteria() {
        return skipEntryCriteria;
    }

    /**
     * Sets the value of the skipEntryCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipEntryCriteria(Boolean value) {
        this.skipEntryCriteria = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcessSubmitRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProcessSubmitRequest that = ((ProcessSubmitRequest) object);
        {
            String lhsObjectId;
            lhsObjectId = this.getObjectId();
            String rhsObjectId;
            rhsObjectId = that.getObjectId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectId", lhsObjectId), LocatorUtils.property(thatLocator, "objectId", rhsObjectId), lhsObjectId, rhsObjectId)) {
                return false;
            }
        }
        {
            String lhsSubmitterId;
            lhsSubmitterId = this.getSubmitterId();
            String rhsSubmitterId;
            rhsSubmitterId = that.getSubmitterId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "submitterId", lhsSubmitterId), LocatorUtils.property(thatLocator, "submitterId", rhsSubmitterId), lhsSubmitterId, rhsSubmitterId)) {
                return false;
            }
        }
        {
            String lhsProcessDefinitionNameOrId;
            lhsProcessDefinitionNameOrId = this.getProcessDefinitionNameOrId();
            String rhsProcessDefinitionNameOrId;
            rhsProcessDefinitionNameOrId = that.getProcessDefinitionNameOrId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processDefinitionNameOrId", lhsProcessDefinitionNameOrId), LocatorUtils.property(thatLocator, "processDefinitionNameOrId", rhsProcessDefinitionNameOrId), lhsProcessDefinitionNameOrId, rhsProcessDefinitionNameOrId)) {
                return false;
            }
        }
        {
            Boolean lhsSkipEntryCriteria;
            lhsSkipEntryCriteria = this.isSkipEntryCriteria();
            Boolean rhsSkipEntryCriteria;
            rhsSkipEntryCriteria = that.isSkipEntryCriteria();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "skipEntryCriteria", lhsSkipEntryCriteria), LocatorUtils.property(thatLocator, "skipEntryCriteria", rhsSkipEntryCriteria), lhsSkipEntryCriteria, rhsSkipEntryCriteria)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theObjectId;
            theObjectId = this.getObjectId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectId", theObjectId), currentHashCode, theObjectId);
        }
        {
            String theSubmitterId;
            theSubmitterId = this.getSubmitterId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "submitterId", theSubmitterId), currentHashCode, theSubmitterId);
        }
        {
            String theProcessDefinitionNameOrId;
            theProcessDefinitionNameOrId = this.getProcessDefinitionNameOrId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processDefinitionNameOrId", theProcessDefinitionNameOrId), currentHashCode, theProcessDefinitionNameOrId);
        }
        {
            Boolean theSkipEntryCriteria;
            theSkipEntryCriteria = this.isSkipEntryCriteria();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "skipEntryCriteria", theSkipEntryCriteria), currentHashCode, theSkipEntryCriteria);
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
        super.appendFields(locator, buffer, strategy);
        {
            String theObjectId;
            theObjectId = this.getObjectId();
            strategy.appendField(locator, this, "objectId", buffer, theObjectId);
        }
        {
            String theSubmitterId;
            theSubmitterId = this.getSubmitterId();
            strategy.appendField(locator, this, "submitterId", buffer, theSubmitterId);
        }
        {
            String theProcessDefinitionNameOrId;
            theProcessDefinitionNameOrId = this.getProcessDefinitionNameOrId();
            strategy.appendField(locator, this, "processDefinitionNameOrId", buffer, theProcessDefinitionNameOrId);
        }
        {
            Boolean theSkipEntryCriteria;
            theSkipEntryCriteria = this.isSkipEntryCriteria();
            strategy.appendField(locator, this, "skipEntryCriteria", buffer, theSkipEntryCriteria);
        }
        return buffer;
    }

}
