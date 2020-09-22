
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
 * <p>Java class for OfflineLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="openType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="properties" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineLink", propOrder = {
    "name",
    "openType",
    "position",
    "properties",
    "url",
    "x",
    "y"
})
public class OfflineLink
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String openType;
    @XmlElement(required = true)
    protected String position;
    @XmlElement(required = true)
    protected String properties;
    @XmlElement(required = true)
    protected String url;
    protected int x;
    protected int y;

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
     * Gets the value of the openType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenType() {
        return openType;
    }

    /**
     * Sets the value of the openType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenType(String value) {
        this.openType = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties(String value) {
        this.properties = value;
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

    /**
     * Gets the value of the x property.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OfflineLink)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OfflineLink that = ((OfflineLink) object);
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
            String lhsOpenType;
            lhsOpenType = this.getOpenType();
            String rhsOpenType;
            rhsOpenType = that.getOpenType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openType", lhsOpenType), LocatorUtils.property(thatLocator, "openType", rhsOpenType), lhsOpenType, rhsOpenType)) {
                return false;
            }
        }
        {
            String lhsPosition;
            lhsPosition = this.getPosition();
            String rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition)) {
                return false;
            }
        }
        {
            String lhsProperties;
            lhsProperties = this.getProperties();
            String rhsProperties;
            rhsProperties = that.getProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "properties", lhsProperties), LocatorUtils.property(thatLocator, "properties", rhsProperties), lhsProperties, rhsProperties)) {
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
        {
            int lhsX;
            lhsX = (true?this.getX(): 0);
            int rhsX;
            rhsX = (true?that.getX(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x", lhsX), LocatorUtils.property(thatLocator, "x", rhsX), lhsX, rhsX)) {
                return false;
            }
        }
        {
            int lhsY;
            lhsY = (true?this.getY(): 0);
            int rhsY;
            rhsY = (true?that.getY(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "y", lhsY), LocatorUtils.property(thatLocator, "y", rhsY), lhsY, rhsY)) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theOpenType;
            theOpenType = this.getOpenType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "openType", theOpenType), currentHashCode, theOpenType);
        }
        {
            String thePosition;
            thePosition = this.getPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "position", thePosition), currentHashCode, thePosition);
        }
        {
            String theProperties;
            theProperties = this.getProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "properties", theProperties), currentHashCode, theProperties);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theUrl), currentHashCode, theUrl);
        }
        {
            int theX;
            theX = (true?this.getX(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x", theX), currentHashCode, theX);
        }
        {
            int theY;
            theY = (true?this.getY(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "y", theY), currentHashCode, theY);
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theOpenType;
            theOpenType = this.getOpenType();
            strategy.appendField(locator, this, "openType", buffer, theOpenType);
        }
        {
            String thePosition;
            thePosition = this.getPosition();
            strategy.appendField(locator, this, "position", buffer, thePosition);
        }
        {
            String theProperties;
            theProperties = this.getProperties();
            strategy.appendField(locator, this, "properties", buffer, theProperties);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            int theX;
            theX = (true?this.getX(): 0);
            strategy.appendField(locator, this, "x", buffer, theX);
        }
        {
            int theY;
            theY = (true?this.getY(): 0);
            strategy.appendField(locator, this, "y", buffer, theY);
        }
        return buffer;
    }

}
