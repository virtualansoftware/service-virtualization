
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
import org.w3c.dom.Element;


/**
 * <p>Java class for sObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fieldsToNull" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;any processContents='lax' namespace='urn:sobject.partner.soap.sforce.com' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sObject", namespace = "urn:sobject.partner.soap.sforce.com", propOrder = {
    "type",
    "fieldsToNulls",
    "id",
    "anies"
})
public class SObject
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "fieldsToNull", nillable = true)
    protected List<String> fieldsToNulls;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlAnyElement
    protected List<Element> anies;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fieldsToNulls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldsToNulls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldsToNulls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldsToNulls() {
        if (fieldsToNulls == null) {
            fieldsToNulls = new ArrayList<String>();
        }
        return this.fieldsToNulls;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Element>();
        }
        return this.anies;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SObject)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SObject that = ((SObject) object);
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            List<String> lhsFieldsToNulls;
            lhsFieldsToNulls = (((this.fieldsToNulls!= null)&&(!this.fieldsToNulls.isEmpty()))?this.getFieldsToNulls():null);
            List<String> rhsFieldsToNulls;
            rhsFieldsToNulls = (((that.fieldsToNulls!= null)&&(!that.fieldsToNulls.isEmpty()))?that.getFieldsToNulls():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldsToNulls", lhsFieldsToNulls), LocatorUtils.property(thatLocator, "fieldsToNulls", rhsFieldsToNulls), lhsFieldsToNulls, rhsFieldsToNulls)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            List<Element> lhsAnies;
            lhsAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            List<Element> rhsAnies;
            rhsAnies = (((that.anies!= null)&&(!that.anies.isEmpty()))?that.getAnies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anies", lhsAnies), LocatorUtils.property(thatLocator, "anies", rhsAnies), lhsAnies, rhsAnies)) {
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
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            List<String> theFieldsToNulls;
            theFieldsToNulls = (((this.fieldsToNulls!= null)&&(!this.fieldsToNulls.isEmpty()))?this.getFieldsToNulls():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldsToNulls", theFieldsToNulls), currentHashCode, theFieldsToNulls);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            List<Element> theAnies;
            theAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anies", theAnies), currentHashCode, theAnies);
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
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            List<String> theFieldsToNulls;
            theFieldsToNulls = (((this.fieldsToNulls!= null)&&(!this.fieldsToNulls.isEmpty()))?this.getFieldsToNulls():null);
            strategy.appendField(locator, this, "fieldsToNulls", buffer, theFieldsToNulls);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            List<Element> theAnies;
            theAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            strategy.appendField(locator, this, "anies", buffer, theAnies);
        }
        return buffer;
    }

}
