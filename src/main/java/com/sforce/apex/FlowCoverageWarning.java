
package com.sforce.apex;

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
 * <p>Java class for FlowCoverageWarning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowCoverageWarning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flowId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flowNamespace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowCoverageWarning", propOrder = {
    "flowId",
    "flowName",
    "flowNamespace",
    "message"
})
public class FlowCoverageWarning
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String flowId;
    @XmlElement(required = true, nillable = true)
    protected String flowName;
    @XmlElement(required = true, nillable = true)
    protected String flowNamespace;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the flowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * Sets the value of the flowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowId(String value) {
        this.flowId = value;
    }

    /**
     * Gets the value of the flowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowName() {
        return flowName;
    }

    /**
     * Sets the value of the flowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowName(String value) {
        this.flowName = value;
    }

    /**
     * Gets the value of the flowNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowNamespace() {
        return flowNamespace;
    }

    /**
     * Sets the value of the flowNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowNamespace(String value) {
        this.flowNamespace = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlowCoverageWarning)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FlowCoverageWarning that = ((FlowCoverageWarning) object);
        {
            String lhsFlowId;
            lhsFlowId = this.getFlowId();
            String rhsFlowId;
            rhsFlowId = that.getFlowId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowId", lhsFlowId), LocatorUtils.property(thatLocator, "flowId", rhsFlowId), lhsFlowId, rhsFlowId)) {
                return false;
            }
        }
        {
            String lhsFlowName;
            lhsFlowName = this.getFlowName();
            String rhsFlowName;
            rhsFlowName = that.getFlowName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowName", lhsFlowName), LocatorUtils.property(thatLocator, "flowName", rhsFlowName), lhsFlowName, rhsFlowName)) {
                return false;
            }
        }
        {
            String lhsFlowNamespace;
            lhsFlowNamespace = this.getFlowNamespace();
            String rhsFlowNamespace;
            rhsFlowNamespace = that.getFlowNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowNamespace", lhsFlowNamespace), LocatorUtils.property(thatLocator, "flowNamespace", rhsFlowNamespace), lhsFlowNamespace, rhsFlowNamespace)) {
                return false;
            }
        }
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
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
            String theFlowId;
            theFlowId = this.getFlowId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowId", theFlowId), currentHashCode, theFlowId);
        }
        {
            String theFlowName;
            theFlowName = this.getFlowName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowName", theFlowName), currentHashCode, theFlowName);
        }
        {
            String theFlowNamespace;
            theFlowNamespace = this.getFlowNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowNamespace", theFlowNamespace), currentHashCode, theFlowNamespace);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
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
            String theFlowId;
            theFlowId = this.getFlowId();
            strategy.appendField(locator, this, "flowId", buffer, theFlowId);
        }
        {
            String theFlowName;
            theFlowName = this.getFlowName();
            strategy.appendField(locator, this, "flowName", buffer, theFlowName);
        }
        {
            String theFlowNamespace;
            theFlowNamespace = this.getFlowNamespace();
            strategy.appendField(locator, this, "flowNamespace", buffer, theFlowNamespace);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage);
        }
        return buffer;
    }

}
