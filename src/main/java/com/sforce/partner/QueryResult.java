
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
 * <p>Java class for QueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="done" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="queryLocator" type="{urn:partner.soap.sforce.com}QueryLocator"/&gt;
 *         &lt;element name="records" type="{urn:sobject.partner.soap.sforce.com}sObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
    "done",
    "queryLocator",
    "records",
    "size"
})
public class QueryResult
    implements Equals, HashCode, ToString
{

    protected boolean done;
    @XmlElement(required = true, nillable = true)
    protected String queryLocator;
    @XmlElement(nillable = true)
    protected List<SObject> records;
    protected int size;

    /**
     * Gets the value of the done property.
     * 
     */
    public boolean isDone() {
        return done;
    }

    /**
     * Sets the value of the done property.
     * 
     */
    public void setDone(boolean value) {
        this.done = value;
    }

    /**
     * Gets the value of the queryLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryLocator() {
        return queryLocator;
    }

    /**
     * Sets the value of the queryLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryLocator(String value) {
        this.queryLocator = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the records property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SObject }
     * 
     * 
     */
    public List<SObject> getRecords() {
        if (records == null) {
            records = new ArrayList<SObject>();
        }
        return this.records;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QueryResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final QueryResult that = ((QueryResult) object);
        {
            boolean lhsDone;
            lhsDone = (true?this.isDone():false);
            boolean rhsDone;
            rhsDone = (true?that.isDone():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "done", lhsDone), LocatorUtils.property(thatLocator, "done", rhsDone), lhsDone, rhsDone)) {
                return false;
            }
        }
        {
            String lhsQueryLocator;
            lhsQueryLocator = this.getQueryLocator();
            String rhsQueryLocator;
            rhsQueryLocator = that.getQueryLocator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryLocator", lhsQueryLocator), LocatorUtils.property(thatLocator, "queryLocator", rhsQueryLocator), lhsQueryLocator, rhsQueryLocator)) {
                return false;
            }
        }
        {
            List<SObject> lhsRecords;
            lhsRecords = (((this.records!= null)&&(!this.records.isEmpty()))?this.getRecords():null);
            List<SObject> rhsRecords;
            rhsRecords = (((that.records!= null)&&(!that.records.isEmpty()))?that.getRecords():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "records", lhsRecords), LocatorUtils.property(thatLocator, "records", rhsRecords), lhsRecords, rhsRecords)) {
                return false;
            }
        }
        {
            int lhsSize;
            lhsSize = (true?this.getSize(): 0);
            int rhsSize;
            rhsSize = (true?that.getSize(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
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
            boolean theDone;
            theDone = (true?this.isDone():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "done", theDone), currentHashCode, theDone);
        }
        {
            String theQueryLocator;
            theQueryLocator = this.getQueryLocator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryLocator", theQueryLocator), currentHashCode, theQueryLocator);
        }
        {
            List<SObject> theRecords;
            theRecords = (((this.records!= null)&&(!this.records.isEmpty()))?this.getRecords():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "records", theRecords), currentHashCode, theRecords);
        }
        {
            int theSize;
            theSize = (true?this.getSize(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "size", theSize), currentHashCode, theSize);
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
            boolean theDone;
            theDone = (true?this.isDone():false);
            strategy.appendField(locator, this, "done", buffer, theDone);
        }
        {
            String theQueryLocator;
            theQueryLocator = this.getQueryLocator();
            strategy.appendField(locator, this, "queryLocator", buffer, theQueryLocator);
        }
        {
            List<SObject> theRecords;
            theRecords = (((this.records!= null)&&(!this.records.isEmpty()))?this.getRecords():null);
            strategy.appendField(locator, this, "records", buffer, theRecords);
        }
        {
            int theSize;
            theSize = (true?this.getSize(): 0);
            strategy.appendField(locator, this, "size", buffer, theSize);
        }
        return buffer;
    }

}
