
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
 * <p>Java class for SnapshotResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SnapshotResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="add" type="{urn:partner.soap.sforce.com}SnapshotItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fullSnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="id" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="locator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remove" type="{urn:partner.soap.sforce.com}SnapshotItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotResult", propOrder = {
    "adds",
    "fullSnapshot",
    "id",
    "locator",
    "removes"
})
public class SnapshotResult
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "add")
    protected List<SnapshotItem> adds;
    protected boolean fullSnapshot;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String locator;
    @XmlElement(name = "remove")
    protected List<SnapshotItem> removes;

    /**
     * Gets the value of the adds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SnapshotItem }
     * 
     * 
     */
    public List<SnapshotItem> getAdds() {
        if (adds == null) {
            adds = new ArrayList<SnapshotItem>();
        }
        return this.adds;
    }

    /**
     * Gets the value of the fullSnapshot property.
     * 
     */
    public boolean isFullSnapshot() {
        return fullSnapshot;
    }

    /**
     * Sets the value of the fullSnapshot property.
     * 
     */
    public void setFullSnapshot(boolean value) {
        this.fullSnapshot = value;
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
     * Gets the value of the locator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Sets the value of the locator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocator(String value) {
        this.locator = value;
    }

    /**
     * Gets the value of the removes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SnapshotItem }
     * 
     * 
     */
    public List<SnapshotItem> getRemoves() {
        if (removes == null) {
            removes = new ArrayList<SnapshotItem>();
        }
        return this.removes;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SnapshotResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SnapshotResult that = ((SnapshotResult) object);
        {
            List<SnapshotItem> lhsAdds;
            lhsAdds = (((this.adds!= null)&&(!this.adds.isEmpty()))?this.getAdds():null);
            List<SnapshotItem> rhsAdds;
            rhsAdds = (((that.adds!= null)&&(!that.adds.isEmpty()))?that.getAdds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adds", lhsAdds), LocatorUtils.property(thatLocator, "adds", rhsAdds), lhsAdds, rhsAdds)) {
                return false;
            }
        }
        {
            boolean lhsFullSnapshot;
            lhsFullSnapshot = (true?this.isFullSnapshot():false);
            boolean rhsFullSnapshot;
            rhsFullSnapshot = (true?that.isFullSnapshot():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullSnapshot", lhsFullSnapshot), LocatorUtils.property(thatLocator, "fullSnapshot", rhsFullSnapshot), lhsFullSnapshot, rhsFullSnapshot)) {
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
            String lhsLocator;
            lhsLocator = this.getLocator();
            String rhsLocator;
            rhsLocator = that.getLocator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locator", lhsLocator), LocatorUtils.property(thatLocator, "locator", rhsLocator), lhsLocator, rhsLocator)) {
                return false;
            }
        }
        {
            List<SnapshotItem> lhsRemoves;
            lhsRemoves = (((this.removes!= null)&&(!this.removes.isEmpty()))?this.getRemoves():null);
            List<SnapshotItem> rhsRemoves;
            rhsRemoves = (((that.removes!= null)&&(!that.removes.isEmpty()))?that.getRemoves():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "removes", lhsRemoves), LocatorUtils.property(thatLocator, "removes", rhsRemoves), lhsRemoves, rhsRemoves)) {
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
            List<SnapshotItem> theAdds;
            theAdds = (((this.adds!= null)&&(!this.adds.isEmpty()))?this.getAdds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adds", theAdds), currentHashCode, theAdds);
        }
        {
            boolean theFullSnapshot;
            theFullSnapshot = (true?this.isFullSnapshot():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullSnapshot", theFullSnapshot), currentHashCode, theFullSnapshot);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theLocator;
            theLocator = this.getLocator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locator", theLocator), currentHashCode, theLocator);
        }
        {
            List<SnapshotItem> theRemoves;
            theRemoves = (((this.removes!= null)&&(!this.removes.isEmpty()))?this.getRemoves():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "removes", theRemoves), currentHashCode, theRemoves);
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
            List<SnapshotItem> theAdds;
            theAdds = (((this.adds!= null)&&(!this.adds.isEmpty()))?this.getAdds():null);
            strategy.appendField(locator, this, "adds", buffer, theAdds);
        }
        {
            boolean theFullSnapshot;
            theFullSnapshot = (true?this.isFullSnapshot():false);
            strategy.appendField(locator, this, "fullSnapshot", buffer, theFullSnapshot);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theLocator;
            theLocator = this.getLocator();
            strategy.appendField(locator, this, "locator", buffer, theLocator);
        }
        {
            List<SnapshotItem> theRemoves;
            theRemoves = (((this.removes!= null)&&(!this.removes.isEmpty()))?this.getRemoves():null);
            strategy.appendField(locator, this, "removes", buffer, theRemoves);
        }
        return buffer;
    }

}
