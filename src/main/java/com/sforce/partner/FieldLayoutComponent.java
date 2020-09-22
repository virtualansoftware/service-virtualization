
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
 * <p>Java class for FieldLayoutComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldLayoutComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}DescribeLayoutComponent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="components" type="{urn:partner.soap.sforce.com}DescribeLayoutComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fieldType" type="{urn:partner.soap.sforce.com}fieldType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldLayoutComponent", propOrder = {
    "components",
    "fieldType"
})
public class FieldLayoutComponent
    extends DescribeLayoutComponent
    implements Equals, HashCode, ToString
{

    protected List<DescribeLayoutComponent> components;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FieldType fieldType;

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutComponent }
     * 
     * 
     */
    public List<DescribeLayoutComponent> getComponents() {
        if (components == null) {
            components = new ArrayList<DescribeLayoutComponent>();
        }
        return this.components;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setFieldType(FieldType value) {
        this.fieldType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldLayoutComponent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FieldLayoutComponent that = ((FieldLayoutComponent) object);
        {
            List<DescribeLayoutComponent> lhsComponents;
            lhsComponents = (((this.components!= null)&&(!this.components.isEmpty()))?this.getComponents():null);
            List<DescribeLayoutComponent> rhsComponents;
            rhsComponents = (((that.components!= null)&&(!that.components.isEmpty()))?that.getComponents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "components", lhsComponents), LocatorUtils.property(thatLocator, "components", rhsComponents), lhsComponents, rhsComponents)) {
                return false;
            }
        }
        {
            FieldType lhsFieldType;
            lhsFieldType = this.getFieldType();
            FieldType rhsFieldType;
            rhsFieldType = that.getFieldType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldType", lhsFieldType), LocatorUtils.property(thatLocator, "fieldType", rhsFieldType), lhsFieldType, rhsFieldType)) {
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
            List<DescribeLayoutComponent> theComponents;
            theComponents = (((this.components!= null)&&(!this.components.isEmpty()))?this.getComponents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "components", theComponents), currentHashCode, theComponents);
        }
        {
            FieldType theFieldType;
            theFieldType = this.getFieldType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldType", theFieldType), currentHashCode, theFieldType);
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
            List<DescribeLayoutComponent> theComponents;
            theComponents = (((this.components!= null)&&(!this.components.isEmpty()))?this.getComponents():null);
            strategy.appendField(locator, this, "components", buffer, theComponents);
        }
        {
            FieldType theFieldType;
            theFieldType = this.getFieldType();
            strategy.appendField(locator, this, "fieldType", buffer, theFieldType);
        }
        return buffer;
    }

}
