
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
 * <p>Java class for DescribePathAssistantField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribePathAssistantField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apiName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribePathAssistantField", propOrder = {
    "apiName",
    "label",
    "readOnly",
    "required"
})
public class DescribePathAssistantField
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String apiName;
    @XmlElement(required = true)
    protected String label;
    protected boolean readOnly;
    protected boolean required;

    /**
     * Gets the value of the apiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * Sets the value of the apiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiName(String value) {
        this.apiName = value;
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
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribePathAssistantField)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribePathAssistantField that = ((DescribePathAssistantField) object);
        {
            String lhsApiName;
            lhsApiName = this.getApiName();
            String rhsApiName;
            rhsApiName = that.getApiName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiName", lhsApiName), LocatorUtils.property(thatLocator, "apiName", rhsApiName), lhsApiName, rhsApiName)) {
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
            boolean lhsReadOnly;
            lhsReadOnly = (true?this.isReadOnly():false);
            boolean rhsReadOnly;
            rhsReadOnly = (true?that.isReadOnly():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "readOnly", lhsReadOnly), LocatorUtils.property(thatLocator, "readOnly", rhsReadOnly), lhsReadOnly, rhsReadOnly)) {
                return false;
            }
        }
        {
            boolean lhsRequired;
            lhsRequired = (true?this.isRequired():false);
            boolean rhsRequired;
            rhsRequired = (true?that.isRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "required", lhsRequired), LocatorUtils.property(thatLocator, "required", rhsRequired), lhsRequired, rhsRequired)) {
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
            String theApiName;
            theApiName = this.getApiName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apiName", theApiName), currentHashCode, theApiName);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            boolean theReadOnly;
            theReadOnly = (true?this.isReadOnly():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "readOnly", theReadOnly), currentHashCode, theReadOnly);
        }
        {
            boolean theRequired;
            theRequired = (true?this.isRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "required", theRequired), currentHashCode, theRequired);
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
            String theApiName;
            theApiName = this.getApiName();
            strategy.appendField(locator, this, "apiName", buffer, theApiName);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            boolean theReadOnly;
            theReadOnly = (true?this.isReadOnly():false);
            strategy.appendField(locator, this, "readOnly", buffer, theReadOnly);
        }
        {
            boolean theRequired;
            theRequired = (true?this.isRequired():false);
            strategy.appendField(locator, this, "required", buffer, theRequired);
        }
        return buffer;
    }

}
