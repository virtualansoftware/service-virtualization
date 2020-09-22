
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
 * <p>Java class for TestsNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestsNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="testMethods" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestsNode", propOrder = {
    "classId",
    "className",
    "testMethods"
})
public class TestsNode
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String classId;
    @XmlElement(required = true)
    protected String className;
    protected List<String> testMethods;

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassId(String value) {
        this.classId = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the testMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestMethods() {
        if (testMethods == null) {
            testMethods = new ArrayList<String>();
        }
        return this.testMethods;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TestsNode)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TestsNode that = ((TestsNode) object);
        {
            String lhsClassId;
            lhsClassId = this.getClassId();
            String rhsClassId;
            rhsClassId = that.getClassId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classId", lhsClassId), LocatorUtils.property(thatLocator, "classId", rhsClassId), lhsClassId, rhsClassId)) {
                return false;
            }
        }
        {
            String lhsClassName;
            lhsClassName = this.getClassName();
            String rhsClassName;
            rhsClassName = that.getClassName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "className", lhsClassName), LocatorUtils.property(thatLocator, "className", rhsClassName), lhsClassName, rhsClassName)) {
                return false;
            }
        }
        {
            List<String> lhsTestMethods;
            lhsTestMethods = (((this.testMethods!= null)&&(!this.testMethods.isEmpty()))?this.getTestMethods():null);
            List<String> rhsTestMethods;
            rhsTestMethods = (((that.testMethods!= null)&&(!that.testMethods.isEmpty()))?that.getTestMethods():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testMethods", lhsTestMethods), LocatorUtils.property(thatLocator, "testMethods", rhsTestMethods), lhsTestMethods, rhsTestMethods)) {
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
            String theClassId;
            theClassId = this.getClassId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classId", theClassId), currentHashCode, theClassId);
        }
        {
            String theClassName;
            theClassName = this.getClassName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "className", theClassName), currentHashCode, theClassName);
        }
        {
            List<String> theTestMethods;
            theTestMethods = (((this.testMethods!= null)&&(!this.testMethods.isEmpty()))?this.getTestMethods():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testMethods", theTestMethods), currentHashCode, theTestMethods);
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
            String theClassId;
            theClassId = this.getClassId();
            strategy.appendField(locator, this, "classId", buffer, theClassId);
        }
        {
            String theClassName;
            theClassName = this.getClassName();
            strategy.appendField(locator, this, "className", buffer, theClassName);
        }
        {
            List<String> theTestMethods;
            theTestMethods = (((this.testMethods!= null)&&(!this.testMethods.isEmpty()))?this.getTestMethods():null);
            strategy.appendField(locator, this, "testMethods", buffer, theTestMethods);
        }
        return buffer;
    }

}
