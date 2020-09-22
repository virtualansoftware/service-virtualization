
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
 *         &lt;element name="sObjects" type="{urn:sobject.partner.soap.sforce.com}sObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchOptions" type="{urn:partner.soap.sforce.com}MatchOptions"/&gt;
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
    "sObjects",
    "matchOptions"
})
@XmlRootElement(name = "match")
public class Match
    implements Equals, HashCode, ToString
{

    protected List<SObject> sObjects;
    @XmlElement(required = true)
    protected MatchOptions matchOptions;

    /**
     * Gets the value of the sObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SObject }
     * 
     * 
     */
    public List<SObject> getSObjects() {
        if (sObjects == null) {
            sObjects = new ArrayList<SObject>();
        }
        return this.sObjects;
    }

    /**
     * Gets the value of the matchOptions property.
     * 
     * @return
     *     possible object is
     *     {@link MatchOptions }
     *     
     */
    public MatchOptions getMatchOptions() {
        return matchOptions;
    }

    /**
     * Sets the value of the matchOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchOptions }
     *     
     */
    public void setMatchOptions(MatchOptions value) {
        this.matchOptions = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Match)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Match that = ((Match) object);
        {
            List<SObject> lhsSObjects;
            lhsSObjects = (((this.sObjects!= null)&&(!this.sObjects.isEmpty()))?this.getSObjects():null);
            List<SObject> rhsSObjects;
            rhsSObjects = (((that.sObjects!= null)&&(!that.sObjects.isEmpty()))?that.getSObjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sObjects", lhsSObjects), LocatorUtils.property(thatLocator, "sObjects", rhsSObjects), lhsSObjects, rhsSObjects)) {
                return false;
            }
        }
        {
            MatchOptions lhsMatchOptions;
            lhsMatchOptions = this.getMatchOptions();
            MatchOptions rhsMatchOptions;
            rhsMatchOptions = that.getMatchOptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchOptions", lhsMatchOptions), LocatorUtils.property(thatLocator, "matchOptions", rhsMatchOptions), lhsMatchOptions, rhsMatchOptions)) {
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
            List<SObject> theSObjects;
            theSObjects = (((this.sObjects!= null)&&(!this.sObjects.isEmpty()))?this.getSObjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObjects", theSObjects), currentHashCode, theSObjects);
        }
        {
            MatchOptions theMatchOptions;
            theMatchOptions = this.getMatchOptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matchOptions", theMatchOptions), currentHashCode, theMatchOptions);
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
            List<SObject> theSObjects;
            theSObjects = (((this.sObjects!= null)&&(!this.sObjects.isEmpty()))?this.getSObjects():null);
            strategy.appendField(locator, this, "sObjects", buffer, theSObjects);
        }
        {
            MatchOptions theMatchOptions;
            theMatchOptions = this.getMatchOptions();
            strategy.appendField(locator, this, "matchOptions", buffer, theMatchOptions);
        }
        return buffer;
    }

}
