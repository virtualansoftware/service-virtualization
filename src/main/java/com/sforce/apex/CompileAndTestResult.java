
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
 * <p>Java class for CompileAndTestResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompileAndTestResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classes" type="{http://soap.sforce.com/2006/08/apex}CompileClassResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deleteClasses" type="{http://soap.sforce.com/2006/08/apex}DeleteApexResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deleteTriggers" type="{http://soap.sforce.com/2006/08/apex}DeleteApexResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="runTestsResult" type="{http://soap.sforce.com/2006/08/apex}RunTestsResult"/&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="triggers" type="{http://soap.sforce.com/2006/08/apex}CompileTriggerResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompileAndTestResult", propOrder = {
    "classes",
    "deleteClasses",
    "deleteTriggers",
    "runTestsResult",
    "success",
    "triggers"
})
public class CompileAndTestResult
    implements Equals, HashCode, ToString
{

    protected List<CompileClassResult> classes;
    protected List<DeleteApexResult> deleteClasses;
    protected List<DeleteApexResult> deleteTriggers;
    @XmlElement(required = true)
    protected RunTestsResult runTestsResult;
    protected boolean success;
    protected List<CompileTriggerResult> triggers;

    /**
     * Gets the value of the classes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompileClassResult }
     * 
     * 
     */
    public List<CompileClassResult> getClasses() {
        if (classes == null) {
            classes = new ArrayList<CompileClassResult>();
        }
        return this.classes;
    }

    /**
     * Gets the value of the deleteClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteApexResult }
     * 
     * 
     */
    public List<DeleteApexResult> getDeleteClasses() {
        if (deleteClasses == null) {
            deleteClasses = new ArrayList<DeleteApexResult>();
        }
        return this.deleteClasses;
    }

    /**
     * Gets the value of the deleteTriggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteTriggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteApexResult }
     * 
     * 
     */
    public List<DeleteApexResult> getDeleteTriggers() {
        if (deleteTriggers == null) {
            deleteTriggers = new ArrayList<DeleteApexResult>();
        }
        return this.deleteTriggers;
    }

    /**
     * Gets the value of the runTestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link RunTestsResult }
     *     
     */
    public RunTestsResult getRunTestsResult() {
        return runTestsResult;
    }

    /**
     * Sets the value of the runTestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunTestsResult }
     *     
     */
    public void setRunTestsResult(RunTestsResult value) {
        this.runTestsResult = value;
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

    /**
     * Gets the value of the triggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the triggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompileTriggerResult }
     * 
     * 
     */
    public List<CompileTriggerResult> getTriggers() {
        if (triggers == null) {
            triggers = new ArrayList<CompileTriggerResult>();
        }
        return this.triggers;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompileAndTestResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CompileAndTestResult that = ((CompileAndTestResult) object);
        {
            List<CompileClassResult> lhsClasses;
            lhsClasses = (((this.classes!= null)&&(!this.classes.isEmpty()))?this.getClasses():null);
            List<CompileClassResult> rhsClasses;
            rhsClasses = (((that.classes!= null)&&(!that.classes.isEmpty()))?that.getClasses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classes", lhsClasses), LocatorUtils.property(thatLocator, "classes", rhsClasses), lhsClasses, rhsClasses)) {
                return false;
            }
        }
        {
            List<DeleteApexResult> lhsDeleteClasses;
            lhsDeleteClasses = (((this.deleteClasses!= null)&&(!this.deleteClasses.isEmpty()))?this.getDeleteClasses():null);
            List<DeleteApexResult> rhsDeleteClasses;
            rhsDeleteClasses = (((that.deleteClasses!= null)&&(!that.deleteClasses.isEmpty()))?that.getDeleteClasses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deleteClasses", lhsDeleteClasses), LocatorUtils.property(thatLocator, "deleteClasses", rhsDeleteClasses), lhsDeleteClasses, rhsDeleteClasses)) {
                return false;
            }
        }
        {
            List<DeleteApexResult> lhsDeleteTriggers;
            lhsDeleteTriggers = (((this.deleteTriggers!= null)&&(!this.deleteTriggers.isEmpty()))?this.getDeleteTriggers():null);
            List<DeleteApexResult> rhsDeleteTriggers;
            rhsDeleteTriggers = (((that.deleteTriggers!= null)&&(!that.deleteTriggers.isEmpty()))?that.getDeleteTriggers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deleteTriggers", lhsDeleteTriggers), LocatorUtils.property(thatLocator, "deleteTriggers", rhsDeleteTriggers), lhsDeleteTriggers, rhsDeleteTriggers)) {
                return false;
            }
        }
        {
            RunTestsResult lhsRunTestsResult;
            lhsRunTestsResult = this.getRunTestsResult();
            RunTestsResult rhsRunTestsResult;
            rhsRunTestsResult = that.getRunTestsResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runTestsResult", lhsRunTestsResult), LocatorUtils.property(thatLocator, "runTestsResult", rhsRunTestsResult), lhsRunTestsResult, rhsRunTestsResult)) {
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
        {
            List<CompileTriggerResult> lhsTriggers;
            lhsTriggers = (((this.triggers!= null)&&(!this.triggers.isEmpty()))?this.getTriggers():null);
            List<CompileTriggerResult> rhsTriggers;
            rhsTriggers = (((that.triggers!= null)&&(!that.triggers.isEmpty()))?that.getTriggers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "triggers", lhsTriggers), LocatorUtils.property(thatLocator, "triggers", rhsTriggers), lhsTriggers, rhsTriggers)) {
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
            List<CompileClassResult> theClasses;
            theClasses = (((this.classes!= null)&&(!this.classes.isEmpty()))?this.getClasses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classes", theClasses), currentHashCode, theClasses);
        }
        {
            List<DeleteApexResult> theDeleteClasses;
            theDeleteClasses = (((this.deleteClasses!= null)&&(!this.deleteClasses.isEmpty()))?this.getDeleteClasses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deleteClasses", theDeleteClasses), currentHashCode, theDeleteClasses);
        }
        {
            List<DeleteApexResult> theDeleteTriggers;
            theDeleteTriggers = (((this.deleteTriggers!= null)&&(!this.deleteTriggers.isEmpty()))?this.getDeleteTriggers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deleteTriggers", theDeleteTriggers), currentHashCode, theDeleteTriggers);
        }
        {
            RunTestsResult theRunTestsResult;
            theRunTestsResult = this.getRunTestsResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runTestsResult", theRunTestsResult), currentHashCode, theRunTestsResult);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess);
        }
        {
            List<CompileTriggerResult> theTriggers;
            theTriggers = (((this.triggers!= null)&&(!this.triggers.isEmpty()))?this.getTriggers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "triggers", theTriggers), currentHashCode, theTriggers);
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
            List<CompileClassResult> theClasses;
            theClasses = (((this.classes!= null)&&(!this.classes.isEmpty()))?this.getClasses():null);
            strategy.appendField(locator, this, "classes", buffer, theClasses);
        }
        {
            List<DeleteApexResult> theDeleteClasses;
            theDeleteClasses = (((this.deleteClasses!= null)&&(!this.deleteClasses.isEmpty()))?this.getDeleteClasses():null);
            strategy.appendField(locator, this, "deleteClasses", buffer, theDeleteClasses);
        }
        {
            List<DeleteApexResult> theDeleteTriggers;
            theDeleteTriggers = (((this.deleteTriggers!= null)&&(!this.deleteTriggers.isEmpty()))?this.getDeleteTriggers():null);
            strategy.appendField(locator, this, "deleteTriggers", buffer, theDeleteTriggers);
        }
        {
            RunTestsResult theRunTestsResult;
            theRunTestsResult = this.getRunTestsResult();
            strategy.appendField(locator, this, "runTestsResult", buffer, theRunTestsResult);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        {
            List<CompileTriggerResult> theTriggers;
            theTriggers = (((this.triggers!= null)&&(!this.triggers.isEmpty()))?this.getTriggers():null);
            strategy.appendField(locator, this, "triggers", buffer, theTriggers);
        }
        return buffer;
    }

}
