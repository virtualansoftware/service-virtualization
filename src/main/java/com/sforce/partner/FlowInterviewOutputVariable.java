
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
 * <p>Java class for FlowInterviewOutputVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowInterviewOutputVariable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isCollection" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowInterviewOutputVariable", propOrder = {
    "dataType",
    "description",
    "isCollection",
    "name",
    "objectType",
    "flowName",
    "values"
})
public class FlowInterviewOutputVariable
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String dataType;
    @XmlElement(required = true, nillable = true)
    protected String description;
    protected boolean isCollection;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String objectType;
    @XmlElement(required = true)
    protected String flowName;
    @XmlElement(name = "value", required = true)
    protected List<Object> values;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isCollection property.
     * 
     */
    public boolean isIsCollection() {
        return isCollection;
    }

    /**
     * Sets the value of the isCollection property.
     * 
     */
    public void setIsCollection(boolean value) {
        this.isCollection = value;
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
     * Gets the value of the flowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowName() {
        return flowName;
    }

    /**
     * Sets the value of the flowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowName(String value) {
        this.flowName = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getValues() {
        if (values == null) {
            values = new ArrayList<Object>();
        }
        return this.values;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlowInterviewOutputVariable)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FlowInterviewOutputVariable that = ((FlowInterviewOutputVariable) object);
        {
            String lhsDataType;
            lhsDataType = this.getDataType();
            String rhsDataType;
            rhsDataType = that.getDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataType", lhsDataType), LocatorUtils.property(thatLocator, "dataType", rhsDataType), lhsDataType, rhsDataType)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            boolean lhsIsCollection;
            lhsIsCollection = (true?this.isIsCollection():false);
            boolean rhsIsCollection;
            rhsIsCollection = (true?that.isIsCollection():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isCollection", lhsIsCollection), LocatorUtils.property(thatLocator, "isCollection", rhsIsCollection), lhsIsCollection, rhsIsCollection)) {
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
            String lhsObjectType;
            lhsObjectType = this.getObjectType();
            String rhsObjectType;
            rhsObjectType = that.getObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectType", lhsObjectType), LocatorUtils.property(thatLocator, "objectType", rhsObjectType), lhsObjectType, rhsObjectType)) {
                return false;
            }
        }
        {
            String lhsFlowName;
            lhsFlowName = this.getFlowName();
            String rhsFlowName;
            rhsFlowName = that.getFlowName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowName", lhsFlowName), LocatorUtils.property(thatLocator, "flowName", rhsFlowName), lhsFlowName, rhsFlowName)) {
                return false;
            }
        }
        {
            List<Object> lhsValues;
            lhsValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            List<Object> rhsValues;
            rhsValues = (((that.values!= null)&&(!that.values.isEmpty()))?that.getValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "values", lhsValues), LocatorUtils.property(thatLocator, "values", rhsValues), lhsValues, rhsValues)) {
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
            String theDataType;
            theDataType = this.getDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataType", theDataType), currentHashCode, theDataType);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            boolean theIsCollection;
            theIsCollection = (true?this.isIsCollection():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isCollection", theIsCollection), currentHashCode, theIsCollection);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theObjectType;
            theObjectType = this.getObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectType", theObjectType), currentHashCode, theObjectType);
        }
        {
            String theFlowName;
            theFlowName = this.getFlowName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowName", theFlowName), currentHashCode, theFlowName);
        }
        {
            List<Object> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "values", theValues), currentHashCode, theValues);
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
            String theDataType;
            theDataType = this.getDataType();
            strategy.appendField(locator, this, "dataType", buffer, theDataType);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            boolean theIsCollection;
            theIsCollection = (true?this.isIsCollection():false);
            strategy.appendField(locator, this, "isCollection", buffer, theIsCollection);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theObjectType;
            theObjectType = this.getObjectType();
            strategy.appendField(locator, this, "objectType", buffer, theObjectType);
        }
        {
            String theFlowName;
            theFlowName = this.getFlowName();
            strategy.appendField(locator, this, "flowName", buffer, theFlowName);
        }
        {
            List<Object> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            strategy.appendField(locator, this, "values", buffer, theValues);
        }
        return buffer;
    }

}
