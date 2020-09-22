
package com.sforce.partner;

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
 * <p>Java class for Email complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Email"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bccSender" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="emailPriority" type="{urn:partner.soap.sforce.com}EmailPriority"/&gt;
 *         &lt;element name="replyTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saveAsActivity" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="senderDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="useSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Email", propOrder = {
    "bccSender",
    "emailPriority",
    "replyTo",
    "saveAsActivity",
    "senderDisplayName",
    "subject",
    "useSignature"
})
@XmlSeeAlso({
    MassEmailMessage.class,
    SingleEmailMessage.class
})
public class Email
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean bccSender;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EmailPriority emailPriority;
    @XmlElement(required = true, nillable = true)
    protected String replyTo;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean saveAsActivity;
    @XmlElement(required = true, nillable = true)
    protected String senderDisplayName;
    @XmlElement(required = true, nillable = true)
    protected String subject;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean useSignature;

    /**
     * Gets the value of the bccSender property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBccSender() {
        return bccSender;
    }

    /**
     * Sets the value of the bccSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBccSender(Boolean value) {
        this.bccSender = value;
    }

    /**
     * Gets the value of the emailPriority property.
     * 
     * @return
     *     possible object is
     *     {@link EmailPriority }
     *     
     */
    public EmailPriority getEmailPriority() {
        return emailPriority;
    }

    /**
     * Sets the value of the emailPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailPriority }
     *     
     */
    public void setEmailPriority(EmailPriority value) {
        this.emailPriority = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the saveAsActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveAsActivity() {
        return saveAsActivity;
    }

    /**
     * Sets the value of the saveAsActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveAsActivity(Boolean value) {
        this.saveAsActivity = value;
    }

    /**
     * Gets the value of the senderDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderDisplayName() {
        return senderDisplayName;
    }

    /**
     * Sets the value of the senderDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderDisplayName(String value) {
        this.senderDisplayName = value;
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
     * Gets the value of the useSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSignature() {
        return useSignature;
    }

    /**
     * Sets the value of the useSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSignature(Boolean value) {
        this.useSignature = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Email)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Email that = ((Email) object);
        {
            Boolean lhsBccSender;
            lhsBccSender = this.isBccSender();
            Boolean rhsBccSender;
            rhsBccSender = that.isBccSender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bccSender", lhsBccSender), LocatorUtils.property(thatLocator, "bccSender", rhsBccSender), lhsBccSender, rhsBccSender)) {
                return false;
            }
        }
        {
            EmailPriority lhsEmailPriority;
            lhsEmailPriority = this.getEmailPriority();
            EmailPriority rhsEmailPriority;
            rhsEmailPriority = that.getEmailPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailPriority", lhsEmailPriority), LocatorUtils.property(thatLocator, "emailPriority", rhsEmailPriority), lhsEmailPriority, rhsEmailPriority)) {
                return false;
            }
        }
        {
            String lhsReplyTo;
            lhsReplyTo = this.getReplyTo();
            String rhsReplyTo;
            rhsReplyTo = that.getReplyTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replyTo", lhsReplyTo), LocatorUtils.property(thatLocator, "replyTo", rhsReplyTo), lhsReplyTo, rhsReplyTo)) {
                return false;
            }
        }
        {
            Boolean lhsSaveAsActivity;
            lhsSaveAsActivity = this.isSaveAsActivity();
            Boolean rhsSaveAsActivity;
            rhsSaveAsActivity = that.isSaveAsActivity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saveAsActivity", lhsSaveAsActivity), LocatorUtils.property(thatLocator, "saveAsActivity", rhsSaveAsActivity), lhsSaveAsActivity, rhsSaveAsActivity)) {
                return false;
            }
        }
        {
            String lhsSenderDisplayName;
            lhsSenderDisplayName = this.getSenderDisplayName();
            String rhsSenderDisplayName;
            rhsSenderDisplayName = that.getSenderDisplayName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "senderDisplayName", lhsSenderDisplayName), LocatorUtils.property(thatLocator, "senderDisplayName", rhsSenderDisplayName), lhsSenderDisplayName, rhsSenderDisplayName)) {
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
            Boolean lhsUseSignature;
            lhsUseSignature = this.isUseSignature();
            Boolean rhsUseSignature;
            rhsUseSignature = that.isUseSignature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useSignature", lhsUseSignature), LocatorUtils.property(thatLocator, "useSignature", rhsUseSignature), lhsUseSignature, rhsUseSignature)) {
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
            Boolean theBccSender;
            theBccSender = this.isBccSender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bccSender", theBccSender), currentHashCode, theBccSender);
        }
        {
            EmailPriority theEmailPriority;
            theEmailPriority = this.getEmailPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emailPriority", theEmailPriority), currentHashCode, theEmailPriority);
        }
        {
            String theReplyTo;
            theReplyTo = this.getReplyTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replyTo", theReplyTo), currentHashCode, theReplyTo);
        }
        {
            Boolean theSaveAsActivity;
            theSaveAsActivity = this.isSaveAsActivity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saveAsActivity", theSaveAsActivity), currentHashCode, theSaveAsActivity);
        }
        {
            String theSenderDisplayName;
            theSenderDisplayName = this.getSenderDisplayName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "senderDisplayName", theSenderDisplayName), currentHashCode, theSenderDisplayName);
        }
        {
            String theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            Boolean theUseSignature;
            theUseSignature = this.isUseSignature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useSignature", theUseSignature), currentHashCode, theUseSignature);
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
            Boolean theBccSender;
            theBccSender = this.isBccSender();
            strategy.appendField(locator, this, "bccSender", buffer, theBccSender);
        }
        {
            EmailPriority theEmailPriority;
            theEmailPriority = this.getEmailPriority();
            strategy.appendField(locator, this, "emailPriority", buffer, theEmailPriority);
        }
        {
            String theReplyTo;
            theReplyTo = this.getReplyTo();
            strategy.appendField(locator, this, "replyTo", buffer, theReplyTo);
        }
        {
            Boolean theSaveAsActivity;
            theSaveAsActivity = this.isSaveAsActivity();
            strategy.appendField(locator, this, "saveAsActivity", buffer, theSaveAsActivity);
        }
        {
            String theSenderDisplayName;
            theSenderDisplayName = this.getSenderDisplayName();
            strategy.appendField(locator, this, "senderDisplayName", buffer, theSenderDisplayName);
        }
        {
            String theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            Boolean theUseSignature;
            theUseSignature = this.isUseSignature();
            strategy.appendField(locator, this, "useSignature", buffer, theUseSignature);
        }
        return buffer;
    }

}
