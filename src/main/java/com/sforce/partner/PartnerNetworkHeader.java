
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
 *         &lt;element name="connectionId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="partnerEntityIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parentEntityIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "connectionId",
    "partnerEntityIds",
    "parentEntityIds"
})
@XmlRootElement(name = "PartnerNetworkHeader")
public class PartnerNetworkHeader
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String connectionId;
    @XmlElement(nillable = true)
    protected List<String> partnerEntityIds;
    @XmlElement(nillable = true)
    protected List<String> parentEntityIds;

    /**
     * Gets the value of the connectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * Gets the value of the partnerEntityIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerEntityIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerEntityIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartnerEntityIds() {
        if (partnerEntityIds == null) {
            partnerEntityIds = new ArrayList<String>();
        }
        return this.partnerEntityIds;
    }

    /**
     * Gets the value of the parentEntityIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentEntityIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentEntityIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParentEntityIds() {
        if (parentEntityIds == null) {
            parentEntityIds = new ArrayList<String>();
        }
        return this.parentEntityIds;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PartnerNetworkHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PartnerNetworkHeader that = ((PartnerNetworkHeader) object);
        {
            String lhsConnectionId;
            lhsConnectionId = this.getConnectionId();
            String rhsConnectionId;
            rhsConnectionId = that.getConnectionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionId", lhsConnectionId), LocatorUtils.property(thatLocator, "connectionId", rhsConnectionId), lhsConnectionId, rhsConnectionId)) {
                return false;
            }
        }
        {
            List<String> lhsPartnerEntityIds;
            lhsPartnerEntityIds = (((this.partnerEntityIds!= null)&&(!this.partnerEntityIds.isEmpty()))?this.getPartnerEntityIds():null);
            List<String> rhsPartnerEntityIds;
            rhsPartnerEntityIds = (((that.partnerEntityIds!= null)&&(!that.partnerEntityIds.isEmpty()))?that.getPartnerEntityIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerEntityIds", lhsPartnerEntityIds), LocatorUtils.property(thatLocator, "partnerEntityIds", rhsPartnerEntityIds), lhsPartnerEntityIds, rhsPartnerEntityIds)) {
                return false;
            }
        }
        {
            List<String> lhsParentEntityIds;
            lhsParentEntityIds = (((this.parentEntityIds!= null)&&(!this.parentEntityIds.isEmpty()))?this.getParentEntityIds():null);
            List<String> rhsParentEntityIds;
            rhsParentEntityIds = (((that.parentEntityIds!= null)&&(!that.parentEntityIds.isEmpty()))?that.getParentEntityIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentEntityIds", lhsParentEntityIds), LocatorUtils.property(thatLocator, "parentEntityIds", rhsParentEntityIds), lhsParentEntityIds, rhsParentEntityIds)) {
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
            String theConnectionId;
            theConnectionId = this.getConnectionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionId", theConnectionId), currentHashCode, theConnectionId);
        }
        {
            List<String> thePartnerEntityIds;
            thePartnerEntityIds = (((this.partnerEntityIds!= null)&&(!this.partnerEntityIds.isEmpty()))?this.getPartnerEntityIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerEntityIds", thePartnerEntityIds), currentHashCode, thePartnerEntityIds);
        }
        {
            List<String> theParentEntityIds;
            theParentEntityIds = (((this.parentEntityIds!= null)&&(!this.parentEntityIds.isEmpty()))?this.getParentEntityIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentEntityIds", theParentEntityIds), currentHashCode, theParentEntityIds);
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
            String theConnectionId;
            theConnectionId = this.getConnectionId();
            strategy.appendField(locator, this, "connectionId", buffer, theConnectionId);
        }
        {
            List<String> thePartnerEntityIds;
            thePartnerEntityIds = (((this.partnerEntityIds!= null)&&(!this.partnerEntityIds.isEmpty()))?this.getPartnerEntityIds():null);
            strategy.appendField(locator, this, "partnerEntityIds", buffer, thePartnerEntityIds);
        }
        {
            List<String> theParentEntityIds;
            theParentEntityIds = (((this.parentEntityIds!= null)&&(!this.parentEntityIds.isEmpty()))?this.getParentEntityIds():null);
            strategy.appendField(locator, this, "parentEntityIds", buffer, theParentEntityIds);
        }
        return buffer;
    }

}
