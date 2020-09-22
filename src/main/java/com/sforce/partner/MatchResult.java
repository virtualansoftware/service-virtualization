
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
 * <p>Java class for MatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errors" type="{urn:partner.soap.sforce.com}Error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchEngine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="matchRecords" type="{urn:partner.soap.sforce.com}MatchRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "MatchResult", propOrder = {
    "entityType",
    "errors",
    "matchEngine",
    "matchRecords",
    "rule",
    "size",
    "success"
})
public class MatchResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String entityType;
    protected List<Error> errors;
    @XmlElement(required = true)
    protected String matchEngine;
    protected List<MatchRecord> matchRecords;
    @XmlElement(required = true)
    protected String rule;
    protected int size;
    protected boolean success;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
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
     * Gets the value of the matchEngine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchEngine() {
        return matchEngine;
    }

    /**
     * Sets the value of the matchEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchEngine(String value) {
        this.matchEngine = value;
    }

    /**
     * Gets the value of the matchRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchRecord }
     * 
     * 
     */
    public List<MatchRecord> getMatchRecords() {
        if (matchRecords == null) {
            matchRecords = new ArrayList<MatchRecord>();
        }
        return this.matchRecords;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule(String value) {
        this.rule = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
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
        if (!(object instanceof MatchResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MatchResult that = ((MatchResult) object);
        {
            String lhsEntityType;
            lhsEntityType = this.getEntityType();
            String rhsEntityType;
            rhsEntityType = that.getEntityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityType", lhsEntityType), LocatorUtils.property(thatLocator, "entityType", rhsEntityType), lhsEntityType, rhsEntityType)) {
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
            String lhsMatchEngine;
            lhsMatchEngine = this.getMatchEngine();
            String rhsMatchEngine;
            rhsMatchEngine = that.getMatchEngine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchEngine", lhsMatchEngine), LocatorUtils.property(thatLocator, "matchEngine", rhsMatchEngine), lhsMatchEngine, rhsMatchEngine)) {
                return false;
            }
        }
        {
            List<MatchRecord> lhsMatchRecords;
            lhsMatchRecords = (((this.matchRecords!= null)&&(!this.matchRecords.isEmpty()))?this.getMatchRecords():null);
            List<MatchRecord> rhsMatchRecords;
            rhsMatchRecords = (((that.matchRecords!= null)&&(!that.matchRecords.isEmpty()))?that.getMatchRecords():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchRecords", lhsMatchRecords), LocatorUtils.property(thatLocator, "matchRecords", rhsMatchRecords), lhsMatchRecords, rhsMatchRecords)) {
                return false;
            }
        }
        {
            String lhsRule;
            lhsRule = this.getRule();
            String rhsRule;
            rhsRule = that.getRule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rule", lhsRule), LocatorUtils.property(thatLocator, "rule", rhsRule), lhsRule, rhsRule)) {
                return false;
            }
        }
        {
            int lhsSize;
            lhsSize = (true?this.getSize(): 0);
            int rhsSize;
            rhsSize = (true?that.getSize(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
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
            String theEntityType;
            theEntityType = this.getEntityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityType", theEntityType), currentHashCode, theEntityType);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errors", theErrors), currentHashCode, theErrors);
        }
        {
            String theMatchEngine;
            theMatchEngine = this.getMatchEngine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchEngine", theMatchEngine), currentHashCode, theMatchEngine);
        }
        {
            List<MatchRecord> theMatchRecords;
            theMatchRecords = (((this.matchRecords!= null)&&(!this.matchRecords.isEmpty()))?this.getMatchRecords():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchRecords", theMatchRecords), currentHashCode, theMatchRecords);
        }
        {
            String theRule;
            theRule = this.getRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rule", theRule), currentHashCode, theRule);
        }
        {
            int theSize;
            theSize = (true?this.getSize(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "size", theSize), currentHashCode, theSize);
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
            String theEntityType;
            theEntityType = this.getEntityType();
            strategy.appendField(locator, this, "entityType", buffer, theEntityType);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            strategy.appendField(locator, this, "errors", buffer, theErrors);
        }
        {
            String theMatchEngine;
            theMatchEngine = this.getMatchEngine();
            strategy.appendField(locator, this, "matchEngine", buffer, theMatchEngine);
        }
        {
            List<MatchRecord> theMatchRecords;
            theMatchRecords = (((this.matchRecords!= null)&&(!this.matchRecords.isEmpty()))?this.getMatchRecords():null);
            strategy.appendField(locator, this, "matchRecords", buffer, theMatchRecords);
        }
        {
            String theRule;
            theRule = this.getRule();
            strategy.appendField(locator, this, "rule", buffer, theRule);
        }
        {
            int theSize;
            theSize = (true?this.getSize(): 0);
            strategy.appendField(locator, this, "size", buffer, theSize);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        return buffer;
    }

}
