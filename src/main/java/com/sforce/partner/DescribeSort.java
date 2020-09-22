
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
 * <p>Java class for DescribeSort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSort"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ascending" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSort", propOrder = {
    "ascending",
    "column"
})
public class DescribeSort
    implements Equals, HashCode, ToString
{

    protected boolean ascending;
    @XmlElement(required = true)
    protected String column;

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
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSort)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSort that = ((DescribeSort) object);
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
            String lhsColumn;
            lhsColumn = this.getColumn();
            String rhsColumn;
            rhsColumn = that.getColumn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "column", lhsColumn), LocatorUtils.property(thatLocator, "column", rhsColumn), lhsColumn, rhsColumn)) {
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
            String theColumn;
            theColumn = this.getColumn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "column", theColumn), currentHashCode, theColumn);
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
            String theColumn;
            theColumn = this.getColumn();
            strategy.appendField(locator, this, "column", buffer, theColumn);
        }
        return buffer;
    }

}
