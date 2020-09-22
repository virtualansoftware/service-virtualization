
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
 * <p>Java class for EntityIntentQueryMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityIntentQueryMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intentQuery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityIntentQueryMetadata", propOrder = {
    "intentQuery",
    "message"
})
public class EntityIntentQueryMetadata
    implements Equals, HashCode, ToString
{

    protected boolean intentQuery;
    @XmlElement(required = true, nillable = true)
    protected String message;

    /**
     * Gets the value of the intentQuery property.
     * 
     */
    public boolean isIntentQuery() {
        return intentQuery;
    }

    /**
     * Sets the value of the intentQuery property.
     * 
     */
    public void setIntentQuery(boolean value) {
        this.intentQuery = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EntityIntentQueryMetadata)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EntityIntentQueryMetadata that = ((EntityIntentQueryMetadata) object);
        {
            boolean lhsIntentQuery;
            lhsIntentQuery = (true?this.isIntentQuery():false);
            boolean rhsIntentQuery;
            rhsIntentQuery = (true?that.isIntentQuery():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intentQuery", lhsIntentQuery), LocatorUtils.property(thatLocator, "intentQuery", rhsIntentQuery), lhsIntentQuery, rhsIntentQuery)) {
                return false;
            }
        }
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
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
            boolean theIntentQuery;
            theIntentQuery = (true?this.isIntentQuery():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intentQuery", theIntentQuery), currentHashCode, theIntentQuery);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
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
            boolean theIntentQuery;
            theIntentQuery = (true?this.isIntentQuery():false);
            strategy.appendField(locator, this, "intentQuery", buffer, theIntentQuery);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage);
        }
        return buffer;
    }

}
