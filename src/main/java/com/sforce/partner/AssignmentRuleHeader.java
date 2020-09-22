
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="assignmentRuleId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="useDefaultRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "assignmentRuleId",
    "useDefaultRule"
})
@XmlRootElement(name = "AssignmentRuleHeader")
public class AssignmentRuleHeader
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String assignmentRuleId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean useDefaultRule;

    /**
     * Gets the value of the assignmentRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentRuleId() {
        return assignmentRuleId;
    }

    /**
     * Sets the value of the assignmentRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentRuleId(String value) {
        this.assignmentRuleId = value;
    }

    /**
     * Gets the value of the useDefaultRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDefaultRule() {
        return useDefaultRule;
    }

    /**
     * Sets the value of the useDefaultRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDefaultRule(Boolean value) {
        this.useDefaultRule = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AssignmentRuleHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AssignmentRuleHeader that = ((AssignmentRuleHeader) object);
        {
            String lhsAssignmentRuleId;
            lhsAssignmentRuleId = this.getAssignmentRuleId();
            String rhsAssignmentRuleId;
            rhsAssignmentRuleId = that.getAssignmentRuleId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assignmentRuleId", lhsAssignmentRuleId), LocatorUtils.property(thatLocator, "assignmentRuleId", rhsAssignmentRuleId), lhsAssignmentRuleId, rhsAssignmentRuleId)) {
                return false;
            }
        }
        {
            Boolean lhsUseDefaultRule;
            lhsUseDefaultRule = this.isUseDefaultRule();
            Boolean rhsUseDefaultRule;
            rhsUseDefaultRule = that.isUseDefaultRule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useDefaultRule", lhsUseDefaultRule), LocatorUtils.property(thatLocator, "useDefaultRule", rhsUseDefaultRule), lhsUseDefaultRule, rhsUseDefaultRule)) {
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
            String theAssignmentRuleId;
            theAssignmentRuleId = this.getAssignmentRuleId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assignmentRuleId", theAssignmentRuleId), currentHashCode, theAssignmentRuleId);
        }
        {
            Boolean theUseDefaultRule;
            theUseDefaultRule = this.isUseDefaultRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useDefaultRule", theUseDefaultRule), currentHashCode, theUseDefaultRule);
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
            String theAssignmentRuleId;
            theAssignmentRuleId = this.getAssignmentRuleId();
            strategy.appendField(locator, this, "assignmentRuleId", buffer, theAssignmentRuleId);
        }
        {
            Boolean theUseDefaultRule;
            theUseDefaultRule = this.isUseDefaultRule();
            strategy.appendField(locator, this, "useDefaultRule", buffer, theUseDefaultRule);
        }
        return buffer;
    }

}
