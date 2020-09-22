
package com.sforce.apex;

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
 * <p>Java class for CodeLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numExecutions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeLocation", propOrder = {
    "column",
    "line",
    "numExecutions",
    "time"
})
public class CodeLocation
    implements Equals, HashCode, ToString
{

    protected int column;
    protected int line;
    protected int numExecutions;
    protected double time;

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
     * Gets the value of the numExecutions property.
     * 
     */
    public int getNumExecutions() {
        return numExecutions;
    }

    /**
     * Sets the value of the numExecutions property.
     * 
     */
    public void setNumExecutions(int value) {
        this.numExecutions = value;
    }

    /**
     * Gets the value of the time property.
     * 
     */
    public double getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(double value) {
        this.time = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CodeLocation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CodeLocation that = ((CodeLocation) object);
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
            int lhsLine;
            lhsLine = (true?this.getLine(): 0);
            int rhsLine;
            rhsLine = (true?that.getLine(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line", lhsLine), LocatorUtils.property(thatLocator, "line", rhsLine), lhsLine, rhsLine)) {
                return false;
            }
        }
        {
            int lhsNumExecutions;
            lhsNumExecutions = (true?this.getNumExecutions(): 0);
            int rhsNumExecutions;
            rhsNumExecutions = (true?that.getNumExecutions(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numExecutions", lhsNumExecutions), LocatorUtils.property(thatLocator, "numExecutions", rhsNumExecutions), lhsNumExecutions, rhsNumExecutions)) {
                return false;
            }
        }
        {
            double lhsTime;
            lhsTime = (true?this.getTime(): 0.0D);
            double rhsTime;
            rhsTime = (true?that.getTime(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
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
            int theLine;
            theLine = (true?this.getLine(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line", theLine), currentHashCode, theLine);
        }
        {
            int theNumExecutions;
            theNumExecutions = (true?this.getNumExecutions(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numExecutions", theNumExecutions), currentHashCode, theNumExecutions);
        }
        {
            double theTime;
            theTime = (true?this.getTime(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime);
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
            int theLine;
            theLine = (true?this.getLine(): 0);
            strategy.appendField(locator, this, "line", buffer, theLine);
        }
        {
            int theNumExecutions;
            theNumExecutions = (true?this.getNumExecutions(): 0);
            strategy.appendField(locator, this, "numExecutions", buffer, theNumExecutions);
        }
        {
            double theTime;
            theTime = (true?this.getTime(): 0.0D);
            strategy.appendField(locator, this, "time", buffer, theTime);
        }
        return buffer;
    }

}
