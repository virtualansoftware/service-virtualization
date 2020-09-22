
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
 * <p>Java class for ChildRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cascadeDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="childSObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deprecatedAndHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="junctionIdListNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="junctionReferenceTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictedDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildRelationship", propOrder = {
    "cascadeDelete",
    "childSObject",
    "deprecatedAndHidden",
    "field",
    "junctionIdListNames",
    "junctionReferenceTos",
    "relationshipName",
    "restrictedDelete"
})
public class ChildRelationship
    implements Equals, HashCode, ToString
{

    protected boolean cascadeDelete;
    @XmlElement(required = true)
    protected String childSObject;
    protected boolean deprecatedAndHidden;
    @XmlElement(required = true)
    protected String field;
    @XmlElement(nillable = true)
    protected List<String> junctionIdListNames;
    @XmlElement(name = "junctionReferenceTo", nillable = true)
    protected List<String> junctionReferenceTos;
    protected String relationshipName;
    protected Boolean restrictedDelete;

    /**
     * Gets the value of the cascadeDelete property.
     * 
     */
    public boolean isCascadeDelete() {
        return cascadeDelete;
    }

    /**
     * Sets the value of the cascadeDelete property.
     * 
     */
    public void setCascadeDelete(boolean value) {
        this.cascadeDelete = value;
    }

    /**
     * Gets the value of the childSObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildSObject() {
        return childSObject;
    }

    /**
     * Sets the value of the childSObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildSObject(String value) {
        this.childSObject = value;
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
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the junctionIdListNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the junctionIdListNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJunctionIdListNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJunctionIdListNames() {
        if (junctionIdListNames == null) {
            junctionIdListNames = new ArrayList<String>();
        }
        return this.junctionIdListNames;
    }

    /**
     * Gets the value of the junctionReferenceTos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the junctionReferenceTos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJunctionReferenceTos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJunctionReferenceTos() {
        if (junctionReferenceTos == null) {
            junctionReferenceTos = new ArrayList<String>();
        }
        return this.junctionReferenceTos;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ChildRelationship)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ChildRelationship that = ((ChildRelationship) object);
        {
            boolean lhsCascadeDelete;
            lhsCascadeDelete = (true?this.isCascadeDelete():false);
            boolean rhsCascadeDelete;
            rhsCascadeDelete = (true?that.isCascadeDelete():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cascadeDelete", lhsCascadeDelete), LocatorUtils.property(thatLocator, "cascadeDelete", rhsCascadeDelete), lhsCascadeDelete, rhsCascadeDelete)) {
                return false;
            }
        }
        {
            String lhsChildSObject;
            lhsChildSObject = this.getChildSObject();
            String rhsChildSObject;
            rhsChildSObject = that.getChildSObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "childSObject", lhsChildSObject), LocatorUtils.property(thatLocator, "childSObject", rhsChildSObject), lhsChildSObject, rhsChildSObject)) {
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
            String lhsField;
            lhsField = this.getField();
            String rhsField;
            rhsField = that.getField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
                return false;
            }
        }
        {
            List<String> lhsJunctionIdListNames;
            lhsJunctionIdListNames = (((this.junctionIdListNames!= null)&&(!this.junctionIdListNames.isEmpty()))?this.getJunctionIdListNames():null);
            List<String> rhsJunctionIdListNames;
            rhsJunctionIdListNames = (((that.junctionIdListNames!= null)&&(!that.junctionIdListNames.isEmpty()))?that.getJunctionIdListNames():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "junctionIdListNames", lhsJunctionIdListNames), LocatorUtils.property(thatLocator, "junctionIdListNames", rhsJunctionIdListNames), lhsJunctionIdListNames, rhsJunctionIdListNames)) {
                return false;
            }
        }
        {
            List<String> lhsJunctionReferenceTos;
            lhsJunctionReferenceTos = (((this.junctionReferenceTos!= null)&&(!this.junctionReferenceTos.isEmpty()))?this.getJunctionReferenceTos():null);
            List<String> rhsJunctionReferenceTos;
            rhsJunctionReferenceTos = (((that.junctionReferenceTos!= null)&&(!that.junctionReferenceTos.isEmpty()))?that.getJunctionReferenceTos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "junctionReferenceTos", lhsJunctionReferenceTos), LocatorUtils.property(thatLocator, "junctionReferenceTos", rhsJunctionReferenceTos), lhsJunctionReferenceTos, rhsJunctionReferenceTos)) {
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
            Boolean lhsRestrictedDelete;
            lhsRestrictedDelete = this.isRestrictedDelete();
            Boolean rhsRestrictedDelete;
            rhsRestrictedDelete = that.isRestrictedDelete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restrictedDelete", lhsRestrictedDelete), LocatorUtils.property(thatLocator, "restrictedDelete", rhsRestrictedDelete), lhsRestrictedDelete, rhsRestrictedDelete)) {
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
            boolean theCascadeDelete;
            theCascadeDelete = (true?this.isCascadeDelete():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cascadeDelete", theCascadeDelete), currentHashCode, theCascadeDelete);
        }
        {
            String theChildSObject;
            theChildSObject = this.getChildSObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "childSObject", theChildSObject), currentHashCode, theChildSObject);
        }
        {
            boolean theDeprecatedAndHidden;
            theDeprecatedAndHidden = (true?this.isDeprecatedAndHidden():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deprecatedAndHidden", theDeprecatedAndHidden), currentHashCode, theDeprecatedAndHidden);
        }
        {
            String theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        {
            List<String> theJunctionIdListNames;
            theJunctionIdListNames = (((this.junctionIdListNames!= null)&&(!this.junctionIdListNames.isEmpty()))?this.getJunctionIdListNames():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "junctionIdListNames", theJunctionIdListNames), currentHashCode, theJunctionIdListNames);
        }
        {
            List<String> theJunctionReferenceTos;
            theJunctionReferenceTos = (((this.junctionReferenceTos!= null)&&(!this.junctionReferenceTos.isEmpty()))?this.getJunctionReferenceTos():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "junctionReferenceTos", theJunctionReferenceTos), currentHashCode, theJunctionReferenceTos);
        }
        {
            String theRelationshipName;
            theRelationshipName = this.getRelationshipName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipName", theRelationshipName), currentHashCode, theRelationshipName);
        }
        {
            Boolean theRestrictedDelete;
            theRestrictedDelete = this.isRestrictedDelete();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restrictedDelete", theRestrictedDelete), currentHashCode, theRestrictedDelete);
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
            boolean theCascadeDelete;
            theCascadeDelete = (true?this.isCascadeDelete():false);
            strategy.appendField(locator, this, "cascadeDelete", buffer, theCascadeDelete);
        }
        {
            String theChildSObject;
            theChildSObject = this.getChildSObject();
            strategy.appendField(locator, this, "childSObject", buffer, theChildSObject);
        }
        {
            boolean theDeprecatedAndHidden;
            theDeprecatedAndHidden = (true?this.isDeprecatedAndHidden():false);
            strategy.appendField(locator, this, "deprecatedAndHidden", buffer, theDeprecatedAndHidden);
        }
        {
            String theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            List<String> theJunctionIdListNames;
            theJunctionIdListNames = (((this.junctionIdListNames!= null)&&(!this.junctionIdListNames.isEmpty()))?this.getJunctionIdListNames():null);
            strategy.appendField(locator, this, "junctionIdListNames", buffer, theJunctionIdListNames);
        }
        {
            List<String> theJunctionReferenceTos;
            theJunctionReferenceTos = (((this.junctionReferenceTos!= null)&&(!this.junctionReferenceTos.isEmpty()))?this.getJunctionReferenceTos():null);
            strategy.appendField(locator, this, "junctionReferenceTos", buffer, theJunctionReferenceTos);
        }
        {
            String theRelationshipName;
            theRelationshipName = this.getRelationshipName();
            strategy.appendField(locator, this, "relationshipName", buffer, theRelationshipName);
        }
        {
            Boolean theRestrictedDelete;
            theRestrictedDelete = this.isRestrictedDelete();
            strategy.appendField(locator, this, "restrictedDelete", buffer, theRestrictedDelete);
        }
        return buffer;
    }

}
