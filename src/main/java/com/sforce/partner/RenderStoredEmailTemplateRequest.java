
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
 * <p>Java class for RenderStoredEmailTemplateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenderStoredEmailTemplateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentRetrievalOption" type="{urn:partner.soap.sforce.com}AttachmentRetrievalOption"/&gt;
 *         &lt;element name="templateId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="updateTemplateUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="whatId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="whoId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenderStoredEmailTemplateRequest", propOrder = {
    "attachmentRetrievalOption",
    "templateId",
    "updateTemplateUsage",
    "whatId",
    "whoId"
})
public class RenderStoredEmailTemplateRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected AttachmentRetrievalOption attachmentRetrievalOption;
    @XmlElement(required = true)
    protected String templateId;
    protected Boolean updateTemplateUsage;
    protected String whatId;
    protected String whoId;

    /**
     * Gets the value of the attachmentRetrievalOption property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentRetrievalOption }
     *     
     */
    public AttachmentRetrievalOption getAttachmentRetrievalOption() {
        return attachmentRetrievalOption;
    }

    /**
     * Sets the value of the attachmentRetrievalOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentRetrievalOption }
     *     
     */
    public void setAttachmentRetrievalOption(AttachmentRetrievalOption value) {
        this.attachmentRetrievalOption = value;
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
     * Gets the value of the updateTemplateUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateTemplateUsage() {
        return updateTemplateUsage;
    }

    /**
     * Sets the value of the updateTemplateUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateTemplateUsage(Boolean value) {
        this.updateTemplateUsage = value;
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

    /**
     * Gets the value of the whoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhoId() {
        return whoId;
    }

    /**
     * Sets the value of the whoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhoId(String value) {
        this.whoId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RenderStoredEmailTemplateRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RenderStoredEmailTemplateRequest that = ((RenderStoredEmailTemplateRequest) object);
        {
            AttachmentRetrievalOption lhsAttachmentRetrievalOption;
            lhsAttachmentRetrievalOption = this.getAttachmentRetrievalOption();
            AttachmentRetrievalOption rhsAttachmentRetrievalOption;
            rhsAttachmentRetrievalOption = that.getAttachmentRetrievalOption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachmentRetrievalOption", lhsAttachmentRetrievalOption), LocatorUtils.property(thatLocator, "attachmentRetrievalOption", rhsAttachmentRetrievalOption), lhsAttachmentRetrievalOption, rhsAttachmentRetrievalOption)) {
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
            Boolean lhsUpdateTemplateUsage;
            lhsUpdateTemplateUsage = this.isUpdateTemplateUsage();
            Boolean rhsUpdateTemplateUsage;
            rhsUpdateTemplateUsage = that.isUpdateTemplateUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateTemplateUsage", lhsUpdateTemplateUsage), LocatorUtils.property(thatLocator, "updateTemplateUsage", rhsUpdateTemplateUsage), lhsUpdateTemplateUsage, rhsUpdateTemplateUsage)) {
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
        {
            String lhsWhoId;
            lhsWhoId = this.getWhoId();
            String rhsWhoId;
            rhsWhoId = that.getWhoId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whoId", lhsWhoId), LocatorUtils.property(thatLocator, "whoId", rhsWhoId), lhsWhoId, rhsWhoId)) {
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
            AttachmentRetrievalOption theAttachmentRetrievalOption;
            theAttachmentRetrievalOption = this.getAttachmentRetrievalOption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachmentRetrievalOption", theAttachmentRetrievalOption), currentHashCode, theAttachmentRetrievalOption);
        }
        {
            String theTemplateId;
            theTemplateId = this.getTemplateId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "templateId", theTemplateId), currentHashCode, theTemplateId);
        }
        {
            Boolean theUpdateTemplateUsage;
            theUpdateTemplateUsage = this.isUpdateTemplateUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateTemplateUsage", theUpdateTemplateUsage), currentHashCode, theUpdateTemplateUsage);
        }
        {
            String theWhatId;
            theWhatId = this.getWhatId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whatId", theWhatId), currentHashCode, theWhatId);
        }
        {
            String theWhoId;
            theWhoId = this.getWhoId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whoId", theWhoId), currentHashCode, theWhoId);
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
            AttachmentRetrievalOption theAttachmentRetrievalOption;
            theAttachmentRetrievalOption = this.getAttachmentRetrievalOption();
            strategy.appendField(locator, this, "attachmentRetrievalOption", buffer, theAttachmentRetrievalOption);
        }
        {
            String theTemplateId;
            theTemplateId = this.getTemplateId();
            strategy.appendField(locator, this, "templateId", buffer, theTemplateId);
        }
        {
            Boolean theUpdateTemplateUsage;
            theUpdateTemplateUsage = this.isUpdateTemplateUsage();
            strategy.appendField(locator, this, "updateTemplateUsage", buffer, theUpdateTemplateUsage);
        }
        {
            String theWhatId;
            theWhatId = this.getWhatId();
            strategy.appendField(locator, this, "whatId", buffer, theWhatId);
        }
        {
            String theWhoId;
            theWhoId = this.getWhoId();
            strategy.appendField(locator, this, "whoId", buffer, theWhoId);
        }
        return buffer;
    }

}
