
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
 * <p>Java class for DescribeSoftphoneLayoutSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoftphoneLayoutSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityApiName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="items" type="{urn:partner.soap.sforce.com}DescribeSoftphoneLayoutItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoftphoneLayoutSection", propOrder = {
    "entityApiName",
    "items"
})
public class DescribeSoftphoneLayoutSection
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String entityApiName;
    @XmlElement(required = true)
    protected List<DescribeSoftphoneLayoutItem> items;

    /**
     * Gets the value of the entityApiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityApiName() {
        return entityApiName;
    }

    /**
     * Sets the value of the entityApiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityApiName(String value) {
        this.entityApiName = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeSoftphoneLayoutItem }
     * 
     * 
     */
    public List<DescribeSoftphoneLayoutItem> getItems() {
        if (items == null) {
            items = new ArrayList<DescribeSoftphoneLayoutItem>();
        }
        return this.items;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSoftphoneLayoutSection)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSoftphoneLayoutSection that = ((DescribeSoftphoneLayoutSection) object);
        {
            String lhsEntityApiName;
            lhsEntityApiName = this.getEntityApiName();
            String rhsEntityApiName;
            rhsEntityApiName = that.getEntityApiName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityApiName", lhsEntityApiName), LocatorUtils.property(thatLocator, "entityApiName", rhsEntityApiName), lhsEntityApiName, rhsEntityApiName)) {
                return false;
            }
        }
        {
            List<DescribeSoftphoneLayoutItem> lhsItems;
            lhsItems = (((this.items!= null)&&(!this.items.isEmpty()))?this.getItems():null);
            List<DescribeSoftphoneLayoutItem> rhsItems;
            rhsItems = (((that.items!= null)&&(!that.items.isEmpty()))?that.getItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "items", lhsItems), LocatorUtils.property(thatLocator, "items", rhsItems), lhsItems, rhsItems)) {
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
            String theEntityApiName;
            theEntityApiName = this.getEntityApiName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityApiName", theEntityApiName), currentHashCode, theEntityApiName);
        }
        {
            List<DescribeSoftphoneLayoutItem> theItems;
            theItems = (((this.items!= null)&&(!this.items.isEmpty()))?this.getItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "items", theItems), currentHashCode, theItems);
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
            String theEntityApiName;
            theEntityApiName = this.getEntityApiName();
            strategy.appendField(locator, this, "entityApiName", buffer, theEntityApiName);
        }
        {
            List<DescribeSoftphoneLayoutItem> theItems;
            theItems = (((this.items!= null)&&(!this.items.isEmpty()))?this.getItems():null);
            strategy.appendField(locator, this, "items", buffer, theItems);
        }
        return buffer;
    }

}
