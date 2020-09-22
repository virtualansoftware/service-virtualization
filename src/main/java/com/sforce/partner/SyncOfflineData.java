
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
 *         &lt;element name="reset" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="userRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="syncStateId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="syncFull" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="skipNewsFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idsToSpider" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entitiesToSync" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "reset",
    "userRequested",
    "syncStateId",
    "syncFull",
    "skipNewsFeeds",
    "idsToSpiders",
    "entitiesToSyncs"
})
@XmlRootElement(name = "syncOfflineData")
public class SyncOfflineData
    implements Equals, HashCode, ToString
{

    protected boolean reset;
    protected boolean userRequested;
    @XmlElement(required = true)
    protected String syncStateId;
    protected boolean syncFull;
    protected boolean skipNewsFeeds;
    @XmlElement(name = "idsToSpider", nillable = true)
    protected List<String> idsToSpiders;
    @XmlElement(name = "entitiesToSync", nillable = true)
    protected List<String> entitiesToSyncs;

    /**
     * Gets the value of the reset property.
     * 
     */
    public boolean isReset() {
        return reset;
    }

    /**
     * Sets the value of the reset property.
     * 
     */
    public void setReset(boolean value) {
        this.reset = value;
    }

    /**
     * Gets the value of the userRequested property.
     * 
     */
    public boolean isUserRequested() {
        return userRequested;
    }

    /**
     * Sets the value of the userRequested property.
     * 
     */
    public void setUserRequested(boolean value) {
        this.userRequested = value;
    }

    /**
     * Gets the value of the syncStateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncStateId() {
        return syncStateId;
    }

    /**
     * Sets the value of the syncStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncStateId(String value) {
        this.syncStateId = value;
    }

    /**
     * Gets the value of the syncFull property.
     * 
     */
    public boolean isSyncFull() {
        return syncFull;
    }

    /**
     * Sets the value of the syncFull property.
     * 
     */
    public void setSyncFull(boolean value) {
        this.syncFull = value;
    }

    /**
     * Gets the value of the skipNewsFeeds property.
     * 
     */
    public boolean isSkipNewsFeeds() {
        return skipNewsFeeds;
    }

    /**
     * Sets the value of the skipNewsFeeds property.
     * 
     */
    public void setSkipNewsFeeds(boolean value) {
        this.skipNewsFeeds = value;
    }

    /**
     * Gets the value of the idsToSpiders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idsToSpiders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdsToSpiders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdsToSpiders() {
        if (idsToSpiders == null) {
            idsToSpiders = new ArrayList<String>();
        }
        return this.idsToSpiders;
    }

    /**
     * Gets the value of the entitiesToSyncs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitiesToSyncs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitiesToSyncs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEntitiesToSyncs() {
        if (entitiesToSyncs == null) {
            entitiesToSyncs = new ArrayList<String>();
        }
        return this.entitiesToSyncs;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SyncOfflineData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SyncOfflineData that = ((SyncOfflineData) object);
        {
            boolean lhsReset;
            lhsReset = (true?this.isReset():false);
            boolean rhsReset;
            rhsReset = (true?that.isReset():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reset", lhsReset), LocatorUtils.property(thatLocator, "reset", rhsReset), lhsReset, rhsReset)) {
                return false;
            }
        }
        {
            boolean lhsUserRequested;
            lhsUserRequested = (true?this.isUserRequested():false);
            boolean rhsUserRequested;
            rhsUserRequested = (true?that.isUserRequested():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userRequested", lhsUserRequested), LocatorUtils.property(thatLocator, "userRequested", rhsUserRequested), lhsUserRequested, rhsUserRequested)) {
                return false;
            }
        }
        {
            String lhsSyncStateId;
            lhsSyncStateId = this.getSyncStateId();
            String rhsSyncStateId;
            rhsSyncStateId = that.getSyncStateId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncStateId", lhsSyncStateId), LocatorUtils.property(thatLocator, "syncStateId", rhsSyncStateId), lhsSyncStateId, rhsSyncStateId)) {
                return false;
            }
        }
        {
            boolean lhsSyncFull;
            lhsSyncFull = (true?this.isSyncFull():false);
            boolean rhsSyncFull;
            rhsSyncFull = (true?that.isSyncFull():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncFull", lhsSyncFull), LocatorUtils.property(thatLocator, "syncFull", rhsSyncFull), lhsSyncFull, rhsSyncFull)) {
                return false;
            }
        }
        {
            boolean lhsSkipNewsFeeds;
            lhsSkipNewsFeeds = (true?this.isSkipNewsFeeds():false);
            boolean rhsSkipNewsFeeds;
            rhsSkipNewsFeeds = (true?that.isSkipNewsFeeds():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "skipNewsFeeds", lhsSkipNewsFeeds), LocatorUtils.property(thatLocator, "skipNewsFeeds", rhsSkipNewsFeeds), lhsSkipNewsFeeds, rhsSkipNewsFeeds)) {
                return false;
            }
        }
        {
            List<String> lhsIdsToSpiders;
            lhsIdsToSpiders = (((this.idsToSpiders!= null)&&(!this.idsToSpiders.isEmpty()))?this.getIdsToSpiders():null);
            List<String> rhsIdsToSpiders;
            rhsIdsToSpiders = (((that.idsToSpiders!= null)&&(!that.idsToSpiders.isEmpty()))?that.getIdsToSpiders():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "idsToSpiders", lhsIdsToSpiders), LocatorUtils.property(thatLocator, "idsToSpiders", rhsIdsToSpiders), lhsIdsToSpiders, rhsIdsToSpiders)) {
                return false;
            }
        }
        {
            List<String> lhsEntitiesToSyncs;
            lhsEntitiesToSyncs = (((this.entitiesToSyncs!= null)&&(!this.entitiesToSyncs.isEmpty()))?this.getEntitiesToSyncs():null);
            List<String> rhsEntitiesToSyncs;
            rhsEntitiesToSyncs = (((that.entitiesToSyncs!= null)&&(!that.entitiesToSyncs.isEmpty()))?that.getEntitiesToSyncs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entitiesToSyncs", lhsEntitiesToSyncs), LocatorUtils.property(thatLocator, "entitiesToSyncs", rhsEntitiesToSyncs), lhsEntitiesToSyncs, rhsEntitiesToSyncs)) {
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
            boolean theReset;
            theReset = (true?this.isReset():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reset", theReset), currentHashCode, theReset);
        }
        {
            boolean theUserRequested;
            theUserRequested = (true?this.isUserRequested():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userRequested", theUserRequested), currentHashCode, theUserRequested);
        }
        {
            String theSyncStateId;
            theSyncStateId = this.getSyncStateId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncStateId", theSyncStateId), currentHashCode, theSyncStateId);
        }
        {
            boolean theSyncFull;
            theSyncFull = (true?this.isSyncFull():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncFull", theSyncFull), currentHashCode, theSyncFull);
        }
        {
            boolean theSkipNewsFeeds;
            theSkipNewsFeeds = (true?this.isSkipNewsFeeds():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "skipNewsFeeds", theSkipNewsFeeds), currentHashCode, theSkipNewsFeeds);
        }
        {
            List<String> theIdsToSpiders;
            theIdsToSpiders = (((this.idsToSpiders!= null)&&(!this.idsToSpiders.isEmpty()))?this.getIdsToSpiders():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idsToSpiders", theIdsToSpiders), currentHashCode, theIdsToSpiders);
        }
        {
            List<String> theEntitiesToSyncs;
            theEntitiesToSyncs = (((this.entitiesToSyncs!= null)&&(!this.entitiesToSyncs.isEmpty()))?this.getEntitiesToSyncs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entitiesToSyncs", theEntitiesToSyncs), currentHashCode, theEntitiesToSyncs);
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
            boolean theReset;
            theReset = (true?this.isReset():false);
            strategy.appendField(locator, this, "reset", buffer, theReset);
        }
        {
            boolean theUserRequested;
            theUserRequested = (true?this.isUserRequested():false);
            strategy.appendField(locator, this, "userRequested", buffer, theUserRequested);
        }
        {
            String theSyncStateId;
            theSyncStateId = this.getSyncStateId();
            strategy.appendField(locator, this, "syncStateId", buffer, theSyncStateId);
        }
        {
            boolean theSyncFull;
            theSyncFull = (true?this.isSyncFull():false);
            strategy.appendField(locator, this, "syncFull", buffer, theSyncFull);
        }
        {
            boolean theSkipNewsFeeds;
            theSkipNewsFeeds = (true?this.isSkipNewsFeeds():false);
            strategy.appendField(locator, this, "skipNewsFeeds", buffer, theSkipNewsFeeds);
        }
        {
            List<String> theIdsToSpiders;
            theIdsToSpiders = (((this.idsToSpiders!= null)&&(!this.idsToSpiders.isEmpty()))?this.getIdsToSpiders():null);
            strategy.appendField(locator, this, "idsToSpiders", buffer, theIdsToSpiders);
        }
        {
            List<String> theEntitiesToSyncs;
            theEntitiesToSyncs = (((this.entitiesToSyncs!= null)&&(!this.entitiesToSyncs.isEmpty()))?this.getEntitiesToSyncs():null);
            strategy.appendField(locator, this, "entitiesToSyncs", buffer, theEntitiesToSyncs);
        }
        return buffer;
    }

}
