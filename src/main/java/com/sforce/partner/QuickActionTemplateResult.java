
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
 * <p>Java class for QuickActionTemplateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickActionTemplateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contextId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultValueFormulas" type="{urn:sobject.partner.soap.sforce.com}sObject"/&gt;
 *         &lt;element name="defaultValues" type="{urn:sobject.partner.soap.sforce.com}sObject"/&gt;
 *         &lt;element name="errors" type="{urn:partner.soap.sforce.com}Error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickActionTemplateResult", propOrder = {
    "contextId",
    "defaultValueFormulas",
    "defaultValues",
    "errors",
    "success"
})
public class QuickActionTemplateResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String contextId;
    @XmlElement(required = true, nillable = true)
    protected SObject defaultValueFormulas;
    @XmlElement(required = true, nillable = true)
    protected SObject defaultValues;
    protected List<Error> errors;
    protected boolean success;

    /**
     * Gets the value of the contextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextId() {
        return contextId;
    }

    /**
     * Sets the value of the contextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextId(String value) {
        this.contextId = value;
    }

    /**
     * Gets the value of the defaultValueFormulas property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getDefaultValueFormulas() {
        return defaultValueFormulas;
    }

    /**
     * Sets the value of the defaultValueFormulas property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setDefaultValueFormulas(SObject value) {
        this.defaultValueFormulas = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getDefaultValues() {
        return defaultValues;
    }

    /**
     * Sets the value of the defaultValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setDefaultValues(SObject value) {
        this.defaultValues = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getErrors() {
        if (errors == null) {
            errors = new ArrayList<Error>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QuickActionTemplateResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final QuickActionTemplateResult that = ((QuickActionTemplateResult) object);
        {
            String lhsContextId;
            lhsContextId = this.getContextId();
            String rhsContextId;
            rhsContextId = that.getContextId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextId", lhsContextId), LocatorUtils.property(thatLocator, "contextId", rhsContextId), lhsContextId, rhsContextId)) {
                return false;
            }
        }
        {
            SObject lhsDefaultValueFormulas;
            lhsDefaultValueFormulas = this.getDefaultValueFormulas();
            SObject rhsDefaultValueFormulas;
            rhsDefaultValueFormulas = that.getDefaultValueFormulas();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultValueFormulas", lhsDefaultValueFormulas), LocatorUtils.property(thatLocator, "defaultValueFormulas", rhsDefaultValueFormulas), lhsDefaultValueFormulas, rhsDefaultValueFormulas)) {
                return false;
            }
        }
        {
            SObject lhsDefaultValues;
            lhsDefaultValues = this.getDefaultValues();
            SObject rhsDefaultValues;
            rhsDefaultValues = that.getDefaultValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultValues", lhsDefaultValues), LocatorUtils.property(thatLocator, "defaultValues", rhsDefaultValues), lhsDefaultValues, rhsDefaultValues)) {
                return false;
            }
        }
        {
            List<Error> lhsErrors;
            lhsErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            List<Error> rhsErrors;
            rhsErrors = (((that.errors!= null)&&(!that.errors.isEmpty()))?that.getErrors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errors", lhsErrors), LocatorUtils.property(thatLocator, "errors", rhsErrors), lhsErrors, rhsErrors)) {
                return false;
            }
        }
        {
            boolean lhsSuccess;
            lhsSuccess = (true?this.isSuccess():false);
            boolean rhsSuccess;
            rhsSuccess = (true?that.isSuccess():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "success", lhsSuccess), LocatorUtils.property(thatLocator, "success", rhsSuccess), lhsSuccess, rhsSuccess)) {
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
            String theContextId;
            theContextId = this.getContextId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextId", theContextId), currentHashCode, theContextId);
        }
        {
            SObject theDefaultValueFormulas;
            theDefaultValueFormulas = this.getDefaultValueFormulas();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultValueFormulas", theDefaultValueFormulas), currentHashCode, theDefaultValueFormulas);
        }
        {
            SObject theDefaultValues;
            theDefaultValues = this.getDefaultValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultValues", theDefaultValues), currentHashCode, theDefaultValues);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errors", theErrors), currentHashCode, theErrors);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess);
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
            String theContextId;
            theContextId = this.getContextId();
            strategy.appendField(locator, this, "contextId", buffer, theContextId);
        }
        {
            SObject theDefaultValueFormulas;
            theDefaultValueFormulas = this.getDefaultValueFormulas();
            strategy.appendField(locator, this, "defaultValueFormulas", buffer, theDefaultValueFormulas);
        }
        {
            SObject theDefaultValues;
            theDefaultValues = this.getDefaultValues();
            strategy.appendField(locator, this, "defaultValues", buffer, theDefaultValues);
        }
        {
            List<Error> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            strategy.appendField(locator, this, "errors", buffer, theErrors);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        return buffer;
    }

}
