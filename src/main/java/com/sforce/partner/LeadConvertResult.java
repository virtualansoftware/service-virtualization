
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
 * <p>Java class for LeadConvertResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadConvertResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="contactId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="errors" type="{urn:partner.soap.sforce.com}Error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="leadId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="opportunityId" type="{urn:partner.soap.sforce.com}ID"/&gt;
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
@XmlType(name = "LeadConvertResult", propOrder = {
    "accountId",
    "contactId",
    "errors",
    "leadId",
    "opportunityId",
    "success"
})
public class LeadConvertResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String accountId;
    @XmlElement(required = true, nillable = true)
    protected String contactId;
    protected List<Error> errors;
    @XmlElement(required = true, nillable = true)
    protected String leadId;
    @XmlElement(required = true, nillable = true)
    protected String opportunityId;
    protected boolean success;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
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
     * Gets the value of the leadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadId() {
        return leadId;
    }

    /**
     * Sets the value of the leadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadId(String value) {
        this.leadId = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityId(String value) {
        this.opportunityId = value;
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
        if (!(object instanceof LeadConvertResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LeadConvertResult that = ((LeadConvertResult) object);
        {
            String lhsAccountId;
            lhsAccountId = this.getAccountId();
            String rhsAccountId;
            rhsAccountId = that.getAccountId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountId", lhsAccountId), LocatorUtils.property(thatLocator, "accountId", rhsAccountId), lhsAccountId, rhsAccountId)) {
                return false;
            }
        }
        {
            String lhsContactId;
            lhsContactId = this.getContactId();
            String rhsContactId;
            rhsContactId = that.getContactId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactId", lhsContactId), LocatorUtils.property(thatLocator, "contactId", rhsContactId), lhsContactId, rhsContactId)) {
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
            String lhsLeadId;
            lhsLeadId = this.getLeadId();
            String rhsLeadId;
            rhsLeadId = that.getLeadId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadId", lhsLeadId), LocatorUtils.property(thatLocator, "leadId", rhsLeadId), lhsLeadId, rhsLeadId)) {
                return false;
            }
        }
        {
            String lhsOpportunityId;
            lhsOpportunityId = this.getOpportunityId();
            String rhsOpportunityId;
            rhsOpportunityId = that.getOpportunityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opportunityId", lhsOpportunityId), LocatorUtils.property(thatLocator, "opportunityId", rhsOpportunityId), lhsOpportunityId, rhsOpportunityId)) {
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
            String theAccountId;
            theAccountId = this.getAccountId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountId", theAccountId), currentHashCode, theAccountId);
        }
        {
            String theContactId;
            theContactId = this.getContactId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactId", theContactId), currentHashCode, theContactId);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errors", theErrors), currentHashCode, theErrors);
        }
        {
            String theLeadId;
            theLeadId = this.getLeadId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadId", theLeadId), currentHashCode, theLeadId);
        }
        {
            String theOpportunityId;
            theOpportunityId = this.getOpportunityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "opportunityId", theOpportunityId), currentHashCode, theOpportunityId);
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
            String theAccountId;
            theAccountId = this.getAccountId();
            strategy.appendField(locator, this, "accountId", buffer, theAccountId);
        }
        {
            String theContactId;
            theContactId = this.getContactId();
            strategy.appendField(locator, this, "contactId", buffer, theContactId);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            strategy.appendField(locator, this, "errors", buffer, theErrors);
        }
        {
            String theLeadId;
            theLeadId = this.getLeadId();
            strategy.appendField(locator, this, "leadId", buffer, theLeadId);
        }
        {
            String theOpportunityId;
            theOpportunityId = this.getOpportunityId();
            strategy.appendField(locator, this, "opportunityId", buffer, theOpportunityId);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        return buffer;
    }

}
