
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
 * <p>Java class for DescribeLayoutResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="layouts" type="{urn:partner.soap.sforce.com}DescribeLayout" maxOccurs="unbounded"/&gt;
 *         &lt;element name="recordTypeMappings" type="{urn:partner.soap.sforce.com}RecordTypeMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordTypeSelectorRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutResult", propOrder = {
    "layouts",
    "recordTypeMappings",
    "recordTypeSelectorRequired"
})
public class DescribeLayoutResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<DescribeLayout2> layouts;
    protected List<RecordTypeMapping> recordTypeMappings;
    protected boolean recordTypeSelectorRequired;

    /**
     * Gets the value of the layouts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layouts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayouts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayout2 }
     * 
     * 
     */
    public List<DescribeLayout2> getLayouts() {
        if (layouts == null) {
            layouts = new ArrayList<DescribeLayout2>();
        }
        return this.layouts;
    }

    /**
     * Gets the value of the recordTypeMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTypeMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTypeMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordTypeMapping }
     * 
     * 
     */
    public List<RecordTypeMapping> getRecordTypeMappings() {
        if (recordTypeMappings == null) {
            recordTypeMappings = new ArrayList<RecordTypeMapping>();
        }
        return this.recordTypeMappings;
    }

    /**
     * Gets the value of the recordTypeSelectorRequired property.
     * 
     */
    public boolean isRecordTypeSelectorRequired() {
        return recordTypeSelectorRequired;
    }

    /**
     * Sets the value of the recordTypeSelectorRequired property.
     * 
     */
    public void setRecordTypeSelectorRequired(boolean value) {
        this.recordTypeSelectorRequired = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayoutResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayoutResult that = ((DescribeLayoutResult) object);
        {
            List<DescribeLayout2> lhsLayouts;
            lhsLayouts = (((this.layouts!= null)&&(!this.layouts.isEmpty()))?this.getLayouts():null);
            List<DescribeLayout2> rhsLayouts;
            rhsLayouts = (((that.layouts!= null)&&(!that.layouts.isEmpty()))?that.getLayouts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layouts", lhsLayouts), LocatorUtils.property(thatLocator, "layouts", rhsLayouts), lhsLayouts, rhsLayouts)) {
                return false;
            }
        }
        {
            List<RecordTypeMapping> lhsRecordTypeMappings;
            lhsRecordTypeMappings = (((this.recordTypeMappings!= null)&&(!this.recordTypeMappings.isEmpty()))?this.getRecordTypeMappings():null);
            List<RecordTypeMapping> rhsRecordTypeMappings;
            rhsRecordTypeMappings = (((that.recordTypeMappings!= null)&&(!that.recordTypeMappings.isEmpty()))?that.getRecordTypeMappings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeMappings", lhsRecordTypeMappings), LocatorUtils.property(thatLocator, "recordTypeMappings", rhsRecordTypeMappings), lhsRecordTypeMappings, rhsRecordTypeMappings)) {
                return false;
            }
        }
        {
            boolean lhsRecordTypeSelectorRequired;
            lhsRecordTypeSelectorRequired = (true?this.isRecordTypeSelectorRequired():false);
            boolean rhsRecordTypeSelectorRequired;
            rhsRecordTypeSelectorRequired = (true?that.isRecordTypeSelectorRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordTypeSelectorRequired", lhsRecordTypeSelectorRequired), LocatorUtils.property(thatLocator, "recordTypeSelectorRequired", rhsRecordTypeSelectorRequired), lhsRecordTypeSelectorRequired, rhsRecordTypeSelectorRequired)) {
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
            List<DescribeLayout2> theLayouts;
            theLayouts = (((this.layouts!= null)&&(!this.layouts.isEmpty()))?this.getLayouts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layouts", theLayouts), currentHashCode, theLayouts);
        }
        {
            List<RecordTypeMapping> theRecordTypeMappings;
            theRecordTypeMappings = (((this.recordTypeMappings!= null)&&(!this.recordTypeMappings.isEmpty()))?this.getRecordTypeMappings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeMappings", theRecordTypeMappings), currentHashCode, theRecordTypeMappings);
        }
        {
            boolean theRecordTypeSelectorRequired;
            theRecordTypeSelectorRequired = (true?this.isRecordTypeSelectorRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordTypeSelectorRequired", theRecordTypeSelectorRequired), currentHashCode, theRecordTypeSelectorRequired);
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
            List<DescribeLayout2> theLayouts;
            theLayouts = (((this.layouts!= null)&&(!this.layouts.isEmpty()))?this.getLayouts():null);
            strategy.appendField(locator, this, "layouts", buffer, theLayouts);
        }
        {
            List<RecordTypeMapping> theRecordTypeMappings;
            theRecordTypeMappings = (((this.recordTypeMappings!= null)&&(!this.recordTypeMappings.isEmpty()))?this.getRecordTypeMappings():null);
            strategy.appendField(locator, this, "recordTypeMappings", buffer, theRecordTypeMappings);
        }
        {
            boolean theRecordTypeSelectorRequired;
            theRecordTypeSelectorRequired = (true?this.isRecordTypeSelectorRequired():false);
            strategy.appendField(locator, this, "recordTypeSelectorRequired", buffer, theRecordTypeSelectorRequired);
        }
        return buffer;
    }

}
