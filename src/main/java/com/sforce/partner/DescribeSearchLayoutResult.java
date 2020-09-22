
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
 * <p>Java class for DescribeSearchLayoutResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSearchLayoutResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="limitRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="searchColumns" type="{urn:partner.soap.sforce.com}DescribeColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSearchLayoutResult", propOrder = {
    "errorMsg",
    "label",
    "limitRows",
    "objectType",
    "searchColumns"
})
public class DescribeSearchLayoutResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String errorMsg;
    @XmlElement(required = true, nillable = true)
    protected String label;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer limitRows;
    @XmlElement(required = true)
    protected String objectType;
    @XmlElement(nillable = true)
    protected List<DescribeColumn> searchColumns;

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
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
     * Gets the value of the limitRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimitRows() {
        return limitRows;
    }

    /**
     * Sets the value of the limitRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimitRows(Integer value) {
        this.limitRows = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the searchColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeColumn }
     * 
     * 
     */
    public List<DescribeColumn> getSearchColumns() {
        if (searchColumns == null) {
            searchColumns = new ArrayList<DescribeColumn>();
        }
        return this.searchColumns;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSearchLayoutResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSearchLayoutResult that = ((DescribeSearchLayoutResult) object);
        {
            String lhsErrorMsg;
            lhsErrorMsg = this.getErrorMsg();
            String rhsErrorMsg;
            rhsErrorMsg = that.getErrorMsg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorMsg", lhsErrorMsg), LocatorUtils.property(thatLocator, "errorMsg", rhsErrorMsg), lhsErrorMsg, rhsErrorMsg)) {
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
            Integer lhsLimitRows;
            lhsLimitRows = this.getLimitRows();
            Integer rhsLimitRows;
            rhsLimitRows = that.getLimitRows();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limitRows", lhsLimitRows), LocatorUtils.property(thatLocator, "limitRows", rhsLimitRows), lhsLimitRows, rhsLimitRows)) {
                return false;
            }
        }
        {
            String lhsObjectType;
            lhsObjectType = this.getObjectType();
            String rhsObjectType;
            rhsObjectType = that.getObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectType", lhsObjectType), LocatorUtils.property(thatLocator, "objectType", rhsObjectType), lhsObjectType, rhsObjectType)) {
                return false;
            }
        }
        {
            List<DescribeColumn> lhsSearchColumns;
            lhsSearchColumns = (((this.searchColumns!= null)&&(!this.searchColumns.isEmpty()))?this.getSearchColumns():null);
            List<DescribeColumn> rhsSearchColumns;
            rhsSearchColumns = (((that.searchColumns!= null)&&(!that.searchColumns.isEmpty()))?that.getSearchColumns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchColumns", lhsSearchColumns), LocatorUtils.property(thatLocator, "searchColumns", rhsSearchColumns), lhsSearchColumns, rhsSearchColumns)) {
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
            String theErrorMsg;
            theErrorMsg = this.getErrorMsg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorMsg", theErrorMsg), currentHashCode, theErrorMsg);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            Integer theLimitRows;
            theLimitRows = this.getLimitRows();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limitRows", theLimitRows), currentHashCode, theLimitRows);
        }
        {
            String theObjectType;
            theObjectType = this.getObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectType", theObjectType), currentHashCode, theObjectType);
        }
        {
            List<DescribeColumn> theSearchColumns;
            theSearchColumns = (((this.searchColumns!= null)&&(!this.searchColumns.isEmpty()))?this.getSearchColumns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchColumns", theSearchColumns), currentHashCode, theSearchColumns);
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
            String theErrorMsg;
            theErrorMsg = this.getErrorMsg();
            strategy.appendField(locator, this, "errorMsg", buffer, theErrorMsg);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            Integer theLimitRows;
            theLimitRows = this.getLimitRows();
            strategy.appendField(locator, this, "limitRows", buffer, theLimitRows);
        }
        {
            String theObjectType;
            theObjectType = this.getObjectType();
            strategy.appendField(locator, this, "objectType", buffer, theObjectType);
        }
        {
            List<DescribeColumn> theSearchColumns;
            theSearchColumns = (((this.searchColumns!= null)&&(!this.searchColumns.isEmpty()))?this.getSearchColumns():null);
            strategy.appendField(locator, this, "searchColumns", buffer, theSearchColumns);
        }
        return buffer;
    }

}
