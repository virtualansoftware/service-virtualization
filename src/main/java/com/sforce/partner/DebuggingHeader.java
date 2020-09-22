
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="categories" type="{urn:partner.soap.sforce.com}LogInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="debugLevel" type="{urn:partner.soap.sforce.com}DebugLevel"/&gt;
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
    "categories",
    "debugLevel"
})
@XmlRootElement(name = "DebuggingHeader")
public class DebuggingHeader
    implements Equals, HashCode, ToString
{

    protected List<LogInfo> categories;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DebugLevel debugLevel;

    /**
     * Gets the value of the categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogInfo }
     * 
     * 
     */
    public List<LogInfo> getCategories() {
        if (categories == null) {
            categories = new ArrayList<LogInfo>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the debugLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DebugLevel }
     *     
     */
    public DebugLevel getDebugLevel() {
        return debugLevel;
    }

    /**
     * Sets the value of the debugLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebugLevel }
     *     
     */
    public void setDebugLevel(DebugLevel value) {
        this.debugLevel = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DebuggingHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DebuggingHeader that = ((DebuggingHeader) object);
        {
            List<LogInfo> lhsCategories;
            lhsCategories = (((this.categories!= null)&&(!this.categories.isEmpty()))?this.getCategories():null);
            List<LogInfo> rhsCategories;
            rhsCategories = (((that.categories!= null)&&(!that.categories.isEmpty()))?that.getCategories():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categories", lhsCategories), LocatorUtils.property(thatLocator, "categories", rhsCategories), lhsCategories, rhsCategories)) {
                return false;
            }
        }
        {
            DebugLevel lhsDebugLevel;
            lhsDebugLevel = this.getDebugLevel();
            DebugLevel rhsDebugLevel;
            rhsDebugLevel = that.getDebugLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debugLevel", lhsDebugLevel), LocatorUtils.property(thatLocator, "debugLevel", rhsDebugLevel), lhsDebugLevel, rhsDebugLevel)) {
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
            List<LogInfo> theCategories;
            theCategories = (((this.categories!= null)&&(!this.categories.isEmpty()))?this.getCategories():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categories", theCategories), currentHashCode, theCategories);
        }
        {
            DebugLevel theDebugLevel;
            theDebugLevel = this.getDebugLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debugLevel", theDebugLevel), currentHashCode, theDebugLevel);
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
            List<LogInfo> theCategories;
            theCategories = (((this.categories!= null)&&(!this.categories.isEmpty()))?this.getCategories():null);
            strategy.appendField(locator, this, "categories", buffer, theCategories);
        }
        {
            DebugLevel theDebugLevel;
            theDebugLevel = this.getDebugLevel();
            strategy.appendField(locator, this, "debugLevel", buffer, theDebugLevel);
        }
        return buffer;
    }

}
