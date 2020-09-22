
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
 * <p>Java class for PackageVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="majorNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="minorNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageVersion", propOrder = {
    "majorNumber",
    "minorNumber",
    "namespace"
})
public class PackageVersion
    implements Equals, HashCode, ToString
{

    protected int majorNumber;
    protected int minorNumber;
    @XmlElement(required = true)
    protected String namespace;

    /**
     * Gets the value of the majorNumber property.
     * 
     */
    public int getMajorNumber() {
        return majorNumber;
    }

    /**
     * Sets the value of the majorNumber property.
     * 
     */
    public void setMajorNumber(int value) {
        this.majorNumber = value;
    }

    /**
     * Gets the value of the minorNumber property.
     * 
     */
    public int getMinorNumber() {
        return minorNumber;
    }

    /**
     * Sets the value of the minorNumber property.
     * 
     */
    public void setMinorNumber(int value) {
        this.minorNumber = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PackageVersion)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PackageVersion that = ((PackageVersion) object);
        {
            int lhsMajorNumber;
            lhsMajorNumber = (true?this.getMajorNumber(): 0);
            int rhsMajorNumber;
            rhsMajorNumber = (true?that.getMajorNumber(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "majorNumber", lhsMajorNumber), LocatorUtils.property(thatLocator, "majorNumber", rhsMajorNumber), lhsMajorNumber, rhsMajorNumber)) {
                return false;
            }
        }
        {
            int lhsMinorNumber;
            lhsMinorNumber = (true?this.getMinorNumber(): 0);
            int rhsMinorNumber;
            rhsMinorNumber = (true?that.getMinorNumber(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minorNumber", lhsMinorNumber), LocatorUtils.property(thatLocator, "minorNumber", rhsMinorNumber), lhsMinorNumber, rhsMinorNumber)) {
                return false;
            }
        }
        {
            String lhsNamespace;
            lhsNamespace = this.getNamespace();
            String rhsNamespace;
            rhsNamespace = that.getNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespace", lhsNamespace), LocatorUtils.property(thatLocator, "namespace", rhsNamespace), lhsNamespace, rhsNamespace)) {
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
            int theMajorNumber;
            theMajorNumber = (true?this.getMajorNumber(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "majorNumber", theMajorNumber), currentHashCode, theMajorNumber);
        }
        {
            int theMinorNumber;
            theMinorNumber = (true?this.getMinorNumber(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minorNumber", theMinorNumber), currentHashCode, theMinorNumber);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespace", theNamespace), currentHashCode, theNamespace);
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
            int theMajorNumber;
            theMajorNumber = (true?this.getMajorNumber(): 0);
            strategy.appendField(locator, this, "majorNumber", buffer, theMajorNumber);
        }
        {
            int theMinorNumber;
            theMinorNumber = (true?this.getMinorNumber(): 0);
            strategy.appendField(locator, this, "minorNumber", buffer, theMinorNumber);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            strategy.appendField(locator, this, "namespace", buffer, theNamespace);
        }
        return buffer;
    }

}
