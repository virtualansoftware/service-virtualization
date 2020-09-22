
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldList" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ids" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fieldList",
    "sObjectType",
    "ids"
})
@XmlRootElement(name = "retrieve")
public class Retrieve
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String fieldList;
    @XmlElement(required = true)
    protected String sObjectType;
    protected List<String> ids;

    /**
     * Gets the value of the fieldList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldList() {
        return fieldList;
    }

    /**
     * Sets the value of the fieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldList(String value) {
        this.fieldList = value;
    }

    /**
     * Gets the value of the sObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObjectType() {
        return sObjectType;
    }

    /**
     * Sets the value of the sObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObjectType(String value) {
        this.sObjectType = value;
    }

    /**
     * Gets the value of the ids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIds() {
        if (ids == null) {
            ids = new ArrayList<String>();
        }
        return this.ids;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Retrieve)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Retrieve that = ((Retrieve) object);
        {
            String lhsFieldList;
            lhsFieldList = this.getFieldList();
            String rhsFieldList;
            rhsFieldList = that.getFieldList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldList", lhsFieldList), LocatorUtils.property(thatLocator, "fieldList", rhsFieldList), lhsFieldList, rhsFieldList)) {
                return false;
            }
        }
        {
            String lhsSObjectType;
            lhsSObjectType = this.getSObjectType();
            String rhsSObjectType;
            rhsSObjectType = that.getSObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sObjectType", lhsSObjectType), LocatorUtils.property(thatLocator, "sObjectType", rhsSObjectType), lhsSObjectType, rhsSObjectType)) {
                return false;
            }
        }
        {
            List<String> lhsIds;
            lhsIds = (((this.ids!= null)&&(!this.ids.isEmpty()))?this.getIds():null);
            List<String> rhsIds;
            rhsIds = (((that.ids!= null)&&(!that.ids.isEmpty()))?that.getIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ids", lhsIds), LocatorUtils.property(thatLocator, "ids", rhsIds), lhsIds, rhsIds)) {
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
            String theFieldList;
            theFieldList = this.getFieldList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldList", theFieldList), currentHashCode, theFieldList);
        }
        {
            String theSObjectType;
            theSObjectType = this.getSObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObjectType", theSObjectType), currentHashCode, theSObjectType);
        }
        {
            List<String> theIds;
            theIds = (((this.ids!= null)&&(!this.ids.isEmpty()))?this.getIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ids", theIds), currentHashCode, theIds);
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
            String theFieldList;
            theFieldList = this.getFieldList();
            strategy.appendField(locator, this, "fieldList", buffer, theFieldList);
        }
        {
            String theSObjectType;
            theSObjectType = this.getSObjectType();
            strategy.appendField(locator, this, "sObjectType", buffer, theSObjectType);
        }
        {
            List<String> theIds;
            theIds = (((this.ids!= null)&&(!this.ids.isEmpty()))?this.getIds():null);
            strategy.appendField(locator, this, "ids", buffer, theIds);
        }
        return buffer;
    }

}
