
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for GetAccessInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccessInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessMap" type="{urn:partner.soap.sforce.com}AccessMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccessInfoResult", propOrder = {
    "accessMaps"
})
public class GetAccessInfoResult
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "accessMap")
    protected List<AccessMapping> accessMaps;

    /**
     * Gets the value of the accessMaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessMaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessMaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessMapping }
     * 
     * 
     */
    public List<AccessMapping> getAccessMaps() {
        if (accessMaps == null) {
            accessMaps = new ArrayList<AccessMapping>();
        }
        return this.accessMaps;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetAccessInfoResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GetAccessInfoResult that = ((GetAccessInfoResult) object);
        {
            List<AccessMapping> lhsAccessMaps;
            lhsAccessMaps = (((this.accessMaps!= null)&&(!this.accessMaps.isEmpty()))?this.getAccessMaps():null);
            List<AccessMapping> rhsAccessMaps;
            rhsAccessMaps = (((that.accessMaps!= null)&&(!that.accessMaps.isEmpty()))?that.getAccessMaps():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessMaps", lhsAccessMaps), LocatorUtils.property(thatLocator, "accessMaps", rhsAccessMaps), lhsAccessMaps, rhsAccessMaps)) {
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
            List<AccessMapping> theAccessMaps;
            theAccessMaps = (((this.accessMaps!= null)&&(!this.accessMaps.isEmpty()))?this.getAccessMaps():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessMaps", theAccessMaps), currentHashCode, theAccessMaps);
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
            List<AccessMapping> theAccessMaps;
            theAccessMaps = (((this.accessMaps!= null)&&(!this.accessMaps.isEmpty()))?this.getAccessMaps():null);
            strategy.appendField(locator, this, "accessMaps", buffer, theAccessMaps);
        }
        return buffer;
    }

}
