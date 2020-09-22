
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
 * <p>Java class for EntitySearchMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitySearchMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorMetadata" type="{urn:partner.soap.sforce.com}EntityErrorMetadata" minOccurs="0"/&gt;
 *         &lt;element name="fieldMetadata" type="{urn:partner.soap.sforce.com}FieldLevelSearchMetadata" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="intentQueryMetadata" type="{urn:partner.soap.sforce.com}EntityIntentQueryMetadata" minOccurs="0"/&gt;
 *         &lt;element name="searchPromotionMetadata" type="{urn:partner.soap.sforce.com}EntitySearchPromotionMetadata" minOccurs="0"/&gt;
 *         &lt;element name="spellCorrectionMetadata" type="{urn:partner.soap.sforce.com}EntitySpellCorrectionMetadata" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitySearchMetadata", propOrder = {
    "entityName",
    "errorMetadata",
    "fieldMetadatas",
    "intentQueryMetadata",
    "searchPromotionMetadata",
    "spellCorrectionMetadata"
})
public class EntitySearchMetadata
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String entityName;
    protected EntityErrorMetadata errorMetadata;
    @XmlElement(name = "fieldMetadata")
    protected List<FieldLevelSearchMetadata> fieldMetadatas;
    protected EntityIntentQueryMetadata intentQueryMetadata;
    protected EntitySearchPromotionMetadata searchPromotionMetadata;
    protected EntitySpellCorrectionMetadata spellCorrectionMetadata;

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the errorMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link EntityErrorMetadata }
     *     
     */
    public EntityErrorMetadata getErrorMetadata() {
        return errorMetadata;
    }

    /**
     * Sets the value of the errorMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityErrorMetadata }
     *     
     */
    public void setErrorMetadata(EntityErrorMetadata value) {
        this.errorMetadata = value;
    }

    /**
     * Gets the value of the fieldMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldLevelSearchMetadata }
     * 
     * 
     */
    public List<FieldLevelSearchMetadata> getFieldMetadatas() {
        if (fieldMetadatas == null) {
            fieldMetadatas = new ArrayList<FieldLevelSearchMetadata>();
        }
        return this.fieldMetadatas;
    }

    /**
     * Gets the value of the intentQueryMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIntentQueryMetadata }
     *     
     */
    public EntityIntentQueryMetadata getIntentQueryMetadata() {
        return intentQueryMetadata;
    }

    /**
     * Sets the value of the intentQueryMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIntentQueryMetadata }
     *     
     */
    public void setIntentQueryMetadata(EntityIntentQueryMetadata value) {
        this.intentQueryMetadata = value;
    }

    /**
     * Gets the value of the searchPromotionMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchPromotionMetadata }
     *     
     */
    public EntitySearchPromotionMetadata getSearchPromotionMetadata() {
        return searchPromotionMetadata;
    }

    /**
     * Sets the value of the searchPromotionMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchPromotionMetadata }
     *     
     */
    public void setSearchPromotionMetadata(EntitySearchPromotionMetadata value) {
        this.searchPromotionMetadata = value;
    }

    /**
     * Gets the value of the spellCorrectionMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySpellCorrectionMetadata }
     *     
     */
    public EntitySpellCorrectionMetadata getSpellCorrectionMetadata() {
        return spellCorrectionMetadata;
    }

    /**
     * Sets the value of the spellCorrectionMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySpellCorrectionMetadata }
     *     
     */
    public void setSpellCorrectionMetadata(EntitySpellCorrectionMetadata value) {
        this.spellCorrectionMetadata = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EntitySearchMetadata)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EntitySearchMetadata that = ((EntitySearchMetadata) object);
        {
            String lhsEntityName;
            lhsEntityName = this.getEntityName();
            String rhsEntityName;
            rhsEntityName = that.getEntityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityName", lhsEntityName), LocatorUtils.property(thatLocator, "entityName", rhsEntityName), lhsEntityName, rhsEntityName)) {
                return false;
            }
        }
        {
            EntityErrorMetadata lhsErrorMetadata;
            lhsErrorMetadata = this.getErrorMetadata();
            EntityErrorMetadata rhsErrorMetadata;
            rhsErrorMetadata = that.getErrorMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorMetadata", lhsErrorMetadata), LocatorUtils.property(thatLocator, "errorMetadata", rhsErrorMetadata), lhsErrorMetadata, rhsErrorMetadata)) {
                return false;
            }
        }
        {
            List<FieldLevelSearchMetadata> lhsFieldMetadatas;
            lhsFieldMetadatas = (((this.fieldMetadatas!= null)&&(!this.fieldMetadatas.isEmpty()))?this.getFieldMetadatas():null);
            List<FieldLevelSearchMetadata> rhsFieldMetadatas;
            rhsFieldMetadatas = (((that.fieldMetadatas!= null)&&(!that.fieldMetadatas.isEmpty()))?that.getFieldMetadatas():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldMetadatas", lhsFieldMetadatas), LocatorUtils.property(thatLocator, "fieldMetadatas", rhsFieldMetadatas), lhsFieldMetadatas, rhsFieldMetadatas)) {
                return false;
            }
        }
        {
            EntityIntentQueryMetadata lhsIntentQueryMetadata;
            lhsIntentQueryMetadata = this.getIntentQueryMetadata();
            EntityIntentQueryMetadata rhsIntentQueryMetadata;
            rhsIntentQueryMetadata = that.getIntentQueryMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intentQueryMetadata", lhsIntentQueryMetadata), LocatorUtils.property(thatLocator, "intentQueryMetadata", rhsIntentQueryMetadata), lhsIntentQueryMetadata, rhsIntentQueryMetadata)) {
                return false;
            }
        }
        {
            EntitySearchPromotionMetadata lhsSearchPromotionMetadata;
            lhsSearchPromotionMetadata = this.getSearchPromotionMetadata();
            EntitySearchPromotionMetadata rhsSearchPromotionMetadata;
            rhsSearchPromotionMetadata = that.getSearchPromotionMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchPromotionMetadata", lhsSearchPromotionMetadata), LocatorUtils.property(thatLocator, "searchPromotionMetadata", rhsSearchPromotionMetadata), lhsSearchPromotionMetadata, rhsSearchPromotionMetadata)) {
                return false;
            }
        }
        {
            EntitySpellCorrectionMetadata lhsSpellCorrectionMetadata;
            lhsSpellCorrectionMetadata = this.getSpellCorrectionMetadata();
            EntitySpellCorrectionMetadata rhsSpellCorrectionMetadata;
            rhsSpellCorrectionMetadata = that.getSpellCorrectionMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spellCorrectionMetadata", lhsSpellCorrectionMetadata), LocatorUtils.property(thatLocator, "spellCorrectionMetadata", rhsSpellCorrectionMetadata), lhsSpellCorrectionMetadata, rhsSpellCorrectionMetadata)) {
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
            String theEntityName;
            theEntityName = this.getEntityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityName", theEntityName), currentHashCode, theEntityName);
        }
        {
            EntityErrorMetadata theErrorMetadata;
            theErrorMetadata = this.getErrorMetadata();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorMetadata", theErrorMetadata), currentHashCode, theErrorMetadata);
        }
        {
            List<FieldLevelSearchMetadata> theFieldMetadatas;
            theFieldMetadatas = (((this.fieldMetadatas!= null)&&(!this.fieldMetadatas.isEmpty()))?this.getFieldMetadatas():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldMetadatas", theFieldMetadatas), currentHashCode, theFieldMetadatas);
        }
        {
            EntityIntentQueryMetadata theIntentQueryMetadata;
            theIntentQueryMetadata = this.getIntentQueryMetadata();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intentQueryMetadata", theIntentQueryMetadata), currentHashCode, theIntentQueryMetadata);
        }
        {
            EntitySearchPromotionMetadata theSearchPromotionMetadata;
            theSearchPromotionMetadata = this.getSearchPromotionMetadata();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchPromotionMetadata", theSearchPromotionMetadata), currentHashCode, theSearchPromotionMetadata);
        }
        {
            EntitySpellCorrectionMetadata theSpellCorrectionMetadata;
            theSpellCorrectionMetadata = this.getSpellCorrectionMetadata();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spellCorrectionMetadata", theSpellCorrectionMetadata), currentHashCode, theSpellCorrectionMetadata);
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
            String theEntityName;
            theEntityName = this.getEntityName();
            strategy.appendField(locator, this, "entityName", buffer, theEntityName);
        }
        {
            EntityErrorMetadata theErrorMetadata;
            theErrorMetadata = this.getErrorMetadata();
            strategy.appendField(locator, this, "errorMetadata", buffer, theErrorMetadata);
        }
        {
            List<FieldLevelSearchMetadata> theFieldMetadatas;
            theFieldMetadatas = (((this.fieldMetadatas!= null)&&(!this.fieldMetadatas.isEmpty()))?this.getFieldMetadatas():null);
            strategy.appendField(locator, this, "fieldMetadatas", buffer, theFieldMetadatas);
        }
        {
            EntityIntentQueryMetadata theIntentQueryMetadata;
            theIntentQueryMetadata = this.getIntentQueryMetadata();
            strategy.appendField(locator, this, "intentQueryMetadata", buffer, theIntentQueryMetadata);
        }
        {
            EntitySearchPromotionMetadata theSearchPromotionMetadata;
            theSearchPromotionMetadata = this.getSearchPromotionMetadata();
            strategy.appendField(locator, this, "searchPromotionMetadata", buffer, theSearchPromotionMetadata);
        }
        {
            EntitySpellCorrectionMetadata theSpellCorrectionMetadata;
            theSpellCorrectionMetadata = this.getSpellCorrectionMetadata();
            strategy.appendField(locator, this, "spellCorrectionMetadata", buffer, theSpellCorrectionMetadata);
        }
        return buffer;
    }

}
