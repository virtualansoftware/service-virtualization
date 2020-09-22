
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for DescribeLayoutComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayLines" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tabOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{urn:partner.soap.sforce.com}layoutComponentType"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutComponent", propOrder = {
    "displayLines",
    "tabOrder",
    "type",
    "value"
})
@XmlSeeAlso({
    FieldComponent.class,
    FieldLayoutComponent.class,
    VisualforcePage.class,
    Canvas.class,
    ReportChartComponent.class,
    AnalyticsCloudComponent.class,
    CustomLinkComponent.class
})
public class DescribeLayoutComponent
    implements Equals, HashCode, ToString
{

    protected int displayLines;
    protected int tabOrder;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LayoutComponentType type;
    @XmlElement(required = true, nillable = true)
    protected String value;

    /**
     * Gets the value of the displayLines property.
     * 
     */
    public int getDisplayLines() {
        return displayLines;
    }

    /**
     * Sets the value of the displayLines property.
     * 
     */
    public void setDisplayLines(int value) {
        this.displayLines = value;
    }

    /**
     * Gets the value of the tabOrder property.
     * 
     */
    public int getTabOrder() {
        return tabOrder;
    }

    /**
     * Sets the value of the tabOrder property.
     * 
     */
    public void setTabOrder(int value) {
        this.tabOrder = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LayoutComponentType }
     *     
     */
    public LayoutComponentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutComponentType }
     *     
     */
    public void setType(LayoutComponentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayoutComponent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayoutComponent that = ((DescribeLayoutComponent) object);
        {
            int lhsDisplayLines;
            lhsDisplayLines = (true?this.getDisplayLines(): 0);
            int rhsDisplayLines;
            rhsDisplayLines = (true?that.getDisplayLines(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayLines", lhsDisplayLines), LocatorUtils.property(thatLocator, "displayLines", rhsDisplayLines), lhsDisplayLines, rhsDisplayLines)) {
                return false;
            }
        }
        {
            int lhsTabOrder;
            lhsTabOrder = (true?this.getTabOrder(): 0);
            int rhsTabOrder;
            rhsTabOrder = (true?that.getTabOrder(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tabOrder", lhsTabOrder), LocatorUtils.property(thatLocator, "tabOrder", rhsTabOrder), lhsTabOrder, rhsTabOrder)) {
                return false;
            }
        }
        {
            LayoutComponentType lhsType;
            lhsType = this.getType();
            LayoutComponentType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            int theDisplayLines;
            theDisplayLines = (true?this.getDisplayLines(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayLines", theDisplayLines), currentHashCode, theDisplayLines);
        }
        {
            int theTabOrder;
            theTabOrder = (true?this.getTabOrder(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tabOrder", theTabOrder), currentHashCode, theTabOrder);
        }
        {
            LayoutComponentType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
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
            int theDisplayLines;
            theDisplayLines = (true?this.getDisplayLines(): 0);
            strategy.appendField(locator, this, "displayLines", buffer, theDisplayLines);
        }
        {
            int theTabOrder;
            theTabOrder = (true?this.getTabOrder(): 0);
            strategy.appendField(locator, this, "tabOrder", buffer, theTabOrder);
        }
        {
            LayoutComponentType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

}
