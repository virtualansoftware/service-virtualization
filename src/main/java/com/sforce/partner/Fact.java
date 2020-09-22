
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
 * <p>Java class for Fact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fact" type="{urn:partner.soap.sforce.com}MetadataVersionCheckFact"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fact", propOrder = {
    "fact",
    "subject",
    "token"
})
public class Fact
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MetadataVersionCheckFact fact;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String token;

    /**
     * Gets the value of the fact property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataVersionCheckFact }
     *     
     */
    public MetadataVersionCheckFact getFact() {
        return fact;
    }

    /**
     * Sets the value of the fact property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataVersionCheckFact }
     *     
     */
    public void setFact(MetadataVersionCheckFact value) {
        this.fact = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Fact)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Fact that = ((Fact) object);
        {
            MetadataVersionCheckFact lhsFact;
            lhsFact = this.getFact();
            MetadataVersionCheckFact rhsFact;
            rhsFact = that.getFact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fact", lhsFact), LocatorUtils.property(thatLocator, "fact", rhsFact), lhsFact, rhsFact)) {
                return false;
            }
        }
        {
            String lhsSubject;
            lhsSubject = this.getSubject();
            String rhsSubject;
            rhsSubject = that.getSubject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subject", lhsSubject), LocatorUtils.property(thatLocator, "subject", rhsSubject), lhsSubject, rhsSubject)) {
                return false;
            }
        }
        {
            String lhsToken;
            lhsToken = this.getToken();
            String rhsToken;
            rhsToken = that.getToken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "token", lhsToken), LocatorUtils.property(thatLocator, "token", rhsToken), lhsToken, rhsToken)) {
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
            MetadataVersionCheckFact theFact;
            theFact = this.getFact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fact", theFact), currentHashCode, theFact);
        }
        {
            String theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            String theToken;
            theToken = this.getToken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "token", theToken), currentHashCode, theToken);
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
            MetadataVersionCheckFact theFact;
            theFact = this.getFact();
            strategy.appendField(locator, this, "fact", buffer, theFact);
        }
        {
            String theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            String theToken;
            theToken = this.getToken();
            strategy.appendField(locator, this, "token", buffer, theToken);
        }
        return buffer;
    }

}
