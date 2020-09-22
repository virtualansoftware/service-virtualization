
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
 *         &lt;element name="messages" type="{urn:partner.soap.sforce.com}HandledEmailMessage" maxOccurs="10" minOccurs="0"/&gt;
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
    "messages"
})
@XmlRootElement(name = "handleEmailMessage")
public class HandleEmailMessage
    implements Equals, HashCode, ToString
{

    protected List<HandledEmailMessage> messages;

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandledEmailMessage }
     * 
     * 
     */
    public List<HandledEmailMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<HandledEmailMessage>();
        }
        return this.messages;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HandleEmailMessage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HandleEmailMessage that = ((HandleEmailMessage) object);
        {
            List<HandledEmailMessage> lhsMessages;
            lhsMessages = (((this.messages!= null)&&(!this.messages.isEmpty()))?this.getMessages():null);
            List<HandledEmailMessage> rhsMessages;
            rhsMessages = (((that.messages!= null)&&(!that.messages.isEmpty()))?that.getMessages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messages", lhsMessages), LocatorUtils.property(thatLocator, "messages", rhsMessages), lhsMessages, rhsMessages)) {
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
            List<HandledEmailMessage> theMessages;
            theMessages = (((this.messages!= null)&&(!this.messages.isEmpty()))?this.getMessages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messages", theMessages), currentHashCode, theMessages);
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
            List<HandledEmailMessage> theMessages;
            theMessages = (((this.messages!= null)&&(!this.messages.isEmpty()))?this.getMessages():null);
            strategy.appendField(locator, this, "messages", buffer, theMessages);
        }
        return buffer;
    }

}
