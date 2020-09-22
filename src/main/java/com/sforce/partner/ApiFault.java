
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ApiFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exceptionCode" type="{urn:fault.partner.soap.sforce.com}ExceptionCode"/&gt;
 *         &lt;element name="exceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="extendedErrorDetails" type="{urn:partner.soap.sforce.com}ExtendedErrorDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="upgradeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upgradeMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiFault", namespace = "urn:fault.partner.soap.sforce.com", propOrder = {
    "exceptionCode",
    "exceptionMessage",
    "extendedErrorDetails",
    "upgradeURL",
    "upgradeMessage"
})
@XmlSeeAlso({
    ApiQueryFault.class,
    UnexpectedErrorFault.class,
    InvalidIdFault.class,
    InvalidOldPasswordFault.class,
    InvalidNewPasswordFault.class,
    InvalidQueryLocatorFault.class,
    LoginFault.class
})
public class ApiFault
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ExceptionCode exceptionCode;
    @XmlElement(required = true)
    protected String exceptionMessage;
    @XmlElement(nillable = true)
    protected List<ExtendedErrorDetails> extendedErrorDetails;
    protected String upgradeURL;
    protected String upgradeMessage;

    /**
     * Gets the value of the exceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionCode }
     *     
     */
    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Sets the value of the exceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionCode }
     *     
     */
    public void setExceptionCode(ExceptionCode value) {
        this.exceptionCode = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the extendedErrorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedErrorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedErrorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedErrorDetails }
     * 
     * 
     */
    public List<ExtendedErrorDetails> getExtendedErrorDetails() {
        if (extendedErrorDetails == null) {
            extendedErrorDetails = new ArrayList<ExtendedErrorDetails>();
        }
        return this.extendedErrorDetails;
    }

    /**
     * Gets the value of the upgradeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeURL() {
        return upgradeURL;
    }

    /**
     * Sets the value of the upgradeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeURL(String value) {
        this.upgradeURL = value;
    }

    /**
     * Gets the value of the upgradeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeMessage() {
        return upgradeMessage;
    }

    /**
     * Sets the value of the upgradeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeMessage(String value) {
        this.upgradeMessage = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ApiFault)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ApiFault that = ((ApiFault) object);
        {
            ExceptionCode lhsExceptionCode;
            lhsExceptionCode = this.getExceptionCode();
            ExceptionCode rhsExceptionCode;
            rhsExceptionCode = that.getExceptionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionCode", lhsExceptionCode), LocatorUtils.property(thatLocator, "exceptionCode", rhsExceptionCode), lhsExceptionCode, rhsExceptionCode)) {
                return false;
            }
        }
        {
            String lhsExceptionMessage;
            lhsExceptionMessage = this.getExceptionMessage();
            String rhsExceptionMessage;
            rhsExceptionMessage = that.getExceptionMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionMessage", lhsExceptionMessage), LocatorUtils.property(thatLocator, "exceptionMessage", rhsExceptionMessage), lhsExceptionMessage, rhsExceptionMessage)) {
                return false;
            }
        }
        {
            List<ExtendedErrorDetails> lhsExtendedErrorDetails;
            lhsExtendedErrorDetails = (((this.extendedErrorDetails!= null)&&(!this.extendedErrorDetails.isEmpty()))?this.getExtendedErrorDetails():null);
            List<ExtendedErrorDetails> rhsExtendedErrorDetails;
            rhsExtendedErrorDetails = (((that.extendedErrorDetails!= null)&&(!that.extendedErrorDetails.isEmpty()))?that.getExtendedErrorDetails():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extendedErrorDetails", lhsExtendedErrorDetails), LocatorUtils.property(thatLocator, "extendedErrorDetails", rhsExtendedErrorDetails), lhsExtendedErrorDetails, rhsExtendedErrorDetails)) {
                return false;
            }
        }
        {
            String lhsUpgradeURL;
            lhsUpgradeURL = this.getUpgradeURL();
            String rhsUpgradeURL;
            rhsUpgradeURL = that.getUpgradeURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upgradeURL", lhsUpgradeURL), LocatorUtils.property(thatLocator, "upgradeURL", rhsUpgradeURL), lhsUpgradeURL, rhsUpgradeURL)) {
                return false;
            }
        }
        {
            String lhsUpgradeMessage;
            lhsUpgradeMessage = this.getUpgradeMessage();
            String rhsUpgradeMessage;
            rhsUpgradeMessage = that.getUpgradeMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "upgradeMessage", lhsUpgradeMessage), LocatorUtils.property(thatLocator, "upgradeMessage", rhsUpgradeMessage), lhsUpgradeMessage, rhsUpgradeMessage)) {
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
            ExceptionCode theExceptionCode;
            theExceptionCode = this.getExceptionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionCode", theExceptionCode), currentHashCode, theExceptionCode);
        }
        {
            String theExceptionMessage;
            theExceptionMessage = this.getExceptionMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionMessage", theExceptionMessage), currentHashCode, theExceptionMessage);
        }
        {
            List<ExtendedErrorDetails> theExtendedErrorDetails;
            theExtendedErrorDetails = (((this.extendedErrorDetails!= null)&&(!this.extendedErrorDetails.isEmpty()))?this.getExtendedErrorDetails():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extendedErrorDetails", theExtendedErrorDetails), currentHashCode, theExtendedErrorDetails);
        }
        {
            String theUpgradeURL;
            theUpgradeURL = this.getUpgradeURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upgradeURL", theUpgradeURL), currentHashCode, theUpgradeURL);
        }
        {
            String theUpgradeMessage;
            theUpgradeMessage = this.getUpgradeMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upgradeMessage", theUpgradeMessage), currentHashCode, theUpgradeMessage);
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
            ExceptionCode theExceptionCode;
            theExceptionCode = this.getExceptionCode();
            strategy.appendField(locator, this, "exceptionCode", buffer, theExceptionCode);
        }
        {
            String theExceptionMessage;
            theExceptionMessage = this.getExceptionMessage();
            strategy.appendField(locator, this, "exceptionMessage", buffer, theExceptionMessage);
        }
        {
            List<ExtendedErrorDetails> theExtendedErrorDetails;
            theExtendedErrorDetails = (((this.extendedErrorDetails!= null)&&(!this.extendedErrorDetails.isEmpty()))?this.getExtendedErrorDetails():null);
            strategy.appendField(locator, this, "extendedErrorDetails", buffer, theExtendedErrorDetails);
        }
        {
            String theUpgradeURL;
            theUpgradeURL = this.getUpgradeURL();
            strategy.appendField(locator, this, "upgradeURL", buffer, theUpgradeURL);
        }
        {
            String theUpgradeMessage;
            theUpgradeMessage = this.getUpgradeMessage();
            strategy.appendField(locator, this, "upgradeMessage", buffer, theUpgradeMessage);
        }
        return buffer;
    }

}
