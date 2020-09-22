
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
 *         &lt;element name="encodedIntervalTimerTree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlerMetrics" type="{urn:partner.soap.sforce.com}NameValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "encodedIntervalTimerTree",
    "handlerMetrics"
})
@XmlRootElement(name = "APIPerformanceInfo")
public class APIPerformanceInfo
    implements Equals, HashCode, ToString
{

    protected String encodedIntervalTimerTree;
    protected List<NameValuePair> handlerMetrics;

    /**
     * Gets the value of the encodedIntervalTimerTree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodedIntervalTimerTree() {
        return encodedIntervalTimerTree;
    }

    /**
     * Sets the value of the encodedIntervalTimerTree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodedIntervalTimerTree(String value) {
        this.encodedIntervalTimerTree = value;
    }

    /**
     * Gets the value of the handlerMetrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlerMetrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlerMetrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getHandlerMetrics() {
        if (handlerMetrics == null) {
            handlerMetrics = new ArrayList<NameValuePair>();
        }
        return this.handlerMetrics;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof APIPerformanceInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final APIPerformanceInfo that = ((APIPerformanceInfo) object);
        {
            String lhsEncodedIntervalTimerTree;
            lhsEncodedIntervalTimerTree = this.getEncodedIntervalTimerTree();
            String rhsEncodedIntervalTimerTree;
            rhsEncodedIntervalTimerTree = that.getEncodedIntervalTimerTree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encodedIntervalTimerTree", lhsEncodedIntervalTimerTree), LocatorUtils.property(thatLocator, "encodedIntervalTimerTree", rhsEncodedIntervalTimerTree), lhsEncodedIntervalTimerTree, rhsEncodedIntervalTimerTree)) {
                return false;
            }
        }
        {
            List<NameValuePair> lhsHandlerMetrics;
            lhsHandlerMetrics = (((this.handlerMetrics!= null)&&(!this.handlerMetrics.isEmpty()))?this.getHandlerMetrics():null);
            List<NameValuePair> rhsHandlerMetrics;
            rhsHandlerMetrics = (((that.handlerMetrics!= null)&&(!that.handlerMetrics.isEmpty()))?that.getHandlerMetrics():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlerMetrics", lhsHandlerMetrics), LocatorUtils.property(thatLocator, "handlerMetrics", rhsHandlerMetrics), lhsHandlerMetrics, rhsHandlerMetrics)) {
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
            String theEncodedIntervalTimerTree;
            theEncodedIntervalTimerTree = this.getEncodedIntervalTimerTree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encodedIntervalTimerTree", theEncodedIntervalTimerTree), currentHashCode, theEncodedIntervalTimerTree);
        }
        {
            List<NameValuePair> theHandlerMetrics;
            theHandlerMetrics = (((this.handlerMetrics!= null)&&(!this.handlerMetrics.isEmpty()))?this.getHandlerMetrics():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlerMetrics", theHandlerMetrics), currentHashCode, theHandlerMetrics);
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
            String theEncodedIntervalTimerTree;
            theEncodedIntervalTimerTree = this.getEncodedIntervalTimerTree();
            strategy.appendField(locator, this, "encodedIntervalTimerTree", buffer, theEncodedIntervalTimerTree);
        }
        {
            List<NameValuePair> theHandlerMetrics;
            theHandlerMetrics = (((this.handlerMetrics!= null)&&(!this.handlerMetrics.isEmpty()))?this.getHandlerMetrics():null);
            strategy.appendField(locator, this, "handlerMetrics", buffer, theHandlerMetrics);
        }
        return buffer;
    }

}
