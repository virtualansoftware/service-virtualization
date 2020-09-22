
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
 * <p>Java class for DescribePicklistsParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribePicklistsParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fieldNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="100"/&gt;
 *         &lt;element name="recordTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribePicklistsParam", propOrder = {
    "entityName",
    "fieldNames",
    "recordTypeId"
})
public class DescribePicklistsParam
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String entityName;
    @XmlElement(required = true)
    protected List<String> fieldNames;
    @XmlElement(required = true, nillable = true)
    protected String recordTypeId;

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the fieldNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldNames() {
        if (fieldNames == null) {
            fieldNames = new ArrayList<String>();
        }
        return this.fieldNames;
    }

    /**
     * Gets the value of the recordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * Sets the value of the recordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeId(String value) {
        this.recordTypeId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribePicklistsParam)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribePicklistsParam that = ((DescribePicklistsParam) object);
        {
            String lhsEntityName;
            lhsEntityName = this.getEntityName();
            String rhsEntityName;
            rhsEntityName = that.getEntityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityName", lhsEntityName), LocatorUtils.property(thatLocator, "entityName", rhsEntityName), lhsEntityName, rhsEntityName)) {
                return false;
            }
        }
        {
            List<String> lhsFieldNames;
            lhsFieldNames = (((this.fieldNames!= null)&&(!this.fieldNames.isEmpty()))?this.getFieldNames():null);
            List<String> rhsFieldNames;
            rhsFieldNames = (((that.fieldNames!= null)&&(!that.fieldNames.isEmpty()))?that.getFieldNames():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldNames", lhsFieldNames), LocatorUtils.property(thatLocator, "fieldNames", rhsFieldNames), lhsFieldNames, rhsFieldNames)) {
                return false;
            }
        }
        {
            String lhsRecordTypeId;
            lhsRecordTypeId = this.getRecordTypeId();
            String rhsRecordTypeId;
            rhsRecordTypeId = that.getRecordTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeId", lhsRecordTypeId), LocatorUtils.property(thatLocator, "recordTypeId", rhsRecordTypeId), lhsRecordTypeId, rhsRecordTypeId)) {
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
            String theEntityName;
            theEntityName = this.getEntityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityName", theEntityName), currentHashCode, theEntityName);
        }
        {
            List<String> theFieldNames;
            theFieldNames = (((this.fieldNames!= null)&&(!this.fieldNames.isEmpty()))?this.getFieldNames():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldNames", theFieldNames), currentHashCode, theFieldNames);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeId", theRecordTypeId), currentHashCode, theRecordTypeId);
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
            String theEntityName;
            theEntityName = this.getEntityName();
            strategy.appendField(locator, this, "entityName", buffer, theEntityName);
        }
        {
            List<String> theFieldNames;
            theFieldNames = (((this.fieldNames!= null)&&(!this.fieldNames.isEmpty()))?this.getFieldNames():null);
            strategy.appendField(locator, this, "fieldNames", buffer, theFieldNames);
        }
        {
            String theRecordTypeId;
            theRecordTypeId = this.getRecordTypeId();
            strategy.appendField(locator, this, "recordTypeId", buffer, theRecordTypeId);
        }
        return buffer;
    }

}
