
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
 * <p>Java class for ActionOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionOverride"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formFactor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isAvailableInTouch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pageId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionOverride", propOrder = {
    "formFactor",
    "isAvailableInTouch",
    "name",
    "pageId",
    "url"
})
public class ActionOverride
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String formFactor;
    protected boolean isAvailableInTouch;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String pageId;
    @XmlElement(required = true, nillable = true)
    protected String url;

    /**
     * Gets the value of the formFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormFactor() {
        return formFactor;
    }

    /**
     * Sets the value of the formFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormFactor(String value) {
        this.formFactor = value;
    }

    /**
     * Gets the value of the isAvailableInTouch property.
     * 
     */
    public boolean isIsAvailableInTouch() {
        return isAvailableInTouch;
    }

    /**
     * Sets the value of the isAvailableInTouch property.
     * 
     */
    public void setIsAvailableInTouch(boolean value) {
        this.isAvailableInTouch = value;
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
     * Gets the value of the pageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * Sets the value of the pageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageId(String value) {
        this.pageId = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ActionOverride)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ActionOverride that = ((ActionOverride) object);
        {
            String lhsFormFactor;
            lhsFormFactor = this.getFormFactor();
            String rhsFormFactor;
            rhsFormFactor = that.getFormFactor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formFactor", lhsFormFactor), LocatorUtils.property(thatLocator, "formFactor", rhsFormFactor), lhsFormFactor, rhsFormFactor)) {
                return false;
            }
        }
        {
            boolean lhsIsAvailableInTouch;
            lhsIsAvailableInTouch = (true?this.isIsAvailableInTouch():false);
            boolean rhsIsAvailableInTouch;
            rhsIsAvailableInTouch = (true?that.isIsAvailableInTouch():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isAvailableInTouch", lhsIsAvailableInTouch), LocatorUtils.property(thatLocator, "isAvailableInTouch", rhsIsAvailableInTouch), lhsIsAvailableInTouch, rhsIsAvailableInTouch)) {
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
            String lhsPageId;
            lhsPageId = this.getPageId();
            String rhsPageId;
            rhsPageId = that.getPageId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageId", lhsPageId), LocatorUtils.property(thatLocator, "pageId", rhsPageId), lhsPageId, rhsPageId)) {
                return false;
            }
        }
        {
            String lhsUrl;
            lhsUrl = this.getUrl();
            String rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
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
            String theFormFactor;
            theFormFactor = this.getFormFactor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formFactor", theFormFactor), currentHashCode, theFormFactor);
        }
        {
            boolean theIsAvailableInTouch;
            theIsAvailableInTouch = (true?this.isIsAvailableInTouch():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAvailableInTouch", theIsAvailableInTouch), currentHashCode, theIsAvailableInTouch);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String thePageId;
            thePageId = this.getPageId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pageId", thePageId), currentHashCode, thePageId);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theUrl), currentHashCode, theUrl);
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
            String theFormFactor;
            theFormFactor = this.getFormFactor();
            strategy.appendField(locator, this, "formFactor", buffer, theFormFactor);
        }
        {
            boolean theIsAvailableInTouch;
            theIsAvailableInTouch = (true?this.isIsAvailableInTouch():false);
            strategy.appendField(locator, this, "isAvailableInTouch", buffer, theIsAvailableInTouch);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String thePageId;
            thePageId = this.getPageId();
            strategy.appendField(locator, this, "pageId", buffer, thePageId);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        return buffer;
    }

}
