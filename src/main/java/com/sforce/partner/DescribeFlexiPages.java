
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="flexiPages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="contexts" type="{urn:partner.soap.sforce.com}FlexipageContext" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "flexiPages",
    "contexts"
})
@XmlRootElement(name = "describeFlexiPages")
public class DescribeFlexiPages
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<String> flexiPages;
    protected List<FlexipageContext> contexts;

    /**
     * Gets the value of the flexiPages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flexiPages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlexiPages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlexiPages() {
        if (flexiPages == null) {
            flexiPages = new ArrayList<String>();
        }
        return this.flexiPages;
    }

    /**
     * Gets the value of the contexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexipageContext }
     * 
     * 
     */
    public List<FlexipageContext> getContexts() {
        if (contexts == null) {
            contexts = new ArrayList<FlexipageContext>();
        }
        return this.contexts;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeFlexiPages)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeFlexiPages that = ((DescribeFlexiPages) object);
        {
            List<String> lhsFlexiPages;
            lhsFlexiPages = (((this.flexiPages!= null)&&(!this.flexiPages.isEmpty()))?this.getFlexiPages():null);
            List<String> rhsFlexiPages;
            rhsFlexiPages = (((that.flexiPages!= null)&&(!that.flexiPages.isEmpty()))?that.getFlexiPages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flexiPages", lhsFlexiPages), LocatorUtils.property(thatLocator, "flexiPages", rhsFlexiPages), lhsFlexiPages, rhsFlexiPages)) {
                return false;
            }
        }
        {
            List<FlexipageContext> lhsContexts;
            lhsContexts = (((this.contexts!= null)&&(!this.contexts.isEmpty()))?this.getContexts():null);
            List<FlexipageContext> rhsContexts;
            rhsContexts = (((that.contexts!= null)&&(!that.contexts.isEmpty()))?that.getContexts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contexts", lhsContexts), LocatorUtils.property(thatLocator, "contexts", rhsContexts), lhsContexts, rhsContexts)) {
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
            List<String> theFlexiPages;
            theFlexiPages = (((this.flexiPages!= null)&&(!this.flexiPages.isEmpty()))?this.getFlexiPages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flexiPages", theFlexiPages), currentHashCode, theFlexiPages);
        }
        {
            List<FlexipageContext> theContexts;
            theContexts = (((this.contexts!= null)&&(!this.contexts.isEmpty()))?this.getContexts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contexts", theContexts), currentHashCode, theContexts);
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
            List<String> theFlexiPages;
            theFlexiPages = (((this.flexiPages!= null)&&(!this.flexiPages.isEmpty()))?this.getFlexiPages():null);
            strategy.appendField(locator, this, "flexiPages", buffer, theFlexiPages);
        }
        {
            List<FlexipageContext> theContexts;
            theContexts = (((this.contexts!= null)&&(!this.contexts.isEmpty()))?this.getContexts():null);
            strategy.appendField(locator, this, "contexts", buffer, theContexts);
        }
        return buffer;
    }

}
