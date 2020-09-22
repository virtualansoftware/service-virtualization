
package com.sforce.partner;

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
 * <p>Java class for OwnerChangeOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnerChangeOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{urn:partner.soap.sforce.com}OwnerChangeOptionType"/&gt;
 *         &lt;element name="execute" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerChangeOption", propOrder = {
    "type",
    "execute"
})
public class OwnerChangeOption
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OwnerChangeOptionType type;
    protected boolean execute;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerChangeOptionType }
     *     
     */
    public OwnerChangeOptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerChangeOptionType }
     *     
     */
    public void setType(OwnerChangeOptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the execute property.
     * 
     */
    public boolean isExecute() {
        return execute;
    }

    /**
     * Sets the value of the execute property.
     * 
     */
    public void setExecute(boolean value) {
        this.execute = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OwnerChangeOption)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OwnerChangeOption that = ((OwnerChangeOption) object);
        {
            OwnerChangeOptionType lhsType;
            lhsType = this.getType();
            OwnerChangeOptionType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            boolean lhsExecute;
            lhsExecute = (true?this.isExecute():false);
            boolean rhsExecute;
            rhsExecute = (true?that.isExecute():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "execute", lhsExecute), LocatorUtils.property(thatLocator, "execute", rhsExecute), lhsExecute, rhsExecute)) {
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
            OwnerChangeOptionType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            boolean theExecute;
            theExecute = (true?this.isExecute():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "execute", theExecute), currentHashCode, theExecute);
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
            OwnerChangeOptionType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            boolean theExecute;
            theExecute = (true?this.isExecute():false);
            strategy.appendField(locator, this, "execute", buffer, theExecute);
        }
        return buffer;
    }

}
