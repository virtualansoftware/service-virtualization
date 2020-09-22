
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
 * <p>Java class for CompileAndTestRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompileAndTestRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="classes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deleteClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deleteTriggers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="runTestsRequest" type="{http://soap.sforce.com/2006/08/apex}RunTestsRequest" minOccurs="0"/&gt;
 *         &lt;element name="triggers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompileAndTestRequest", propOrder = {
    "checkOnly",
    "classes",
    "deleteClasses",
    "deleteTriggers",
    "runTestsRequest",
    "triggers"
})
public class CompileAndTestRequest
    implements Equals, HashCode, ToString
{

    protected boolean checkOnly;
    protected List<String> classes;
    protected List<String> deleteClasses;
    protected List<String> deleteTriggers;
    protected RunTestsRequest runTestsRequest;
    protected List<String> triggers;

    /**
     * Gets the value of the checkOnly property.
     * 
     */
    public boolean isCheckOnly() {
        return checkOnly;
    }

    /**
     * Sets the value of the checkOnly property.
     * 
     */
    public void setCheckOnly(boolean value) {
        this.checkOnly = value;
    }

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
     * {@link String }
     * 
     * 
     */
    public List<String> getClasses() {
        if (classes == null) {
            classes = new ArrayList<String>();
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
     * {@link String }
     * 
     * 
     */
    public List<String> getDeleteClasses() {
        if (deleteClasses == null) {
            deleteClasses = new ArrayList<String>();
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
     * {@link String }
     * 
     * 
     */
    public List<String> getDeleteTriggers() {
        if (deleteTriggers == null) {
            deleteTriggers = new ArrayList<String>();
        }
        return this.deleteTriggers;
    }

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
     * {@link String }
     * 
     * 
     */
    public List<String> getTriggers() {
        if (triggers == null) {
            triggers = new ArrayList<String>();
        }
        return this.triggers;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompileAndTestRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CompileAndTestRequest that = ((CompileAndTestRequest) object);
        {
            boolean lhsCheckOnly;
            lhsCheckOnly = (true?this.isCheckOnly():false);
            boolean rhsCheckOnly;
            rhsCheckOnly = (true?that.isCheckOnly():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkOnly", lhsCheckOnly), LocatorUtils.property(thatLocator, "checkOnly", rhsCheckOnly), lhsCheckOnly, rhsCheckOnly)) {
                return false;
            }
        }
        {
            List<String> lhsClasses;
            lhsClasses = (((this.classes!= null)&&(!this.classes.isEmpty()))?this.getClasses():null);
            List<String> rhsClasses;
            rhsClasses = (((that.classes!= null)&&(!that.classes.isEmpty()))?that.getClasses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classes", lhsClasses), LocatorUtils.property(thatLocator, "classes", rhsClasses), lhsClasses, rhsClasses)) {
                return false;
            }
        }
        {
            List<String> lhsDeleteClasses;
            lhsDeleteClasses = (((this.deleteClasses!= null)&&(!this.deleteClasses.isEmpty()))?this.getDeleteClasses():null);
            List<String> rhsDeleteClasses;
            rhsDeleteClasses = (((that.deleteClasses!= null)&&(!that.deleteClasses.isEmpty()))?that.getDeleteClasses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deleteClasses", lhsDeleteClasses), LocatorUtils.property(thatLocator, "deleteClasses", rhsDeleteClasses), lhsDeleteClasses, rhsDeleteClasses)) {
                return false;
            }
        }
        {
            List<String> lhsDeleteTriggers;
            lhsDeleteTriggers = (((this.deleteTriggers!= null)&&(!this.deleteTriggers.isEmpty()))?this.getDeleteTriggers():null);
            List<String> rhsDeleteTriggers;
            rhsDeleteTriggers = (((that.deleteTriggers!= null)&&(!that.deleteTriggers.isEmpty()))?that.getDeleteTriggers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deleteTriggers", lhsDeleteTriggers), LocatorUtils.property(thatLocator, "deleteTriggers", rhsDeleteTriggers), lhsDeleteTriggers, rhsDeleteTriggers)) {
                return false;
            }
        }
        {
            RunTestsRequest lhsRunTestsRequest;
            lhsRunTestsRequest = this.getRunTestsRequest();
            RunTestsRequest rhsRunTestsRequest;
            rhsRunTestsRequest = that.getRunTestsRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runTestsRequest", lhsRunTestsRequest), LocatorUtils.property(thatLocator, "runTestsRequest", rhsRunTestsRequest), lhsRunTestsRequest, rhsRunTestsRequest)) {
                return false;
            }
        }
        {
            List<String> lhsTriggers;
            lhsTriggers = (((this.triggers!= null)&&(!this.triggers.isEmpty()))?this.getTriggers():null);
            List<String> rhsTriggers;
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
            boolean theCheckOnly;
            theCheckOnly = (true?this.isCheckOnly():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkOnly", theCheckOnly), currentHashCode, theCheckOnly);
        }
        {
            List<String> theClasses;
            theClasses = (((this.classes!= null)&&(!this.classes.isEmpty()))?this.getClasses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classes", theClasses), currentHashCode, theClasses);
        }
        {
            List<String> theDeleteClasses;
            theDeleteClasses = (((this.deleteClasses!= null)&&(!this.deleteClasses.isEmpty()))?this.getDeleteClasses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deleteClasses", theDeleteClasses), currentHashCode, theDeleteClasses);
        }
        {
            List<String> theDeleteTriggers;
            theDeleteTriggers = (((this.deleteTriggers!= null)&&(!this.deleteTriggers.isEmpty()))?this.getDeleteTriggers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deleteTriggers", theDeleteTriggers), currentHashCode, theDeleteTriggers);
        }
        {
            RunTestsRequest theRunTestsRequest;
            theRunTestsRequest = this.getRunTestsRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runTestsRequest", theRunTestsRequest), currentHashCode, theRunTestsRequest);
        }
        {
            List<String> theTriggers;
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
            boolean theCheckOnly;
            theCheckOnly = (true?this.isCheckOnly():false);
            strategy.appendField(locator, this, "checkOnly", buffer, theCheckOnly);
        }
        {
            List<String> theClasses;
            theClasses = (((this.classes!= null)&&(!this.classes.isEmpty()))?this.getClasses():null);
            strategy.appendField(locator, this, "classes", buffer, theClasses);
        }
        {
            List<String> theDeleteClasses;
            theDeleteClasses = (((this.deleteClasses!= null)&&(!this.deleteClasses.isEmpty()))?this.getDeleteClasses():null);
            strategy.appendField(locator, this, "deleteClasses", buffer, theDeleteClasses);
        }
        {
            List<String> theDeleteTriggers;
            theDeleteTriggers = (((this.deleteTriggers!= null)&&(!this.deleteTriggers.isEmpty()))?this.getDeleteTriggers():null);
            strategy.appendField(locator, this, "deleteTriggers", buffer, theDeleteTriggers);
        }
        {
            RunTestsRequest theRunTestsRequest;
            theRunTestsRequest = this.getRunTestsRequest();
            strategy.appendField(locator, this, "runTestsRequest", buffer, theRunTestsRequest);
        }
        {
            List<String> theTriggers;
            theTriggers = (((this.triggers!= null)&&(!this.triggers.isEmpty()))?this.getTriggers():null);
            strategy.appendField(locator, this, "triggers", buffer, theTriggers);
        }
        return buffer;
    }

}
