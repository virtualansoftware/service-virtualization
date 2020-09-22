
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for DescribeDuplicateRuleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeDuplicateRuleResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionOnInsert" type="{urn:partner.soap.sforce.com}DuplicateActionType"/&gt;
 *         &lt;element name="actionOnUpdate" type="{urn:partner.soap.sforce.com}DuplicateActionType"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="alertMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="duplicateFilters" type="{urn:partner.soap.sforce.com}DuplicateRuleFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="duplicateRuleMatchInfos" type="{urn:partner.soap.sforce.com}DuplicateRuleMatchInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operationsOnInsert" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="operationsOnUpdate" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="securityOption" type="{urn:partner.soap.sforce.com}DuplicateSecurityOptionType"/&gt;
 *         &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeDuplicateRuleResult", propOrder = {
    "actionOnInsert",
    "actionOnUpdate",
    "active",
    "alertMessage",
    "developerName",
    "duplicateFilters",
    "duplicateRuleMatchInfos",
    "name",
    "operationsOnInserts",
    "operationsOnUpdates",
    "securityOption",
    "sortOrder"
})
public class DescribeDuplicateRuleResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DuplicateActionType actionOnInsert;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DuplicateActionType actionOnUpdate;
    protected boolean active;
    @XmlElement(required = true, nillable = true)
    protected String alertMessage;
    @XmlElement(required = true)
    protected String developerName;
    protected List<DuplicateRuleFilter> duplicateFilters;
    protected List<DuplicateRuleMatchInfo> duplicateRuleMatchInfos;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "operationsOnInsert", nillable = true)
    protected List<String> operationsOnInserts;
    @XmlElement(name = "operationsOnUpdate", nillable = true)
    protected List<String> operationsOnUpdates;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DuplicateSecurityOptionType securityOption;
    protected int sortOrder;

    /**
     * Gets the value of the actionOnInsert property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateActionType }
     *     
     */
    public DuplicateActionType getActionOnInsert() {
        return actionOnInsert;
    }

    /**
     * Sets the value of the actionOnInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateActionType }
     *     
     */
    public void setActionOnInsert(DuplicateActionType value) {
        this.actionOnInsert = value;
    }

    /**
     * Gets the value of the actionOnUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateActionType }
     *     
     */
    public DuplicateActionType getActionOnUpdate() {
        return actionOnUpdate;
    }

    /**
     * Sets the value of the actionOnUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateActionType }
     *     
     */
    public void setActionOnUpdate(DuplicateActionType value) {
        this.actionOnUpdate = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the alertMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertMessage() {
        return alertMessage;
    }

    /**
     * Sets the value of the alertMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertMessage(String value) {
        this.alertMessage = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the duplicateFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duplicateFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuplicateFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DuplicateRuleFilter }
     * 
     * 
     */
    public List<DuplicateRuleFilter> getDuplicateFilters() {
        if (duplicateFilters == null) {
            duplicateFilters = new ArrayList<DuplicateRuleFilter>();
        }
        return this.duplicateFilters;
    }

    /**
     * Gets the value of the duplicateRuleMatchInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duplicateRuleMatchInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuplicateRuleMatchInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DuplicateRuleMatchInfo }
     * 
     * 
     */
    public List<DuplicateRuleMatchInfo> getDuplicateRuleMatchInfos() {
        if (duplicateRuleMatchInfos == null) {
            duplicateRuleMatchInfos = new ArrayList<DuplicateRuleMatchInfo>();
        }
        return this.duplicateRuleMatchInfos;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the operationsOnInserts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsOnInserts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsOnInserts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperationsOnInserts() {
        if (operationsOnInserts == null) {
            operationsOnInserts = new ArrayList<String>();
        }
        return this.operationsOnInserts;
    }

    /**
     * Gets the value of the operationsOnUpdates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsOnUpdates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsOnUpdates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperationsOnUpdates() {
        if (operationsOnUpdates == null) {
            operationsOnUpdates = new ArrayList<String>();
        }
        return this.operationsOnUpdates;
    }

    /**
     * Gets the value of the securityOption property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateSecurityOptionType }
     *     
     */
    public DuplicateSecurityOptionType getSecurityOption() {
        return securityOption;
    }

    /**
     * Sets the value of the securityOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateSecurityOptionType }
     *     
     */
    public void setSecurityOption(DuplicateSecurityOptionType value) {
        this.securityOption = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     */
    public void setSortOrder(int value) {
        this.sortOrder = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeDuplicateRuleResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeDuplicateRuleResult that = ((DescribeDuplicateRuleResult) object);
        {
            DuplicateActionType lhsActionOnInsert;
            lhsActionOnInsert = this.getActionOnInsert();
            DuplicateActionType rhsActionOnInsert;
            rhsActionOnInsert = that.getActionOnInsert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionOnInsert", lhsActionOnInsert), LocatorUtils.property(thatLocator, "actionOnInsert", rhsActionOnInsert), lhsActionOnInsert, rhsActionOnInsert)) {
                return false;
            }
        }
        {
            DuplicateActionType lhsActionOnUpdate;
            lhsActionOnUpdate = this.getActionOnUpdate();
            DuplicateActionType rhsActionOnUpdate;
            rhsActionOnUpdate = that.getActionOnUpdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionOnUpdate", lhsActionOnUpdate), LocatorUtils.property(thatLocator, "actionOnUpdate", rhsActionOnUpdate), lhsActionOnUpdate, rhsActionOnUpdate)) {
                return false;
            }
        }
        {
            boolean lhsActive;
            lhsActive = (true?this.isActive():false);
            boolean rhsActive;
            rhsActive = (true?that.isActive():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
                return false;
            }
        }
        {
            String lhsAlertMessage;
            lhsAlertMessage = this.getAlertMessage();
            String rhsAlertMessage;
            rhsAlertMessage = that.getAlertMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertMessage", lhsAlertMessage), LocatorUtils.property(thatLocator, "alertMessage", rhsAlertMessage), lhsAlertMessage, rhsAlertMessage)) {
                return false;
            }
        }
        {
            String lhsDeveloperName;
            lhsDeveloperName = this.getDeveloperName();
            String rhsDeveloperName;
            rhsDeveloperName = that.getDeveloperName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "developerName", lhsDeveloperName), LocatorUtils.property(thatLocator, "developerName", rhsDeveloperName), lhsDeveloperName, rhsDeveloperName)) {
                return false;
            }
        }
        {
            List<DuplicateRuleFilter> lhsDuplicateFilters;
            lhsDuplicateFilters = (((this.duplicateFilters!= null)&&(!this.duplicateFilters.isEmpty()))?this.getDuplicateFilters():null);
            List<DuplicateRuleFilter> rhsDuplicateFilters;
            rhsDuplicateFilters = (((that.duplicateFilters!= null)&&(!that.duplicateFilters.isEmpty()))?that.getDuplicateFilters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplicateFilters", lhsDuplicateFilters), LocatorUtils.property(thatLocator, "duplicateFilters", rhsDuplicateFilters), lhsDuplicateFilters, rhsDuplicateFilters)) {
                return false;
            }
        }
        {
            List<DuplicateRuleMatchInfo> lhsDuplicateRuleMatchInfos;
            lhsDuplicateRuleMatchInfos = (((this.duplicateRuleMatchInfos!= null)&&(!this.duplicateRuleMatchInfos.isEmpty()))?this.getDuplicateRuleMatchInfos():null);
            List<DuplicateRuleMatchInfo> rhsDuplicateRuleMatchInfos;
            rhsDuplicateRuleMatchInfos = (((that.duplicateRuleMatchInfos!= null)&&(!that.duplicateRuleMatchInfos.isEmpty()))?that.getDuplicateRuleMatchInfos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplicateRuleMatchInfos", lhsDuplicateRuleMatchInfos), LocatorUtils.property(thatLocator, "duplicateRuleMatchInfos", rhsDuplicateRuleMatchInfos), lhsDuplicateRuleMatchInfos, rhsDuplicateRuleMatchInfos)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            List<String> lhsOperationsOnInserts;
            lhsOperationsOnInserts = (((this.operationsOnInserts!= null)&&(!this.operationsOnInserts.isEmpty()))?this.getOperationsOnInserts():null);
            List<String> rhsOperationsOnInserts;
            rhsOperationsOnInserts = (((that.operationsOnInserts!= null)&&(!that.operationsOnInserts.isEmpty()))?that.getOperationsOnInserts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationsOnInserts", lhsOperationsOnInserts), LocatorUtils.property(thatLocator, "operationsOnInserts", rhsOperationsOnInserts), lhsOperationsOnInserts, rhsOperationsOnInserts)) {
                return false;
            }
        }
        {
            List<String> lhsOperationsOnUpdates;
            lhsOperationsOnUpdates = (((this.operationsOnUpdates!= null)&&(!this.operationsOnUpdates.isEmpty()))?this.getOperationsOnUpdates():null);
            List<String> rhsOperationsOnUpdates;
            rhsOperationsOnUpdates = (((that.operationsOnUpdates!= null)&&(!that.operationsOnUpdates.isEmpty()))?that.getOperationsOnUpdates():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationsOnUpdates", lhsOperationsOnUpdates), LocatorUtils.property(thatLocator, "operationsOnUpdates", rhsOperationsOnUpdates), lhsOperationsOnUpdates, rhsOperationsOnUpdates)) {
                return false;
            }
        }
        {
            DuplicateSecurityOptionType lhsSecurityOption;
            lhsSecurityOption = this.getSecurityOption();
            DuplicateSecurityOptionType rhsSecurityOption;
            rhsSecurityOption = that.getSecurityOption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityOption", lhsSecurityOption), LocatorUtils.property(thatLocator, "securityOption", rhsSecurityOption), lhsSecurityOption, rhsSecurityOption)) {
                return false;
            }
        }
        {
            int lhsSortOrder;
            lhsSortOrder = (true?this.getSortOrder(): 0);
            int rhsSortOrder;
            rhsSortOrder = (true?that.getSortOrder(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortOrder", lhsSortOrder), LocatorUtils.property(thatLocator, "sortOrder", rhsSortOrder), lhsSortOrder, rhsSortOrder)) {
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
            DuplicateActionType theActionOnInsert;
            theActionOnInsert = this.getActionOnInsert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionOnInsert", theActionOnInsert), currentHashCode, theActionOnInsert);
        }
        {
            DuplicateActionType theActionOnUpdate;
            theActionOnUpdate = this.getActionOnUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionOnUpdate", theActionOnUpdate), currentHashCode, theActionOnUpdate);
        }
        {
            boolean theActive;
            theActive = (true?this.isActive():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        {
            String theAlertMessage;
            theAlertMessage = this.getAlertMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertMessage", theAlertMessage), currentHashCode, theAlertMessage);
        }
        {
            String theDeveloperName;
            theDeveloperName = this.getDeveloperName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "developerName", theDeveloperName), currentHashCode, theDeveloperName);
        }
        {
            List<DuplicateRuleFilter> theDuplicateFilters;
            theDuplicateFilters = (((this.duplicateFilters!= null)&&(!this.duplicateFilters.isEmpty()))?this.getDuplicateFilters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duplicateFilters", theDuplicateFilters), currentHashCode, theDuplicateFilters);
        }
        {
            List<DuplicateRuleMatchInfo> theDuplicateRuleMatchInfos;
            theDuplicateRuleMatchInfos = (((this.duplicateRuleMatchInfos!= null)&&(!this.duplicateRuleMatchInfos.isEmpty()))?this.getDuplicateRuleMatchInfos():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duplicateRuleMatchInfos", theDuplicateRuleMatchInfos), currentHashCode, theDuplicateRuleMatchInfos);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<String> theOperationsOnInserts;
            theOperationsOnInserts = (((this.operationsOnInserts!= null)&&(!this.operationsOnInserts.isEmpty()))?this.getOperationsOnInserts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationsOnInserts", theOperationsOnInserts), currentHashCode, theOperationsOnInserts);
        }
        {
            List<String> theOperationsOnUpdates;
            theOperationsOnUpdates = (((this.operationsOnUpdates!= null)&&(!this.operationsOnUpdates.isEmpty()))?this.getOperationsOnUpdates():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationsOnUpdates", theOperationsOnUpdates), currentHashCode, theOperationsOnUpdates);
        }
        {
            DuplicateSecurityOptionType theSecurityOption;
            theSecurityOption = this.getSecurityOption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "securityOption", theSecurityOption), currentHashCode, theSecurityOption);
        }
        {
            int theSortOrder;
            theSortOrder = (true?this.getSortOrder(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortOrder", theSortOrder), currentHashCode, theSortOrder);
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
            DuplicateActionType theActionOnInsert;
            theActionOnInsert = this.getActionOnInsert();
            strategy.appendField(locator, this, "actionOnInsert", buffer, theActionOnInsert);
        }
        {
            DuplicateActionType theActionOnUpdate;
            theActionOnUpdate = this.getActionOnUpdate();
            strategy.appendField(locator, this, "actionOnUpdate", buffer, theActionOnUpdate);
        }
        {
            boolean theActive;
            theActive = (true?this.isActive():false);
            strategy.appendField(locator, this, "active", buffer, theActive);
        }
        {
            String theAlertMessage;
            theAlertMessage = this.getAlertMessage();
            strategy.appendField(locator, this, "alertMessage", buffer, theAlertMessage);
        }
        {
            String theDeveloperName;
            theDeveloperName = this.getDeveloperName();
            strategy.appendField(locator, this, "developerName", buffer, theDeveloperName);
        }
        {
            List<DuplicateRuleFilter> theDuplicateFilters;
            theDuplicateFilters = (((this.duplicateFilters!= null)&&(!this.duplicateFilters.isEmpty()))?this.getDuplicateFilters():null);
            strategy.appendField(locator, this, "duplicateFilters", buffer, theDuplicateFilters);
        }
        {
            List<DuplicateRuleMatchInfo> theDuplicateRuleMatchInfos;
            theDuplicateRuleMatchInfos = (((this.duplicateRuleMatchInfos!= null)&&(!this.duplicateRuleMatchInfos.isEmpty()))?this.getDuplicateRuleMatchInfos():null);
            strategy.appendField(locator, this, "duplicateRuleMatchInfos", buffer, theDuplicateRuleMatchInfos);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<String> theOperationsOnInserts;
            theOperationsOnInserts = (((this.operationsOnInserts!= null)&&(!this.operationsOnInserts.isEmpty()))?this.getOperationsOnInserts():null);
            strategy.appendField(locator, this, "operationsOnInserts", buffer, theOperationsOnInserts);
        }
        {
            List<String> theOperationsOnUpdates;
            theOperationsOnUpdates = (((this.operationsOnUpdates!= null)&&(!this.operationsOnUpdates.isEmpty()))?this.getOperationsOnUpdates():null);
            strategy.appendField(locator, this, "operationsOnUpdates", buffer, theOperationsOnUpdates);
        }
        {
            DuplicateSecurityOptionType theSecurityOption;
            theSecurityOption = this.getSecurityOption();
            strategy.appendField(locator, this, "securityOption", buffer, theSecurityOption);
        }
        {
            int theSortOrder;
            theSortOrder = (true?this.getSortOrder(): 0);
            strategy.appendField(locator, this, "sortOrder", buffer, theSortOrder);
        }
        return buffer;
    }

}
