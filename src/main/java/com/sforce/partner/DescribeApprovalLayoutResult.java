
package com.sforce.partner;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for DescribeApprovalLayoutResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeApprovalLayoutResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approvalLayouts" type="{urn:partner.soap.sforce.com}DescribeApprovalLayout" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeApprovalLayoutResult", propOrder = {
    "approvalLayouts"
})
public class DescribeApprovalLayoutResult
    implements Equals, HashCode, ToString
{

    protected List<DescribeApprovalLayout2> approvalLayouts;

    /**
     * Gets the value of the approvalLayouts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalLayouts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalLayouts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeApprovalLayout2 }
     * 
     * 
     */
    public List<DescribeApprovalLayout2> getApprovalLayouts() {
        if (approvalLayouts == null) {
            approvalLayouts = new ArrayList<DescribeApprovalLayout2>();
        }
        return this.approvalLayouts;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeApprovalLayoutResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeApprovalLayoutResult that = ((DescribeApprovalLayoutResult) object);
        {
            List<DescribeApprovalLayout2> lhsApprovalLayouts;
            lhsApprovalLayouts = (((this.approvalLayouts!= null)&&(!this.approvalLayouts.isEmpty()))?this.getApprovalLayouts():null);
            List<DescribeApprovalLayout2> rhsApprovalLayouts;
            rhsApprovalLayouts = (((that.approvalLayouts!= null)&&(!that.approvalLayouts.isEmpty()))?that.getApprovalLayouts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvalLayouts", lhsApprovalLayouts), LocatorUtils.property(thatLocator, "approvalLayouts", rhsApprovalLayouts), lhsApprovalLayouts, rhsApprovalLayouts)) {
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
            List<DescribeApprovalLayout2> theApprovalLayouts;
            theApprovalLayouts = (((this.approvalLayouts!= null)&&(!this.approvalLayouts.isEmpty()))?this.getApprovalLayouts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvalLayouts", theApprovalLayouts), currentHashCode, theApprovalLayouts);
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
            List<DescribeApprovalLayout2> theApprovalLayouts;
            theApprovalLayouts = (((this.approvalLayouts!= null)&&(!this.approvalLayouts.isEmpty()))?this.getApprovalLayouts():null);
            strategy.appendField(locator, this, "approvalLayouts", buffer, theApprovalLayouts);
        }
        return buffer;
    }

}
