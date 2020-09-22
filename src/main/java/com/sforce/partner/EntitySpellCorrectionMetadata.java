
package com.sforce.partner;

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
 * <p>Java class for EntitySpellCorrectionMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitySpellCorrectionMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correctedQuery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hasNonCorrectedResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitySpellCorrectionMetadata", propOrder = {
    "correctedQuery",
    "hasNonCorrectedResults"
})
public class EntitySpellCorrectionMetadata
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String correctedQuery;
    protected boolean hasNonCorrectedResults;

    /**
     * Gets the value of the correctedQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedQuery() {
        return correctedQuery;
    }

    /**
     * Sets the value of the correctedQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedQuery(String value) {
        this.correctedQuery = value;
    }

    /**
     * Gets the value of the hasNonCorrectedResults property.
     * 
     */
    public boolean isHasNonCorrectedResults() {
        return hasNonCorrectedResults;
    }

    /**
     * Sets the value of the hasNonCorrectedResults property.
     * 
     */
    public void setHasNonCorrectedResults(boolean value) {
        this.hasNonCorrectedResults = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EntitySpellCorrectionMetadata)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EntitySpellCorrectionMetadata that = ((EntitySpellCorrectionMetadata) object);
        {
            String lhsCorrectedQuery;
            lhsCorrectedQuery = this.getCorrectedQuery();
            String rhsCorrectedQuery;
            rhsCorrectedQuery = that.getCorrectedQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "correctedQuery", lhsCorrectedQuery), LocatorUtils.property(thatLocator, "correctedQuery", rhsCorrectedQuery), lhsCorrectedQuery, rhsCorrectedQuery)) {
                return false;
            }
        }
        {
            boolean lhsHasNonCorrectedResults;
            lhsHasNonCorrectedResults = (true?this.isHasNonCorrectedResults():false);
            boolean rhsHasNonCorrectedResults;
            rhsHasNonCorrectedResults = (true?that.isHasNonCorrectedResults():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasNonCorrectedResults", lhsHasNonCorrectedResults), LocatorUtils.property(thatLocator, "hasNonCorrectedResults", rhsHasNonCorrectedResults), lhsHasNonCorrectedResults, rhsHasNonCorrectedResults)) {
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
            String theCorrectedQuery;
            theCorrectedQuery = this.getCorrectedQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "correctedQuery", theCorrectedQuery), currentHashCode, theCorrectedQuery);
        }
        {
            boolean theHasNonCorrectedResults;
            theHasNonCorrectedResults = (true?this.isHasNonCorrectedResults():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasNonCorrectedResults", theHasNonCorrectedResults), currentHashCode, theHasNonCorrectedResults);
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
            String theCorrectedQuery;
            theCorrectedQuery = this.getCorrectedQuery();
            strategy.appendField(locator, this, "correctedQuery", buffer, theCorrectedQuery);
        }
        {
            boolean theHasNonCorrectedResults;
            theHasNonCorrectedResults = (true?this.isHasNonCorrectedResults():false);
            strategy.appendField(locator, this, "hasNonCorrectedResults", buffer, theHasNonCorrectedResults);
        }
        return buffer;
    }

}
