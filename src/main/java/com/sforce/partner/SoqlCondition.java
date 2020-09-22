
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for SoqlCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoqlCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}SoqlWhereCondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operator" type="{urn:partner.soap.sforce.com}soqlOperator"/&gt;
 *         &lt;element name="values" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoqlCondition", propOrder = {
    "field",
    "operator",
    "values"
})
public class SoqlCondition
    extends SoqlWhereCondition
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String field;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SoqlOperator operator;
    @XmlElement(required = true)
    protected List<String> values;

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
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SoqlOperator }
     *     
     */
    public SoqlOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoqlOperator }
     *     
     */
    public void setOperator(SoqlOperator value) {
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SoqlCondition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SoqlCondition that = ((SoqlCondition) object);
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
            SoqlOperator lhsOperator;
            lhsOperator = this.getOperator();
            SoqlOperator rhsOperator;
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        {
            SoqlOperator theOperator;
            theOperator = this.getOperator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operator", theOperator), currentHashCode, theOperator);
        }
        {
            List<String> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "values", theValues), currentHashCode, theValues);
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
            String theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            SoqlOperator theOperator;
            theOperator = this.getOperator();
            strategy.appendField(locator, this, "operator", buffer, theOperator);
        }
        {
            List<String> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            strategy.appendField(locator, this, "values", buffer, theValues);
        }
        return buffer;
    }

}
