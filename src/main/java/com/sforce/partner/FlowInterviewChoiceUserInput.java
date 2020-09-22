
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
 * <p>Java class for FlowInterviewChoiceUserInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowInterviewChoiceUserInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorMessages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isValidValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowInterviewChoiceUserInput", propOrder = {
    "dataType",
    "errorMessages",
    "isRequired",
    "isValidValue",
    "label",
    "name",
    "value"
})
public class FlowInterviewChoiceUserInput
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String dataType;
    protected List<String> errorMessages;
    protected boolean isRequired;
    protected boolean isValidValue;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected Object value;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the errorMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorMessages() {
        if (errorMessages == null) {
            errorMessages = new ArrayList<String>();
        }
        return this.errorMessages;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     */
    public void setIsRequired(boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isValidValue property.
     * 
     */
    public boolean isIsValidValue() {
        return isValidValue;
    }

    /**
     * Sets the value of the isValidValue property.
     * 
     */
    public void setIsValidValue(boolean value) {
        this.isValidValue = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlowInterviewChoiceUserInput)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FlowInterviewChoiceUserInput that = ((FlowInterviewChoiceUserInput) object);
        {
            String lhsDataType;
            lhsDataType = this.getDataType();
            String rhsDataType;
            rhsDataType = that.getDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataType", lhsDataType), LocatorUtils.property(thatLocator, "dataType", rhsDataType), lhsDataType, rhsDataType)) {
                return false;
            }
        }
        {
            List<String> lhsErrorMessages;
            lhsErrorMessages = (((this.errorMessages!= null)&&(!this.errorMessages.isEmpty()))?this.getErrorMessages():null);
            List<String> rhsErrorMessages;
            rhsErrorMessages = (((that.errorMessages!= null)&&(!that.errorMessages.isEmpty()))?that.getErrorMessages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorMessages", lhsErrorMessages), LocatorUtils.property(thatLocator, "errorMessages", rhsErrorMessages), lhsErrorMessages, rhsErrorMessages)) {
                return false;
            }
        }
        {
            boolean lhsIsRequired;
            lhsIsRequired = (true?this.isIsRequired():false);
            boolean rhsIsRequired;
            rhsIsRequired = (true?that.isIsRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequired", lhsIsRequired), LocatorUtils.property(thatLocator, "isRequired", rhsIsRequired), lhsIsRequired, rhsIsRequired)) {
                return false;
            }
        }
        {
            boolean lhsIsValidValue;
            lhsIsValidValue = (true?this.isIsValidValue():false);
            boolean rhsIsValidValue;
            rhsIsValidValue = (true?that.isIsValidValue():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isValidValue", lhsIsValidValue), LocatorUtils.property(thatLocator, "isValidValue", rhsIsValidValue), lhsIsValidValue, rhsIsValidValue)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Object lhsValue;
            lhsValue = this.getValue();
            Object rhsValue;
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
            String theDataType;
            theDataType = this.getDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataType", theDataType), currentHashCode, theDataType);
        }
        {
            List<String> theErrorMessages;
            theErrorMessages = (((this.errorMessages!= null)&&(!this.errorMessages.isEmpty()))?this.getErrorMessages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorMessages", theErrorMessages), currentHashCode, theErrorMessages);
        }
        {
            boolean theIsRequired;
            theIsRequired = (true?this.isIsRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequired", theIsRequired), currentHashCode, theIsRequired);
        }
        {
            boolean theIsValidValue;
            theIsValidValue = (true?this.isIsValidValue():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isValidValue", theIsValidValue), currentHashCode, theIsValidValue);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Object theValue;
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
            String theDataType;
            theDataType = this.getDataType();
            strategy.appendField(locator, this, "dataType", buffer, theDataType);
        }
        {
            List<String> theErrorMessages;
            theErrorMessages = (((this.errorMessages!= null)&&(!this.errorMessages.isEmpty()))?this.getErrorMessages():null);
            strategy.appendField(locator, this, "errorMessages", buffer, theErrorMessages);
        }
        {
            boolean theIsRequired;
            theIsRequired = (true?this.isIsRequired():false);
            strategy.appendField(locator, this, "isRequired", buffer, theIsRequired);
        }
        {
            boolean theIsValidValue;
            theIsValidValue = (true?this.isIsValidValue():false);
            strategy.appendField(locator, this, "isValidValue", buffer, theIsValidValue);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Object theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

}
