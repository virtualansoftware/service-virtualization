
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
 * <p>Java class for DescribePathAssistantStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribePathAssistantStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="converted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fields" type="{urn:partner.soap.sforce.com}DescribePathAssistantField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="layoutSection" type="{urn:partner.soap.sforce.com}DescribeLayoutSection"/&gt;
 *         &lt;element name="picklistLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="picklistValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="won" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribePathAssistantStep", propOrder = {
    "closed",
    "converted",
    "fields",
    "info",
    "layoutSection",
    "picklistLabel",
    "picklistValue",
    "won"
})
public class DescribePathAssistantStep
    implements Equals, HashCode, ToString
{

    protected boolean closed;
    protected boolean converted;
    protected List<DescribePathAssistantField> fields;
    @XmlElement(required = true, nillable = true)
    protected String info;
    @XmlElement(required = true, nillable = true)
    protected DescribeLayoutSection layoutSection;
    @XmlElement(required = true)
    protected String picklistLabel;
    @XmlElement(required = true)
    protected String picklistValue;
    protected boolean won;

    /**
     * Gets the value of the closed property.
     * 
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the converted property.
     * 
     */
    public boolean isConverted() {
        return converted;
    }

    /**
     * Sets the value of the converted property.
     * 
     */
    public void setConverted(boolean value) {
        this.converted = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribePathAssistantField }
     * 
     * 
     */
    public List<DescribePathAssistantField> getFields() {
        if (fields == null) {
            fields = new ArrayList<DescribePathAssistantField>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the layoutSection property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutSection }
     *     
     */
    public DescribeLayoutSection getLayoutSection() {
        return layoutSection;
    }

    /**
     * Sets the value of the layoutSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutSection }
     *     
     */
    public void setLayoutSection(DescribeLayoutSection value) {
        this.layoutSection = value;
    }

    /**
     * Gets the value of the picklistLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicklistLabel() {
        return picklistLabel;
    }

    /**
     * Sets the value of the picklistLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicklistLabel(String value) {
        this.picklistLabel = value;
    }

    /**
     * Gets the value of the picklistValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicklistValue() {
        return picklistValue;
    }

    /**
     * Sets the value of the picklistValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicklistValue(String value) {
        this.picklistValue = value;
    }

    /**
     * Gets the value of the won property.
     * 
     */
    public boolean isWon() {
        return won;
    }

    /**
     * Sets the value of the won property.
     * 
     */
    public void setWon(boolean value) {
        this.won = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribePathAssistantStep)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribePathAssistantStep that = ((DescribePathAssistantStep) object);
        {
            boolean lhsClosed;
            lhsClosed = (true?this.isClosed():false);
            boolean rhsClosed;
            rhsClosed = (true?that.isClosed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "closed", lhsClosed), LocatorUtils.property(thatLocator, "closed", rhsClosed), lhsClosed, rhsClosed)) {
                return false;
            }
        }
        {
            boolean lhsConverted;
            lhsConverted = (true?this.isConverted():false);
            boolean rhsConverted;
            rhsConverted = (true?that.isConverted():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "converted", lhsConverted), LocatorUtils.property(thatLocator, "converted", rhsConverted), lhsConverted, rhsConverted)) {
                return false;
            }
        }
        {
            List<DescribePathAssistantField> lhsFields;
            lhsFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            List<DescribePathAssistantField> rhsFields;
            rhsFields = (((that.fields!= null)&&(!that.fields.isEmpty()))?that.getFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields)) {
                return false;
            }
        }
        {
            String lhsInfo;
            lhsInfo = this.getInfo();
            String rhsInfo;
            rhsInfo = that.getInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "info", lhsInfo), LocatorUtils.property(thatLocator, "info", rhsInfo), lhsInfo, rhsInfo)) {
                return false;
            }
        }
        {
            DescribeLayoutSection lhsLayoutSection;
            lhsLayoutSection = this.getLayoutSection();
            DescribeLayoutSection rhsLayoutSection;
            rhsLayoutSection = that.getLayoutSection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutSection", lhsLayoutSection), LocatorUtils.property(thatLocator, "layoutSection", rhsLayoutSection), lhsLayoutSection, rhsLayoutSection)) {
                return false;
            }
        }
        {
            String lhsPicklistLabel;
            lhsPicklistLabel = this.getPicklistLabel();
            String rhsPicklistLabel;
            rhsPicklistLabel = that.getPicklistLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picklistLabel", lhsPicklistLabel), LocatorUtils.property(thatLocator, "picklistLabel", rhsPicklistLabel), lhsPicklistLabel, rhsPicklistLabel)) {
                return false;
            }
        }
        {
            String lhsPicklistValue;
            lhsPicklistValue = this.getPicklistValue();
            String rhsPicklistValue;
            rhsPicklistValue = that.getPicklistValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "picklistValue", lhsPicklistValue), LocatorUtils.property(thatLocator, "picklistValue", rhsPicklistValue), lhsPicklistValue, rhsPicklistValue)) {
                return false;
            }
        }
        {
            boolean lhsWon;
            lhsWon = (true?this.isWon():false);
            boolean rhsWon;
            rhsWon = (true?that.isWon():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "won", lhsWon), LocatorUtils.property(thatLocator, "won", rhsWon), lhsWon, rhsWon)) {
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
            boolean theClosed;
            theClosed = (true?this.isClosed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "closed", theClosed), currentHashCode, theClosed);
        }
        {
            boolean theConverted;
            theConverted = (true?this.isConverted():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "converted", theConverted), currentHashCode, theConverted);
        }
        {
            List<DescribePathAssistantField> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fields", theFields), currentHashCode, theFields);
        }
        {
            String theInfo;
            theInfo = this.getInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "info", theInfo), currentHashCode, theInfo);
        }
        {
            DescribeLayoutSection theLayoutSection;
            theLayoutSection = this.getLayoutSection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layoutSection", theLayoutSection), currentHashCode, theLayoutSection);
        }
        {
            String thePicklistLabel;
            thePicklistLabel = this.getPicklistLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistLabel", thePicklistLabel), currentHashCode, thePicklistLabel);
        }
        {
            String thePicklistValue;
            thePicklistValue = this.getPicklistValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "picklistValue", thePicklistValue), currentHashCode, thePicklistValue);
        }
        {
            boolean theWon;
            theWon = (true?this.isWon():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "won", theWon), currentHashCode, theWon);
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
            boolean theClosed;
            theClosed = (true?this.isClosed():false);
            strategy.appendField(locator, this, "closed", buffer, theClosed);
        }
        {
            boolean theConverted;
            theConverted = (true?this.isConverted():false);
            strategy.appendField(locator, this, "converted", buffer, theConverted);
        }
        {
            List<DescribePathAssistantField> theFields;
            theFields = (((this.fields!= null)&&(!this.fields.isEmpty()))?this.getFields():null);
            strategy.appendField(locator, this, "fields", buffer, theFields);
        }
        {
            String theInfo;
            theInfo = this.getInfo();
            strategy.appendField(locator, this, "info", buffer, theInfo);
        }
        {
            DescribeLayoutSection theLayoutSection;
            theLayoutSection = this.getLayoutSection();
            strategy.appendField(locator, this, "layoutSection", buffer, theLayoutSection);
        }
        {
            String thePicklistLabel;
            thePicklistLabel = this.getPicklistLabel();
            strategy.appendField(locator, this, "picklistLabel", buffer, thePicklistLabel);
        }
        {
            String thePicklistValue;
            thePicklistValue = this.getPicklistValue();
            strategy.appendField(locator, this, "picklistValue", buffer, thePicklistValue);
        }
        {
            boolean theWon;
            theWon = (true?this.isWon():false);
            strategy.appendField(locator, this, "won", buffer, theWon);
        }
        return buffer;
    }

}
