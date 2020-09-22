
package com.sforce.partner;

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
 *         &lt;element name="batchSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="filterLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{urn:partner.soap.sforce.com}queryOptionsScope"/&gt;
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
    "batchSize",
    "filterLanguage",
    "scope"
})
@XmlRootElement(name = "QueryOptions")
public class QueryOptions
    implements Equals, HashCode, ToString
{

    protected Integer batchSize;
    protected String filterLanguage;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected QueryOptionsScope scope;

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the filterLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterLanguage() {
        return filterLanguage;
    }

    /**
     * Sets the value of the filterLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterLanguage(String value) {
        this.filterLanguage = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOptionsScope }
     *     
     */
    public QueryOptionsScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOptionsScope }
     *     
     */
    public void setScope(QueryOptionsScope value) {
        this.scope = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QueryOptions)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final QueryOptions that = ((QueryOptions) object);
        {
            Integer lhsBatchSize;
            lhsBatchSize = this.getBatchSize();
            Integer rhsBatchSize;
            rhsBatchSize = that.getBatchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "batchSize", lhsBatchSize), LocatorUtils.property(thatLocator, "batchSize", rhsBatchSize), lhsBatchSize, rhsBatchSize)) {
                return false;
            }
        }
        {
            String lhsFilterLanguage;
            lhsFilterLanguage = this.getFilterLanguage();
            String rhsFilterLanguage;
            rhsFilterLanguage = that.getFilterLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filterLanguage", lhsFilterLanguage), LocatorUtils.property(thatLocator, "filterLanguage", rhsFilterLanguage), lhsFilterLanguage, rhsFilterLanguage)) {
                return false;
            }
        }
        {
            QueryOptionsScope lhsScope;
            lhsScope = this.getScope();
            QueryOptionsScope rhsScope;
            rhsScope = that.getScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scope", lhsScope), LocatorUtils.property(thatLocator, "scope", rhsScope), lhsScope, rhsScope)) {
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
            Integer theBatchSize;
            theBatchSize = this.getBatchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchSize", theBatchSize), currentHashCode, theBatchSize);
        }
        {
            String theFilterLanguage;
            theFilterLanguage = this.getFilterLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filterLanguage", theFilterLanguage), currentHashCode, theFilterLanguage);
        }
        {
            QueryOptionsScope theScope;
            theScope = this.getScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scope", theScope), currentHashCode, theScope);
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
            Integer theBatchSize;
            theBatchSize = this.getBatchSize();
            strategy.appendField(locator, this, "batchSize", buffer, theBatchSize);
        }
        {
            String theFilterLanguage;
            theFilterLanguage = this.getFilterLanguage();
            strategy.appendField(locator, this, "filterLanguage", buffer, theFilterLanguage);
        }
        {
            QueryOptionsScope theScope;
            theScope = this.getScope();
            strategy.appendField(locator, this, "scope", buffer, theScope);
        }
        return buffer;
    }

}
