
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
 * <p>Java class for CompileClassResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompileClassResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bodyCrc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://soap.sforce.com/2006/08/apex}ID"/&gt;
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="problem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="problems" type="{http://soap.sforce.com/2006/08/apex}CompileIssue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="warnings" type="{http://soap.sforce.com/2006/08/apex}CompileIssue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompileClassResult", propOrder = {
    "bodyCrc",
    "column",
    "id",
    "line",
    "name",
    "problem",
    "problems",
    "success",
    "warnings"
})
public class CompileClassResult
    implements Equals, HashCode, ToString
{

    protected Integer bodyCrc;
    protected int column;
    @XmlElement(required = true, nillable = true)
    protected String id;
    protected int line;
    protected String name;
    protected String problem;
    @XmlElement(nillable = true)
    protected List<CompileIssue> problems;
    protected boolean success;
    @XmlElement(nillable = true)
    protected List<CompileIssue> warnings;

    /**
     * Gets the value of the bodyCrc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBodyCrc() {
        return bodyCrc;
    }

    /**
     * Sets the value of the bodyCrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBodyCrc(Integer value) {
        this.bodyCrc = value;
    }

    /**
     * Gets the value of the column property.
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     */
    public void setColumn(int value) {
        this.column = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the line property.
     * 
     */
    public int getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     */
    public void setLine(int value) {
        this.line = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the problem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblem() {
        return problem;
    }

    /**
     * Sets the value of the problem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblem(String value) {
        this.problem = value;
    }

    /**
     * Gets the value of the problems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the problems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProblems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompileIssue }
     * 
     * 
     */
    public List<CompileIssue> getProblems() {
        if (problems == null) {
            problems = new ArrayList<CompileIssue>();
        }
        return this.problems;
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
     * Gets the value of the warnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompileIssue }
     * 
     * 
     */
    public List<CompileIssue> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<CompileIssue>();
        }
        return this.warnings;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompileClassResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CompileClassResult that = ((CompileClassResult) object);
        {
            Integer lhsBodyCrc;
            lhsBodyCrc = this.getBodyCrc();
            Integer rhsBodyCrc;
            rhsBodyCrc = that.getBodyCrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bodyCrc", lhsBodyCrc), LocatorUtils.property(thatLocator, "bodyCrc", rhsBodyCrc), lhsBodyCrc, rhsBodyCrc)) {
                return false;
            }
        }
        {
            int lhsColumn;
            lhsColumn = (true?this.getColumn(): 0);
            int rhsColumn;
            rhsColumn = (true?that.getColumn(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "column", lhsColumn), LocatorUtils.property(thatLocator, "column", rhsColumn), lhsColumn, rhsColumn)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            int lhsLine;
            lhsLine = (true?this.getLine(): 0);
            int rhsLine;
            rhsLine = (true?that.getLine(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line", lhsLine), LocatorUtils.property(thatLocator, "line", rhsLine), lhsLine, rhsLine)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsProblem;
            lhsProblem = this.getProblem();
            String rhsProblem;
            rhsProblem = that.getProblem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "problem", lhsProblem), LocatorUtils.property(thatLocator, "problem", rhsProblem), lhsProblem, rhsProblem)) {
                return false;
            }
        }
        {
            List<CompileIssue> lhsProblems;
            lhsProblems = (((this.problems!= null)&&(!this.problems.isEmpty()))?this.getProblems():null);
            List<CompileIssue> rhsProblems;
            rhsProblems = (((that.problems!= null)&&(!that.problems.isEmpty()))?that.getProblems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "problems", lhsProblems), LocatorUtils.property(thatLocator, "problems", rhsProblems), lhsProblems, rhsProblems)) {
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
            List<CompileIssue> lhsWarnings;
            lhsWarnings = (((this.warnings!= null)&&(!this.warnings.isEmpty()))?this.getWarnings():null);
            List<CompileIssue> rhsWarnings;
            rhsWarnings = (((that.warnings!= null)&&(!that.warnings.isEmpty()))?that.getWarnings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warnings", lhsWarnings), LocatorUtils.property(thatLocator, "warnings", rhsWarnings), lhsWarnings, rhsWarnings)) {
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
            Integer theBodyCrc;
            theBodyCrc = this.getBodyCrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bodyCrc", theBodyCrc), currentHashCode, theBodyCrc);
        }
        {
            int theColumn;
            theColumn = (true?this.getColumn(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "column", theColumn), currentHashCode, theColumn);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            int theLine;
            theLine = (true?this.getLine(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line", theLine), currentHashCode, theLine);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theProblem;
            theProblem = this.getProblem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "problem", theProblem), currentHashCode, theProblem);
        }
        {
            List<CompileIssue> theProblems;
            theProblems = (((this.problems!= null)&&(!this.problems.isEmpty()))?this.getProblems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "problems", theProblems), currentHashCode, theProblems);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess);
        }
        {
            List<CompileIssue> theWarnings;
            theWarnings = (((this.warnings!= null)&&(!this.warnings.isEmpty()))?this.getWarnings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warnings", theWarnings), currentHashCode, theWarnings);
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
            Integer theBodyCrc;
            theBodyCrc = this.getBodyCrc();
            strategy.appendField(locator, this, "bodyCrc", buffer, theBodyCrc);
        }
        {
            int theColumn;
            theColumn = (true?this.getColumn(): 0);
            strategy.appendField(locator, this, "column", buffer, theColumn);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            int theLine;
            theLine = (true?this.getLine(): 0);
            strategy.appendField(locator, this, "line", buffer, theLine);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theProblem;
            theProblem = this.getProblem();
            strategy.appendField(locator, this, "problem", buffer, theProblem);
        }
        {
            List<CompileIssue> theProblems;
            theProblems = (((this.problems!= null)&&(!this.problems.isEmpty()))?this.getProblems():null);
            strategy.appendField(locator, this, "problems", buffer, theProblems);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        {
            List<CompileIssue> theWarnings;
            theWarnings = (((this.warnings!= null)&&(!this.warnings.isEmpty()))?this.getWarnings():null);
            strategy.appendField(locator, this, "warnings", buffer, theWarnings);
        }
        return buffer;
    }

}
