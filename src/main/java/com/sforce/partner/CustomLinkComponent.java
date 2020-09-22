
package com.sforce.partner;

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
 * <p>Java class for CustomLinkComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomLinkComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}DescribeLayoutComponent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customLink" type="{urn:partner.soap.sforce.com}DescribeLayoutButton"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLinkComponent", propOrder = {
    "customLink"
})
public class CustomLinkComponent
    extends DescribeLayoutComponent
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected DescribeLayoutButton customLink;

    /**
     * Gets the value of the customLink property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeLayoutButton }
     *     
     */
    public DescribeLayoutButton getCustomLink() {
        return customLink;
    }

    /**
     * Sets the value of the customLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeLayoutButton }
     *     
     */
    public void setCustomLink(DescribeLayoutButton value) {
        this.customLink = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CustomLinkComponent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CustomLinkComponent that = ((CustomLinkComponent) object);
        {
            DescribeLayoutButton lhsCustomLink;
            lhsCustomLink = this.getCustomLink();
            DescribeLayoutButton rhsCustomLink;
            rhsCustomLink = that.getCustomLink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customLink", lhsCustomLink), LocatorUtils.property(thatLocator, "customLink", rhsCustomLink), lhsCustomLink, rhsCustomLink)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            DescribeLayoutButton theCustomLink;
            theCustomLink = this.getCustomLink();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customLink", theCustomLink), currentHashCode, theCustomLink);
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
        super.appendFields(locator, buffer, strategy);
        {
            DescribeLayoutButton theCustomLink;
            theCustomLink = this.getCustomLink();
            strategy.appendField(locator, this, "customLink", buffer, theCustomLink);
        }
        return buffer;
    }

}
