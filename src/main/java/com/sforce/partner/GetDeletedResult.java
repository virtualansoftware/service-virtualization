
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for GetDeletedResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeletedResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deletedRecords" type="{urn:partner.soap.sforce.com}DeletedRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="earliestDateAvailable" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="latestDateCovered" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeletedResult", propOrder = {
    "deletedRecords",
    "earliestDateAvailable",
    "latestDateCovered"
})
public class GetDeletedResult
    implements Equals, HashCode, ToString
{

    protected List<DeletedRecord> deletedRecords;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestDateAvailable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestDateCovered;

    /**
     * Gets the value of the deletedRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeletedRecord }
     * 
     * 
     */
    public List<DeletedRecord> getDeletedRecords() {
        if (deletedRecords == null) {
            deletedRecords = new ArrayList<DeletedRecord>();
        }
        return this.deletedRecords;
    }

    /**
     * Gets the value of the earliestDateAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestDateAvailable() {
        return earliestDateAvailable;
    }

    /**
     * Sets the value of the earliestDateAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestDateAvailable(XMLGregorianCalendar value) {
        this.earliestDateAvailable = value;
    }

    /**
     * Gets the value of the latestDateCovered property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestDateCovered() {
        return latestDateCovered;
    }

    /**
     * Sets the value of the latestDateCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestDateCovered(XMLGregorianCalendar value) {
        this.latestDateCovered = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetDeletedResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GetDeletedResult that = ((GetDeletedResult) object);
        {
            List<DeletedRecord> lhsDeletedRecords;
            lhsDeletedRecords = (((this.deletedRecords!= null)&&(!this.deletedRecords.isEmpty()))?this.getDeletedRecords():null);
            List<DeletedRecord> rhsDeletedRecords;
            rhsDeletedRecords = (((that.deletedRecords!= null)&&(!that.deletedRecords.isEmpty()))?that.getDeletedRecords():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deletedRecords", lhsDeletedRecords), LocatorUtils.property(thatLocator, "deletedRecords", rhsDeletedRecords), lhsDeletedRecords, rhsDeletedRecords)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEarliestDateAvailable;
            lhsEarliestDateAvailable = this.getEarliestDateAvailable();
            XMLGregorianCalendar rhsEarliestDateAvailable;
            rhsEarliestDateAvailable = that.getEarliestDateAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "earliestDateAvailable", lhsEarliestDateAvailable), LocatorUtils.property(thatLocator, "earliestDateAvailable", rhsEarliestDateAvailable), lhsEarliestDateAvailable, rhsEarliestDateAvailable)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLatestDateCovered;
            lhsLatestDateCovered = this.getLatestDateCovered();
            XMLGregorianCalendar rhsLatestDateCovered;
            rhsLatestDateCovered = that.getLatestDateCovered();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestDateCovered", lhsLatestDateCovered), LocatorUtils.property(thatLocator, "latestDateCovered", rhsLatestDateCovered), lhsLatestDateCovered, rhsLatestDateCovered)) {
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
            List<DeletedRecord> theDeletedRecords;
            theDeletedRecords = (((this.deletedRecords!= null)&&(!this.deletedRecords.isEmpty()))?this.getDeletedRecords():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deletedRecords", theDeletedRecords), currentHashCode, theDeletedRecords);
        }
        {
            XMLGregorianCalendar theEarliestDateAvailable;
            theEarliestDateAvailable = this.getEarliestDateAvailable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "earliestDateAvailable", theEarliestDateAvailable), currentHashCode, theEarliestDateAvailable);
        }
        {
            XMLGregorianCalendar theLatestDateCovered;
            theLatestDateCovered = this.getLatestDateCovered();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestDateCovered", theLatestDateCovered), currentHashCode, theLatestDateCovered);
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
            List<DeletedRecord> theDeletedRecords;
            theDeletedRecords = (((this.deletedRecords!= null)&&(!this.deletedRecords.isEmpty()))?this.getDeletedRecords():null);
            strategy.appendField(locator, this, "deletedRecords", buffer, theDeletedRecords);
        }
        {
            XMLGregorianCalendar theEarliestDateAvailable;
            theEarliestDateAvailable = this.getEarliestDateAvailable();
            strategy.appendField(locator, this, "earliestDateAvailable", buffer, theEarliestDateAvailable);
        }
        {
            XMLGregorianCalendar theLatestDateCovered;
            theLatestDateCovered = this.getLatestDateCovered();
            strategy.appendField(locator, this, "latestDateCovered", buffer, theLatestDateCovered);
        }
        return buffer;
    }

}
