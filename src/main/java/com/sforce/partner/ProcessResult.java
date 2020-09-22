
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
 * <p>Java class for ProcessResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actorIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entityId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="errors" type="{urn:partner.soap.sforce.com}Error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="instanceId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="instanceStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newWorkitemIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessResult", propOrder = {
    "actorIds",
    "entityId",
    "errors",
    "instanceId",
    "instanceStatus",
    "newWorkitemIds",
    "success"
})
public class ProcessResult
    implements Equals, HashCode, ToString
{

    protected List<String> actorIds;
    @XmlElement(required = true, nillable = true)
    protected String entityId;
    protected List<Error> errors;
    @XmlElement(required = true, nillable = true)
    protected String instanceId;
    @XmlElement(required = true, nillable = true)
    protected String instanceStatus;
    @XmlElement(nillable = true)
    protected List<String> newWorkitemIds;
    protected boolean success;

    /**
     * Gets the value of the actorIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actorIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActorIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActorIds() {
        if (actorIds == null) {
            actorIds = new ArrayList<String>();
        }
        return this.actorIds;
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
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getErrors() {
        if (errors == null) {
            errors = new ArrayList<Error>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the instanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * Sets the value of the instanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceStatus(String value) {
        this.instanceStatus = value;
    }

    /**
     * Gets the value of the newWorkitemIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newWorkitemIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewWorkitemIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNewWorkitemIds() {
        if (newWorkitemIds == null) {
            newWorkitemIds = new ArrayList<String>();
        }
        return this.newWorkitemIds;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcessResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProcessResult that = ((ProcessResult) object);
        {
            List<String> lhsActorIds;
            lhsActorIds = (((this.actorIds!= null)&&(!this.actorIds.isEmpty()))?this.getActorIds():null);
            List<String> rhsActorIds;
            rhsActorIds = (((that.actorIds!= null)&&(!that.actorIds.isEmpty()))?that.getActorIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actorIds", lhsActorIds), LocatorUtils.property(thatLocator, "actorIds", rhsActorIds), lhsActorIds, rhsActorIds)) {
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
            List<Error> lhsErrors;
            lhsErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            List<Error> rhsErrors;
            rhsErrors = (((that.errors!= null)&&(!that.errors.isEmpty()))?that.getErrors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errors", lhsErrors), LocatorUtils.property(thatLocator, "errors", rhsErrors), lhsErrors, rhsErrors)) {
                return false;
            }
        }
        {
            String lhsInstanceId;
            lhsInstanceId = this.getInstanceId();
            String rhsInstanceId;
            rhsInstanceId = that.getInstanceId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instanceId", lhsInstanceId), LocatorUtils.property(thatLocator, "instanceId", rhsInstanceId), lhsInstanceId, rhsInstanceId)) {
                return false;
            }
        }
        {
            String lhsInstanceStatus;
            lhsInstanceStatus = this.getInstanceStatus();
            String rhsInstanceStatus;
            rhsInstanceStatus = that.getInstanceStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instanceStatus", lhsInstanceStatus), LocatorUtils.property(thatLocator, "instanceStatus", rhsInstanceStatus), lhsInstanceStatus, rhsInstanceStatus)) {
                return false;
            }
        }
        {
            List<String> lhsNewWorkitemIds;
            lhsNewWorkitemIds = (((this.newWorkitemIds!= null)&&(!this.newWorkitemIds.isEmpty()))?this.getNewWorkitemIds():null);
            List<String> rhsNewWorkitemIds;
            rhsNewWorkitemIds = (((that.newWorkitemIds!= null)&&(!that.newWorkitemIds.isEmpty()))?that.getNewWorkitemIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newWorkitemIds", lhsNewWorkitemIds), LocatorUtils.property(thatLocator, "newWorkitemIds", rhsNewWorkitemIds), lhsNewWorkitemIds, rhsNewWorkitemIds)) {
                return false;
            }
        }
        {
            boolean lhsSuccess;
            lhsSuccess = (true?this.isSuccess():false);
            boolean rhsSuccess;
            rhsSuccess = (true?that.isSuccess():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "success", lhsSuccess), LocatorUtils.property(thatLocator, "success", rhsSuccess), lhsSuccess, rhsSuccess)) {
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
            List<String> theActorIds;
            theActorIds = (((this.actorIds!= null)&&(!this.actorIds.isEmpty()))?this.getActorIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actorIds", theActorIds), currentHashCode, theActorIds);
        }
        {
            String theEntityId;
            theEntityId = this.getEntityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityId", theEntityId), currentHashCode, theEntityId);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errors", theErrors), currentHashCode, theErrors);
        }
        {
            String theInstanceId;
            theInstanceId = this.getInstanceId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instanceId", theInstanceId), currentHashCode, theInstanceId);
        }
        {
            String theInstanceStatus;
            theInstanceStatus = this.getInstanceStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instanceStatus", theInstanceStatus), currentHashCode, theInstanceStatus);
        }
        {
            List<String> theNewWorkitemIds;
            theNewWorkitemIds = (((this.newWorkitemIds!= null)&&(!this.newWorkitemIds.isEmpty()))?this.getNewWorkitemIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newWorkitemIds", theNewWorkitemIds), currentHashCode, theNewWorkitemIds);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess);
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
            List<String> theActorIds;
            theActorIds = (((this.actorIds!= null)&&(!this.actorIds.isEmpty()))?this.getActorIds():null);
            strategy.appendField(locator, this, "actorIds", buffer, theActorIds);
        }
        {
            String theEntityId;
            theEntityId = this.getEntityId();
            strategy.appendField(locator, this, "entityId", buffer, theEntityId);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            strategy.appendField(locator, this, "errors", buffer, theErrors);
        }
        {
            String theInstanceId;
            theInstanceId = this.getInstanceId();
            strategy.appendField(locator, this, "instanceId", buffer, theInstanceId);
        }
        {
            String theInstanceStatus;
            theInstanceStatus = this.getInstanceStatus();
            strategy.appendField(locator, this, "instanceStatus", buffer, theInstanceStatus);
        }
        {
            List<String> theNewWorkitemIds;
            theNewWorkitemIds = (((this.newWorkitemIds!= null)&&(!this.newWorkitemIds.isEmpty()))?this.getNewWorkitemIds():null);
            strategy.appendField(locator, this, "newWorkitemIds", buffer, theNewWorkitemIds);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        return buffer;
    }

}
