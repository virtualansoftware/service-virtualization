
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for Error complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Error"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extendedErrorDetails" type="{urn:partner.soap.sforce.com}ExtendedErrorDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Error", propOrder = {
    "extendedErrorDetails",
    "fields",
    "message",
    "statusCode"
})
@XmlSeeAlso({
    DuplicateError.class
})
public class Error
    implements Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<ExtendedErrorDetails> extendedErrorDetails;
    @XmlElement(nillable = true)
    protected List<String> fields;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusCode statusCode;

    /**
     * Gets the value of the extendedErrorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedErrorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedErrorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedErrorDetails }
     * 
     * 
     */
    public List<ExtendedErrorDetails> getExtendedErrorDetails() {
        if (extendedErrorDetails == null) {
            extendedErrorDetails = new ArrayList<ExtendedErrorDetails>();
        }
        return this.extendedErrorDetails;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFields() {
        if (fields == null) {
            fields = new ArrayList<String>();
        }
        return this.fields;
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
        if (!(object instanceof Error)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Error that = ((Error) object);
        {
            List<ExtendedErrorDetails> lhsExtendedErrorDetails;
            lhsExtendedErrorDetails = (((this.extendedErrorDetails!= null)&&(!this.extendedErrorDetails.isEmpty()))?this.getExtendedErrorDetails():null);
            List<ExtendedErrorDetails> rhsExtendedErrorDetails;
            rhsExtendedErrorDetails = (((that.extendedErrorDetails!= null)&&(!that.extendedErrorDetails.isEmpty()))?that.getExtendedErrorDetails():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extendedErrorDetails", lhsExtendedErrorDetails), LocatorUtils.property(thatLocator, "extendedErrorDetails", rhsExtendedErrorDetails), lhsExtendedErrorDetails, rhsExtendedErrorDetails)) {
                return false;
            }
        }
        {
            List<String> lhsFields;
            lhsFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            List<String> rhsFields;
            rhsFields = (((that.fields!= null)&&(!that.fields.isEmpty()))?that.getFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields)) {
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
            List<ExtendedErrorDetails> theExtendedErrorDetails;
            theExtendedErrorDetails = (((this.extendedErrorDetails!= null)&&(!this.extendedErrorDetails.isEmpty()))?this.getExtendedErrorDetails():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extendedErrorDetails", theExtendedErrorDetails), currentHashCode, theExtendedErrorDetails);
        }
        {
            List<String> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fields", theFields), currentHashCode, theFields);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
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
            List<ExtendedErrorDetails> theExtendedErrorDetails;
            theExtendedErrorDetails = (((this.extendedErrorDetails!= null)&&(!this.extendedErrorDetails.isEmpty()))?this.getExtendedErrorDetails():null);
            strategy.appendField(locator, this, "extendedErrorDetails", buffer, theExtendedErrorDetails);
        }
        {
            List<String> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            strategy.appendField(locator, this, "fields", buffer, theFields);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage);
        }
        {
            StatusCode theStatusCode;
            theStatusCode = this.getStatusCode();
            strategy.appendField(locator, this, "statusCode", buffer, theStatusCode);
        }
        return buffer;
    }

}
