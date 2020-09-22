
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
 * <p>Java class for AddCampaignMemberOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCampaignMemberOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campaignId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="keepExistingStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="leadOrContactIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="2000" minOccurs="0"/&gt;
 *         &lt;element name="newStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="reportMetadata" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCampaignMemberOptions", propOrder = {
    "campaignId",
    "keepExistingStatus",
    "leadOrContactIds",
    "newStatus",
    "reportId",
    "reportMetadata"
})
public class AddCampaignMemberOptions
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true, nillable = true)
    protected String campaignId;
    protected boolean keepExistingStatus;
    protected List<String> leadOrContactIds;
    @XmlElement(required = true)
    protected String newStatus;
    @XmlElement(required = true, nillable = true)
    protected String reportId;
    @XmlElement(required = true)
    protected String reportMetadata;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the keepExistingStatus property.
     * 
     */
    public boolean isKeepExistingStatus() {
        return keepExistingStatus;
    }

    /**
     * Sets the value of the keepExistingStatus property.
     * 
     */
    public void setKeepExistingStatus(boolean value) {
        this.keepExistingStatus = value;
    }

    /**
     * Gets the value of the leadOrContactIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leadOrContactIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeadOrContactIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLeadOrContactIds() {
        if (leadOrContactIds == null) {
            leadOrContactIds = new ArrayList<String>();
        }
        return this.leadOrContactIds;
    }

    /**
     * Gets the value of the newStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatus() {
        return newStatus;
    }

    /**
     * Sets the value of the newStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatus(String value) {
        this.newStatus = value;
    }

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the reportMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportMetadata() {
        return reportMetadata;
    }

    /**
     * Sets the value of the reportMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportMetadata(String value) {
        this.reportMetadata = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AddCampaignMemberOptions)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AddCampaignMemberOptions that = ((AddCampaignMemberOptions) object);
        {
            String lhsCampaignId;
            lhsCampaignId = this.getCampaignId();
            String rhsCampaignId;
            rhsCampaignId = that.getCampaignId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "campaignId", lhsCampaignId), LocatorUtils.property(thatLocator, "campaignId", rhsCampaignId), lhsCampaignId, rhsCampaignId)) {
                return false;
            }
        }
        {
            boolean lhsKeepExistingStatus;
            lhsKeepExistingStatus = (true?this.isKeepExistingStatus():false);
            boolean rhsKeepExistingStatus;
            rhsKeepExistingStatus = (true?that.isKeepExistingStatus():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keepExistingStatus", lhsKeepExistingStatus), LocatorUtils.property(thatLocator, "keepExistingStatus", rhsKeepExistingStatus), lhsKeepExistingStatus, rhsKeepExistingStatus)) {
                return false;
            }
        }
        {
            List<String> lhsLeadOrContactIds;
            lhsLeadOrContactIds = (((this.leadOrContactIds!= null)&&(!this.leadOrContactIds.isEmpty()))?this.getLeadOrContactIds():null);
            List<String> rhsLeadOrContactIds;
            rhsLeadOrContactIds = (((that.leadOrContactIds!= null)&&(!that.leadOrContactIds.isEmpty()))?that.getLeadOrContactIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadOrContactIds", lhsLeadOrContactIds), LocatorUtils.property(thatLocator, "leadOrContactIds", rhsLeadOrContactIds), lhsLeadOrContactIds, rhsLeadOrContactIds)) {
                return false;
            }
        }
        {
            String lhsNewStatus;
            lhsNewStatus = this.getNewStatus();
            String rhsNewStatus;
            rhsNewStatus = that.getNewStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newStatus", lhsNewStatus), LocatorUtils.property(thatLocator, "newStatus", rhsNewStatus), lhsNewStatus, rhsNewStatus)) {
                return false;
            }
        }
        {
            String lhsReportId;
            lhsReportId = this.getReportId();
            String rhsReportId;
            rhsReportId = that.getReportId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportId", lhsReportId), LocatorUtils.property(thatLocator, "reportId", rhsReportId), lhsReportId, rhsReportId)) {
                return false;
            }
        }
        {
            String lhsReportMetadata;
            lhsReportMetadata = this.getReportMetadata();
            String rhsReportMetadata;
            rhsReportMetadata = that.getReportMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportMetadata", lhsReportMetadata), LocatorUtils.property(thatLocator, "reportMetadata", rhsReportMetadata), lhsReportMetadata, rhsReportMetadata)) {
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
            String theCampaignId;
            theCampaignId = this.getCampaignId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "campaignId", theCampaignId), currentHashCode, theCampaignId);
        }
        {
            boolean theKeepExistingStatus;
            theKeepExistingStatus = (true?this.isKeepExistingStatus():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keepExistingStatus", theKeepExistingStatus), currentHashCode, theKeepExistingStatus);
        }
        {
            List<String> theLeadOrContactIds;
            theLeadOrContactIds = (((this.leadOrContactIds!= null)&&(!this.leadOrContactIds.isEmpty()))?this.getLeadOrContactIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadOrContactIds", theLeadOrContactIds), currentHashCode, theLeadOrContactIds);
        }
        {
            String theNewStatus;
            theNewStatus = this.getNewStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newStatus", theNewStatus), currentHashCode, theNewStatus);
        }
        {
            String theReportId;
            theReportId = this.getReportId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportId", theReportId), currentHashCode, theReportId);
        }
        {
            String theReportMetadata;
            theReportMetadata = this.getReportMetadata();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportMetadata", theReportMetadata), currentHashCode, theReportMetadata);
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
            String theCampaignId;
            theCampaignId = this.getCampaignId();
            strategy.appendField(locator, this, "campaignId", buffer, theCampaignId);
        }
        {
            boolean theKeepExistingStatus;
            theKeepExistingStatus = (true?this.isKeepExistingStatus():false);
            strategy.appendField(locator, this, "keepExistingStatus", buffer, theKeepExistingStatus);
        }
        {
            List<String> theLeadOrContactIds;
            theLeadOrContactIds = (((this.leadOrContactIds!= null)&&(!this.leadOrContactIds.isEmpty()))?this.getLeadOrContactIds():null);
            strategy.appendField(locator, this, "leadOrContactIds", buffer, theLeadOrContactIds);
        }
        {
            String theNewStatus;
            theNewStatus = this.getNewStatus();
            strategy.appendField(locator, this, "newStatus", buffer, theNewStatus);
        }
        {
            String theReportId;
            theReportId = this.getReportId();
            strategy.appendField(locator, this, "reportId", buffer, theReportId);
        }
        {
            String theReportMetadata;
            theReportMetadata = this.getReportMetadata();
            strategy.appendField(locator, this, "reportMetadata", buffer, theReportMetadata);
        }
        return buffer;
    }

}
