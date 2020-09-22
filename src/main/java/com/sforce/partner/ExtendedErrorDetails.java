
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
import org.w3c.dom.Element;


/**
 * <p>Java class for ExtendedErrorDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedErrorDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extendedErrorCode" type="{urn:partner.soap.sforce.com}ExtendedErrorCode"/&gt;
 *         &lt;any processContents='lax' namespace='urn:partner.soap.sforce.com' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedErrorDetails", propOrder = {
    "extendedErrorCode",
    "anies"
})
public class ExtendedErrorDetails
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ExtendedErrorCode extendedErrorCode;
    @XmlAnyElement
    protected List<Element> anies;

    /**
     * Gets the value of the extendedErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedErrorCode }
     *     
     */
    public ExtendedErrorCode getExtendedErrorCode() {
        return extendedErrorCode;
    }

    /**
     * Sets the value of the extendedErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedErrorCode }
     *     
     */
    public void setExtendedErrorCode(ExtendedErrorCode value) {
        this.extendedErrorCode = value;
    }

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Element>();
        }
        return this.anies;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExtendedErrorDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExtendedErrorDetails that = ((ExtendedErrorDetails) object);
        {
            ExtendedErrorCode lhsExtendedErrorCode;
            lhsExtendedErrorCode = this.getExtendedErrorCode();
            ExtendedErrorCode rhsExtendedErrorCode;
            rhsExtendedErrorCode = that.getExtendedErrorCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extendedErrorCode", lhsExtendedErrorCode), LocatorUtils.property(thatLocator, "extendedErrorCode", rhsExtendedErrorCode), lhsExtendedErrorCode, rhsExtendedErrorCode)) {
                return false;
            }
        }
        {
            List<Element> lhsAnies;
            lhsAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            List<Element> rhsAnies;
            rhsAnies = (((that.anies!= null)&&(!that.anies.isEmpty()))?that.getAnies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anies", lhsAnies), LocatorUtils.property(thatLocator, "anies", rhsAnies), lhsAnies, rhsAnies)) {
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
            ExtendedErrorCode theExtendedErrorCode;
            theExtendedErrorCode = this.getExtendedErrorCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extendedErrorCode", theExtendedErrorCode), currentHashCode, theExtendedErrorCode);
        }
        {
            List<Element> theAnies;
            theAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anies", theAnies), currentHashCode, theAnies);
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
            ExtendedErrorCode theExtendedErrorCode;
            theExtendedErrorCode = this.getExtendedErrorCode();
            strategy.appendField(locator, this, "extendedErrorCode", buffer, theExtendedErrorCode);
        }
        {
            List<Element> theAnies;
            theAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            strategy.appendField(locator, this, "anies", buffer, theAnies);
        }
        return buffer;
    }

}
