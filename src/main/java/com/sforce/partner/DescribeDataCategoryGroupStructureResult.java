
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
 * <p>Java class for DescribeDataCategoryGroupStructureResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeDataCategoryGroupStructureResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sobject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="topCategories" type="{urn:partner.soap.sforce.com}DataCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeDataCategoryGroupStructureResult", propOrder = {
    "description",
    "label",
    "name",
    "sobject",
    "topCategories"
})
public class DescribeDataCategoryGroupStructureResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String sobject;
    protected List<DataCategory> topCategories;

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
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Gets the value of the sobject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobject() {
        return sobject;
    }

    /**
     * Sets the value of the sobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobject(String value) {
        this.sobject = value;
    }

    /**
     * Gets the value of the topCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataCategory }
     * 
     * 
     */
    public List<DataCategory> getTopCategories() {
        if (topCategories == null) {
            topCategories = new ArrayList<DataCategory>();
        }
        return this.topCategories;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeDataCategoryGroupStructureResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeDataCategoryGroupStructureResult that = ((DescribeDataCategoryGroupStructureResult) object);
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
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
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
            String lhsSobject;
            lhsSobject = this.getSobject();
            String rhsSobject;
            rhsSobject = that.getSobject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobject", lhsSobject), LocatorUtils.property(thatLocator, "sobject", rhsSobject), lhsSobject, rhsSobject)) {
                return false;
            }
        }
        {
            List<DataCategory> lhsTopCategories;
            lhsTopCategories = (((this.topCategories!= null)&&(!this.topCategories.isEmpty()))?this.getTopCategories():null);
            List<DataCategory> rhsTopCategories;
            rhsTopCategories = (((that.topCategories!= null)&&(!that.topCategories.isEmpty()))?that.getTopCategories():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topCategories", lhsTopCategories), LocatorUtils.property(thatLocator, "topCategories", rhsTopCategories), lhsTopCategories, rhsTopCategories)) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theSobject;
            theSobject = this.getSobject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobject", theSobject), currentHashCode, theSobject);
        }
        {
            List<DataCategory> theTopCategories;
            theTopCategories = (((this.topCategories!= null)&&(!this.topCategories.isEmpty()))?this.getTopCategories():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topCategories", theTopCategories), currentHashCode, theTopCategories);
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theSobject;
            theSobject = this.getSobject();
            strategy.appendField(locator, this, "sobject", buffer, theSobject);
        }
        {
            List<DataCategory> theTopCategories;
            theTopCategories = (((this.topCategories!= null)&&(!this.topCategories.isEmpty()))?this.getTopCategories():null);
            strategy.appendField(locator, this, "topCategories", buffer, theTopCategories);
        }
        return buffer;
    }

}
