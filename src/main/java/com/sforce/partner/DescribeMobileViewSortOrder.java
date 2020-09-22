
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
 * <p>Java class for DescribeMobileViewSortOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeMobileViewSortOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ascending" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="viewId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeMobileViewSortOrder", propOrder = {
    "ascending",
    "field",
    "order",
    "viewId"
})
public class DescribeMobileViewSortOrder
    implements Equals, HashCode, ToString
{

    protected boolean ascending;
    @XmlElement(required = true)
    protected String field;
    protected int order;
    @XmlElement(required = true)
    protected String viewId;

    /**
     * Gets the value of the ascending property.
     * 
     */
    public boolean isAscending() {
        return ascending;
    }

    /**
     * Sets the value of the ascending property.
     * 
     */
    public void setAscending(boolean value) {
        this.ascending = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the viewId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * Sets the value of the viewId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewId(String value) {
        this.viewId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeMobileViewSortOrder)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeMobileViewSortOrder that = ((DescribeMobileViewSortOrder) object);
        {
            boolean lhsAscending;
            lhsAscending = (true?this.isAscending():false);
            boolean rhsAscending;
            rhsAscending = (true?that.isAscending():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ascending", lhsAscending), LocatorUtils.property(thatLocator, "ascending", rhsAscending), lhsAscending, rhsAscending)) {
                return false;
            }
        }
        {
            String lhsField;
            lhsField = this.getField();
            String rhsField;
            rhsField = that.getField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
                return false;
            }
        }
        {
            int lhsOrder;
            lhsOrder = (true?this.getOrder(): 0);
            int rhsOrder;
            rhsOrder = (true?that.getOrder(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "order", lhsOrder), LocatorUtils.property(thatLocator, "order", rhsOrder), lhsOrder, rhsOrder)) {
                return false;
            }
        }
        {
            String lhsViewId;
            lhsViewId = this.getViewId();
            String rhsViewId;
            rhsViewId = that.getViewId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "viewId", lhsViewId), LocatorUtils.property(thatLocator, "viewId", rhsViewId), lhsViewId, rhsViewId)) {
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
            boolean theAscending;
            theAscending = (true?this.isAscending():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ascending", theAscending), currentHashCode, theAscending);
        }
        {
            String theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        {
            int theOrder;
            theOrder = (true?this.getOrder(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "order", theOrder), currentHashCode, theOrder);
        }
        {
            String theViewId;
            theViewId = this.getViewId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "viewId", theViewId), currentHashCode, theViewId);
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
            boolean theAscending;
            theAscending = (true?this.isAscending():false);
            strategy.appendField(locator, this, "ascending", buffer, theAscending);
        }
        {
            String theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            int theOrder;
            theOrder = (true?this.getOrder(): 0);
            strategy.appendField(locator, this, "order", buffer, theOrder);
        }
        {
            String theViewId;
            theViewId = this.getViewId();
            strategy.appendField(locator, this, "viewId", buffer, theViewId);
        }
        return buffer;
    }

}
