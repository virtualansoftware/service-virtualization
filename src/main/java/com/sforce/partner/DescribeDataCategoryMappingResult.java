
package com.sforce.partner;

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
 * <p>Java class for DescribeDataCategoryMappingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeDataCategoryMappingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataCategoryGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataCategoryGroupLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataCategoryGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataCategoryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataCategoryLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataCategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mappedEntity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mappedField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeDataCategoryMappingResult", propOrder = {
    "dataCategoryGroupId",
    "dataCategoryGroupLabel",
    "dataCategoryGroupName",
    "dataCategoryId",
    "dataCategoryLabel",
    "dataCategoryName",
    "id",
    "mappedEntity",
    "mappedField"
})
public class DescribeDataCategoryMappingResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String dataCategoryGroupId;
    @XmlElement(required = true)
    protected String dataCategoryGroupLabel;
    @XmlElement(required = true)
    protected String dataCategoryGroupName;
    @XmlElement(required = true)
    protected String dataCategoryId;
    @XmlElement(required = true)
    protected String dataCategoryLabel;
    @XmlElement(required = true)
    protected String dataCategoryName;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String mappedEntity;
    @XmlElement(required = true)
    protected String mappedField;

    /**
     * Gets the value of the dataCategoryGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCategoryGroupId() {
        return dataCategoryGroupId;
    }

    /**
     * Sets the value of the dataCategoryGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCategoryGroupId(String value) {
        this.dataCategoryGroupId = value;
    }

    /**
     * Gets the value of the dataCategoryGroupLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCategoryGroupLabel() {
        return dataCategoryGroupLabel;
    }

    /**
     * Sets the value of the dataCategoryGroupLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCategoryGroupLabel(String value) {
        this.dataCategoryGroupLabel = value;
    }

    /**
     * Gets the value of the dataCategoryGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCategoryGroupName() {
        return dataCategoryGroupName;
    }

    /**
     * Sets the value of the dataCategoryGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCategoryGroupName(String value) {
        this.dataCategoryGroupName = value;
    }

    /**
     * Gets the value of the dataCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCategoryId() {
        return dataCategoryId;
    }

    /**
     * Sets the value of the dataCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCategoryId(String value) {
        this.dataCategoryId = value;
    }

    /**
     * Gets the value of the dataCategoryLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCategoryLabel() {
        return dataCategoryLabel;
    }

    /**
     * Sets the value of the dataCategoryLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCategoryLabel(String value) {
        this.dataCategoryLabel = value;
    }

    /**
     * Gets the value of the dataCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCategoryName() {
        return dataCategoryName;
    }

    /**
     * Sets the value of the dataCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCategoryName(String value) {
        this.dataCategoryName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mappedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedEntity() {
        return mappedEntity;
    }

    /**
     * Sets the value of the mappedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedEntity(String value) {
        this.mappedEntity = value;
    }

    /**
     * Gets the value of the mappedField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedField() {
        return mappedField;
    }

    /**
     * Sets the value of the mappedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedField(String value) {
        this.mappedField = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeDataCategoryMappingResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeDataCategoryMappingResult that = ((DescribeDataCategoryMappingResult) object);
        {
            String lhsDataCategoryGroupId;
            lhsDataCategoryGroupId = this.getDataCategoryGroupId();
            String rhsDataCategoryGroupId;
            rhsDataCategoryGroupId = that.getDataCategoryGroupId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataCategoryGroupId", lhsDataCategoryGroupId), LocatorUtils.property(thatLocator, "dataCategoryGroupId", rhsDataCategoryGroupId), lhsDataCategoryGroupId, rhsDataCategoryGroupId)) {
                return false;
            }
        }
        {
            String lhsDataCategoryGroupLabel;
            lhsDataCategoryGroupLabel = this.getDataCategoryGroupLabel();
            String rhsDataCategoryGroupLabel;
            rhsDataCategoryGroupLabel = that.getDataCategoryGroupLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataCategoryGroupLabel", lhsDataCategoryGroupLabel), LocatorUtils.property(thatLocator, "dataCategoryGroupLabel", rhsDataCategoryGroupLabel), lhsDataCategoryGroupLabel, rhsDataCategoryGroupLabel)) {
                return false;
            }
        }
        {
            String lhsDataCategoryGroupName;
            lhsDataCategoryGroupName = this.getDataCategoryGroupName();
            String rhsDataCategoryGroupName;
            rhsDataCategoryGroupName = that.getDataCategoryGroupName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataCategoryGroupName", lhsDataCategoryGroupName), LocatorUtils.property(thatLocator, "dataCategoryGroupName", rhsDataCategoryGroupName), lhsDataCategoryGroupName, rhsDataCategoryGroupName)) {
                return false;
            }
        }
        {
            String lhsDataCategoryId;
            lhsDataCategoryId = this.getDataCategoryId();
            String rhsDataCategoryId;
            rhsDataCategoryId = that.getDataCategoryId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataCategoryId", lhsDataCategoryId), LocatorUtils.property(thatLocator, "dataCategoryId", rhsDataCategoryId), lhsDataCategoryId, rhsDataCategoryId)) {
                return false;
            }
        }
        {
            String lhsDataCategoryLabel;
            lhsDataCategoryLabel = this.getDataCategoryLabel();
            String rhsDataCategoryLabel;
            rhsDataCategoryLabel = that.getDataCategoryLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataCategoryLabel", lhsDataCategoryLabel), LocatorUtils.property(thatLocator, "dataCategoryLabel", rhsDataCategoryLabel), lhsDataCategoryLabel, rhsDataCategoryLabel)) {
                return false;
            }
        }
        {
            String lhsDataCategoryName;
            lhsDataCategoryName = this.getDataCategoryName();
            String rhsDataCategoryName;
            rhsDataCategoryName = that.getDataCategoryName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataCategoryName", lhsDataCategoryName), LocatorUtils.property(thatLocator, "dataCategoryName", rhsDataCategoryName), lhsDataCategoryName, rhsDataCategoryName)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsMappedEntity;
            lhsMappedEntity = this.getMappedEntity();
            String rhsMappedEntity;
            rhsMappedEntity = that.getMappedEntity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mappedEntity", lhsMappedEntity), LocatorUtils.property(thatLocator, "mappedEntity", rhsMappedEntity), lhsMappedEntity, rhsMappedEntity)) {
                return false;
            }
        }
        {
            String lhsMappedField;
            lhsMappedField = this.getMappedField();
            String rhsMappedField;
            rhsMappedField = that.getMappedField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mappedField", lhsMappedField), LocatorUtils.property(thatLocator, "mappedField", rhsMappedField), lhsMappedField, rhsMappedField)) {
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
            String theDataCategoryGroupId;
            theDataCategoryGroupId = this.getDataCategoryGroupId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataCategoryGroupId", theDataCategoryGroupId), currentHashCode, theDataCategoryGroupId);
        }
        {
            String theDataCategoryGroupLabel;
            theDataCategoryGroupLabel = this.getDataCategoryGroupLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataCategoryGroupLabel", theDataCategoryGroupLabel), currentHashCode, theDataCategoryGroupLabel);
        }
        {
            String theDataCategoryGroupName;
            theDataCategoryGroupName = this.getDataCategoryGroupName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataCategoryGroupName", theDataCategoryGroupName), currentHashCode, theDataCategoryGroupName);
        }
        {
            String theDataCategoryId;
            theDataCategoryId = this.getDataCategoryId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataCategoryId", theDataCategoryId), currentHashCode, theDataCategoryId);
        }
        {
            String theDataCategoryLabel;
            theDataCategoryLabel = this.getDataCategoryLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataCategoryLabel", theDataCategoryLabel), currentHashCode, theDataCategoryLabel);
        }
        {
            String theDataCategoryName;
            theDataCategoryName = this.getDataCategoryName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataCategoryName", theDataCategoryName), currentHashCode, theDataCategoryName);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theMappedEntity;
            theMappedEntity = this.getMappedEntity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mappedEntity", theMappedEntity), currentHashCode, theMappedEntity);
        }
        {
            String theMappedField;
            theMappedField = this.getMappedField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mappedField", theMappedField), currentHashCode, theMappedField);
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
            String theDataCategoryGroupId;
            theDataCategoryGroupId = this.getDataCategoryGroupId();
            strategy.appendField(locator, this, "dataCategoryGroupId", buffer, theDataCategoryGroupId);
        }
        {
            String theDataCategoryGroupLabel;
            theDataCategoryGroupLabel = this.getDataCategoryGroupLabel();
            strategy.appendField(locator, this, "dataCategoryGroupLabel", buffer, theDataCategoryGroupLabel);
        }
        {
            String theDataCategoryGroupName;
            theDataCategoryGroupName = this.getDataCategoryGroupName();
            strategy.appendField(locator, this, "dataCategoryGroupName", buffer, theDataCategoryGroupName);
        }
        {
            String theDataCategoryId;
            theDataCategoryId = this.getDataCategoryId();
            strategy.appendField(locator, this, "dataCategoryId", buffer, theDataCategoryId);
        }
        {
            String theDataCategoryLabel;
            theDataCategoryLabel = this.getDataCategoryLabel();
            strategy.appendField(locator, this, "dataCategoryLabel", buffer, theDataCategoryLabel);
        }
        {
            String theDataCategoryName;
            theDataCategoryName = this.getDataCategoryName();
            strategy.appendField(locator, this, "dataCategoryName", buffer, theDataCategoryName);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theMappedEntity;
            theMappedEntity = this.getMappedEntity();
            strategy.appendField(locator, this, "mappedEntity", buffer, theMappedEntity);
        }
        {
            String theMappedField;
            theMappedField = this.getMappedField();
            strategy.appendField(locator, this, "mappedField", buffer, theMappedField);
        }
        return buffer;
    }

}
