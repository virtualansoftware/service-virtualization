
package com.sforce.apex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for WsdlToApexResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsdlToApexResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apexScripts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "WsdlToApexResult", propOrder = {
    "apexScripts",
    "errors",
    "success"
})
public class WsdlToApexResult
    implements Equals, HashCode, ToString
{

    protected List<String> apexScripts;
    protected List<String> errors;
    protected boolean success;

    /**
     * Gets the value of the apexScripts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apexScripts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApexScripts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApexScripts() {
        if (apexScripts == null) {
            apexScripts = new ArrayList<String>();
        }
        return this.apexScripts;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getErrors() {
        if (errors == null) {
            errors = new ArrayList<String>();
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
        if (!(object instanceof WsdlToApexResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WsdlToApexResult that = ((WsdlToApexResult) object);
        {
            List<String> lhsApexScripts;
            lhsApexScripts = (((this.apexScripts!= null)&&(!this.apexScripts.isEmpty()))?this.getApexScripts():null);
            List<String> rhsApexScripts;
            rhsApexScripts = (((that.apexScripts!= null)&&(!that.apexScripts.isEmpty()))?that.getApexScripts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apexScripts", lhsApexScripts), LocatorUtils.property(thatLocator, "apexScripts", rhsApexScripts), lhsApexScripts, rhsApexScripts)) {
                return false;
            }
        }
        {
            List<String> lhsErrors;
            lhsErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            List<String> rhsErrors;
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
            List<String> theApexScripts;
            theApexScripts = (((this.apexScripts!= null)&&(!this.apexScripts.isEmpty()))?this.getApexScripts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apexScripts", theApexScripts), currentHashCode, theApexScripts);
        }
        {
            List<String> theErrors;
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
            List<String> theApexScripts;
            theApexScripts = (((this.apexScripts!= null)&&(!this.apexScripts.isEmpty()))?this.getApexScripts():null);
            strategy.appendField(locator, this, "apexScripts", buffer, theApexScripts);
        }
        {
            List<String> theErrors;
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
