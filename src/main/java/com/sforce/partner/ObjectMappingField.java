
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
 * <p>Java class for ObjectMappingField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectMappingField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inputLookupObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputLookupObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectMappingField", propOrder = {
    "inputField",
    "inputLookupObject",
    "outputField",
    "outputLookupObject"
})
public class ObjectMappingField
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String inputField;
    @XmlElement(required = true, nillable = true)
    protected String inputLookupObject;
    @XmlElement(required = true)
    protected String outputField;
    @XmlElement(required = true, nillable = true)
    protected String outputLookupObject;

    /**
     * Gets the value of the inputField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputField() {
        return inputField;
    }

    /**
     * Sets the value of the inputField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputField(String value) {
        this.inputField = value;
    }

    /**
     * Gets the value of the inputLookupObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputLookupObject() {
        return inputLookupObject;
    }

    /**
     * Sets the value of the inputLookupObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputLookupObject(String value) {
        this.inputLookupObject = value;
    }

    /**
     * Gets the value of the outputField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputField() {
        return outputField;
    }

    /**
     * Sets the value of the outputField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputField(String value) {
        this.outputField = value;
    }

    /**
     * Gets the value of the outputLookupObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputLookupObject() {
        return outputLookupObject;
    }

    /**
     * Sets the value of the outputLookupObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputLookupObject(String value) {
        this.outputLookupObject = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ObjectMappingField)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ObjectMappingField that = ((ObjectMappingField) object);
        {
            String lhsInputField;
            lhsInputField = this.getInputField();
            String rhsInputField;
            rhsInputField = that.getInputField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputField", lhsInputField), LocatorUtils.property(thatLocator, "inputField", rhsInputField), lhsInputField, rhsInputField)) {
                return false;
            }
        }
        {
            String lhsInputLookupObject;
            lhsInputLookupObject = this.getInputLookupObject();
            String rhsInputLookupObject;
            rhsInputLookupObject = that.getInputLookupObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputLookupObject", lhsInputLookupObject), LocatorUtils.property(thatLocator, "inputLookupObject", rhsInputLookupObject), lhsInputLookupObject, rhsInputLookupObject)) {
                return false;
            }
        }
        {
            String lhsOutputField;
            lhsOutputField = this.getOutputField();
            String rhsOutputField;
            rhsOutputField = that.getOutputField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputField", lhsOutputField), LocatorUtils.property(thatLocator, "outputField", rhsOutputField), lhsOutputField, rhsOutputField)) {
                return false;
            }
        }
        {
            String lhsOutputLookupObject;
            lhsOutputLookupObject = this.getOutputLookupObject();
            String rhsOutputLookupObject;
            rhsOutputLookupObject = that.getOutputLookupObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputLookupObject", lhsOutputLookupObject), LocatorUtils.property(thatLocator, "outputLookupObject", rhsOutputLookupObject), lhsOutputLookupObject, rhsOutputLookupObject)) {
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
            String theInputField;
            theInputField = this.getInputField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputField", theInputField), currentHashCode, theInputField);
        }
        {
            String theInputLookupObject;
            theInputLookupObject = this.getInputLookupObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputLookupObject", theInputLookupObject), currentHashCode, theInputLookupObject);
        }
        {
            String theOutputField;
            theOutputField = this.getOutputField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputField", theOutputField), currentHashCode, theOutputField);
        }
        {
            String theOutputLookupObject;
            theOutputLookupObject = this.getOutputLookupObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputLookupObject", theOutputLookupObject), currentHashCode, theOutputLookupObject);
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
            String theInputField;
            theInputField = this.getInputField();
            strategy.appendField(locator, this, "inputField", buffer, theInputField);
        }
        {
            String theInputLookupObject;
            theInputLookupObject = this.getInputLookupObject();
            strategy.appendField(locator, this, "inputLookupObject", buffer, theInputLookupObject);
        }
        {
            String theOutputField;
            theOutputField = this.getOutputField();
            strategy.appendField(locator, this, "outputField", buffer, theOutputField);
        }
        {
            String theOutputLookupObject;
            theOutputLookupObject = this.getOutputLookupObject();
            strategy.appendField(locator, this, "outputLookupObject", buffer, theOutputLookupObject);
        }
        return buffer;
    }

}
