
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
 * <p>Java class for RelatedContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedContentItems" type="{urn:partner.soap.sforce.com}DescribeRelatedContentItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedContent", propOrder = {
    "relatedContentItems"
})
public class RelatedContent
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<DescribeRelatedContentItem> relatedContentItems;

    /**
     * Gets the value of the relatedContentItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedContentItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedContentItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeRelatedContentItem }
     * 
     * 
     */
    public List<DescribeRelatedContentItem> getRelatedContentItems() {
        if (relatedContentItems == null) {
            relatedContentItems = new ArrayList<DescribeRelatedContentItem>();
        }
        return this.relatedContentItems;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RelatedContent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RelatedContent that = ((RelatedContent) object);
        {
            List<DescribeRelatedContentItem> lhsRelatedContentItems;
            lhsRelatedContentItems = (((this.relatedContentItems!= null)&&(!this.relatedContentItems.isEmpty()))?this.getRelatedContentItems():null);
            List<DescribeRelatedContentItem> rhsRelatedContentItems;
            rhsRelatedContentItems = (((that.relatedContentItems!= null)&&(!that.relatedContentItems.isEmpty()))?that.getRelatedContentItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relatedContentItems", lhsRelatedContentItems), LocatorUtils.property(thatLocator, "relatedContentItems", rhsRelatedContentItems), lhsRelatedContentItems, rhsRelatedContentItems)) {
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
            List<DescribeRelatedContentItem> theRelatedContentItems;
            theRelatedContentItems = (((this.relatedContentItems!= null)&&(!this.relatedContentItems.isEmpty()))?this.getRelatedContentItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relatedContentItems", theRelatedContentItems), currentHashCode, theRelatedContentItems);
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
            List<DescribeRelatedContentItem> theRelatedContentItems;
            theRelatedContentItems = (((this.relatedContentItems!= null)&&(!this.relatedContentItems.isEmpty()))?this.getRelatedContentItems():null);
            strategy.appendField(locator, this, "relatedContentItems", buffer, theRelatedContentItems);
        }
        return buffer;
    }

}
