
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
 * <p>Java class for LabelsSearchMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelsSearchMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityFieldLabels" type="{urn:partner.soap.sforce.com}NameValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelsSearchMetadata", propOrder = {
    "entityFieldLabels",
    "entityName"
})
public class LabelsSearchMetadata
    implements Equals, HashCode, ToString
{

    protected List<NameValuePair> entityFieldLabels;
    @XmlElement(required = true)
    protected String entityName;

    /**
     * Gets the value of the entityFieldLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityFieldLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityFieldLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getEntityFieldLabels() {
        if (entityFieldLabels == null) {
            entityFieldLabels = new ArrayList<NameValuePair>();
        }
        return this.entityFieldLabels;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LabelsSearchMetadata)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LabelsSearchMetadata that = ((LabelsSearchMetadata) object);
        {
            List<NameValuePair> lhsEntityFieldLabels;
            lhsEntityFieldLabels = (((this.entityFieldLabels!= null)&&(!this.entityFieldLabels.isEmpty()))?this.getEntityFieldLabels():null);
            List<NameValuePair> rhsEntityFieldLabels;
            rhsEntityFieldLabels = (((that.entityFieldLabels!= null)&&(!that.entityFieldLabels.isEmpty()))?that.getEntityFieldLabels():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityFieldLabels", lhsEntityFieldLabels), LocatorUtils.property(thatLocator, "entityFieldLabels", rhsEntityFieldLabels), lhsEntityFieldLabels, rhsEntityFieldLabels)) {
                return false;
            }
        }
        {
            String lhsEntityName;
            lhsEntityName = this.getEntityName();
            String rhsEntityName;
            rhsEntityName = that.getEntityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityName", lhsEntityName), LocatorUtils.property(thatLocator, "entityName", rhsEntityName), lhsEntityName, rhsEntityName)) {
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
            List<NameValuePair> theEntityFieldLabels;
            theEntityFieldLabels = (((this.entityFieldLabels!= null)&&(!this.entityFieldLabels.isEmpty()))?this.getEntityFieldLabels():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityFieldLabels", theEntityFieldLabels), currentHashCode, theEntityFieldLabels);
        }
        {
            String theEntityName;
            theEntityName = this.getEntityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityName", theEntityName), currentHashCode, theEntityName);
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
            List<NameValuePair> theEntityFieldLabels;
            theEntityFieldLabels = (((this.entityFieldLabels!= null)&&(!this.entityFieldLabels.isEmpty()))?this.getEntityFieldLabels():null);
            strategy.appendField(locator, this, "entityFieldLabels", buffer, theEntityFieldLabels);
        }
        {
            String theEntityName;
            theEntityName = this.getEntityName();
            strategy.appendField(locator, this, "entityName", buffer, theEntityName);
        }
        return buffer;
    }

}
