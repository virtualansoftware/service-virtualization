
package com.sforce.partner;

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
 * <p>Java class for SearchRecordMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecordMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchPromoted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="spellCorrected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRecordMetadata", propOrder = {
    "searchPromoted",
    "spellCorrected"
})
public class SearchRecordMetadata
    implements Equals, HashCode, ToString
{

    protected boolean searchPromoted;
    protected boolean spellCorrected;

    /**
     * Gets the value of the searchPromoted property.
     * 
     */
    public boolean isSearchPromoted() {
        return searchPromoted;
    }

    /**
     * Sets the value of the searchPromoted property.
     * 
     */
    public void setSearchPromoted(boolean value) {
        this.searchPromoted = value;
    }

    /**
     * Gets the value of the spellCorrected property.
     * 
     */
    public boolean isSpellCorrected() {
        return spellCorrected;
    }

    /**
     * Sets the value of the spellCorrected property.
     * 
     */
    public void setSpellCorrected(boolean value) {
        this.spellCorrected = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchRecordMetadata)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchRecordMetadata that = ((SearchRecordMetadata) object);
        {
            boolean lhsSearchPromoted;
            lhsSearchPromoted = (true?this.isSearchPromoted():false);
            boolean rhsSearchPromoted;
            rhsSearchPromoted = (true?that.isSearchPromoted():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchPromoted", lhsSearchPromoted), LocatorUtils.property(thatLocator, "searchPromoted", rhsSearchPromoted), lhsSearchPromoted, rhsSearchPromoted)) {
                return false;
            }
        }
        {
            boolean lhsSpellCorrected;
            lhsSpellCorrected = (true?this.isSpellCorrected():false);
            boolean rhsSpellCorrected;
            rhsSpellCorrected = (true?that.isSpellCorrected():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spellCorrected", lhsSpellCorrected), LocatorUtils.property(thatLocator, "spellCorrected", rhsSpellCorrected), lhsSpellCorrected, rhsSpellCorrected)) {
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
            boolean theSearchPromoted;
            theSearchPromoted = (true?this.isSearchPromoted():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchPromoted", theSearchPromoted), currentHashCode, theSearchPromoted);
        }
        {
            boolean theSpellCorrected;
            theSpellCorrected = (true?this.isSpellCorrected():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spellCorrected", theSpellCorrected), currentHashCode, theSpellCorrected);
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
            boolean theSearchPromoted;
            theSearchPromoted = (true?this.isSearchPromoted():false);
            strategy.appendField(locator, this, "searchPromoted", buffer, theSearchPromoted);
        }
        {
            boolean theSpellCorrected;
            theSpellCorrected = (true?this.isSpellCorrected():false);
            strategy.appendField(locator, this, "spellCorrected", buffer, theSpellCorrected);
        }
        return buffer;
    }

}
