
package com.sforce.apex;

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
 * <p>Java class for CodeCoverageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeCoverageResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://soap.sforce.com/2006/08/apex}ID"/&gt;
 *         &lt;element name="locationsNotCovered" type="{http://soap.sforce.com/2006/08/apex}CodeLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numLocations" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numLocationsNotCovered" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeCoverageResult", propOrder = {
    "id",
    "locationsNotCovereds",
    "name",
    "namespace",
    "numLocations",
    "numLocationsNotCovered",
    "type"
})
public class CodeCoverageResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "locationsNotCovered")
    protected List<CodeLocation> locationsNotCovereds;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String namespace;
    protected int numLocations;
    protected int numLocationsNotCovered;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the locationsNotCovereds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationsNotCovereds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationsNotCovereds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeLocation }
     * 
     * 
     */
    public List<CodeLocation> getLocationsNotCovereds() {
        if (locationsNotCovereds == null) {
            locationsNotCovereds = new ArrayList<CodeLocation>();
        }
        return this.locationsNotCovereds;
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
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the numLocations property.
     * 
     */
    public int getNumLocations() {
        return numLocations;
    }

    /**
     * Sets the value of the numLocations property.
     * 
     */
    public void setNumLocations(int value) {
        this.numLocations = value;
    }

    /**
     * Gets the value of the numLocationsNotCovered property.
     * 
     */
    public int getNumLocationsNotCovered() {
        return numLocationsNotCovered;
    }

    /**
     * Sets the value of the numLocationsNotCovered property.
     * 
     */
    public void setNumLocationsNotCovered(int value) {
        this.numLocationsNotCovered = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CodeCoverageResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CodeCoverageResult that = ((CodeCoverageResult) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            List<CodeLocation> lhsLocationsNotCovereds;
            lhsLocationsNotCovereds = (((this.locationsNotCovereds!= null)&&(!this.locationsNotCovereds.isEmpty()))?this.getLocationsNotCovereds():null);
            List<CodeLocation> rhsLocationsNotCovereds;
            rhsLocationsNotCovereds = (((that.locationsNotCovereds!= null)&&(!that.locationsNotCovereds.isEmpty()))?that.getLocationsNotCovereds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationsNotCovereds", lhsLocationsNotCovereds), LocatorUtils.property(thatLocator, "locationsNotCovereds", rhsLocationsNotCovereds), lhsLocationsNotCovereds, rhsLocationsNotCovereds)) {
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
            String lhsNamespace;
            lhsNamespace = this.getNamespace();
            String rhsNamespace;
            rhsNamespace = that.getNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespace", lhsNamespace), LocatorUtils.property(thatLocator, "namespace", rhsNamespace), lhsNamespace, rhsNamespace)) {
                return false;
            }
        }
        {
            int lhsNumLocations;
            lhsNumLocations = (true?this.getNumLocations(): 0);
            int rhsNumLocations;
            rhsNumLocations = (true?that.getNumLocations(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numLocations", lhsNumLocations), LocatorUtils.property(thatLocator, "numLocations", rhsNumLocations), lhsNumLocations, rhsNumLocations)) {
                return false;
            }
        }
        {
            int lhsNumLocationsNotCovered;
            lhsNumLocationsNotCovered = (true?this.getNumLocationsNotCovered(): 0);
            int rhsNumLocationsNotCovered;
            rhsNumLocationsNotCovered = (true?that.getNumLocationsNotCovered(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numLocationsNotCovered", lhsNumLocationsNotCovered), LocatorUtils.property(thatLocator, "numLocationsNotCovered", rhsNumLocationsNotCovered), lhsNumLocationsNotCovered, rhsNumLocationsNotCovered)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            List<CodeLocation> theLocationsNotCovereds;
            theLocationsNotCovereds = (((this.locationsNotCovereds!= null)&&(!this.locationsNotCovereds.isEmpty()))?this.getLocationsNotCovereds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationsNotCovereds", theLocationsNotCovereds), currentHashCode, theLocationsNotCovereds);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespace", theNamespace), currentHashCode, theNamespace);
        }
        {
            int theNumLocations;
            theNumLocations = (true?this.getNumLocations(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numLocations", theNumLocations), currentHashCode, theNumLocations);
        }
        {
            int theNumLocationsNotCovered;
            theNumLocationsNotCovered = (true?this.getNumLocationsNotCovered(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numLocationsNotCovered", theNumLocationsNotCovered), currentHashCode, theNumLocationsNotCovered);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            List<CodeLocation> theLocationsNotCovereds;
            theLocationsNotCovereds = (((this.locationsNotCovereds!= null)&&(!this.locationsNotCovereds.isEmpty()))?this.getLocationsNotCovereds():null);
            strategy.appendField(locator, this, "locationsNotCovereds", buffer, theLocationsNotCovereds);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            strategy.appendField(locator, this, "namespace", buffer, theNamespace);
        }
        {
            int theNumLocations;
            theNumLocations = (true?this.getNumLocations(): 0);
            strategy.appendField(locator, this, "numLocations", buffer, theNumLocations);
        }
        {
            int theNumLocationsNotCovered;
            theNumLocationsNotCovered = (true?this.getNumLocationsNotCovered(): 0);
            strategy.appendField(locator, this, "numLocationsNotCovered", buffer, theNumLocationsNotCovered);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        return buffer;
    }

}
