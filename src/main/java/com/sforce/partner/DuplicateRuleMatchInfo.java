
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
 * <p>Java class for DuplicateRuleMatchInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateRuleMatchInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mapped" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="matchEngine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="matchFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchRuleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objectMapping" type="{urn:partner.soap.sforce.com}ObjectMapping"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateRuleMatchInfo", propOrder = {
    "entityType",
    "mapped",
    "matchEngine",
    "matchFields",
    "matchRuleName",
    "objectMapping"
})
public class DuplicateRuleMatchInfo
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String entityType;
    protected boolean mapped;
    @XmlElement(required = true)
    protected String matchEngine;
    @XmlElement(nillable = true)
    protected List<String> matchFields;
    @XmlElement(required = true)
    protected String matchRuleName;
    @XmlElement(required = true, nillable = true)
    protected ObjectMapping objectMapping;

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
     * Gets the value of the mapped property.
     * 
     */
    public boolean isMapped() {
        return mapped;
    }

    /**
     * Sets the value of the mapped property.
     * 
     */
    public void setMapped(boolean value) {
        this.mapped = value;
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
     * Gets the value of the matchFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMatchFields() {
        if (matchFields == null) {
            matchFields = new ArrayList<String>();
        }
        return this.matchFields;
    }

    /**
     * Gets the value of the matchRuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchRuleName() {
        return matchRuleName;
    }

    /**
     * Sets the value of the matchRuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchRuleName(String value) {
        this.matchRuleName = value;
    }

    /**
     * Gets the value of the objectMapping property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectMapping }
     *     
     */
    public ObjectMapping getObjectMapping() {
        return objectMapping;
    }

    /**
     * Sets the value of the objectMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectMapping }
     *     
     */
    public void setObjectMapping(ObjectMapping value) {
        this.objectMapping = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DuplicateRuleMatchInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DuplicateRuleMatchInfo that = ((DuplicateRuleMatchInfo) object);
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
            boolean lhsMapped;
            lhsMapped = (true?this.isMapped():false);
            boolean rhsMapped;
            rhsMapped = (true?that.isMapped():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mapped", lhsMapped), LocatorUtils.property(thatLocator, "mapped", rhsMapped), lhsMapped, rhsMapped)) {
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
            List<String> lhsMatchFields;
            lhsMatchFields = (((this.matchFields!= null)&&(!this.matchFields.isEmpty()))?this.getMatchFields():null);
            List<String> rhsMatchFields;
            rhsMatchFields = (((that.matchFields!= null)&&(!that.matchFields.isEmpty()))?that.getMatchFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchFields", lhsMatchFields), LocatorUtils.property(thatLocator, "matchFields", rhsMatchFields), lhsMatchFields, rhsMatchFields)) {
                return false;
            }
        }
        {
            String lhsMatchRuleName;
            lhsMatchRuleName = this.getMatchRuleName();
            String rhsMatchRuleName;
            rhsMatchRuleName = that.getMatchRuleName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchRuleName", lhsMatchRuleName), LocatorUtils.property(thatLocator, "matchRuleName", rhsMatchRuleName), lhsMatchRuleName, rhsMatchRuleName)) {
                return false;
            }
        }
        {
            ObjectMapping lhsObjectMapping;
            lhsObjectMapping = this.getObjectMapping();
            ObjectMapping rhsObjectMapping;
            rhsObjectMapping = that.getObjectMapping();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectMapping", lhsObjectMapping), LocatorUtils.property(thatLocator, "objectMapping", rhsObjectMapping), lhsObjectMapping, rhsObjectMapping)) {
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
            boolean theMapped;
            theMapped = (true?this.isMapped():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mapped", theMapped), currentHashCode, theMapped);
        }
        {
            String theMatchEngine;
            theMatchEngine = this.getMatchEngine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchEngine", theMatchEngine), currentHashCode, theMatchEngine);
        }
        {
            List<String> theMatchFields;
            theMatchFields = (((this.matchFields!= null)&&(!this.matchFields.isEmpty()))?this.getMatchFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchFields", theMatchFields), currentHashCode, theMatchFields);
        }
        {
            String theMatchRuleName;
            theMatchRuleName = this.getMatchRuleName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchRuleName", theMatchRuleName), currentHashCode, theMatchRuleName);
        }
        {
            ObjectMapping theObjectMapping;
            theObjectMapping = this.getObjectMapping();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectMapping", theObjectMapping), currentHashCode, theObjectMapping);
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
            boolean theMapped;
            theMapped = (true?this.isMapped():false);
            strategy.appendField(locator, this, "mapped", buffer, theMapped);
        }
        {
            String theMatchEngine;
            theMatchEngine = this.getMatchEngine();
            strategy.appendField(locator, this, "matchEngine", buffer, theMatchEngine);
        }
        {
            List<String> theMatchFields;
            theMatchFields = (((this.matchFields!= null)&&(!this.matchFields.isEmpty()))?this.getMatchFields():null);
            strategy.appendField(locator, this, "matchFields", buffer, theMatchFields);
        }
        {
            String theMatchRuleName;
            theMatchRuleName = this.getMatchRuleName();
            strategy.appendField(locator, this, "matchRuleName", buffer, theMatchRuleName);
        }
        {
            ObjectMapping theObjectMapping;
            theObjectMapping = this.getObjectMapping();
            strategy.appendField(locator, this, "objectMapping", buffer, theObjectMapping);
        }
        return buffer;
    }

}
