
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
 * <p>Java class for DescribeMobileViewDispColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeMobileViewDispColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "DescribeMobileViewDispColumn", propOrder = {
    "column",
    "field",
    "viewId"
})
public class DescribeMobileViewDispColumn
    implements Equals, HashCode, ToString
{

    protected int column;
    @XmlElement(required = true)
    protected String field;
    @XmlElement(required = true)
    protected String viewId;

    /**
     * Gets the value of the column property.
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     */
    public void setColumn(int value) {
        this.column = value;
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
        if (!(object instanceof DescribeMobileViewDispColumn)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeMobileViewDispColumn that = ((DescribeMobileViewDispColumn) object);
        {
            int lhsColumn;
            lhsColumn = (true?this.getColumn(): 0);
            int rhsColumn;
            rhsColumn = (true?that.getColumn(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "column", lhsColumn), LocatorUtils.property(thatLocator, "column", rhsColumn), lhsColumn, rhsColumn)) {
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
            int theColumn;
            theColumn = (true?this.getColumn(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "column", theColumn), currentHashCode, theColumn);
        }
        {
            String theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
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
            int theColumn;
            theColumn = (true?this.getColumn(): 0);
            strategy.appendField(locator, this, "column", buffer, theColumn);
        }
        {
            String theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            String theViewId;
            theViewId = this.getViewId();
            strategy.appendField(locator, this, "viewId", buffer, theViewId);
        }
        return buffer;
    }

}
