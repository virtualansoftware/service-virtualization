
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
 * <p>Java class for Field complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aggregatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="aiPredictionField" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="autoNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="byteLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calculated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="calculatedFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cascadeDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="compoundFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controllerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dataTranslationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="defaultValueFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultedOnCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dependentPicklist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deprecatedAndHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="digits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="displayLocationInDecimal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="extraTypeInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filterable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filteredLookupInfo" type="{urn:partner.soap.sforce.com}FilteredLookupInfo" minOccurs="0"/&gt;
 *         &lt;element name="formulaTreatNullNumberAsZero" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="groupable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="highScaleNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="htmlFormatted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="idLookup" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inlineHelpText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nameField" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="namePointing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nillable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="permissionable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="picklistValues" type="{urn:partner.soap.sforce.com}PicklistEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="polymorphicForeignKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="queryByDistance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="referenceTargetField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationshipOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="restrictedDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="restrictedPicklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="searchPrefilterable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="soapType" type="{urn:partner.soap.sforce.com}soapType"/&gt;
 *         &lt;element name="sortable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:partner.soap.sforce.com}fieldType"/&gt;
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="updateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="writeRequiresMasterRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field", propOrder = {
    "aggregatable",
    "aiPredictionField",
    "autoNumber",
    "byteLength",
    "calculated",
    "calculatedFormula",
    "cascadeDelete",
    "caseSensitive",
    "compoundFieldName",
    "controllerName",
    "createable",
    "custom",
    "dataTranslationEnabled",
    "defaultValue",
    "defaultValueFormula",
    "defaultedOnCreate",
    "dependentPicklist",
    "deprecatedAndHidden",
    "digits",
    "displayLocationInDecimal",
    "encrypted",
    "externalId",
    "extraTypeInfo",
    "filterable",
    "filteredLookupInfo",
    "formulaTreatNullNumberAsZero",
    "groupable",
    "highScaleNumber",
    "htmlFormatted",
    "idLookup",
    "inlineHelpText",
    "label",
    "length",
    "mask",
    "maskType",
    "name",
    "nameField",
    "namePointing",
    "nillable",
    "permissionable",
    "picklistValues",
    "polymorphicForeignKey",
    "precision",
    "queryByDistance",
    "referenceTargetField",
    "referenceTos",
    "relationshipName",
    "relationshipOrder",
    "restrictedDelete",
    "restrictedPicklist",
    "scale",
    "searchPrefilterable",
    "soapType",
    "sortable",
    "type",
    "unique",
    "updateable",
    "writeRequiresMasterRead"
})
public class Field
    implements Equals, HashCode, ToString
{

    protected boolean aggregatable;
    protected boolean aiPredictionField;
    protected boolean autoNumber;
    protected int byteLength;
    protected boolean calculated;
    protected String calculatedFormula;
    protected Boolean cascadeDelete;
    protected boolean caseSensitive;
    protected String compoundFieldName;
    protected String controllerName;
    protected boolean createable;
    protected boolean custom;
    protected Boolean dataTranslationEnabled;
    protected Object defaultValue;
    protected String defaultValueFormula;
    protected boolean defaultedOnCreate;
    protected Boolean dependentPicklist;
    protected boolean deprecatedAndHidden;
    protected int digits;
    protected Boolean displayLocationInDecimal;
    protected Boolean encrypted;
    protected Boolean externalId;
    protected String extraTypeInfo;
    protected boolean filterable;
    @XmlElement(nillable = true)
    protected FilteredLookupInfo filteredLookupInfo;
    protected Boolean formulaTreatNullNumberAsZero;
    protected boolean groupable;
    protected Boolean highScaleNumber;
    protected Boolean htmlFormatted;
    protected boolean idLookup;
    protected String inlineHelpText;
    @XmlElement(required = true)
    protected String label;
    protected int length;
    protected String mask;
    protected String maskType;
    @XmlElement(required = true)
    protected String name;
    protected boolean nameField;
    protected Boolean namePointing;
    protected boolean nillable;
    protected boolean permissionable;
    @XmlElement(nillable = true)
    protected List<PicklistEntry> picklistValues;
    protected boolean polymorphicForeignKey;
    protected int precision;
    protected boolean queryByDistance;
    protected String referenceTargetField;
    @XmlElement(name = "referenceTo", nillable = true)
    protected List<String> referenceTos;
    protected String relationshipName;
    protected Integer relationshipOrder;
    protected Boolean restrictedDelete;
    protected boolean restrictedPicklist;
    protected int scale;
    protected boolean searchPrefilterable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SoapType soapType;
    protected Boolean sortable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FieldType type;
    protected boolean unique;
    protected boolean updateable;
    protected Boolean writeRequiresMasterRead;

    /**
     * Gets the value of the aggregatable property.
     * 
     */
    public boolean isAggregatable() {
        return aggregatable;
    }

    /**
     * Sets the value of the aggregatable property.
     * 
     */
    public void setAggregatable(boolean value) {
        this.aggregatable = value;
    }

    /**
     * Gets the value of the aiPredictionField property.
     * 
     */
    public boolean isAiPredictionField() {
        return aiPredictionField;
    }

    /**
     * Sets the value of the aiPredictionField property.
     * 
     */
    public void setAiPredictionField(boolean value) {
        this.aiPredictionField = value;
    }

    /**
     * Gets the value of the autoNumber property.
     * 
     */
    public boolean isAutoNumber() {
        return autoNumber;
    }

    /**
     * Sets the value of the autoNumber property.
     * 
     */
    public void setAutoNumber(boolean value) {
        this.autoNumber = value;
    }

    /**
     * Gets the value of the byteLength property.
     * 
     */
    public int getByteLength() {
        return byteLength;
    }

    /**
     * Sets the value of the byteLength property.
     * 
     */
    public void setByteLength(int value) {
        this.byteLength = value;
    }

    /**
     * Gets the value of the calculated property.
     * 
     */
    public boolean isCalculated() {
        return calculated;
    }

    /**
     * Sets the value of the calculated property.
     * 
     */
    public void setCalculated(boolean value) {
        this.calculated = value;
    }

    /**
     * Gets the value of the calculatedFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedFormula() {
        return calculatedFormula;
    }

    /**
     * Sets the value of the calculatedFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedFormula(String value) {
        this.calculatedFormula = value;
    }

    /**
     * Gets the value of the cascadeDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCascadeDelete() {
        return cascadeDelete;
    }

    /**
     * Sets the value of the cascadeDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCascadeDelete(Boolean value) {
        this.cascadeDelete = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     */
    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     */
    public void setCaseSensitive(boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the compoundFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundFieldName() {
        return compoundFieldName;
    }

    /**
     * Sets the value of the compoundFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundFieldName(String value) {
        this.compoundFieldName = value;
    }

    /**
     * Gets the value of the controllerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerName() {
        return controllerName;
    }

    /**
     * Sets the value of the controllerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerName(String value) {
        this.controllerName = value;
    }

    /**
     * Gets the value of the createable property.
     * 
     */
    public boolean isCreateable() {
        return createable;
    }

    /**
     * Sets the value of the createable property.
     * 
     */
    public void setCreateable(boolean value) {
        this.createable = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the dataTranslationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataTranslationEnabled() {
        return dataTranslationEnabled;
    }

    /**
     * Sets the value of the dataTranslationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataTranslationEnabled(Boolean value) {
        this.dataTranslationEnabled = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefaultValue(Object value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the defaultValueFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValueFormula() {
        return defaultValueFormula;
    }

    /**
     * Sets the value of the defaultValueFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValueFormula(String value) {
        this.defaultValueFormula = value;
    }

    /**
     * Gets the value of the defaultedOnCreate property.
     * 
     */
    public boolean isDefaultedOnCreate() {
        return defaultedOnCreate;
    }

    /**
     * Sets the value of the defaultedOnCreate property.
     * 
     */
    public void setDefaultedOnCreate(boolean value) {
        this.defaultedOnCreate = value;
    }

    /**
     * Gets the value of the dependentPicklist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDependentPicklist() {
        return dependentPicklist;
    }

    /**
     * Sets the value of the dependentPicklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDependentPicklist(Boolean value) {
        this.dependentPicklist = value;
    }

    /**
     * Gets the value of the deprecatedAndHidden property.
     * 
     */
    public boolean isDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    /**
     * Sets the value of the deprecatedAndHidden property.
     * 
     */
    public void setDeprecatedAndHidden(boolean value) {
        this.deprecatedAndHidden = value;
    }

    /**
     * Gets the value of the digits property.
     * 
     */
    public int getDigits() {
        return digits;
    }

    /**
     * Sets the value of the digits property.
     * 
     */
    public void setDigits(int value) {
        this.digits = value;
    }

    /**
     * Gets the value of the displayLocationInDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayLocationInDecimal() {
        return displayLocationInDecimal;
    }

    /**
     * Sets the value of the displayLocationInDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayLocationInDecimal(Boolean value) {
        this.displayLocationInDecimal = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalId(Boolean value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the extraTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraTypeInfo() {
        return extraTypeInfo;
    }

    /**
     * Sets the value of the extraTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraTypeInfo(String value) {
        this.extraTypeInfo = value;
    }

    /**
     * Gets the value of the filterable property.
     * 
     */
    public boolean isFilterable() {
        return filterable;
    }

    /**
     * Sets the value of the filterable property.
     * 
     */
    public void setFilterable(boolean value) {
        this.filterable = value;
    }

    /**
     * Gets the value of the filteredLookupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FilteredLookupInfo }
     *     
     */
    public FilteredLookupInfo getFilteredLookupInfo() {
        return filteredLookupInfo;
    }

    /**
     * Sets the value of the filteredLookupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilteredLookupInfo }
     *     
     */
    public void setFilteredLookupInfo(FilteredLookupInfo value) {
        this.filteredLookupInfo = value;
    }

    /**
     * Gets the value of the formulaTreatNullNumberAsZero property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormulaTreatNullNumberAsZero() {
        return formulaTreatNullNumberAsZero;
    }

    /**
     * Sets the value of the formulaTreatNullNumberAsZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormulaTreatNullNumberAsZero(Boolean value) {
        this.formulaTreatNullNumberAsZero = value;
    }

    /**
     * Gets the value of the groupable property.
     * 
     */
    public boolean isGroupable() {
        return groupable;
    }

    /**
     * Sets the value of the groupable property.
     * 
     */
    public void setGroupable(boolean value) {
        this.groupable = value;
    }

    /**
     * Gets the value of the highScaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighScaleNumber() {
        return highScaleNumber;
    }

    /**
     * Sets the value of the highScaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighScaleNumber(Boolean value) {
        this.highScaleNumber = value;
    }

    /**
     * Gets the value of the htmlFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHtmlFormatted() {
        return htmlFormatted;
    }

    /**
     * Sets the value of the htmlFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHtmlFormatted(Boolean value) {
        this.htmlFormatted = value;
    }

    /**
     * Gets the value of the idLookup property.
     * 
     */
    public boolean isIdLookup() {
        return idLookup;
    }

    /**
     * Sets the value of the idLookup property.
     * 
     */
    public void setIdLookup(boolean value) {
        this.idLookup = value;
    }

    /**
     * Gets the value of the inlineHelpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineHelpText() {
        return inlineHelpText;
    }

    /**
     * Sets the value of the inlineHelpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineHelpText(String value) {
        this.inlineHelpText = value;
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
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the maskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskType() {
        return maskType;
    }

    /**
     * Sets the value of the maskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskType(String value) {
        this.maskType = value;
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
     * Gets the value of the nameField property.
     * 
     */
    public boolean isNameField() {
        return nameField;
    }

    /**
     * Sets the value of the nameField property.
     * 
     */
    public void setNameField(boolean value) {
        this.nameField = value;
    }

    /**
     * Gets the value of the namePointing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNamePointing() {
        return namePointing;
    }

    /**
     * Sets the value of the namePointing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNamePointing(Boolean value) {
        this.namePointing = value;
    }

    /**
     * Gets the value of the nillable property.
     * 
     */
    public boolean isNillable() {
        return nillable;
    }

    /**
     * Sets the value of the nillable property.
     * 
     */
    public void setNillable(boolean value) {
        this.nillable = value;
    }

    /**
     * Gets the value of the permissionable property.
     * 
     */
    public boolean isPermissionable() {
        return permissionable;
    }

    /**
     * Sets the value of the permissionable property.
     * 
     */
    public void setPermissionable(boolean value) {
        this.permissionable = value;
    }

    /**
     * Gets the value of the picklistValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picklistValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicklistValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistEntry }
     * 
     * 
     */
    public List<PicklistEntry> getPicklistValues() {
        if (picklistValues == null) {
            picklistValues = new ArrayList<PicklistEntry>();
        }
        return this.picklistValues;
    }

    /**
     * Gets the value of the polymorphicForeignKey property.
     * 
     */
    public boolean isPolymorphicForeignKey() {
        return polymorphicForeignKey;
    }

    /**
     * Sets the value of the polymorphicForeignKey property.
     * 
     */
    public void setPolymorphicForeignKey(boolean value) {
        this.polymorphicForeignKey = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

    /**
     * Gets the value of the queryByDistance property.
     * 
     */
    public boolean isQueryByDistance() {
        return queryByDistance;
    }

    /**
     * Sets the value of the queryByDistance property.
     * 
     */
    public void setQueryByDistance(boolean value) {
        this.queryByDistance = value;
    }

    /**
     * Gets the value of the referenceTargetField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTargetField() {
        return referenceTargetField;
    }

    /**
     * Sets the value of the referenceTargetField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTargetField(String value) {
        this.referenceTargetField = value;
    }

    /**
     * Gets the value of the referenceTos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceTos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceTos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceTos() {
        if (referenceTos == null) {
            referenceTos = new ArrayList<String>();
        }
        return this.referenceTos;
    }

    /**
     * Gets the value of the relationshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    /**
     * Gets the value of the relationshipOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelationshipOrder() {
        return relationshipOrder;
    }

    /**
     * Sets the value of the relationshipOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelationshipOrder(Integer value) {
        this.relationshipOrder = value;
    }

    /**
     * Gets the value of the restrictedDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedDelete() {
        return restrictedDelete;
    }

    /**
     * Sets the value of the restrictedDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedDelete(Boolean value) {
        this.restrictedDelete = value;
    }

    /**
     * Gets the value of the restrictedPicklist property.
     * 
     */
    public boolean isRestrictedPicklist() {
        return restrictedPicklist;
    }

    /**
     * Sets the value of the restrictedPicklist property.
     * 
     */
    public void setRestrictedPicklist(boolean value) {
        this.restrictedPicklist = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     */
    public int getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     */
    public void setScale(int value) {
        this.scale = value;
    }

    /**
     * Gets the value of the searchPrefilterable property.
     * 
     */
    public boolean isSearchPrefilterable() {
        return searchPrefilterable;
    }

    /**
     * Sets the value of the searchPrefilterable property.
     * 
     */
    public void setSearchPrefilterable(boolean value) {
        this.searchPrefilterable = value;
    }

    /**
     * Gets the value of the soapType property.
     * 
     * @return
     *     possible object is
     *     {@link SoapType }
     *     
     */
    public SoapType getSoapType() {
        return soapType;
    }

    /**
     * Sets the value of the soapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapType }
     *     
     */
    public void setSoapType(SoapType value) {
        this.soapType = value;
    }

    /**
     * Gets the value of the sortable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortable() {
        return sortable;
    }

    /**
     * Sets the value of the sortable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortable(Boolean value) {
        this.sortable = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setType(FieldType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     */
    public void setUnique(boolean value) {
        this.unique = value;
    }

    /**
     * Gets the value of the updateable property.
     * 
     */
    public boolean isUpdateable() {
        return updateable;
    }

    /**
     * Sets the value of the updateable property.
     * 
     */
    public void setUpdateable(boolean value) {
        this.updateable = value;
    }

    /**
     * Gets the value of the writeRequiresMasterRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWriteRequiresMasterRead() {
        return writeRequiresMasterRead;
    }

    /**
     * Sets the value of the writeRequiresMasterRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteRequiresMasterRead(Boolean value) {
        this.writeRequiresMasterRead = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Field)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Field that = ((Field) object);
        {
            boolean lhsAggregatable;
            lhsAggregatable = (true?this.isAggregatable():false);
            boolean rhsAggregatable;
            rhsAggregatable = (true?that.isAggregatable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregatable", lhsAggregatable), LocatorUtils.property(thatLocator, "aggregatable", rhsAggregatable), lhsAggregatable, rhsAggregatable)) {
                return false;
            }
        }
        {
            boolean lhsAiPredictionField;
            lhsAiPredictionField = (true?this.isAiPredictionField():false);
            boolean rhsAiPredictionField;
            rhsAiPredictionField = (true?that.isAiPredictionField():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aiPredictionField", lhsAiPredictionField), LocatorUtils.property(thatLocator, "aiPredictionField", rhsAiPredictionField), lhsAiPredictionField, rhsAiPredictionField)) {
                return false;
            }
        }
        {
            boolean lhsAutoNumber;
            lhsAutoNumber = (true?this.isAutoNumber():false);
            boolean rhsAutoNumber;
            rhsAutoNumber = (true?that.isAutoNumber():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autoNumber", lhsAutoNumber), LocatorUtils.property(thatLocator, "autoNumber", rhsAutoNumber), lhsAutoNumber, rhsAutoNumber)) {
                return false;
            }
        }
        {
            int lhsByteLength;
            lhsByteLength = (true?this.getByteLength(): 0);
            int rhsByteLength;
            rhsByteLength = (true?that.getByteLength(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "byteLength", lhsByteLength), LocatorUtils.property(thatLocator, "byteLength", rhsByteLength), lhsByteLength, rhsByteLength)) {
                return false;
            }
        }
        {
            boolean lhsCalculated;
            lhsCalculated = (true?this.isCalculated():false);
            boolean rhsCalculated;
            rhsCalculated = (true?that.isCalculated():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculated", lhsCalculated), LocatorUtils.property(thatLocator, "calculated", rhsCalculated), lhsCalculated, rhsCalculated)) {
                return false;
            }
        }
        {
            String lhsCalculatedFormula;
            lhsCalculatedFormula = this.getCalculatedFormula();
            String rhsCalculatedFormula;
            rhsCalculatedFormula = that.getCalculatedFormula();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculatedFormula", lhsCalculatedFormula), LocatorUtils.property(thatLocator, "calculatedFormula", rhsCalculatedFormula), lhsCalculatedFormula, rhsCalculatedFormula)) {
                return false;
            }
        }
        {
            Boolean lhsCascadeDelete;
            lhsCascadeDelete = this.isCascadeDelete();
            Boolean rhsCascadeDelete;
            rhsCascadeDelete = that.isCascadeDelete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cascadeDelete", lhsCascadeDelete), LocatorUtils.property(thatLocator, "cascadeDelete", rhsCascadeDelete), lhsCascadeDelete, rhsCascadeDelete)) {
                return false;
            }
        }
        {
            boolean lhsCaseSensitive;
            lhsCaseSensitive = (true?this.isCaseSensitive():false);
            boolean rhsCaseSensitive;
            rhsCaseSensitive = (true?that.isCaseSensitive():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caseSensitive", lhsCaseSensitive), LocatorUtils.property(thatLocator, "caseSensitive", rhsCaseSensitive), lhsCaseSensitive, rhsCaseSensitive)) {
                return false;
            }
        }
        {
            String lhsCompoundFieldName;
            lhsCompoundFieldName = this.getCompoundFieldName();
            String rhsCompoundFieldName;
            rhsCompoundFieldName = that.getCompoundFieldName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compoundFieldName", lhsCompoundFieldName), LocatorUtils.property(thatLocator, "compoundFieldName", rhsCompoundFieldName), lhsCompoundFieldName, rhsCompoundFieldName)) {
                return false;
            }
        }
        {
            String lhsControllerName;
            lhsControllerName = this.getControllerName();
            String rhsControllerName;
            rhsControllerName = that.getControllerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "controllerName", lhsControllerName), LocatorUtils.property(thatLocator, "controllerName", rhsControllerName), lhsControllerName, rhsControllerName)) {
                return false;
            }
        }
        {
            boolean lhsCreateable;
            lhsCreateable = (true?this.isCreateable():false);
            boolean rhsCreateable;
            rhsCreateable = (true?that.isCreateable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createable", lhsCreateable), LocatorUtils.property(thatLocator, "createable", rhsCreateable), lhsCreateable, rhsCreateable)) {
                return false;
            }
        }
        {
            boolean lhsCustom;
            lhsCustom = (true?this.isCustom():false);
            boolean rhsCustom;
            rhsCustom = (true?that.isCustom():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "custom", lhsCustom), LocatorUtils.property(thatLocator, "custom", rhsCustom), lhsCustom, rhsCustom)) {
                return false;
            }
        }
        {
            Boolean lhsDataTranslationEnabled;
            lhsDataTranslationEnabled = this.isDataTranslationEnabled();
            Boolean rhsDataTranslationEnabled;
            rhsDataTranslationEnabled = that.isDataTranslationEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataTranslationEnabled", lhsDataTranslationEnabled), LocatorUtils.property(thatLocator, "dataTranslationEnabled", rhsDataTranslationEnabled), lhsDataTranslationEnabled, rhsDataTranslationEnabled)) {
                return false;
            }
        }
        {
            Object lhsDefaultValue;
            lhsDefaultValue = this.getDefaultValue();
            Object rhsDefaultValue;
            rhsDefaultValue = that.getDefaultValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultValue", lhsDefaultValue), LocatorUtils.property(thatLocator, "defaultValue", rhsDefaultValue), lhsDefaultValue, rhsDefaultValue)) {
                return false;
            }
        }
        {
            String lhsDefaultValueFormula;
            lhsDefaultValueFormula = this.getDefaultValueFormula();
            String rhsDefaultValueFormula;
            rhsDefaultValueFormula = that.getDefaultValueFormula();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultValueFormula", lhsDefaultValueFormula), LocatorUtils.property(thatLocator, "defaultValueFormula", rhsDefaultValueFormula), lhsDefaultValueFormula, rhsDefaultValueFormula)) {
                return false;
            }
        }
        {
            boolean lhsDefaultedOnCreate;
            lhsDefaultedOnCreate = (true?this.isDefaultedOnCreate():false);
            boolean rhsDefaultedOnCreate;
            rhsDefaultedOnCreate = (true?that.isDefaultedOnCreate():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultedOnCreate", lhsDefaultedOnCreate), LocatorUtils.property(thatLocator, "defaultedOnCreate", rhsDefaultedOnCreate), lhsDefaultedOnCreate, rhsDefaultedOnCreate)) {
                return false;
            }
        }
        {
            Boolean lhsDependentPicklist;
            lhsDependentPicklist = this.isDependentPicklist();
            Boolean rhsDependentPicklist;
            rhsDependentPicklist = that.isDependentPicklist();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dependentPicklist", lhsDependentPicklist), LocatorUtils.property(thatLocator, "dependentPicklist", rhsDependentPicklist), lhsDependentPicklist, rhsDependentPicklist)) {
                return false;
            }
        }
        {
            boolean lhsDeprecatedAndHidden;
            lhsDeprecatedAndHidden = (true?this.isDeprecatedAndHidden():false);
            boolean rhsDeprecatedAndHidden;
            rhsDeprecatedAndHidden = (true?that.isDeprecatedAndHidden():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deprecatedAndHidden", lhsDeprecatedAndHidden), LocatorUtils.property(thatLocator, "deprecatedAndHidden", rhsDeprecatedAndHidden), lhsDeprecatedAndHidden, rhsDeprecatedAndHidden)) {
                return false;
            }
        }
        {
            int lhsDigits;
            lhsDigits = (true?this.getDigits(): 0);
            int rhsDigits;
            rhsDigits = (true?that.getDigits(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digits", lhsDigits), LocatorUtils.property(thatLocator, "digits", rhsDigits), lhsDigits, rhsDigits)) {
                return false;
            }
        }
        {
            Boolean lhsDisplayLocationInDecimal;
            lhsDisplayLocationInDecimal = this.isDisplayLocationInDecimal();
            Boolean rhsDisplayLocationInDecimal;
            rhsDisplayLocationInDecimal = that.isDisplayLocationInDecimal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayLocationInDecimal", lhsDisplayLocationInDecimal), LocatorUtils.property(thatLocator, "displayLocationInDecimal", rhsDisplayLocationInDecimal), lhsDisplayLocationInDecimal, rhsDisplayLocationInDecimal)) {
                return false;
            }
        }
        {
            Boolean lhsEncrypted;
            lhsEncrypted = this.isEncrypted();
            Boolean rhsEncrypted;
            rhsEncrypted = that.isEncrypted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encrypted", lhsEncrypted), LocatorUtils.property(thatLocator, "encrypted", rhsEncrypted), lhsEncrypted, rhsEncrypted)) {
                return false;
            }
        }
        {
            Boolean lhsExternalId;
            lhsExternalId = this.isExternalId();
            Boolean rhsExternalId;
            rhsExternalId = that.isExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId)) {
                return false;
            }
        }
        {
            String lhsExtraTypeInfo;
            lhsExtraTypeInfo = this.getExtraTypeInfo();
            String rhsExtraTypeInfo;
            rhsExtraTypeInfo = that.getExtraTypeInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extraTypeInfo", lhsExtraTypeInfo), LocatorUtils.property(thatLocator, "extraTypeInfo", rhsExtraTypeInfo), lhsExtraTypeInfo, rhsExtraTypeInfo)) {
                return false;
            }
        }
        {
            boolean lhsFilterable;
            lhsFilterable = (true?this.isFilterable():false);
            boolean rhsFilterable;
            rhsFilterable = (true?that.isFilterable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filterable", lhsFilterable), LocatorUtils.property(thatLocator, "filterable", rhsFilterable), lhsFilterable, rhsFilterable)) {
                return false;
            }
        }
        {
            FilteredLookupInfo lhsFilteredLookupInfo;
            lhsFilteredLookupInfo = this.getFilteredLookupInfo();
            FilteredLookupInfo rhsFilteredLookupInfo;
            rhsFilteredLookupInfo = that.getFilteredLookupInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filteredLookupInfo", lhsFilteredLookupInfo), LocatorUtils.property(thatLocator, "filteredLookupInfo", rhsFilteredLookupInfo), lhsFilteredLookupInfo, rhsFilteredLookupInfo)) {
                return false;
            }
        }
        {
            Boolean lhsFormulaTreatNullNumberAsZero;
            lhsFormulaTreatNullNumberAsZero = this.isFormulaTreatNullNumberAsZero();
            Boolean rhsFormulaTreatNullNumberAsZero;
            rhsFormulaTreatNullNumberAsZero = that.isFormulaTreatNullNumberAsZero();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formulaTreatNullNumberAsZero", lhsFormulaTreatNullNumberAsZero), LocatorUtils.property(thatLocator, "formulaTreatNullNumberAsZero", rhsFormulaTreatNullNumberAsZero), lhsFormulaTreatNullNumberAsZero, rhsFormulaTreatNullNumberAsZero)) {
                return false;
            }
        }
        {
            boolean lhsGroupable;
            lhsGroupable = (true?this.isGroupable():false);
            boolean rhsGroupable;
            rhsGroupable = (true?that.isGroupable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupable", lhsGroupable), LocatorUtils.property(thatLocator, "groupable", rhsGroupable), lhsGroupable, rhsGroupable)) {
                return false;
            }
        }
        {
            Boolean lhsHighScaleNumber;
            lhsHighScaleNumber = this.isHighScaleNumber();
            Boolean rhsHighScaleNumber;
            rhsHighScaleNumber = that.isHighScaleNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "highScaleNumber", lhsHighScaleNumber), LocatorUtils.property(thatLocator, "highScaleNumber", rhsHighScaleNumber), lhsHighScaleNumber, rhsHighScaleNumber)) {
                return false;
            }
        }
        {
            Boolean lhsHtmlFormatted;
            lhsHtmlFormatted = this.isHtmlFormatted();
            Boolean rhsHtmlFormatted;
            rhsHtmlFormatted = that.isHtmlFormatted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "htmlFormatted", lhsHtmlFormatted), LocatorUtils.property(thatLocator, "htmlFormatted", rhsHtmlFormatted), lhsHtmlFormatted, rhsHtmlFormatted)) {
                return false;
            }
        }
        {
            boolean lhsIdLookup;
            lhsIdLookup = (true?this.isIdLookup():false);
            boolean rhsIdLookup;
            rhsIdLookup = (true?that.isIdLookup():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "idLookup", lhsIdLookup), LocatorUtils.property(thatLocator, "idLookup", rhsIdLookup), lhsIdLookup, rhsIdLookup)) {
                return false;
            }
        }
        {
            String lhsInlineHelpText;
            lhsInlineHelpText = this.getInlineHelpText();
            String rhsInlineHelpText;
            rhsInlineHelpText = that.getInlineHelpText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inlineHelpText", lhsInlineHelpText), LocatorUtils.property(thatLocator, "inlineHelpText", rhsInlineHelpText), lhsInlineHelpText, rhsInlineHelpText)) {
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
            int lhsLength;
            lhsLength = (true?this.getLength(): 0);
            int rhsLength;
            rhsLength = (true?that.getLength(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "length", lhsLength), LocatorUtils.property(thatLocator, "length", rhsLength), lhsLength, rhsLength)) {
                return false;
            }
        }
        {
            String lhsMask;
            lhsMask = this.getMask();
            String rhsMask;
            rhsMask = that.getMask();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mask", lhsMask), LocatorUtils.property(thatLocator, "mask", rhsMask), lhsMask, rhsMask)) {
                return false;
            }
        }
        {
            String lhsMaskType;
            lhsMaskType = this.getMaskType();
            String rhsMaskType;
            rhsMaskType = that.getMaskType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maskType", lhsMaskType), LocatorUtils.property(thatLocator, "maskType", rhsMaskType), lhsMaskType, rhsMaskType)) {
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
            boolean lhsNameField;
            lhsNameField = (true?this.isNameField():false);
            boolean rhsNameField;
            rhsNameField = (true?that.isNameField():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameField", lhsNameField), LocatorUtils.property(thatLocator, "nameField", rhsNameField), lhsNameField, rhsNameField)) {
                return false;
            }
        }
        {
            Boolean lhsNamePointing;
            lhsNamePointing = this.isNamePointing();
            Boolean rhsNamePointing;
            rhsNamePointing = that.isNamePointing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namePointing", lhsNamePointing), LocatorUtils.property(thatLocator, "namePointing", rhsNamePointing), lhsNamePointing, rhsNamePointing)) {
                return false;
            }
        }
        {
            boolean lhsNillable;
            lhsNillable = (true?this.isNillable():false);
            boolean rhsNillable;
            rhsNillable = (true?that.isNillable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nillable", lhsNillable), LocatorUtils.property(thatLocator, "nillable", rhsNillable), lhsNillable, rhsNillable)) {
                return false;
            }
        }
        {
            boolean lhsPermissionable;
            lhsPermissionable = (true?this.isPermissionable():false);
            boolean rhsPermissionable;
            rhsPermissionable = (true?that.isPermissionable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permissionable", lhsPermissionable), LocatorUtils.property(thatLocator, "permissionable", rhsPermissionable), lhsPermissionable, rhsPermissionable)) {
                return false;
            }
        }
        {
            List<PicklistEntry> lhsPicklistValues;
            lhsPicklistValues = (((this.picklistValues!= null)&&(!this.picklistValues.isEmpty()))?this.getPicklistValues():null);
            List<PicklistEntry> rhsPicklistValues;
            rhsPicklistValues = (((that.picklistValues!= null)&&(!that.picklistValues.isEmpty()))?that.getPicklistValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picklistValues", lhsPicklistValues), LocatorUtils.property(thatLocator, "picklistValues", rhsPicklistValues), lhsPicklistValues, rhsPicklistValues)) {
                return false;
            }
        }
        {
            boolean lhsPolymorphicForeignKey;
            lhsPolymorphicForeignKey = (true?this.isPolymorphicForeignKey():false);
            boolean rhsPolymorphicForeignKey;
            rhsPolymorphicForeignKey = (true?that.isPolymorphicForeignKey():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "polymorphicForeignKey", lhsPolymorphicForeignKey), LocatorUtils.property(thatLocator, "polymorphicForeignKey", rhsPolymorphicForeignKey), lhsPolymorphicForeignKey, rhsPolymorphicForeignKey)) {
                return false;
            }
        }
        {
            int lhsPrecision;
            lhsPrecision = (true?this.getPrecision(): 0);
            int rhsPrecision;
            rhsPrecision = (true?that.getPrecision(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "precision", lhsPrecision), LocatorUtils.property(thatLocator, "precision", rhsPrecision), lhsPrecision, rhsPrecision)) {
                return false;
            }
        }
        {
            boolean lhsQueryByDistance;
            lhsQueryByDistance = (true?this.isQueryByDistance():false);
            boolean rhsQueryByDistance;
            rhsQueryByDistance = (true?that.isQueryByDistance():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryByDistance", lhsQueryByDistance), LocatorUtils.property(thatLocator, "queryByDistance", rhsQueryByDistance), lhsQueryByDistance, rhsQueryByDistance)) {
                return false;
            }
        }
        {
            String lhsReferenceTargetField;
            lhsReferenceTargetField = this.getReferenceTargetField();
            String rhsReferenceTargetField;
            rhsReferenceTargetField = that.getReferenceTargetField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceTargetField", lhsReferenceTargetField), LocatorUtils.property(thatLocator, "referenceTargetField", rhsReferenceTargetField), lhsReferenceTargetField, rhsReferenceTargetField)) {
                return false;
            }
        }
        {
            List<String> lhsReferenceTos;
            lhsReferenceTos = (((this.referenceTos!= null)&&(!this.referenceTos.isEmpty()))?this.getReferenceTos():null);
            List<String> rhsReferenceTos;
            rhsReferenceTos = (((that.referenceTos!= null)&&(!that.referenceTos.isEmpty()))?that.getReferenceTos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceTos", lhsReferenceTos), LocatorUtils.property(thatLocator, "referenceTos", rhsReferenceTos), lhsReferenceTos, rhsReferenceTos)) {
                return false;
            }
        }
        {
            String lhsRelationshipName;
            lhsRelationshipName = this.getRelationshipName();
            String rhsRelationshipName;
            rhsRelationshipName = that.getRelationshipName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationshipName", lhsRelationshipName), LocatorUtils.property(thatLocator, "relationshipName", rhsRelationshipName), lhsRelationshipName, rhsRelationshipName)) {
                return false;
            }
        }
        {
            Integer lhsRelationshipOrder;
            lhsRelationshipOrder = this.getRelationshipOrder();
            Integer rhsRelationshipOrder;
            rhsRelationshipOrder = that.getRelationshipOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationshipOrder", lhsRelationshipOrder), LocatorUtils.property(thatLocator, "relationshipOrder", rhsRelationshipOrder), lhsRelationshipOrder, rhsRelationshipOrder)) {
                return false;
            }
        }
        {
            Boolean lhsRestrictedDelete;
            lhsRestrictedDelete = this.isRestrictedDelete();
            Boolean rhsRestrictedDelete;
            rhsRestrictedDelete = that.isRestrictedDelete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restrictedDelete", lhsRestrictedDelete), LocatorUtils.property(thatLocator, "restrictedDelete", rhsRestrictedDelete), lhsRestrictedDelete, rhsRestrictedDelete)) {
                return false;
            }
        }
        {
            boolean lhsRestrictedPicklist;
            lhsRestrictedPicklist = (true?this.isRestrictedPicklist():false);
            boolean rhsRestrictedPicklist;
            rhsRestrictedPicklist = (true?that.isRestrictedPicklist():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restrictedPicklist", lhsRestrictedPicklist), LocatorUtils.property(thatLocator, "restrictedPicklist", rhsRestrictedPicklist), lhsRestrictedPicklist, rhsRestrictedPicklist)) {
                return false;
            }
        }
        {
            int lhsScale;
            lhsScale = (true?this.getScale(): 0);
            int rhsScale;
            rhsScale = (true?that.getScale(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scale", lhsScale), LocatorUtils.property(thatLocator, "scale", rhsScale), lhsScale, rhsScale)) {
                return false;
            }
        }
        {
            boolean lhsSearchPrefilterable;
            lhsSearchPrefilterable = (true?this.isSearchPrefilterable():false);
            boolean rhsSearchPrefilterable;
            rhsSearchPrefilterable = (true?that.isSearchPrefilterable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchPrefilterable", lhsSearchPrefilterable), LocatorUtils.property(thatLocator, "searchPrefilterable", rhsSearchPrefilterable), lhsSearchPrefilterable, rhsSearchPrefilterable)) {
                return false;
            }
        }
        {
            SoapType lhsSoapType;
            lhsSoapType = this.getSoapType();
            SoapType rhsSoapType;
            rhsSoapType = that.getSoapType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soapType", lhsSoapType), LocatorUtils.property(thatLocator, "soapType", rhsSoapType), lhsSoapType, rhsSoapType)) {
                return false;
            }
        }
        {
            Boolean lhsSortable;
            lhsSortable = this.isSortable();
            Boolean rhsSortable;
            rhsSortable = that.isSortable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortable", lhsSortable), LocatorUtils.property(thatLocator, "sortable", rhsSortable), lhsSortable, rhsSortable)) {
                return false;
            }
        }
        {
            FieldType lhsType;
            lhsType = this.getType();
            FieldType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            boolean lhsUnique;
            lhsUnique = (true?this.isUnique():false);
            boolean rhsUnique;
            rhsUnique = (true?that.isUnique():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unique", lhsUnique), LocatorUtils.property(thatLocator, "unique", rhsUnique), lhsUnique, rhsUnique)) {
                return false;
            }
        }
        {
            boolean lhsUpdateable;
            lhsUpdateable = (true?this.isUpdateable():false);
            boolean rhsUpdateable;
            rhsUpdateable = (true?that.isUpdateable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateable", lhsUpdateable), LocatorUtils.property(thatLocator, "updateable", rhsUpdateable), lhsUpdateable, rhsUpdateable)) {
                return false;
            }
        }
        {
            Boolean lhsWriteRequiresMasterRead;
            lhsWriteRequiresMasterRead = this.isWriteRequiresMasterRead();
            Boolean rhsWriteRequiresMasterRead;
            rhsWriteRequiresMasterRead = that.isWriteRequiresMasterRead();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "writeRequiresMasterRead", lhsWriteRequiresMasterRead), LocatorUtils.property(thatLocator, "writeRequiresMasterRead", rhsWriteRequiresMasterRead), lhsWriteRequiresMasterRead, rhsWriteRequiresMasterRead)) {
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
            boolean theAggregatable;
            theAggregatable = (true?this.isAggregatable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregatable", theAggregatable), currentHashCode, theAggregatable);
        }
        {
            boolean theAiPredictionField;
            theAiPredictionField = (true?this.isAiPredictionField():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aiPredictionField", theAiPredictionField), currentHashCode, theAiPredictionField);
        }
        {
            boolean theAutoNumber;
            theAutoNumber = (true?this.isAutoNumber():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "autoNumber", theAutoNumber), currentHashCode, theAutoNumber);
        }
        {
            int theByteLength;
            theByteLength = (true?this.getByteLength(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "byteLength", theByteLength), currentHashCode, theByteLength);
        }
        {
            boolean theCalculated;
            theCalculated = (true?this.isCalculated():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculated", theCalculated), currentHashCode, theCalculated);
        }
        {
            String theCalculatedFormula;
            theCalculatedFormula = this.getCalculatedFormula();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculatedFormula", theCalculatedFormula), currentHashCode, theCalculatedFormula);
        }
        {
            Boolean theCascadeDelete;
            theCascadeDelete = this.isCascadeDelete();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cascadeDelete", theCascadeDelete), currentHashCode, theCascadeDelete);
        }
        {
            boolean theCaseSensitive;
            theCaseSensitive = (true?this.isCaseSensitive():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caseSensitive", theCaseSensitive), currentHashCode, theCaseSensitive);
        }
        {
            String theCompoundFieldName;
            theCompoundFieldName = this.getCompoundFieldName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compoundFieldName", theCompoundFieldName), currentHashCode, theCompoundFieldName);
        }
        {
            String theControllerName;
            theControllerName = this.getControllerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "controllerName", theControllerName), currentHashCode, theControllerName);
        }
        {
            boolean theCreateable;
            theCreateable = (true?this.isCreateable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createable", theCreateable), currentHashCode, theCreateable);
        }
        {
            boolean theCustom;
            theCustom = (true?this.isCustom():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "custom", theCustom), currentHashCode, theCustom);
        }
        {
            Boolean theDataTranslationEnabled;
            theDataTranslationEnabled = this.isDataTranslationEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataTranslationEnabled", theDataTranslationEnabled), currentHashCode, theDataTranslationEnabled);
        }
        {
            Object theDefaultValue;
            theDefaultValue = this.getDefaultValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultValue", theDefaultValue), currentHashCode, theDefaultValue);
        }
        {
            String theDefaultValueFormula;
            theDefaultValueFormula = this.getDefaultValueFormula();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultValueFormula", theDefaultValueFormula), currentHashCode, theDefaultValueFormula);
        }
        {
            boolean theDefaultedOnCreate;
            theDefaultedOnCreate = (true?this.isDefaultedOnCreate():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultedOnCreate", theDefaultedOnCreate), currentHashCode, theDefaultedOnCreate);
        }
        {
            Boolean theDependentPicklist;
            theDependentPicklist = this.isDependentPicklist();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dependentPicklist", theDependentPicklist), currentHashCode, theDependentPicklist);
        }
        {
            boolean theDeprecatedAndHidden;
            theDeprecatedAndHidden = (true?this.isDeprecatedAndHidden():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deprecatedAndHidden", theDeprecatedAndHidden), currentHashCode, theDeprecatedAndHidden);
        }
        {
            int theDigits;
            theDigits = (true?this.getDigits(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digits", theDigits), currentHashCode, theDigits);
        }
        {
            Boolean theDisplayLocationInDecimal;
            theDisplayLocationInDecimal = this.isDisplayLocationInDecimal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayLocationInDecimal", theDisplayLocationInDecimal), currentHashCode, theDisplayLocationInDecimal);
        }
        {
            Boolean theEncrypted;
            theEncrypted = this.isEncrypted();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encrypted", theEncrypted), currentHashCode, theEncrypted);
        }
        {
            Boolean theExternalId;
            theExternalId = this.isExternalId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "externalId", theExternalId), currentHashCode, theExternalId);
        }
        {
            String theExtraTypeInfo;
            theExtraTypeInfo = this.getExtraTypeInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extraTypeInfo", theExtraTypeInfo), currentHashCode, theExtraTypeInfo);
        }
        {
            boolean theFilterable;
            theFilterable = (true?this.isFilterable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filterable", theFilterable), currentHashCode, theFilterable);
        }
        {
            FilteredLookupInfo theFilteredLookupInfo;
            theFilteredLookupInfo = this.getFilteredLookupInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filteredLookupInfo", theFilteredLookupInfo), currentHashCode, theFilteredLookupInfo);
        }
        {
            Boolean theFormulaTreatNullNumberAsZero;
            theFormulaTreatNullNumberAsZero = this.isFormulaTreatNullNumberAsZero();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formulaTreatNullNumberAsZero", theFormulaTreatNullNumberAsZero), currentHashCode, theFormulaTreatNullNumberAsZero);
        }
        {
            boolean theGroupable;
            theGroupable = (true?this.isGroupable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupable", theGroupable), currentHashCode, theGroupable);
        }
        {
            Boolean theHighScaleNumber;
            theHighScaleNumber = this.isHighScaleNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "highScaleNumber", theHighScaleNumber), currentHashCode, theHighScaleNumber);
        }
        {
            Boolean theHtmlFormatted;
            theHtmlFormatted = this.isHtmlFormatted();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "htmlFormatted", theHtmlFormatted), currentHashCode, theHtmlFormatted);
        }
        {
            boolean theIdLookup;
            theIdLookup = (true?this.isIdLookup():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idLookup", theIdLookup), currentHashCode, theIdLookup);
        }
        {
            String theInlineHelpText;
            theInlineHelpText = this.getInlineHelpText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inlineHelpText", theInlineHelpText), currentHashCode, theInlineHelpText);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            int theLength;
            theLength = (true?this.getLength(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "length", theLength), currentHashCode, theLength);
        }
        {
            String theMask;
            theMask = this.getMask();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mask", theMask), currentHashCode, theMask);
        }
        {
            String theMaskType;
            theMaskType = this.getMaskType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maskType", theMaskType), currentHashCode, theMaskType);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            boolean theNameField;
            theNameField = (true?this.isNameField():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameField", theNameField), currentHashCode, theNameField);
        }
        {
            Boolean theNamePointing;
            theNamePointing = this.isNamePointing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namePointing", theNamePointing), currentHashCode, theNamePointing);
        }
        {
            boolean theNillable;
            theNillable = (true?this.isNillable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nillable", theNillable), currentHashCode, theNillable);
        }
        {
            boolean thePermissionable;
            thePermissionable = (true?this.isPermissionable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permissionable", thePermissionable), currentHashCode, thePermissionable);
        }
        {
            List<PicklistEntry> thePicklistValues;
            thePicklistValues = (((this.picklistValues!= null)&&(!this.picklistValues.isEmpty()))?this.getPicklistValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistValues", thePicklistValues), currentHashCode, thePicklistValues);
        }
        {
            boolean thePolymorphicForeignKey;
            thePolymorphicForeignKey = (true?this.isPolymorphicForeignKey():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "polymorphicForeignKey", thePolymorphicForeignKey), currentHashCode, thePolymorphicForeignKey);
        }
        {
            int thePrecision;
            thePrecision = (true?this.getPrecision(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "precision", thePrecision), currentHashCode, thePrecision);
        }
        {
            boolean theQueryByDistance;
            theQueryByDistance = (true?this.isQueryByDistance():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryByDistance", theQueryByDistance), currentHashCode, theQueryByDistance);
        }
        {
            String theReferenceTargetField;
            theReferenceTargetField = this.getReferenceTargetField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceTargetField", theReferenceTargetField), currentHashCode, theReferenceTargetField);
        }
        {
            List<String> theReferenceTos;
            theReferenceTos = (((this.referenceTos!= null)&&(!this.referenceTos.isEmpty()))?this.getReferenceTos():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceTos", theReferenceTos), currentHashCode, theReferenceTos);
        }
        {
            String theRelationshipName;
            theRelationshipName = this.getRelationshipName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipName", theRelationshipName), currentHashCode, theRelationshipName);
        }
        {
            Integer theRelationshipOrder;
            theRelationshipOrder = this.getRelationshipOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipOrder", theRelationshipOrder), currentHashCode, theRelationshipOrder);
        }
        {
            Boolean theRestrictedDelete;
            theRestrictedDelete = this.isRestrictedDelete();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restrictedDelete", theRestrictedDelete), currentHashCode, theRestrictedDelete);
        }
        {
            boolean theRestrictedPicklist;
            theRestrictedPicklist = (true?this.isRestrictedPicklist():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restrictedPicklist", theRestrictedPicklist), currentHashCode, theRestrictedPicklist);
        }
        {
            int theScale;
            theScale = (true?this.getScale(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scale", theScale), currentHashCode, theScale);
        }
        {
            boolean theSearchPrefilterable;
            theSearchPrefilterable = (true?this.isSearchPrefilterable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchPrefilterable", theSearchPrefilterable), currentHashCode, theSearchPrefilterable);
        }
        {
            SoapType theSoapType;
            theSoapType = this.getSoapType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soapType", theSoapType), currentHashCode, theSoapType);
        }
        {
            Boolean theSortable;
            theSortable = this.isSortable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortable", theSortable), currentHashCode, theSortable);
        }
        {
            FieldType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            boolean theUnique;
            theUnique = (true?this.isUnique():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unique", theUnique), currentHashCode, theUnique);
        }
        {
            boolean theUpdateable;
            theUpdateable = (true?this.isUpdateable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateable", theUpdateable), currentHashCode, theUpdateable);
        }
        {
            Boolean theWriteRequiresMasterRead;
            theWriteRequiresMasterRead = this.isWriteRequiresMasterRead();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "writeRequiresMasterRead", theWriteRequiresMasterRead), currentHashCode, theWriteRequiresMasterRead);
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
            boolean theAggregatable;
            theAggregatable = (true?this.isAggregatable():false);
            strategy.appendField(locator, this, "aggregatable", buffer, theAggregatable);
        }
        {
            boolean theAiPredictionField;
            theAiPredictionField = (true?this.isAiPredictionField():false);
            strategy.appendField(locator, this, "aiPredictionField", buffer, theAiPredictionField);
        }
        {
            boolean theAutoNumber;
            theAutoNumber = (true?this.isAutoNumber():false);
            strategy.appendField(locator, this, "autoNumber", buffer, theAutoNumber);
        }
        {
            int theByteLength;
            theByteLength = (true?this.getByteLength(): 0);
            strategy.appendField(locator, this, "byteLength", buffer, theByteLength);
        }
        {
            boolean theCalculated;
            theCalculated = (true?this.isCalculated():false);
            strategy.appendField(locator, this, "calculated", buffer, theCalculated);
        }
        {
            String theCalculatedFormula;
            theCalculatedFormula = this.getCalculatedFormula();
            strategy.appendField(locator, this, "calculatedFormula", buffer, theCalculatedFormula);
        }
        {
            Boolean theCascadeDelete;
            theCascadeDelete = this.isCascadeDelete();
            strategy.appendField(locator, this, "cascadeDelete", buffer, theCascadeDelete);
        }
        {
            boolean theCaseSensitive;
            theCaseSensitive = (true?this.isCaseSensitive():false);
            strategy.appendField(locator, this, "caseSensitive", buffer, theCaseSensitive);
        }
        {
            String theCompoundFieldName;
            theCompoundFieldName = this.getCompoundFieldName();
            strategy.appendField(locator, this, "compoundFieldName", buffer, theCompoundFieldName);
        }
        {
            String theControllerName;
            theControllerName = this.getControllerName();
            strategy.appendField(locator, this, "controllerName", buffer, theControllerName);
        }
        {
            boolean theCreateable;
            theCreateable = (true?this.isCreateable():false);
            strategy.appendField(locator, this, "createable", buffer, theCreateable);
        }
        {
            boolean theCustom;
            theCustom = (true?this.isCustom():false);
            strategy.appendField(locator, this, "custom", buffer, theCustom);
        }
        {
            Boolean theDataTranslationEnabled;
            theDataTranslationEnabled = this.isDataTranslationEnabled();
            strategy.appendField(locator, this, "dataTranslationEnabled", buffer, theDataTranslationEnabled);
        }
        {
            Object theDefaultValue;
            theDefaultValue = this.getDefaultValue();
            strategy.appendField(locator, this, "defaultValue", buffer, theDefaultValue);
        }
        {
            String theDefaultValueFormula;
            theDefaultValueFormula = this.getDefaultValueFormula();
            strategy.appendField(locator, this, "defaultValueFormula", buffer, theDefaultValueFormula);
        }
        {
            boolean theDefaultedOnCreate;
            theDefaultedOnCreate = (true?this.isDefaultedOnCreate():false);
            strategy.appendField(locator, this, "defaultedOnCreate", buffer, theDefaultedOnCreate);
        }
        {
            Boolean theDependentPicklist;
            theDependentPicklist = this.isDependentPicklist();
            strategy.appendField(locator, this, "dependentPicklist", buffer, theDependentPicklist);
        }
        {
            boolean theDeprecatedAndHidden;
            theDeprecatedAndHidden = (true?this.isDeprecatedAndHidden():false);
            strategy.appendField(locator, this, "deprecatedAndHidden", buffer, theDeprecatedAndHidden);
        }
        {
            int theDigits;
            theDigits = (true?this.getDigits(): 0);
            strategy.appendField(locator, this, "digits", buffer, theDigits);
        }
        {
            Boolean theDisplayLocationInDecimal;
            theDisplayLocationInDecimal = this.isDisplayLocationInDecimal();
            strategy.appendField(locator, this, "displayLocationInDecimal", buffer, theDisplayLocationInDecimal);
        }
        {
            Boolean theEncrypted;
            theEncrypted = this.isEncrypted();
            strategy.appendField(locator, this, "encrypted", buffer, theEncrypted);
        }
        {
            Boolean theExternalId;
            theExternalId = this.isExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId);
        }
        {
            String theExtraTypeInfo;
            theExtraTypeInfo = this.getExtraTypeInfo();
            strategy.appendField(locator, this, "extraTypeInfo", buffer, theExtraTypeInfo);
        }
        {
            boolean theFilterable;
            theFilterable = (true?this.isFilterable():false);
            strategy.appendField(locator, this, "filterable", buffer, theFilterable);
        }
        {
            FilteredLookupInfo theFilteredLookupInfo;
            theFilteredLookupInfo = this.getFilteredLookupInfo();
            strategy.appendField(locator, this, "filteredLookupInfo", buffer, theFilteredLookupInfo);
        }
        {
            Boolean theFormulaTreatNullNumberAsZero;
            theFormulaTreatNullNumberAsZero = this.isFormulaTreatNullNumberAsZero();
            strategy.appendField(locator, this, "formulaTreatNullNumberAsZero", buffer, theFormulaTreatNullNumberAsZero);
        }
        {
            boolean theGroupable;
            theGroupable = (true?this.isGroupable():false);
            strategy.appendField(locator, this, "groupable", buffer, theGroupable);
        }
        {
            Boolean theHighScaleNumber;
            theHighScaleNumber = this.isHighScaleNumber();
            strategy.appendField(locator, this, "highScaleNumber", buffer, theHighScaleNumber);
        }
        {
            Boolean theHtmlFormatted;
            theHtmlFormatted = this.isHtmlFormatted();
            strategy.appendField(locator, this, "htmlFormatted", buffer, theHtmlFormatted);
        }
        {
            boolean theIdLookup;
            theIdLookup = (true?this.isIdLookup():false);
            strategy.appendField(locator, this, "idLookup", buffer, theIdLookup);
        }
        {
            String theInlineHelpText;
            theInlineHelpText = this.getInlineHelpText();
            strategy.appendField(locator, this, "inlineHelpText", buffer, theInlineHelpText);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            int theLength;
            theLength = (true?this.getLength(): 0);
            strategy.appendField(locator, this, "length", buffer, theLength);
        }
        {
            String theMask;
            theMask = this.getMask();
            strategy.appendField(locator, this, "mask", buffer, theMask);
        }
        {
            String theMaskType;
            theMaskType = this.getMaskType();
            strategy.appendField(locator, this, "maskType", buffer, theMaskType);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            boolean theNameField;
            theNameField = (true?this.isNameField():false);
            strategy.appendField(locator, this, "nameField", buffer, theNameField);
        }
        {
            Boolean theNamePointing;
            theNamePointing = this.isNamePointing();
            strategy.appendField(locator, this, "namePointing", buffer, theNamePointing);
        }
        {
            boolean theNillable;
            theNillable = (true?this.isNillable():false);
            strategy.appendField(locator, this, "nillable", buffer, theNillable);
        }
        {
            boolean thePermissionable;
            thePermissionable = (true?this.isPermissionable():false);
            strategy.appendField(locator, this, "permissionable", buffer, thePermissionable);
        }
        {
            List<PicklistEntry> thePicklistValues;
            thePicklistValues = (((this.picklistValues!= null)&&(!this.picklistValues.isEmpty()))?this.getPicklistValues():null);
            strategy.appendField(locator, this, "picklistValues", buffer, thePicklistValues);
        }
        {
            boolean thePolymorphicForeignKey;
            thePolymorphicForeignKey = (true?this.isPolymorphicForeignKey():false);
            strategy.appendField(locator, this, "polymorphicForeignKey", buffer, thePolymorphicForeignKey);
        }
        {
            int thePrecision;
            thePrecision = (true?this.getPrecision(): 0);
            strategy.appendField(locator, this, "precision", buffer, thePrecision);
        }
        {
            boolean theQueryByDistance;
            theQueryByDistance = (true?this.isQueryByDistance():false);
            strategy.appendField(locator, this, "queryByDistance", buffer, theQueryByDistance);
        }
        {
            String theReferenceTargetField;
            theReferenceTargetField = this.getReferenceTargetField();
            strategy.appendField(locator, this, "referenceTargetField", buffer, theReferenceTargetField);
        }
        {
            List<String> theReferenceTos;
            theReferenceTos = (((this.referenceTos!= null)&&(!this.referenceTos.isEmpty()))?this.getReferenceTos():null);
            strategy.appendField(locator, this, "referenceTos", buffer, theReferenceTos);
        }
        {
            String theRelationshipName;
            theRelationshipName = this.getRelationshipName();
            strategy.appendField(locator, this, "relationshipName", buffer, theRelationshipName);
        }
        {
            Integer theRelationshipOrder;
            theRelationshipOrder = this.getRelationshipOrder();
            strategy.appendField(locator, this, "relationshipOrder", buffer, theRelationshipOrder);
        }
        {
            Boolean theRestrictedDelete;
            theRestrictedDelete = this.isRestrictedDelete();
            strategy.appendField(locator, this, "restrictedDelete", buffer, theRestrictedDelete);
        }
        {
            boolean theRestrictedPicklist;
            theRestrictedPicklist = (true?this.isRestrictedPicklist():false);
            strategy.appendField(locator, this, "restrictedPicklist", buffer, theRestrictedPicklist);
        }
        {
            int theScale;
            theScale = (true?this.getScale(): 0);
            strategy.appendField(locator, this, "scale", buffer, theScale);
        }
        {
            boolean theSearchPrefilterable;
            theSearchPrefilterable = (true?this.isSearchPrefilterable():false);
            strategy.appendField(locator, this, "searchPrefilterable", buffer, theSearchPrefilterable);
        }
        {
            SoapType theSoapType;
            theSoapType = this.getSoapType();
            strategy.appendField(locator, this, "soapType", buffer, theSoapType);
        }
        {
            Boolean theSortable;
            theSortable = this.isSortable();
            strategy.appendField(locator, this, "sortable", buffer, theSortable);
        }
        {
            FieldType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            boolean theUnique;
            theUnique = (true?this.isUnique():false);
            strategy.appendField(locator, this, "unique", buffer, theUnique);
        }
        {
            boolean theUpdateable;
            theUpdateable = (true?this.isUpdateable():false);
            strategy.appendField(locator, this, "updateable", buffer, theUpdateable);
        }
        {
            Boolean theWriteRequiresMasterRead;
            theWriteRequiresMasterRead = this.isWriteRequiresMasterRead();
            strategy.appendField(locator, this, "writeRequiresMasterRead", buffer, theWriteRequiresMasterRead);
        }
        return buffer;
    }

}
