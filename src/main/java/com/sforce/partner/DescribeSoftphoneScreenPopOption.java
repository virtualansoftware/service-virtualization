
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
 * <p>Java class for DescribeSoftphoneScreenPopOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoftphoneScreenPopOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matchType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="screenPopData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="screenPopType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoftphoneScreenPopOption", propOrder = {
    "matchType",
    "screenPopData",
    "screenPopType"
})
public class DescribeSoftphoneScreenPopOption
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String matchType;
    @XmlElement(required = true)
    protected String screenPopData;
    @XmlElement(required = true)
    protected String screenPopType;

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchType(String value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the screenPopData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenPopData() {
        return screenPopData;
    }

    /**
     * Sets the value of the screenPopData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenPopData(String value) {
        this.screenPopData = value;
    }

    /**
     * Gets the value of the screenPopType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenPopType() {
        return screenPopType;
    }

    /**
     * Sets the value of the screenPopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenPopType(String value) {
        this.screenPopType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSoftphoneScreenPopOption)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSoftphoneScreenPopOption that = ((DescribeSoftphoneScreenPopOption) object);
        {
            String lhsMatchType;
            lhsMatchType = this.getMatchType();
            String rhsMatchType;
            rhsMatchType = that.getMatchType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchType", lhsMatchType), LocatorUtils.property(thatLocator, "matchType", rhsMatchType), lhsMatchType, rhsMatchType)) {
                return false;
            }
        }
        {
            String lhsScreenPopData;
            lhsScreenPopData = this.getScreenPopData();
            String rhsScreenPopData;
            rhsScreenPopData = that.getScreenPopData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "screenPopData", lhsScreenPopData), LocatorUtils.property(thatLocator, "screenPopData", rhsScreenPopData), lhsScreenPopData, rhsScreenPopData)) {
                return false;
            }
        }
        {
            String lhsScreenPopType;
            lhsScreenPopType = this.getScreenPopType();
            String rhsScreenPopType;
            rhsScreenPopType = that.getScreenPopType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "screenPopType", lhsScreenPopType), LocatorUtils.property(thatLocator, "screenPopType", rhsScreenPopType), lhsScreenPopType, rhsScreenPopType)) {
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
            String theMatchType;
            theMatchType = this.getMatchType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchType", theMatchType), currentHashCode, theMatchType);
        }
        {
            String theScreenPopData;
            theScreenPopData = this.getScreenPopData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "screenPopData", theScreenPopData), currentHashCode, theScreenPopData);
        }
        {
            String theScreenPopType;
            theScreenPopType = this.getScreenPopType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "screenPopType", theScreenPopType), currentHashCode, theScreenPopType);
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
            String theMatchType;
            theMatchType = this.getMatchType();
            strategy.appendField(locator, this, "matchType", buffer, theMatchType);
        }
        {
            String theScreenPopData;
            theScreenPopData = this.getScreenPopData();
            strategy.appendField(locator, this, "screenPopData", buffer, theScreenPopData);
        }
        {
            String theScreenPopType;
            theScreenPopType = this.getScreenPopType();
            strategy.appendField(locator, this, "screenPopType", buffer, theScreenPopType);
        }
        return buffer;
    }

}
