
package com.sforce.partner;

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
 *         &lt;element name="sObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="forceFullSnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sObject",
    "forceFullSnapshot"
})
@XmlRootElement(name = "createSnapshot")
public class CreateSnapshot
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String sObject;
    protected boolean forceFullSnapshot;

    /**
     * Gets the value of the sObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObject() {
        return sObject;
    }

    /**
     * Sets the value of the sObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObject(String value) {
        this.sObject = value;
    }

    /**
     * Gets the value of the forceFullSnapshot property.
     * 
     */
    public boolean isForceFullSnapshot() {
        return forceFullSnapshot;
    }

    /**
     * Sets the value of the forceFullSnapshot property.
     * 
     */
    public void setForceFullSnapshot(boolean value) {
        this.forceFullSnapshot = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreateSnapshot)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreateSnapshot that = ((CreateSnapshot) object);
        {
            String lhsSObject;
            lhsSObject = this.getSObject();
            String rhsSObject;
            rhsSObject = that.getSObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sObject", lhsSObject), LocatorUtils.property(thatLocator, "sObject", rhsSObject), lhsSObject, rhsSObject)) {
                return false;
            }
        }
        {
            boolean lhsForceFullSnapshot;
            lhsForceFullSnapshot = (true?this.isForceFullSnapshot():false);
            boolean rhsForceFullSnapshot;
            rhsForceFullSnapshot = (true?that.isForceFullSnapshot():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forceFullSnapshot", lhsForceFullSnapshot), LocatorUtils.property(thatLocator, "forceFullSnapshot", rhsForceFullSnapshot), lhsForceFullSnapshot, rhsForceFullSnapshot)) {
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
            String theSObject;
            theSObject = this.getSObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObject", theSObject), currentHashCode, theSObject);
        }
        {
            boolean theForceFullSnapshot;
            theForceFullSnapshot = (true?this.isForceFullSnapshot():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forceFullSnapshot", theForceFullSnapshot), currentHashCode, theForceFullSnapshot);
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
            String theSObject;
            theSObject = this.getSObject();
            strategy.appendField(locator, this, "sObject", buffer, theSObject);
        }
        {
            boolean theForceFullSnapshot;
            theForceFullSnapshot = (true?this.isForceFullSnapshot():false);
            strategy.appendField(locator, this, "forceFullSnapshot", buffer, theForceFullSnapshot);
        }
        return buffer;
    }

}
