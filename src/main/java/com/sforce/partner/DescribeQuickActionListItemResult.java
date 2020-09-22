
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
 * <p>Java class for DescribeQuickActionListItemResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeQuickActionListItemResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessLevelRequired" type="{urn:partner.soap.sforce.com}ShareAccessLevel"/&gt;
 *         &lt;element name="colors" type="{urn:partner.soap.sforce.com}DescribeColor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="iconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="icons" type="{urn:partner.soap.sforce.com}DescribeIcon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="miniIconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quickActionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetSobjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "DescribeQuickActionListItemResult", propOrder = {
    "accessLevelRequired",
    "colors",
    "iconUrl",
    "icons",
    "label",
    "miniIconUrl",
    "quickActionName",
    "targetSobjectType",
    "type"
})
public class DescribeQuickActionListItemResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ShareAccessLevel accessLevelRequired;
    protected List<DescribeColor> colors;
    @XmlElement(required = true, nillable = true)
    protected String iconUrl;
    protected List<DescribeIcon> icons;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String miniIconUrl;
    @XmlElement(required = true)
    protected String quickActionName;
    @XmlElement(required = true, nillable = true)
    protected String targetSobjectType;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the accessLevelRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevel }
     *     
     */
    public ShareAccessLevel getAccessLevelRequired() {
        return accessLevelRequired;
    }

    /**
     * Sets the value of the accessLevelRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevel }
     *     
     */
    public void setAccessLevelRequired(ShareAccessLevel value) {
        this.accessLevelRequired = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeColor }
     * 
     * 
     */
    public List<DescribeColor> getColors() {
        if (colors == null) {
            colors = new ArrayList<DescribeColor>();
        }
        return this.colors;
    }

    /**
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrl(String value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the icons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeIcon }
     * 
     * 
     */
    public List<DescribeIcon> getIcons() {
        if (icons == null) {
            icons = new ArrayList<DescribeIcon>();
        }
        return this.icons;
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
     * Gets the value of the miniIconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiniIconUrl() {
        return miniIconUrl;
    }

    /**
     * Sets the value of the miniIconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiniIconUrl(String value) {
        this.miniIconUrl = value;
    }

    /**
     * Gets the value of the quickActionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickActionName() {
        return quickActionName;
    }

    /**
     * Sets the value of the quickActionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickActionName(String value) {
        this.quickActionName = value;
    }

    /**
     * Gets the value of the targetSobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSobjectType() {
        return targetSobjectType;
    }

    /**
     * Sets the value of the targetSobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSobjectType(String value) {
        this.targetSobjectType = value;
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
        if (!(object instanceof DescribeQuickActionListItemResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeQuickActionListItemResult that = ((DescribeQuickActionListItemResult) object);
        {
            ShareAccessLevel lhsAccessLevelRequired;
            lhsAccessLevelRequired = this.getAccessLevelRequired();
            ShareAccessLevel rhsAccessLevelRequired;
            rhsAccessLevelRequired = that.getAccessLevelRequired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessLevelRequired", lhsAccessLevelRequired), LocatorUtils.property(thatLocator, "accessLevelRequired", rhsAccessLevelRequired), lhsAccessLevelRequired, rhsAccessLevelRequired)) {
                return false;
            }
        }
        {
            List<DescribeColor> lhsColors;
            lhsColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            List<DescribeColor> rhsColors;
            rhsColors = (((that.colors!= null)&&(!that.colors.isEmpty()))?that.getColors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colors", lhsColors), LocatorUtils.property(thatLocator, "colors", rhsColors), lhsColors, rhsColors)) {
                return false;
            }
        }
        {
            String lhsIconUrl;
            lhsIconUrl = this.getIconUrl();
            String rhsIconUrl;
            rhsIconUrl = that.getIconUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "iconUrl", lhsIconUrl), LocatorUtils.property(thatLocator, "iconUrl", rhsIconUrl), lhsIconUrl, rhsIconUrl)) {
                return false;
            }
        }
        {
            List<DescribeIcon> lhsIcons;
            lhsIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            List<DescribeIcon> rhsIcons;
            rhsIcons = (((that.icons!= null)&&(!that.icons.isEmpty()))?that.getIcons():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "icons", lhsIcons), LocatorUtils.property(thatLocator, "icons", rhsIcons), lhsIcons, rhsIcons)) {
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
            String lhsMiniIconUrl;
            lhsMiniIconUrl = this.getMiniIconUrl();
            String rhsMiniIconUrl;
            rhsMiniIconUrl = that.getMiniIconUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miniIconUrl", lhsMiniIconUrl), LocatorUtils.property(thatLocator, "miniIconUrl", rhsMiniIconUrl), lhsMiniIconUrl, rhsMiniIconUrl)) {
                return false;
            }
        }
        {
            String lhsQuickActionName;
            lhsQuickActionName = this.getQuickActionName();
            String rhsQuickActionName;
            rhsQuickActionName = that.getQuickActionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quickActionName", lhsQuickActionName), LocatorUtils.property(thatLocator, "quickActionName", rhsQuickActionName), lhsQuickActionName, rhsQuickActionName)) {
                return false;
            }
        }
        {
            String lhsTargetSobjectType;
            lhsTargetSobjectType = this.getTargetSobjectType();
            String rhsTargetSobjectType;
            rhsTargetSobjectType = that.getTargetSobjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetSobjectType", lhsTargetSobjectType), LocatorUtils.property(thatLocator, "targetSobjectType", rhsTargetSobjectType), lhsTargetSobjectType, rhsTargetSobjectType)) {
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
            ShareAccessLevel theAccessLevelRequired;
            theAccessLevelRequired = this.getAccessLevelRequired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessLevelRequired", theAccessLevelRequired), currentHashCode, theAccessLevelRequired);
        }
        {
            List<DescribeColor> theColors;
            theColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colors", theColors), currentHashCode, theColors);
        }
        {
            String theIconUrl;
            theIconUrl = this.getIconUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "iconUrl", theIconUrl), currentHashCode, theIconUrl);
        }
        {
            List<DescribeIcon> theIcons;
            theIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "icons", theIcons), currentHashCode, theIcons);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theMiniIconUrl;
            theMiniIconUrl = this.getMiniIconUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "miniIconUrl", theMiniIconUrl), currentHashCode, theMiniIconUrl);
        }
        {
            String theQuickActionName;
            theQuickActionName = this.getQuickActionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quickActionName", theQuickActionName), currentHashCode, theQuickActionName);
        }
        {
            String theTargetSobjectType;
            theTargetSobjectType = this.getTargetSobjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetSobjectType", theTargetSobjectType), currentHashCode, theTargetSobjectType);
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
            ShareAccessLevel theAccessLevelRequired;
            theAccessLevelRequired = this.getAccessLevelRequired();
            strategy.appendField(locator, this, "accessLevelRequired", buffer, theAccessLevelRequired);
        }
        {
            List<DescribeColor> theColors;
            theColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            strategy.appendField(locator, this, "colors", buffer, theColors);
        }
        {
            String theIconUrl;
            theIconUrl = this.getIconUrl();
            strategy.appendField(locator, this, "iconUrl", buffer, theIconUrl);
        }
        {
            List<DescribeIcon> theIcons;
            theIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            strategy.appendField(locator, this, "icons", buffer, theIcons);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theMiniIconUrl;
            theMiniIconUrl = this.getMiniIconUrl();
            strategy.appendField(locator, this, "miniIconUrl", buffer, theMiniIconUrl);
        }
        {
            String theQuickActionName;
            theQuickActionName = this.getQuickActionName();
            strategy.appendField(locator, this, "quickActionName", buffer, theQuickActionName);
        }
        {
            String theTargetSobjectType;
            theTargetSobjectType = this.getTargetSobjectType();
            strategy.appendField(locator, this, "targetSobjectType", buffer, theTargetSobjectType);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        return buffer;
    }

}
