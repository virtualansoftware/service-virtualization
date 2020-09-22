
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
 *         &lt;element name="settingNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="settingValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
    "settingNames",
    "settingValues"
})
@XmlRootElement(name = "updateSettings")
public class UpdateSettings
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<String> settingNames;
    @XmlElement(required = true)
    protected List<String> settingValues;

    /**
     * Gets the value of the settingNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settingNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettingNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSettingNames() {
        if (settingNames == null) {
            settingNames = new ArrayList<String>();
        }
        return this.settingNames;
    }

    /**
     * Gets the value of the settingValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settingValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettingValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSettingValues() {
        if (settingValues == null) {
            settingValues = new ArrayList<String>();
        }
        return this.settingValues;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UpdateSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UpdateSettings that = ((UpdateSettings) object);
        {
            List<String> lhsSettingNames;
            lhsSettingNames = (((this.settingNames!= null)&&(!this.settingNames.isEmpty()))?this.getSettingNames():null);
            List<String> rhsSettingNames;
            rhsSettingNames = (((that.settingNames!= null)&&(!that.settingNames.isEmpty()))?that.getSettingNames():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settingNames", lhsSettingNames), LocatorUtils.property(thatLocator, "settingNames", rhsSettingNames), lhsSettingNames, rhsSettingNames)) {
                return false;
            }
        }
        {
            List<String> lhsSettingValues;
            lhsSettingValues = (((this.settingValues!= null)&&(!this.settingValues.isEmpty()))?this.getSettingValues():null);
            List<String> rhsSettingValues;
            rhsSettingValues = (((that.settingValues!= null)&&(!that.settingValues.isEmpty()))?that.getSettingValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settingValues", lhsSettingValues), LocatorUtils.property(thatLocator, "settingValues", rhsSettingValues), lhsSettingValues, rhsSettingValues)) {
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
            List<String> theSettingNames;
            theSettingNames = (((this.settingNames!= null)&&(!this.settingNames.isEmpty()))?this.getSettingNames():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settingNames", theSettingNames), currentHashCode, theSettingNames);
        }
        {
            List<String> theSettingValues;
            theSettingValues = (((this.settingValues!= null)&&(!this.settingValues.isEmpty()))?this.getSettingValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settingValues", theSettingValues), currentHashCode, theSettingValues);
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
            List<String> theSettingNames;
            theSettingNames = (((this.settingNames!= null)&&(!this.settingNames.isEmpty()))?this.getSettingNames():null);
            strategy.appendField(locator, this, "settingNames", buffer, theSettingNames);
        }
        {
            List<String> theSettingValues;
            theSettingValues = (((this.settingValues!= null)&&(!this.settingValues.isEmpty()))?this.getSettingValues():null);
            strategy.appendField(locator, this, "settingValues", buffer, theSettingValues);
        }
        return buffer;
    }

}
