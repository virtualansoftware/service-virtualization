
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
 * <p>Java class for DescribeTab complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeTab"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="colors" type="{urn:partner.soap.sforce.com}DescribeColor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="icons" type="{urn:partner.soap.sforce.com}DescribeIcon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="miniIconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sobjectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeTab", propOrder = {
    "colors",
    "custom",
    "iconUrl",
    "icons",
    "label",
    "miniIconUrl",
    "name",
    "sobjectName",
    "url"
})
public class DescribeTab
    implements Equals, HashCode, ToString
{

    protected List<DescribeColor> colors;
    protected boolean custom;
    @XmlElement(required = true)
    protected String iconUrl;
    protected List<DescribeIcon> icons;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String miniIconUrl;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String sobjectName;
    @XmlElement(required = true)
    protected String url;

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
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
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
     * Gets the value of the sobjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobjectName() {
        return sobjectName;
    }

    /**
     * Sets the value of the sobjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobjectName(String value) {
        this.sobjectName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeTab)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeTab that = ((DescribeTab) object);
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
            boolean lhsCustom;
            lhsCustom = (true?this.isCustom():false);
            boolean rhsCustom;
            rhsCustom = (true?that.isCustom():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "custom", lhsCustom), LocatorUtils.property(thatLocator, "custom", rhsCustom), lhsCustom, rhsCustom)) {
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsSobjectName;
            lhsSobjectName = this.getSobjectName();
            String rhsSobjectName;
            rhsSobjectName = that.getSobjectName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobjectName", lhsSobjectName), LocatorUtils.property(thatLocator, "sobjectName", rhsSobjectName), lhsSobjectName, rhsSobjectName)) {
                return false;
            }
        }
        {
            String lhsUrl;
            lhsUrl = this.getUrl();
            String rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
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
            List<DescribeColor> theColors;
            theColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colors", theColors), currentHashCode, theColors);
        }
        {
            boolean theCustom;
            theCustom = (true?this.isCustom():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "custom", theCustom), currentHashCode, theCustom);
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theSobjectName;
            theSobjectName = this.getSobjectName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobjectName", theSobjectName), currentHashCode, theSobjectName);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theUrl), currentHashCode, theUrl);
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
            List<DescribeColor> theColors;
            theColors = (((this.colors!= null)&&(!this.colors.isEmpty()))?this.getColors():null);
            strategy.appendField(locator, this, "colors", buffer, theColors);
        }
        {
            boolean theCustom;
            theCustom = (true?this.isCustom():false);
            strategy.appendField(locator, this, "custom", buffer, theCustom);
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theSobjectName;
            theSobjectName = this.getSobjectName();
            strategy.appendField(locator, this, "sobjectName", buffer, theSobjectName);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        return buffer;
    }

}
