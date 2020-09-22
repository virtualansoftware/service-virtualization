
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
 * <p>Java class for FieldCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteria" type="{urn:partner.soap.sforce.com}FieldCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldCriteria", propOrder = {
    "criterias"
})
public class FieldCriteria
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "criteria")
    protected List<FieldCriterion> criterias;

    /**
     * Gets the value of the criterias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criterias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldCriterion }
     * 
     * 
     */
    public List<FieldCriterion> getCriterias() {
        if (criterias == null) {
            criterias = new ArrayList<FieldCriterion>();
        }
        return this.criterias;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldCriteria)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldCriteria that = ((FieldCriteria) object);
        {
            List<FieldCriterion> lhsCriterias;
            lhsCriterias = (((this.criterias!= null)&&(!this.criterias.isEmpty()))?this.getCriterias():null);
            List<FieldCriterion> rhsCriterias;
            rhsCriterias = (((that.criterias!= null)&&(!that.criterias.isEmpty()))?that.getCriterias():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "criterias", lhsCriterias), LocatorUtils.property(thatLocator, "criterias", rhsCriterias), lhsCriterias, rhsCriterias)) {
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
            List<FieldCriterion> theCriterias;
            theCriterias = (((this.criterias!= null)&&(!this.criterias.isEmpty()))?this.getCriterias():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "criterias", theCriterias), currentHashCode, theCriterias);
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
            List<FieldCriterion> theCriterias;
            theCriterias = (((this.criterias!= null)&&(!this.criterias.isEmpty()))?this.getCriterias():null);
            strategy.appendField(locator, this, "criterias", buffer, theCriterias);
        }
        return buffer;
    }

}
