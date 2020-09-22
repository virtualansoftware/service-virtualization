
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
 * <p>Java class for DescribeSoftphoneLayoutItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoftphoneLayoutItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemApiName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoftphoneLayoutItem", propOrder = {
    "itemApiName"
})
public class DescribeSoftphoneLayoutItem
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String itemApiName;

    /**
     * Gets the value of the itemApiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemApiName() {
        return itemApiName;
    }

    /**
     * Sets the value of the itemApiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemApiName(String value) {
        this.itemApiName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSoftphoneLayoutItem)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSoftphoneLayoutItem that = ((DescribeSoftphoneLayoutItem) object);
        {
            String lhsItemApiName;
            lhsItemApiName = this.getItemApiName();
            String rhsItemApiName;
            rhsItemApiName = that.getItemApiName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemApiName", lhsItemApiName), LocatorUtils.property(thatLocator, "itemApiName", rhsItemApiName), lhsItemApiName, rhsItemApiName)) {
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
            String theItemApiName;
            theItemApiName = this.getItemApiName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemApiName", theItemApiName), currentHashCode, theItemApiName);
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
            String theItemApiName;
            theItemApiName = this.getItemApiName();
            strategy.appendField(locator, this, "itemApiName", buffer, theItemApiName);
        }
        return buffer;
    }

}
