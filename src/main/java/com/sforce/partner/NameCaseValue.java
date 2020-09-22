
package com.sforce.partner;

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
 * <p>Java class for NameCaseValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameCaseValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="article" type="{urn:partner.soap.sforce.com}Article"/&gt;
 *         &lt;element name="caseType" type="{urn:partner.soap.sforce.com}CaseType"/&gt;
 *         &lt;element name="number" type="{urn:partner.soap.sforce.com}GrammaticalNumber"/&gt;
 *         &lt;element name="possessive" type="{urn:partner.soap.sforce.com}Possessive"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameCaseValue", propOrder = {
    "article",
    "caseType",
    "number",
    "possessive",
    "value"
})
public class NameCaseValue
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Article article;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CaseType caseType;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected GrammaticalNumber number;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Possessive possessive;
    @XmlElement(required = true, nillable = true)
    protected String value;

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    public void setArticle(Article value) {
        this.article = value;
    }

    /**
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link CaseType }
     *     
     */
    public CaseType getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseType }
     *     
     */
    public void setCaseType(CaseType value) {
        this.caseType = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link GrammaticalNumber }
     *     
     */
    public GrammaticalNumber getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrammaticalNumber }
     *     
     */
    public void setNumber(GrammaticalNumber value) {
        this.number = value;
    }

    /**
     * Gets the value of the possessive property.
     * 
     * @return
     *     possible object is
     *     {@link Possessive }
     *     
     */
    public Possessive getPossessive() {
        return possessive;
    }

    /**
     * Sets the value of the possessive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Possessive }
     *     
     */
    public void setPossessive(Possessive value) {
        this.possessive = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NameCaseValue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NameCaseValue that = ((NameCaseValue) object);
        {
            Article lhsArticle;
            lhsArticle = this.getArticle();
            Article rhsArticle;
            rhsArticle = that.getArticle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "article", lhsArticle), LocatorUtils.property(thatLocator, "article", rhsArticle), lhsArticle, rhsArticle)) {
                return false;
            }
        }
        {
            CaseType lhsCaseType;
            lhsCaseType = this.getCaseType();
            CaseType rhsCaseType;
            rhsCaseType = that.getCaseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caseType", lhsCaseType), LocatorUtils.property(thatLocator, "caseType", rhsCaseType), lhsCaseType, rhsCaseType)) {
                return false;
            }
        }
        {
            GrammaticalNumber lhsNumber;
            lhsNumber = this.getNumber();
            GrammaticalNumber rhsNumber;
            rhsNumber = that.getNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber)) {
                return false;
            }
        }
        {
            Possessive lhsPossessive;
            lhsPossessive = this.getPossessive();
            Possessive rhsPossessive;
            rhsPossessive = that.getPossessive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "possessive", lhsPossessive), LocatorUtils.property(thatLocator, "possessive", rhsPossessive), lhsPossessive, rhsPossessive)) {
                return false;
            }
        }
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            Article theArticle;
            theArticle = this.getArticle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "article", theArticle), currentHashCode, theArticle);
        }
        {
            CaseType theCaseType;
            theCaseType = this.getCaseType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caseType", theCaseType), currentHashCode, theCaseType);
        }
        {
            GrammaticalNumber theNumber;
            theNumber = this.getNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "number", theNumber), currentHashCode, theNumber);
        }
        {
            Possessive thePossessive;
            thePossessive = this.getPossessive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "possessive", thePossessive), currentHashCode, thePossessive);
        }
        {
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
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
            Article theArticle;
            theArticle = this.getArticle();
            strategy.appendField(locator, this, "article", buffer, theArticle);
        }
        {
            CaseType theCaseType;
            theCaseType = this.getCaseType();
            strategy.appendField(locator, this, "caseType", buffer, theCaseType);
        }
        {
            GrammaticalNumber theNumber;
            theNumber = this.getNumber();
            strategy.appendField(locator, this, "number", buffer, theNumber);
        }
        {
            Possessive thePossessive;
            thePossessive = this.getPossessive();
            strategy.appendField(locator, this, "possessive", buffer, thePossessive);
        }
        {
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

}
