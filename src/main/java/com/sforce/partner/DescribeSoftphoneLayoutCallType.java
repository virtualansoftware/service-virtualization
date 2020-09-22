
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
 * <p>Java class for DescribeSoftphoneLayoutCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoftphoneLayoutCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infoFields" type="{urn:partner.soap.sforce.com}DescribeSoftphoneLayoutInfoField" maxOccurs="unbounded"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="screenPopOptions" type="{urn:partner.soap.sforce.com}DescribeSoftphoneScreenPopOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="screenPopsOpenWithin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sections" type="{urn:partner.soap.sforce.com}DescribeSoftphoneLayoutSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoftphoneLayoutCallType", propOrder = {
    "infoFields",
    "name",
    "screenPopOptions",
    "screenPopsOpenWithin",
    "sections"
})
public class DescribeSoftphoneLayoutCallType
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<DescribeSoftphoneLayoutInfoField> infoFields;
    @XmlElement(required = true)
    protected String name;
    protected List<DescribeSoftphoneScreenPopOption> screenPopOptions;
    protected String screenPopsOpenWithin;
    protected List<DescribeSoftphoneLayoutSection> sections;

    /**
     * Gets the value of the infoFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeSoftphoneLayoutInfoField }
     * 
     * 
     */
    public List<DescribeSoftphoneLayoutInfoField> getInfoFields() {
        if (infoFields == null) {
            infoFields = new ArrayList<DescribeSoftphoneLayoutInfoField>();
        }
        return this.infoFields;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the screenPopOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screenPopOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreenPopOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeSoftphoneScreenPopOption }
     * 
     * 
     */
    public List<DescribeSoftphoneScreenPopOption> getScreenPopOptions() {
        if (screenPopOptions == null) {
            screenPopOptions = new ArrayList<DescribeSoftphoneScreenPopOption>();
        }
        return this.screenPopOptions;
    }

    /**
     * Gets the value of the screenPopsOpenWithin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenPopsOpenWithin() {
        return screenPopsOpenWithin;
    }

    /**
     * Sets the value of the screenPopsOpenWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenPopsOpenWithin(String value) {
        this.screenPopsOpenWithin = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeSoftphoneLayoutSection }
     * 
     * 
     */
    public List<DescribeSoftphoneLayoutSection> getSections() {
        if (sections == null) {
            sections = new ArrayList<DescribeSoftphoneLayoutSection>();
        }
        return this.sections;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSoftphoneLayoutCallType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSoftphoneLayoutCallType that = ((DescribeSoftphoneLayoutCallType) object);
        {
            List<DescribeSoftphoneLayoutInfoField> lhsInfoFields;
            lhsInfoFields = (((this.infoFields!= null)&&(!this.infoFields.isEmpty()))?this.getInfoFields():null);
            List<DescribeSoftphoneLayoutInfoField> rhsInfoFields;
            rhsInfoFields = (((that.infoFields!= null)&&(!that.infoFields.isEmpty()))?that.getInfoFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "infoFields", lhsInfoFields), LocatorUtils.property(thatLocator, "infoFields", rhsInfoFields), lhsInfoFields, rhsInfoFields)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            List<DescribeSoftphoneScreenPopOption> lhsScreenPopOptions;
            lhsScreenPopOptions = (((this.screenPopOptions!= null)&&(!this.screenPopOptions.isEmpty()))?this.getScreenPopOptions():null);
            List<DescribeSoftphoneScreenPopOption> rhsScreenPopOptions;
            rhsScreenPopOptions = (((that.screenPopOptions!= null)&&(!that.screenPopOptions.isEmpty()))?that.getScreenPopOptions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "screenPopOptions", lhsScreenPopOptions), LocatorUtils.property(thatLocator, "screenPopOptions", rhsScreenPopOptions), lhsScreenPopOptions, rhsScreenPopOptions)) {
                return false;
            }
        }
        {
            String lhsScreenPopsOpenWithin;
            lhsScreenPopsOpenWithin = this.getScreenPopsOpenWithin();
            String rhsScreenPopsOpenWithin;
            rhsScreenPopsOpenWithin = that.getScreenPopsOpenWithin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "screenPopsOpenWithin", lhsScreenPopsOpenWithin), LocatorUtils.property(thatLocator, "screenPopsOpenWithin", rhsScreenPopsOpenWithin), lhsScreenPopsOpenWithin, rhsScreenPopsOpenWithin)) {
                return false;
            }
        }
        {
            List<DescribeSoftphoneLayoutSection> lhsSections;
            lhsSections = (((this.sections!= null)&&(!this.sections.isEmpty()))?this.getSections():null);
            List<DescribeSoftphoneLayoutSection> rhsSections;
            rhsSections = (((that.sections!= null)&&(!that.sections.isEmpty()))?that.getSections():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sections", lhsSections), LocatorUtils.property(thatLocator, "sections", rhsSections), lhsSections, rhsSections)) {
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
            List<DescribeSoftphoneLayoutInfoField> theInfoFields;
            theInfoFields = (((this.infoFields!= null)&&(!this.infoFields.isEmpty()))?this.getInfoFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "infoFields", theInfoFields), currentHashCode, theInfoFields);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<DescribeSoftphoneScreenPopOption> theScreenPopOptions;
            theScreenPopOptions = (((this.screenPopOptions!= null)&&(!this.screenPopOptions.isEmpty()))?this.getScreenPopOptions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "screenPopOptions", theScreenPopOptions), currentHashCode, theScreenPopOptions);
        }
        {
            String theScreenPopsOpenWithin;
            theScreenPopsOpenWithin = this.getScreenPopsOpenWithin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "screenPopsOpenWithin", theScreenPopsOpenWithin), currentHashCode, theScreenPopsOpenWithin);
        }
        {
            List<DescribeSoftphoneLayoutSection> theSections;
            theSections = (((this.sections!= null)&&(!this.sections.isEmpty()))?this.getSections():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sections", theSections), currentHashCode, theSections);
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
            List<DescribeSoftphoneLayoutInfoField> theInfoFields;
            theInfoFields = (((this.infoFields!= null)&&(!this.infoFields.isEmpty()))?this.getInfoFields():null);
            strategy.appendField(locator, this, "infoFields", buffer, theInfoFields);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<DescribeSoftphoneScreenPopOption> theScreenPopOptions;
            theScreenPopOptions = (((this.screenPopOptions!= null)&&(!this.screenPopOptions.isEmpty()))?this.getScreenPopOptions():null);
            strategy.appendField(locator, this, "screenPopOptions", buffer, theScreenPopOptions);
        }
        {
            String theScreenPopsOpenWithin;
            theScreenPopsOpenWithin = this.getScreenPopsOpenWithin();
            strategy.appendField(locator, this, "screenPopsOpenWithin", buffer, theScreenPopsOpenWithin);
        }
        {
            List<DescribeSoftphoneLayoutSection> theSections;
            theSections = (((this.sections!= null)&&(!this.sections.isEmpty()))?this.getSections():null);
            strategy.appendField(locator, this, "sections", buffer, theSections);
        }
        return buffer;
    }

}
