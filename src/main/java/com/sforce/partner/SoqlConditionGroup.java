
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for SoqlConditionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoqlConditionGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}SoqlWhereCondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditions" type="{urn:partner.soap.sforce.com}SoqlWhereCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="conjunction" type="{urn:partner.soap.sforce.com}soqlConjunction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoqlConditionGroup", propOrder = {
    "conditions",
    "conjunction"
})
public class SoqlConditionGroup
    extends SoqlWhereCondition
    implements Equals, HashCode, ToString
{

    protected List<SoqlWhereCondition> conditions;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SoqlConjunction conjunction;

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoqlWhereCondition }
     * 
     * 
     */
    public List<SoqlWhereCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<SoqlWhereCondition>();
        }
        return this.conditions;
    }

    /**
     * Gets the value of the conjunction property.
     * 
     * @return
     *     possible object is
     *     {@link SoqlConjunction }
     *     
     */
    public SoqlConjunction getConjunction() {
        return conjunction;
    }

    /**
     * Sets the value of the conjunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoqlConjunction }
     *     
     */
    public void setConjunction(SoqlConjunction value) {
        this.conjunction = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SoqlConditionGroup)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SoqlConditionGroup that = ((SoqlConditionGroup) object);
        {
            List<SoqlWhereCondition> lhsConditions;
            lhsConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            List<SoqlWhereCondition> rhsConditions;
            rhsConditions = (((that.conditions!= null)&&(!that.conditions.isEmpty()))?that.getConditions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conditions", lhsConditions), LocatorUtils.property(thatLocator, "conditions", rhsConditions), lhsConditions, rhsConditions)) {
                return false;
            }
        }
        {
            SoqlConjunction lhsConjunction;
            lhsConjunction = this.getConjunction();
            SoqlConjunction rhsConjunction;
            rhsConjunction = that.getConjunction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conjunction", lhsConjunction), LocatorUtils.property(thatLocator, "conjunction", rhsConjunction), lhsConjunction, rhsConjunction)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<SoqlWhereCondition> theConditions;
            theConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditions", theConditions), currentHashCode, theConditions);
        }
        {
            SoqlConjunction theConjunction;
            theConjunction = this.getConjunction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conjunction", theConjunction), currentHashCode, theConjunction);
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
        super.appendFields(locator, buffer, strategy);
        {
            List<SoqlWhereCondition> theConditions;
            theConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            strategy.appendField(locator, this, "conditions", buffer, theConditions);
        }
        {
            SoqlConjunction theConjunction;
            theConjunction = this.getConjunction();
            strategy.appendField(locator, this, "conjunction", buffer, theConjunction);
        }
        return buffer;
    }

}
