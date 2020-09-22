
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
 *         &lt;element name="includeAllDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="namespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "includeAllDetails",
    "namespacePrefix"
})
@XmlRootElement(name = "describeVisualForce")
public class DescribeVisualForce
    implements Equals, HashCode, ToString
{

    protected boolean includeAllDetails;
    @XmlElement(required = true, nillable = true)
    protected String namespacePrefix;

    /**
     * Gets the value of the includeAllDetails property.
     * 
     */
    public boolean isIncludeAllDetails() {
        return includeAllDetails;
    }

    /**
     * Sets the value of the includeAllDetails property.
     * 
     */
    public void setIncludeAllDetails(boolean value) {
        this.includeAllDetails = value;
    }

    /**
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespacePrefix(String value) {
        this.namespacePrefix = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeVisualForce)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeVisualForce that = ((DescribeVisualForce) object);
        {
            boolean lhsIncludeAllDetails;
            lhsIncludeAllDetails = (true?this.isIncludeAllDetails():false);
            boolean rhsIncludeAllDetails;
            rhsIncludeAllDetails = (true?that.isIncludeAllDetails():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeAllDetails", lhsIncludeAllDetails), LocatorUtils.property(thatLocator, "includeAllDetails", rhsIncludeAllDetails), lhsIncludeAllDetails, rhsIncludeAllDetails)) {
                return false;
            }
        }
        {
            String lhsNamespacePrefix;
            lhsNamespacePrefix = this.getNamespacePrefix();
            String rhsNamespacePrefix;
            rhsNamespacePrefix = that.getNamespacePrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespacePrefix", lhsNamespacePrefix), LocatorUtils.property(thatLocator, "namespacePrefix", rhsNamespacePrefix), lhsNamespacePrefix, rhsNamespacePrefix)) {
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
            boolean theIncludeAllDetails;
            theIncludeAllDetails = (true?this.isIncludeAllDetails():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeAllDetails", theIncludeAllDetails), currentHashCode, theIncludeAllDetails);
        }
        {
            String theNamespacePrefix;
            theNamespacePrefix = this.getNamespacePrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespacePrefix", theNamespacePrefix), currentHashCode, theNamespacePrefix);
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
            boolean theIncludeAllDetails;
            theIncludeAllDetails = (true?this.isIncludeAllDetails():false);
            strategy.appendField(locator, this, "includeAllDetails", buffer, theIncludeAllDetails);
        }
        {
            String theNamespacePrefix;
            theNamespacePrefix = this.getNamespacePrefix();
            strategy.appendField(locator, this, "namespacePrefix", buffer, theNamespacePrefix);
        }
        return buffer;
    }

}
