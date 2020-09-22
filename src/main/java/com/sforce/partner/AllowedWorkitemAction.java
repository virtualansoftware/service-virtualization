
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
 * <p>Java class for AllowedWorkitemAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowedWorkitemAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="versionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="commentsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nextOwnerRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowedWorkitemAction", propOrder = {
    "versionRequired",
    "commentsRequired",
    "label",
    "name",
    "nextOwnerRequired"
})
public class AllowedWorkitemAction
    implements Equals, HashCode, ToString
{

    protected boolean versionRequired;
    protected boolean commentsRequired;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    protected boolean nextOwnerRequired;

    /**
     * Gets the value of the versionRequired property.
     * 
     */
    public boolean isVersionRequired() {
        return versionRequired;
    }

    /**
     * Sets the value of the versionRequired property.
     * 
     */
    public void setVersionRequired(boolean value) {
        this.versionRequired = value;
    }

    /**
     * Gets the value of the commentsRequired property.
     * 
     */
    public boolean isCommentsRequired() {
        return commentsRequired;
    }

    /**
     * Sets the value of the commentsRequired property.
     * 
     */
    public void setCommentsRequired(boolean value) {
        this.commentsRequired = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nextOwnerRequired property.
     * 
     */
    public boolean isNextOwnerRequired() {
        return nextOwnerRequired;
    }

    /**
     * Sets the value of the nextOwnerRequired property.
     * 
     */
    public void setNextOwnerRequired(boolean value) {
        this.nextOwnerRequired = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AllowedWorkitemAction)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AllowedWorkitemAction that = ((AllowedWorkitemAction) object);
        {
            boolean lhsVersionRequired;
            lhsVersionRequired = (true?this.isVersionRequired():false);
            boolean rhsVersionRequired;
            rhsVersionRequired = (true?that.isVersionRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionRequired", lhsVersionRequired), LocatorUtils.property(thatLocator, "versionRequired", rhsVersionRequired), lhsVersionRequired, rhsVersionRequired)) {
                return false;
            }
        }
        {
            boolean lhsCommentsRequired;
            lhsCommentsRequired = (true?this.isCommentsRequired():false);
            boolean rhsCommentsRequired;
            rhsCommentsRequired = (true?that.isCommentsRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commentsRequired", lhsCommentsRequired), LocatorUtils.property(thatLocator, "commentsRequired", rhsCommentsRequired), lhsCommentsRequired, rhsCommentsRequired)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            boolean lhsNextOwnerRequired;
            lhsNextOwnerRequired = (true?this.isNextOwnerRequired():false);
            boolean rhsNextOwnerRequired;
            rhsNextOwnerRequired = (true?that.isNextOwnerRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nextOwnerRequired", lhsNextOwnerRequired), LocatorUtils.property(thatLocator, "nextOwnerRequired", rhsNextOwnerRequired), lhsNextOwnerRequired, rhsNextOwnerRequired)) {
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
            boolean theVersionRequired;
            theVersionRequired = (true?this.isVersionRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionRequired", theVersionRequired), currentHashCode, theVersionRequired);
        }
        {
            boolean theCommentsRequired;
            theCommentsRequired = (true?this.isCommentsRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commentsRequired", theCommentsRequired), currentHashCode, theCommentsRequired);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            boolean theNextOwnerRequired;
            theNextOwnerRequired = (true?this.isNextOwnerRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nextOwnerRequired", theNextOwnerRequired), currentHashCode, theNextOwnerRequired);
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
            boolean theVersionRequired;
            theVersionRequired = (true?this.isVersionRequired():false);
            strategy.appendField(locator, this, "versionRequired", buffer, theVersionRequired);
        }
        {
            boolean theCommentsRequired;
            theCommentsRequired = (true?this.isCommentsRequired():false);
            strategy.appendField(locator, this, "commentsRequired", buffer, theCommentsRequired);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            boolean theNextOwnerRequired;
            theNextOwnerRequired = (true?this.isNextOwnerRequired():false);
            strategy.appendField(locator, this, "nextOwnerRequired", buffer, theNextOwnerRequired);
        }
        return buffer;
    }

}
