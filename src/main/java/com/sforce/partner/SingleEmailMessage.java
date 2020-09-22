
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
 * <p>Java class for SingleEmailMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleEmailMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}Email"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bccAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="25" minOccurs="0"/&gt;
 *         &lt;element name="ccAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="25" minOccurs="0"/&gt;
 *         &lt;element name="charset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentAttachments" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entityAttachments" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileAttachments" type="{urn:partner.soap.sforce.com}EmailFileAttachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="htmlBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="optOutPolicy" type="{urn:partner.soap.sforce.com}SendEmailOptOutPolicy"/&gt;
 *         &lt;element name="orgWideEmailAddressId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="plainTextBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="references" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetObjectId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="templateId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="treatBodiesAsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="treatTargetObjectAsRecipient" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="whatId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleEmailMessage", propOrder = {
    "bccAddresses",
    "ccAddresses",
    "charset",
    "documentAttachments",
    "entityAttachments",
    "fileAttachments",
    "htmlBody",
    "inReplyTo",
    "optOutPolicy",
    "orgWideEmailAddressId",
    "plainTextBody",
    "references",
    "targetObjectId",
    "templateId",
    "templateName",
    "toAddresses",
    "treatBodiesAsTemplate",
    "treatTargetObjectAsRecipient",
    "whatId"
})
public class SingleEmailMessage
    extends Email
    implements Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<String> bccAddresses;
    @XmlElement(nillable = true)
    protected List<String> ccAddresses;
    @XmlElement(required = true, nillable = true)
    protected String charset;
    protected List<String> documentAttachments;
    protected List<String> entityAttachments;
    protected List<EmailFileAttachment> fileAttachments;
    @XmlElement(required = true, nillable = true)
    protected String htmlBody;
    @XmlElement(nillable = true)
    protected String inReplyTo;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SendEmailOptOutPolicy optOutPolicy;
    @XmlElement(nillable = true)
    protected String orgWideEmailAddressId;
    @XmlElement(required = true, nillable = true)
    protected String plainTextBody;
    @XmlElement(nillable = true)
    protected String references;
    @XmlElement(required = true, nillable = true)
    protected String targetObjectId;
    @XmlElement(required = true, nillable = true)
    protected String templateId;
    @XmlElement(nillable = true)
    protected String templateName;
    @XmlElement(nillable = true)
    protected List<String> toAddresses;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean treatBodiesAsTemplate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean treatTargetObjectAsRecipient;
    @XmlElement(required = true, nillable = true)
    protected String whatId;

    /**
     * Gets the value of the bccAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bccAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBccAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBccAddresses() {
        if (bccAddresses == null) {
            bccAddresses = new ArrayList<String>();
        }
        return this.bccAddresses;
    }

    /**
     * Gets the value of the ccAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCcAddresses() {
        if (ccAddresses == null) {
            ccAddresses = new ArrayList<String>();
        }
        return this.ccAddresses;
    }

    /**
     * Gets the value of the charset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharset() {
        return charset;
    }

    /**
     * Sets the value of the charset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharset(String value) {
        this.charset = value;
    }

    /**
     * Gets the value of the documentAttachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentAttachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumentAttachments() {
        if (documentAttachments == null) {
            documentAttachments = new ArrayList<String>();
        }
        return this.documentAttachments;
    }

    /**
     * Gets the value of the entityAttachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityAttachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEntityAttachments() {
        if (entityAttachments == null) {
            entityAttachments = new ArrayList<String>();
        }
        return this.entityAttachments;
    }

    /**
     * Gets the value of the fileAttachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAttachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailFileAttachment }
     * 
     * 
     */
    public List<EmailFileAttachment> getFileAttachments() {
        if (fileAttachments == null) {
            fileAttachments = new ArrayList<EmailFileAttachment>();
        }
        return this.fileAttachments;
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
     * Gets the value of the inReplyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReplyTo() {
        return inReplyTo;
    }

    /**
     * Sets the value of the inReplyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReplyTo(String value) {
        this.inReplyTo = value;
    }

    /**
     * Gets the value of the optOutPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link SendEmailOptOutPolicy }
     *     
     */
    public SendEmailOptOutPolicy getOptOutPolicy() {
        return optOutPolicy;
    }

    /**
     * Sets the value of the optOutPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendEmailOptOutPolicy }
     *     
     */
    public void setOptOutPolicy(SendEmailOptOutPolicy value) {
        this.optOutPolicy = value;
    }

    /**
     * Gets the value of the orgWideEmailAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgWideEmailAddressId() {
        return orgWideEmailAddressId;
    }

    /**
     * Sets the value of the orgWideEmailAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgWideEmailAddressId(String value) {
        this.orgWideEmailAddressId = value;
    }

    /**
     * Gets the value of the plainTextBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainTextBody() {
        return plainTextBody;
    }

    /**
     * Sets the value of the plainTextBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainTextBody(String value) {
        this.plainTextBody = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferences(String value) {
        this.references = value;
    }

    /**
     * Gets the value of the targetObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetObjectId() {
        return targetObjectId;
    }

    /**
     * Sets the value of the targetObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetObjectId(String value) {
        this.targetObjectId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the toAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getToAddresses() {
        if (toAddresses == null) {
            toAddresses = new ArrayList<String>();
        }
        return this.toAddresses;
    }

    /**
     * Gets the value of the treatBodiesAsTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTreatBodiesAsTemplate() {
        return treatBodiesAsTemplate;
    }

    /**
     * Sets the value of the treatBodiesAsTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTreatBodiesAsTemplate(Boolean value) {
        this.treatBodiesAsTemplate = value;
    }

    /**
     * Gets the value of the treatTargetObjectAsRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTreatTargetObjectAsRecipient() {
        return treatTargetObjectAsRecipient;
    }

    /**
     * Sets the value of the treatTargetObjectAsRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTreatTargetObjectAsRecipient(Boolean value) {
        this.treatTargetObjectAsRecipient = value;
    }

    /**
     * Gets the value of the whatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhatId() {
        return whatId;
    }

    /**
     * Sets the value of the whatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhatId(String value) {
        this.whatId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SingleEmailMessage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SingleEmailMessage that = ((SingleEmailMessage) object);
        {
            List<String> lhsBccAddresses;
            lhsBccAddresses = (((this.bccAddresses!= null)&&(!this.bccAddresses.isEmpty()))?this.getBccAddresses():null);
            List<String> rhsBccAddresses;
            rhsBccAddresses = (((that.bccAddresses!= null)&&(!that.bccAddresses.isEmpty()))?that.getBccAddresses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bccAddresses", lhsBccAddresses), LocatorUtils.property(thatLocator, "bccAddresses", rhsBccAddresses), lhsBccAddresses, rhsBccAddresses)) {
                return false;
            }
        }
        {
            List<String> lhsCcAddresses;
            lhsCcAddresses = (((this.ccAddresses!= null)&&(!this.ccAddresses.isEmpty()))?this.getCcAddresses():null);
            List<String> rhsCcAddresses;
            rhsCcAddresses = (((that.ccAddresses!= null)&&(!that.ccAddresses.isEmpty()))?that.getCcAddresses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccAddresses", lhsCcAddresses), LocatorUtils.property(thatLocator, "ccAddresses", rhsCcAddresses), lhsCcAddresses, rhsCcAddresses)) {
                return false;
            }
        }
        {
            String lhsCharset;
            lhsCharset = this.getCharset();
            String rhsCharset;
            rhsCharset = that.getCharset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "charset", lhsCharset), LocatorUtils.property(thatLocator, "charset", rhsCharset), lhsCharset, rhsCharset)) {
                return false;
            }
        }
        {
            List<String> lhsDocumentAttachments;
            lhsDocumentAttachments = (((this.documentAttachments!= null)&&(!this.documentAttachments.isEmpty()))?this.getDocumentAttachments():null);
            List<String> rhsDocumentAttachments;
            rhsDocumentAttachments = (((that.documentAttachments!= null)&&(!that.documentAttachments.isEmpty()))?that.getDocumentAttachments():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentAttachments", lhsDocumentAttachments), LocatorUtils.property(thatLocator, "documentAttachments", rhsDocumentAttachments), lhsDocumentAttachments, rhsDocumentAttachments)) {
                return false;
            }
        }
        {
            List<String> lhsEntityAttachments;
            lhsEntityAttachments = (((this.entityAttachments!= null)&&(!this.entityAttachments.isEmpty()))?this.getEntityAttachments():null);
            List<String> rhsEntityAttachments;
            rhsEntityAttachments = (((that.entityAttachments!= null)&&(!that.entityAttachments.isEmpty()))?that.getEntityAttachments():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityAttachments", lhsEntityAttachments), LocatorUtils.property(thatLocator, "entityAttachments", rhsEntityAttachments), lhsEntityAttachments, rhsEntityAttachments)) {
                return false;
            }
        }
        {
            List<EmailFileAttachment> lhsFileAttachments;
            lhsFileAttachments = (((this.fileAttachments!= null)&&(!this.fileAttachments.isEmpty()))?this.getFileAttachments():null);
            List<EmailFileAttachment> rhsFileAttachments;
            rhsFileAttachments = (((that.fileAttachments!= null)&&(!that.fileAttachments.isEmpty()))?that.getFileAttachments():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileAttachments", lhsFileAttachments), LocatorUtils.property(thatLocator, "fileAttachments", rhsFileAttachments), lhsFileAttachments, rhsFileAttachments)) {
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
            String lhsInReplyTo;
            lhsInReplyTo = this.getInReplyTo();
            String rhsInReplyTo;
            rhsInReplyTo = that.getInReplyTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inReplyTo", lhsInReplyTo), LocatorUtils.property(thatLocator, "inReplyTo", rhsInReplyTo), lhsInReplyTo, rhsInReplyTo)) {
                return false;
            }
        }
        {
            SendEmailOptOutPolicy lhsOptOutPolicy;
            lhsOptOutPolicy = this.getOptOutPolicy();
            SendEmailOptOutPolicy rhsOptOutPolicy;
            rhsOptOutPolicy = that.getOptOutPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optOutPolicy", lhsOptOutPolicy), LocatorUtils.property(thatLocator, "optOutPolicy", rhsOptOutPolicy), lhsOptOutPolicy, rhsOptOutPolicy)) {
                return false;
            }
        }
        {
            String lhsOrgWideEmailAddressId;
            lhsOrgWideEmailAddressId = this.getOrgWideEmailAddressId();
            String rhsOrgWideEmailAddressId;
            rhsOrgWideEmailAddressId = that.getOrgWideEmailAddressId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgWideEmailAddressId", lhsOrgWideEmailAddressId), LocatorUtils.property(thatLocator, "orgWideEmailAddressId", rhsOrgWideEmailAddressId), lhsOrgWideEmailAddressId, rhsOrgWideEmailAddressId)) {
                return false;
            }
        }
        {
            String lhsPlainTextBody;
            lhsPlainTextBody = this.getPlainTextBody();
            String rhsPlainTextBody;
            rhsPlainTextBody = that.getPlainTextBody();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plainTextBody", lhsPlainTextBody), LocatorUtils.property(thatLocator, "plainTextBody", rhsPlainTextBody), lhsPlainTextBody, rhsPlainTextBody)) {
                return false;
            }
        }
        {
            String lhsReferences;
            lhsReferences = this.getReferences();
            String rhsReferences;
            rhsReferences = that.getReferences();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "references", lhsReferences), LocatorUtils.property(thatLocator, "references", rhsReferences), lhsReferences, rhsReferences)) {
                return false;
            }
        }
        {
            String lhsTargetObjectId;
            lhsTargetObjectId = this.getTargetObjectId();
            String rhsTargetObjectId;
            rhsTargetObjectId = that.getTargetObjectId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetObjectId", lhsTargetObjectId), LocatorUtils.property(thatLocator, "targetObjectId", rhsTargetObjectId), lhsTargetObjectId, rhsTargetObjectId)) {
                return false;
            }
        }
        {
            String lhsTemplateId;
            lhsTemplateId = this.getTemplateId();
            String rhsTemplateId;
            rhsTemplateId = that.getTemplateId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "templateId", lhsTemplateId), LocatorUtils.property(thatLocator, "templateId", rhsTemplateId), lhsTemplateId, rhsTemplateId)) {
                return false;
            }
        }
        {
            String lhsTemplateName;
            lhsTemplateName = this.getTemplateName();
            String rhsTemplateName;
            rhsTemplateName = that.getTemplateName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "templateName", lhsTemplateName), LocatorUtils.property(thatLocator, "templateName", rhsTemplateName), lhsTemplateName, rhsTemplateName)) {
                return false;
            }
        }
        {
            List<String> lhsToAddresses;
            lhsToAddresses = (((this.toAddresses!= null)&&(!this.toAddresses.isEmpty()))?this.getToAddresses():null);
            List<String> rhsToAddresses;
            rhsToAddresses = (((that.toAddresses!= null)&&(!that.toAddresses.isEmpty()))?that.getToAddresses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toAddresses", lhsToAddresses), LocatorUtils.property(thatLocator, "toAddresses", rhsToAddresses), lhsToAddresses, rhsToAddresses)) {
                return false;
            }
        }
        {
            Boolean lhsTreatBodiesAsTemplate;
            lhsTreatBodiesAsTemplate = this.isTreatBodiesAsTemplate();
            Boolean rhsTreatBodiesAsTemplate;
            rhsTreatBodiesAsTemplate = that.isTreatBodiesAsTemplate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "treatBodiesAsTemplate", lhsTreatBodiesAsTemplate), LocatorUtils.property(thatLocator, "treatBodiesAsTemplate", rhsTreatBodiesAsTemplate), lhsTreatBodiesAsTemplate, rhsTreatBodiesAsTemplate)) {
                return false;
            }
        }
        {
            Boolean lhsTreatTargetObjectAsRecipient;
            lhsTreatTargetObjectAsRecipient = this.isTreatTargetObjectAsRecipient();
            Boolean rhsTreatTargetObjectAsRecipient;
            rhsTreatTargetObjectAsRecipient = that.isTreatTargetObjectAsRecipient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "treatTargetObjectAsRecipient", lhsTreatTargetObjectAsRecipient), LocatorUtils.property(thatLocator, "treatTargetObjectAsRecipient", rhsTreatTargetObjectAsRecipient), lhsTreatTargetObjectAsRecipient, rhsTreatTargetObjectAsRecipient)) {
                return false;
            }
        }
        {
            String lhsWhatId;
            lhsWhatId = this.getWhatId();
            String rhsWhatId;
            rhsWhatId = that.getWhatId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whatId", lhsWhatId), LocatorUtils.property(thatLocator, "whatId", rhsWhatId), lhsWhatId, rhsWhatId)) {
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
            List<String> theBccAddresses;
            theBccAddresses = (((this.bccAddresses!= null)&&(!this.bccAddresses.isEmpty()))?this.getBccAddresses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bccAddresses", theBccAddresses), currentHashCode, theBccAddresses);
        }
        {
            List<String> theCcAddresses;
            theCcAddresses = (((this.ccAddresses!= null)&&(!this.ccAddresses.isEmpty()))?this.getCcAddresses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccAddresses", theCcAddresses), currentHashCode, theCcAddresses);
        }
        {
            String theCharset;
            theCharset = this.getCharset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "charset", theCharset), currentHashCode, theCharset);
        }
        {
            List<String> theDocumentAttachments;
            theDocumentAttachments = (((this.documentAttachments!= null)&&(!this.documentAttachments.isEmpty()))?this.getDocumentAttachments():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentAttachments", theDocumentAttachments), currentHashCode, theDocumentAttachments);
        }
        {
            List<String> theEntityAttachments;
            theEntityAttachments = (((this.entityAttachments!= null)&&(!this.entityAttachments.isEmpty()))?this.getEntityAttachments():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityAttachments", theEntityAttachments), currentHashCode, theEntityAttachments);
        }
        {
            List<EmailFileAttachment> theFileAttachments;
            theFileAttachments = (((this.fileAttachments!= null)&&(!this.fileAttachments.isEmpty()))?this.getFileAttachments():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileAttachments", theFileAttachments), currentHashCode, theFileAttachments);
        }
        {
            String theHtmlBody;
            theHtmlBody = this.getHtmlBody();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "htmlBody", theHtmlBody), currentHashCode, theHtmlBody);
        }
        {
            String theInReplyTo;
            theInReplyTo = this.getInReplyTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inReplyTo", theInReplyTo), currentHashCode, theInReplyTo);
        }
        {
            SendEmailOptOutPolicy theOptOutPolicy;
            theOptOutPolicy = this.getOptOutPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optOutPolicy", theOptOutPolicy), currentHashCode, theOptOutPolicy);
        }
        {
            String theOrgWideEmailAddressId;
            theOrgWideEmailAddressId = this.getOrgWideEmailAddressId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgWideEmailAddressId", theOrgWideEmailAddressId), currentHashCode, theOrgWideEmailAddressId);
        }
        {
            String thePlainTextBody;
            thePlainTextBody = this.getPlainTextBody();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plainTextBody", thePlainTextBody), currentHashCode, thePlainTextBody);
        }
        {
            String theReferences;
            theReferences = this.getReferences();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "references", theReferences), currentHashCode, theReferences);
        }
        {
            String theTargetObjectId;
            theTargetObjectId = this.getTargetObjectId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetObjectId", theTargetObjectId), currentHashCode, theTargetObjectId);
        }
        {
            String theTemplateId;
            theTemplateId = this.getTemplateId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "templateId", theTemplateId), currentHashCode, theTemplateId);
        }
        {
            String theTemplateName;
            theTemplateName = this.getTemplateName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "templateName", theTemplateName), currentHashCode, theTemplateName);
        }
        {
            List<String> theToAddresses;
            theToAddresses = (((this.toAddresses!= null)&&(!this.toAddresses.isEmpty()))?this.getToAddresses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toAddresses", theToAddresses), currentHashCode, theToAddresses);
        }
        {
            Boolean theTreatBodiesAsTemplate;
            theTreatBodiesAsTemplate = this.isTreatBodiesAsTemplate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "treatBodiesAsTemplate", theTreatBodiesAsTemplate), currentHashCode, theTreatBodiesAsTemplate);
        }
        {
            Boolean theTreatTargetObjectAsRecipient;
            theTreatTargetObjectAsRecipient = this.isTreatTargetObjectAsRecipient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "treatTargetObjectAsRecipient", theTreatTargetObjectAsRecipient), currentHashCode, theTreatTargetObjectAsRecipient);
        }
        {
            String theWhatId;
            theWhatId = this.getWhatId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whatId", theWhatId), currentHashCode, theWhatId);
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
            List<String> theBccAddresses;
            theBccAddresses = (((this.bccAddresses!= null)&&(!this.bccAddresses.isEmpty()))?this.getBccAddresses():null);
            strategy.appendField(locator, this, "bccAddresses", buffer, theBccAddresses);
        }
        {
            List<String> theCcAddresses;
            theCcAddresses = (((this.ccAddresses!= null)&&(!this.ccAddresses.isEmpty()))?this.getCcAddresses():null);
            strategy.appendField(locator, this, "ccAddresses", buffer, theCcAddresses);
        }
        {
            String theCharset;
            theCharset = this.getCharset();
            strategy.appendField(locator, this, "charset", buffer, theCharset);
        }
        {
            List<String> theDocumentAttachments;
            theDocumentAttachments = (((this.documentAttachments!= null)&&(!this.documentAttachments.isEmpty()))?this.getDocumentAttachments():null);
            strategy.appendField(locator, this, "documentAttachments", buffer, theDocumentAttachments);
        }
        {
            List<String> theEntityAttachments;
            theEntityAttachments = (((this.entityAttachments!= null)&&(!this.entityAttachments.isEmpty()))?this.getEntityAttachments():null);
            strategy.appendField(locator, this, "entityAttachments", buffer, theEntityAttachments);
        }
        {
            List<EmailFileAttachment> theFileAttachments;
            theFileAttachments = (((this.fileAttachments!= null)&&(!this.fileAttachments.isEmpty()))?this.getFileAttachments():null);
            strategy.appendField(locator, this, "fileAttachments", buffer, theFileAttachments);
        }
        {
            String theHtmlBody;
            theHtmlBody = this.getHtmlBody();
            strategy.appendField(locator, this, "htmlBody", buffer, theHtmlBody);
        }
        {
            String theInReplyTo;
            theInReplyTo = this.getInReplyTo();
            strategy.appendField(locator, this, "inReplyTo", buffer, theInReplyTo);
        }
        {
            SendEmailOptOutPolicy theOptOutPolicy;
            theOptOutPolicy = this.getOptOutPolicy();
            strategy.appendField(locator, this, "optOutPolicy", buffer, theOptOutPolicy);
        }
        {
            String theOrgWideEmailAddressId;
            theOrgWideEmailAddressId = this.getOrgWideEmailAddressId();
            strategy.appendField(locator, this, "orgWideEmailAddressId", buffer, theOrgWideEmailAddressId);
        }
        {
            String thePlainTextBody;
            thePlainTextBody = this.getPlainTextBody();
            strategy.appendField(locator, this, "plainTextBody", buffer, thePlainTextBody);
        }
        {
            String theReferences;
            theReferences = this.getReferences();
            strategy.appendField(locator, this, "references", buffer, theReferences);
        }
        {
            String theTargetObjectId;
            theTargetObjectId = this.getTargetObjectId();
            strategy.appendField(locator, this, "targetObjectId", buffer, theTargetObjectId);
        }
        {
            String theTemplateId;
            theTemplateId = this.getTemplateId();
            strategy.appendField(locator, this, "templateId", buffer, theTemplateId);
        }
        {
            String theTemplateName;
            theTemplateName = this.getTemplateName();
            strategy.appendField(locator, this, "templateName", buffer, theTemplateName);
        }
        {
            List<String> theToAddresses;
            theToAddresses = (((this.toAddresses!= null)&&(!this.toAddresses.isEmpty()))?this.getToAddresses():null);
            strategy.appendField(locator, this, "toAddresses", buffer, theToAddresses);
        }
        {
            Boolean theTreatBodiesAsTemplate;
            theTreatBodiesAsTemplate = this.isTreatBodiesAsTemplate();
            strategy.appendField(locator, this, "treatBodiesAsTemplate", buffer, theTreatBodiesAsTemplate);
        }
        {
            Boolean theTreatTargetObjectAsRecipient;
            theTreatTargetObjectAsRecipient = this.isTreatTargetObjectAsRecipient();
            strategy.appendField(locator, this, "treatTargetObjectAsRecipient", buffer, theTreatTargetObjectAsRecipient);
        }
        {
            String theWhatId;
            theWhatId = this.getWhatId();
            strategy.appendField(locator, this, "whatId", buffer, theWhatId);
        }
        return buffer;
    }

}
