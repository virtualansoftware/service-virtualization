
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ifModifiedBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ifModifiedSince" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ifModifiedBeforeArray" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "ifModifiedBefore",
    "ifModifiedSince",
    "ifModifiedBeforeArraies"
})
@XmlRootElement(name = "ConditionalRequestHeader")
public class ConditionalRequestHeader
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ifModifiedBefore;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ifModifiedSince;
    @XmlElement(name = "ifModifiedBeforeArray", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> ifModifiedBeforeArraies;

    /**
     * Gets the value of the ifModifiedBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIfModifiedBefore() {
        return ifModifiedBefore;
    }

    /**
     * Sets the value of the ifModifiedBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIfModifiedBefore(XMLGregorianCalendar value) {
        this.ifModifiedBefore = value;
    }

    /**
     * Gets the value of the ifModifiedSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIfModifiedSince() {
        return ifModifiedSince;
    }

    /**
     * Sets the value of the ifModifiedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIfModifiedSince(XMLGregorianCalendar value) {
        this.ifModifiedSince = value;
    }

    /**
     * Gets the value of the ifModifiedBeforeArraies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ifModifiedBeforeArraies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfModifiedBeforeArraies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getIfModifiedBeforeArraies() {
        if (ifModifiedBeforeArraies == null) {
            ifModifiedBeforeArraies = new ArrayList<XMLGregorianCalendar>();
        }
        return this.ifModifiedBeforeArraies;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConditionalRequestHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ConditionalRequestHeader that = ((ConditionalRequestHeader) object);
        {
            XMLGregorianCalendar lhsIfModifiedBefore;
            lhsIfModifiedBefore = this.getIfModifiedBefore();
            XMLGregorianCalendar rhsIfModifiedBefore;
            rhsIfModifiedBefore = that.getIfModifiedBefore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ifModifiedBefore", lhsIfModifiedBefore), LocatorUtils.property(thatLocator, "ifModifiedBefore", rhsIfModifiedBefore), lhsIfModifiedBefore, rhsIfModifiedBefore)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsIfModifiedSince;
            lhsIfModifiedSince = this.getIfModifiedSince();
            XMLGregorianCalendar rhsIfModifiedSince;
            rhsIfModifiedSince = that.getIfModifiedSince();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ifModifiedSince", lhsIfModifiedSince), LocatorUtils.property(thatLocator, "ifModifiedSince", rhsIfModifiedSince), lhsIfModifiedSince, rhsIfModifiedSince)) {
                return false;
            }
        }
        {
            List<XMLGregorianCalendar> lhsIfModifiedBeforeArraies;
            lhsIfModifiedBeforeArraies = (((this.ifModifiedBeforeArraies!= null)&&(!this.ifModifiedBeforeArraies.isEmpty()))?this.getIfModifiedBeforeArraies():null);
            List<XMLGregorianCalendar> rhsIfModifiedBeforeArraies;
            rhsIfModifiedBeforeArraies = (((that.ifModifiedBeforeArraies!= null)&&(!that.ifModifiedBeforeArraies.isEmpty()))?that.getIfModifiedBeforeArraies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ifModifiedBeforeArraies", lhsIfModifiedBeforeArraies), LocatorUtils.property(thatLocator, "ifModifiedBeforeArraies", rhsIfModifiedBeforeArraies), lhsIfModifiedBeforeArraies, rhsIfModifiedBeforeArraies)) {
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
            XMLGregorianCalendar theIfModifiedBefore;
            theIfModifiedBefore = this.getIfModifiedBefore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ifModifiedBefore", theIfModifiedBefore), currentHashCode, theIfModifiedBefore);
        }
        {
            XMLGregorianCalendar theIfModifiedSince;
            theIfModifiedSince = this.getIfModifiedSince();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ifModifiedSince", theIfModifiedSince), currentHashCode, theIfModifiedSince);
        }
        {
            List<XMLGregorianCalendar> theIfModifiedBeforeArraies;
            theIfModifiedBeforeArraies = (((this.ifModifiedBeforeArraies!= null)&&(!this.ifModifiedBeforeArraies.isEmpty()))?this.getIfModifiedBeforeArraies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ifModifiedBeforeArraies", theIfModifiedBeforeArraies), currentHashCode, theIfModifiedBeforeArraies);
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
            XMLGregorianCalendar theIfModifiedBefore;
            theIfModifiedBefore = this.getIfModifiedBefore();
            strategy.appendField(locator, this, "ifModifiedBefore", buffer, theIfModifiedBefore);
        }
        {
            XMLGregorianCalendar theIfModifiedSince;
            theIfModifiedSince = this.getIfModifiedSince();
            strategy.appendField(locator, this, "ifModifiedSince", buffer, theIfModifiedSince);
        }
        {
            List<XMLGregorianCalendar> theIfModifiedBeforeArraies;
            theIfModifiedBeforeArraies = (((this.ifModifiedBeforeArraies!= null)&&(!this.ifModifiedBeforeArraies.isEmpty()))?this.getIfModifiedBeforeArraies():null);
            strategy.appendField(locator, this, "ifModifiedBeforeArraies", buffer, theIfModifiedBeforeArraies);
        }
        return buffer;
    }

}
