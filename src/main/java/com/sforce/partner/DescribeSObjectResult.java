
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
 * <p>Java class for DescribeSObjectResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSObjectResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionOverrides" type="{urn:partner.soap.sforce.com}ActionOverride" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="activateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="childRelationships" type="{urn:partner.soap.sforce.com}ChildRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="compactLayoutable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="createable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="customSetting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dataTranslationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deepCloneable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="defaultImplementation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deletable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deprecatedAndHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="feedEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fields" type="{urn:partner.soap.sforce.com}Field" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasSubtypes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="implementedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="implementsInterfaces" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isInterface" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isSubtype" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="keyPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelPlural" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="layoutable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="listviewable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lookupLayoutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mergeable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mruEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="namedLayoutInfos" type="{urn:partner.soap.sforce.com}NamedLayoutInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="networkScopeFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="queryable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="recordTypeInfos" type="{urn:partner.soap.sforce.com}RecordTypeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="replicateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="retrieveable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="searchLayoutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="searchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="supportedScopes" type="{urn:partner.soap.sforce.com}ScopeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="triggerable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="undeletable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="updateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="urlDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="urlEdit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="urlNew" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSObjectResult", propOrder = {
    "actionOverrides",
    "activateable",
    "childRelationships",
    "compactLayoutable",
    "createable",
    "custom",
    "customSetting",
    "dataTranslationEnabled",
    "deepCloneable",
    "defaultImplementation",
    "deletable",
    "deprecatedAndHidden",
    "feedEnabled",
    "fields",
    "hasSubtypes",
    "idEnabled",
    "implementedBy",
    "implementsInterfaces",
    "isInterface",
    "isSubtype",
    "keyPrefix",
    "label",
    "labelPlural",
    "layoutable",
    "listviewable",
    "lookupLayoutable",
    "mergeable",
    "mruEnabled",
    "name",
    "namedLayoutInfos",
    "networkScopeFieldName",
    "queryable",
    "recordTypeInfos",
    "replicateable",
    "retrieveable",
    "searchLayoutable",
    "searchable",
    "supportedScopes",
    "triggerable",
    "undeletable",
    "updateable",
    "urlDetail",
    "urlEdit",
    "urlNew"
})
public class DescribeSObjectResult
    implements Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<ActionOverride> actionOverrides;
    protected boolean activateable;
    protected List<ChildRelationship> childRelationships;
    protected boolean compactLayoutable;
    protected boolean createable;
    protected boolean custom;
    protected boolean customSetting;
    protected Boolean dataTranslationEnabled;
    protected boolean deepCloneable;
    @XmlElement(required = true, nillable = true)
    protected String defaultImplementation;
    protected boolean deletable;
    protected boolean deprecatedAndHidden;
    protected boolean feedEnabled;
    @XmlElement(nillable = true)
    protected List<Field> fields;
    protected boolean hasSubtypes;
    protected boolean idEnabled;
    @XmlElement(required = true, nillable = true)
    protected String implementedBy;
    @XmlElement(required = true, nillable = true)
    protected String implementsInterfaces;
    protected boolean isInterface;
    protected boolean isSubtype;
    @XmlElement(required = true, nillable = true)
    protected String keyPrefix;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String labelPlural;
    protected boolean layoutable;
    protected Boolean listviewable;
    protected Boolean lookupLayoutable;
    protected boolean mergeable;
    protected boolean mruEnabled;
    @XmlElement(required = true)
    protected String name;
    protected List<NamedLayoutInfo> namedLayoutInfos;
    @XmlElement(required = true, nillable = true)
    protected String networkScopeFieldName;
    protected boolean queryable;
    protected List<RecordTypeInfo> recordTypeInfos;
    protected boolean replicateable;
    protected boolean retrieveable;
    protected Boolean searchLayoutable;
    protected boolean searchable;
    @XmlElement(nillable = true)
    protected List<ScopeInfo> supportedScopes;
    protected Boolean triggerable;
    protected boolean undeletable;
    protected boolean updateable;
    @XmlElement(required = true, nillable = true)
    protected String urlDetail;
    @XmlElement(required = true, nillable = true)
    protected String urlEdit;
    @XmlElement(required = true, nillable = true)
    protected String urlNew;

    /**
     * Gets the value of the actionOverrides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionOverrides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionOverrides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionOverride }
     * 
     * 
     */
    public List<ActionOverride> getActionOverrides() {
        if (actionOverrides == null) {
            actionOverrides = new ArrayList<ActionOverride>();
        }
        return this.actionOverrides;
    }

    /**
     * Gets the value of the activateable property.
     * 
     */
    public boolean isActivateable() {
        return activateable;
    }

    /**
     * Sets the value of the activateable property.
     * 
     */
    public void setActivateable(boolean value) {
        this.activateable = value;
    }

    /**
     * Gets the value of the childRelationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childRelationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildRelationship }
     * 
     * 
     */
    public List<ChildRelationship> getChildRelationships() {
        if (childRelationships == null) {
            childRelationships = new ArrayList<ChildRelationship>();
        }
        return this.childRelationships;
    }

    /**
     * Gets the value of the compactLayoutable property.
     * 
     */
    public boolean isCompactLayoutable() {
        return compactLayoutable;
    }

    /**
     * Sets the value of the compactLayoutable property.
     * 
     */
    public void setCompactLayoutable(boolean value) {
        this.compactLayoutable = value;
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
     * Gets the value of the customSetting property.
     * 
     */
    public boolean isCustomSetting() {
        return customSetting;
    }

    /**
     * Sets the value of the customSetting property.
     * 
     */
    public void setCustomSetting(boolean value) {
        this.customSetting = value;
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
     * Gets the value of the deepCloneable property.
     * 
     */
    public boolean isDeepCloneable() {
        return deepCloneable;
    }

    /**
     * Sets the value of the deepCloneable property.
     * 
     */
    public void setDeepCloneable(boolean value) {
        this.deepCloneable = value;
    }

    /**
     * Gets the value of the defaultImplementation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultImplementation() {
        return defaultImplementation;
    }

    /**
     * Sets the value of the defaultImplementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultImplementation(String value) {
        this.defaultImplementation = value;
    }

    /**
     * Gets the value of the deletable property.
     * 
     */
    public boolean isDeletable() {
        return deletable;
    }

    /**
     * Sets the value of the deletable property.
     * 
     */
    public void setDeletable(boolean value) {
        this.deletable = value;
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
     * Gets the value of the feedEnabled property.
     * 
     */
    public boolean isFeedEnabled() {
        return feedEnabled;
    }

    /**
     * Sets the value of the feedEnabled property.
     * 
     */
    public void setFeedEnabled(boolean value) {
        this.feedEnabled = value;
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
     * {@link Field }
     * 
     * 
     */
    public List<Field> getFields() {
        if (fields == null) {
            fields = new ArrayList<Field>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the hasSubtypes property.
     * 
     */
    public boolean isHasSubtypes() {
        return hasSubtypes;
    }

    /**
     * Sets the value of the hasSubtypes property.
     * 
     */
    public void setHasSubtypes(boolean value) {
        this.hasSubtypes = value;
    }

    /**
     * Gets the value of the idEnabled property.
     * 
     */
    public boolean isIdEnabled() {
        return idEnabled;
    }

    /**
     * Sets the value of the idEnabled property.
     * 
     */
    public void setIdEnabled(boolean value) {
        this.idEnabled = value;
    }

    /**
     * Gets the value of the implementedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementedBy() {
        return implementedBy;
    }

    /**
     * Sets the value of the implementedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementedBy(String value) {
        this.implementedBy = value;
    }

    /**
     * Gets the value of the implementsInterfaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementsInterfaces() {
        return implementsInterfaces;
    }

    /**
     * Sets the value of the implementsInterfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementsInterfaces(String value) {
        this.implementsInterfaces = value;
    }

    /**
     * Gets the value of the isInterface property.
     * 
     */
    public boolean isIsInterface() {
        return isInterface;
    }

    /**
     * Sets the value of the isInterface property.
     * 
     */
    public void setIsInterface(boolean value) {
        this.isInterface = value;
    }

    /**
     * Gets the value of the isSubtype property.
     * 
     */
    public boolean isIsSubtype() {
        return isSubtype;
    }

    /**
     * Sets the value of the isSubtype property.
     * 
     */
    public void setIsSubtype(boolean value) {
        this.isSubtype = value;
    }

    /**
     * Gets the value of the keyPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPrefix() {
        return keyPrefix;
    }

    /**
     * Sets the value of the keyPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPrefix(String value) {
        this.keyPrefix = value;
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
     * Gets the value of the labelPlural property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelPlural() {
        return labelPlural;
    }

    /**
     * Sets the value of the labelPlural property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelPlural(String value) {
        this.labelPlural = value;
    }

    /**
     * Gets the value of the layoutable property.
     * 
     */
    public boolean isLayoutable() {
        return layoutable;
    }

    /**
     * Sets the value of the layoutable property.
     * 
     */
    public void setLayoutable(boolean value) {
        this.layoutable = value;
    }

    /**
     * Gets the value of the listviewable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListviewable() {
        return listviewable;
    }

    /**
     * Sets the value of the listviewable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListviewable(Boolean value) {
        this.listviewable = value;
    }

    /**
     * Gets the value of the lookupLayoutable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLookupLayoutable() {
        return lookupLayoutable;
    }

    /**
     * Sets the value of the lookupLayoutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLookupLayoutable(Boolean value) {
        this.lookupLayoutable = value;
    }

    /**
     * Gets the value of the mergeable property.
     * 
     */
    public boolean isMergeable() {
        return mergeable;
    }

    /**
     * Sets the value of the mergeable property.
     * 
     */
    public void setMergeable(boolean value) {
        this.mergeable = value;
    }

    /**
     * Gets the value of the mruEnabled property.
     * 
     */
    public boolean isMruEnabled() {
        return mruEnabled;
    }

    /**
     * Sets the value of the mruEnabled property.
     * 
     */
    public void setMruEnabled(boolean value) {
        this.mruEnabled = value;
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
     * Gets the value of the namedLayoutInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedLayoutInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedLayoutInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedLayoutInfo }
     * 
     * 
     */
    public List<NamedLayoutInfo> getNamedLayoutInfos() {
        if (namedLayoutInfos == null) {
            namedLayoutInfos = new ArrayList<NamedLayoutInfo>();
        }
        return this.namedLayoutInfos;
    }

    /**
     * Gets the value of the networkScopeFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkScopeFieldName() {
        return networkScopeFieldName;
    }

    /**
     * Sets the value of the networkScopeFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkScopeFieldName(String value) {
        this.networkScopeFieldName = value;
    }

    /**
     * Gets the value of the queryable property.
     * 
     */
    public boolean isQueryable() {
        return queryable;
    }

    /**
     * Sets the value of the queryable property.
     * 
     */
    public void setQueryable(boolean value) {
        this.queryable = value;
    }

    /**
     * Gets the value of the recordTypeInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTypeInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTypeInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordTypeInfo }
     * 
     * 
     */
    public List<RecordTypeInfo> getRecordTypeInfos() {
        if (recordTypeInfos == null) {
            recordTypeInfos = new ArrayList<RecordTypeInfo>();
        }
        return this.recordTypeInfos;
    }

    /**
     * Gets the value of the replicateable property.
     * 
     */
    public boolean isReplicateable() {
        return replicateable;
    }

    /**
     * Sets the value of the replicateable property.
     * 
     */
    public void setReplicateable(boolean value) {
        this.replicateable = value;
    }

    /**
     * Gets the value of the retrieveable property.
     * 
     */
    public boolean isRetrieveable() {
        return retrieveable;
    }

    /**
     * Sets the value of the retrieveable property.
     * 
     */
    public void setRetrieveable(boolean value) {
        this.retrieveable = value;
    }

    /**
     * Gets the value of the searchLayoutable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchLayoutable() {
        return searchLayoutable;
    }

    /**
     * Sets the value of the searchLayoutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchLayoutable(Boolean value) {
        this.searchLayoutable = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     */
    public boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     */
    public void setSearchable(boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the supportedScopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedScopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedScopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopeInfo }
     * 
     * 
     */
    public List<ScopeInfo> getSupportedScopes() {
        if (supportedScopes == null) {
            supportedScopes = new ArrayList<ScopeInfo>();
        }
        return this.supportedScopes;
    }

    /**
     * Gets the value of the triggerable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTriggerable() {
        return triggerable;
    }

    /**
     * Sets the value of the triggerable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTriggerable(Boolean value) {
        this.triggerable = value;
    }

    /**
     * Gets the value of the undeletable property.
     * 
     */
    public boolean isUndeletable() {
        return undeletable;
    }

    /**
     * Sets the value of the undeletable property.
     * 
     */
    public void setUndeletable(boolean value) {
        this.undeletable = value;
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
     * Gets the value of the urlDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDetail() {
        return urlDetail;
    }

    /**
     * Sets the value of the urlDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDetail(String value) {
        this.urlDetail = value;
    }

    /**
     * Gets the value of the urlEdit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEdit() {
        return urlEdit;
    }

    /**
     * Sets the value of the urlEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEdit(String value) {
        this.urlEdit = value;
    }

    /**
     * Gets the value of the urlNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlNew() {
        return urlNew;
    }

    /**
     * Sets the value of the urlNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlNew(String value) {
        this.urlNew = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSObjectResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSObjectResult that = ((DescribeSObjectResult) object);
        {
            List<ActionOverride> lhsActionOverrides;
            lhsActionOverrides = (((this.actionOverrides!= null)&&(!this.actionOverrides.isEmpty()))?this.getActionOverrides():null);
            List<ActionOverride> rhsActionOverrides;
            rhsActionOverrides = (((that.actionOverrides!= null)&&(!that.actionOverrides.isEmpty()))?that.getActionOverrides():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionOverrides", lhsActionOverrides), LocatorUtils.property(thatLocator, "actionOverrides", rhsActionOverrides), lhsActionOverrides, rhsActionOverrides)) {
                return false;
            }
        }
        {
            boolean lhsActivateable;
            lhsActivateable = (true?this.isActivateable():false);
            boolean rhsActivateable;
            rhsActivateable = (true?that.isActivateable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activateable", lhsActivateable), LocatorUtils.property(thatLocator, "activateable", rhsActivateable), lhsActivateable, rhsActivateable)) {
                return false;
            }
        }
        {
            List<ChildRelationship> lhsChildRelationships;
            lhsChildRelationships = (((this.childRelationships!= null)&&(!this.childRelationships.isEmpty()))?this.getChildRelationships():null);
            List<ChildRelationship> rhsChildRelationships;
            rhsChildRelationships = (((that.childRelationships!= null)&&(!that.childRelationships.isEmpty()))?that.getChildRelationships():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "childRelationships", lhsChildRelationships), LocatorUtils.property(thatLocator, "childRelationships", rhsChildRelationships), lhsChildRelationships, rhsChildRelationships)) {
                return false;
            }
        }
        {
            boolean lhsCompactLayoutable;
            lhsCompactLayoutable = (true?this.isCompactLayoutable():false);
            boolean rhsCompactLayoutable;
            rhsCompactLayoutable = (true?that.isCompactLayoutable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compactLayoutable", lhsCompactLayoutable), LocatorUtils.property(thatLocator, "compactLayoutable", rhsCompactLayoutable), lhsCompactLayoutable, rhsCompactLayoutable)) {
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
            boolean lhsCustomSetting;
            lhsCustomSetting = (true?this.isCustomSetting():false);
            boolean rhsCustomSetting;
            rhsCustomSetting = (true?that.isCustomSetting():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customSetting", lhsCustomSetting), LocatorUtils.property(thatLocator, "customSetting", rhsCustomSetting), lhsCustomSetting, rhsCustomSetting)) {
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
            boolean lhsDeepCloneable;
            lhsDeepCloneable = (true?this.isDeepCloneable():false);
            boolean rhsDeepCloneable;
            rhsDeepCloneable = (true?that.isDeepCloneable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deepCloneable", lhsDeepCloneable), LocatorUtils.property(thatLocator, "deepCloneable", rhsDeepCloneable), lhsDeepCloneable, rhsDeepCloneable)) {
                return false;
            }
        }
        {
            String lhsDefaultImplementation;
            lhsDefaultImplementation = this.getDefaultImplementation();
            String rhsDefaultImplementation;
            rhsDefaultImplementation = that.getDefaultImplementation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultImplementation", lhsDefaultImplementation), LocatorUtils.property(thatLocator, "defaultImplementation", rhsDefaultImplementation), lhsDefaultImplementation, rhsDefaultImplementation)) {
                return false;
            }
        }
        {
            boolean lhsDeletable;
            lhsDeletable = (true?this.isDeletable():false);
            boolean rhsDeletable;
            rhsDeletable = (true?that.isDeletable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deletable", lhsDeletable), LocatorUtils.property(thatLocator, "deletable", rhsDeletable), lhsDeletable, rhsDeletable)) {
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
            boolean lhsFeedEnabled;
            lhsFeedEnabled = (true?this.isFeedEnabled():false);
            boolean rhsFeedEnabled;
            rhsFeedEnabled = (true?that.isFeedEnabled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedEnabled", lhsFeedEnabled), LocatorUtils.property(thatLocator, "feedEnabled", rhsFeedEnabled), lhsFeedEnabled, rhsFeedEnabled)) {
                return false;
            }
        }
        {
            List<Field> lhsFields;
            lhsFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            List<Field> rhsFields;
            rhsFields = (((that.fields!= null)&&(!that.fields.isEmpty()))?that.getFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields)) {
                return false;
            }
        }
        {
            boolean lhsHasSubtypes;
            lhsHasSubtypes = (true?this.isHasSubtypes():false);
            boolean rhsHasSubtypes;
            rhsHasSubtypes = (true?that.isHasSubtypes():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasSubtypes", lhsHasSubtypes), LocatorUtils.property(thatLocator, "hasSubtypes", rhsHasSubtypes), lhsHasSubtypes, rhsHasSubtypes)) {
                return false;
            }
        }
        {
            boolean lhsIdEnabled;
            lhsIdEnabled = (true?this.isIdEnabled():false);
            boolean rhsIdEnabled;
            rhsIdEnabled = (true?that.isIdEnabled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "idEnabled", lhsIdEnabled), LocatorUtils.property(thatLocator, "idEnabled", rhsIdEnabled), lhsIdEnabled, rhsIdEnabled)) {
                return false;
            }
        }
        {
            String lhsImplementedBy;
            lhsImplementedBy = this.getImplementedBy();
            String rhsImplementedBy;
            rhsImplementedBy = that.getImplementedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "implementedBy", lhsImplementedBy), LocatorUtils.property(thatLocator, "implementedBy", rhsImplementedBy), lhsImplementedBy, rhsImplementedBy)) {
                return false;
            }
        }
        {
            String lhsImplementsInterfaces;
            lhsImplementsInterfaces = this.getImplementsInterfaces();
            String rhsImplementsInterfaces;
            rhsImplementsInterfaces = that.getImplementsInterfaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "implementsInterfaces", lhsImplementsInterfaces), LocatorUtils.property(thatLocator, "implementsInterfaces", rhsImplementsInterfaces), lhsImplementsInterfaces, rhsImplementsInterfaces)) {
                return false;
            }
        }
        {
            boolean lhsIsInterface;
            lhsIsInterface = (true?this.isIsInterface():false);
            boolean rhsIsInterface;
            rhsIsInterface = (true?that.isIsInterface():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isInterface", lhsIsInterface), LocatorUtils.property(thatLocator, "isInterface", rhsIsInterface), lhsIsInterface, rhsIsInterface)) {
                return false;
            }
        }
        {
            boolean lhsIsSubtype;
            lhsIsSubtype = (true?this.isIsSubtype():false);
            boolean rhsIsSubtype;
            rhsIsSubtype = (true?that.isIsSubtype():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSubtype", lhsIsSubtype), LocatorUtils.property(thatLocator, "isSubtype", rhsIsSubtype), lhsIsSubtype, rhsIsSubtype)) {
                return false;
            }
        }
        {
            String lhsKeyPrefix;
            lhsKeyPrefix = this.getKeyPrefix();
            String rhsKeyPrefix;
            rhsKeyPrefix = that.getKeyPrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyPrefix", lhsKeyPrefix), LocatorUtils.property(thatLocator, "keyPrefix", rhsKeyPrefix), lhsKeyPrefix, rhsKeyPrefix)) {
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
            String lhsLabelPlural;
            lhsLabelPlural = this.getLabelPlural();
            String rhsLabelPlural;
            rhsLabelPlural = that.getLabelPlural();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "labelPlural", lhsLabelPlural), LocatorUtils.property(thatLocator, "labelPlural", rhsLabelPlural), lhsLabelPlural, rhsLabelPlural)) {
                return false;
            }
        }
        {
            boolean lhsLayoutable;
            lhsLayoutable = (true?this.isLayoutable():false);
            boolean rhsLayoutable;
            rhsLayoutable = (true?that.isLayoutable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutable", lhsLayoutable), LocatorUtils.property(thatLocator, "layoutable", rhsLayoutable), lhsLayoutable, rhsLayoutable)) {
                return false;
            }
        }
        {
            Boolean lhsListviewable;
            lhsListviewable = this.isListviewable();
            Boolean rhsListviewable;
            rhsListviewable = that.isListviewable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listviewable", lhsListviewable), LocatorUtils.property(thatLocator, "listviewable", rhsListviewable), lhsListviewable, rhsListviewable)) {
                return false;
            }
        }
        {
            Boolean lhsLookupLayoutable;
            lhsLookupLayoutable = this.isLookupLayoutable();
            Boolean rhsLookupLayoutable;
            rhsLookupLayoutable = that.isLookupLayoutable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lookupLayoutable", lhsLookupLayoutable), LocatorUtils.property(thatLocator, "lookupLayoutable", rhsLookupLayoutable), lhsLookupLayoutable, rhsLookupLayoutable)) {
                return false;
            }
        }
        {
            boolean lhsMergeable;
            lhsMergeable = (true?this.isMergeable():false);
            boolean rhsMergeable;
            rhsMergeable = (true?that.isMergeable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mergeable", lhsMergeable), LocatorUtils.property(thatLocator, "mergeable", rhsMergeable), lhsMergeable, rhsMergeable)) {
                return false;
            }
        }
        {
            boolean lhsMruEnabled;
            lhsMruEnabled = (true?this.isMruEnabled():false);
            boolean rhsMruEnabled;
            rhsMruEnabled = (true?that.isMruEnabled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mruEnabled", lhsMruEnabled), LocatorUtils.property(thatLocator, "mruEnabled", rhsMruEnabled), lhsMruEnabled, rhsMruEnabled)) {
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
            List<NamedLayoutInfo> lhsNamedLayoutInfos;
            lhsNamedLayoutInfos = (((this.namedLayoutInfos!= null)&&(!this.namedLayoutInfos.isEmpty()))?this.getNamedLayoutInfos():null);
            List<NamedLayoutInfo> rhsNamedLayoutInfos;
            rhsNamedLayoutInfos = (((that.namedLayoutInfos!= null)&&(!that.namedLayoutInfos.isEmpty()))?that.getNamedLayoutInfos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namedLayoutInfos", lhsNamedLayoutInfos), LocatorUtils.property(thatLocator, "namedLayoutInfos", rhsNamedLayoutInfos), lhsNamedLayoutInfos, rhsNamedLayoutInfos)) {
                return false;
            }
        }
        {
            String lhsNetworkScopeFieldName;
            lhsNetworkScopeFieldName = this.getNetworkScopeFieldName();
            String rhsNetworkScopeFieldName;
            rhsNetworkScopeFieldName = that.getNetworkScopeFieldName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkScopeFieldName", lhsNetworkScopeFieldName), LocatorUtils.property(thatLocator, "networkScopeFieldName", rhsNetworkScopeFieldName), lhsNetworkScopeFieldName, rhsNetworkScopeFieldName)) {
                return false;
            }
        }
        {
            boolean lhsQueryable;
            lhsQueryable = (true?this.isQueryable():false);
            boolean rhsQueryable;
            rhsQueryable = (true?that.isQueryable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryable", lhsQueryable), LocatorUtils.property(thatLocator, "queryable", rhsQueryable), lhsQueryable, rhsQueryable)) {
                return false;
            }
        }
        {
            List<RecordTypeInfo> lhsRecordTypeInfos;
            lhsRecordTypeInfos = (((this.recordTypeInfos!= null)&&(!this.recordTypeInfos.isEmpty()))?this.getRecordTypeInfos():null);
            List<RecordTypeInfo> rhsRecordTypeInfos;
            rhsRecordTypeInfos = (((that.recordTypeInfos!= null)&&(!that.recordTypeInfos.isEmpty()))?that.getRecordTypeInfos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeInfos", lhsRecordTypeInfos), LocatorUtils.property(thatLocator, "recordTypeInfos", rhsRecordTypeInfos), lhsRecordTypeInfos, rhsRecordTypeInfos)) {
                return false;
            }
        }
        {
            boolean lhsReplicateable;
            lhsReplicateable = (true?this.isReplicateable():false);
            boolean rhsReplicateable;
            rhsReplicateable = (true?that.isReplicateable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replicateable", lhsReplicateable), LocatorUtils.property(thatLocator, "replicateable", rhsReplicateable), lhsReplicateable, rhsReplicateable)) {
                return false;
            }
        }
        {
            boolean lhsRetrieveable;
            lhsRetrieveable = (true?this.isRetrieveable():false);
            boolean rhsRetrieveable;
            rhsRetrieveable = (true?that.isRetrieveable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retrieveable", lhsRetrieveable), LocatorUtils.property(thatLocator, "retrieveable", rhsRetrieveable), lhsRetrieveable, rhsRetrieveable)) {
                return false;
            }
        }
        {
            Boolean lhsSearchLayoutable;
            lhsSearchLayoutable = this.isSearchLayoutable();
            Boolean rhsSearchLayoutable;
            rhsSearchLayoutable = that.isSearchLayoutable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchLayoutable", lhsSearchLayoutable), LocatorUtils.property(thatLocator, "searchLayoutable", rhsSearchLayoutable), lhsSearchLayoutable, rhsSearchLayoutable)) {
                return false;
            }
        }
        {
            boolean lhsSearchable;
            lhsSearchable = (true?this.isSearchable():false);
            boolean rhsSearchable;
            rhsSearchable = (true?that.isSearchable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchable", lhsSearchable), LocatorUtils.property(thatLocator, "searchable", rhsSearchable), lhsSearchable, rhsSearchable)) {
                return false;
            }
        }
        {
            List<ScopeInfo> lhsSupportedScopes;
            lhsSupportedScopes = (((this.supportedScopes!= null)&&(!this.supportedScopes.isEmpty()))?this.getSupportedScopes():null);
            List<ScopeInfo> rhsSupportedScopes;
            rhsSupportedScopes = (((that.supportedScopes!= null)&&(!that.supportedScopes.isEmpty()))?that.getSupportedScopes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supportedScopes", lhsSupportedScopes), LocatorUtils.property(thatLocator, "supportedScopes", rhsSupportedScopes), lhsSupportedScopes, rhsSupportedScopes)) {
                return false;
            }
        }
        {
            Boolean lhsTriggerable;
            lhsTriggerable = this.isTriggerable();
            Boolean rhsTriggerable;
            rhsTriggerable = that.isTriggerable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "triggerable", lhsTriggerable), LocatorUtils.property(thatLocator, "triggerable", rhsTriggerable), lhsTriggerable, rhsTriggerable)) {
                return false;
            }
        }
        {
            boolean lhsUndeletable;
            lhsUndeletable = (true?this.isUndeletable():false);
            boolean rhsUndeletable;
            rhsUndeletable = (true?that.isUndeletable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undeletable", lhsUndeletable), LocatorUtils.property(thatLocator, "undeletable", rhsUndeletable), lhsUndeletable, rhsUndeletable)) {
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
            String lhsUrlDetail;
            lhsUrlDetail = this.getUrlDetail();
            String rhsUrlDetail;
            rhsUrlDetail = that.getUrlDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urlDetail", lhsUrlDetail), LocatorUtils.property(thatLocator, "urlDetail", rhsUrlDetail), lhsUrlDetail, rhsUrlDetail)) {
                return false;
            }
        }
        {
            String lhsUrlEdit;
            lhsUrlEdit = this.getUrlEdit();
            String rhsUrlEdit;
            rhsUrlEdit = that.getUrlEdit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urlEdit", lhsUrlEdit), LocatorUtils.property(thatLocator, "urlEdit", rhsUrlEdit), lhsUrlEdit, rhsUrlEdit)) {
                return false;
            }
        }
        {
            String lhsUrlNew;
            lhsUrlNew = this.getUrlNew();
            String rhsUrlNew;
            rhsUrlNew = that.getUrlNew();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urlNew", lhsUrlNew), LocatorUtils.property(thatLocator, "urlNew", rhsUrlNew), lhsUrlNew, rhsUrlNew)) {
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
            List<ActionOverride> theActionOverrides;
            theActionOverrides = (((this.actionOverrides!= null)&&(!this.actionOverrides.isEmpty()))?this.getActionOverrides():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionOverrides", theActionOverrides), currentHashCode, theActionOverrides);
        }
        {
            boolean theActivateable;
            theActivateable = (true?this.isActivateable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activateable", theActivateable), currentHashCode, theActivateable);
        }
        {
            List<ChildRelationship> theChildRelationships;
            theChildRelationships = (((this.childRelationships!= null)&&(!this.childRelationships.isEmpty()))?this.getChildRelationships():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "childRelationships", theChildRelationships), currentHashCode, theChildRelationships);
        }
        {
            boolean theCompactLayoutable;
            theCompactLayoutable = (true?this.isCompactLayoutable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compactLayoutable", theCompactLayoutable), currentHashCode, theCompactLayoutable);
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
            boolean theCustomSetting;
            theCustomSetting = (true?this.isCustomSetting():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customSetting", theCustomSetting), currentHashCode, theCustomSetting);
        }
        {
            Boolean theDataTranslationEnabled;
            theDataTranslationEnabled = this.isDataTranslationEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataTranslationEnabled", theDataTranslationEnabled), currentHashCode, theDataTranslationEnabled);
        }
        {
            boolean theDeepCloneable;
            theDeepCloneable = (true?this.isDeepCloneable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deepCloneable", theDeepCloneable), currentHashCode, theDeepCloneable);
        }
        {
            String theDefaultImplementation;
            theDefaultImplementation = this.getDefaultImplementation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultImplementation", theDefaultImplementation), currentHashCode, theDefaultImplementation);
        }
        {
            boolean theDeletable;
            theDeletable = (true?this.isDeletable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deletable", theDeletable), currentHashCode, theDeletable);
        }
        {
            boolean theDeprecatedAndHidden;
            theDeprecatedAndHidden = (true?this.isDeprecatedAndHidden():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deprecatedAndHidden", theDeprecatedAndHidden), currentHashCode, theDeprecatedAndHidden);
        }
        {
            boolean theFeedEnabled;
            theFeedEnabled = (true?this.isFeedEnabled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feedEnabled", theFeedEnabled), currentHashCode, theFeedEnabled);
        }
        {
            List<Field> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fields", theFields), currentHashCode, theFields);
        }
        {
            boolean theHasSubtypes;
            theHasSubtypes = (true?this.isHasSubtypes():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasSubtypes", theHasSubtypes), currentHashCode, theHasSubtypes);
        }
        {
            boolean theIdEnabled;
            theIdEnabled = (true?this.isIdEnabled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idEnabled", theIdEnabled), currentHashCode, theIdEnabled);
        }
        {
            String theImplementedBy;
            theImplementedBy = this.getImplementedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "implementedBy", theImplementedBy), currentHashCode, theImplementedBy);
        }
        {
            String theImplementsInterfaces;
            theImplementsInterfaces = this.getImplementsInterfaces();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "implementsInterfaces", theImplementsInterfaces), currentHashCode, theImplementsInterfaces);
        }
        {
            boolean theIsInterface;
            theIsInterface = (true?this.isIsInterface():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isInterface", theIsInterface), currentHashCode, theIsInterface);
        }
        {
            boolean theIsSubtype;
            theIsSubtype = (true?this.isIsSubtype():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSubtype", theIsSubtype), currentHashCode, theIsSubtype);
        }
        {
            String theKeyPrefix;
            theKeyPrefix = this.getKeyPrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyPrefix", theKeyPrefix), currentHashCode, theKeyPrefix);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theLabelPlural;
            theLabelPlural = this.getLabelPlural();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelPlural", theLabelPlural), currentHashCode, theLabelPlural);
        }
        {
            boolean theLayoutable;
            theLayoutable = (true?this.isLayoutable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layoutable", theLayoutable), currentHashCode, theLayoutable);
        }
        {
            Boolean theListviewable;
            theListviewable = this.isListviewable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listviewable", theListviewable), currentHashCode, theListviewable);
        }
        {
            Boolean theLookupLayoutable;
            theLookupLayoutable = this.isLookupLayoutable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lookupLayoutable", theLookupLayoutable), currentHashCode, theLookupLayoutable);
        }
        {
            boolean theMergeable;
            theMergeable = (true?this.isMergeable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mergeable", theMergeable), currentHashCode, theMergeable);
        }
        {
            boolean theMruEnabled;
            theMruEnabled = (true?this.isMruEnabled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mruEnabled", theMruEnabled), currentHashCode, theMruEnabled);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<NamedLayoutInfo> theNamedLayoutInfos;
            theNamedLayoutInfos = (((this.namedLayoutInfos!= null)&&(!this.namedLayoutInfos.isEmpty()))?this.getNamedLayoutInfos():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namedLayoutInfos", theNamedLayoutInfos), currentHashCode, theNamedLayoutInfos);
        }
        {
            String theNetworkScopeFieldName;
            theNetworkScopeFieldName = this.getNetworkScopeFieldName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkScopeFieldName", theNetworkScopeFieldName), currentHashCode, theNetworkScopeFieldName);
        }
        {
            boolean theQueryable;
            theQueryable = (true?this.isQueryable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryable", theQueryable), currentHashCode, theQueryable);
        }
        {
            List<RecordTypeInfo> theRecordTypeInfos;
            theRecordTypeInfos = (((this.recordTypeInfos!= null)&&(!this.recordTypeInfos.isEmpty()))?this.getRecordTypeInfos():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeInfos", theRecordTypeInfos), currentHashCode, theRecordTypeInfos);
        }
        {
            boolean theReplicateable;
            theReplicateable = (true?this.isReplicateable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replicateable", theReplicateable), currentHashCode, theReplicateable);
        }
        {
            boolean theRetrieveable;
            theRetrieveable = (true?this.isRetrieveable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retrieveable", theRetrieveable), currentHashCode, theRetrieveable);
        }
        {
            Boolean theSearchLayoutable;
            theSearchLayoutable = this.isSearchLayoutable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchLayoutable", theSearchLayoutable), currentHashCode, theSearchLayoutable);
        }
        {
            boolean theSearchable;
            theSearchable = (true?this.isSearchable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchable", theSearchable), currentHashCode, theSearchable);
        }
        {
            List<ScopeInfo> theSupportedScopes;
            theSupportedScopes = (((this.supportedScopes!= null)&&(!this.supportedScopes.isEmpty()))?this.getSupportedScopes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supportedScopes", theSupportedScopes), currentHashCode, theSupportedScopes);
        }
        {
            Boolean theTriggerable;
            theTriggerable = this.isTriggerable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "triggerable", theTriggerable), currentHashCode, theTriggerable);
        }
        {
            boolean theUndeletable;
            theUndeletable = (true?this.isUndeletable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undeletable", theUndeletable), currentHashCode, theUndeletable);
        }
        {
            boolean theUpdateable;
            theUpdateable = (true?this.isUpdateable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateable", theUpdateable), currentHashCode, theUpdateable);
        }
        {
            String theUrlDetail;
            theUrlDetail = this.getUrlDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "urlDetail", theUrlDetail), currentHashCode, theUrlDetail);
        }
        {
            String theUrlEdit;
            theUrlEdit = this.getUrlEdit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "urlEdit", theUrlEdit), currentHashCode, theUrlEdit);
        }
        {
            String theUrlNew;
            theUrlNew = this.getUrlNew();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "urlNew", theUrlNew), currentHashCode, theUrlNew);
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
            List<ActionOverride> theActionOverrides;
            theActionOverrides = (((this.actionOverrides!= null)&&(!this.actionOverrides.isEmpty()))?this.getActionOverrides():null);
            strategy.appendField(locator, this, "actionOverrides", buffer, theActionOverrides);
        }
        {
            boolean theActivateable;
            theActivateable = (true?this.isActivateable():false);
            strategy.appendField(locator, this, "activateable", buffer, theActivateable);
        }
        {
            List<ChildRelationship> theChildRelationships;
            theChildRelationships = (((this.childRelationships!= null)&&(!this.childRelationships.isEmpty()))?this.getChildRelationships():null);
            strategy.appendField(locator, this, "childRelationships", buffer, theChildRelationships);
        }
        {
            boolean theCompactLayoutable;
            theCompactLayoutable = (true?this.isCompactLayoutable():false);
            strategy.appendField(locator, this, "compactLayoutable", buffer, theCompactLayoutable);
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
            boolean theCustomSetting;
            theCustomSetting = (true?this.isCustomSetting():false);
            strategy.appendField(locator, this, "customSetting", buffer, theCustomSetting);
        }
        {
            Boolean theDataTranslationEnabled;
            theDataTranslationEnabled = this.isDataTranslationEnabled();
            strategy.appendField(locator, this, "dataTranslationEnabled", buffer, theDataTranslationEnabled);
        }
        {
            boolean theDeepCloneable;
            theDeepCloneable = (true?this.isDeepCloneable():false);
            strategy.appendField(locator, this, "deepCloneable", buffer, theDeepCloneable);
        }
        {
            String theDefaultImplementation;
            theDefaultImplementation = this.getDefaultImplementation();
            strategy.appendField(locator, this, "defaultImplementation", buffer, theDefaultImplementation);
        }
        {
            boolean theDeletable;
            theDeletable = (true?this.isDeletable():false);
            strategy.appendField(locator, this, "deletable", buffer, theDeletable);
        }
        {
            boolean theDeprecatedAndHidden;
            theDeprecatedAndHidden = (true?this.isDeprecatedAndHidden():false);
            strategy.appendField(locator, this, "deprecatedAndHidden", buffer, theDeprecatedAndHidden);
        }
        {
            boolean theFeedEnabled;
            theFeedEnabled = (true?this.isFeedEnabled():false);
            strategy.appendField(locator, this, "feedEnabled", buffer, theFeedEnabled);
        }
        {
            List<Field> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            strategy.appendField(locator, this, "fields", buffer, theFields);
        }
        {
            boolean theHasSubtypes;
            theHasSubtypes = (true?this.isHasSubtypes():false);
            strategy.appendField(locator, this, "hasSubtypes", buffer, theHasSubtypes);
        }
        {
            boolean theIdEnabled;
            theIdEnabled = (true?this.isIdEnabled():false);
            strategy.appendField(locator, this, "idEnabled", buffer, theIdEnabled);
        }
        {
            String theImplementedBy;
            theImplementedBy = this.getImplementedBy();
            strategy.appendField(locator, this, "implementedBy", buffer, theImplementedBy);
        }
        {
            String theImplementsInterfaces;
            theImplementsInterfaces = this.getImplementsInterfaces();
            strategy.appendField(locator, this, "implementsInterfaces", buffer, theImplementsInterfaces);
        }
        {
            boolean theIsInterface;
            theIsInterface = (true?this.isIsInterface():false);
            strategy.appendField(locator, this, "isInterface", buffer, theIsInterface);
        }
        {
            boolean theIsSubtype;
            theIsSubtype = (true?this.isIsSubtype():false);
            strategy.appendField(locator, this, "isSubtype", buffer, theIsSubtype);
        }
        {
            String theKeyPrefix;
            theKeyPrefix = this.getKeyPrefix();
            strategy.appendField(locator, this, "keyPrefix", buffer, theKeyPrefix);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theLabelPlural;
            theLabelPlural = this.getLabelPlural();
            strategy.appendField(locator, this, "labelPlural", buffer, theLabelPlural);
        }
        {
            boolean theLayoutable;
            theLayoutable = (true?this.isLayoutable():false);
            strategy.appendField(locator, this, "layoutable", buffer, theLayoutable);
        }
        {
            Boolean theListviewable;
            theListviewable = this.isListviewable();
            strategy.appendField(locator, this, "listviewable", buffer, theListviewable);
        }
        {
            Boolean theLookupLayoutable;
            theLookupLayoutable = this.isLookupLayoutable();
            strategy.appendField(locator, this, "lookupLayoutable", buffer, theLookupLayoutable);
        }
        {
            boolean theMergeable;
            theMergeable = (true?this.isMergeable():false);
            strategy.appendField(locator, this, "mergeable", buffer, theMergeable);
        }
        {
            boolean theMruEnabled;
            theMruEnabled = (true?this.isMruEnabled():false);
            strategy.appendField(locator, this, "mruEnabled", buffer, theMruEnabled);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<NamedLayoutInfo> theNamedLayoutInfos;
            theNamedLayoutInfos = (((this.namedLayoutInfos!= null)&&(!this.namedLayoutInfos.isEmpty()))?this.getNamedLayoutInfos():null);
            strategy.appendField(locator, this, "namedLayoutInfos", buffer, theNamedLayoutInfos);
        }
        {
            String theNetworkScopeFieldName;
            theNetworkScopeFieldName = this.getNetworkScopeFieldName();
            strategy.appendField(locator, this, "networkScopeFieldName", buffer, theNetworkScopeFieldName);
        }
        {
            boolean theQueryable;
            theQueryable = (true?this.isQueryable():false);
            strategy.appendField(locator, this, "queryable", buffer, theQueryable);
        }
        {
            List<RecordTypeInfo> theRecordTypeInfos;
            theRecordTypeInfos = (((this.recordTypeInfos!= null)&&(!this.recordTypeInfos.isEmpty()))?this.getRecordTypeInfos():null);
            strategy.appendField(locator, this, "recordTypeInfos", buffer, theRecordTypeInfos);
        }
        {
            boolean theReplicateable;
            theReplicateable = (true?this.isReplicateable():false);
            strategy.appendField(locator, this, "replicateable", buffer, theReplicateable);
        }
        {
            boolean theRetrieveable;
            theRetrieveable = (true?this.isRetrieveable():false);
            strategy.appendField(locator, this, "retrieveable", buffer, theRetrieveable);
        }
        {
            Boolean theSearchLayoutable;
            theSearchLayoutable = this.isSearchLayoutable();
            strategy.appendField(locator, this, "searchLayoutable", buffer, theSearchLayoutable);
        }
        {
            boolean theSearchable;
            theSearchable = (true?this.isSearchable():false);
            strategy.appendField(locator, this, "searchable", buffer, theSearchable);
        }
        {
            List<ScopeInfo> theSupportedScopes;
            theSupportedScopes = (((this.supportedScopes!= null)&&(!this.supportedScopes.isEmpty()))?this.getSupportedScopes():null);
            strategy.appendField(locator, this, "supportedScopes", buffer, theSupportedScopes);
        }
        {
            Boolean theTriggerable;
            theTriggerable = this.isTriggerable();
            strategy.appendField(locator, this, "triggerable", buffer, theTriggerable);
        }
        {
            boolean theUndeletable;
            theUndeletable = (true?this.isUndeletable():false);
            strategy.appendField(locator, this, "undeletable", buffer, theUndeletable);
        }
        {
            boolean theUpdateable;
            theUpdateable = (true?this.isUpdateable():false);
            strategy.appendField(locator, this, "updateable", buffer, theUpdateable);
        }
        {
            String theUrlDetail;
            theUrlDetail = this.getUrlDetail();
            strategy.appendField(locator, this, "urlDetail", buffer, theUrlDetail);
        }
        {
            String theUrlEdit;
            theUrlEdit = this.getUrlEdit();
            strategy.appendField(locator, this, "urlEdit", buffer, theUrlEdit);
        }
        {
            String theUrlNew;
            theUrlNew = this.getUrlNew();
            strategy.appendField(locator, this, "urlNew", buffer, theUrlNew);
        }
        return buffer;
    }

}
