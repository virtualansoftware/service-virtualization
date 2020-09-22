
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
 * <p>Java class for PerformQuickActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformQuickActionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contextId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="errors" type="{urn:partner.soap.sforce.com}Error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedItemIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ids" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="successMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformQuickActionResult", propOrder = {
    "contextId",
    "created",
    "errors",
    "feedItemIds",
    "ids",
    "success",
    "successMessage"
})
public class PerformQuickActionResult
    implements Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected String contextId;
    protected boolean created;
    protected List<Error> errors;
    @XmlElement(nillable = true)
    protected List<String> feedItemIds;
    @XmlElement(nillable = true)
    protected List<String> ids;
    protected boolean success;
    @XmlElement(nillable = true)
    protected String successMessage;

    /**
     * Gets the value of the contextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextId() {
        return contextId;
    }

    /**
     * Sets the value of the contextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextId(String value) {
        this.contextId = value;
    }

    /**
     * Gets the value of the created property.
     * 
     */
    public boolean isCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     */
    public void setCreated(boolean value) {
        this.created = value;
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
     * Gets the value of the feedItemIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedItemIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedItemIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFeedItemIds() {
        if (feedItemIds == null) {
            feedItemIds = new ArrayList<String>();
        }
        return this.feedItemIds;
    }

    /**
     * Gets the value of the ids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIds() {
        if (ids == null) {
            ids = new ArrayList<String>();
        }
        return this.ids;
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
     * Gets the value of the successMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessMessage() {
        return successMessage;
    }

    /**
     * Sets the value of the successMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessMessage(String value) {
        this.successMessage = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PerformQuickActionResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PerformQuickActionResult that = ((PerformQuickActionResult) object);
        {
            String lhsContextId;
            lhsContextId = this.getContextId();
            String rhsContextId;
            rhsContextId = that.getContextId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextId", lhsContextId), LocatorUtils.property(thatLocator, "contextId", rhsContextId), lhsContextId, rhsContextId)) {
                return false;
            }
        }
        {
            boolean lhsCreated;
            lhsCreated = (true?this.isCreated():false);
            boolean rhsCreated;
            rhsCreated = (true?that.isCreated():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "created", lhsCreated), LocatorUtils.property(thatLocator, "created", rhsCreated), lhsCreated, rhsCreated)) {
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
            List<String> lhsFeedItemIds;
            lhsFeedItemIds = (((this.feedItemIds!= null)&&(!this.feedItemIds.isEmpty()))?this.getFeedItemIds():null);
            List<String> rhsFeedItemIds;
            rhsFeedItemIds = (((that.feedItemIds!= null)&&(!that.feedItemIds.isEmpty()))?that.getFeedItemIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedItemIds", lhsFeedItemIds), LocatorUtils.property(thatLocator, "feedItemIds", rhsFeedItemIds), lhsFeedItemIds, rhsFeedItemIds)) {
                return false;
            }
        }
        {
            List<String> lhsIds;
            lhsIds = (((this.ids!= null)&&(!this.ids.isEmpty()))?this.getIds():null);
            List<String> rhsIds;
            rhsIds = (((that.ids!= null)&&(!that.ids.isEmpty()))?that.getIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ids", lhsIds), LocatorUtils.property(thatLocator, "ids", rhsIds), lhsIds, rhsIds)) {
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
            String lhsSuccessMessage;
            lhsSuccessMessage = this.getSuccessMessage();
            String rhsSuccessMessage;
            rhsSuccessMessage = that.getSuccessMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "successMessage", lhsSuccessMessage), LocatorUtils.property(thatLocator, "successMessage", rhsSuccessMessage), lhsSuccessMessage, rhsSuccessMessage)) {
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
            String theContextId;
            theContextId = this.getContextId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextId", theContextId), currentHashCode, theContextId);
        }
        {
            boolean theCreated;
            theCreated = (true?this.isCreated():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "created", theCreated), currentHashCode, theCreated);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errors", theErrors), currentHashCode, theErrors);
        }
        {
            List<String> theFeedItemIds;
            theFeedItemIds = (((this.feedItemIds!= null)&&(!this.feedItemIds.isEmpty()))?this.getFeedItemIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feedItemIds", theFeedItemIds), currentHashCode, theFeedItemIds);
        }
        {
            List<String> theIds;
            theIds = (((this.ids!= null)&&(!this.ids.isEmpty()))?this.getIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ids", theIds), currentHashCode, theIds);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess);
        }
        {
            String theSuccessMessage;
            theSuccessMessage = this.getSuccessMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "successMessage", theSuccessMessage), currentHashCode, theSuccessMessage);
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
            String theContextId;
            theContextId = this.getContextId();
            strategy.appendField(locator, this, "contextId", buffer, theContextId);
        }
        {
            boolean theCreated;
            theCreated = (true?this.isCreated():false);
            strategy.appendField(locator, this, "created", buffer, theCreated);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            strategy.appendField(locator, this, "errors", buffer, theErrors);
        }
        {
            List<String> theFeedItemIds;
            theFeedItemIds = (((this.feedItemIds!= null)&&(!this.feedItemIds.isEmpty()))?this.getFeedItemIds():null);
            strategy.appendField(locator, this, "feedItemIds", buffer, theFeedItemIds);
        }
        {
            List<String> theIds;
            theIds = (((this.ids!= null)&&(!this.ids.isEmpty()))?this.getIds():null);
            strategy.appendField(locator, this, "ids", buffer, theIds);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        {
            String theSuccessMessage;
            theSuccessMessage = this.getSuccessMessage();
            strategy.appendField(locator, this, "successMessage", buffer, theSuccessMessage);
        }
        return buffer;
    }

}
