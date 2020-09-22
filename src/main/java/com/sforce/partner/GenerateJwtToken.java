
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="claims" type="{urn:partner.soap.sforce.com}ClaimsMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "claims"
})
@XmlRootElement(name = "generateJwtToken")
public class GenerateJwtToken
    implements Equals, HashCode, ToString
{

    protected List<ClaimsMapping> claims;

    /**
     * Gets the value of the claims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsMapping }
     * 
     * 
     */
    public List<ClaimsMapping> getClaims() {
        if (claims == null) {
            claims = new ArrayList<ClaimsMapping>();
        }
        return this.claims;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GenerateJwtToken)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GenerateJwtToken that = ((GenerateJwtToken) object);
        {
            List<ClaimsMapping> lhsClaims;
            lhsClaims = (((this.claims!= null)&&(!this.claims.isEmpty()))?this.getClaims():null);
            List<ClaimsMapping> rhsClaims;
            rhsClaims = (((that.claims!= null)&&(!that.claims.isEmpty()))?that.getClaims():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claims", lhsClaims), LocatorUtils.property(thatLocator, "claims", rhsClaims), lhsClaims, rhsClaims)) {
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
            List<ClaimsMapping> theClaims;
            theClaims = (((this.claims!= null)&&(!this.claims.isEmpty()))?this.getClaims():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claims", theClaims), currentHashCode, theClaims);
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
            List<ClaimsMapping> theClaims;
            theClaims = (((this.claims!= null)&&(!this.claims.isEmpty()))?this.getClaims():null);
            strategy.appendField(locator, this, "claims", buffer, theClaims);
        }
        return buffer;
    }

}
