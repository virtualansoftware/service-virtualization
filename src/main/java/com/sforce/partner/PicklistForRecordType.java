
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
 * <p>Java class for PicklistForRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PicklistForRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="picklistName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="picklistValues" type="{urn:partner.soap.sforce.com}PicklistEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PicklistForRecordType", propOrder = {
    "picklistName",
    "picklistValues"
})
public class PicklistForRecordType
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String picklistName;
    @XmlElement(nillable = true)
    protected List<PicklistEntry> picklistValues;

    /**
     * Gets the value of the picklistName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicklistName() {
        return picklistName;
    }

    /**
     * Sets the value of the picklistName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicklistName(String value) {
        this.picklistName = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PicklistForRecordType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PicklistForRecordType that = ((PicklistForRecordType) object);
        {
            String lhsPicklistName;
            lhsPicklistName = this.getPicklistName();
            String rhsPicklistName;
            rhsPicklistName = that.getPicklistName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picklistName", lhsPicklistName), LocatorUtils.property(thatLocator, "picklistName", rhsPicklistName), lhsPicklistName, rhsPicklistName)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String thePicklistName;
            thePicklistName = this.getPicklistName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistName", thePicklistName), currentHashCode, thePicklistName);
        }
        {
            List<PicklistEntry> thePicklistValues;
            thePicklistValues = (((this.picklistValues!= null)&&(!this.picklistValues.isEmpty()))?this.getPicklistValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistValues", thePicklistValues), currentHashCode, thePicklistValues);
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
            String thePicklistName;
            thePicklistName = this.getPicklistName();
            strategy.appendField(locator, this, "picklistName", buffer, thePicklistName);
        }
        {
            List<PicklistEntry> thePicklistValues;
            thePicklistValues = (((this.picklistValues!= null)&&(!this.picklistValues.isEmpty()))?this.getPicklistValues():null);
            strategy.appendField(locator, this, "picklistValues", buffer, thePicklistValues);
        }
        return buffer;
    }

}
