
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
 * <p>Java class for NavigateFlowInterviewRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavigateFlowInterviewRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="screenInputs" type="{urn:partner.soap.sforce.com}NameObjectValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="debug" type="{urn:partner.soap.sforce.com}FlowInterviewDebugInput" minOccurs="0"/&gt;
 *         &lt;element name="lcErrors" type="{urn:partner.soap.sforce.com}NameValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigateFlowInterviewRequest", propOrder = {
    "action",
    "screenInputs",
    "state",
    "debug",
    "lcErrors"
})
public class NavigateFlowInterviewRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String action;
    protected List<NameObjectValuePair> screenInputs;
    @XmlElement(required = true)
    protected String state;
    protected FlowInterviewDebugInput debug;
    protected List<NameValuePair> lcErrors;

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
     * Gets the value of the screenInputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screenInputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreenInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameObjectValuePair }
     * 
     * 
     */
    public List<NameObjectValuePair> getScreenInputs() {
        if (screenInputs == null) {
            screenInputs = new ArrayList<NameObjectValuePair>();
        }
        return this.screenInputs;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link FlowInterviewDebugInput }
     *     
     */
    public FlowInterviewDebugInput getDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowInterviewDebugInput }
     *     
     */
    public void setDebug(FlowInterviewDebugInput value) {
        this.debug = value;
    }

    /**
     * Gets the value of the lcErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lcErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLcErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getLcErrors() {
        if (lcErrors == null) {
            lcErrors = new ArrayList<NameValuePair>();
        }
        return this.lcErrors;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NavigateFlowInterviewRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NavigateFlowInterviewRequest that = ((NavigateFlowInterviewRequest) object);
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
            List<NameObjectValuePair> lhsScreenInputs;
            lhsScreenInputs = (((this.screenInputs!= null)&&(!this.screenInputs.isEmpty()))?this.getScreenInputs():null);
            List<NameObjectValuePair> rhsScreenInputs;
            rhsScreenInputs = (((that.screenInputs!= null)&&(!that.screenInputs.isEmpty()))?that.getScreenInputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "screenInputs", lhsScreenInputs), LocatorUtils.property(thatLocator, "screenInputs", rhsScreenInputs), lhsScreenInputs, rhsScreenInputs)) {
                return false;
            }
        }
        {
            String lhsState;
            lhsState = this.getState();
            String rhsState;
            rhsState = that.getState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "state", lhsState), LocatorUtils.property(thatLocator, "state", rhsState), lhsState, rhsState)) {
                return false;
            }
        }
        {
            FlowInterviewDebugInput lhsDebug;
            lhsDebug = this.getDebug();
            FlowInterviewDebugInput rhsDebug;
            rhsDebug = that.getDebug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debug", lhsDebug), LocatorUtils.property(thatLocator, "debug", rhsDebug), lhsDebug, rhsDebug)) {
                return false;
            }
        }
        {
            List<NameValuePair> lhsLcErrors;
            lhsLcErrors = (((this.lcErrors!= null)&&(!this.lcErrors.isEmpty()))?this.getLcErrors():null);
            List<NameValuePair> rhsLcErrors;
            rhsLcErrors = (((that.lcErrors!= null)&&(!that.lcErrors.isEmpty()))?that.getLcErrors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lcErrors", lhsLcErrors), LocatorUtils.property(thatLocator, "lcErrors", rhsLcErrors), lhsLcErrors, rhsLcErrors)) {
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
            String theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        {
            List<NameObjectValuePair> theScreenInputs;
            theScreenInputs = (((this.screenInputs!= null)&&(!this.screenInputs.isEmpty()))?this.getScreenInputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "screenInputs", theScreenInputs), currentHashCode, theScreenInputs);
        }
        {
            String theState;
            theState = this.getState();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "state", theState), currentHashCode, theState);
        }
        {
            FlowInterviewDebugInput theDebug;
            theDebug = this.getDebug();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debug", theDebug), currentHashCode, theDebug);
        }
        {
            List<NameValuePair> theLcErrors;
            theLcErrors = (((this.lcErrors!= null)&&(!this.lcErrors.isEmpty()))?this.getLcErrors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lcErrors", theLcErrors), currentHashCode, theLcErrors);
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
            String theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            List<NameObjectValuePair> theScreenInputs;
            theScreenInputs = (((this.screenInputs!= null)&&(!this.screenInputs.isEmpty()))?this.getScreenInputs():null);
            strategy.appendField(locator, this, "screenInputs", buffer, theScreenInputs);
        }
        {
            String theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState);
        }
        {
            FlowInterviewDebugInput theDebug;
            theDebug = this.getDebug();
            strategy.appendField(locator, this, "debug", buffer, theDebug);
        }
        {
            List<NameValuePair> theLcErrors;
            theLcErrors = (((this.lcErrors!= null)&&(!this.lcErrors.isEmpty()))?this.getLcErrors():null);
            strategy.appendField(locator, this, "lcErrors", buffer, theLcErrors);
        }
        return buffer;
    }

}
