
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
 * <p>Java class for RenderEmailTemplateError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenderEmailTemplateError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="statusCode" type="{urn:partner.soap.sforce.com}StatusCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenderEmailTemplateError", propOrder = {
    "fieldName",
    "message",
    "offset",
    "statusCode"
})
public class RenderEmailTemplateError
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected String message;
    protected int offset;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusCode statusCode;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
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

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RenderEmailTemplateError)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RenderEmailTemplateError that = ((RenderEmailTemplateError) object);
        {
            String lhsFieldName;
            lhsFieldName = this.getFieldName();
            String rhsFieldName;
            rhsFieldName = that.getFieldName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldName", lhsFieldName), LocatorUtils.property(thatLocator, "fieldName", rhsFieldName), lhsFieldName, rhsFieldName)) {
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
        {
            int lhsOffset;
            lhsOffset = (true?this.getOffset(): 0);
            int rhsOffset;
            rhsOffset = (true?that.getOffset(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offset", lhsOffset), LocatorUtils.property(thatLocator, "offset", rhsOffset), lhsOffset, rhsOffset)) {
                return false;
            }
        }
        {
            StatusCode lhsStatusCode;
            lhsStatusCode = this.getStatusCode();
            StatusCode rhsStatusCode;
            rhsStatusCode = that.getStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusCode", lhsStatusCode), LocatorUtils.property(thatLocator, "statusCode", rhsStatusCode), lhsStatusCode, rhsStatusCode)) {
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
            String theFieldName;
            theFieldName = this.getFieldName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldName", theFieldName), currentHashCode, theFieldName);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
        }
        {
            int theOffset;
            theOffset = (true?this.getOffset(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offset", theOffset), currentHashCode, theOffset);
        }
        {
            StatusCode theStatusCode;
            theStatusCode = this.getStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusCode", theStatusCode), currentHashCode, theStatusCode);
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
            String theFieldName;
            theFieldName = this.getFieldName();
            strategy.appendField(locator, this, "fieldName", buffer, theFieldName);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage);
        }
        {
            int theOffset;
            theOffset = (true?this.getOffset(): 0);
            strategy.appendField(locator, this, "offset", buffer, theOffset);
        }
        {
            StatusCode theStatusCode;
            theStatusCode = this.getStatusCode();
            strategy.appendField(locator, this, "statusCode", buffer, theStatusCode);
        }
        return buffer;
    }

}
