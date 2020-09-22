
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
 * <p>Java class for FlowInterviewScreenField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowInterviewScreenField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choices" type="{urn:partner.soap.sforce.com}FlowInterviewChoice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contextMap" type="{urn:partner.soap.sforce.com}NameValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorMessages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="extensionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fields" type="{urn:partner.soap.sforce.com}FlowInterviewScreenField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="helpText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inputs" type="{urn:partner.soap.sforce.com}FlowInterviewScreenFieldInput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isValidValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metadataValues" type="{urn:partner.soap.sforce.com}FlowInterviewMetadataValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputs" type="{urn:partner.soap.sforce.com}FlowInterviewScreenFieldOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="triggersUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="visibilityRule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowInterviewScreenField", propOrder = {
    "choices",
    "contextMaps",
    "dataType",
    "errorMessages",
    "extensionName",
    "extensionType",
    "fields",
    "fieldType",
    "helpText",
    "inputs",
    "isRequired",
    "isValidValue",
    "label",
    "metadataValues",
    "name",
    "outputs",
    "triggersUpdate",
    "value",
    "visibilityRule"
})
public class FlowInterviewScreenField
    implements Equals, HashCode, ToString
{

    protected List<FlowInterviewChoice> choices;
    @XmlElement(name = "contextMap")
    protected List<NameValuePair> contextMaps;
    @XmlElement(required = true)
    protected String dataType;
    protected List<String> errorMessages;
    @XmlElement(required = true, nillable = true)
    protected String extensionName;
    @XmlElement(nillable = true)
    protected String extensionType;
    protected List<FlowInterviewScreenField> fields;
    @XmlElement(required = true)
    protected String fieldType;
    @XmlElement(required = true, nillable = true)
    protected String helpText;
    protected List<FlowInterviewScreenFieldInput> inputs;
    protected boolean isRequired;
    protected boolean isValidValue;
    @XmlElement(required = true)
    protected String label;
    protected List<FlowInterviewMetadataValue> metadataValues;
    @XmlElement(required = true)
    protected String name;
    protected List<FlowInterviewScreenFieldOutput> outputs;
    protected boolean triggersUpdate;
    @XmlElement(required = true, nillable = true)
    protected Object value;
    @XmlElement(required = true)
    protected String visibilityRule;

    /**
     * Gets the value of the choices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewChoice }
     * 
     * 
     */
    public List<FlowInterviewChoice> getChoices() {
        if (choices == null) {
            choices = new ArrayList<FlowInterviewChoice>();
        }
        return this.choices;
    }

    /**
     * Gets the value of the contextMaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextMaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextMaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getContextMaps() {
        if (contextMaps == null) {
            contextMaps = new ArrayList<NameValuePair>();
        }
        return this.contextMaps;
    }

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
     * Gets the value of the extensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionName() {
        return extensionName;
    }

    /**
     * Sets the value of the extensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionName(String value) {
        this.extensionName = value;
    }

    /**
     * Gets the value of the extensionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionType() {
        return extensionType;
    }

    /**
     * Sets the value of the extensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionType(String value) {
        this.extensionType = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewScreenField }
     * 
     * 
     */
    public List<FlowInterviewScreenField> getFields() {
        if (fields == null) {
            fields = new ArrayList<FlowInterviewScreenField>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    /**
     * Gets the value of the inputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewScreenFieldInput }
     * 
     * 
     */
    public List<FlowInterviewScreenFieldInput> getInputs() {
        if (inputs == null) {
            inputs = new ArrayList<FlowInterviewScreenFieldInput>();
        }
        return this.inputs;
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
     * Gets the value of the metadataValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewMetadataValue }
     * 
     * 
     */
    public List<FlowInterviewMetadataValue> getMetadataValues() {
        if (metadataValues == null) {
            metadataValues = new ArrayList<FlowInterviewMetadataValue>();
        }
        return this.metadataValues;
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
     * Gets the value of the outputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewScreenFieldOutput }
     * 
     * 
     */
    public List<FlowInterviewScreenFieldOutput> getOutputs() {
        if (outputs == null) {
            outputs = new ArrayList<FlowInterviewScreenFieldOutput>();
        }
        return this.outputs;
    }

    /**
     * Gets the value of the triggersUpdate property.
     * 
     */
    public boolean isTriggersUpdate() {
        return triggersUpdate;
    }

    /**
     * Sets the value of the triggersUpdate property.
     * 
     */
    public void setTriggersUpdate(boolean value) {
        this.triggersUpdate = value;
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

    /**
     * Gets the value of the visibilityRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityRule() {
        return visibilityRule;
    }

    /**
     * Sets the value of the visibilityRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityRule(String value) {
        this.visibilityRule = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlowInterviewScreenField)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FlowInterviewScreenField that = ((FlowInterviewScreenField) object);
        {
            List<FlowInterviewChoice> lhsChoices;
            lhsChoices = (((this.choices!= null)&&(!this.choices.isEmpty()))?this.getChoices():null);
            List<FlowInterviewChoice> rhsChoices;
            rhsChoices = (((that.choices!= null)&&(!that.choices.isEmpty()))?that.getChoices():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "choices", lhsChoices), LocatorUtils.property(thatLocator, "choices", rhsChoices), lhsChoices, rhsChoices)) {
                return false;
            }
        }
        {
            List<NameValuePair> lhsContextMaps;
            lhsContextMaps = (((this.contextMaps!= null)&&(!this.contextMaps.isEmpty()))?this.getContextMaps():null);
            List<NameValuePair> rhsContextMaps;
            rhsContextMaps = (((that.contextMaps!= null)&&(!that.contextMaps.isEmpty()))?that.getContextMaps():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextMaps", lhsContextMaps), LocatorUtils.property(thatLocator, "contextMaps", rhsContextMaps), lhsContextMaps, rhsContextMaps)) {
                return false;
            }
        }
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
            String lhsExtensionName;
            lhsExtensionName = this.getExtensionName();
            String rhsExtensionName;
            rhsExtensionName = that.getExtensionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionName", lhsExtensionName), LocatorUtils.property(thatLocator, "extensionName", rhsExtensionName), lhsExtensionName, rhsExtensionName)) {
                return false;
            }
        }
        {
            String lhsExtensionType;
            lhsExtensionType = this.getExtensionType();
            String rhsExtensionType;
            rhsExtensionType = that.getExtensionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extensionType", lhsExtensionType), LocatorUtils.property(thatLocator, "extensionType", rhsExtensionType), lhsExtensionType, rhsExtensionType)) {
                return false;
            }
        }
        {
            List<FlowInterviewScreenField> lhsFields;
            lhsFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            List<FlowInterviewScreenField> rhsFields;
            rhsFields = (((that.fields!= null)&&(!that.fields.isEmpty()))?that.getFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields)) {
                return false;
            }
        }
        {
            String lhsFieldType;
            lhsFieldType = this.getFieldType();
            String rhsFieldType;
            rhsFieldType = that.getFieldType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldType", lhsFieldType), LocatorUtils.property(thatLocator, "fieldType", rhsFieldType), lhsFieldType, rhsFieldType)) {
                return false;
            }
        }
        {
            String lhsHelpText;
            lhsHelpText = this.getHelpText();
            String rhsHelpText;
            rhsHelpText = that.getHelpText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "helpText", lhsHelpText), LocatorUtils.property(thatLocator, "helpText", rhsHelpText), lhsHelpText, rhsHelpText)) {
                return false;
            }
        }
        {
            List<FlowInterviewScreenFieldInput> lhsInputs;
            lhsInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            List<FlowInterviewScreenFieldInput> rhsInputs;
            rhsInputs = (((that.inputs!= null)&&(!that.inputs.isEmpty()))?that.getInputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputs", lhsInputs), LocatorUtils.property(thatLocator, "inputs", rhsInputs), lhsInputs, rhsInputs)) {
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
            List<FlowInterviewMetadataValue> lhsMetadataValues;
            lhsMetadataValues = (((this.metadataValues!= null)&&(!this.metadataValues.isEmpty()))?this.getMetadataValues():null);
            List<FlowInterviewMetadataValue> rhsMetadataValues;
            rhsMetadataValues = (((that.metadataValues!= null)&&(!that.metadataValues.isEmpty()))?that.getMetadataValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metadataValues", lhsMetadataValues), LocatorUtils.property(thatLocator, "metadataValues", rhsMetadataValues), lhsMetadataValues, rhsMetadataValues)) {
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
            List<FlowInterviewScreenFieldOutput> lhsOutputs;
            lhsOutputs = (((this.outputs!= null)&&(!this.outputs.isEmpty()))?this.getOutputs():null);
            List<FlowInterviewScreenFieldOutput> rhsOutputs;
            rhsOutputs = (((that.outputs!= null)&&(!that.outputs.isEmpty()))?that.getOutputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputs", lhsOutputs), LocatorUtils.property(thatLocator, "outputs", rhsOutputs), lhsOutputs, rhsOutputs)) {
                return false;
            }
        }
        {
            boolean lhsTriggersUpdate;
            lhsTriggersUpdate = (true?this.isTriggersUpdate():false);
            boolean rhsTriggersUpdate;
            rhsTriggersUpdate = (true?that.isTriggersUpdate():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "triggersUpdate", lhsTriggersUpdate), LocatorUtils.property(thatLocator, "triggersUpdate", rhsTriggersUpdate), lhsTriggersUpdate, rhsTriggersUpdate)) {
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
        {
            String lhsVisibilityRule;
            lhsVisibilityRule = this.getVisibilityRule();
            String rhsVisibilityRule;
            rhsVisibilityRule = that.getVisibilityRule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "visibilityRule", lhsVisibilityRule), LocatorUtils.property(thatLocator, "visibilityRule", rhsVisibilityRule), lhsVisibilityRule, rhsVisibilityRule)) {
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
            List<FlowInterviewChoice> theChoices;
            theChoices = (((this.choices!= null)&&(!this.choices.isEmpty()))?this.getChoices():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "choices", theChoices), currentHashCode, theChoices);
        }
        {
            List<NameValuePair> theContextMaps;
            theContextMaps = (((this.contextMaps!= null)&&(!this.contextMaps.isEmpty()))?this.getContextMaps():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextMaps", theContextMaps), currentHashCode, theContextMaps);
        }
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
            String theExtensionName;
            theExtensionName = this.getExtensionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionName", theExtensionName), currentHashCode, theExtensionName);
        }
        {
            String theExtensionType;
            theExtensionType = this.getExtensionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extensionType", theExtensionType), currentHashCode, theExtensionType);
        }
        {
            List<FlowInterviewScreenField> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fields", theFields), currentHashCode, theFields);
        }
        {
            String theFieldType;
            theFieldType = this.getFieldType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldType", theFieldType), currentHashCode, theFieldType);
        }
        {
            String theHelpText;
            theHelpText = this.getHelpText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "helpText", theHelpText), currentHashCode, theHelpText);
        }
        {
            List<FlowInterviewScreenFieldInput> theInputs;
            theInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputs", theInputs), currentHashCode, theInputs);
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
            List<FlowInterviewMetadataValue> theMetadataValues;
            theMetadataValues = (((this.metadataValues!= null)&&(!this.metadataValues.isEmpty()))?this.getMetadataValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metadataValues", theMetadataValues), currentHashCode, theMetadataValues);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<FlowInterviewScreenFieldOutput> theOutputs;
            theOutputs = (((this.outputs!= null)&&(!this.outputs.isEmpty()))?this.getOutputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputs", theOutputs), currentHashCode, theOutputs);
        }
        {
            boolean theTriggersUpdate;
            theTriggersUpdate = (true?this.isTriggersUpdate():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "triggersUpdate", theTriggersUpdate), currentHashCode, theTriggersUpdate);
        }
        {
            Object theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theVisibilityRule;
            theVisibilityRule = this.getVisibilityRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "visibilityRule", theVisibilityRule), currentHashCode, theVisibilityRule);
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
            List<FlowInterviewChoice> theChoices;
            theChoices = (((this.choices!= null)&&(!this.choices.isEmpty()))?this.getChoices():null);
            strategy.appendField(locator, this, "choices", buffer, theChoices);
        }
        {
            List<NameValuePair> theContextMaps;
            theContextMaps = (((this.contextMaps!= null)&&(!this.contextMaps.isEmpty()))?this.getContextMaps():null);
            strategy.appendField(locator, this, "contextMaps", buffer, theContextMaps);
        }
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
            String theExtensionName;
            theExtensionName = this.getExtensionName();
            strategy.appendField(locator, this, "extensionName", buffer, theExtensionName);
        }
        {
            String theExtensionType;
            theExtensionType = this.getExtensionType();
            strategy.appendField(locator, this, "extensionType", buffer, theExtensionType);
        }
        {
            List<FlowInterviewScreenField> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            strategy.appendField(locator, this, "fields", buffer, theFields);
        }
        {
            String theFieldType;
            theFieldType = this.getFieldType();
            strategy.appendField(locator, this, "fieldType", buffer, theFieldType);
        }
        {
            String theHelpText;
            theHelpText = this.getHelpText();
            strategy.appendField(locator, this, "helpText", buffer, theHelpText);
        }
        {
            List<FlowInterviewScreenFieldInput> theInputs;
            theInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            strategy.appendField(locator, this, "inputs", buffer, theInputs);
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
            List<FlowInterviewMetadataValue> theMetadataValues;
            theMetadataValues = (((this.metadataValues!= null)&&(!this.metadataValues.isEmpty()))?this.getMetadataValues():null);
            strategy.appendField(locator, this, "metadataValues", buffer, theMetadataValues);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<FlowInterviewScreenFieldOutput> theOutputs;
            theOutputs = (((this.outputs!= null)&&(!this.outputs.isEmpty()))?this.getOutputs():null);
            strategy.appendField(locator, this, "outputs", buffer, theOutputs);
        }
        {
            boolean theTriggersUpdate;
            theTriggersUpdate = (true?this.isTriggersUpdate():false);
            strategy.appendField(locator, this, "triggersUpdate", buffer, theTriggersUpdate);
        }
        {
            Object theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theVisibilityRule;
            theVisibilityRule = this.getVisibilityRule();
            strategy.appendField(locator, this, "visibilityRule", buffer, theVisibilityRule);
        }
        return buffer;
    }

}
