
package com.sforce.apex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowProcessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowProcessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AutoLaunchedFlow"/&gt;
 *     &lt;enumeration value="Flow"/&gt;
 *     &lt;enumeration value="Workflow"/&gt;
 *     &lt;enumeration value="CustomEvent"/&gt;
 *     &lt;enumeration value="InvocableProcess"/&gt;
 *     &lt;enumeration value="LoginFlow"/&gt;
 *     &lt;enumeration value="ActionPlan"/&gt;
 *     &lt;enumeration value="JourneyBuilderIntegration"/&gt;
 *     &lt;enumeration value="UserProvisioningFlow"/&gt;
 *     &lt;enumeration value="Survey"/&gt;
 *     &lt;enumeration value="SurveyEnrich"/&gt;
 *     &lt;enumeration value="Appointments"/&gt;
 *     &lt;enumeration value="FSCLending"/&gt;
 *     &lt;enumeration value="DigitalForm"/&gt;
 *     &lt;enumeration value="FieldServiceMobile"/&gt;
 *     &lt;enumeration value="OrchestrationFlow"/&gt;
 *     &lt;enumeration value="FieldServiceWeb"/&gt;
 *     &lt;enumeration value="TransactionSecurityFlow"/&gt;
 *     &lt;enumeration value="ContactRequestFlow"/&gt;
 *     &lt;enumeration value="ActionCadenceFlow"/&gt;
 *     &lt;enumeration value="ManagedContentFlow"/&gt;
 *     &lt;enumeration value="CheckoutFlow"/&gt;
 *     &lt;enumeration value="CartAsyncFlow"/&gt;
 *     &lt;enumeration value="SalesEntryExperienceFlow"/&gt;
 *     &lt;enumeration value="DecisionStudio"/&gt;
 *     &lt;enumeration value="CustomerLifecycle"/&gt;
 *     &lt;enumeration value="Journey"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlowProcessType")
@XmlEnum
public enum FlowProcessType {

    @XmlEnumValue("AutoLaunchedFlow")
    AUTO_LAUNCHED_FLOW("AutoLaunchedFlow"),
    @XmlEnumValue("Flow")
    FLOW("Flow"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow"),
    @XmlEnumValue("CustomEvent")
    CUSTOM_EVENT("CustomEvent"),
    @XmlEnumValue("InvocableProcess")
    INVOCABLE_PROCESS("InvocableProcess"),
    @XmlEnumValue("LoginFlow")
    LOGIN_FLOW("LoginFlow"),
    @XmlEnumValue("ActionPlan")
    ACTION_PLAN("ActionPlan"),
    @XmlEnumValue("JourneyBuilderIntegration")
    JOURNEY_BUILDER_INTEGRATION("JourneyBuilderIntegration"),
    @XmlEnumValue("UserProvisioningFlow")
    USER_PROVISIONING_FLOW("UserProvisioningFlow"),
    @XmlEnumValue("Survey")
    SURVEY("Survey"),
    @XmlEnumValue("SurveyEnrich")
    SURVEY_ENRICH("SurveyEnrich"),
    @XmlEnumValue("Appointments")
    APPOINTMENTS("Appointments"),
    @XmlEnumValue("FSCLending")
    FSC_LENDING("FSCLending"),
    @XmlEnumValue("DigitalForm")
    DIGITAL_FORM("DigitalForm"),
    @XmlEnumValue("FieldServiceMobile")
    FIELD_SERVICE_MOBILE("FieldServiceMobile"),
    @XmlEnumValue("OrchestrationFlow")
    ORCHESTRATION_FLOW("OrchestrationFlow"),
    @XmlEnumValue("FieldServiceWeb")
    FIELD_SERVICE_WEB("FieldServiceWeb"),
    @XmlEnumValue("TransactionSecurityFlow")
    TRANSACTION_SECURITY_FLOW("TransactionSecurityFlow"),
    @XmlEnumValue("ContactRequestFlow")
    CONTACT_REQUEST_FLOW("ContactRequestFlow"),
    @XmlEnumValue("ActionCadenceFlow")
    ACTION_CADENCE_FLOW("ActionCadenceFlow"),
    @XmlEnumValue("ManagedContentFlow")
    MANAGED_CONTENT_FLOW("ManagedContentFlow"),
    @XmlEnumValue("CheckoutFlow")
    CHECKOUT_FLOW("CheckoutFlow"),
    @XmlEnumValue("CartAsyncFlow")
    CART_ASYNC_FLOW("CartAsyncFlow"),
    @XmlEnumValue("SalesEntryExperienceFlow")
    SALES_ENTRY_EXPERIENCE_FLOW("SalesEntryExperienceFlow"),
    @XmlEnumValue("DecisionStudio")
    DECISION_STUDIO("DecisionStudio"),
    @XmlEnumValue("CustomerLifecycle")
    CUSTOMER_LIFECYCLE("CustomerLifecycle"),
    @XmlEnumValue("Journey")
    JOURNEY("Journey");
    private final String value;

    FlowProcessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowProcessType fromValue(String v) {
        for (FlowProcessType c: FlowProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
