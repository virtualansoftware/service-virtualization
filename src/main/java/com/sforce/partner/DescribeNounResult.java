
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
 * <p>Java class for DescribeNounResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeNounResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caseValues" type="{urn:partner.soap.sforce.com}NameCaseValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gender" type="{urn:partner.soap.sforce.com}Gender"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pluralAlias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startsWith" type="{urn:partner.soap.sforce.com}StartsWith"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeNounResult", propOrder = {
    "caseValues",
    "developerName",
    "gender",
    "name",
    "pluralAlias",
    "startsWith"
})
public class DescribeNounResult
    implements Equals, HashCode, ToString
{

    protected List<NameCaseValue> caseValues;
    @XmlElement(required = true)
    protected String developerName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String pluralAlias;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected StartsWith startsWith;

    /**
     * Gets the value of the caseValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameCaseValue }
     * 
     * 
     */
    public List<NameCaseValue> getCaseValues() {
        if (caseValues == null) {
            caseValues = new ArrayList<NameCaseValue>();
        }
        return this.caseValues;
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
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
     * Gets the value of the pluralAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralAlias() {
        return pluralAlias;
    }

    /**
     * Sets the value of the pluralAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralAlias(String value) {
        this.pluralAlias = value;
    }

    /**
     * Gets the value of the startsWith property.
     * 
     * @return
     *     possible object is
     *     {@link StartsWith }
     *     
     */
    public StartsWith getStartsWith() {
        return startsWith;
    }

    /**
     * Sets the value of the startsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartsWith }
     *     
     */
    public void setStartsWith(StartsWith value) {
        this.startsWith = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeNounResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeNounResult that = ((DescribeNounResult) object);
        {
            List<NameCaseValue> lhsCaseValues;
            lhsCaseValues = (((this.caseValues!= null)&&(!this.caseValues.isEmpty()))?this.getCaseValues():null);
            List<NameCaseValue> rhsCaseValues;
            rhsCaseValues = (((that.caseValues!= null)&&(!that.caseValues.isEmpty()))?that.getCaseValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caseValues", lhsCaseValues), LocatorUtils.property(thatLocator, "caseValues", rhsCaseValues), lhsCaseValues, rhsCaseValues)) {
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
            Gender lhsGender;
            lhsGender = this.getGender();
            Gender rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
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
            String lhsPluralAlias;
            lhsPluralAlias = this.getPluralAlias();
            String rhsPluralAlias;
            rhsPluralAlias = that.getPluralAlias();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pluralAlias", lhsPluralAlias), LocatorUtils.property(thatLocator, "pluralAlias", rhsPluralAlias), lhsPluralAlias, rhsPluralAlias)) {
                return false;
            }
        }
        {
            StartsWith lhsStartsWith;
            lhsStartsWith = this.getStartsWith();
            StartsWith rhsStartsWith;
            rhsStartsWith = that.getStartsWith();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startsWith", lhsStartsWith), LocatorUtils.property(thatLocator, "startsWith", rhsStartsWith), lhsStartsWith, rhsStartsWith)) {
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
            List<NameCaseValue> theCaseValues;
            theCaseValues = (((this.caseValues!= null)&&(!this.caseValues.isEmpty()))?this.getCaseValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caseValues", theCaseValues), currentHashCode, theCaseValues);
        }
        {
            String theDeveloperName;
            theDeveloperName = this.getDeveloperName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "developerName", theDeveloperName), currentHashCode, theDeveloperName);
        }
        {
            Gender theGender;
            theGender = this.getGender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gender", theGender), currentHashCode, theGender);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String thePluralAlias;
            thePluralAlias = this.getPluralAlias();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pluralAlias", thePluralAlias), currentHashCode, thePluralAlias);
        }
        {
            StartsWith theStartsWith;
            theStartsWith = this.getStartsWith();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startsWith", theStartsWith), currentHashCode, theStartsWith);
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
            List<NameCaseValue> theCaseValues;
            theCaseValues = (((this.caseValues!= null)&&(!this.caseValues.isEmpty()))?this.getCaseValues():null);
            strategy.appendField(locator, this, "caseValues", buffer, theCaseValues);
        }
        {
            String theDeveloperName;
            theDeveloperName = this.getDeveloperName();
            strategy.appendField(locator, this, "developerName", buffer, theDeveloperName);
        }
        {
            Gender theGender;
            theGender = this.getGender();
            strategy.appendField(locator, this, "gender", buffer, theGender);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String thePluralAlias;
            thePluralAlias = this.getPluralAlias();
            strategy.appendField(locator, this, "pluralAlias", buffer, thePluralAlias);
        }
        {
            StartsWith theStartsWith;
            theStartsWith = this.getStartsWith();
            strategy.appendField(locator, this, "startsWith", buffer, theStartsWith);
        }
        return buffer;
    }

}
