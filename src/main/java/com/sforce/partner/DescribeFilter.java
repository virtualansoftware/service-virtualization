
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
 * <p>Java class for DescribeFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="negated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="valueSeparator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeFilter", propOrder = {
    "column",
    "negated",
    "operator",
    "values",
    "valueSeparator"
})
public class DescribeFilter
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String column;
    protected boolean negated;
    @XmlElement(required = true)
    protected String operator;
    @XmlElement(name = "value")
    protected List<String> values;
    @XmlElement(required = true)
    protected String valueSeparator;

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

    /**
     * Gets the value of the negated property.
     * 
     */
    public boolean isNegated() {
        return negated;
    }

    /**
     * Sets the value of the negated property.
     * 
     */
    public void setNegated(boolean value) {
        this.negated = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValues() {
        if (values == null) {
            values = new ArrayList<String>();
        }
        return this.values;
    }

    /**
     * Gets the value of the valueSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueSeparator() {
        return valueSeparator;
    }

    /**
     * Sets the value of the valueSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueSeparator(String value) {
        this.valueSeparator = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeFilter that = ((DescribeFilter) object);
        {
            String lhsColumn;
            lhsColumn = this.getColumn();
            String rhsColumn;
            rhsColumn = that.getColumn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "column", lhsColumn), LocatorUtils.property(thatLocator, "column", rhsColumn), lhsColumn, rhsColumn)) {
                return false;
            }
        }
        {
            boolean lhsNegated;
            lhsNegated = (true?this.isNegated():false);
            boolean rhsNegated;
            rhsNegated = (true?that.isNegated():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "negated", lhsNegated), LocatorUtils.property(thatLocator, "negated", rhsNegated), lhsNegated, rhsNegated)) {
                return false;
            }
        }
        {
            String lhsOperator;
            lhsOperator = this.getOperator();
            String rhsOperator;
            rhsOperator = that.getOperator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operator", lhsOperator), LocatorUtils.property(thatLocator, "operator", rhsOperator), lhsOperator, rhsOperator)) {
                return false;
            }
        }
        {
            List<String> lhsValues;
            lhsValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            List<String> rhsValues;
            rhsValues = (((that.values!= null)&&(!that.values.isEmpty()))?that.getValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "values", lhsValues), LocatorUtils.property(thatLocator, "values", rhsValues), lhsValues, rhsValues)) {
                return false;
            }
        }
        {
            String lhsValueSeparator;
            lhsValueSeparator = this.getValueSeparator();
            String rhsValueSeparator;
            rhsValueSeparator = that.getValueSeparator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueSeparator", lhsValueSeparator), LocatorUtils.property(thatLocator, "valueSeparator", rhsValueSeparator), lhsValueSeparator, rhsValueSeparator)) {
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
            String theColumn;
            theColumn = this.getColumn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "column", theColumn), currentHashCode, theColumn);
        }
        {
            boolean theNegated;
            theNegated = (true?this.isNegated():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "negated", theNegated), currentHashCode, theNegated);
        }
        {
            String theOperator;
            theOperator = this.getOperator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operator", theOperator), currentHashCode, theOperator);
        }
        {
            List<String> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "values", theValues), currentHashCode, theValues);
        }
        {
            String theValueSeparator;
            theValueSeparator = this.getValueSeparator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueSeparator", theValueSeparator), currentHashCode, theValueSeparator);
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
            String theColumn;
            theColumn = this.getColumn();
            strategy.appendField(locator, this, "column", buffer, theColumn);
        }
        {
            boolean theNegated;
            theNegated = (true?this.isNegated():false);
            strategy.appendField(locator, this, "negated", buffer, theNegated);
        }
        {
            String theOperator;
            theOperator = this.getOperator();
            strategy.appendField(locator, this, "operator", buffer, theOperator);
        }
        {
            List<String> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            strategy.appendField(locator, this, "values", buffer, theValues);
        }
        {
            String theValueSeparator;
            theValueSeparator = this.getValueSeparator();
            strategy.appendField(locator, this, "valueSeparator", buffer, theValueSeparator);
        }
        return buffer;
    }

}
