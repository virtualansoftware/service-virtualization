
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
 * <p>Java class for DescribeCompactLayoutsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeCompactLayoutsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compactLayouts" type="{urn:partner.soap.sforce.com}DescribeCompactLayout" maxOccurs="unbounded"/&gt;
 *         &lt;element name="defaultCompactLayoutId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="recordTypeCompactLayoutMappings" type="{urn:partner.soap.sforce.com}RecordTypeCompactLayoutMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeCompactLayoutsResult", propOrder = {
    "compactLayouts",
    "defaultCompactLayoutId",
    "recordTypeCompactLayoutMappings"
})
public class DescribeCompactLayoutsResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<DescribeCompactLayout> compactLayouts;
    @XmlElement(required = true)
    protected String defaultCompactLayoutId;
    protected List<RecordTypeCompactLayoutMapping> recordTypeCompactLayoutMappings;

    /**
     * Gets the value of the compactLayouts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compactLayouts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompactLayouts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeCompactLayout }
     * 
     * 
     */
    public List<DescribeCompactLayout> getCompactLayouts() {
        if (compactLayouts == null) {
            compactLayouts = new ArrayList<DescribeCompactLayout>();
        }
        return this.compactLayouts;
    }

    /**
     * Gets the value of the defaultCompactLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCompactLayoutId() {
        return defaultCompactLayoutId;
    }

    /**
     * Sets the value of the defaultCompactLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCompactLayoutId(String value) {
        this.defaultCompactLayoutId = value;
    }

    /**
     * Gets the value of the recordTypeCompactLayoutMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTypeCompactLayoutMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTypeCompactLayoutMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordTypeCompactLayoutMapping }
     * 
     * 
     */
    public List<RecordTypeCompactLayoutMapping> getRecordTypeCompactLayoutMappings() {
        if (recordTypeCompactLayoutMappings == null) {
            recordTypeCompactLayoutMappings = new ArrayList<RecordTypeCompactLayoutMapping>();
        }
        return this.recordTypeCompactLayoutMappings;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeCompactLayoutsResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeCompactLayoutsResult that = ((DescribeCompactLayoutsResult) object);
        {
            List<DescribeCompactLayout> lhsCompactLayouts;
            lhsCompactLayouts = (((this.compactLayouts!= null)&&(!this.compactLayouts.isEmpty()))?this.getCompactLayouts():null);
            List<DescribeCompactLayout> rhsCompactLayouts;
            rhsCompactLayouts = (((that.compactLayouts!= null)&&(!that.compactLayouts.isEmpty()))?that.getCompactLayouts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compactLayouts", lhsCompactLayouts), LocatorUtils.property(thatLocator, "compactLayouts", rhsCompactLayouts), lhsCompactLayouts, rhsCompactLayouts)) {
                return false;
            }
        }
        {
            String lhsDefaultCompactLayoutId;
            lhsDefaultCompactLayoutId = this.getDefaultCompactLayoutId();
            String rhsDefaultCompactLayoutId;
            rhsDefaultCompactLayoutId = that.getDefaultCompactLayoutId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultCompactLayoutId", lhsDefaultCompactLayoutId), LocatorUtils.property(thatLocator, "defaultCompactLayoutId", rhsDefaultCompactLayoutId), lhsDefaultCompactLayoutId, rhsDefaultCompactLayoutId)) {
                return false;
            }
        }
        {
            List<RecordTypeCompactLayoutMapping> lhsRecordTypeCompactLayoutMappings;
            lhsRecordTypeCompactLayoutMappings = (((this.recordTypeCompactLayoutMappings!= null)&&(!this.recordTypeCompactLayoutMappings.isEmpty()))?this.getRecordTypeCompactLayoutMappings():null);
            List<RecordTypeCompactLayoutMapping> rhsRecordTypeCompactLayoutMappings;
            rhsRecordTypeCompactLayoutMappings = (((that.recordTypeCompactLayoutMappings!= null)&&(!that.recordTypeCompactLayoutMappings.isEmpty()))?that.getRecordTypeCompactLayoutMappings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeCompactLayoutMappings", lhsRecordTypeCompactLayoutMappings), LocatorUtils.property(thatLocator, "recordTypeCompactLayoutMappings", rhsRecordTypeCompactLayoutMappings), lhsRecordTypeCompactLayoutMappings, rhsRecordTypeCompactLayoutMappings)) {
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
            List<DescribeCompactLayout> theCompactLayouts;
            theCompactLayouts = (((this.compactLayouts!= null)&&(!this.compactLayouts.isEmpty()))?this.getCompactLayouts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compactLayouts", theCompactLayouts), currentHashCode, theCompactLayouts);
        }
        {
            String theDefaultCompactLayoutId;
            theDefaultCompactLayoutId = this.getDefaultCompactLayoutId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultCompactLayoutId", theDefaultCompactLayoutId), currentHashCode, theDefaultCompactLayoutId);
        }
        {
            List<RecordTypeCompactLayoutMapping> theRecordTypeCompactLayoutMappings;
            theRecordTypeCompactLayoutMappings = (((this.recordTypeCompactLayoutMappings!= null)&&(!this.recordTypeCompactLayoutMappings.isEmpty()))?this.getRecordTypeCompactLayoutMappings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeCompactLayoutMappings", theRecordTypeCompactLayoutMappings), currentHashCode, theRecordTypeCompactLayoutMappings);
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
            List<DescribeCompactLayout> theCompactLayouts;
            theCompactLayouts = (((this.compactLayouts!= null)&&(!this.compactLayouts.isEmpty()))?this.getCompactLayouts():null);
            strategy.appendField(locator, this, "compactLayouts", buffer, theCompactLayouts);
        }
        {
            String theDefaultCompactLayoutId;
            theDefaultCompactLayoutId = this.getDefaultCompactLayoutId();
            strategy.appendField(locator, this, "defaultCompactLayoutId", buffer, theDefaultCompactLayoutId);
        }
        {
            List<RecordTypeCompactLayoutMapping> theRecordTypeCompactLayoutMappings;
            theRecordTypeCompactLayoutMappings = (((this.recordTypeCompactLayoutMappings!= null)&&(!this.recordTypeCompactLayoutMappings.isEmpty()))?this.getRecordTypeCompactLayoutMappings():null);
            strategy.appendField(locator, this, "recordTypeCompactLayoutMappings", buffer, theRecordTypeCompactLayoutMappings);
        }
        return buffer;
    }

}
