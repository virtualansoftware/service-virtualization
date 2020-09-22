
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
 * <p>Java class for DescribeSoqlListViewsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoqlListViewsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listViewParams" type="{urn:partner.soap.sforce.com}DescribeSoqlListViewParams" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoqlListViewsRequest", propOrder = {
    "listViewParams"
})
public class DescribeSoqlListViewsRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<DescribeSoqlListViewParams> listViewParams;

    /**
     * Gets the value of the listViewParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listViewParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListViewParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeSoqlListViewParams }
     * 
     * 
     */
    public List<DescribeSoqlListViewParams> getListViewParams() {
        if (listViewParams == null) {
            listViewParams = new ArrayList<DescribeSoqlListViewParams>();
        }
        return this.listViewParams;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeSoqlListViewsRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeSoqlListViewsRequest that = ((DescribeSoqlListViewsRequest) object);
        {
            List<DescribeSoqlListViewParams> lhsListViewParams;
            lhsListViewParams = (((this.listViewParams!= null)&&(!this.listViewParams.isEmpty()))?this.getListViewParams():null);
            List<DescribeSoqlListViewParams> rhsListViewParams;
            rhsListViewParams = (((that.listViewParams!= null)&&(!that.listViewParams.isEmpty()))?that.getListViewParams():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listViewParams", lhsListViewParams), LocatorUtils.property(thatLocator, "listViewParams", rhsListViewParams), lhsListViewParams, rhsListViewParams)) {
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
            List<DescribeSoqlListViewParams> theListViewParams;
            theListViewParams = (((this.listViewParams!= null)&&(!this.listViewParams.isEmpty()))?this.getListViewParams():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listViewParams", theListViewParams), currentHashCode, theListViewParams);
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
            List<DescribeSoqlListViewParams> theListViewParams;
            theListViewParams = (((this.listViewParams!= null)&&(!this.listViewParams.isEmpty()))?this.getListViewParams():null);
            strategy.appendField(locator, this, "listViewParams", buffer, theListViewParams);
        }
        return buffer;
    }

}
