
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
 * <p>Java class for FlowInterviewChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowInterviewChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choiceValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userInput" type="{urn:partner.soap.sforce.com}FlowInterviewChoiceUserInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowInterviewChoice", propOrder = {
    "choiceValue",
    "isSelected",
    "label",
    "name",
    "text",
    "userInput"
})
public class FlowInterviewChoice
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String choiceValue;
    protected boolean isSelected;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String text;
    @XmlElement(required = true, nillable = true)
    protected FlowInterviewChoiceUserInput userInput;

    /**
     * Gets the value of the choiceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoiceValue() {
        return choiceValue;
    }

    /**
     * Sets the value of the choiceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoiceValue(String value) {
        this.choiceValue = value;
    }

    /**
     * Gets the value of the isSelected property.
     * 
     */
    public boolean isIsSelected() {
        return isSelected;
    }

    /**
     * Sets the value of the isSelected property.
     * 
     */
    public void setIsSelected(boolean value) {
        this.isSelected = value;
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the userInput property.
     * 
     * @return
     *     possible object is
     *     {@link FlowInterviewChoiceUserInput }
     *     
     */
    public FlowInterviewChoiceUserInput getUserInput() {
        return userInput;
    }

    /**
     * Sets the value of the userInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowInterviewChoiceUserInput }
     *     
     */
    public void setUserInput(FlowInterviewChoiceUserInput value) {
        this.userInput = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlowInterviewChoice)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FlowInterviewChoice that = ((FlowInterviewChoice) object);
        {
            String lhsChoiceValue;
            lhsChoiceValue = this.getChoiceValue();
            String rhsChoiceValue;
            rhsChoiceValue = that.getChoiceValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "choiceValue", lhsChoiceValue), LocatorUtils.property(thatLocator, "choiceValue", rhsChoiceValue), lhsChoiceValue, rhsChoiceValue)) {
                return false;
            }
        }
        {
            boolean lhsIsSelected;
            lhsIsSelected = (true?this.isIsSelected():false);
            boolean rhsIsSelected;
            rhsIsSelected = (true?that.isIsSelected():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSelected", lhsIsSelected), LocatorUtils.property(thatLocator, "isSelected", rhsIsSelected), lhsIsSelected, rhsIsSelected)) {
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
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
                return false;
            }
        }
        {
            FlowInterviewChoiceUserInput lhsUserInput;
            lhsUserInput = this.getUserInput();
            FlowInterviewChoiceUserInput rhsUserInput;
            rhsUserInput = that.getUserInput();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userInput", lhsUserInput), LocatorUtils.property(thatLocator, "userInput", rhsUserInput), lhsUserInput, rhsUserInput)) {
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
            String theChoiceValue;
            theChoiceValue = this.getChoiceValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "choiceValue", theChoiceValue), currentHashCode, theChoiceValue);
        }
        {
            boolean theIsSelected;
            theIsSelected = (true?this.isIsSelected():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSelected", theIsSelected), currentHashCode, theIsSelected);
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
            String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText);
        }
        {
            FlowInterviewChoiceUserInput theUserInput;
            theUserInput = this.getUserInput();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userInput", theUserInput), currentHashCode, theUserInput);
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
            String theChoiceValue;
            theChoiceValue = this.getChoiceValue();
            strategy.appendField(locator, this, "choiceValue", buffer, theChoiceValue);
        }
        {
            boolean theIsSelected;
            theIsSelected = (true?this.isIsSelected():false);
            strategy.appendField(locator, this, "isSelected", buffer, theIsSelected);
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
            String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            FlowInterviewChoiceUserInput theUserInput;
            theUserInput = this.getUserInput();
            strategy.appendField(locator, this, "userInput", buffer, theUserInput);
        }
        return buffer;
    }

}
