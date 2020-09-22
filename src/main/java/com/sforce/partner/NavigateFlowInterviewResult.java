
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
 * <p>Java class for NavigateFlowInterviewResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavigateFlowInterviewResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activeStages" type="{urn:partner.soap.sforce.com}FlowInterviewStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="availableActions" type="{urn:partner.soap.sforce.com}FlowInterviewAction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currentStage" type="{urn:partner.soap.sforce.com}FlowInterviewStage" minOccurs="0"/&gt;
 *         &lt;element name="debug" type="{urn:partner.soap.sforce.com}FlowInterviewDebugOutput" minOccurs="0"/&gt;
 *         &lt;element name="errorMessages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flowLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="helpText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="interviewStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localActionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localActionInputs" type="{urn:partner.soap.sforce.com}FlowInterviewLocalActionInput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localActionOutputs" type="{urn:partner.soap.sforce.com}FlowInterviewLocalActionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputVariables" type="{urn:partner.soap.sforce.com}FlowInterviewOutputVariable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pausedText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="screenFields" type="{urn:partner.soap.sforce.com}FlowInterviewScreenField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="showFooter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showHeader" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigateFlowInterviewResult", propOrder = {
    "activeStages",
    "availableActions",
    "currentStage",
    "debug",
    "errorMessages",
    "flowLabel",
    "guid",
    "helpText",
    "interviewStatus",
    "localActionName",
    "localActionInputs",
    "localActionOutputs",
    "locationName",
    "outputVariables",
    "pausedText",
    "screenFields",
    "showFooter",
    "showHeader",
    "state"
})
public class NavigateFlowInterviewResult
    implements Equals, HashCode, ToString
{

    protected List<FlowInterviewStage> activeStages;
    protected List<FlowInterviewAction> availableActions;
    @XmlElement(nillable = true)
    protected FlowInterviewStage currentStage;
    @XmlElement(nillable = true)
    protected FlowInterviewDebugOutput debug;
    protected List<String> errorMessages;
    @XmlElement(required = true)
    protected String flowLabel;
    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true, nillable = true)
    protected String helpText;
    @XmlElement(required = true)
    protected String interviewStatus;
    @XmlElement(nillable = true)
    protected String localActionName;
    protected List<FlowInterviewLocalActionInput> localActionInputs;
    protected List<FlowInterviewLocalActionOutput> localActionOutputs;
    @XmlElement(nillable = true)
    protected String locationName;
    protected List<FlowInterviewOutputVariable> outputVariables;
    @XmlElement(required = true, nillable = true)
    protected String pausedText;
    protected List<FlowInterviewScreenField> screenFields;
    protected boolean showFooter;
    protected boolean showHeader;
    @XmlElement(required = true, nillable = true)
    protected String state;

    /**
     * Gets the value of the activeStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewStage }
     * 
     * 
     */
    public List<FlowInterviewStage> getActiveStages() {
        if (activeStages == null) {
            activeStages = new ArrayList<FlowInterviewStage>();
        }
        return this.activeStages;
    }

    /**
     * Gets the value of the availableActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewAction }
     * 
     * 
     */
    public List<FlowInterviewAction> getAvailableActions() {
        if (availableActions == null) {
            availableActions = new ArrayList<FlowInterviewAction>();
        }
        return this.availableActions;
    }

    /**
     * Gets the value of the currentStage property.
     * 
     * @return
     *     possible object is
     *     {@link FlowInterviewStage }
     *     
     */
    public FlowInterviewStage getCurrentStage() {
        return currentStage;
    }

    /**
     * Sets the value of the currentStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowInterviewStage }
     *     
     */
    public void setCurrentStage(FlowInterviewStage value) {
        this.currentStage = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link FlowInterviewDebugOutput }
     *     
     */
    public FlowInterviewDebugOutput getDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowInterviewDebugOutput }
     *     
     */
    public void setDebug(FlowInterviewDebugOutput value) {
        this.debug = value;
    }

    /**
     * Gets the value of the errorMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorMessages() {
        if (errorMessages == null) {
            errorMessages = new ArrayList<String>();
        }
        return this.errorMessages;
    }

    /**
     * Gets the value of the flowLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowLabel() {
        return flowLabel;
    }

    /**
     * Sets the value of the flowLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowLabel(String value) {
        this.flowLabel = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

    /**
     * Gets the value of the interviewStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterviewStatus() {
        return interviewStatus;
    }

    /**
     * Sets the value of the interviewStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterviewStatus(String value) {
        this.interviewStatus = value;
    }

    /**
     * Gets the value of the localActionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalActionName() {
        return localActionName;
    }

    /**
     * Sets the value of the localActionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalActionName(String value) {
        this.localActionName = value;
    }

    /**
     * Gets the value of the localActionInputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localActionInputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalActionInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewLocalActionInput }
     * 
     * 
     */
    public List<FlowInterviewLocalActionInput> getLocalActionInputs() {
        if (localActionInputs == null) {
            localActionInputs = new ArrayList<FlowInterviewLocalActionInput>();
        }
        return this.localActionInputs;
    }

    /**
     * Gets the value of the localActionOutputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localActionOutputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalActionOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewLocalActionOutput }
     * 
     * 
     */
    public List<FlowInterviewLocalActionOutput> getLocalActionOutputs() {
        if (localActionOutputs == null) {
            localActionOutputs = new ArrayList<FlowInterviewLocalActionOutput>();
        }
        return this.localActionOutputs;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the outputVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewOutputVariable }
     * 
     * 
     */
    public List<FlowInterviewOutputVariable> getOutputVariables() {
        if (outputVariables == null) {
            outputVariables = new ArrayList<FlowInterviewOutputVariable>();
        }
        return this.outputVariables;
    }

    /**
     * Gets the value of the pausedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPausedText() {
        return pausedText;
    }

    /**
     * Sets the value of the pausedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPausedText(String value) {
        this.pausedText = value;
    }

    /**
     * Gets the value of the screenFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screenFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreenFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowInterviewScreenField }
     * 
     * 
     */
    public List<FlowInterviewScreenField> getScreenFields() {
        if (screenFields == null) {
            screenFields = new ArrayList<FlowInterviewScreenField>();
        }
        return this.screenFields;
    }

    /**
     * Gets the value of the showFooter property.
     * 
     */
    public boolean isShowFooter() {
        return showFooter;
    }

    /**
     * Sets the value of the showFooter property.
     * 
     */
    public void setShowFooter(boolean value) {
        this.showFooter = value;
    }

    /**
     * Gets the value of the showHeader property.
     * 
     */
    public boolean isShowHeader() {
        return showHeader;
    }

    /**
     * Sets the value of the showHeader property.
     * 
     */
    public void setShowHeader(boolean value) {
        this.showHeader = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NavigateFlowInterviewResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NavigateFlowInterviewResult that = ((NavigateFlowInterviewResult) object);
        {
            List<FlowInterviewStage> lhsActiveStages;
            lhsActiveStages = (((this.activeStages!= null)&&(!this.activeStages.isEmpty()))?this.getActiveStages():null);
            List<FlowInterviewStage> rhsActiveStages;
            rhsActiveStages = (((that.activeStages!= null)&&(!that.activeStages.isEmpty()))?that.getActiveStages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activeStages", lhsActiveStages), LocatorUtils.property(thatLocator, "activeStages", rhsActiveStages), lhsActiveStages, rhsActiveStages)) {
                return false;
            }
        }
        {
            List<FlowInterviewAction> lhsAvailableActions;
            lhsAvailableActions = (((this.availableActions!= null)&&(!this.availableActions.isEmpty()))?this.getAvailableActions():null);
            List<FlowInterviewAction> rhsAvailableActions;
            rhsAvailableActions = (((that.availableActions!= null)&&(!that.availableActions.isEmpty()))?that.getAvailableActions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availableActions", lhsAvailableActions), LocatorUtils.property(thatLocator, "availableActions", rhsAvailableActions), lhsAvailableActions, rhsAvailableActions)) {
                return false;
            }
        }
        {
            FlowInterviewStage lhsCurrentStage;
            lhsCurrentStage = this.getCurrentStage();
            FlowInterviewStage rhsCurrentStage;
            rhsCurrentStage = that.getCurrentStage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentStage", lhsCurrentStage), LocatorUtils.property(thatLocator, "currentStage", rhsCurrentStage), lhsCurrentStage, rhsCurrentStage)) {
                return false;
            }
        }
        {
            FlowInterviewDebugOutput lhsDebug;
            lhsDebug = this.getDebug();
            FlowInterviewDebugOutput rhsDebug;
            rhsDebug = that.getDebug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debug", lhsDebug), LocatorUtils.property(thatLocator, "debug", rhsDebug), lhsDebug, rhsDebug)) {
                return false;
            }
        }
        {
            List<String> lhsErrorMessages;
            lhsErrorMessages = (((this.errorMessages!= null)&&(!this.errorMessages.isEmpty()))?this.getErrorMessages():null);
            List<String> rhsErrorMessages;
            rhsErrorMessages = (((that.errorMessages!= null)&&(!that.errorMessages.isEmpty()))?that.getErrorMessages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorMessages", lhsErrorMessages), LocatorUtils.property(thatLocator, "errorMessages", rhsErrorMessages), lhsErrorMessages, rhsErrorMessages)) {
                return false;
            }
        }
        {
            String lhsFlowLabel;
            lhsFlowLabel = this.getFlowLabel();
            String rhsFlowLabel;
            rhsFlowLabel = that.getFlowLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flowLabel", lhsFlowLabel), LocatorUtils.property(thatLocator, "flowLabel", rhsFlowLabel), lhsFlowLabel, rhsFlowLabel)) {
                return false;
            }
        }
        {
            String lhsGuid;
            lhsGuid = this.getGuid();
            String rhsGuid;
            rhsGuid = that.getGuid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guid", lhsGuid), LocatorUtils.property(thatLocator, "guid", rhsGuid), lhsGuid, rhsGuid)) {
                return false;
            }
        }
        {
            String lhsHelpText;
            lhsHelpText = this.getHelpText();
            String rhsHelpText;
            rhsHelpText = that.getHelpText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "helpText", lhsHelpText), LocatorUtils.property(thatLocator, "helpText", rhsHelpText), lhsHelpText, rhsHelpText)) {
                return false;
            }
        }
        {
            String lhsInterviewStatus;
            lhsInterviewStatus = this.getInterviewStatus();
            String rhsInterviewStatus;
            rhsInterviewStatus = that.getInterviewStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interviewStatus", lhsInterviewStatus), LocatorUtils.property(thatLocator, "interviewStatus", rhsInterviewStatus), lhsInterviewStatus, rhsInterviewStatus)) {
                return false;
            }
        }
        {
            String lhsLocalActionName;
            lhsLocalActionName = this.getLocalActionName();
            String rhsLocalActionName;
            rhsLocalActionName = that.getLocalActionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localActionName", lhsLocalActionName), LocatorUtils.property(thatLocator, "localActionName", rhsLocalActionName), lhsLocalActionName, rhsLocalActionName)) {
                return false;
            }
        }
        {
            List<FlowInterviewLocalActionInput> lhsLocalActionInputs;
            lhsLocalActionInputs = (((this.localActionInputs!= null)&&(!this.localActionInputs.isEmpty()))?this.getLocalActionInputs():null);
            List<FlowInterviewLocalActionInput> rhsLocalActionInputs;
            rhsLocalActionInputs = (((that.localActionInputs!= null)&&(!that.localActionInputs.isEmpty()))?that.getLocalActionInputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localActionInputs", lhsLocalActionInputs), LocatorUtils.property(thatLocator, "localActionInputs", rhsLocalActionInputs), lhsLocalActionInputs, rhsLocalActionInputs)) {
                return false;
            }
        }
        {
            List<FlowInterviewLocalActionOutput> lhsLocalActionOutputs;
            lhsLocalActionOutputs = (((this.localActionOutputs!= null)&&(!this.localActionOutputs.isEmpty()))?this.getLocalActionOutputs():null);
            List<FlowInterviewLocalActionOutput> rhsLocalActionOutputs;
            rhsLocalActionOutputs = (((that.localActionOutputs!= null)&&(!that.localActionOutputs.isEmpty()))?that.getLocalActionOutputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localActionOutputs", lhsLocalActionOutputs), LocatorUtils.property(thatLocator, "localActionOutputs", rhsLocalActionOutputs), lhsLocalActionOutputs, rhsLocalActionOutputs)) {
                return false;
            }
        }
        {
            String lhsLocationName;
            lhsLocationName = this.getLocationName();
            String rhsLocationName;
            rhsLocationName = that.getLocationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationName", lhsLocationName), LocatorUtils.property(thatLocator, "locationName", rhsLocationName), lhsLocationName, rhsLocationName)) {
                return false;
            }
        }
        {
            List<FlowInterviewOutputVariable> lhsOutputVariables;
            lhsOutputVariables = (((this.outputVariables!= null)&&(!this.outputVariables.isEmpty()))?this.getOutputVariables():null);
            List<FlowInterviewOutputVariable> rhsOutputVariables;
            rhsOutputVariables = (((that.outputVariables!= null)&&(!that.outputVariables.isEmpty()))?that.getOutputVariables():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputVariables", lhsOutputVariables), LocatorUtils.property(thatLocator, "outputVariables", rhsOutputVariables), lhsOutputVariables, rhsOutputVariables)) {
                return false;
            }
        }
        {
            String lhsPausedText;
            lhsPausedText = this.getPausedText();
            String rhsPausedText;
            rhsPausedText = that.getPausedText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pausedText", lhsPausedText), LocatorUtils.property(thatLocator, "pausedText", rhsPausedText), lhsPausedText, rhsPausedText)) {
                return false;
            }
        }
        {
            List<FlowInterviewScreenField> lhsScreenFields;
            lhsScreenFields = (((this.screenFields!= null)&&(!this.screenFields.isEmpty()))?this.getScreenFields():null);
            List<FlowInterviewScreenField> rhsScreenFields;
            rhsScreenFields = (((that.screenFields!= null)&&(!that.screenFields.isEmpty()))?that.getScreenFields():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "screenFields", lhsScreenFields), LocatorUtils.property(thatLocator, "screenFields", rhsScreenFields), lhsScreenFields, rhsScreenFields)) {
                return false;
            }
        }
        {
            boolean lhsShowFooter;
            lhsShowFooter = (true?this.isShowFooter():false);
            boolean rhsShowFooter;
            rhsShowFooter = (true?that.isShowFooter():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showFooter", lhsShowFooter), LocatorUtils.property(thatLocator, "showFooter", rhsShowFooter), lhsShowFooter, rhsShowFooter)) {
                return false;
            }
        }
        {
            boolean lhsShowHeader;
            lhsShowHeader = (true?this.isShowHeader():false);
            boolean rhsShowHeader;
            rhsShowHeader = (true?that.isShowHeader():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showHeader", lhsShowHeader), LocatorUtils.property(thatLocator, "showHeader", rhsShowHeader), lhsShowHeader, rhsShowHeader)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<FlowInterviewStage> theActiveStages;
            theActiveStages = (((this.activeStages!= null)&&(!this.activeStages.isEmpty()))?this.getActiveStages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activeStages", theActiveStages), currentHashCode, theActiveStages);
        }
        {
            List<FlowInterviewAction> theAvailableActions;
            theAvailableActions = (((this.availableActions!= null)&&(!this.availableActions.isEmpty()))?this.getAvailableActions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availableActions", theAvailableActions), currentHashCode, theAvailableActions);
        }
        {
            FlowInterviewStage theCurrentStage;
            theCurrentStage = this.getCurrentStage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentStage", theCurrentStage), currentHashCode, theCurrentStage);
        }
        {
            FlowInterviewDebugOutput theDebug;
            theDebug = this.getDebug();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debug", theDebug), currentHashCode, theDebug);
        }
        {
            List<String> theErrorMessages;
            theErrorMessages = (((this.errorMessages!= null)&&(!this.errorMessages.isEmpty()))?this.getErrorMessages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorMessages", theErrorMessages), currentHashCode, theErrorMessages);
        }
        {
            String theFlowLabel;
            theFlowLabel = this.getFlowLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flowLabel", theFlowLabel), currentHashCode, theFlowLabel);
        }
        {
            String theGuid;
            theGuid = this.getGuid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "guid", theGuid), currentHashCode, theGuid);
        }
        {
            String theHelpText;
            theHelpText = this.getHelpText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "helpText", theHelpText), currentHashCode, theHelpText);
        }
        {
            String theInterviewStatus;
            theInterviewStatus = this.getInterviewStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interviewStatus", theInterviewStatus), currentHashCode, theInterviewStatus);
        }
        {
            String theLocalActionName;
            theLocalActionName = this.getLocalActionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localActionName", theLocalActionName), currentHashCode, theLocalActionName);
        }
        {
            List<FlowInterviewLocalActionInput> theLocalActionInputs;
            theLocalActionInputs = (((this.localActionInputs!= null)&&(!this.localActionInputs.isEmpty()))?this.getLocalActionInputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localActionInputs", theLocalActionInputs), currentHashCode, theLocalActionInputs);
        }
        {
            List<FlowInterviewLocalActionOutput> theLocalActionOutputs;
            theLocalActionOutputs = (((this.localActionOutputs!= null)&&(!this.localActionOutputs.isEmpty()))?this.getLocalActionOutputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localActionOutputs", theLocalActionOutputs), currentHashCode, theLocalActionOutputs);
        }
        {
            String theLocationName;
            theLocationName = this.getLocationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationName", theLocationName), currentHashCode, theLocationName);
        }
        {
            List<FlowInterviewOutputVariable> theOutputVariables;
            theOutputVariables = (((this.outputVariables!= null)&&(!this.outputVariables.isEmpty()))?this.getOutputVariables():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputVariables", theOutputVariables), currentHashCode, theOutputVariables);
        }
        {
            String thePausedText;
            thePausedText = this.getPausedText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pausedText", thePausedText), currentHashCode, thePausedText);
        }
        {
            List<FlowInterviewScreenField> theScreenFields;
            theScreenFields = (((this.screenFields!= null)&&(!this.screenFields.isEmpty()))?this.getScreenFields():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "screenFields", theScreenFields), currentHashCode, theScreenFields);
        }
        {
            boolean theShowFooter;
            theShowFooter = (true?this.isShowFooter():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showFooter", theShowFooter), currentHashCode, theShowFooter);
        }
        {
            boolean theShowHeader;
            theShowHeader = (true?this.isShowHeader():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showHeader", theShowHeader), currentHashCode, theShowHeader);
        }
        {
            String theState;
            theState = this.getState();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "state", theState), currentHashCode, theState);
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
            List<FlowInterviewStage> theActiveStages;
            theActiveStages = (((this.activeStages!= null)&&(!this.activeStages.isEmpty()))?this.getActiveStages():null);
            strategy.appendField(locator, this, "activeStages", buffer, theActiveStages);
        }
        {
            List<FlowInterviewAction> theAvailableActions;
            theAvailableActions = (((this.availableActions!= null)&&(!this.availableActions.isEmpty()))?this.getAvailableActions():null);
            strategy.appendField(locator, this, "availableActions", buffer, theAvailableActions);
        }
        {
            FlowInterviewStage theCurrentStage;
            theCurrentStage = this.getCurrentStage();
            strategy.appendField(locator, this, "currentStage", buffer, theCurrentStage);
        }
        {
            FlowInterviewDebugOutput theDebug;
            theDebug = this.getDebug();
            strategy.appendField(locator, this, "debug", buffer, theDebug);
        }
        {
            List<String> theErrorMessages;
            theErrorMessages = (((this.errorMessages!= null)&&(!this.errorMessages.isEmpty()))?this.getErrorMessages():null);
            strategy.appendField(locator, this, "errorMessages", buffer, theErrorMessages);
        }
        {
            String theFlowLabel;
            theFlowLabel = this.getFlowLabel();
            strategy.appendField(locator, this, "flowLabel", buffer, theFlowLabel);
        }
        {
            String theGuid;
            theGuid = this.getGuid();
            strategy.appendField(locator, this, "guid", buffer, theGuid);
        }
        {
            String theHelpText;
            theHelpText = this.getHelpText();
            strategy.appendField(locator, this, "helpText", buffer, theHelpText);
        }
        {
            String theInterviewStatus;
            theInterviewStatus = this.getInterviewStatus();
            strategy.appendField(locator, this, "interviewStatus", buffer, theInterviewStatus);
        }
        {
            String theLocalActionName;
            theLocalActionName = this.getLocalActionName();
            strategy.appendField(locator, this, "localActionName", buffer, theLocalActionName);
        }
        {
            List<FlowInterviewLocalActionInput> theLocalActionInputs;
            theLocalActionInputs = (((this.localActionInputs!= null)&&(!this.localActionInputs.isEmpty()))?this.getLocalActionInputs():null);
            strategy.appendField(locator, this, "localActionInputs", buffer, theLocalActionInputs);
        }
        {
            List<FlowInterviewLocalActionOutput> theLocalActionOutputs;
            theLocalActionOutputs = (((this.localActionOutputs!= null)&&(!this.localActionOutputs.isEmpty()))?this.getLocalActionOutputs():null);
            strategy.appendField(locator, this, "localActionOutputs", buffer, theLocalActionOutputs);
        }
        {
            String theLocationName;
            theLocationName = this.getLocationName();
            strategy.appendField(locator, this, "locationName", buffer, theLocationName);
        }
        {
            List<FlowInterviewOutputVariable> theOutputVariables;
            theOutputVariables = (((this.outputVariables!= null)&&(!this.outputVariables.isEmpty()))?this.getOutputVariables():null);
            strategy.appendField(locator, this, "outputVariables", buffer, theOutputVariables);
        }
        {
            String thePausedText;
            thePausedText = this.getPausedText();
            strategy.appendField(locator, this, "pausedText", buffer, thePausedText);
        }
        {
            List<FlowInterviewScreenField> theScreenFields;
            theScreenFields = (((this.screenFields!= null)&&(!this.screenFields.isEmpty()))?this.getScreenFields():null);
            strategy.appendField(locator, this, "screenFields", buffer, theScreenFields);
        }
        {
            boolean theShowFooter;
            theShowFooter = (true?this.isShowFooter():false);
            strategy.appendField(locator, this, "showFooter", buffer, theShowFooter);
        }
        {
            boolean theShowHeader;
            theShowHeader = (true?this.isShowHeader():false);
            strategy.appendField(locator, this, "showHeader", buffer, theShowHeader);
        }
        {
            String theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState);
        }
        return buffer;
    }

}
