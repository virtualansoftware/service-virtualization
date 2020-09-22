
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
 * <p>Java class for DescribeSoqlListViewParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoqlListViewParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="developerNameOrId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sobjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoqlListViewParams", propOrder = {
    "developerNameOrId",
    "sobjectType"
})
public class DescribeSoqlListViewParams
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String developerNameOrId;
    @XmlElement(required = true, nillable = true)
    protected String sobjectType;

    /**
     * Gets the value of the developerNameOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperNameOrId() {
        return developerNameOrId;
    }

    /**
     * Sets the value of the developerNameOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperNameOrId(String value) {
        this.developerNameOrId = value;
    }

    /**
     * Gets the value of the sobjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobjectType() {
        return sobjectType;
    }

    /**
     * Sets the value of the sobjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobjectType(String value) {
        this.sobjectType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSoqlListViewParams)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSoqlListViewParams that = ((DescribeSoqlListViewParams) object);
        {
            String lhsDeveloperNameOrId;
            lhsDeveloperNameOrId = this.getDeveloperNameOrId();
            String rhsDeveloperNameOrId;
            rhsDeveloperNameOrId = that.getDeveloperNameOrId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "developerNameOrId", lhsDeveloperNameOrId), LocatorUtils.property(thatLocator, "developerNameOrId", rhsDeveloperNameOrId), lhsDeveloperNameOrId, rhsDeveloperNameOrId)) {
                return false;
            }
        }
        {
            String lhsSobjectType;
            lhsSobjectType = this.getSobjectType();
            String rhsSobjectType;
            rhsSobjectType = that.getSobjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobjectType", lhsSobjectType), LocatorUtils.property(thatLocator, "sobjectType", rhsSobjectType), lhsSobjectType, rhsSobjectType)) {
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
            String theDeveloperNameOrId;
            theDeveloperNameOrId = this.getDeveloperNameOrId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "developerNameOrId", theDeveloperNameOrId), currentHashCode, theDeveloperNameOrId);
        }
        {
            String theSobjectType;
            theSobjectType = this.getSobjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobjectType", theSobjectType), currentHashCode, theSobjectType);
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
            String theDeveloperNameOrId;
            theDeveloperNameOrId = this.getDeveloperNameOrId();
            strategy.appendField(locator, this, "developerNameOrId", buffer, theDeveloperNameOrId);
        }
        {
            String theSobjectType;
            theSobjectType = this.getSobjectType();
            strategy.appendField(locator, this, "sobjectType", buffer, theSobjectType);
        }
        return buffer;
    }

}
