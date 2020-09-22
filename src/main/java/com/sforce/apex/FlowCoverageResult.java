
package com.sforce.apex;

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
 * <p>Java class for FlowCoverageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowCoverageResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elementsNotCovered" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flowId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flowNamespace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numElements" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numElementsNotCovered" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="processType" type="{http://soap.sforce.com/2006/08/apex}FlowProcessType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowCoverageResult", propOrder = {
    "elementsNotCovereds",
    "flowId",
    "flowName",
    "flowNamespace",
    "numElements",
    "numElementsNotCovered",
    "processType"
})
public class FlowCoverageResult
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "elementsNotCovered")
    protected List<String> elementsNotCovereds;
    @XmlElement(required = true)
    protected String flowId;
    @XmlElement(required = true)
    protected String flowName;
    @XmlElement(required = true, nillable = true)
    protected String flowNamespace;
    protected int numElements;
    protected int numElementsNotCovered;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FlowProcessType processType;

    /**
     * Gets the value of the elementsNotCovereds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementsNotCovereds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementsNotCovereds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElementsNotCovereds() {
        if (elementsNotCovereds == null) {
            elementsNotCovereds = new ArrayList<String>();
        }
        return this.elementsNotCovereds;
    }

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
     * Gets the value of the numElements property.
     * 
     */
    public int getNumElements() {
        return numElements;
    }

    /**
     * Sets the value of the numElements property.
     * 
     */
    public void setNumElements(int value) {
        this.numElements = value;
    }

    /**
     * Gets the value of the numElementsNotCovered property.
     * 
     */
    public int getNumElementsNotCovered() {
        return numElementsNotCovered;
    }

    /**
     * Sets the value of the numElementsNotCovered property.
     * 
     */
    public void setNumElementsNotCovered(int value) {
        this.numElementsNotCovered = value;
    }

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowProcessType }
     *     
     */
    public FlowProcessType getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowProcessType }
     *     
     */
    public void setProcessType(FlowProcessType value) {
        this.processType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlowCoverageResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FlowCoverageResult that = ((FlowCoverageResult) object);
        {
            List<String> lhsElementsNotCovereds;
            lhsElementsNotCovereds = (((this.elementsNotCovereds!= null)&&(!this.elementsNotCovereds.isEmpty()))?this.getElementsNotCovereds():null);
            List<String> rhsElementsNotCovereds;
            rhsElementsNotCovereds = (((that.elementsNotCovereds!= null)&&(!that.elementsNotCovereds.isEmpty()))?that.getElementsNotCovereds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elementsNotCovereds", lhsElementsNotCovereds), LocatorUtils.property(thatLocator, "elementsNotCovereds", rhsElementsNotCovereds), lhsElementsNotCovereds, rhsElementsNotCovereds)) {
                return false;
            }
        }
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
            int lhsNumElements;
            lhsNumElements = (true?this.getNumElements(): 0);
            int rhsNumElements;
            rhsNumElements = (true?that.getNumElements(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numElements", lhsNumElements), LocatorUtils.property(thatLocator, "numElements", rhsNumElements), lhsNumElements, rhsNumElements)) {
                return false;
            }
        }
        {
            int lhsNumElementsNotCovered;
            lhsNumElementsNotCovered = (true?this.getNumElementsNotCovered(): 0);
            int rhsNumElementsNotCovered;
            rhsNumElementsNotCovered = (true?that.getNumElementsNotCovered(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numElementsNotCovered", lhsNumElementsNotCovered), LocatorUtils.property(thatLocator, "numElementsNotCovered", rhsNumElementsNotCovered), lhsNumElementsNotCovered, rhsNumElementsNotCovered)) {
                return false;
            }
        }
        {
            FlowProcessType lhsProcessType;
            lhsProcessType = this.getProcessType();
            FlowProcessType rhsProcessType;
            rhsProcessType = that.getProcessType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processType", lhsProcessType), LocatorUtils.property(thatLocator, "processType", rhsProcessType), lhsProcessType, rhsProcessType)) {
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
            List<String> theElementsNotCovereds;
            theElementsNotCovereds = (((this.elementsNotCovereds!= null)&&(!this.elementsNotCovereds.isEmpty()))?this.getElementsNotCovereds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "elementsNotCovereds", theElementsNotCovereds), currentHashCode, theElementsNotCovereds);
        }
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
            int theNumElements;
            theNumElements = (true?this.getNumElements(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numElements", theNumElements), currentHashCode, theNumElements);
        }
        {
            int theNumElementsNotCovered;
            theNumElementsNotCovered = (true?this.getNumElementsNotCovered(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numElementsNotCovered", theNumElementsNotCovered), currentHashCode, theNumElementsNotCovered);
        }
        {
            FlowProcessType theProcessType;
            theProcessType = this.getProcessType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processType", theProcessType), currentHashCode, theProcessType);
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
            List<String> theElementsNotCovereds;
            theElementsNotCovereds = (((this.elementsNotCovereds!= null)&&(!this.elementsNotCovereds.isEmpty()))?this.getElementsNotCovereds():null);
            strategy.appendField(locator, this, "elementsNotCovereds", buffer, theElementsNotCovereds);
        }
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
            int theNumElements;
            theNumElements = (true?this.getNumElements(): 0);
            strategy.appendField(locator, this, "numElements", buffer, theNumElements);
        }
        {
            int theNumElementsNotCovered;
            theNumElementsNotCovered = (true?this.getNumElementsNotCovered(): 0);
            strategy.appendField(locator, this, "numElementsNotCovered", buffer, theNumElementsNotCovered);
        }
        {
            FlowProcessType theProcessType;
            theProcessType = this.getProcessType();
            strategy.appendField(locator, this, "processType", buffer, theProcessType);
        }
        return buffer;
    }

}
