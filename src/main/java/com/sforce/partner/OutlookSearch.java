
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
 *         &lt;element name="searchExpr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contextString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "searchExpr",
    "contextString"
})
@XmlRootElement(name = "outlookSearch")
public class OutlookSearch
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String searchExpr;
    @XmlElement(required = true)
    protected String contextString;

    /**
     * Gets the value of the searchExpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchExpr() {
        return searchExpr;
    }

    /**
     * Sets the value of the searchExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchExpr(String value) {
        this.searchExpr = value;
    }

    /**
     * Gets the value of the contextString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextString() {
        return contextString;
    }

    /**
     * Sets the value of the contextString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextString(String value) {
        this.contextString = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OutlookSearch)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OutlookSearch that = ((OutlookSearch) object);
        {
            String lhsSearchExpr;
            lhsSearchExpr = this.getSearchExpr();
            String rhsSearchExpr;
            rhsSearchExpr = that.getSearchExpr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchExpr", lhsSearchExpr), LocatorUtils.property(thatLocator, "searchExpr", rhsSearchExpr), lhsSearchExpr, rhsSearchExpr)) {
                return false;
            }
        }
        {
            String lhsContextString;
            lhsContextString = this.getContextString();
            String rhsContextString;
            rhsContextString = that.getContextString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextString", lhsContextString), LocatorUtils.property(thatLocator, "contextString", rhsContextString), lhsContextString, rhsContextString)) {
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
            String theSearchExpr;
            theSearchExpr = this.getSearchExpr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchExpr", theSearchExpr), currentHashCode, theSearchExpr);
        }
        {
            String theContextString;
            theContextString = this.getContextString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextString", theContextString), currentHashCode, theContextString);
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
            String theSearchExpr;
            theSearchExpr = this.getSearchExpr();
            strategy.appendField(locator, this, "searchExpr", buffer, theSearchExpr);
        }
        {
            String theContextString;
            theContextString = this.getContextString();
            strategy.appendField(locator, this, "contextString", buffer, theContextString);
        }
        return buffer;
    }

}
