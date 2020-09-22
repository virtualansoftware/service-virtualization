
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
 * <p>Java class for RenderEmailTemplateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenderEmailTemplateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escapeHtmlInMergeFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="templateBodies" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="10"/&gt;
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
@XmlType(name = "RenderEmailTemplateRequest", propOrder = {
    "escapeHtmlInMergeFields",
    "templateBodies",
    "whatId",
    "whoId"
})
public class RenderEmailTemplateRequest
    implements Equals, HashCode, ToString
{

    protected Boolean escapeHtmlInMergeFields;
    @XmlElement(required = true)
    protected List<String> templateBodies;
    protected String whatId;
    protected String whoId;

    /**
     * Gets the value of the escapeHtmlInMergeFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscapeHtmlInMergeFields() {
        return escapeHtmlInMergeFields;
    }

    /**
     * Sets the value of the escapeHtmlInMergeFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscapeHtmlInMergeFields(Boolean value) {
        this.escapeHtmlInMergeFields = value;
    }

    /**
     * Gets the value of the templateBodies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateBodies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateBodies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTemplateBodies() {
        if (templateBodies == null) {
            templateBodies = new ArrayList<String>();
        }
        return this.templateBodies;
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
        if (!(object instanceof RenderEmailTemplateRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RenderEmailTemplateRequest that = ((RenderEmailTemplateRequest) object);
        {
            Boolean lhsEscapeHtmlInMergeFields;
            lhsEscapeHtmlInMergeFields = this.isEscapeHtmlInMergeFields();
            Boolean rhsEscapeHtmlInMergeFields;
            rhsEscapeHtmlInMergeFields = that.isEscapeHtmlInMergeFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "escapeHtmlInMergeFields", lhsEscapeHtmlInMergeFields), LocatorUtils.property(thatLocator, "escapeHtmlInMergeFields", rhsEscapeHtmlInMergeFields), lhsEscapeHtmlInMergeFields, rhsEscapeHtmlInMergeFields)) {
                return false;
            }
        }
        {
            List<String> lhsTemplateBodies;
            lhsTemplateBodies = (((this.templateBodies!= null)&&(!this.templateBodies.isEmpty()))?this.getTemplateBodies():null);
            List<String> rhsTemplateBodies;
            rhsTemplateBodies = (((that.templateBodies!= null)&&(!that.templateBodies.isEmpty()))?that.getTemplateBodies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "templateBodies", lhsTemplateBodies), LocatorUtils.property(thatLocator, "templateBodies", rhsTemplateBodies), lhsTemplateBodies, rhsTemplateBodies)) {
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
            Boolean theEscapeHtmlInMergeFields;
            theEscapeHtmlInMergeFields = this.isEscapeHtmlInMergeFields();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "escapeHtmlInMergeFields", theEscapeHtmlInMergeFields), currentHashCode, theEscapeHtmlInMergeFields);
        }
        {
            List<String> theTemplateBodies;
            theTemplateBodies = (((this.templateBodies!= null)&&(!this.templateBodies.isEmpty()))?this.getTemplateBodies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "templateBodies", theTemplateBodies), currentHashCode, theTemplateBodies);
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
            Boolean theEscapeHtmlInMergeFields;
            theEscapeHtmlInMergeFields = this.isEscapeHtmlInMergeFields();
            strategy.appendField(locator, this, "escapeHtmlInMergeFields", buffer, theEscapeHtmlInMergeFields);
        }
        {
            List<String> theTemplateBodies;
            theTemplateBodies = (((this.templateBodies!= null)&&(!this.templateBodies.isEmpty()))?this.getTemplateBodies():null);
            strategy.appendField(locator, this, "templateBodies", buffer, theTemplateBodies);
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
