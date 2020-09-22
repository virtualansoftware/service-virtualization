
package com.sforce.apex;

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
 * <p>Java class for WsdlToApexInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsdlToApexInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mapping" type="{http://soap.sforce.com/2006/08/apex}NamespacePackagePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="wsdl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsdlToApexInfo", propOrder = {
    "mappings",
    "wsdl"
})
public class WsdlToApexInfo
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "mapping")
    protected List<NamespacePackagePair> mappings;
    @XmlElement(required = true)
    protected String wsdl;

    /**
     * Gets the value of the mappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamespacePackagePair }
     * 
     * 
     */
    public List<NamespacePackagePair> getMappings() {
        if (mappings == null) {
            mappings = new ArrayList<NamespacePackagePair>();
        }
        return this.mappings;
    }

    /**
     * Gets the value of the wsdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdl() {
        return wsdl;
    }

    /**
     * Sets the value of the wsdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdl(String value) {
        this.wsdl = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WsdlToApexInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WsdlToApexInfo that = ((WsdlToApexInfo) object);
        {
            List<NamespacePackagePair> lhsMappings;
            lhsMappings = (((this.mappings!= null)&&(!this.mappings.isEmpty()))?this.getMappings():null);
            List<NamespacePackagePair> rhsMappings;
            rhsMappings = (((that.mappings!= null)&&(!that.mappings.isEmpty()))?that.getMappings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mappings", lhsMappings), LocatorUtils.property(thatLocator, "mappings", rhsMappings), lhsMappings, rhsMappings)) {
                return false;
            }
        }
        {
            String lhsWsdl;
            lhsWsdl = this.getWsdl();
            String rhsWsdl;
            rhsWsdl = that.getWsdl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wsdl", lhsWsdl), LocatorUtils.property(thatLocator, "wsdl", rhsWsdl), lhsWsdl, rhsWsdl)) {
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
            List<NamespacePackagePair> theMappings;
            theMappings = (((this.mappings!= null)&&(!this.mappings.isEmpty()))?this.getMappings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mappings", theMappings), currentHashCode, theMappings);
        }
        {
            String theWsdl;
            theWsdl = this.getWsdl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wsdl", theWsdl), currentHashCode, theWsdl);
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
            List<NamespacePackagePair> theMappings;
            theMappings = (((this.mappings!= null)&&(!this.mappings.isEmpty()))?this.getMappings():null);
            strategy.appendField(locator, this, "mappings", buffer, theMappings);
        }
        {
            String theWsdl;
            theWsdl = this.getWsdl();
            strategy.appendField(locator, this, "wsdl", buffer, theWsdl);
        }
        return buffer;
    }

}
