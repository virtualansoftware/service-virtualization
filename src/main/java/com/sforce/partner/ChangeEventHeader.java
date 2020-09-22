
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ChangeEventHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeEventHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="commitTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="commitNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="commitUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="diffFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="changeType" type="{urn:partner.soap.sforce.com}changeEventType"/&gt;
 *         &lt;element name="changeOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nulledFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="changedFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeEventHeader", propOrder = {
    "entityName",
    "recordIds",
    "commitTimestamp",
    "commitNumber",
    "commitUser",
    "diffFields",
    "changeType",
    "changeOrigin",
    "transactionKey",
    "sequenceNumber",
    "nulledFields",
    "changedFields"
})
public class ChangeEventHeader
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String entityName;
    @XmlElement(required = true)
    protected List<String> recordIds;
    protected long commitTimestamp;
    protected long commitNumber;
    @XmlElement(required = true)
    protected String commitUser;
    protected List<String> diffFields;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ChangeEventType changeType;
    @XmlElement(required = true)
    protected String changeOrigin;
    @XmlElement(required = true)
    protected String transactionKey;
    protected int sequenceNumber;
    protected List<String> nulledFields;
    protected List<String> changedFields;

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
     * Gets the value of the recordIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecordIds() {
        if (recordIds == null) {
            recordIds = new ArrayList<String>();
        }
        return this.recordIds;
    }

    /**
     * Gets the value of the commitTimestamp property.
     * 
     */
    public long getCommitTimestamp() {
        return commitTimestamp;
    }

    /**
     * Sets the value of the commitTimestamp property.
     * 
     */
    public void setCommitTimestamp(long value) {
        this.commitTimestamp = value;
    }

    /**
     * Gets the value of the commitNumber property.
     * 
     */
    public long getCommitNumber() {
        return commitNumber;
    }

    /**
     * Sets the value of the commitNumber property.
     * 
     */
    public void setCommitNumber(long value) {
        this.commitNumber = value;
    }

    /**
     * Gets the value of the commitUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitUser() {
        return commitUser;
    }

    /**
     * Sets the value of the commitUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitUser(String value) {
        this.commitUser = value;
    }

    /**
     * Gets the value of the diffFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diffFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiffFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDiffFields() {
        if (diffFields == null) {
            diffFields = new ArrayList<String>();
        }
        return this.diffFields;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeEventType }
     *     
     */
    public ChangeEventType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeEventType }
     *     
     */
    public void setChangeType(ChangeEventType value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the changeOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeOrigin() {
        return changeOrigin;
    }

    /**
     * Sets the value of the changeOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeOrigin(String value) {
        this.changeOrigin = value;
    }

    /**
     * Gets the value of the transactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionKey() {
        return transactionKey;
    }

    /**
     * Sets the value of the transactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionKey(String value) {
        this.transactionKey = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the nulledFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nulledFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNulledFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNulledFields() {
        if (nulledFields == null) {
            nulledFields = new ArrayList<String>();
        }
        return this.nulledFields;
    }

    /**
     * Gets the value of the changedFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChangedFields() {
        if (changedFields == null) {
            changedFields = new ArrayList<String>();
        }
        return this.changedFields;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ChangeEventHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ChangeEventHeader that = ((ChangeEventHeader) object);
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
            List<String> lhsRecordIds;
            lhsRecordIds = (((this.recordIds!= null)&&(!this.recordIds.isEmpty()))?this.getRecordIds():null);
            List<String> rhsRecordIds;
            rhsRecordIds = (((that.recordIds!= null)&&(!that.recordIds.isEmpty()))?that.getRecordIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordIds", lhsRecordIds), LocatorUtils.property(thatLocator, "recordIds", rhsRecordIds), lhsRecordIds, rhsRecordIds)) {
                return false;
            }
        }
        {
            long lhsCommitTimestamp;
            lhsCommitTimestamp = (true?this.getCommitTimestamp(): 0L);
            long rhsCommitTimestamp;
            rhsCommitTimestamp = (true?that.getCommitTimestamp(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commitTimestamp", lhsCommitTimestamp), LocatorUtils.property(thatLocator, "commitTimestamp", rhsCommitTimestamp), lhsCommitTimestamp, rhsCommitTimestamp)) {
                return false;
            }
        }
        {
            long lhsCommitNumber;
            lhsCommitNumber = (true?this.getCommitNumber(): 0L);
            long rhsCommitNumber;
            rhsCommitNumber = (true?that.getCommitNumber(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commitNumber", lhsCommitNumber), LocatorUtils.property(thatLocator, "commitNumber", rhsCommitNumber), lhsCommitNumber, rhsCommitNumber)) {
                return false;
            }
        }
        {
            String lhsCommitUser;
            lhsCommitUser = this.getCommitUser();
            String rhsCommitUser;
            rhsCommitUser = that.getCommitUser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commitUser", lhsCommitUser), LocatorUtils.property(thatLocator, "commitUser", rhsCommitUser), lhsCommitUser, rhsCommitUser)) {
                return false;
            }
        }
        {
            List<String> lhsDiffFields;
            lhsDiffFields = (((this.diffFields!= null)&&(!this.diffFields.isEmpty()))?this.getDiffFields():null);
            List<String> rhsDiffFields;
            rhsDiffFields = (((that.diffFields!= null)&&(!that.diffFields.isEmpty()))?that.getDiffFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "diffFields", lhsDiffFields), LocatorUtils.property(thatLocator, "diffFields", rhsDiffFields), lhsDiffFields, rhsDiffFields)) {
                return false;
            }
        }
        {
            ChangeEventType lhsChangeType;
            lhsChangeType = this.getChangeType();
            ChangeEventType rhsChangeType;
            rhsChangeType = that.getChangeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeType", lhsChangeType), LocatorUtils.property(thatLocator, "changeType", rhsChangeType), lhsChangeType, rhsChangeType)) {
                return false;
            }
        }
        {
            String lhsChangeOrigin;
            lhsChangeOrigin = this.getChangeOrigin();
            String rhsChangeOrigin;
            rhsChangeOrigin = that.getChangeOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeOrigin", lhsChangeOrigin), LocatorUtils.property(thatLocator, "changeOrigin", rhsChangeOrigin), lhsChangeOrigin, rhsChangeOrigin)) {
                return false;
            }
        }
        {
            String lhsTransactionKey;
            lhsTransactionKey = this.getTransactionKey();
            String rhsTransactionKey;
            rhsTransactionKey = that.getTransactionKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionKey", lhsTransactionKey), LocatorUtils.property(thatLocator, "transactionKey", rhsTransactionKey), lhsTransactionKey, rhsTransactionKey)) {
                return false;
            }
        }
        {
            int lhsSequenceNumber;
            lhsSequenceNumber = (true?this.getSequenceNumber(): 0);
            int rhsSequenceNumber;
            rhsSequenceNumber = (true?that.getSequenceNumber(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumber", lhsSequenceNumber), LocatorUtils.property(thatLocator, "sequenceNumber", rhsSequenceNumber), lhsSequenceNumber, rhsSequenceNumber)) {
                return false;
            }
        }
        {
            List<String> lhsNulledFields;
            lhsNulledFields = (((this.nulledFields!= null)&&(!this.nulledFields.isEmpty()))?this.getNulledFields():null);
            List<String> rhsNulledFields;
            rhsNulledFields = (((that.nulledFields!= null)&&(!that.nulledFields.isEmpty()))?that.getNulledFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nulledFields", lhsNulledFields), LocatorUtils.property(thatLocator, "nulledFields", rhsNulledFields), lhsNulledFields, rhsNulledFields)) {
                return false;
            }
        }
        {
            List<String> lhsChangedFields;
            lhsChangedFields = (((this.changedFields!= null)&&(!this.changedFields.isEmpty()))?this.getChangedFields():null);
            List<String> rhsChangedFields;
            rhsChangedFields = (((that.changedFields!= null)&&(!that.changedFields.isEmpty()))?that.getChangedFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changedFields", lhsChangedFields), LocatorUtils.property(thatLocator, "changedFields", rhsChangedFields), lhsChangedFields, rhsChangedFields)) {
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
            List<String> theRecordIds;
            theRecordIds = (((this.recordIds!= null)&&(!this.recordIds.isEmpty()))?this.getRecordIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordIds", theRecordIds), currentHashCode, theRecordIds);
        }
        {
            long theCommitTimestamp;
            theCommitTimestamp = (true?this.getCommitTimestamp(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commitTimestamp", theCommitTimestamp), currentHashCode, theCommitTimestamp);
        }
        {
            long theCommitNumber;
            theCommitNumber = (true?this.getCommitNumber(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commitNumber", theCommitNumber), currentHashCode, theCommitNumber);
        }
        {
            String theCommitUser;
            theCommitUser = this.getCommitUser();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commitUser", theCommitUser), currentHashCode, theCommitUser);
        }
        {
            List<String> theDiffFields;
            theDiffFields = (((this.diffFields!= null)&&(!this.diffFields.isEmpty()))?this.getDiffFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "diffFields", theDiffFields), currentHashCode, theDiffFields);
        }
        {
            ChangeEventType theChangeType;
            theChangeType = this.getChangeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeType", theChangeType), currentHashCode, theChangeType);
        }
        {
            String theChangeOrigin;
            theChangeOrigin = this.getChangeOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeOrigin", theChangeOrigin), currentHashCode, theChangeOrigin);
        }
        {
            String theTransactionKey;
            theTransactionKey = this.getTransactionKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionKey", theTransactionKey), currentHashCode, theTransactionKey);
        }
        {
            int theSequenceNumber;
            theSequenceNumber = (true?this.getSequenceNumber(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumber", theSequenceNumber), currentHashCode, theSequenceNumber);
        }
        {
            List<String> theNulledFields;
            theNulledFields = (((this.nulledFields!= null)&&(!this.nulledFields.isEmpty()))?this.getNulledFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nulledFields", theNulledFields), currentHashCode, theNulledFields);
        }
        {
            List<String> theChangedFields;
            theChangedFields = (((this.changedFields!= null)&&(!this.changedFields.isEmpty()))?this.getChangedFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changedFields", theChangedFields), currentHashCode, theChangedFields);
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
            List<String> theRecordIds;
            theRecordIds = (((this.recordIds!= null)&&(!this.recordIds.isEmpty()))?this.getRecordIds():null);
            strategy.appendField(locator, this, "recordIds", buffer, theRecordIds);
        }
        {
            long theCommitTimestamp;
            theCommitTimestamp = (true?this.getCommitTimestamp(): 0L);
            strategy.appendField(locator, this, "commitTimestamp", buffer, theCommitTimestamp);
        }
        {
            long theCommitNumber;
            theCommitNumber = (true?this.getCommitNumber(): 0L);
            strategy.appendField(locator, this, "commitNumber", buffer, theCommitNumber);
        }
        {
            String theCommitUser;
            theCommitUser = this.getCommitUser();
            strategy.appendField(locator, this, "commitUser", buffer, theCommitUser);
        }
        {
            List<String> theDiffFields;
            theDiffFields = (((this.diffFields!= null)&&(!this.diffFields.isEmpty()))?this.getDiffFields():null);
            strategy.appendField(locator, this, "diffFields", buffer, theDiffFields);
        }
        {
            ChangeEventType theChangeType;
            theChangeType = this.getChangeType();
            strategy.appendField(locator, this, "changeType", buffer, theChangeType);
        }
        {
            String theChangeOrigin;
            theChangeOrigin = this.getChangeOrigin();
            strategy.appendField(locator, this, "changeOrigin", buffer, theChangeOrigin);
        }
        {
            String theTransactionKey;
            theTransactionKey = this.getTransactionKey();
            strategy.appendField(locator, this, "transactionKey", buffer, theTransactionKey);
        }
        {
            int theSequenceNumber;
            theSequenceNumber = (true?this.getSequenceNumber(): 0);
            strategy.appendField(locator, this, "sequenceNumber", buffer, theSequenceNumber);
        }
        {
            List<String> theNulledFields;
            theNulledFields = (((this.nulledFields!= null)&&(!this.nulledFields.isEmpty()))?this.getNulledFields():null);
            strategy.appendField(locator, this, "nulledFields", buffer, theNulledFields);
        }
        {
            List<String> theChangedFields;
            theChangedFields = (((this.changedFields!= null)&&(!this.changedFields.isEmpty()))?this.getChangedFields():null);
            strategy.appendField(locator, this, "changedFields", buffer, theChangedFields);
        }
        return buffer;
    }

}
