
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="sObjectTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
    "sObjectTypes"
})
@XmlRootElement(name = "describePrimaryCompactLayouts")
public class DescribePrimaryCompactLayouts
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<String> sObjectTypes;

    /**
     * Gets the value of the sObjectTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sObjectTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSObjectTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSObjectTypes() {
        if (sObjectTypes == null) {
            sObjectTypes = new ArrayList<String>();
        }
        return this.sObjectTypes;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribePrimaryCompactLayouts)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribePrimaryCompactLayouts that = ((DescribePrimaryCompactLayouts) object);
        {
            List<String> lhsSObjectTypes;
            lhsSObjectTypes = (((this.sObjectTypes!= null)&&(!this.sObjectTypes.isEmpty()))?this.getSObjectTypes():null);
            List<String> rhsSObjectTypes;
            rhsSObjectTypes = (((that.sObjectTypes!= null)&&(!that.sObjectTypes.isEmpty()))?that.getSObjectTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sObjectTypes", lhsSObjectTypes), LocatorUtils.property(thatLocator, "sObjectTypes", rhsSObjectTypes), lhsSObjectTypes, rhsSObjectTypes)) {
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
            List<String> theSObjectTypes;
            theSObjectTypes = (((this.sObjectTypes!= null)&&(!this.sObjectTypes.isEmpty()))?this.getSObjectTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObjectTypes", theSObjectTypes), currentHashCode, theSObjectTypes);
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
            List<String> theSObjectTypes;
            theSObjectTypes = (((this.sObjectTypes!= null)&&(!this.sObjectTypes.isEmpty()))?this.getSObjectTypes():null);
            strategy.appendField(locator, this, "sObjectTypes", buffer, theSObjectTypes);
        }
        return buffer;
    }

}
