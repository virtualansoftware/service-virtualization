
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
 * <p>Java class for DescribeTabSetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeTabSetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="logoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tabSetId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tabs" type="{urn:partner.soap.sforce.com}DescribeTab" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeTabSetResult", propOrder = {
    "description",
    "label",
    "logoUrl",
    "namespace",
    "selected",
    "tabSetId",
    "tabs"
})
public class DescribeTabSetResult
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String logoUrl;
    protected String namespace;
    protected boolean selected;
    @XmlElement(required = true)
    protected String tabSetId;
    protected List<DescribeTab> tabs;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the tabSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabSetId() {
        return tabSetId;
    }

    /**
     * Sets the value of the tabSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabSetId(String value) {
        this.tabSetId = value;
    }

    /**
     * Gets the value of the tabs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeTab }
     * 
     * 
     */
    public List<DescribeTab> getTabs() {
        if (tabs == null) {
            tabs = new ArrayList<DescribeTab>();
        }
        return this.tabs;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DescribeTabSetResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DescribeTabSetResult that = ((DescribeTabSetResult) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            String lhsLogoUrl;
            lhsLogoUrl = this.getLogoUrl();
            String rhsLogoUrl;
            rhsLogoUrl = that.getLogoUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logoUrl", lhsLogoUrl), LocatorUtils.property(thatLocator, "logoUrl", rhsLogoUrl), lhsLogoUrl, rhsLogoUrl)) {
                return false;
            }
        }
        {
            String lhsNamespace;
            lhsNamespace = this.getNamespace();
            String rhsNamespace;
            rhsNamespace = that.getNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespace", lhsNamespace), LocatorUtils.property(thatLocator, "namespace", rhsNamespace), lhsNamespace, rhsNamespace)) {
                return false;
            }
        }
        {
            boolean lhsSelected;
            lhsSelected = (true?this.isSelected():false);
            boolean rhsSelected;
            rhsSelected = (true?that.isSelected():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selected", lhsSelected), LocatorUtils.property(thatLocator, "selected", rhsSelected), lhsSelected, rhsSelected)) {
                return false;
            }
        }
        {
            String lhsTabSetId;
            lhsTabSetId = this.getTabSetId();
            String rhsTabSetId;
            rhsTabSetId = that.getTabSetId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tabSetId", lhsTabSetId), LocatorUtils.property(thatLocator, "tabSetId", rhsTabSetId), lhsTabSetId, rhsTabSetId)) {
                return false;
            }
        }
        {
            List<DescribeTab> lhsTabs;
            lhsTabs = (((this.tabs!= null)&&(!this.tabs.isEmpty()))?this.getTabs():null);
            List<DescribeTab> rhsTabs;
            rhsTabs = (((that.tabs!= null)&&(!that.tabs.isEmpty()))?that.getTabs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tabs", lhsTabs), LocatorUtils.property(thatLocator, "tabs", rhsTabs), lhsTabs, rhsTabs)) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theLogoUrl;
            theLogoUrl = this.getLogoUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logoUrl", theLogoUrl), currentHashCode, theLogoUrl);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespace", theNamespace), currentHashCode, theNamespace);
        }
        {
            boolean theSelected;
            theSelected = (true?this.isSelected():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selected", theSelected), currentHashCode, theSelected);
        }
        {
            String theTabSetId;
            theTabSetId = this.getTabSetId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tabSetId", theTabSetId), currentHashCode, theTabSetId);
        }
        {
            List<DescribeTab> theTabs;
            theTabs = (((this.tabs!= null)&&(!this.tabs.isEmpty()))?this.getTabs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tabs", theTabs), currentHashCode, theTabs);
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theLogoUrl;
            theLogoUrl = this.getLogoUrl();
            strategy.appendField(locator, this, "logoUrl", buffer, theLogoUrl);
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            strategy.appendField(locator, this, "namespace", buffer, theNamespace);
        }
        {
            boolean theSelected;
            theSelected = (true?this.isSelected():false);
            strategy.appendField(locator, this, "selected", buffer, theSelected);
        }
        {
            String theTabSetId;
            theTabSetId = this.getTabSetId();
            strategy.appendField(locator, this, "tabSetId", buffer, theTabSetId);
        }
        {
            List<DescribeTab> theTabs;
            theTabs = (((this.tabs!= null)&&(!this.tabs.isEmpty()))?this.getTabs():null);
            strategy.appendField(locator, this, "tabs", buffer, theTabs);
        }
        return buffer;
    }

}
