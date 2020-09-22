
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
 * <p>Java class for MassEmailMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MassEmailMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}Email"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetObjectIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="250" minOccurs="0"/&gt;
 *         &lt;element name="templateId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="whatIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="250" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MassEmailMessage", propOrder = {
    "description",
    "targetObjectIds",
    "templateId",
    "whatIds"
})
public class MassEmailMessage
    extends Email
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String description;
    protected List<String> targetObjectIds;
    @XmlElement(required = true)
    protected String templateId;
    protected List<String> whatIds;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the targetObjectIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetObjectIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetObjectIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetObjectIds() {
        if (targetObjectIds == null) {
            targetObjectIds = new ArrayList<String>();
        }
        return this.targetObjectIds;
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
     * Gets the value of the whatIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whatIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhatIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWhatIds() {
        if (whatIds == null) {
            whatIds = new ArrayList<String>();
        }
        return this.whatIds;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MassEmailMessage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MassEmailMessage that = ((MassEmailMessage) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            List<String> lhsTargetObjectIds;
            lhsTargetObjectIds = (((this.targetObjectIds!= null)&&(!this.targetObjectIds.isEmpty()))?this.getTargetObjectIds():null);
            List<String> rhsTargetObjectIds;
            rhsTargetObjectIds = (((that.targetObjectIds!= null)&&(!that.targetObjectIds.isEmpty()))?that.getTargetObjectIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetObjectIds", lhsTargetObjectIds), LocatorUtils.property(thatLocator, "targetObjectIds", rhsTargetObjectIds), lhsTargetObjectIds, rhsTargetObjectIds)) {
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
            List<String> lhsWhatIds;
            lhsWhatIds = (((this.whatIds!= null)&&(!this.whatIds.isEmpty()))?this.getWhatIds():null);
            List<String> rhsWhatIds;
            rhsWhatIds = (((that.whatIds!= null)&&(!that.whatIds.isEmpty()))?that.getWhatIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whatIds", lhsWhatIds), LocatorUtils.property(thatLocator, "whatIds", rhsWhatIds), lhsWhatIds, rhsWhatIds)) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            List<String> theTargetObjectIds;
            theTargetObjectIds = (((this.targetObjectIds!= null)&&(!this.targetObjectIds.isEmpty()))?this.getTargetObjectIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetObjectIds", theTargetObjectIds), currentHashCode, theTargetObjectIds);
        }
        {
            String theTemplateId;
            theTemplateId = this.getTemplateId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "templateId", theTemplateId), currentHashCode, theTemplateId);
        }
        {
            List<String> theWhatIds;
            theWhatIds = (((this.whatIds!= null)&&(!this.whatIds.isEmpty()))?this.getWhatIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whatIds", theWhatIds), currentHashCode, theWhatIds);
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            List<String> theTargetObjectIds;
            theTargetObjectIds = (((this.targetObjectIds!= null)&&(!this.targetObjectIds.isEmpty()))?this.getTargetObjectIds():null);
            strategy.appendField(locator, this, "targetObjectIds", buffer, theTargetObjectIds);
        }
        {
            String theTemplateId;
            theTemplateId = this.getTemplateId();
            strategy.appendField(locator, this, "templateId", buffer, theTemplateId);
        }
        {
            List<String> theWhatIds;
            theWhatIds = (((this.whatIds!= null)&&(!this.whatIds.isEmpty()))?this.getWhatIds():null);
            strategy.appendField(locator, this, "whatIds", buffer, theWhatIds);
        }
        return buffer;
    }

}
