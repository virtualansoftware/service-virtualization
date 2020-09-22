
package com.sforce.partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recentsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isSoqlCompatible" type="{urn:partner.soap.sforce.com}listViewIsSoqlCompatible"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sObjectType",
    "recentsOnly",
    "isSoqlCompatible",
    "limit",
    "offset"
})
@XmlRootElement(name = "describeSObjectListViews")
public class DescribeSObjectListViews
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String sObjectType;
    protected boolean recentsOnly;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ListViewIsSoqlCompatible isSoqlCompatible;
    protected int limit;
    protected int offset;

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
     * Gets the value of the recentsOnly property.
     * 
     */
    public boolean isRecentsOnly() {
        return recentsOnly;
    }

    /**
     * Sets the value of the recentsOnly property.
     * 
     */
    public void setRecentsOnly(boolean value) {
        this.recentsOnly = value;
    }

    /**
     * Gets the value of the isSoqlCompatible property.
     * 
     * @return
     *     possible object is
     *     {@link ListViewIsSoqlCompatible }
     *     
     */
    public ListViewIsSoqlCompatible getIsSoqlCompatible() {
        return isSoqlCompatible;
    }

    /**
     * Sets the value of the isSoqlCompatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListViewIsSoqlCompatible }
     *     
     */
    public void setIsSoqlCompatible(ListViewIsSoqlCompatible value) {
        this.isSoqlCompatible = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSObjectListViews)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSObjectListViews that = ((DescribeSObjectListViews) object);
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
            boolean lhsRecentsOnly;
            lhsRecentsOnly = (true?this.isRecentsOnly():false);
            boolean rhsRecentsOnly;
            rhsRecentsOnly = (true?that.isRecentsOnly():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recentsOnly", lhsRecentsOnly), LocatorUtils.property(thatLocator, "recentsOnly", rhsRecentsOnly), lhsRecentsOnly, rhsRecentsOnly)) {
                return false;
            }
        }
        {
            ListViewIsSoqlCompatible lhsIsSoqlCompatible;
            lhsIsSoqlCompatible = this.getIsSoqlCompatible();
            ListViewIsSoqlCompatible rhsIsSoqlCompatible;
            rhsIsSoqlCompatible = that.getIsSoqlCompatible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSoqlCompatible", lhsIsSoqlCompatible), LocatorUtils.property(thatLocator, "isSoqlCompatible", rhsIsSoqlCompatible), lhsIsSoqlCompatible, rhsIsSoqlCompatible)) {
                return false;
            }
        }
        {
            int lhsLimit;
            lhsLimit = (true?this.getLimit(): 0);
            int rhsLimit;
            rhsLimit = (true?that.getLimit(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limit", lhsLimit), LocatorUtils.property(thatLocator, "limit", rhsLimit), lhsLimit, rhsLimit)) {
                return false;
            }
        }
        {
            int lhsOffset;
            lhsOffset = (true?this.getOffset(): 0);
            int rhsOffset;
            rhsOffset = (true?that.getOffset(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offset", lhsOffset), LocatorUtils.property(thatLocator, "offset", rhsOffset), lhsOffset, rhsOffset)) {
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
            String theSObjectType;
            theSObjectType = this.getSObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObjectType", theSObjectType), currentHashCode, theSObjectType);
        }
        {
            boolean theRecentsOnly;
            theRecentsOnly = (true?this.isRecentsOnly():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recentsOnly", theRecentsOnly), currentHashCode, theRecentsOnly);
        }
        {
            ListViewIsSoqlCompatible theIsSoqlCompatible;
            theIsSoqlCompatible = this.getIsSoqlCompatible();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSoqlCompatible", theIsSoqlCompatible), currentHashCode, theIsSoqlCompatible);
        }
        {
            int theLimit;
            theLimit = (true?this.getLimit(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limit", theLimit), currentHashCode, theLimit);
        }
        {
            int theOffset;
            theOffset = (true?this.getOffset(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offset", theOffset), currentHashCode, theOffset);
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
            String theSObjectType;
            theSObjectType = this.getSObjectType();
            strategy.appendField(locator, this, "sObjectType", buffer, theSObjectType);
        }
        {
            boolean theRecentsOnly;
            theRecentsOnly = (true?this.isRecentsOnly():false);
            strategy.appendField(locator, this, "recentsOnly", buffer, theRecentsOnly);
        }
        {
            ListViewIsSoqlCompatible theIsSoqlCompatible;
            theIsSoqlCompatible = this.getIsSoqlCompatible();
            strategy.appendField(locator, this, "isSoqlCompatible", buffer, theIsSoqlCompatible);
        }
        {
            int theLimit;
            theLimit = (true?this.getLimit(): 0);
            strategy.appendField(locator, this, "limit", buffer, theLimit);
        }
        {
            int theOffset;
            theOffset = (true?this.getOffset(): 0);
            strategy.appendField(locator, this, "offset", buffer, theOffset);
        }
        return buffer;
    }

}
