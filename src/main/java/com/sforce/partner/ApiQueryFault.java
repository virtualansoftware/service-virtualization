
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ApiQueryFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiQueryFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:fault.partner.soap.sforce.com}ApiFault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="row" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiQueryFault", namespace = "urn:fault.partner.soap.sforce.com", propOrder = {
    "row",
    "column"
})
@XmlSeeAlso({
    MalformedSearchFault.class,
    MalformedQueryFault.class,
    InvalidSObjectFault.class,
    InvalidFieldFault.class
})
public class ApiQueryFault
    extends ApiFault
    implements Equals, HashCode, ToString
{

    protected int row;
    protected int column;

    /**
     * Gets the value of the row property.
     * 
     */
    public int getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     */
    public void setRow(int value) {
        this.row = value;
    }

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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ApiQueryFault)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ApiQueryFault that = ((ApiQueryFault) object);
        {
            int lhsRow;
            lhsRow = (true?this.getRow(): 0);
            int rhsRow;
            rhsRow = (true?that.getRow(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "row", lhsRow), LocatorUtils.property(thatLocator, "row", rhsRow), lhsRow, rhsRow)) {
                return false;
            }
        }
        {
            int lhsColumn;
            lhsColumn = (true?this.getColumn(): 0);
            int rhsColumn;
            rhsColumn = (true?that.getColumn(): 0);
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            int theRow;
            theRow = (true?this.getRow(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "row", theRow), currentHashCode, theRow);
        }
        {
            int theColumn;
            theColumn = (true?this.getColumn(): 0);
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
        super.appendFields(locator, buffer, strategy);
        {
            int theRow;
            theRow = (true?this.getRow(): 0);
            strategy.appendField(locator, this, "row", buffer, theRow);
        }
        {
            int theColumn;
            theColumn = (true?this.getColumn(): 0);
            strategy.appendField(locator, this, "column", buffer, theColumn);
        }
        return buffer;
    }

}
