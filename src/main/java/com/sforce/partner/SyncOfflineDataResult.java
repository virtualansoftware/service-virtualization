
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
 * <p>Java class for SyncOfflineDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncOfflineDataResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lastConfigChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="lastFullQuery" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="lastQuery" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="lastReset" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="removed" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="updates" type="{urn:partner.soap.sforce.com}QueryResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncOfflineDataResult", propOrder = {
    "lastConfigChange",
    "lastFullQuery",
    "lastQuery",
    "lastReset",
    "removeds",
    "timestamp",
    "token",
    "updates"
})
public class SyncOfflineDataResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastConfigChange;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFullQuery;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastQuery;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReset;
    @XmlElement(name = "removed")
    protected List<String> removeds;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected QueryResult updates;

    /**
     * Gets the value of the lastConfigChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastConfigChange() {
        return lastConfigChange;
    }

    /**
     * Sets the value of the lastConfigChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastConfigChange(XMLGregorianCalendar value) {
        this.lastConfigChange = value;
    }

    /**
     * Gets the value of the lastFullQuery property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFullQuery() {
        return lastFullQuery;
    }

    /**
     * Sets the value of the lastFullQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFullQuery(XMLGregorianCalendar value) {
        this.lastFullQuery = value;
    }

    /**
     * Gets the value of the lastQuery property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastQuery() {
        return lastQuery;
    }

    /**
     * Sets the value of the lastQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastQuery(XMLGregorianCalendar value) {
        this.lastQuery = value;
    }

    /**
     * Gets the value of the lastReset property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReset() {
        return lastReset;
    }

    /**
     * Sets the value of the lastReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReset(XMLGregorianCalendar value) {
        this.lastReset = value;
    }

    /**
     * Gets the value of the removeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoveds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoveds() {
        if (removeds == null) {
            removeds = new ArrayList<String>();
        }
        return this.removeds;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the updates property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getUpdates() {
        return updates;
    }

    /**
     * Sets the value of the updates property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setUpdates(QueryResult value) {
        this.updates = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SyncOfflineDataResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SyncOfflineDataResult that = ((SyncOfflineDataResult) object);
        {
            XMLGregorianCalendar lhsLastConfigChange;
            lhsLastConfigChange = this.getLastConfigChange();
            XMLGregorianCalendar rhsLastConfigChange;
            rhsLastConfigChange = that.getLastConfigChange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastConfigChange", lhsLastConfigChange), LocatorUtils.property(thatLocator, "lastConfigChange", rhsLastConfigChange), lhsLastConfigChange, rhsLastConfigChange)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLastFullQuery;
            lhsLastFullQuery = this.getLastFullQuery();
            XMLGregorianCalendar rhsLastFullQuery;
            rhsLastFullQuery = that.getLastFullQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastFullQuery", lhsLastFullQuery), LocatorUtils.property(thatLocator, "lastFullQuery", rhsLastFullQuery), lhsLastFullQuery, rhsLastFullQuery)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLastQuery;
            lhsLastQuery = this.getLastQuery();
            XMLGregorianCalendar rhsLastQuery;
            rhsLastQuery = that.getLastQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastQuery", lhsLastQuery), LocatorUtils.property(thatLocator, "lastQuery", rhsLastQuery), lhsLastQuery, rhsLastQuery)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLastReset;
            lhsLastReset = this.getLastReset();
            XMLGregorianCalendar rhsLastReset;
            rhsLastReset = that.getLastReset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastReset", lhsLastReset), LocatorUtils.property(thatLocator, "lastReset", rhsLastReset), lhsLastReset, rhsLastReset)) {
                return false;
            }
        }
        {
            List<String> lhsRemoveds;
            lhsRemoveds = (((this.removeds!= null)&&(!this.removeds.isEmpty()))?this.getRemoveds():null);
            List<String> rhsRemoveds;
            rhsRemoveds = (((that.removeds!= null)&&(!that.removeds.isEmpty()))?that.getRemoveds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "removeds", lhsRemoveds), LocatorUtils.property(thatLocator, "removeds", rhsRemoveds), lhsRemoveds, rhsRemoveds)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTimestamp;
            lhsTimestamp = this.getTimestamp();
            XMLGregorianCalendar rhsTimestamp;
            rhsTimestamp = that.getTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timestamp", lhsTimestamp), LocatorUtils.property(thatLocator, "timestamp", rhsTimestamp), lhsTimestamp, rhsTimestamp)) {
                return false;
            }
        }
        {
            String lhsToken;
            lhsToken = this.getToken();
            String rhsToken;
            rhsToken = that.getToken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "token", lhsToken), LocatorUtils.property(thatLocator, "token", rhsToken), lhsToken, rhsToken)) {
                return false;
            }
        }
        {
            QueryResult lhsUpdates;
            lhsUpdates = this.getUpdates();
            QueryResult rhsUpdates;
            rhsUpdates = that.getUpdates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updates", lhsUpdates), LocatorUtils.property(thatLocator, "updates", rhsUpdates), lhsUpdates, rhsUpdates)) {
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
            XMLGregorianCalendar theLastConfigChange;
            theLastConfigChange = this.getLastConfigChange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastConfigChange", theLastConfigChange), currentHashCode, theLastConfigChange);
        }
        {
            XMLGregorianCalendar theLastFullQuery;
            theLastFullQuery = this.getLastFullQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastFullQuery", theLastFullQuery), currentHashCode, theLastFullQuery);
        }
        {
            XMLGregorianCalendar theLastQuery;
            theLastQuery = this.getLastQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastQuery", theLastQuery), currentHashCode, theLastQuery);
        }
        {
            XMLGregorianCalendar theLastReset;
            theLastReset = this.getLastReset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastReset", theLastReset), currentHashCode, theLastReset);
        }
        {
            List<String> theRemoveds;
            theRemoveds = (((this.removeds!= null)&&(!this.removeds.isEmpty()))?this.getRemoveds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "removeds", theRemoveds), currentHashCode, theRemoveds);
        }
        {
            XMLGregorianCalendar theTimestamp;
            theTimestamp = this.getTimestamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timestamp", theTimestamp), currentHashCode, theTimestamp);
        }
        {
            String theToken;
            theToken = this.getToken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "token", theToken), currentHashCode, theToken);
        }
        {
            QueryResult theUpdates;
            theUpdates = this.getUpdates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updates", theUpdates), currentHashCode, theUpdates);
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
            XMLGregorianCalendar theLastConfigChange;
            theLastConfigChange = this.getLastConfigChange();
            strategy.appendField(locator, this, "lastConfigChange", buffer, theLastConfigChange);
        }
        {
            XMLGregorianCalendar theLastFullQuery;
            theLastFullQuery = this.getLastFullQuery();
            strategy.appendField(locator, this, "lastFullQuery", buffer, theLastFullQuery);
        }
        {
            XMLGregorianCalendar theLastQuery;
            theLastQuery = this.getLastQuery();
            strategy.appendField(locator, this, "lastQuery", buffer, theLastQuery);
        }
        {
            XMLGregorianCalendar theLastReset;
            theLastReset = this.getLastReset();
            strategy.appendField(locator, this, "lastReset", buffer, theLastReset);
        }
        {
            List<String> theRemoveds;
            theRemoveds = (((this.removeds!= null)&&(!this.removeds.isEmpty()))?this.getRemoveds():null);
            strategy.appendField(locator, this, "removeds", buffer, theRemoveds);
        }
        {
            XMLGregorianCalendar theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp);
        }
        {
            String theToken;
            theToken = this.getToken();
            strategy.appendField(locator, this, "token", buffer, theToken);
        }
        {
            QueryResult theUpdates;
            theUpdates = this.getUpdates();
            strategy.appendField(locator, this, "updates", buffer, theUpdates);
        }
        return buffer;
    }

}
