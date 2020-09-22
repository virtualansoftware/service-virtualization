
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
 * <p>Java class for DescribeComponentInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeComponentInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="properties" type="{urn:partner.soap.sforce.com}DescribeComponentInstanceProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="typeNamespace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeComponentInstance", propOrder = {
    "properties",
    "typeName",
    "typeNamespace"
})
public class DescribeComponentInstance
    implements Equals, HashCode, ToString
{

    protected List<DescribeComponentInstanceProperty> properties;
    @XmlElement(required = true)
    protected String typeName;
    @XmlElement(required = true)
    protected String typeNamespace;

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeComponentInstanceProperty }
     * 
     * 
     */
    public List<DescribeComponentInstanceProperty> getProperties() {
        if (properties == null) {
            properties = new ArrayList<DescribeComponentInstanceProperty>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * Gets the value of the typeNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeNamespace() {
        return typeNamespace;
    }

    /**
     * Sets the value of the typeNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeNamespace(String value) {
        this.typeNamespace = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeComponentInstance)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeComponentInstance that = ((DescribeComponentInstance) object);
        {
            List<DescribeComponentInstanceProperty> lhsProperties;
            lhsProperties = (((this.properties!= null)&&(!this.properties.isEmpty()))?this.getProperties():null);
            List<DescribeComponentInstanceProperty> rhsProperties;
            rhsProperties = (((that.properties!= null)&&(!that.properties.isEmpty()))?that.getProperties():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "properties", lhsProperties), LocatorUtils.property(thatLocator, "properties", rhsProperties), lhsProperties, rhsProperties)) {
                return false;
            }
        }
        {
            String lhsTypeName;
            lhsTypeName = this.getTypeName();
            String rhsTypeName;
            rhsTypeName = that.getTypeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeName", lhsTypeName), LocatorUtils.property(thatLocator, "typeName", rhsTypeName), lhsTypeName, rhsTypeName)) {
                return false;
            }
        }
        {
            String lhsTypeNamespace;
            lhsTypeNamespace = this.getTypeNamespace();
            String rhsTypeNamespace;
            rhsTypeNamespace = that.getTypeNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeNamespace", lhsTypeNamespace), LocatorUtils.property(thatLocator, "typeNamespace", rhsTypeNamespace), lhsTypeNamespace, rhsTypeNamespace)) {
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
            List<DescribeComponentInstanceProperty> theProperties;
            theProperties = (((this.properties!= null)&&(!this.properties.isEmpty()))?this.getProperties():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "properties", theProperties), currentHashCode, theProperties);
        }
        {
            String theTypeName;
            theTypeName = this.getTypeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeName", theTypeName), currentHashCode, theTypeName);
        }
        {
            String theTypeNamespace;
            theTypeNamespace = this.getTypeNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeNamespace", theTypeNamespace), currentHashCode, theTypeNamespace);
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
            List<DescribeComponentInstanceProperty> theProperties;
            theProperties = (((this.properties!= null)&&(!this.properties.isEmpty()))?this.getProperties():null);
            strategy.appendField(locator, this, "properties", buffer, theProperties);
        }
        {
            String theTypeName;
            theTypeName = this.getTypeName();
            strategy.appendField(locator, this, "typeName", buffer, theTypeName);
        }
        {
            String theTypeNamespace;
            theTypeNamespace = this.getTypeNamespace();
            strategy.appendField(locator, this, "typeNamespace", buffer, theTypeNamespace);
        }
        return buffer;
    }

}
