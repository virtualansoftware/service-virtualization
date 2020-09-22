
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facts" type="{urn:partner.soap.sforce.com}Fact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="operation" type="{urn:partner.soap.sforce.com}Operation"/&gt;
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
    "facts",
    "operation"
})
@XmlRootElement(name = "MetadataVersionCheck")
public class MetadataVersionCheck
    implements Equals, HashCode, ToString
{

    protected List<Fact> facts;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Operation operation;

    /**
     * Gets the value of the facts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fact }
     * 
     * 
     */
    public List<Fact> getFacts() {
        if (facts == null) {
            facts = new ArrayList<Fact>();
        }
        return this.facts;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOperation(Operation value) {
        this.operation = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MetadataVersionCheck)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MetadataVersionCheck that = ((MetadataVersionCheck) object);
        {
            List<Fact> lhsFacts;
            lhsFacts = (((this.facts!= null)&&(!this.facts.isEmpty()))?this.getFacts():null);
            List<Fact> rhsFacts;
            rhsFacts = (((that.facts!= null)&&(!that.facts.isEmpty()))?that.getFacts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facts", lhsFacts), LocatorUtils.property(thatLocator, "facts", rhsFacts), lhsFacts, rhsFacts)) {
                return false;
            }
        }
        {
            Operation lhsOperation;
            lhsOperation = this.getOperation();
            Operation rhsOperation;
            rhsOperation = that.getOperation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operation", lhsOperation), LocatorUtils.property(thatLocator, "operation", rhsOperation), lhsOperation, rhsOperation)) {
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
            List<Fact> theFacts;
            theFacts = (((this.facts!= null)&&(!this.facts.isEmpty()))?this.getFacts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facts", theFacts), currentHashCode, theFacts);
        }
        {
            Operation theOperation;
            theOperation = this.getOperation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operation", theOperation), currentHashCode, theOperation);
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
            List<Fact> theFacts;
            theFacts = (((this.facts!= null)&&(!this.facts.isEmpty()))?this.getFacts():null);
            strategy.appendField(locator, this, "facts", buffer, theFacts);
        }
        {
            Operation theOperation;
            theOperation = this.getOperation();
            strategy.appendField(locator, this, "operation", buffer, theOperation);
        }
        return buffer;
    }

}
