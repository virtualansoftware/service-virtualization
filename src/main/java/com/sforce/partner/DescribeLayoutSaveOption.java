
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
 * <p>Java class for DescribeLayoutSaveOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutSaveOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restHeaderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soapHeaderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutSaveOption", propOrder = {
    "defaultValue",
    "isDisplayed",
    "label",
    "name",
    "restHeaderName",
    "soapHeaderName"
})
public class DescribeLayoutSaveOption
    implements Equals, HashCode, ToString
{

    protected boolean defaultValue;
    protected boolean isDisplayed;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String restHeaderName;
    @XmlElement(required = true)
    protected String soapHeaderName;

    /**
     * Gets the value of the defaultValue property.
     * 
     */
    public boolean isDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     */
    public void setDefaultValue(boolean value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the isDisplayed property.
     * 
     */
    public boolean isIsDisplayed() {
        return isDisplayed;
    }

    /**
     * Sets the value of the isDisplayed property.
     * 
     */
    public void setIsDisplayed(boolean value) {
        this.isDisplayed = value;
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
     * Gets the value of the restHeaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestHeaderName() {
        return restHeaderName;
    }

    /**
     * Sets the value of the restHeaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestHeaderName(String value) {
        this.restHeaderName = value;
    }

    /**
     * Gets the value of the soapHeaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoapHeaderName() {
        return soapHeaderName;
    }

    /**
     * Sets the value of the soapHeaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoapHeaderName(String value) {
        this.soapHeaderName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayoutSaveOption)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayoutSaveOption that = ((DescribeLayoutSaveOption) object);
        {
            boolean lhsDefaultValue;
            lhsDefaultValue = (true?this.isDefaultValue():false);
            boolean rhsDefaultValue;
            rhsDefaultValue = (true?that.isDefaultValue():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultValue", lhsDefaultValue), LocatorUtils.property(thatLocator, "defaultValue", rhsDefaultValue), lhsDefaultValue, rhsDefaultValue)) {
                return false;
            }
        }
        {
            boolean lhsIsDisplayed;
            lhsIsDisplayed = (true?this.isIsDisplayed():false);
            boolean rhsIsDisplayed;
            rhsIsDisplayed = (true?that.isIsDisplayed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isDisplayed", lhsIsDisplayed), LocatorUtils.property(thatLocator, "isDisplayed", rhsIsDisplayed), lhsIsDisplayed, rhsIsDisplayed)) {
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
            String lhsRestHeaderName;
            lhsRestHeaderName = this.getRestHeaderName();
            String rhsRestHeaderName;
            rhsRestHeaderName = that.getRestHeaderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restHeaderName", lhsRestHeaderName), LocatorUtils.property(thatLocator, "restHeaderName", rhsRestHeaderName), lhsRestHeaderName, rhsRestHeaderName)) {
                return false;
            }
        }
        {
            String lhsSoapHeaderName;
            lhsSoapHeaderName = this.getSoapHeaderName();
            String rhsSoapHeaderName;
            rhsSoapHeaderName = that.getSoapHeaderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soapHeaderName", lhsSoapHeaderName), LocatorUtils.property(thatLocator, "soapHeaderName", rhsSoapHeaderName), lhsSoapHeaderName, rhsSoapHeaderName)) {
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
            boolean theDefaultValue;
            theDefaultValue = (true?this.isDefaultValue():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultValue", theDefaultValue), currentHashCode, theDefaultValue);
        }
        {
            boolean theIsDisplayed;
            theIsDisplayed = (true?this.isIsDisplayed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isDisplayed", theIsDisplayed), currentHashCode, theIsDisplayed);
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
            String theRestHeaderName;
            theRestHeaderName = this.getRestHeaderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restHeaderName", theRestHeaderName), currentHashCode, theRestHeaderName);
        }
        {
            String theSoapHeaderName;
            theSoapHeaderName = this.getSoapHeaderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soapHeaderName", theSoapHeaderName), currentHashCode, theSoapHeaderName);
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
            boolean theDefaultValue;
            theDefaultValue = (true?this.isDefaultValue():false);
            strategy.appendField(locator, this, "defaultValue", buffer, theDefaultValue);
        }
        {
            boolean theIsDisplayed;
            theIsDisplayed = (true?this.isIsDisplayed():false);
            strategy.appendField(locator, this, "isDisplayed", buffer, theIsDisplayed);
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
            String theRestHeaderName;
            theRestHeaderName = this.getRestHeaderName();
            strategy.appendField(locator, this, "restHeaderName", buffer, theRestHeaderName);
        }
        {
            String theSoapHeaderName;
            theSoapHeaderName = this.getSoapHeaderName();
            strategy.appendField(locator, this, "soapHeaderName", buffer, theSoapHeaderName);
        }
        return buffer;
    }

}
