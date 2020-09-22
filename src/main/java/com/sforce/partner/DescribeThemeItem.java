
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
 * <p>Java class for DescribeThemeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeThemeItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="colors" type="{urn:partner.soap.sforce.com}DescribeColor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="icons" type="{urn:partner.soap.sforce.com}DescribeIcon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeThemeItem", propOrder = {
    "colors",
    "icons",
    "name"
})
public class DescribeThemeItem
    implements Equals, HashCode, ToString
{

    protected List<DescribeColor> colors;
    protected List<DescribeIcon> icons;
    @XmlElement(required = true)
    protected String name;

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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeThemeItem)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeThemeItem that = ((DescribeThemeItem) object);
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
            List<DescribeIcon> lhsIcons;
            lhsIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            List<DescribeIcon> rhsIcons;
            rhsIcons = (((that.icons!= null)&&(!that.icons.isEmpty()))?that.getIcons():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "icons", lhsIcons), LocatorUtils.property(thatLocator, "icons", rhsIcons), lhsIcons, rhsIcons)) {
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
            List<DescribeIcon> theIcons;
            theIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "icons", theIcons), currentHashCode, theIcons);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
            List<DescribeIcon> theIcons;
            theIcons = (((this.icons!= null)&&(!this.icons.isEmpty()))?this.getIcons():null);
            strategy.appendField(locator, this, "icons", buffer, theIcons);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        return buffer;
    }

}
