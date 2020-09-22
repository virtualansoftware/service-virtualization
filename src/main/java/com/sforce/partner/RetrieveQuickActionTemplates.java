
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
 *         &lt;element name="quickActionNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contextId" type="{urn:partner.soap.sforce.com}ID"/&gt;
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
    "quickActionNames",
    "contextId"
})
@XmlRootElement(name = "retrieveQuickActionTemplates")
public class RetrieveQuickActionTemplates
    implements Equals, HashCode, ToString
{

    protected List<String> quickActionNames;
    @XmlElement(required = true, nillable = true)
    protected String contextId;

    /**
     * Gets the value of the quickActionNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickActionNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickActionNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQuickActionNames() {
        if (quickActionNames == null) {
            quickActionNames = new ArrayList<String>();
        }
        return this.quickActionNames;
    }

    /**
     * Gets the value of the contextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextId() {
        return contextId;
    }

    /**
     * Sets the value of the contextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextId(String value) {
        this.contextId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RetrieveQuickActionTemplates)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RetrieveQuickActionTemplates that = ((RetrieveQuickActionTemplates) object);
        {
            List<String> lhsQuickActionNames;
            lhsQuickActionNames = (((this.quickActionNames!= null)&&(!this.quickActionNames.isEmpty()))?this.getQuickActionNames():null);
            List<String> rhsQuickActionNames;
            rhsQuickActionNames = (((that.quickActionNames!= null)&&(!that.quickActionNames.isEmpty()))?that.getQuickActionNames():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quickActionNames", lhsQuickActionNames), LocatorUtils.property(thatLocator, "quickActionNames", rhsQuickActionNames), lhsQuickActionNames, rhsQuickActionNames)) {
                return false;
            }
        }
        {
            String lhsContextId;
            lhsContextId = this.getContextId();
            String rhsContextId;
            rhsContextId = that.getContextId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextId", lhsContextId), LocatorUtils.property(thatLocator, "contextId", rhsContextId), lhsContextId, rhsContextId)) {
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
            List<String> theQuickActionNames;
            theQuickActionNames = (((this.quickActionNames!= null)&&(!this.quickActionNames.isEmpty()))?this.getQuickActionNames():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quickActionNames", theQuickActionNames), currentHashCode, theQuickActionNames);
        }
        {
            String theContextId;
            theContextId = this.getContextId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextId", theContextId), currentHashCode, theContextId);
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
            List<String> theQuickActionNames;
            theQuickActionNames = (((this.quickActionNames!= null)&&(!this.quickActionNames.isEmpty()))?this.getQuickActionNames():null);
            strategy.appendField(locator, this, "quickActionNames", buffer, theQuickActionNames);
        }
        {
            String theContextId;
            theContextId = this.getContextId();
            strategy.appendField(locator, this, "contextId", buffer, theContextId);
        }
        return buffer;
    }

}
