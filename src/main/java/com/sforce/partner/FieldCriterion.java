
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
 * <p>Java class for FieldCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldCriterion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operand" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldCriterion", propOrder = {
    "columnName",
    "operand",
    "operator"
})
public class FieldCriterion
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String columnName;
    @XmlElement(required = true)
    protected String operand;
    @XmlElement(required = true)
    protected String operator;

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperand(String value) {
        this.operand = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldCriterion)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldCriterion that = ((FieldCriterion) object);
        {
            String lhsColumnName;
            lhsColumnName = this.getColumnName();
            String rhsColumnName;
            rhsColumnName = that.getColumnName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columnName", lhsColumnName), LocatorUtils.property(thatLocator, "columnName", rhsColumnName), lhsColumnName, rhsColumnName)) {
                return false;
            }
        }
        {
            String lhsOperand;
            lhsOperand = this.getOperand();
            String rhsOperand;
            rhsOperand = that.getOperand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operand", lhsOperand), LocatorUtils.property(thatLocator, "operand", rhsOperand), lhsOperand, rhsOperand)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theColumnName;
            theColumnName = this.getColumnName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columnName", theColumnName), currentHashCode, theColumnName);
        }
        {
            String theOperand;
            theOperand = this.getOperand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operand", theOperand), currentHashCode, theOperand);
        }
        {
            String theOperator;
            theOperator = this.getOperator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operator", theOperator), currentHashCode, theOperator);
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
            String theColumnName;
            theColumnName = this.getColumnName();
            strategy.appendField(locator, this, "columnName", buffer, theColumnName);
        }
        {
            String theOperand;
            theOperand = this.getOperand();
            strategy.appendField(locator, this, "operand", buffer, theOperand);
        }
        {
            String theOperator;
            theOperator = this.getOperator();
            strategy.appendField(locator, this, "operator", buffer, theOperator);
        }
        return buffer;
    }

}
