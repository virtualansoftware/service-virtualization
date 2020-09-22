
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
 * <p>Java class for MatchOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="matchEngine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maxMatchResults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="minMatchConfidence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchOptions", propOrder = {
    "fields",
    "matchEngine",
    "maxMatchResults",
    "minMatchConfidence",
    "rule",
    "sObjectType"
})
public class MatchOptions
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String fields;
    @XmlElement(required = true)
    protected String matchEngine;
    protected int maxMatchResults;
    protected int minMatchConfidence;
    @XmlElement(required = true)
    protected String rule;
    @XmlElement(required = true)
    protected String sObjectType;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFields(String value) {
        this.fields = value;
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
     * Gets the value of the maxMatchResults property.
     * 
     */
    public int getMaxMatchResults() {
        return maxMatchResults;
    }

    /**
     * Sets the value of the maxMatchResults property.
     * 
     */
    public void setMaxMatchResults(int value) {
        this.maxMatchResults = value;
    }

    /**
     * Gets the value of the minMatchConfidence property.
     * 
     */
    public int getMinMatchConfidence() {
        return minMatchConfidence;
    }

    /**
     * Sets the value of the minMatchConfidence property.
     * 
     */
    public void setMinMatchConfidence(int value) {
        this.minMatchConfidence = value;
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
     * Gets the value of the sObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObjectType() {
        return sObjectType;
    }

    /**
     * Sets the value of the sObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObjectType(String value) {
        this.sObjectType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MatchOptions)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MatchOptions that = ((MatchOptions) object);
        {
            String lhsFields;
            lhsFields = this.getFields();
            String rhsFields;
            rhsFields = that.getFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields)) {
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
            int lhsMaxMatchResults;
            lhsMaxMatchResults = (true?this.getMaxMatchResults(): 0);
            int rhsMaxMatchResults;
            rhsMaxMatchResults = (true?that.getMaxMatchResults(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxMatchResults", lhsMaxMatchResults), LocatorUtils.property(thatLocator, "maxMatchResults", rhsMaxMatchResults), lhsMaxMatchResults, rhsMaxMatchResults)) {
                return false;
            }
        }
        {
            int lhsMinMatchConfidence;
            lhsMinMatchConfidence = (true?this.getMinMatchConfidence(): 0);
            int rhsMinMatchConfidence;
            rhsMinMatchConfidence = (true?that.getMinMatchConfidence(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minMatchConfidence", lhsMinMatchConfidence), LocatorUtils.property(thatLocator, "minMatchConfidence", rhsMinMatchConfidence), lhsMinMatchConfidence, rhsMinMatchConfidence)) {
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
            String lhsSObjectType;
            lhsSObjectType = this.getSObjectType();
            String rhsSObjectType;
            rhsSObjectType = that.getSObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sObjectType", lhsSObjectType), LocatorUtils.property(thatLocator, "sObjectType", rhsSObjectType), lhsSObjectType, rhsSObjectType)) {
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
            String theFields;
            theFields = this.getFields();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fields", theFields), currentHashCode, theFields);
        }
        {
            String theMatchEngine;
            theMatchEngine = this.getMatchEngine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchEngine", theMatchEngine), currentHashCode, theMatchEngine);
        }
        {
            int theMaxMatchResults;
            theMaxMatchResults = (true?this.getMaxMatchResults(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxMatchResults", theMaxMatchResults), currentHashCode, theMaxMatchResults);
        }
        {
            int theMinMatchConfidence;
            theMinMatchConfidence = (true?this.getMinMatchConfidence(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minMatchConfidence", theMinMatchConfidence), currentHashCode, theMinMatchConfidence);
        }
        {
            String theRule;
            theRule = this.getRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rule", theRule), currentHashCode, theRule);
        }
        {
            String theSObjectType;
            theSObjectType = this.getSObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObjectType", theSObjectType), currentHashCode, theSObjectType);
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
            String theFields;
            theFields = this.getFields();
            strategy.appendField(locator, this, "fields", buffer, theFields);
        }
        {
            String theMatchEngine;
            theMatchEngine = this.getMatchEngine();
            strategy.appendField(locator, this, "matchEngine", buffer, theMatchEngine);
        }
        {
            int theMaxMatchResults;
            theMaxMatchResults = (true?this.getMaxMatchResults(): 0);
            strategy.appendField(locator, this, "maxMatchResults", buffer, theMaxMatchResults);
        }
        {
            int theMinMatchConfidence;
            theMinMatchConfidence = (true?this.getMinMatchConfidence(): 0);
            strategy.appendField(locator, this, "minMatchConfidence", buffer, theMinMatchConfidence);
        }
        {
            String theRule;
            theRule = this.getRule();
            strategy.appendField(locator, this, "rule", buffer, theRule);
        }
        {
            String theSObjectType;
            theSObjectType = this.getSObjectType();
            strategy.appendField(locator, this, "sObjectType", buffer, theSObjectType);
        }
        return buffer;
    }

}
