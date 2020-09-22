
package com.sforce.apex;

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
 * <p>Java class for RunTestsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunTestsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apexLogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeCoverage" type="{http://soap.sforce.com/2006/08/apex}CodeCoverageResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codeCoverageWarnings" type="{http://soap.sforce.com/2006/08/apex}CodeCoverageWarning" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="failures" type="{http://soap.sforce.com/2006/08/apex}RunTestFailure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flowCoverage" type="{http://soap.sforce.com/2006/08/apex}FlowCoverageResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flowCoverageWarnings" type="{http://soap.sforce.com/2006/08/apex}FlowCoverageWarning" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numFailures" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numTestsRun" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="successes" type="{http://soap.sforce.com/2006/08/apex}RunTestSuccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalTime" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunTestsResult", propOrder = {
    "apexLogId",
    "codeCoverages",
    "codeCoverageWarnings",
    "failures",
    "flowCoverages",
    "flowCoverageWarnings",
    "numFailures",
    "numTestsRun",
    "successes",
    "totalTime"
})
public class RunTestsResult
    implements Equals, HashCode, ToString
{

    protected String apexLogId;
    @XmlElement(name = "codeCoverage")
    protected List<CodeCoverageResult> codeCoverages;
    protected List<CodeCoverageWarning> codeCoverageWarnings;
    protected List<RunTestFailure> failures;
    @XmlElement(name = "flowCoverage")
    protected List<FlowCoverageResult> flowCoverages;
    protected List<FlowCoverageWarning> flowCoverageWarnings;
    protected int numFailures;
    protected int numTestsRun;
    protected List<RunTestSuccess> successes;
    protected double totalTime;

    /**
     * Gets the value of the apexLogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApexLogId() {
        return apexLogId;
    }

    /**
     * Sets the value of the apexLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApexLogId(String value) {
        this.apexLogId = value;
    }

    /**
     * Gets the value of the codeCoverages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeCoverages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeCoverages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeCoverageResult }
     * 
     * 
     */
    public List<CodeCoverageResult> getCodeCoverages() {
        if (codeCoverages == null) {
            codeCoverages = new ArrayList<CodeCoverageResult>();
        }
        return this.codeCoverages;
    }

    /**
     * Gets the value of the codeCoverageWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeCoverageWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeCoverageWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeCoverageWarning }
     * 
     * 
     */
    public List<CodeCoverageWarning> getCodeCoverageWarnings() {
        if (codeCoverageWarnings == null) {
            codeCoverageWarnings = new ArrayList<CodeCoverageWarning>();
        }
        return this.codeCoverageWarnings;
    }

    /**
     * Gets the value of the failures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunTestFailure }
     * 
     * 
     */
    public List<RunTestFailure> getFailures() {
        if (failures == null) {
            failures = new ArrayList<RunTestFailure>();
        }
        return this.failures;
    }

    /**
     * Gets the value of the flowCoverages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowCoverages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowCoverages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowCoverageResult }
     * 
     * 
     */
    public List<FlowCoverageResult> getFlowCoverages() {
        if (flowCoverages == null) {
            flowCoverages = new ArrayList<FlowCoverageResult>();
        }
        return this.flowCoverages;
    }

    /**
     * Gets the value of the flowCoverageWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowCoverageWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowCoverageWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowCoverageWarning }
     * 
     * 
     */
    public List<FlowCoverageWarning> getFlowCoverageWarnings() {
        if (flowCoverageWarnings == null) {
            flowCoverageWarnings = new ArrayList<FlowCoverageWarning>();
        }
        return this.flowCoverageWarnings;
    }

    /**
     * Gets the value of the numFailures property.
     * 
     */
    public int getNumFailures() {
        return numFailures;
    }

    /**
     * Sets the value of the numFailures property.
     * 
     */
    public void setNumFailures(int value) {
        this.numFailures = value;
    }

    /**
     * Gets the value of the numTestsRun property.
     * 
     */
    public int getNumTestsRun() {
        return numTestsRun;
    }

    /**
     * Sets the value of the numTestsRun property.
     * 
     */
    public void setNumTestsRun(int value) {
        this.numTestsRun = value;
    }

    /**
     * Gets the value of the successes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunTestSuccess }
     * 
     * 
     */
    public List<RunTestSuccess> getSuccesses() {
        if (successes == null) {
            successes = new ArrayList<RunTestSuccess>();
        }
        return this.successes;
    }

    /**
     * Gets the value of the totalTime property.
     * 
     */
    public double getTotalTime() {
        return totalTime;
    }

    /**
     * Sets the value of the totalTime property.
     * 
     */
    public void setTotalTime(double value) {
        this.totalTime = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RunTestsResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RunTestsResult that = ((RunTestsResult) object);
        {
            String lhsApexLogId;
            lhsApexLogId = this.getApexLogId();
            String rhsApexLogId;
            rhsApexLogId = that.getApexLogId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apexLogId", lhsApexLogId), LocatorUtils.property(thatLocator, "apexLogId", rhsApexLogId), lhsApexLogId, rhsApexLogId)) {
                return false;
            }
        }
        {
            List<CodeCoverageResult> lhsCodeCoverages;
            lhsCodeCoverages = (((this.codeCoverages!= null)&&(!this.codeCoverages.isEmpty()))?this.getCodeCoverages():null);
            List<CodeCoverageResult> rhsCodeCoverages;
            rhsCodeCoverages = (((that.codeCoverages!= null)&&(!that.codeCoverages.isEmpty()))?that.getCodeCoverages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codeCoverages", lhsCodeCoverages), LocatorUtils.property(thatLocator, "codeCoverages", rhsCodeCoverages), lhsCodeCoverages, rhsCodeCoverages)) {
                return false;
            }
        }
        {
            List<CodeCoverageWarning> lhsCodeCoverageWarnings;
            lhsCodeCoverageWarnings = (((this.codeCoverageWarnings!= null)&&(!this.codeCoverageWarnings.isEmpty()))?this.getCodeCoverageWarnings():null);
            List<CodeCoverageWarning> rhsCodeCoverageWarnings;
            rhsCodeCoverageWarnings = (((that.codeCoverageWarnings!= null)&&(!that.codeCoverageWarnings.isEmpty()))?that.getCodeCoverageWarnings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codeCoverageWarnings", lhsCodeCoverageWarnings), LocatorUtils.property(thatLocator, "codeCoverageWarnings", rhsCodeCoverageWarnings), lhsCodeCoverageWarnings, rhsCodeCoverageWarnings)) {
                return false;
            }
        }
        {
            List<RunTestFailure> lhsFailures;
            lhsFailures = (((this.failures!= null)&&(!this.failures.isEmpty()))?this.getFailures():null);
            List<RunTestFailure> rhsFailures;
            rhsFailures = (((that.failures!= null)&&(!that.failures.isEmpty()))?that.getFailures():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failures", lhsFailures), LocatorUtils.property(thatLocator, "failures", rhsFailures), lhsFailures, rhsFailures)) {
                return false;
            }
        }
        {
            List<FlowCoverageResult> lhsFlowCoverages;
            lhsFlowCoverages = (((this.flowCoverages!= null)&&(!this.flowCoverages.isEmpty()))?this.getFlowCoverages():null);
            List<FlowCoverageResult> rhsFlowCoverages;
            rhsFlowCoverages = (((that.flowCoverages!= null)&&(!that.flowCoverages.isEmpty()))?that.getFlowCoverages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowCoverages", lhsFlowCoverages), LocatorUtils.property(thatLocator, "flowCoverages", rhsFlowCoverages), lhsFlowCoverages, rhsFlowCoverages)) {
                return false;
            }
        }
        {
            List<FlowCoverageWarning> lhsFlowCoverageWarnings;
            lhsFlowCoverageWarnings = (((this.flowCoverageWarnings!= null)&&(!this.flowCoverageWarnings.isEmpty()))?this.getFlowCoverageWarnings():null);
            List<FlowCoverageWarning> rhsFlowCoverageWarnings;
            rhsFlowCoverageWarnings = (((that.flowCoverageWarnings!= null)&&(!that.flowCoverageWarnings.isEmpty()))?that.getFlowCoverageWarnings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowCoverageWarnings", lhsFlowCoverageWarnings), LocatorUtils.property(thatLocator, "flowCoverageWarnings", rhsFlowCoverageWarnings), lhsFlowCoverageWarnings, rhsFlowCoverageWarnings)) {
                return false;
            }
        }
        {
            int lhsNumFailures;
            lhsNumFailures = (true?this.getNumFailures(): 0);
            int rhsNumFailures;
            rhsNumFailures = (true?that.getNumFailures(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numFailures", lhsNumFailures), LocatorUtils.property(thatLocator, "numFailures", rhsNumFailures), lhsNumFailures, rhsNumFailures)) {
                return false;
            }
        }
        {
            int lhsNumTestsRun;
            lhsNumTestsRun = (true?this.getNumTestsRun(): 0);
            int rhsNumTestsRun;
            rhsNumTestsRun = (true?that.getNumTestsRun(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numTestsRun", lhsNumTestsRun), LocatorUtils.property(thatLocator, "numTestsRun", rhsNumTestsRun), lhsNumTestsRun, rhsNumTestsRun)) {
                return false;
            }
        }
        {
            List<RunTestSuccess> lhsSuccesses;
            lhsSuccesses = (((this.successes!= null)&&(!this.successes.isEmpty()))?this.getSuccesses():null);
            List<RunTestSuccess> rhsSuccesses;
            rhsSuccesses = (((that.successes!= null)&&(!that.successes.isEmpty()))?that.getSuccesses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "successes", lhsSuccesses), LocatorUtils.property(thatLocator, "successes", rhsSuccesses), lhsSuccesses, rhsSuccesses)) {
                return false;
            }
        }
        {
            double lhsTotalTime;
            lhsTotalTime = (true?this.getTotalTime(): 0.0D);
            double rhsTotalTime;
            rhsTotalTime = (true?that.getTotalTime(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalTime", lhsTotalTime), LocatorUtils.property(thatLocator, "totalTime", rhsTotalTime), lhsTotalTime, rhsTotalTime)) {
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
            String theApexLogId;
            theApexLogId = this.getApexLogId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apexLogId", theApexLogId), currentHashCode, theApexLogId);
        }
        {
            List<CodeCoverageResult> theCodeCoverages;
            theCodeCoverages = (((this.codeCoverages!= null)&&(!this.codeCoverages.isEmpty()))?this.getCodeCoverages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codeCoverages", theCodeCoverages), currentHashCode, theCodeCoverages);
        }
        {
            List<CodeCoverageWarning> theCodeCoverageWarnings;
            theCodeCoverageWarnings = (((this.codeCoverageWarnings!= null)&&(!this.codeCoverageWarnings.isEmpty()))?this.getCodeCoverageWarnings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codeCoverageWarnings", theCodeCoverageWarnings), currentHashCode, theCodeCoverageWarnings);
        }
        {
            List<RunTestFailure> theFailures;
            theFailures = (((this.failures!= null)&&(!this.failures.isEmpty()))?this.getFailures():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failures", theFailures), currentHashCode, theFailures);
        }
        {
            List<FlowCoverageResult> theFlowCoverages;
            theFlowCoverages = (((this.flowCoverages!= null)&&(!this.flowCoverages.isEmpty()))?this.getFlowCoverages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowCoverages", theFlowCoverages), currentHashCode, theFlowCoverages);
        }
        {
            List<FlowCoverageWarning> theFlowCoverageWarnings;
            theFlowCoverageWarnings = (((this.flowCoverageWarnings!= null)&&(!this.flowCoverageWarnings.isEmpty()))?this.getFlowCoverageWarnings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowCoverageWarnings", theFlowCoverageWarnings), currentHashCode, theFlowCoverageWarnings);
        }
        {
            int theNumFailures;
            theNumFailures = (true?this.getNumFailures(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numFailures", theNumFailures), currentHashCode, theNumFailures);
        }
        {
            int theNumTestsRun;
            theNumTestsRun = (true?this.getNumTestsRun(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numTestsRun", theNumTestsRun), currentHashCode, theNumTestsRun);
        }
        {
            List<RunTestSuccess> theSuccesses;
            theSuccesses = (((this.successes!= null)&&(!this.successes.isEmpty()))?this.getSuccesses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "successes", theSuccesses), currentHashCode, theSuccesses);
        }
        {
            double theTotalTime;
            theTotalTime = (true?this.getTotalTime(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalTime", theTotalTime), currentHashCode, theTotalTime);
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
            String theApexLogId;
            theApexLogId = this.getApexLogId();
            strategy.appendField(locator, this, "apexLogId", buffer, theApexLogId);
        }
        {
            List<CodeCoverageResult> theCodeCoverages;
            theCodeCoverages = (((this.codeCoverages!= null)&&(!this.codeCoverages.isEmpty()))?this.getCodeCoverages():null);
            strategy.appendField(locator, this, "codeCoverages", buffer, theCodeCoverages);
        }
        {
            List<CodeCoverageWarning> theCodeCoverageWarnings;
            theCodeCoverageWarnings = (((this.codeCoverageWarnings!= null)&&(!this.codeCoverageWarnings.isEmpty()))?this.getCodeCoverageWarnings():null);
            strategy.appendField(locator, this, "codeCoverageWarnings", buffer, theCodeCoverageWarnings);
        }
        {
            List<RunTestFailure> theFailures;
            theFailures = (((this.failures!= null)&&(!this.failures.isEmpty()))?this.getFailures():null);
            strategy.appendField(locator, this, "failures", buffer, theFailures);
        }
        {
            List<FlowCoverageResult> theFlowCoverages;
            theFlowCoverages = (((this.flowCoverages!= null)&&(!this.flowCoverages.isEmpty()))?this.getFlowCoverages():null);
            strategy.appendField(locator, this, "flowCoverages", buffer, theFlowCoverages);
        }
        {
            List<FlowCoverageWarning> theFlowCoverageWarnings;
            theFlowCoverageWarnings = (((this.flowCoverageWarnings!= null)&&(!this.flowCoverageWarnings.isEmpty()))?this.getFlowCoverageWarnings():null);
            strategy.appendField(locator, this, "flowCoverageWarnings", buffer, theFlowCoverageWarnings);
        }
        {
            int theNumFailures;
            theNumFailures = (true?this.getNumFailures(): 0);
            strategy.appendField(locator, this, "numFailures", buffer, theNumFailures);
        }
        {
            int theNumTestsRun;
            theNumTestsRun = (true?this.getNumTestsRun(): 0);
            strategy.appendField(locator, this, "numTestsRun", buffer, theNumTestsRun);
        }
        {
            List<RunTestSuccess> theSuccesses;
            theSuccesses = (((this.successes!= null)&&(!this.successes.isEmpty()))?this.getSuccesses():null);
            strategy.appendField(locator, this, "successes", buffer, theSuccesses);
        }
        {
            double theTotalTime;
            theTotalTime = (true?this.getTotalTime(): 0.0D);
            strategy.appendField(locator, this, "totalTime", buffer, theTotalTime);
        }
        return buffer;
    }

}
