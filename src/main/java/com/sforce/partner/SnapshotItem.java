
package com.sforce.partner;

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
 * <p>Java class for SnapshotItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SnapshotItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oid" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="uid" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotItem", propOrder = {
    "oid",
    "uid"
})
public class SnapshotItem
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String oid;
    @XmlElement(required = true)
    protected String uid;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOid(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SnapshotItem)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SnapshotItem that = ((SnapshotItem) object);
        {
            String lhsOid;
            lhsOid = this.getOid();
            String rhsOid;
            rhsOid = that.getOid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oid", lhsOid), LocatorUtils.property(thatLocator, "oid", rhsOid), lhsOid, rhsOid)) {
                return false;
            }
        }
        {
            String lhsUid;
            lhsUid = this.getUid();
            String rhsUid;
            rhsUid = that.getUid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uid", lhsUid), LocatorUtils.property(thatLocator, "uid", rhsUid), lhsUid, rhsUid)) {
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
            String theOid;
            theOid = this.getOid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oid", theOid), currentHashCode, theOid);
        }
        {
            String theUid;
            theUid = this.getUid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uid", theUid), currentHashCode, theUid);
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
            String theOid;
            theOid = this.getOid();
            strategy.appendField(locator, this, "oid", buffer, theOid);
        }
        {
            String theUid;
            theUid = this.getUid();
            strategy.appendField(locator, this, "uid", buffer, theUid);
        }
        return buffer;
    }

}
