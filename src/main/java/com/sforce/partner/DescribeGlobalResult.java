
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
 * <p>Java class for DescribeGlobalResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeGlobalResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maxBatchSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sobjects" type="{urn:partner.soap.sforce.com}DescribeGlobalSObjectResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeGlobalResult", propOrder = {
    "encoding",
    "maxBatchSize",
    "sobjects"
})
public class DescribeGlobalResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String encoding;
    protected int maxBatchSize;
    protected List<DescribeGlobalSObjectResult> sobjects;

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the maxBatchSize property.
     * 
     */
    public int getMaxBatchSize() {
        return maxBatchSize;
    }

    /**
     * Sets the value of the maxBatchSize property.
     * 
     */
    public void setMaxBatchSize(int value) {
        this.maxBatchSize = value;
    }

    /**
     * Gets the value of the sobjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sobjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSobjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeGlobalSObjectResult }
     * 
     * 
     */
    public List<DescribeGlobalSObjectResult> getSobjects() {
        if (sobjects == null) {
            sobjects = new ArrayList<DescribeGlobalSObjectResult>();
        }
        return this.sobjects;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeGlobalResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeGlobalResult that = ((DescribeGlobalResult) object);
        {
            String lhsEncoding;
            lhsEncoding = this.getEncoding();
            String rhsEncoding;
            rhsEncoding = that.getEncoding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encoding", lhsEncoding), LocatorUtils.property(thatLocator, "encoding", rhsEncoding), lhsEncoding, rhsEncoding)) {
                return false;
            }
        }
        {
            int lhsMaxBatchSize;
            lhsMaxBatchSize = (true?this.getMaxBatchSize(): 0);
            int rhsMaxBatchSize;
            rhsMaxBatchSize = (true?that.getMaxBatchSize(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxBatchSize", lhsMaxBatchSize), LocatorUtils.property(thatLocator, "maxBatchSize", rhsMaxBatchSize), lhsMaxBatchSize, rhsMaxBatchSize)) {
                return false;
            }
        }
        {
            List<DescribeGlobalSObjectResult> lhsSobjects;
            lhsSobjects = (((this.sobjects!= null)&&(!this.sobjects.isEmpty()))?this.getSobjects():null);
            List<DescribeGlobalSObjectResult> rhsSobjects;
            rhsSobjects = (((that.sobjects!= null)&&(!that.sobjects.isEmpty()))?that.getSobjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sobjects", lhsSobjects), LocatorUtils.property(thatLocator, "sobjects", rhsSobjects), lhsSobjects, rhsSobjects)) {
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
            String theEncoding;
            theEncoding = this.getEncoding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encoding", theEncoding), currentHashCode, theEncoding);
        }
        {
            int theMaxBatchSize;
            theMaxBatchSize = (true?this.getMaxBatchSize(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxBatchSize", theMaxBatchSize), currentHashCode, theMaxBatchSize);
        }
        {
            List<DescribeGlobalSObjectResult> theSobjects;
            theSobjects = (((this.sobjects!= null)&&(!this.sobjects.isEmpty()))?this.getSobjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sobjects", theSobjects), currentHashCode, theSobjects);
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
            String theEncoding;
            theEncoding = this.getEncoding();
            strategy.appendField(locator, this, "encoding", buffer, theEncoding);
        }
        {
            int theMaxBatchSize;
            theMaxBatchSize = (true?this.getMaxBatchSize(): 0);
            strategy.appendField(locator, this, "maxBatchSize", buffer, theMaxBatchSize);
        }
        {
            List<DescribeGlobalSObjectResult> theSobjects;
            theSobjects = (((this.sobjects!= null)&&(!this.sobjects.isEmpty()))?this.getSobjects():null);
            strategy.appendField(locator, this, "sobjects", buffer, theSobjects);
        }
        return buffer;
    }

}
