
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
 * <p>Java class for DuplicateError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}Error"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="duplicateResult" type="{urn:partner.soap.sforce.com}DuplicateResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateError", propOrder = {
    "duplicateResult"
})
public class DuplicateError
    extends Error
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected DuplicateResult duplicateResult;

    /**
     * Gets the value of the duplicateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateResult }
     *     
     */
    public DuplicateResult getDuplicateResult() {
        return duplicateResult;
    }

    /**
     * Sets the value of the duplicateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateResult }
     *     
     */
    public void setDuplicateResult(DuplicateResult value) {
        this.duplicateResult = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DuplicateError)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DuplicateError that = ((DuplicateError) object);
        {
            DuplicateResult lhsDuplicateResult;
            lhsDuplicateResult = this.getDuplicateResult();
            DuplicateResult rhsDuplicateResult;
            rhsDuplicateResult = that.getDuplicateResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplicateResult", lhsDuplicateResult), LocatorUtils.property(thatLocator, "duplicateResult", rhsDuplicateResult), lhsDuplicateResult, rhsDuplicateResult)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            DuplicateResult theDuplicateResult;
            theDuplicateResult = this.getDuplicateResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duplicateResult", theDuplicateResult), currentHashCode, theDuplicateResult);
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
        super.appendFields(locator, buffer, strategy);
        {
            DuplicateResult theDuplicateResult;
            theDuplicateResult = this.getDuplicateResult();
            strategy.appendField(locator, this, "duplicateResult", buffer, theDuplicateResult);
        }
        return buffer;
    }

}
