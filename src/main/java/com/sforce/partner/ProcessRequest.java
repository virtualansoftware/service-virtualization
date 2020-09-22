
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ProcessRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nextApproverIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessRequest", propOrder = {
    "comments",
    "nextApproverIds"
})
@XmlSeeAlso({
    ProcessSubmitRequest.class,
    ProcessWorkitemRequest.class
})
public class ProcessRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String comments;
    @XmlElement(nillable = true)
    protected List<String> nextApproverIds;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the nextApproverIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextApproverIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextApproverIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNextApproverIds() {
        if (nextApproverIds == null) {
            nextApproverIds = new ArrayList<String>();
        }
        return this.nextApproverIds;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcessRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProcessRequest that = ((ProcessRequest) object);
        {
            String lhsComments;
            lhsComments = this.getComments();
            String rhsComments;
            rhsComments = that.getComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments)) {
                return false;
            }
        }
        {
            List<String> lhsNextApproverIds;
            lhsNextApproverIds = (((this.nextApproverIds!= null)&&(!this.nextApproverIds.isEmpty()))?this.getNextApproverIds():null);
            List<String> rhsNextApproverIds;
            rhsNextApproverIds = (((that.nextApproverIds!= null)&&(!that.nextApproverIds.isEmpty()))?that.getNextApproverIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nextApproverIds", lhsNextApproverIds), LocatorUtils.property(thatLocator, "nextApproverIds", rhsNextApproverIds), lhsNextApproverIds, rhsNextApproverIds)) {
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
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments);
        }
        {
            List<String> theNextApproverIds;
            theNextApproverIds = (((this.nextApproverIds!= null)&&(!this.nextApproverIds.isEmpty()))?this.getNextApproverIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nextApproverIds", theNextApproverIds), currentHashCode, theNextApproverIds);
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
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            List<String> theNextApproverIds;
            theNextApproverIds = (((this.nextApproverIds!= null)&&(!this.nextApproverIds.isEmpty()))?this.getNextApproverIds():null);
            strategy.appendField(locator, this, "nextApproverIds", buffer, theNextApproverIds);
        }
        return buffer;
    }

}
