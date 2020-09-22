
package com.sforce.partner;

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
 * <p>Java class for DescribeLayoutButtonSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutButtonSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detailButtons" type="{urn:partner.soap.sforce.com}DescribeLayoutButton" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutButtonSection", propOrder = {
    "detailButtons"
})
public class DescribeLayoutButtonSection
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<DescribeLayoutButton> detailButtons;

    /**
     * Gets the value of the detailButtons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailButtons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailButtons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeLayoutButton }
     * 
     * 
     */
    public List<DescribeLayoutButton> getDetailButtons() {
        if (detailButtons == null) {
            detailButtons = new ArrayList<DescribeLayoutButton>();
        }
        return this.detailButtons;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeLayoutButtonSection)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeLayoutButtonSection that = ((DescribeLayoutButtonSection) object);
        {
            List<DescribeLayoutButton> lhsDetailButtons;
            lhsDetailButtons = (((this.detailButtons!= null)&&(!this.detailButtons.isEmpty()))?this.getDetailButtons():null);
            List<DescribeLayoutButton> rhsDetailButtons;
            rhsDetailButtons = (((that.detailButtons!= null)&&(!that.detailButtons.isEmpty()))?that.getDetailButtons():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detailButtons", lhsDetailButtons), LocatorUtils.property(thatLocator, "detailButtons", rhsDetailButtons), lhsDetailButtons, rhsDetailButtons)) {
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
            List<DescribeLayoutButton> theDetailButtons;
            theDetailButtons = (((this.detailButtons!= null)&&(!this.detailButtons.isEmpty()))?this.getDetailButtons():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detailButtons", theDetailButtons), currentHashCode, theDetailButtons);
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
            List<DescribeLayoutButton> theDetailButtons;
            theDetailButtons = (((this.detailButtons!= null)&&(!this.detailButtons.isEmpty()))?this.getDetailButtons():null);
            strategy.appendField(locator, this, "detailButtons", buffer, theDetailButtons);
        }
        return buffer;
    }

}
