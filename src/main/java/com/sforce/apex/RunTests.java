
package com.sforce.apex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="RunTestsRequest" type="{http://soap.sforce.com/2006/08/apex}RunTestsRequest"/&gt;
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
    "runTestsRequest"
})
@XmlRootElement(name = "runTests")
public class RunTests
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "RunTestsRequest", required = true)
    protected RunTestsRequest runTestsRequest;

    /**
     * Gets the value of the runTestsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RunTestsRequest }
     *     
     */
    public RunTestsRequest getRunTestsRequest() {
        return runTestsRequest;
    }

    /**
     * Sets the value of the runTestsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunTestsRequest }
     *     
     */
    public void setRunTestsRequest(RunTestsRequest value) {
        this.runTestsRequest = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RunTests)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RunTests that = ((RunTests) object);
        {
            RunTestsRequest lhsRunTestsRequest;
            lhsRunTestsRequest = this.getRunTestsRequest();
            RunTestsRequest rhsRunTestsRequest;
            rhsRunTestsRequest = that.getRunTestsRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runTestsRequest", lhsRunTestsRequest), LocatorUtils.property(thatLocator, "runTestsRequest", rhsRunTestsRequest), lhsRunTestsRequest, rhsRunTestsRequest)) {
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
            RunTestsRequest theRunTestsRequest;
            theRunTestsRequest = this.getRunTestsRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runTestsRequest", theRunTestsRequest), currentHashCode, theRunTestsRequest);
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
            RunTestsRequest theRunTestsRequest;
            theRunTestsRequest = this.getRunTestsRequest();
            strategy.appendField(locator, this, "runTestsRequest", buffer, theRunTestsRequest);
        }
        return buffer;
    }

}
