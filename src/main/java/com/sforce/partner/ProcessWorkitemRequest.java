
package com.sforce.partner;

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
 * <p>Java class for ProcessWorkitemRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessWorkitemRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:partner.soap.sforce.com}ProcessRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="workitemId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessWorkitemRequest", propOrder = {
    "action",
    "workitemId"
})
@XmlSeeAlso({
    ProcessArticleRequest.class
})
public class ProcessWorkitemRequest
    extends ProcessRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String action;
    @XmlElement(required = true)
    protected String workitemId;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the workitemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkitemId() {
        return workitemId;
    }

    /**
     * Sets the value of the workitemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkitemId(String value) {
        this.workitemId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcessWorkitemRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProcessWorkitemRequest that = ((ProcessWorkitemRequest) object);
        {
            String lhsAction;
            lhsAction = this.getAction();
            String rhsAction;
            rhsAction = that.getAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "action", lhsAction), LocatorUtils.property(thatLocator, "action", rhsAction), lhsAction, rhsAction)) {
                return false;
            }
        }
        {
            String lhsWorkitemId;
            lhsWorkitemId = this.getWorkitemId();
            String rhsWorkitemId;
            rhsWorkitemId = that.getWorkitemId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workitemId", lhsWorkitemId), LocatorUtils.property(thatLocator, "workitemId", rhsWorkitemId), lhsWorkitemId, rhsWorkitemId)) {
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
            String theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        {
            String theWorkitemId;
            theWorkitemId = this.getWorkitemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workitemId", theWorkitemId), currentHashCode, theWorkitemId);
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
            String theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            String theWorkitemId;
            theWorkitemId = this.getWorkitemId();
            strategy.appendField(locator, this, "workitemId", buffer, theWorkitemId);
        }
        return buffer;
    }

}
