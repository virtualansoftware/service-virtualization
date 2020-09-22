
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
 *         &lt;element name="externalIDFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sObjects" type="{urn:sobject.partner.soap.sforce.com}sObject" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "externalIDFieldName",
    "sObjects"
})
@XmlRootElement(name = "upsert")
public class Upsert
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String externalIDFieldName;
    protected List<SObject> sObjects;

    /**
     * Gets the value of the externalIDFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalIDFieldName() {
        return externalIDFieldName;
    }

    /**
     * Sets the value of the externalIDFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalIDFieldName(String value) {
        this.externalIDFieldName = value;
    }

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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Upsert)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Upsert that = ((Upsert) object);
        {
            String lhsExternalIDFieldName;
            lhsExternalIDFieldName = this.getExternalIDFieldName();
            String rhsExternalIDFieldName;
            rhsExternalIDFieldName = that.getExternalIDFieldName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalIDFieldName", lhsExternalIDFieldName), LocatorUtils.property(thatLocator, "externalIDFieldName", rhsExternalIDFieldName), lhsExternalIDFieldName, rhsExternalIDFieldName)) {
                return false;
            }
        }
        {
            List<SObject> lhsSObjects;
            lhsSObjects = (((this.sObjects!= null)&&(!this.sObjects.isEmpty()))?this.getSObjects():null);
            List<SObject> rhsSObjects;
            rhsSObjects = (((that.sObjects!= null)&&(!that.sObjects.isEmpty()))?that.getSObjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sObjects", lhsSObjects), LocatorUtils.property(thatLocator, "sObjects", rhsSObjects), lhsSObjects, rhsSObjects)) {
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
            String theExternalIDFieldName;
            theExternalIDFieldName = this.getExternalIDFieldName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "externalIDFieldName", theExternalIDFieldName), currentHashCode, theExternalIDFieldName);
        }
        {
            List<SObject> theSObjects;
            theSObjects = (((this.sObjects!= null)&&(!this.sObjects.isEmpty()))?this.getSObjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sObjects", theSObjects), currentHashCode, theSObjects);
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
            String theExternalIDFieldName;
            theExternalIDFieldName = this.getExternalIDFieldName();
            strategy.appendField(locator, this, "externalIDFieldName", buffer, theExternalIDFieldName);
        }
        {
            List<SObject> theSObjects;
            theSObjects = (((this.sObjects!= null)&&(!this.sObjects.isEmpty()))?this.getSObjects():null);
            strategy.appendField(locator, this, "sObjects", buffer, theSObjects);
        }
        return buffer;
    }

}
