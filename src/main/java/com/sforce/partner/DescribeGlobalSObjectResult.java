
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
 * <p>Java class for DescribeGlobalSObjectResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeGlobalSObjectResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="createable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="customSetting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dataTranslationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deepCloneable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deletable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deprecatedAndHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="feedEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasSubtypes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isInterface" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isSubtype" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="keyPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="labelPlural" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="layoutable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mergeable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mruEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="queryable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="replicateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="retrieveable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="searchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="triggerable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="undeletable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="updateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeGlobalSObjectResult", propOrder = {
    "activateable",
    "createable",
    "custom",
    "customSetting",
    "dataTranslationEnabled",
    "deepCloneable",
    "deletable",
    "deprecatedAndHidden",
    "feedEnabled",
    "hasSubtypes",
    "idEnabled",
    "isInterface",
    "isSubtype",
    "keyPrefix",
    "label",
    "labelPlural",
    "layoutable",
    "mergeable",
    "mruEnabled",
    "name",
    "queryable",
    "replicateable",
    "retrieveable",
    "searchable",
    "triggerable",
    "undeletable",
    "updateable"
})
public class DescribeGlobalSObjectResult
    implements Equals, HashCode, ToString
{

    protected boolean activateable;
    protected boolean createable;
    protected boolean custom;
    protected boolean customSetting;
    protected Boolean dataTranslationEnabled;
    protected boolean deepCloneable;
    protected boolean deletable;
    protected boolean deprecatedAndHidden;
    protected boolean feedEnabled;
    protected boolean hasSubtypes;
    protected boolean idEnabled;
    protected boolean isInterface;
    protected boolean isSubtype;
    @XmlElement(required = true, nillable = true)
    protected String keyPrefix;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String labelPlural;
    protected boolean layoutable;
    protected boolean mergeable;
    protected boolean mruEnabled;
    @XmlElement(required = true)
    protected String name;
    protected boolean queryable;
    protected boolean replicateable;
    protected boolean retrieveable;
    protected boolean searchable;
    protected boolean triggerable;
    protected boolean undeletable;
    protected boolean updateable;

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
     * Gets the value of the triggerable property.
     * 
     */
    public boolean isTriggerable() {
        return triggerable;
    }

    /**
     * Sets the value of the triggerable property.
     * 
     */
    public void setTriggerable(boolean value) {
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeGlobalSObjectResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeGlobalSObjectResult that = ((DescribeGlobalSObjectResult) object);
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
            boolean lhsQueryable;
            lhsQueryable = (true?this.isQueryable():false);
            boolean rhsQueryable;
            rhsQueryable = (true?that.isQueryable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryable", lhsQueryable), LocatorUtils.property(thatLocator, "queryable", rhsQueryable), lhsQueryable, rhsQueryable)) {
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
            boolean lhsSearchable;
            lhsSearchable = (true?this.isSearchable():false);
            boolean rhsSearchable;
            rhsSearchable = (true?that.isSearchable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchable", lhsSearchable), LocatorUtils.property(thatLocator, "searchable", rhsSearchable), lhsSearchable, rhsSearchable)) {
                return false;
            }
        }
        {
            boolean lhsTriggerable;
            lhsTriggerable = (true?this.isTriggerable():false);
            boolean rhsTriggerable;
            rhsTriggerable = (true?that.isTriggerable():false);
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theActivateable;
            theActivateable = (true?this.isActivateable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activateable", theActivateable), currentHashCode, theActivateable);
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
            boolean theQueryable;
            theQueryable = (true?this.isQueryable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryable", theQueryable), currentHashCode, theQueryable);
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
            boolean theSearchable;
            theSearchable = (true?this.isSearchable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchable", theSearchable), currentHashCode, theSearchable);
        }
        {
            boolean theTriggerable;
            theTriggerable = (true?this.isTriggerable():false);
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
            boolean theActivateable;
            theActivateable = (true?this.isActivateable():false);
            strategy.appendField(locator, this, "activateable", buffer, theActivateable);
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
            boolean theQueryable;
            theQueryable = (true?this.isQueryable():false);
            strategy.appendField(locator, this, "queryable", buffer, theQueryable);
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
            boolean theSearchable;
            theSearchable = (true?this.isSearchable():false);
            strategy.appendField(locator, this, "searchable", buffer, theSearchable);
        }
        {
            boolean theTriggerable;
            theTriggerable = (true?this.isTriggerable():false);
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
        return buffer;
    }

}
