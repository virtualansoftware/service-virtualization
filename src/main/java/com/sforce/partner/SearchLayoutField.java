
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
 * <p>Java class for SearchLayoutField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchLayoutField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apiName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sortable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLayoutField", propOrder = {
    "apiName",
    "label",
    "sortable"
})
public class SearchLayoutField
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String apiName;
    @XmlElement(required = true)
    protected String label;
    protected boolean sortable;

    /**
     * Gets the value of the apiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * Sets the value of the apiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiName(String value) {
        this.apiName = value;
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
     * Gets the value of the sortable property.
     * 
     */
    public boolean isSortable() {
        return sortable;
    }

    /**
     * Sets the value of the sortable property.
     * 
     */
    public void setSortable(boolean value) {
        this.sortable = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchLayoutField)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchLayoutField that = ((SearchLayoutField) object);
        {
            String lhsApiName;
            lhsApiName = this.getApiName();
            String rhsApiName;
            rhsApiName = that.getApiName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiName", lhsApiName), LocatorUtils.property(thatLocator, "apiName", rhsApiName), lhsApiName, rhsApiName)) {
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
            boolean lhsSortable;
            lhsSortable = (true?this.isSortable():false);
            boolean rhsSortable;
            rhsSortable = (true?that.isSortable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortable", lhsSortable), LocatorUtils.property(thatLocator, "sortable", rhsSortable), lhsSortable, rhsSortable)) {
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
            String theApiName;
            theApiName = this.getApiName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apiName", theApiName), currentHashCode, theApiName);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            boolean theSortable;
            theSortable = (true?this.isSortable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortable", theSortable), currentHashCode, theSortable);
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
            String theApiName;
            theApiName = this.getApiName();
            strategy.appendField(locator, this, "apiName", buffer, theApiName);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            boolean theSortable;
            theSortable = (true?this.isSortable():false);
            strategy.appendField(locator, this, "sortable", buffer, theSortable);
        }
        return buffer;
    }

}
