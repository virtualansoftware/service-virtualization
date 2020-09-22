
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
 *         &lt;element name="quickActionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contextIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "quickActionName",
    "contextIds"
})
@XmlRootElement(name = "retrieveMassQuickActionTemplates")
public class RetrieveMassQuickActionTemplates
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String quickActionName;
    protected List<String> contextIds;

    /**
     * Gets the value of the quickActionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickActionName() {
        return quickActionName;
    }

    /**
     * Sets the value of the quickActionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickActionName(String value) {
        this.quickActionName = value;
    }

    /**
     * Gets the value of the contextIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContextIds() {
        if (contextIds == null) {
            contextIds = new ArrayList<String>();
        }
        return this.contextIds;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RetrieveMassQuickActionTemplates)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RetrieveMassQuickActionTemplates that = ((RetrieveMassQuickActionTemplates) object);
        {
            String lhsQuickActionName;
            lhsQuickActionName = this.getQuickActionName();
            String rhsQuickActionName;
            rhsQuickActionName = that.getQuickActionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quickActionName", lhsQuickActionName), LocatorUtils.property(thatLocator, "quickActionName", rhsQuickActionName), lhsQuickActionName, rhsQuickActionName)) {
                return false;
            }
        }
        {
            List<String> lhsContextIds;
            lhsContextIds = (((this.contextIds!= null)&&(!this.contextIds.isEmpty()))?this.getContextIds():null);
            List<String> rhsContextIds;
            rhsContextIds = (((that.contextIds!= null)&&(!that.contextIds.isEmpty()))?that.getContextIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextIds", lhsContextIds), LocatorUtils.property(thatLocator, "contextIds", rhsContextIds), lhsContextIds, rhsContextIds)) {
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
            String theQuickActionName;
            theQuickActionName = this.getQuickActionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quickActionName", theQuickActionName), currentHashCode, theQuickActionName);
        }
        {
            List<String> theContextIds;
            theContextIds = (((this.contextIds!= null)&&(!this.contextIds.isEmpty()))?this.getContextIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextIds", theContextIds), currentHashCode, theContextIds);
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
            String theQuickActionName;
            theQuickActionName = this.getQuickActionName();
            strategy.appendField(locator, this, "quickActionName", buffer, theQuickActionName);
        }
        {
            List<String> theContextIds;
            theContextIds = (((this.contextIds!= null)&&(!this.contextIds.isEmpty()))?this.getContextIds():null);
            strategy.appendField(locator, this, "contextIds", buffer, theContextIds);
        }
        return buffer;
    }

}
