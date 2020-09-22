
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nouns" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="onlyRenamed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeFields" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nouns",
    "onlyRenamed",
    "includeFields"
})
@XmlRootElement(name = "describeNouns")
public class DescribeNouns
    implements Equals, HashCode, ToString
{

    protected List<String> nouns;
    protected boolean onlyRenamed;
    protected boolean includeFields;

    /**
     * Gets the value of the nouns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nouns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNouns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNouns() {
        if (nouns == null) {
            nouns = new ArrayList<String>();
        }
        return this.nouns;
    }

    /**
     * Gets the value of the onlyRenamed property.
     * 
     */
    public boolean isOnlyRenamed() {
        return onlyRenamed;
    }

    /**
     * Sets the value of the onlyRenamed property.
     * 
     */
    public void setOnlyRenamed(boolean value) {
        this.onlyRenamed = value;
    }

    /**
     * Gets the value of the includeFields property.
     * 
     */
    public boolean isIncludeFields() {
        return includeFields;
    }

    /**
     * Sets the value of the includeFields property.
     * 
     */
    public void setIncludeFields(boolean value) {
        this.includeFields = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeNouns)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeNouns that = ((DescribeNouns) object);
        {
            List<String> lhsNouns;
            lhsNouns = (((this.nouns!= null)&&(!this.nouns.isEmpty()))?this.getNouns():null);
            List<String> rhsNouns;
            rhsNouns = (((that.nouns!= null)&&(!that.nouns.isEmpty()))?that.getNouns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nouns", lhsNouns), LocatorUtils.property(thatLocator, "nouns", rhsNouns), lhsNouns, rhsNouns)) {
                return false;
            }
        }
        {
            boolean lhsOnlyRenamed;
            lhsOnlyRenamed = (true?this.isOnlyRenamed():false);
            boolean rhsOnlyRenamed;
            rhsOnlyRenamed = (true?that.isOnlyRenamed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onlyRenamed", lhsOnlyRenamed), LocatorUtils.property(thatLocator, "onlyRenamed", rhsOnlyRenamed), lhsOnlyRenamed, rhsOnlyRenamed)) {
                return false;
            }
        }
        {
            boolean lhsIncludeFields;
            lhsIncludeFields = (true?this.isIncludeFields():false);
            boolean rhsIncludeFields;
            rhsIncludeFields = (true?that.isIncludeFields():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeFields", lhsIncludeFields), LocatorUtils.property(thatLocator, "includeFields", rhsIncludeFields), lhsIncludeFields, rhsIncludeFields)) {
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
            List<String> theNouns;
            theNouns = (((this.nouns!= null)&&(!this.nouns.isEmpty()))?this.getNouns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nouns", theNouns), currentHashCode, theNouns);
        }
        {
            boolean theOnlyRenamed;
            theOnlyRenamed = (true?this.isOnlyRenamed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onlyRenamed", theOnlyRenamed), currentHashCode, theOnlyRenamed);
        }
        {
            boolean theIncludeFields;
            theIncludeFields = (true?this.isIncludeFields():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeFields", theIncludeFields), currentHashCode, theIncludeFields);
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
            List<String> theNouns;
            theNouns = (((this.nouns!= null)&&(!this.nouns.isEmpty()))?this.getNouns():null);
            strategy.appendField(locator, this, "nouns", buffer, theNouns);
        }
        {
            boolean theOnlyRenamed;
            theOnlyRenamed = (true?this.isOnlyRenamed():false);
            strategy.appendField(locator, this, "onlyRenamed", buffer, theOnlyRenamed);
        }
        {
            boolean theIncludeFields;
            theIncludeFields = (true?this.isIncludeFields():false);
            strategy.appendField(locator, this, "includeFields", buffer, theIncludeFields);
        }
        return buffer;
    }

}
