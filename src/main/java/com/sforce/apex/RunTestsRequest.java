
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
 * <p>Java class for RunTestsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunTestsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allTests" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="classes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maxFailedTests" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="packages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="skipCodeCoverage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tests" type="{http://soap.sforce.com/2006/08/apex}TestsNode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunTestsRequest", propOrder = {
    "allTests",
    "classes",
    "maxFailedTests",
    "namespace",
    "packages",
    "skipCodeCoverage",
    "tests"
})
public class RunTestsRequest
    implements Equals, HashCode, ToString
{

    protected boolean allTests;
    protected List<String> classes;
    protected Integer maxFailedTests;
    @XmlElement(required = true)
    protected String namespace;
    protected List<String> packages;
    protected Boolean skipCodeCoverage;
    protected List<TestsNode> tests;

    /**
     * Gets the value of the allTests property.
     * 
     */
    public boolean isAllTests() {
        return allTests;
    }

    /**
     * Sets the value of the allTests property.
     * 
     */
    public void setAllTests(boolean value) {
        this.allTests = value;
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
     * Gets the value of the maxFailedTests property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFailedTests() {
        return maxFailedTests;
    }

    /**
     * Sets the value of the maxFailedTests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFailedTests(Integer value) {
        this.maxFailedTests = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the packages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackages() {
        if (packages == null) {
            packages = new ArrayList<String>();
        }
        return this.packages;
    }

    /**
     * Gets the value of the skipCodeCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipCodeCoverage() {
        return skipCodeCoverage;
    }

    /**
     * Sets the value of the skipCodeCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipCodeCoverage(Boolean value) {
        this.skipCodeCoverage = value;
    }

    /**
     * Gets the value of the tests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestsNode }
     * 
     * 
     */
    public List<TestsNode> getTests() {
        if (tests == null) {
            tests = new ArrayList<TestsNode>();
        }
        return this.tests;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RunTestsRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RunTestsRequest that = ((RunTestsRequest) object);
        {
            boolean lhsAllTests;
            lhsAllTests = (true?this.isAllTests():false);
            boolean rhsAllTests;
            rhsAllTests = (true?that.isAllTests():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allTests", lhsAllTests), LocatorUtils.property(thatLocator, "allTests", rhsAllTests), lhsAllTests, rhsAllTests)) {
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
            Integer lhsMaxFailedTests;
            lhsMaxFailedTests = this.getMaxFailedTests();
            Integer rhsMaxFailedTests;
            rhsMaxFailedTests = that.getMaxFailedTests();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxFailedTests", lhsMaxFailedTests), LocatorUtils.property(thatLocator, "maxFailedTests", rhsMaxFailedTests), lhsMaxFailedTests, rhsMaxFailedTests)) {
                return false;
            }
        }
        {
            String lhsNamespace;
            lhsNamespace = this.getNamespace();
            String rhsNamespace;
            rhsNamespace = that.getNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespace", lhsNamespace), LocatorUtils.property(thatLocator, "namespace", rhsNamespace), lhsNamespace, rhsNamespace)) {
                return false;
            }
        }
        {
            List<String> lhsPackages;
            lhsPackages = (((this.packages!= null)&&(!this.packages.isEmpty()))?this.getPackages():null);
            List<String> rhsPackages;
            rhsPackages = (((that.packages!= null)&&(!that.packages.isEmpty()))?that.getPackages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packages", lhsPackages), LocatorUtils.property(thatLocator, "packages", rhsPackages), lhsPackages, rhsPackages)) {
                return false;
            }
        }
        {
            Boolean lhsSkipCodeCoverage;
            lhsSkipCodeCoverage = this.isSkipCodeCoverage();
            Boolean rhsSkipCodeCoverage;
            rhsSkipCodeCoverage = that.isSkipCodeCoverage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "skipCodeCoverage", lhsSkipCodeCoverage), LocatorUtils.property(thatLocator, "skipCodeCoverage", rhsSkipCodeCoverage), lhsSkipCodeCoverage, rhsSkipCodeCoverage)) {
                return false;
            }
        }
        {
            List<TestsNode> lhsTests;
            lhsTests = (((this.tests!= null)&&(!this.tests.isEmpty()))?this.getTests():null);
            List<TestsNode> rhsTests;
            rhsTests = (((that.tests!= null)&&(!that.tests.isEmpty()))?that.getTests():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tests", lhsTests), LocatorUtils.property(thatLocator, "tests", rhsTests), lhsTests, rhsTests)) {
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
            boolean theAllTests;
            theAllTests = (true?this.isAllTests():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allTests", theAllTests), currentHashCode, theAllTests);
        }
        {
            List<String> theClasses;
            theClasses = (((this.classes!= null)&&(!this.classes.isEmpty()))?this.getClasses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classes", theClasses), currentHashCode, theClasses);
        }
        {
            Integer theMaxFailedTests;
            theMaxFailedTests = this.getMaxFailedTests();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxFailedTests", theMaxFailedTests), currentHashCode, theMaxFailedTests);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespace", theNamespace), currentHashCode, theNamespace);
        }
        {
            List<String> thePackages;
            thePackages = (((this.packages!= null)&&(!this.packages.isEmpty()))?this.getPackages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packages", thePackages), currentHashCode, thePackages);
        }
        {
            Boolean theSkipCodeCoverage;
            theSkipCodeCoverage = this.isSkipCodeCoverage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "skipCodeCoverage", theSkipCodeCoverage), currentHashCode, theSkipCodeCoverage);
        }
        {
            List<TestsNode> theTests;
            theTests = (((this.tests!= null)&&(!this.tests.isEmpty()))?this.getTests():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tests", theTests), currentHashCode, theTests);
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
            boolean theAllTests;
            theAllTests = (true?this.isAllTests():false);
            strategy.appendField(locator, this, "allTests", buffer, theAllTests);
        }
        {
            List<String> theClasses;
            theClasses = (((this.classes!= null)&&(!this.classes.isEmpty()))?this.getClasses():null);
            strategy.appendField(locator, this, "classes", buffer, theClasses);
        }
        {
            Integer theMaxFailedTests;
            theMaxFailedTests = this.getMaxFailedTests();
            strategy.appendField(locator, this, "maxFailedTests", buffer, theMaxFailedTests);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            strategy.appendField(locator, this, "namespace", buffer, theNamespace);
        }
        {
            List<String> thePackages;
            thePackages = (((this.packages!= null)&&(!this.packages.isEmpty()))?this.getPackages():null);
            strategy.appendField(locator, this, "packages", buffer, thePackages);
        }
        {
            Boolean theSkipCodeCoverage;
            theSkipCodeCoverage = this.isSkipCodeCoverage();
            strategy.appendField(locator, this, "skipCodeCoverage", buffer, theSkipCodeCoverage);
        }
        {
            List<TestsNode> theTests;
            theTests = (((this.tests!= null)&&(!this.tests.isEmpty()))?this.getTests():null);
            strategy.appendField(locator, this, "tests", buffer, theTests);
        }
        return buffer;
    }

}
