
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="picklistValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordTypeIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sObjectType",
    "picklistValue",
    "recordTypeIds"
})
@XmlRootElement(name = "describePathAssistants")
public class DescribePathAssistants
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String sObjectType;
    @XmlElement(required = true, nillable = true)
    protected String picklistValue;
    protected List<String> recordTypeIds;

    /**
     * Gets the value of the sObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObjectType() {
        return sObjectType;
    }

    /**
     * Sets the value of the sObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObjectType(String value) {
        this.sObjectType = value;
    }

    /**
     * Gets the value of the picklistValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicklistValue() {
        return picklistValue;
    }

    /**
     * Sets the value of the picklistValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicklistValue(String value) {
        this.picklistValue = value;
    }

    /**
     * Gets the value of the recordTypeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTypeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTypeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecordTypeIds() {
        if (recordTypeIds == null) {
            recordTypeIds = new ArrayList<String>();
        }
        return this.recordTypeIds;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribePathAssistants)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribePathAssistants that = ((DescribePathAssistants) object);
        {
            String lhsSObjectType;
            lhsSObjectType = this.getSObjectType();
            String rhsSObjectType;
            rhsSObjectType = that.getSObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sObjectType", lhsSObjectType), LocatorUtils.property(thatLocator, "sObjectType", rhsSObjectType), lhsSObjectType, rhsSObjectType)) {
                return false;
            }
        }
        {
            String lhsPicklistValue;
            lhsPicklistValue = this.getPicklistValue();
            String rhsPicklistValue;
            rhsPicklistValue = that.getPicklistValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picklistValue", lhsPicklistValue), LocatorUtils.property(thatLocator, "picklistValue", rhsPicklistValue), lhsPicklistValue, rhsPicklistValue)) {
                return false;
            }
        }
        {
            List<String> lhsRecordTypeIds;
            lhsRecordTypeIds = (((this.recordTypeIds!= null)&&(!this.recordTypeIds.isEmpty()))?this.getRecordTypeIds():null);
            List<String> rhsRecordTypeIds;
            rhsRecordTypeIds = (((that.recordTypeIds!= null)&&(!that.recordTypeIds.isEmpty()))?that.getRecordTypeIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeIds", lhsRecordTypeIds), LocatorUtils.property(thatLocator, "recordTypeIds", rhsRecordTypeIds), lhsRecordTypeIds, rhsRecordTypeIds)) {
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
            String theSObjectType;
            theSObjectType = this.getSObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObjectType", theSObjectType), currentHashCode, theSObjectType);
        }
        {
            String thePicklistValue;
            thePicklistValue = this.getPicklistValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistValue", thePicklistValue), currentHashCode, thePicklistValue);
        }
        {
            List<String> theRecordTypeIds;
            theRecordTypeIds = (((this.recordTypeIds!= null)&&(!this.recordTypeIds.isEmpty()))?this.getRecordTypeIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeIds", theRecordTypeIds), currentHashCode, theRecordTypeIds);
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
            String theSObjectType;
            theSObjectType = this.getSObjectType();
            strategy.appendField(locator, this, "sObjectType", buffer, theSObjectType);
        }
        {
            String thePicklistValue;
            thePicklistValue = this.getPicklistValue();
            strategy.appendField(locator, this, "picklistValue", buffer, thePicklistValue);
        }
        {
            List<String> theRecordTypeIds;
            theRecordTypeIds = (((this.recordTypeIds!= null)&&(!this.recordTypeIds.isEmpty()))?this.getRecordTypeIds():null);
            strategy.appendField(locator, this, "recordTypeIds", buffer, theRecordTypeIds);
        }
        return buffer;
    }

}
