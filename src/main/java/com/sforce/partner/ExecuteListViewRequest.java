
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
 * <p>Java class for ExecuteListViewRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteListViewRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="developerNameOrId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderBy" type="{urn:partner.soap.sforce.com}ListViewOrderBy" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ExecuteListViewRequest", propOrder = {
    "developerNameOrId",
    "limit",
    "offset",
    "orderBies",
    "sobjectType"
})
public class ExecuteListViewRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String developerNameOrId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer limit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer offset;
    @XmlElement(name = "orderBy", required = true)
    protected List<ListViewOrderBy> orderBies;
    @XmlElement(required = true)
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
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * Gets the value of the orderBies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListViewOrderBy }
     * 
     * 
     */
    public List<ListViewOrderBy> getOrderBies() {
        if (orderBies == null) {
            orderBies = new ArrayList<ListViewOrderBy>();
        }
        return this.orderBies;
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
        if (!(object instanceof ExecuteListViewRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExecuteListViewRequest that = ((ExecuteListViewRequest) object);
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
            Integer lhsLimit;
            lhsLimit = this.getLimit();
            Integer rhsLimit;
            rhsLimit = that.getLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limit", lhsLimit), LocatorUtils.property(thatLocator, "limit", rhsLimit), lhsLimit, rhsLimit)) {
                return false;
            }
        }
        {
            Integer lhsOffset;
            lhsOffset = this.getOffset();
            Integer rhsOffset;
            rhsOffset = that.getOffset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offset", lhsOffset), LocatorUtils.property(thatLocator, "offset", rhsOffset), lhsOffset, rhsOffset)) {
                return false;
            }
        }
        {
            List<ListViewOrderBy> lhsOrderBies;
            lhsOrderBies = (((this.orderBies!= null)&&(!this.orderBies.isEmpty()))?this.getOrderBies():null);
            List<ListViewOrderBy> rhsOrderBies;
            rhsOrderBies = (((that.orderBies!= null)&&(!that.orderBies.isEmpty()))?that.getOrderBies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderBies", lhsOrderBies), LocatorUtils.property(thatLocator, "orderBies", rhsOrderBies), lhsOrderBies, rhsOrderBies)) {
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
            Integer theLimit;
            theLimit = this.getLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limit", theLimit), currentHashCode, theLimit);
        }
        {
            Integer theOffset;
            theOffset = this.getOffset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offset", theOffset), currentHashCode, theOffset);
        }
        {
            List<ListViewOrderBy> theOrderBies;
            theOrderBies = (((this.orderBies!= null)&&(!this.orderBies.isEmpty()))?this.getOrderBies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderBies", theOrderBies), currentHashCode, theOrderBies);
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
            Integer theLimit;
            theLimit = this.getLimit();
            strategy.appendField(locator, this, "limit", buffer, theLimit);
        }
        {
            Integer theOffset;
            theOffset = this.getOffset();
            strategy.appendField(locator, this, "offset", buffer, theOffset);
        }
        {
            List<ListViewOrderBy> theOrderBies;
            theOrderBies = (((this.orderBies!= null)&&(!this.orderBies.isEmpty()))?this.getOrderBies():null);
            strategy.appendField(locator, this, "orderBies", buffer, theOrderBies);
        }
        {
            String theSobjectType;
            theSobjectType = this.getSobjectType();
            strategy.appendField(locator, this, "sobjectType", buffer, theSobjectType);
        }
        return buffer;
    }

}
