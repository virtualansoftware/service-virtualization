
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
 * <p>Java class for DuplicateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowSave" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="duplicateRule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="duplicateRuleEntityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="matchResults" type="{urn:partner.soap.sforce.com}MatchResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateResult", propOrder = {
    "allowSave",
    "duplicateRule",
    "duplicateRuleEntityType",
    "errorMessage",
    "matchResults"
})
public class DuplicateResult
    implements Equals, HashCode, ToString
{

    protected boolean allowSave;
    @XmlElement(required = true)
    protected String duplicateRule;
    @XmlElement(required = true)
    protected String duplicateRuleEntityType;
    @XmlElement(required = true, nillable = true)
    protected String errorMessage;
    protected List<MatchResult> matchResults;

    /**
     * Gets the value of the allowSave property.
     * 
     */
    public boolean isAllowSave() {
        return allowSave;
    }

    /**
     * Sets the value of the allowSave property.
     * 
     */
    public void setAllowSave(boolean value) {
        this.allowSave = value;
    }

    /**
     * Gets the value of the duplicateRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateRule() {
        return duplicateRule;
    }

    /**
     * Sets the value of the duplicateRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateRule(String value) {
        this.duplicateRule = value;
    }

    /**
     * Gets the value of the duplicateRuleEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateRuleEntityType() {
        return duplicateRuleEntityType;
    }

    /**
     * Sets the value of the duplicateRuleEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateRuleEntityType(String value) {
        this.duplicateRuleEntityType = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the matchResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchResult }
     * 
     * 
     */
    public List<MatchResult> getMatchResults() {
        if (matchResults == null) {
            matchResults = new ArrayList<MatchResult>();
        }
        return this.matchResults;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DuplicateResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DuplicateResult that = ((DuplicateResult) object);
        {
            boolean lhsAllowSave;
            lhsAllowSave = (true?this.isAllowSave():false);
            boolean rhsAllowSave;
            rhsAllowSave = (true?that.isAllowSave():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowSave", lhsAllowSave), LocatorUtils.property(thatLocator, "allowSave", rhsAllowSave), lhsAllowSave, rhsAllowSave)) {
                return false;
            }
        }
        {
            String lhsDuplicateRule;
            lhsDuplicateRule = this.getDuplicateRule();
            String rhsDuplicateRule;
            rhsDuplicateRule = that.getDuplicateRule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplicateRule", lhsDuplicateRule), LocatorUtils.property(thatLocator, "duplicateRule", rhsDuplicateRule), lhsDuplicateRule, rhsDuplicateRule)) {
                return false;
            }
        }
        {
            String lhsDuplicateRuleEntityType;
            lhsDuplicateRuleEntityType = this.getDuplicateRuleEntityType();
            String rhsDuplicateRuleEntityType;
            rhsDuplicateRuleEntityType = that.getDuplicateRuleEntityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplicateRuleEntityType", lhsDuplicateRuleEntityType), LocatorUtils.property(thatLocator, "duplicateRuleEntityType", rhsDuplicateRuleEntityType), lhsDuplicateRuleEntityType, rhsDuplicateRuleEntityType)) {
                return false;
            }
        }
        {
            String lhsErrorMessage;
            lhsErrorMessage = this.getErrorMessage();
            String rhsErrorMessage;
            rhsErrorMessage = that.getErrorMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorMessage", lhsErrorMessage), LocatorUtils.property(thatLocator, "errorMessage", rhsErrorMessage), lhsErrorMessage, rhsErrorMessage)) {
                return false;
            }
        }
        {
            List<MatchResult> lhsMatchResults;
            lhsMatchResults = (((this.matchResults!= null)&&(!this.matchResults.isEmpty()))?this.getMatchResults():null);
            List<MatchResult> rhsMatchResults;
            rhsMatchResults = (((that.matchResults!= null)&&(!that.matchResults.isEmpty()))?that.getMatchResults():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchResults", lhsMatchResults), LocatorUtils.property(thatLocator, "matchResults", rhsMatchResults), lhsMatchResults, rhsMatchResults)) {
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
            boolean theAllowSave;
            theAllowSave = (true?this.isAllowSave():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowSave", theAllowSave), currentHashCode, theAllowSave);
        }
        {
            String theDuplicateRule;
            theDuplicateRule = this.getDuplicateRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duplicateRule", theDuplicateRule), currentHashCode, theDuplicateRule);
        }
        {
            String theDuplicateRuleEntityType;
            theDuplicateRuleEntityType = this.getDuplicateRuleEntityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duplicateRuleEntityType", theDuplicateRuleEntityType), currentHashCode, theDuplicateRuleEntityType);
        }
        {
            String theErrorMessage;
            theErrorMessage = this.getErrorMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorMessage", theErrorMessage), currentHashCode, theErrorMessage);
        }
        {
            List<MatchResult> theMatchResults;
            theMatchResults = (((this.matchResults!= null)&&(!this.matchResults.isEmpty()))?this.getMatchResults():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchResults", theMatchResults), currentHashCode, theMatchResults);
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
            boolean theAllowSave;
            theAllowSave = (true?this.isAllowSave():false);
            strategy.appendField(locator, this, "allowSave", buffer, theAllowSave);
        }
        {
            String theDuplicateRule;
            theDuplicateRule = this.getDuplicateRule();
            strategy.appendField(locator, this, "duplicateRule", buffer, theDuplicateRule);
        }
        {
            String theDuplicateRuleEntityType;
            theDuplicateRuleEntityType = this.getDuplicateRuleEntityType();
            strategy.appendField(locator, this, "duplicateRuleEntityType", buffer, theDuplicateRuleEntityType);
        }
        {
            String theErrorMessage;
            theErrorMessage = this.getErrorMessage();
            strategy.appendField(locator, this, "errorMessage", buffer, theErrorMessage);
        }
        {
            List<MatchResult> theMatchResults;
            theMatchResults = (((this.matchResults!= null)&&(!this.matchResults.isEmpty()))?this.getMatchResults():null);
            strategy.appendField(locator, this, "matchResults", buffer, theMatchResults);
        }
        return buffer;
    }

}
