
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
 * <p>Java class for DescribePathAssistant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribePathAssistant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="animationRule" type="{urn:partner.soap.sforce.com}DescribeAnimationRule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="apiName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pathPicklistField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="picklistsForRecordType" type="{urn:partner.soap.sforce.com}PicklistForRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordTypeId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="steps" type="{urn:partner.soap.sforce.com}DescribePathAssistantStep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribePathAssistant", propOrder = {
    "active",
    "animationRules",
    "apiName",
    "label",
    "pathPicklistField",
    "picklistsForRecordTypes",
    "recordTypeId",
    "steps"
})
public class DescribePathAssistant
    implements Equals, HashCode, ToString
{

    protected boolean active;
    @XmlElement(name = "animationRule", nillable = true)
    protected List<DescribeAnimationRule> animationRules;
    @XmlElement(required = true)
    protected String apiName;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String pathPicklistField;
    @XmlElement(name = "picklistsForRecordType", nillable = true)
    protected List<PicklistForRecordType> picklistsForRecordTypes;
    @XmlElement(required = true, nillable = true)
    protected String recordTypeId;
    protected List<DescribePathAssistantStep> steps;

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
     * Gets the value of the animationRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animationRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimationRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeAnimationRule }
     * 
     * 
     */
    public List<DescribeAnimationRule> getAnimationRules() {
        if (animationRules == null) {
            animationRules = new ArrayList<DescribeAnimationRule>();
        }
        return this.animationRules;
    }

    /**
     * Gets the value of the apiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * Sets the value of the apiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiName(String value) {
        this.apiName = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the pathPicklistField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathPicklistField() {
        return pathPicklistField;
    }

    /**
     * Sets the value of the pathPicklistField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathPicklistField(String value) {
        this.pathPicklistField = value;
    }

    /**
     * Gets the value of the picklistsForRecordTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picklistsForRecordTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicklistsForRecordTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistForRecordType }
     * 
     * 
     */
    public List<PicklistForRecordType> getPicklistsForRecordTypes() {
        if (picklistsForRecordTypes == null) {
            picklistsForRecordTypes = new ArrayList<PicklistForRecordType>();
        }
        return this.picklistsForRecordTypes;
    }

    /**
     * Gets the value of the recordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * Sets the value of the recordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeId(String value) {
        this.recordTypeId = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribePathAssistantStep }
     * 
     * 
     */
    public List<DescribePathAssistantStep> getSteps() {
        if (steps == null) {
            steps = new ArrayList<DescribePathAssistantStep>();
        }
        return this.steps;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribePathAssistant)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribePathAssistant that = ((DescribePathAssistant) object);
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
            List<DescribeAnimationRule> lhsAnimationRules;
            lhsAnimationRules = (((this.animationRules!= null)&&(!this.animationRules.isEmpty()))?this.getAnimationRules():null);
            List<DescribeAnimationRule> rhsAnimationRules;
            rhsAnimationRules = (((that.animationRules!= null)&&(!that.animationRules.isEmpty()))?that.getAnimationRules():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "animationRules", lhsAnimationRules), LocatorUtils.property(thatLocator, "animationRules", rhsAnimationRules), lhsAnimationRules, rhsAnimationRules)) {
                return false;
            }
        }
        {
            String lhsApiName;
            lhsApiName = this.getApiName();
            String rhsApiName;
            rhsApiName = that.getApiName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiName", lhsApiName), LocatorUtils.property(thatLocator, "apiName", rhsApiName), lhsApiName, rhsApiName)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            String lhsPathPicklistField;
            lhsPathPicklistField = this.getPathPicklistField();
            String rhsPathPicklistField;
            rhsPathPicklistField = that.getPathPicklistField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pathPicklistField", lhsPathPicklistField), LocatorUtils.property(thatLocator, "pathPicklistField", rhsPathPicklistField), lhsPathPicklistField, rhsPathPicklistField)) {
                return false;
            }
        }
        {
            List<PicklistForRecordType> lhsPicklistsForRecordTypes;
            lhsPicklistsForRecordTypes = (((this.picklistsForRecordTypes!= null)&&(!this.picklistsForRecordTypes.isEmpty()))?this.getPicklistsForRecordTypes():null);
            List<PicklistForRecordType> rhsPicklistsForRecordTypes;
            rhsPicklistsForRecordTypes = (((that.picklistsForRecordTypes!= null)&&(!that.picklistsForRecordTypes.isEmpty()))?that.getPicklistsForRecordTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picklistsForRecordTypes", lhsPicklistsForRecordTypes), LocatorUtils.property(thatLocator, "picklistsForRecordTypes", rhsPicklistsForRecordTypes), lhsPicklistsForRecordTypes, rhsPicklistsForRecordTypes)) {
                return false;
            }
        }
        {
            String lhsRecordTypeId;
            lhsRecordTypeId = this.getRecordTypeId();
            String rhsRecordTypeId;
            rhsRecordTypeId = that.getRecordTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeId", lhsRecordTypeId), LocatorUtils.property(thatLocator, "recordTypeId", rhsRecordTypeId), lhsRecordTypeId, rhsRecordTypeId)) {
                return false;
            }
        }
        {
            List<DescribePathAssistantStep> lhsSteps;
            lhsSteps = (((this.steps!= null)&&(!this.steps.isEmpty()))?this.getSteps():null);
            List<DescribePathAssistantStep> rhsSteps;
            rhsSteps = (((that.steps!= null)&&(!that.steps.isEmpty()))?that.getSteps():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steps", lhsSteps), LocatorUtils.property(thatLocator, "steps", rhsSteps), lhsSteps, rhsSteps)) {
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
            boolean theActive;
            theActive = (true?this.isActive():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        {
            List<DescribeAnimationRule> theAnimationRules;
            theAnimationRules = (((this.animationRules!= null)&&(!this.animationRules.isEmpty()))?this.getAnimationRules():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "animationRules", theAnimationRules), currentHashCode, theAnimationRules);
        }
        {
            String theApiName;
            theApiName = this.getApiName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apiName", theApiName), currentHashCode, theApiName);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String thePathPicklistField;
            thePathPicklistField = this.getPathPicklistField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pathPicklistField", thePathPicklistField), currentHashCode, thePathPicklistField);
        }
        {
            List<PicklistForRecordType> thePicklistsForRecordTypes;
            thePicklistsForRecordTypes = (((this.picklistsForRecordTypes!= null)&&(!this.picklistsForRecordTypes.isEmpty()))?this.getPicklistsForRecordTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistsForRecordTypes", thePicklistsForRecordTypes), currentHashCode, thePicklistsForRecordTypes);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeId", theRecordTypeId), currentHashCode, theRecordTypeId);
        }
        {
            List<DescribePathAssistantStep> theSteps;
            theSteps = (((this.steps!= null)&&(!this.steps.isEmpty()))?this.getSteps():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "steps", theSteps), currentHashCode, theSteps);
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
            boolean theActive;
            theActive = (true?this.isActive():false);
            strategy.appendField(locator, this, "active", buffer, theActive);
        }
        {
            List<DescribeAnimationRule> theAnimationRules;
            theAnimationRules = (((this.animationRules!= null)&&(!this.animationRules.isEmpty()))?this.getAnimationRules():null);
            strategy.appendField(locator, this, "animationRules", buffer, theAnimationRules);
        }
        {
            String theApiName;
            theApiName = this.getApiName();
            strategy.appendField(locator, this, "apiName", buffer, theApiName);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String thePathPicklistField;
            thePathPicklistField = this.getPathPicklistField();
            strategy.appendField(locator, this, "pathPicklistField", buffer, thePathPicklistField);
        }
        {
            List<PicklistForRecordType> thePicklistsForRecordTypes;
            thePicklistsForRecordTypes = (((this.picklistsForRecordTypes!= null)&&(!this.picklistsForRecordTypes.isEmpty()))?this.getPicklistsForRecordTypes():null);
            strategy.appendField(locator, this, "picklistsForRecordTypes", buffer, thePicklistsForRecordTypes);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            strategy.appendField(locator, this, "recordTypeId", buffer, theRecordTypeId);
        }
        {
            List<DescribePathAssistantStep> theSteps;
            theSteps = (((this.steps!= null)&&(!this.steps.isEmpty()))?this.getSteps():null);
            strategy.appendField(locator, this, "steps", buffer, theSteps);
        }
        return buffer;
    }

}
