
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ListViewOrderBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListViewOrderBy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldNameOrPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nullsPosition" type="{urn:partner.soap.sforce.com}orderByNullsPosition"/&gt;
 *         &lt;element name="sortDirection" type="{urn:partner.soap.sforce.com}orderByDirection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListViewOrderBy", propOrder = {
    "fieldNameOrPath",
    "nullsPosition",
    "sortDirection"
})
public class ListViewOrderBy
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String fieldNameOrPath;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected OrderByNullsPosition nullsPosition;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected OrderByDirection sortDirection;

    /**
     * Gets the value of the fieldNameOrPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldNameOrPath() {
        return fieldNameOrPath;
    }

    /**
     * Sets the value of the fieldNameOrPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldNameOrPath(String value) {
        this.fieldNameOrPath = value;
    }

    /**
     * Gets the value of the nullsPosition property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByNullsPosition }
     *     
     */
    public OrderByNullsPosition getNullsPosition() {
        return nullsPosition;
    }

    /**
     * Sets the value of the nullsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByNullsPosition }
     *     
     */
    public void setNullsPosition(OrderByNullsPosition value) {
        this.nullsPosition = value;
    }

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByDirection }
     *     
     */
    public OrderByDirection getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByDirection }
     *     
     */
    public void setSortDirection(OrderByDirection value) {
        this.sortDirection = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ListViewOrderBy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ListViewOrderBy that = ((ListViewOrderBy) object);
        {
            String lhsFieldNameOrPath;
            lhsFieldNameOrPath = this.getFieldNameOrPath();
            String rhsFieldNameOrPath;
            rhsFieldNameOrPath = that.getFieldNameOrPath();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldNameOrPath", lhsFieldNameOrPath), LocatorUtils.property(thatLocator, "fieldNameOrPath", rhsFieldNameOrPath), lhsFieldNameOrPath, rhsFieldNameOrPath)) {
                return false;
            }
        }
        {
            OrderByNullsPosition lhsNullsPosition;
            lhsNullsPosition = this.getNullsPosition();
            OrderByNullsPosition rhsNullsPosition;
            rhsNullsPosition = that.getNullsPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nullsPosition", lhsNullsPosition), LocatorUtils.property(thatLocator, "nullsPosition", rhsNullsPosition), lhsNullsPosition, rhsNullsPosition)) {
                return false;
            }
        }
        {
            OrderByDirection lhsSortDirection;
            lhsSortDirection = this.getSortDirection();
            OrderByDirection rhsSortDirection;
            rhsSortDirection = that.getSortDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortDirection", lhsSortDirection), LocatorUtils.property(thatLocator, "sortDirection", rhsSortDirection), lhsSortDirection, rhsSortDirection)) {
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
            String theFieldNameOrPath;
            theFieldNameOrPath = this.getFieldNameOrPath();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldNameOrPath", theFieldNameOrPath), currentHashCode, theFieldNameOrPath);
        }
        {
            OrderByNullsPosition theNullsPosition;
            theNullsPosition = this.getNullsPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nullsPosition", theNullsPosition), currentHashCode, theNullsPosition);
        }
        {
            OrderByDirection theSortDirection;
            theSortDirection = this.getSortDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortDirection", theSortDirection), currentHashCode, theSortDirection);
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
            String theFieldNameOrPath;
            theFieldNameOrPath = this.getFieldNameOrPath();
            strategy.appendField(locator, this, "fieldNameOrPath", buffer, theFieldNameOrPath);
        }
        {
            OrderByNullsPosition theNullsPosition;
            theNullsPosition = this.getNullsPosition();
            strategy.appendField(locator, this, "nullsPosition", buffer, theNullsPosition);
        }
        {
            OrderByDirection theSortDirection;
            theSortDirection = this.getSortDirection();
            strategy.appendField(locator, this, "sortDirection", buffer, theSortDirection);
        }
        return buffer;
    }

}
