
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
 * <p>Java class for HandledEmailMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandledEmailMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachments" type="{urn:partner.soap.sforce.com}EmailAttachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="headers" type="{urn:partner.soap.sforce.com}NameValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="htmlBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="textBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandledEmailMessage", propOrder = {
    "attachments",
    "headers",
    "htmlBody",
    "subject",
    "textBody"
})
public class HandledEmailMessage
    implements Equals, HashCode, ToString
{

    protected List<EmailAttachment> attachments;
    protected List<NameValuePair> headers;
    @XmlElement(required = true)
    protected String htmlBody;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String textBody;

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAttachment }
     * 
     * 
     */
    public List<EmailAttachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<EmailAttachment>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<NameValuePair>();
        }
        return this.headers;
    }

    /**
     * Gets the value of the htmlBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlBody() {
        return htmlBody;
    }

    /**
     * Sets the value of the htmlBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlBody(String value) {
        this.htmlBody = value;
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
     * Gets the value of the textBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextBody() {
        return textBody;
    }

    /**
     * Sets the value of the textBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextBody(String value) {
        this.textBody = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HandledEmailMessage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HandledEmailMessage that = ((HandledEmailMessage) object);
        {
            List<EmailAttachment> lhsAttachments;
            lhsAttachments = (((this.attachments!= null)&&(!this.attachments.isEmpty()))?this.getAttachments():null);
            List<EmailAttachment> rhsAttachments;
            rhsAttachments = (((that.attachments!= null)&&(!that.attachments.isEmpty()))?that.getAttachments():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachments", lhsAttachments), LocatorUtils.property(thatLocator, "attachments", rhsAttachments), lhsAttachments, rhsAttachments)) {
                return false;
            }
        }
        {
            List<NameValuePair> lhsHeaders;
            lhsHeaders = (((this.headers!= null)&&(!this.headers.isEmpty()))?this.getHeaders():null);
            List<NameValuePair> rhsHeaders;
            rhsHeaders = (((that.headers!= null)&&(!that.headers.isEmpty()))?that.getHeaders():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "headers", lhsHeaders), LocatorUtils.property(thatLocator, "headers", rhsHeaders), lhsHeaders, rhsHeaders)) {
                return false;
            }
        }
        {
            String lhsHtmlBody;
            lhsHtmlBody = this.getHtmlBody();
            String rhsHtmlBody;
            rhsHtmlBody = that.getHtmlBody();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "htmlBody", lhsHtmlBody), LocatorUtils.property(thatLocator, "htmlBody", rhsHtmlBody), lhsHtmlBody, rhsHtmlBody)) {
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
            String lhsTextBody;
            lhsTextBody = this.getTextBody();
            String rhsTextBody;
            rhsTextBody = that.getTextBody();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "textBody", lhsTextBody), LocatorUtils.property(thatLocator, "textBody", rhsTextBody), lhsTextBody, rhsTextBody)) {
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
            List<EmailAttachment> theAttachments;
            theAttachments = (((this.attachments!= null)&&(!this.attachments.isEmpty()))?this.getAttachments():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachments", theAttachments), currentHashCode, theAttachments);
        }
        {
            List<NameValuePair> theHeaders;
            theHeaders = (((this.headers!= null)&&(!this.headers.isEmpty()))?this.getHeaders():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "headers", theHeaders), currentHashCode, theHeaders);
        }
        {
            String theHtmlBody;
            theHtmlBody = this.getHtmlBody();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "htmlBody", theHtmlBody), currentHashCode, theHtmlBody);
        }
        {
            String theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            String theTextBody;
            theTextBody = this.getTextBody();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "textBody", theTextBody), currentHashCode, theTextBody);
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
            List<EmailAttachment> theAttachments;
            theAttachments = (((this.attachments!= null)&&(!this.attachments.isEmpty()))?this.getAttachments():null);
            strategy.appendField(locator, this, "attachments", buffer, theAttachments);
        }
        {
            List<NameValuePair> theHeaders;
            theHeaders = (((this.headers!= null)&&(!this.headers.isEmpty()))?this.getHeaders():null);
            strategy.appendField(locator, this, "headers", buffer, theHeaders);
        }
        {
            String theHtmlBody;
            theHtmlBody = this.getHtmlBody();
            strategy.appendField(locator, this, "htmlBody", buffer, theHtmlBody);
        }
        {
            String theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            String theTextBody;
            theTextBody = this.getTextBody();
            strategy.appendField(locator, this, "textBody", buffer, theTextBody);
        }
        return buffer;
    }

}
