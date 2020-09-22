
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
 * <p>Java class for DescribeFlexiPageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeFlexiPageResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quickActionList" type="{urn:partner.soap.sforce.com}DescribeQuickActionListResult" minOccurs="0"/&gt;
 *         &lt;element name="regions" type="{urn:partner.soap.sforce.com}DescribeFlexiPageRegion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sobjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeFlexiPageResult", propOrder = {
    "id",
    "label",
    "name",
    "quickActionList",
    "regions",
    "sobjectType",
    "template",
    "type"
})
public class DescribeFlexiPageResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    protected DescribeQuickActionListResult quickActionList;
    protected List<DescribeFlexiPageRegion> regions;
    @XmlElement(nillable = true)
    protected String sobjectType;
    @XmlElement(required = true, nillable = true)
    protected String template;
    @XmlElement(required = true)
    protected String type;

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
     * Gets the value of the quickActionList property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeQuickActionListResult }
     *     
     */
    public DescribeQuickActionListResult getQuickActionList() {
        return quickActionList;
    }

    /**
     * Sets the value of the quickActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeQuickActionListResult }
     *     
     */
    public void setQuickActionList(DescribeQuickActionListResult value) {
        this.quickActionList = value;
    }

    /**
     * Gets the value of the regions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeFlexiPageRegion }
     * 
     * 
     */
    public List<DescribeFlexiPageRegion> getRegions() {
        if (regions == null) {
            regions = new ArrayList<DescribeFlexiPageRegion>();
        }
        return this.regions;
    }

    /**
     * Gets the value of the sobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobjectType() {
        return sobjectType;
    }

    /**
     * Sets the value of the sobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobjectType(String value) {
        this.sobjectType = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeFlexiPageResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeFlexiPageResult that = ((DescribeFlexiPageResult) object);
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
            DescribeQuickActionListResult lhsQuickActionList;
            lhsQuickActionList = this.getQuickActionList();
            DescribeQuickActionListResult rhsQuickActionList;
            rhsQuickActionList = that.getQuickActionList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quickActionList", lhsQuickActionList), LocatorUtils.property(thatLocator, "quickActionList", rhsQuickActionList), lhsQuickActionList, rhsQuickActionList)) {
                return false;
            }
        }
        {
            List<DescribeFlexiPageRegion> lhsRegions;
            lhsRegions = (((this.regions!= null)&&(!this.regions.isEmpty()))?this.getRegions():null);
            List<DescribeFlexiPageRegion> rhsRegions;
            rhsRegions = (((that.regions!= null)&&(!that.regions.isEmpty()))?that.getRegions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regions", lhsRegions), LocatorUtils.property(thatLocator, "regions", rhsRegions), lhsRegions, rhsRegions)) {
                return false;
            }
        }
        {
            String lhsSobjectType;
            lhsSobjectType = this.getSobjectType();
            String rhsSobjectType;
            rhsSobjectType = that.getSobjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobjectType", lhsSobjectType), LocatorUtils.property(thatLocator, "sobjectType", rhsSobjectType), lhsSobjectType, rhsSobjectType)) {
                return false;
            }
        }
        {
            String lhsTemplate;
            lhsTemplate = this.getTemplate();
            String rhsTemplate;
            rhsTemplate = that.getTemplate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "template", lhsTemplate), LocatorUtils.property(thatLocator, "template", rhsTemplate), lhsTemplate, rhsTemplate)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
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
            DescribeQuickActionListResult theQuickActionList;
            theQuickActionList = this.getQuickActionList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quickActionList", theQuickActionList), currentHashCode, theQuickActionList);
        }
        {
            List<DescribeFlexiPageRegion> theRegions;
            theRegions = (((this.regions!= null)&&(!this.regions.isEmpty()))?this.getRegions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regions", theRegions), currentHashCode, theRegions);
        }
        {
            String theSobjectType;
            theSobjectType = this.getSobjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobjectType", theSobjectType), currentHashCode, theSobjectType);
        }
        {
            String theTemplate;
            theTemplate = this.getTemplate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "template", theTemplate), currentHashCode, theTemplate);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
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
            DescribeQuickActionListResult theQuickActionList;
            theQuickActionList = this.getQuickActionList();
            strategy.appendField(locator, this, "quickActionList", buffer, theQuickActionList);
        }
        {
            List<DescribeFlexiPageRegion> theRegions;
            theRegions = (((this.regions!= null)&&(!this.regions.isEmpty()))?this.getRegions():null);
            strategy.appendField(locator, this, "regions", buffer, theRegions);
        }
        {
            String theSobjectType;
            theSobjectType = this.getSobjectType();
            strategy.appendField(locator, this, "sobjectType", buffer, theSobjectType);
        }
        {
            String theTemplate;
            theTemplate = this.getTemplate();
            strategy.appendField(locator, this, "template", buffer, theTemplate);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        return buffer;
    }

}
