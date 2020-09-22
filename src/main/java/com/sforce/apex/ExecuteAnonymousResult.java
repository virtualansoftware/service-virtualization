
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
 * <p>Java class for ExecuteAnonymousResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteAnonymousResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="compileProblem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="compiled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="exceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exceptionStackTrace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteAnonymousResult", propOrder = {
    "column",
    "compileProblem",
    "compiled",
    "exceptionMessage",
    "exceptionStackTrace",
    "line",
    "success"
})
public class ExecuteAnonymousResult
    implements Equals, HashCode, ToString
{

    protected int column;
    @XmlElement(required = true, nillable = true)
    protected String compileProblem;
    protected boolean compiled;
    @XmlElement(required = true, nillable = true)
    protected String exceptionMessage;
    @XmlElement(required = true, nillable = true)
    protected String exceptionStackTrace;
    protected int line;
    protected boolean success;

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
     * Gets the value of the compileProblem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompileProblem() {
        return compileProblem;
    }

    /**
     * Sets the value of the compileProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompileProblem(String value) {
        this.compileProblem = value;
    }

    /**
     * Gets the value of the compiled property.
     * 
     */
    public boolean isCompiled() {
        return compiled;
    }

    /**
     * Sets the value of the compiled property.
     * 
     */
    public void setCompiled(boolean value) {
        this.compiled = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the exceptionStackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionStackTrace() {
        return exceptionStackTrace;
    }

    /**
     * Sets the value of the exceptionStackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionStackTrace(String value) {
        this.exceptionStackTrace = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExecuteAnonymousResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExecuteAnonymousResult that = ((ExecuteAnonymousResult) object);
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
            String lhsCompileProblem;
            lhsCompileProblem = this.getCompileProblem();
            String rhsCompileProblem;
            rhsCompileProblem = that.getCompileProblem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compileProblem", lhsCompileProblem), LocatorUtils.property(thatLocator, "compileProblem", rhsCompileProblem), lhsCompileProblem, rhsCompileProblem)) {
                return false;
            }
        }
        {
            boolean lhsCompiled;
            lhsCompiled = (true?this.isCompiled():false);
            boolean rhsCompiled;
            rhsCompiled = (true?that.isCompiled():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compiled", lhsCompiled), LocatorUtils.property(thatLocator, "compiled", rhsCompiled), lhsCompiled, rhsCompiled)) {
                return false;
            }
        }
        {
            String lhsExceptionMessage;
            lhsExceptionMessage = this.getExceptionMessage();
            String rhsExceptionMessage;
            rhsExceptionMessage = that.getExceptionMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionMessage", lhsExceptionMessage), LocatorUtils.property(thatLocator, "exceptionMessage", rhsExceptionMessage), lhsExceptionMessage, rhsExceptionMessage)) {
                return false;
            }
        }
        {
            String lhsExceptionStackTrace;
            lhsExceptionStackTrace = this.getExceptionStackTrace();
            String rhsExceptionStackTrace;
            rhsExceptionStackTrace = that.getExceptionStackTrace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionStackTrace", lhsExceptionStackTrace), LocatorUtils.property(thatLocator, "exceptionStackTrace", rhsExceptionStackTrace), lhsExceptionStackTrace, rhsExceptionStackTrace)) {
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
            boolean lhsSuccess;
            lhsSuccess = (true?this.isSuccess():false);
            boolean rhsSuccess;
            rhsSuccess = (true?that.isSuccess():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "success", lhsSuccess), LocatorUtils.property(thatLocator, "success", rhsSuccess), lhsSuccess, rhsSuccess)) {
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
            int theColumn;
            theColumn = (true?this.getColumn(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "column", theColumn), currentHashCode, theColumn);
        }
        {
            String theCompileProblem;
            theCompileProblem = this.getCompileProblem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compileProblem", theCompileProblem), currentHashCode, theCompileProblem);
        }
        {
            boolean theCompiled;
            theCompiled = (true?this.isCompiled():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compiled", theCompiled), currentHashCode, theCompiled);
        }
        {
            String theExceptionMessage;
            theExceptionMessage = this.getExceptionMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionMessage", theExceptionMessage), currentHashCode, theExceptionMessage);
        }
        {
            String theExceptionStackTrace;
            theExceptionStackTrace = this.getExceptionStackTrace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionStackTrace", theExceptionStackTrace), currentHashCode, theExceptionStackTrace);
        }
        {
            int theLine;
            theLine = (true?this.getLine(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line", theLine), currentHashCode, theLine);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess);
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
            int theColumn;
            theColumn = (true?this.getColumn(): 0);
            strategy.appendField(locator, this, "column", buffer, theColumn);
        }
        {
            String theCompileProblem;
            theCompileProblem = this.getCompileProblem();
            strategy.appendField(locator, this, "compileProblem", buffer, theCompileProblem);
        }
        {
            boolean theCompiled;
            theCompiled = (true?this.isCompiled():false);
            strategy.appendField(locator, this, "compiled", buffer, theCompiled);
        }
        {
            String theExceptionMessage;
            theExceptionMessage = this.getExceptionMessage();
            strategy.appendField(locator, this, "exceptionMessage", buffer, theExceptionMessage);
        }
        {
            String theExceptionStackTrace;
            theExceptionStackTrace = this.getExceptionStackTrace();
            strategy.appendField(locator, this, "exceptionStackTrace", buffer, theExceptionStackTrace);
        }
        {
            int theLine;
            theLine = (true?this.getLine(): 0);
            strategy.appendField(locator, this, "line", buffer, theLine);
        }
        {
            boolean theSuccess;
            theSuccess = (true?this.isSuccess():false);
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        return buffer;
    }

}
