
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
 * <p>Java class for EmailSyncFieldMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailSyncFieldMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clientType" type="{urn:partner.soap.sforce.com}EmailSyncClientFieldType"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{urn:partner.soap.sforce.com}fieldType"/&gt;
 *         &lt;element name="usedForMatching" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="valueMapping" type="{urn:partner.soap.sforce.com}EmailSyncFieldValueMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailSyncFieldMapping", propOrder = {
    "clientName",
    "clientType",
    "name",
    "type",
    "usedForMatching",
    "valueMappings"
})
public class EmailSyncFieldMapping
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String clientName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EmailSyncClientFieldType clientType;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FieldType type;
    protected boolean usedForMatching;
    @XmlElement(name = "valueMapping")
    protected List<EmailSyncFieldValueMapping> valueMappings;

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link EmailSyncClientFieldType }
     *     
     */
    public EmailSyncClientFieldType getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailSyncClientFieldType }
     *     
     */
    public void setClientType(EmailSyncClientFieldType value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setType(FieldType value) {
        this.type = value;
    }

    /**
     * Gets the value of the usedForMatching property.
     * 
     */
    public boolean isUsedForMatching() {
        return usedForMatching;
    }

    /**
     * Sets the value of the usedForMatching property.
     * 
     */
    public void setUsedForMatching(boolean value) {
        this.usedForMatching = value;
    }

    /**
     * Gets the value of the valueMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailSyncFieldValueMapping }
     * 
     * 
     */
    public List<EmailSyncFieldValueMapping> getValueMappings() {
        if (valueMappings == null) {
            valueMappings = new ArrayList<EmailSyncFieldValueMapping>();
        }
        return this.valueMappings;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EmailSyncFieldMapping)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EmailSyncFieldMapping that = ((EmailSyncFieldMapping) object);
        {
            String lhsClientName;
            lhsClientName = this.getClientName();
            String rhsClientName;
            rhsClientName = that.getClientName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientName", lhsClientName), LocatorUtils.property(thatLocator, "clientName", rhsClientName), lhsClientName, rhsClientName)) {
                return false;
            }
        }
        {
            EmailSyncClientFieldType lhsClientType;
            lhsClientType = this.getClientType();
            EmailSyncClientFieldType rhsClientType;
            rhsClientType = that.getClientType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientType", lhsClientType), LocatorUtils.property(thatLocator, "clientType", rhsClientType), lhsClientType, rhsClientType)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            FieldType lhsType;
            lhsType = this.getType();
            FieldType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            boolean lhsUsedForMatching;
            lhsUsedForMatching = (true?this.isUsedForMatching():false);
            boolean rhsUsedForMatching;
            rhsUsedForMatching = (true?that.isUsedForMatching():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usedForMatching", lhsUsedForMatching), LocatorUtils.property(thatLocator, "usedForMatching", rhsUsedForMatching), lhsUsedForMatching, rhsUsedForMatching)) {
                return false;
            }
        }
        {
            List<EmailSyncFieldValueMapping> lhsValueMappings;
            lhsValueMappings = (((this.valueMappings!= null)&&(!this.valueMappings.isEmpty()))?this.getValueMappings():null);
            List<EmailSyncFieldValueMapping> rhsValueMappings;
            rhsValueMappings = (((that.valueMappings!= null)&&(!that.valueMappings.isEmpty()))?that.getValueMappings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueMappings", lhsValueMappings), LocatorUtils.property(thatLocator, "valueMappings", rhsValueMappings), lhsValueMappings, rhsValueMappings)) {
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
            String theClientName;
            theClientName = this.getClientName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientName", theClientName), currentHashCode, theClientName);
        }
        {
            EmailSyncClientFieldType theClientType;
            theClientType = this.getClientType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientType", theClientType), currentHashCode, theClientType);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            FieldType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            boolean theUsedForMatching;
            theUsedForMatching = (true?this.isUsedForMatching():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usedForMatching", theUsedForMatching), currentHashCode, theUsedForMatching);
        }
        {
            List<EmailSyncFieldValueMapping> theValueMappings;
            theValueMappings = (((this.valueMappings!= null)&&(!this.valueMappings.isEmpty()))?this.getValueMappings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueMappings", theValueMappings), currentHashCode, theValueMappings);
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
            String theClientName;
            theClientName = this.getClientName();
            strategy.appendField(locator, this, "clientName", buffer, theClientName);
        }
        {
            EmailSyncClientFieldType theClientType;
            theClientType = this.getClientType();
            strategy.appendField(locator, this, "clientType", buffer, theClientType);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            FieldType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            boolean theUsedForMatching;
            theUsedForMatching = (true?this.isUsedForMatching():false);
            strategy.appendField(locator, this, "usedForMatching", buffer, theUsedForMatching);
        }
        {
            List<EmailSyncFieldValueMapping> theValueMappings;
            theValueMappings = (((this.valueMappings!= null)&&(!this.valueMappings.isEmpty()))?this.getValueMappings():null);
            strategy.appendField(locator, this, "valueMappings", buffer, theValueMappings);
        }
        return buffer;
    }

}
