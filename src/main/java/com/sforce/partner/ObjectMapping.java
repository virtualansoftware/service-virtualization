
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
 * <p>Java class for ObjectMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objectMappingFields" type="{urn:partner.soap.sforce.com}ObjectMappingField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputObject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectMapping", propOrder = {
    "inputObject",
    "objectMappingFields",
    "outputObject"
})
public class ObjectMapping
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String inputObject;
    protected List<ObjectMappingField> objectMappingFields;
    @XmlElement(required = true)
    protected String outputObject;

    /**
     * Gets the value of the inputObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputObject() {
        return inputObject;
    }

    /**
     * Sets the value of the inputObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputObject(String value) {
        this.inputObject = value;
    }

    /**
     * Gets the value of the objectMappingFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectMappingFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectMappingFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectMappingField }
     * 
     * 
     */
    public List<ObjectMappingField> getObjectMappingFields() {
        if (objectMappingFields == null) {
            objectMappingFields = new ArrayList<ObjectMappingField>();
        }
        return this.objectMappingFields;
    }

    /**
     * Gets the value of the outputObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputObject() {
        return outputObject;
    }

    /**
     * Sets the value of the outputObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputObject(String value) {
        this.outputObject = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ObjectMapping)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ObjectMapping that = ((ObjectMapping) object);
        {
            String lhsInputObject;
            lhsInputObject = this.getInputObject();
            String rhsInputObject;
            rhsInputObject = that.getInputObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputObject", lhsInputObject), LocatorUtils.property(thatLocator, "inputObject", rhsInputObject), lhsInputObject, rhsInputObject)) {
                return false;
            }
        }
        {
            List<ObjectMappingField> lhsObjectMappingFields;
            lhsObjectMappingFields = (((this.objectMappingFields!= null)&&(!this.objectMappingFields.isEmpty()))?this.getObjectMappingFields():null);
            List<ObjectMappingField> rhsObjectMappingFields;
            rhsObjectMappingFields = (((that.objectMappingFields!= null)&&(!that.objectMappingFields.isEmpty()))?that.getObjectMappingFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectMappingFields", lhsObjectMappingFields), LocatorUtils.property(thatLocator, "objectMappingFields", rhsObjectMappingFields), lhsObjectMappingFields, rhsObjectMappingFields)) {
                return false;
            }
        }
        {
            String lhsOutputObject;
            lhsOutputObject = this.getOutputObject();
            String rhsOutputObject;
            rhsOutputObject = that.getOutputObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputObject", lhsOutputObject), LocatorUtils.property(thatLocator, "outputObject", rhsOutputObject), lhsOutputObject, rhsOutputObject)) {
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
            String theInputObject;
            theInputObject = this.getInputObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputObject", theInputObject), currentHashCode, theInputObject);
        }
        {
            List<ObjectMappingField> theObjectMappingFields;
            theObjectMappingFields = (((this.objectMappingFields!= null)&&(!this.objectMappingFields.isEmpty()))?this.getObjectMappingFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectMappingFields", theObjectMappingFields), currentHashCode, theObjectMappingFields);
        }
        {
            String theOutputObject;
            theOutputObject = this.getOutputObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputObject", theOutputObject), currentHashCode, theOutputObject);
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
            String theInputObject;
            theInputObject = this.getInputObject();
            strategy.appendField(locator, this, "inputObject", buffer, theInputObject);
        }
        {
            List<ObjectMappingField> theObjectMappingFields;
            theObjectMappingFields = (((this.objectMappingFields!= null)&&(!this.objectMappingFields.isEmpty()))?this.getObjectMappingFields():null);
            strategy.appendField(locator, this, "objectMappingFields", buffer, theObjectMappingFields);
        }
        {
            String theOutputObject;
            theOutputObject = this.getOutputObject();
            strategy.appendField(locator, this, "outputObject", buffer, theOutputObject);
        }
        return buffer;
    }

}
