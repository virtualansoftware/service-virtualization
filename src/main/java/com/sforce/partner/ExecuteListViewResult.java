
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
 * <p>Java class for ExecuteListViewResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteListViewResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="columns" type="{urn:partner.soap.sforce.com}ListViewColumn" maxOccurs="unbounded"/&gt;
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="done" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="records" type="{urn:partner.soap.sforce.com}ListViewRecord" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ExecuteListViewResult", propOrder = {
    "columns",
    "developerName",
    "done",
    "id",
    "label",
    "records",
    "size"
})
public class ExecuteListViewResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<ListViewColumn> columns;
    @XmlElement(required = true)
    protected String developerName;
    protected boolean done;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected List<ListViewRecord> records;
    protected int size;

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListViewColumn }
     * 
     * 
     */
    public List<ListViewColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<ListViewColumn>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

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
     * {@link ListViewRecord }
     * 
     * 
     */
    public List<ListViewRecord> getRecords() {
        if (records == null) {
            records = new ArrayList<ListViewRecord>();
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
        if (!(object instanceof ExecuteListViewResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExecuteListViewResult that = ((ExecuteListViewResult) object);
        {
            List<ListViewColumn> lhsColumns;
            lhsColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            List<ListViewColumn> rhsColumns;
            rhsColumns = (((that.columns!= null)&&(!that.columns.isEmpty()))?that.getColumns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "columns", lhsColumns), LocatorUtils.property(thatLocator, "columns", rhsColumns), lhsColumns, rhsColumns)) {
                return false;
            }
        }
        {
            String lhsDeveloperName;
            lhsDeveloperName = this.getDeveloperName();
            String rhsDeveloperName;
            rhsDeveloperName = that.getDeveloperName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "developerName", lhsDeveloperName), LocatorUtils.property(thatLocator, "developerName", rhsDeveloperName), lhsDeveloperName, rhsDeveloperName)) {
                return false;
            }
        }
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
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            List<ListViewRecord> lhsRecords;
            lhsRecords = (((this.records!= null)&&(!this.records.isEmpty()))?this.getRecords():null);
            List<ListViewRecord> rhsRecords;
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
            List<ListViewColumn> theColumns;
            theColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "columns", theColumns), currentHashCode, theColumns);
        }
        {
            String theDeveloperName;
            theDeveloperName = this.getDeveloperName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "developerName", theDeveloperName), currentHashCode, theDeveloperName);
        }
        {
            boolean theDone;
            theDone = (true?this.isDone():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "done", theDone), currentHashCode, theDone);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            List<ListViewRecord> theRecords;
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
            List<ListViewColumn> theColumns;
            theColumns = (((this.columns!= null)&&(!this.columns.isEmpty()))?this.getColumns():null);
            strategy.appendField(locator, this, "columns", buffer, theColumns);
        }
        {
            String theDeveloperName;
            theDeveloperName = this.getDeveloperName();
            strategy.appendField(locator, this, "developerName", buffer, theDeveloperName);
        }
        {
            boolean theDone;
            theDone = (true?this.isDone():false);
            strategy.appendField(locator, this, "done", buffer, theDone);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            List<ListViewRecord> theRecords;
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
