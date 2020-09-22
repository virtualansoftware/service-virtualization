
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
 * <p>Java class for StartFlowInterviewRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartFlowInterviewRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inputs" type="{urn:partner.soap.sforce.com}NameObjectValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="debug" type="{urn:partner.soap.sforce.com}FlowInterviewDebugInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartFlowInterviewRequest", propOrder = {
    "flowName",
    "inputs",
    "versionId",
    "debug"
})
public class StartFlowInterviewRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String flowName;
    protected List<NameObjectValuePair> inputs;
    @XmlElement(required = true)
    protected String versionId;
    protected FlowInterviewDebugInput debug;

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
     * Gets the value of the inputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameObjectValuePair }
     * 
     * 
     */
    public List<NameObjectValuePair> getInputs() {
        if (inputs == null) {
            inputs = new ArrayList<NameObjectValuePair>();
        }
        return this.inputs;
    }

    /**
     * Gets the value of the versionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the value of the versionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionId(String value) {
        this.versionId = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link FlowInterviewDebugInput }
     *     
     */
    public FlowInterviewDebugInput getDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowInterviewDebugInput }
     *     
     */
    public void setDebug(FlowInterviewDebugInput value) {
        this.debug = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StartFlowInterviewRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StartFlowInterviewRequest that = ((StartFlowInterviewRequest) object);
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
            List<NameObjectValuePair> lhsInputs;
            lhsInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            List<NameObjectValuePair> rhsInputs;
            rhsInputs = (((that.inputs!= null)&&(!that.inputs.isEmpty()))?that.getInputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputs", lhsInputs), LocatorUtils.property(thatLocator, "inputs", rhsInputs), lhsInputs, rhsInputs)) {
                return false;
            }
        }
        {
            String lhsVersionId;
            lhsVersionId = this.getVersionId();
            String rhsVersionId;
            rhsVersionId = that.getVersionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionId", lhsVersionId), LocatorUtils.property(thatLocator, "versionId", rhsVersionId), lhsVersionId, rhsVersionId)) {
                return false;
            }
        }
        {
            FlowInterviewDebugInput lhsDebug;
            lhsDebug = this.getDebug();
            FlowInterviewDebugInput rhsDebug;
            rhsDebug = that.getDebug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debug", lhsDebug), LocatorUtils.property(thatLocator, "debug", rhsDebug), lhsDebug, rhsDebug)) {
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
            String theFlowName;
            theFlowName = this.getFlowName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowName", theFlowName), currentHashCode, theFlowName);
        }
        {
            List<NameObjectValuePair> theInputs;
            theInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputs", theInputs), currentHashCode, theInputs);
        }
        {
            String theVersionId;
            theVersionId = this.getVersionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionId", theVersionId), currentHashCode, theVersionId);
        }
        {
            FlowInterviewDebugInput theDebug;
            theDebug = this.getDebug();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debug", theDebug), currentHashCode, theDebug);
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
            String theFlowName;
            theFlowName = this.getFlowName();
            strategy.appendField(locator, this, "flowName", buffer, theFlowName);
        }
        {
            List<NameObjectValuePair> theInputs;
            theInputs = (((this.inputs!= null)&&(!this.inputs.isEmpty()))?this.getInputs():null);
            strategy.appendField(locator, this, "inputs", buffer, theInputs);
        }
        {
            String theVersionId;
            theVersionId = this.getVersionId();
            strategy.appendField(locator, this, "versionId", buffer, theVersionId);
        }
        {
            FlowInterviewDebugInput theDebug;
            theDebug = this.getDebug();
            strategy.appendField(locator, this, "debug", buffer, theDebug);
        }
        return buffer;
    }

}
