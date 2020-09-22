
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
 * <p>Java class for DescribeCompactLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeCompactLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actions" type="{urn:partner.soap.sforce.com}DescribeLayoutButton" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fieldItems" type="{urn:partner.soap.sforce.com}DescribeLayoutItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="imageItems" type="{urn:partner.soap.sforce.com}DescribeLayoutItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeCompactLayout", propOrder = {
    "actions",
    "fieldItems",
    "id",
    "imageItems",
    "label",
    "name",
    "objectType"
})
public class DescribeCompactLayout
    implements Equals, HashCode, ToString
{

    protected List<DescribeLayoutButton> actions;
    protected List<DescribeLayoutItem> fieldItems;
    @XmlElement(required = true)
    protected String id;
    protected List<DescribeLayoutItem> imageItems;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String objectType;

    /**
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutButton }
     * 
     * 
     */
    public List<DescribeLayoutButton> getActions() {
        if (actions == null) {
            actions = new ArrayList<DescribeLayoutButton>();
        }
        return this.actions;
    }

    /**
     * Gets the value of the fieldItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutItem }
     * 
     * 
     */
    public List<DescribeLayoutItem> getFieldItems() {
        if (fieldItems == null) {
            fieldItems = new ArrayList<DescribeLayoutItem>();
        }
        return this.fieldItems;
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
     * Gets the value of the imageItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutItem }
     * 
     * 
     */
    public List<DescribeLayoutItem> getImageItems() {
        if (imageItems == null) {
            imageItems = new ArrayList<DescribeLayoutItem>();
        }
        return this.imageItems;
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
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeCompactLayout)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeCompactLayout that = ((DescribeCompactLayout) object);
        {
            List<DescribeLayoutButton> lhsActions;
            lhsActions = (((this.actions!= null)&&(!this.actions.isEmpty()))?this.getActions():null);
            List<DescribeLayoutButton> rhsActions;
            rhsActions = (((that.actions!= null)&&(!that.actions.isEmpty()))?that.getActions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actions", lhsActions), LocatorUtils.property(thatLocator, "actions", rhsActions), lhsActions, rhsActions)) {
                return false;
            }
        }
        {
            List<DescribeLayoutItem> lhsFieldItems;
            lhsFieldItems = (((this.fieldItems!= null)&&(!this.fieldItems.isEmpty()))?this.getFieldItems():null);
            List<DescribeLayoutItem> rhsFieldItems;
            rhsFieldItems = (((that.fieldItems!= null)&&(!that.fieldItems.isEmpty()))?that.getFieldItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldItems", lhsFieldItems), LocatorUtils.property(thatLocator, "fieldItems", rhsFieldItems), lhsFieldItems, rhsFieldItems)) {
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
            List<DescribeLayoutItem> lhsImageItems;
            lhsImageItems = (((this.imageItems!= null)&&(!this.imageItems.isEmpty()))?this.getImageItems():null);
            List<DescribeLayoutItem> rhsImageItems;
            rhsImageItems = (((that.imageItems!= null)&&(!that.imageItems.isEmpty()))?that.getImageItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imageItems", lhsImageItems), LocatorUtils.property(thatLocator, "imageItems", rhsImageItems), lhsImageItems, rhsImageItems)) {
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
            String lhsObjectType;
            lhsObjectType = this.getObjectType();
            String rhsObjectType;
            rhsObjectType = that.getObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectType", lhsObjectType), LocatorUtils.property(thatLocator, "objectType", rhsObjectType), lhsObjectType, rhsObjectType)) {
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
            List<DescribeLayoutButton> theActions;
            theActions = (((this.actions!= null)&&(!this.actions.isEmpty()))?this.getActions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actions", theActions), currentHashCode, theActions);
        }
        {
            List<DescribeLayoutItem> theFieldItems;
            theFieldItems = (((this.fieldItems!= null)&&(!this.fieldItems.isEmpty()))?this.getFieldItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldItems", theFieldItems), currentHashCode, theFieldItems);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            List<DescribeLayoutItem> theImageItems;
            theImageItems = (((this.imageItems!= null)&&(!this.imageItems.isEmpty()))?this.getImageItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imageItems", theImageItems), currentHashCode, theImageItems);
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
            String theObjectType;
            theObjectType = this.getObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectType", theObjectType), currentHashCode, theObjectType);
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
            List<DescribeLayoutButton> theActions;
            theActions = (((this.actions!= null)&&(!this.actions.isEmpty()))?this.getActions():null);
            strategy.appendField(locator, this, "actions", buffer, theActions);
        }
        {
            List<DescribeLayoutItem> theFieldItems;
            theFieldItems = (((this.fieldItems!= null)&&(!this.fieldItems.isEmpty()))?this.getFieldItems():null);
            strategy.appendField(locator, this, "fieldItems", buffer, theFieldItems);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            List<DescribeLayoutItem> theImageItems;
            theImageItems = (((this.imageItems!= null)&&(!this.imageItems.isEmpty()))?this.getImageItems():null);
            strategy.appendField(locator, this, "imageItems", buffer, theImageItems);
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
            String theObjectType;
            theObjectType = this.getObjectType();
            strategy.appendField(locator, this, "objectType", buffer, theObjectType);
        }
        return buffer;
    }

}
