
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
 * <p>Java class for SetupBriefcaseResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetupBriefcaseResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="briefcaseType" type="{urn:partner.soap.sforce.com}briefcaseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetupBriefcaseResult", propOrder = {
    "briefcaseType"
})
public class SetupBriefcaseResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BriefcaseType briefcaseType;

    /**
     * Gets the value of the briefcaseType property.
     * 
     * @return
     *     possible object is
     *     {@link BriefcaseType }
     *     
     */
    public BriefcaseType getBriefcaseType() {
        return briefcaseType;
    }

    /**
     * Sets the value of the briefcaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BriefcaseType }
     *     
     */
    public void setBriefcaseType(BriefcaseType value) {
        this.briefcaseType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SetupBriefcaseResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SetupBriefcaseResult that = ((SetupBriefcaseResult) object);
        {
            BriefcaseType lhsBriefcaseType;
            lhsBriefcaseType = this.getBriefcaseType();
            BriefcaseType rhsBriefcaseType;
            rhsBriefcaseType = that.getBriefcaseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "briefcaseType", lhsBriefcaseType), LocatorUtils.property(thatLocator, "briefcaseType", rhsBriefcaseType), lhsBriefcaseType, rhsBriefcaseType)) {
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
            BriefcaseType theBriefcaseType;
            theBriefcaseType = this.getBriefcaseType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "briefcaseType", theBriefcaseType), currentHashCode, theBriefcaseType);
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
            BriefcaseType theBriefcaseType;
            theBriefcaseType = this.getBriefcaseType();
            strategy.appendField(locator, this, "briefcaseType", buffer, theBriefcaseType);
        }
        return buffer;
    }

}
