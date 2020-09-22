
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
 *         &lt;element name="pairs" type="{urn:partner.soap.sforce.com}DataCategoryGroupSobjectTypePair" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="topCategoriesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "pairs",
    "topCategoriesOnly"
})
@XmlRootElement(name = "describeDataCategoryGroupStructures")
public class DescribeDataCategoryGroupStructures
    implements Equals, HashCode, ToString
{

    protected List<DataCategoryGroupSobjectTypePair> pairs;
    protected boolean topCategoriesOnly;

    /**
     * Gets the value of the pairs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataCategoryGroupSobjectTypePair }
     * 
     * 
     */
    public List<DataCategoryGroupSobjectTypePair> getPairs() {
        if (pairs == null) {
            pairs = new ArrayList<DataCategoryGroupSobjectTypePair>();
        }
        return this.pairs;
    }

    /**
     * Gets the value of the topCategoriesOnly property.
     * 
     */
    public boolean isTopCategoriesOnly() {
        return topCategoriesOnly;
    }

    /**
     * Sets the value of the topCategoriesOnly property.
     * 
     */
    public void setTopCategoriesOnly(boolean value) {
        this.topCategoriesOnly = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeDataCategoryGroupStructures)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeDataCategoryGroupStructures that = ((DescribeDataCategoryGroupStructures) object);
        {
            List<DataCategoryGroupSobjectTypePair> lhsPairs;
            lhsPairs = (((this.pairs!= null)&&(!this.pairs.isEmpty()))?this.getPairs():null);
            List<DataCategoryGroupSobjectTypePair> rhsPairs;
            rhsPairs = (((that.pairs!= null)&&(!that.pairs.isEmpty()))?that.getPairs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pairs", lhsPairs), LocatorUtils.property(thatLocator, "pairs", rhsPairs), lhsPairs, rhsPairs)) {
                return false;
            }
        }
        {
            boolean lhsTopCategoriesOnly;
            lhsTopCategoriesOnly = (true?this.isTopCategoriesOnly():false);
            boolean rhsTopCategoriesOnly;
            rhsTopCategoriesOnly = (true?that.isTopCategoriesOnly():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topCategoriesOnly", lhsTopCategoriesOnly), LocatorUtils.property(thatLocator, "topCategoriesOnly", rhsTopCategoriesOnly), lhsTopCategoriesOnly, rhsTopCategoriesOnly)) {
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
            List<DataCategoryGroupSobjectTypePair> thePairs;
            thePairs = (((this.pairs!= null)&&(!this.pairs.isEmpty()))?this.getPairs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pairs", thePairs), currentHashCode, thePairs);
        }
        {
            boolean theTopCategoriesOnly;
            theTopCategoriesOnly = (true?this.isTopCategoriesOnly():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topCategoriesOnly", theTopCategoriesOnly), currentHashCode, theTopCategoriesOnly);
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
            List<DataCategoryGroupSobjectTypePair> thePairs;
            thePairs = (((this.pairs!= null)&&(!this.pairs.isEmpty()))?this.getPairs():null);
            strategy.appendField(locator, this, "pairs", buffer, thePairs);
        }
        {
            boolean theTopCategoriesOnly;
            theTopCategoriesOnly = (true?this.isTopCategoriesOnly():false);
            strategy.appendField(locator, this, "topCategoriesOnly", buffer, theTopCategoriesOnly);
        }
        return buffer;
    }

}
