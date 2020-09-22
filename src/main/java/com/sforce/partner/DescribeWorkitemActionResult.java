
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
 * <p>Java class for DescribeWorkitemActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeWorkitemActionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actions" type="{urn:partner.soap.sforce.com}AllowedWorkitemAction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{urn:partner.soap.sforce.com}Error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="targetObjectId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="workitemId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeWorkitemActionResult", propOrder = {
    "actions",
    "errors",
    "success",
    "targetObjectId",
    "workitemId"
})
public class DescribeWorkitemActionResult
    implements Equals, HashCode, ToString
{

    protected List<AllowedWorkitemAction> actions;
    protected List<Error> errors;
    protected boolean success;
    @XmlElement(required = true)
    protected String targetObjectId;
    @XmlElement(required = true)
    protected String workitemId;

    /**
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedWorkitemAction }
     * 
     * 
     */
    public List<AllowedWorkitemAction> getActions() {
        if (actions == null) {
            actions = new ArrayList<AllowedWorkitemAction>();
        }
        return this.actions;
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

    /**
     * Gets the value of the targetObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetObjectId() {
        return targetObjectId;
    }

    /**
     * Sets the value of the targetObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetObjectId(String value) {
        this.targetObjectId = value;
    }

    /**
     * Gets the value of the workitemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkitemId() {
        return workitemId;
    }

    /**
     * Sets the value of the workitemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkitemId(String value) {
        this.workitemId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeWorkitemActionResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeWorkitemActionResult that = ((DescribeWorkitemActionResult) object);
        {
            List<AllowedWorkitemAction> lhsActions;
            lhsActions = (((this.actions!= null)&&(!this.actions.isEmpty()))?this.getActions():null);
            List<AllowedWorkitemAction> rhsActions;
            rhsActions = (((that.actions!= null)&&(!that.actions.isEmpty()))?that.getActions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actions", lhsActions), LocatorUtils.property(thatLocator, "actions", rhsActions), lhsActions, rhsActions)) {
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
            boolean lhsSuccess;
            lhsSuccess = (true?this.isSuccess():false);
            boolean rhsSuccess;
            rhsSuccess = (true?that.isSuccess():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "success", lhsSuccess), LocatorUtils.property(thatLocator, "success", rhsSuccess), lhsSuccess, rhsSuccess)) {
                return false;
            }
        }
        {
            String lhsTargetObjectId;
            lhsTargetObjectId = this.getTargetObjectId();
            String rhsTargetObjectId;
            rhsTargetObjectId = that.getTargetObjectId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetObjectId", lhsTargetObjectId), LocatorUtils.property(thatLocator, "targetObjectId", rhsTargetObjectId), lhsTargetObjectId, rhsTargetObjectId)) {
                return false;
            }
        }
        {
            String lhsWorkitemId;
            lhsWorkitemId = this.getWorkitemId();
            String rhsWorkitemId;
            rhsWorkitemId = that.getWorkitemId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workitemId", lhsWorkitemId), LocatorUtils.property(thatLocator, "workitemId", rhsWorkitemId), lhsWorkitemId, rhsWorkitemId)) {
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
            List<AllowedWorkitemAction> theActions;
            theActions = (((this.actions!= null)&&(!this.actions.isEmpty()))?this.getActions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actions", theActions), currentHashCode, theActions);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errors", theErrors), currentHashCode, theErrors);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess);
        }
        {
            String theTargetObjectId;
            theTargetObjectId = this.getTargetObjectId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetObjectId", theTargetObjectId), currentHashCode, theTargetObjectId);
        }
        {
            String theWorkitemId;
            theWorkitemId = this.getWorkitemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workitemId", theWorkitemId), currentHashCode, theWorkitemId);
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
            List<AllowedWorkitemAction> theActions;
            theActions = (((this.actions!= null)&&(!this.actions.isEmpty()))?this.getActions():null);
            strategy.appendField(locator, this, "actions", buffer, theActions);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            strategy.appendField(locator, this, "errors", buffer, theErrors);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        {
            String theTargetObjectId;
            theTargetObjectId = this.getTargetObjectId();
            strategy.appendField(locator, this, "targetObjectId", buffer, theTargetObjectId);
        }
        {
            String theWorkitemId;
            theWorkitemId = this.getWorkitemId();
            strategy.appendField(locator, this, "workitemId", buffer, theWorkitemId);
        }
        return buffer;
    }

}
