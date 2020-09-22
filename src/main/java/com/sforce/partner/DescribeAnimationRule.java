
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
 * <p>Java class for DescribeAnimationRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeAnimationRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="animationFrequency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="recordTypeContext" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetFieldChangeToValues" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeAnimationRule", propOrder = {
    "animationFrequency",
    "isActive",
    "recordTypeContext",
    "recordTypeId",
    "targetField",
    "targetFieldChangeToValues"
})
public class DescribeAnimationRule
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String animationFrequency;
    protected boolean isActive;
    @XmlElement(required = true)
    protected String recordTypeContext;
    @XmlElement(required = true, nillable = true)
    protected String recordTypeId;
    @XmlElement(required = true)
    protected String targetField;
    @XmlElement(required = true)
    protected String targetFieldChangeToValues;

    /**
     * Gets the value of the animationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimationFrequency() {
        return animationFrequency;
    }

    /**
     * Sets the value of the animationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimationFrequency(String value) {
        this.animationFrequency = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the recordTypeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeContext() {
        return recordTypeContext;
    }

    /**
     * Sets the value of the recordTypeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeContext(String value) {
        this.recordTypeContext = value;
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
     * Gets the value of the targetField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetField() {
        return targetField;
    }

    /**
     * Sets the value of the targetField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetField(String value) {
        this.targetField = value;
    }

    /**
     * Gets the value of the targetFieldChangeToValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFieldChangeToValues() {
        return targetFieldChangeToValues;
    }

    /**
     * Sets the value of the targetFieldChangeToValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFieldChangeToValues(String value) {
        this.targetFieldChangeToValues = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeAnimationRule)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeAnimationRule that = ((DescribeAnimationRule) object);
        {
            String lhsAnimationFrequency;
            lhsAnimationFrequency = this.getAnimationFrequency();
            String rhsAnimationFrequency;
            rhsAnimationFrequency = that.getAnimationFrequency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "animationFrequency", lhsAnimationFrequency), LocatorUtils.property(thatLocator, "animationFrequency", rhsAnimationFrequency), lhsAnimationFrequency, rhsAnimationFrequency)) {
                return false;
            }
        }
        {
            boolean lhsIsActive;
            lhsIsActive = (true?this.isIsActive():false);
            boolean rhsIsActive;
            rhsIsActive = (true?that.isIsActive():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isActive", lhsIsActive), LocatorUtils.property(thatLocator, "isActive", rhsIsActive), lhsIsActive, rhsIsActive)) {
                return false;
            }
        }
        {
            String lhsRecordTypeContext;
            lhsRecordTypeContext = this.getRecordTypeContext();
            String rhsRecordTypeContext;
            rhsRecordTypeContext = that.getRecordTypeContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeContext", lhsRecordTypeContext), LocatorUtils.property(thatLocator, "recordTypeContext", rhsRecordTypeContext), lhsRecordTypeContext, rhsRecordTypeContext)) {
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
            String lhsTargetField;
            lhsTargetField = this.getTargetField();
            String rhsTargetField;
            rhsTargetField = that.getTargetField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetField", lhsTargetField), LocatorUtils.property(thatLocator, "targetField", rhsTargetField), lhsTargetField, rhsTargetField)) {
                return false;
            }
        }
        {
            String lhsTargetFieldChangeToValues;
            lhsTargetFieldChangeToValues = this.getTargetFieldChangeToValues();
            String rhsTargetFieldChangeToValues;
            rhsTargetFieldChangeToValues = that.getTargetFieldChangeToValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetFieldChangeToValues", lhsTargetFieldChangeToValues), LocatorUtils.property(thatLocator, "targetFieldChangeToValues", rhsTargetFieldChangeToValues), lhsTargetFieldChangeToValues, rhsTargetFieldChangeToValues)) {
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
            String theAnimationFrequency;
            theAnimationFrequency = this.getAnimationFrequency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "animationFrequency", theAnimationFrequency), currentHashCode, theAnimationFrequency);
        }
        {
            boolean theIsActive;
            theIsActive = (true?this.isIsActive():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isActive", theIsActive), currentHashCode, theIsActive);
        }
        {
            String theRecordTypeContext;
            theRecordTypeContext = this.getRecordTypeContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeContext", theRecordTypeContext), currentHashCode, theRecordTypeContext);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeId", theRecordTypeId), currentHashCode, theRecordTypeId);
        }
        {
            String theTargetField;
            theTargetField = this.getTargetField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetField", theTargetField), currentHashCode, theTargetField);
        }
        {
            String theTargetFieldChangeToValues;
            theTargetFieldChangeToValues = this.getTargetFieldChangeToValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetFieldChangeToValues", theTargetFieldChangeToValues), currentHashCode, theTargetFieldChangeToValues);
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
            String theAnimationFrequency;
            theAnimationFrequency = this.getAnimationFrequency();
            strategy.appendField(locator, this, "animationFrequency", buffer, theAnimationFrequency);
        }
        {
            boolean theIsActive;
            theIsActive = (true?this.isIsActive():false);
            strategy.appendField(locator, this, "isActive", buffer, theIsActive);
        }
        {
            String theRecordTypeContext;
            theRecordTypeContext = this.getRecordTypeContext();
            strategy.appendField(locator, this, "recordTypeContext", buffer, theRecordTypeContext);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            strategy.appendField(locator, this, "recordTypeId", buffer, theRecordTypeId);
        }
        {
            String theTargetField;
            theTargetField = this.getTargetField();
            strategy.appendField(locator, this, "targetField", buffer, theTargetField);
        }
        {
            String theTargetFieldChangeToValues;
            theTargetFieldChangeToValues = this.getTargetFieldChangeToValues();
            strategy.appendField(locator, this, "targetFieldChangeToValues", buffer, theTargetFieldChangeToValues);
        }
        return buffer;
    }

}
