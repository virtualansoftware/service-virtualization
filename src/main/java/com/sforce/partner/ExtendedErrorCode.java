
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIONCALL_DUPLICATE_INPUT_PARAM"/&gt;
 *     &lt;enumeration value="ACTIONCALL_DUPLICATE_OUTPUT_PARAM"/&gt;
 *     &lt;enumeration value="ACTIONCALL_INVALID_INPUT_PARAM_NAME"/&gt;
 *     &lt;enumeration value="ACTIONCALL_MISSING_NAME"/&gt;
 *     &lt;enumeration value="ACTIONCALL_MISSING_REQUIRED_PARAM"/&gt;
 *     &lt;enumeration value="ACTIONCALL_MISSING_REQUIRED_TYPE"/&gt;
 *     &lt;enumeration value="ACTIONCALL_NOT_FOUND_WITH_NAME_AND_TYPE"/&gt;
 *     &lt;enumeration value="ACTIONCALL_NOT_SUPPORTED_FOR_PROCESSTYPE"/&gt;
 *     &lt;enumeration value="ACTION_CALL_INVALID_CONFIGURATION"/&gt;
 *     &lt;enumeration value="APEXCALLOUT_INPUT_DUPLICATE"/&gt;
 *     &lt;enumeration value="APEXCALLOUT_INPUT_INCOMPATIBLE_DATATYPE"/&gt;
 *     &lt;enumeration value="APEXCALLOUT_INVALID"/&gt;
 *     &lt;enumeration value="APEXCALLOUT_MISSING_CLASSNAME"/&gt;
 *     &lt;enumeration value="APEXCALLOUT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="APEXCALLOUT_OUTPUT_INCOMPATIBLE_DATATYPE"/&gt;
 *     &lt;enumeration value="APEXCALLOUT_OUTPUT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="APEXCALLOUT_REQUIRED_INPUT_MISSING"/&gt;
 *     &lt;enumeration value="APEXCLASS_MISSING_INTERFACE"/&gt;
 *     &lt;enumeration value="APEX_CLASS_VARIABLE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_ELEMENT_MISSING_DATATYPE"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_ELEMENT_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_FIELD_INVALID_DATATYPE"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_FIELD_INVALID_DATATYPE_WITH_ELEMENT"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INCOMPATIBLE_DATATYPES"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INVALID_ASSIGNTOREFERENCE"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INVALID_COLLECTION"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INVALID_DATATYPE_IN_ELEMENT"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INVALID_ELEMENTREFERENCE"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INVALID_MERGE_FIELD"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INVALID_OPERATOR"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INVALID_REFERENCE"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_INVALID_VALUE"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_LEFT_DATATYPE_INVALID_FOR_OPERATOR"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_MODIFIES_NONVARIABLE"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_NONEXISTENT_REFERENCE"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_REQUIRED"/&gt;
 *     &lt;enumeration value="ASSIGNMENTITEM_RIGHT_DATATYPE_INVALID_FOR_OPERATOR"/&gt;
 *     &lt;enumeration value="AUTOLAUNCHED_CHOICELOOKUP_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="AUTOLAUNCHED_CHOICE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="AUTOLAUNCHED_SCREEN_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="AUTOLAUNCHED_STEP_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="AUTOLAUNCHED_SUBFLOW_INCOMPATIBLE_FLOWTYPE"/&gt;
 *     &lt;enumeration value="AUTOLAUNCHED_WAIT_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="BOTH_START_NODE_AND_REFERENCE_FOUND"/&gt;
 *     &lt;enumeration value="CHOICEFIELD_DEFAULT_CHOICE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="CHOICEFIELD_MISSING_CHOICE"/&gt;
 *     &lt;enumeration value="CHOICELOOKUP_DATATYPE_INCOMPATIBLE_WITH_CHOICEFIELD"/&gt;
 *     &lt;enumeration value="CHOICE_DATATYPE_INCOMPATIBLE_WITH_CHOICEFIELD"/&gt;
 *     &lt;enumeration value="CHOICE_NOT_SUPPORTED_FOR_SCREENFIELDTYPE"/&gt;
 *     &lt;enumeration value="CHOICE_USED_MULTIPLE_TIMES_IN_SAME_FIELD"/&gt;
 *     &lt;enumeration value="CONDITION_BUILDER_MISSING_FLOW_VARIABLE"/&gt;
 *     &lt;enumeration value="CONDITION_BUILDER_MISSING_REQUIRED_PERMISSIONS"/&gt;
 *     &lt;enumeration value="CONDITION_BUILDER_UNSUPPORTED_FLOW_VARIABLE"/&gt;
 *     &lt;enumeration value="CONDITION_INVALID_LEFTOPERAND"/&gt;
 *     &lt;enumeration value="CONDITION_LOGIC_EXCEEDS_LIMIT"/&gt;
 *     &lt;enumeration value="CONDITION_LOGIC_INVALID"/&gt;
 *     &lt;enumeration value="CONDITION_LOGIC_MISSING"/&gt;
 *     &lt;enumeration value="CONDITION_MISSING_DATATYPE"/&gt;
 *     &lt;enumeration value="CONDITION_MISSING_OPERATOR"/&gt;
 *     &lt;enumeration value="CONDITION_OPERAND_DATATYPES_INCOMPATIBLE"/&gt;
 *     &lt;enumeration value="CONDITION_OPERATOR_INCOMPATIBLE"/&gt;
 *     &lt;enumeration value="CONDITION_REFERENCED_ELEMENT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="CONDITION_RIGHTOPERAND_NULL"/&gt;
 *     &lt;enumeration value="CONNECTOR_MISSING_TARGET"/&gt;
 *     &lt;enumeration value="CONSTANT_INCLUDES_REFERENCES"/&gt;
 *     &lt;enumeration value="CUSTOMEVENTS_NOT_ENABLED"/&gt;
 *     &lt;enumeration value="CUSTOMEVENT_MISSING_PROCESSMETADATAVALUES"/&gt;
 *     &lt;enumeration value="CUSTOMEVENT_OBJECTTYPE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="CUSTOMEVENT_OBJECTTYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="CUSTOMEVENT_PROCESSMETADATAVALUES_MISSING_NAME"/&gt;
 *     &lt;enumeration value="CUSTOMEVENT_PROCESSMETADATAVALUES_MORE_THAN_ONE_NAME"/&gt;
 *     &lt;enumeration value="DATATYPE_INVALID"/&gt;
 *     &lt;enumeration value="DATATYPE_MISSING"/&gt;
 *     &lt;enumeration value="DATA_TYPE_NOT_SUPPORTED_FOR_PROCESSTYPE"/&gt;
 *     &lt;enumeration value="DECISION_DEFAULT_CONNECTOR_MISSING_LABEL"/&gt;
 *     &lt;enumeration value="DECISION_MISSING_OUTCOME"/&gt;
 *     &lt;enumeration value="DYNAMIC_TYPE_MAPPING_MISSING"/&gt;
 *     &lt;enumeration value="ELEMENT_CONNECTS_TO_SELF"/&gt;
 *     &lt;enumeration value="ELEMENT_COORDINATES_INVALID"/&gt;
 *     &lt;enumeration value="ELEMENT_INVALID_CONNECTOR"/&gt;
 *     &lt;enumeration value="ELEMENT_INVALID_REFERENCE"/&gt;
 *     &lt;enumeration value="ELEMENT_MISSING_CONNECTOR"/&gt;
 *     &lt;enumeration value="ELEMENT_MISSING_LABEL"/&gt;
 *     &lt;enumeration value="ELEMENT_MISSING_NAME"/&gt;
 *     &lt;enumeration value="ELEMENT_MISSING_REFERENCE"/&gt;
 *     &lt;enumeration value="ELEMENT_MORE_THAN_ONE_FIELD"/&gt;
 *     &lt;enumeration value="ELEMENT_NAME_INVALID"/&gt;
 *     &lt;enumeration value="ELEMENT_NEVER_USED"/&gt;
 *     &lt;enumeration value="ELEMENT_SCALE_SMALLER_THAN_DEFAULTVALUE"/&gt;
 *     &lt;enumeration value="EXTERNAL_OBJECTS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="EXTERNAL_OBJECT_FIELDS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="EX_AUTOLAUNCHED_SUBFLOW_INCOMPATIBLE_FLOWTYPE"/&gt;
 *     &lt;enumeration value="FIELDASSIGNMENT_FIELD_INCOMPATIBLE_DATATYPE"/&gt;
 *     &lt;enumeration value="FIELDASSIGNMENT_INVALID_DATATYPE"/&gt;
 *     &lt;enumeration value="FIELDASSIGNMENT_INVALID_ELEMENT"/&gt;
 *     &lt;enumeration value="FIELDASSIGNMENT_INVALID_REFERENCE"/&gt;
 *     &lt;enumeration value="FIELDASSIGNMENT_MULTIPLE_REFERENCES_SAME_FIELD"/&gt;
 *     &lt;enumeration value="FIELDASSIGNMENT_PICKLISTFIELD_INCOMPATIBLE_DATATYPE"/&gt;
 *     &lt;enumeration value="FIELDASSIGNMENT_REFERENCED_ELEMENT_MISSING_DATATYPE"/&gt;
 *     &lt;enumeration value="FIELDSERVICE_UNSUPPORTED_FIELD_TYPE"/&gt;
 *     &lt;enumeration value="FIELD_INVALID_VALUE"/&gt;
 *     &lt;enumeration value="FIELD_NOT_FOUND"/&gt;
 *     &lt;enumeration value="FIELD_RELATIONSHIP_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="FIELD_TYPE_NOT_SUPPORTED_AS_CHILD_OF_SCREENFIELD_REGION_OR_REGIONCONTAINER"/&gt;
 *     &lt;enumeration value="FIELD_TYPE_NOT_SUPPORTED_AS_PARENT"/&gt;
 *     &lt;enumeration value="FIELD_VALUE_REQUIRES_PERM"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_COMPONENT_ATTRIBUTE_EXPRESSION_EXCEPTION"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_COMPONENT_ATTRIBUTE_GENERIC_EXCEPTION"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_COMPONENT_ATTRIBUTE_MISSING_REQUIRED"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_COMPONENT_ATTRIBUTE_TOO_LONG"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_COMPONENT_CUSTOM_VALIDATION_EXCEPTION"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_COMPONENT_MAX_LIMIT_EXCEPTION"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_COMPONENT_RULE_VALIDATION_EXCEPTION"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_PICKLIST_INVALID_VALUE_EXCEPTION"/&gt;
 *     &lt;enumeration value="FLEXIPAGE_TEMPLATE_INVALID_SWITCH"/&gt;
 *     &lt;enumeration value="FLOW_CONTEXT_RECORD_ASSIGNMENT_VARIABLE_INVALID"/&gt;
 *     &lt;enumeration value="FLOW_ELEMENT_SCALE_LESS_THAN_ZERO"/&gt;
 *     &lt;enumeration value="FLOW_INCLUDES_STEP"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_BULK_EXECUTION"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_HANDLED_ERROR"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_INPUT_VALIDATION"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_INTERACTION_NOT_FOUND"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_INVALID_CHOICE_USER_INPUT"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_INVALID_FIELD_VALUE"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_INVALID_START_REQUEST"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_MISSING_CHOICE_FOR_REQUIRED_CHOICE_FIELD"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_MISSING_VALUE_FOR_REQUIRED_INPUT_FIELD"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_NAVIGATE"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_RANGE_VALIDATION"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_REGEX_VALIDATION"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_RESUME_INTERVIEW"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_SAVE_RESULT"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_SET_CHOICE_SELECTED"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_START_INTERVIEW"/&gt;
 *     &lt;enumeration value="FLOW_INTERVIEW_TYPE_CONVERSION"/&gt;
 *     &lt;enumeration value="FLOW_INVALID_NAME"/&gt;
 *     &lt;enumeration value="FLOW_NAME_USED_IN_OTHER_CLIENT"/&gt;
 *     &lt;enumeration value="FLOW_REFERENCES_APEX_CLASS_NOT_IN_SAME_PACKAGE"/&gt;
 *     &lt;enumeration value="FLOW_SCHEDULE_INFORMATION_INCOMPLETE"/&gt;
 *     &lt;enumeration value="FLOW_SOBJECT_VARIABLE_NOT_PERSISTED"/&gt;
 *     &lt;enumeration value="FLOW_STAGE_INCLUDES_REFERENCES"/&gt;
 *     &lt;enumeration value="FLOW_STAGE_ORDER_DUPLICATE"/&gt;
 *     &lt;enumeration value="FLOW_STAGE_ORDER_OUT_OF_RANGE"/&gt;
 *     &lt;enumeration value="FLOW_SYSTEM_VARIABLE_NOT_SUPPORTED_FOR_TRIGGERTYPE"/&gt;
 *     &lt;enumeration value="FORMULA_CMT_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="FORMULA_EXPRESSION_INVALID"/&gt;
 *     &lt;enumeration value="FTEST_EXTENSION_CODE_FOR_TEST"/&gt;
 *     &lt;enumeration value="GLOBAL_VARIABLE_NOT_SUPPORTED_FOR_PROCESSTYPE"/&gt;
 *     &lt;enumeration value="INCONSISTENT_DYNAMIC_TYPE_MAPPING"/&gt;
 *     &lt;enumeration value="INCONSISTENT_VALUE_FOR_DYNAMIC_VALUE_FIELD"/&gt;
 *     &lt;enumeration value="INPUTPARAM_CONFIGURATION_NOT_FOUND"/&gt;
 *     &lt;enumeration value="INPUTPARAM_INCOMPATIBLE_CONFIGURATION_ONLY"/&gt;
 *     &lt;enumeration value="INPUTPARAM_INCOMPATIBLE_DATATYPE"/&gt;
 *     &lt;enumeration value="INPUTPARAM_INCOMPATIBLE_WITH_COLLECTION_VARIABLE"/&gt;
 *     &lt;enumeration value="INPUTPARAM_INCOMPATIBLE_WITH_NONCOLLECTION_VARIABLE"/&gt;
 *     &lt;enumeration value="INPUTPARAM_MISMATCHED_OBJECTTYPE"/&gt;
 *     &lt;enumeration value="INVALID_FLOW"/&gt;
 *     &lt;enumeration value="INVALID_FLOW_INTERVIEW"/&gt;
 *     &lt;enumeration value="INVALID_SURVEY_VARIABLE_NAME_OR_TYPE"/&gt;
 *     &lt;enumeration value="LOOP_ASSIGNNEXTVALUETO_MISMATCHED_APEXCLASSTYPE"/&gt;
 *     &lt;enumeration value="LOOP_ASSIGNNEXTVALUETO_MISMATCHED_DATATYPE"/&gt;
 *     &lt;enumeration value="LOOP_ASSIGNNEXTVALUETO_MISMATCHED_OBJECTTYPE"/&gt;
 *     &lt;enumeration value="LOOP_ASSIGNNEXTVALUETO_MISSING"/&gt;
 *     &lt;enumeration value="LOOP_ASSIGNNEXTVALUETO_MISSING_VARIABLE"/&gt;
 *     &lt;enumeration value="LOOP_ASSIGNNEXTVALUETO_REFERENCE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="LOOP_COLLECTION_ELEMENT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="LOOP_COLLECTION_NOT_FOUND"/&gt;
 *     &lt;enumeration value="LOOP_COLLECTION_NOT_SUPPORTED_FOR_FIELD"/&gt;
 *     &lt;enumeration value="LOOP_MISSING_COLLECTION"/&gt;
 *     &lt;enumeration value="NON_EXPOSED_COMPONENT_IN_FLOW"/&gt;
 *     &lt;enumeration value="NON_GLOBAL_COMPONENT_IN_EXPORTED_FLOW"/&gt;
 *     &lt;enumeration value="NUMBER_OF_SCREENFIELD_REGIONS_EXCEEDS_LIMIT"/&gt;
 *     &lt;enumeration value="OBJECTTYPE_INVALID"/&gt;
 *     &lt;enumeration value="OBJECT_CANNOT_BE_CREATED"/&gt;
 *     &lt;enumeration value="OBJECT_CANNOT_BE_DELETED"/&gt;
 *     &lt;enumeration value="OBJECT_CANNOT_BE_QUERIED"/&gt;
 *     &lt;enumeration value="OBJECT_CANNOT_BE_UPDATED"/&gt;
 *     &lt;enumeration value="OBJECT_ENCRYPTED_FIELDS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="OBJECT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="OBJECT_TYPE_DOES_NOT_EXIST"/&gt;
 *     &lt;enumeration value="ORG_WIDE_EMAIL_INVALID"/&gt;
 *     &lt;enumeration value="ORG_WIDE_EMAIL_NOT_USED"/&gt;
 *     &lt;enumeration value="OUTPUTPARAM_ASSIGNTOREFERENCE_NOTFOUND"/&gt;
 *     &lt;enumeration value="OUTPUTPARAM_INCOMPATIBLE_DATATYPE"/&gt;
 *     &lt;enumeration value="OUTPUTPARAM_MISMATCHED_OBJECTTYPE"/&gt;
 *     &lt;enumeration value="OUTPUTPARAM_MISMATCHED_WITH_COLLECTION_VARIABLE"/&gt;
 *     &lt;enumeration value="OUTPUTPARAM_MISSING_ASSIGNTOREFERENCE"/&gt;
 *     &lt;enumeration value="OUTPUTPARAM_MISTMATCHED_WITH_NONCOLLECTION_VARIABLE"/&gt;
 *     &lt;enumeration value="PARAM_DATATYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="PAST_SCHEDULE_FLOW_WILL_NOT_RUN"/&gt;
 *     &lt;enumeration value="PROCESSMETADATAVALUES_NOT_SUPPORTED_FOR_PROCESSTYPE"/&gt;
 *     &lt;enumeration value="PROCESSMETADATAVALUE_NONEXISTENT_ELEMENT"/&gt;
 *     &lt;enumeration value="PROCESSTYPE_COMPONENTTYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="PROCESSTYPE_ELEMENT_CONFIG_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="PROCESSTYPE_ELEMENT_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="PROCESSTYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="PROCESSTYPE_SCREEN_FIELDTYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="PROCESS_TYPE_INCOMPATIBLE"/&gt;
 *     &lt;enumeration value="RECOMMENDATION_STRATEGY_EXCEPTION"/&gt;
 *     &lt;enumeration value="RECORDFILTER_ENCRYPTED_FIELDS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="RECORDFILTER_GEOLOCATION_FIELDS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="RECORDFILTER_INVALID_DATATYPE"/&gt;
 *     &lt;enumeration value="RECORDFILTER_INVALID_ELEMENT"/&gt;
 *     &lt;enumeration value="RECORDFILTER_INVALID_OPERATOR"/&gt;
 *     &lt;enumeration value="RECORDFILTER_INVALID_REFERENCE"/&gt;
 *     &lt;enumeration value="RECORDFILTER_MISSING_DATATYPE"/&gt;
 *     &lt;enumeration value="RECORDFILTER_MULTIPLE_QUERIES_SAME_FIELD"/&gt;
 *     &lt;enumeration value="RECORDFILTER_NON_PRIMITIVE"/&gt;
 *     &lt;enumeration value="RECORDLOOKUP_IDASSIGNMENT_VARIABLE_INCOMPATIBLE_DATATYPE"/&gt;
 *     &lt;enumeration value="RECORDLOOKUP_IDASSIGNMENT_VARIABLE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="RECORDUPDATE_MISSING_FILTERS"/&gt;
 *     &lt;enumeration value="REFERENCED_ELEMENT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="RULE_MISSING_CONDITION"/&gt;
 *     &lt;enumeration value="SCREENCOMPONENT_CONTAINS_VISIBILITY_RULE"/&gt;
 *     &lt;enumeration value="SCREENFIELD_API_VERSION_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENFIELD_BOOLEAN_ISREQUIRED_IS_FALSE"/&gt;
 *     &lt;enumeration value="SCREENFIELD_DEFAULTVALUE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_DUPLICATE_INPUT_PARAM"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_DUPLICATE_OUTPUT_PARAM"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_IMPLEMENTATION_INVALID"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_INPUT_ATTRIBUTE_INVALID"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_NAME_INVALID"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_NAME_MISSING"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_NAME_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_OUTPUT_ATTRIBUTE_INVALID"/&gt;
 *     &lt;enumeration value="SCREENFIELD_EXTENSION_REQUIRED_INPUT_MISSING"/&gt;
 *     &lt;enumeration value="SCREENFIELD_INPUTS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENFIELD_INVALID_DATATYPE"/&gt;
 *     &lt;enumeration value="SCREENFIELD_MULTISELECTCHOICE_SEMICOLON_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENFIELD_OUTPUTS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENFIELD_REGION_CONTAINS_DUPLICATE_INPUT_PARAMETER_VALUES"/&gt;
 *     &lt;enumeration value="SCREENFIELD_REGION_INPUT_PARAMETER_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENFIELD_REGION_MISSING_REQUIRED_PERMISSIONS"/&gt;
 *     &lt;enumeration value="SCREENFIELD_REGION_NOT_IN_CONTAINER"/&gt;
 *     &lt;enumeration value="SCREENFIELD_REGION_REQUIRED_INPUT_PARAMETER_MISSING"/&gt;
 *     &lt;enumeration value="SCREENFIELD_REGION_WIDTH_SUM_EXCEEDS_LIMIT"/&gt;
 *     &lt;enumeration value="SCREENFIELD_REGION_WIDTH_VALUE_INVALID"/&gt;
 *     &lt;enumeration value="SCREENFIELD_TYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENFIELD_TYPE_NOT_SUPPORTED_FOR_API_VERSION"/&gt;
 *     &lt;enumeration value="SCREENFIELD_USERINPUT_NOT_SUPPORTED_FOR_CHOICETYPE"/&gt;
 *     &lt;enumeration value="SCREENFIELD_VALIDATIONRULE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SCREENRULE_ACTION_INVALID_ATTRIBUTE"/&gt;
 *     &lt;enumeration value="SCREENRULE_ACTION_INVALID_ATTRIBUTE_FOR_API_VERSION"/&gt;
 *     &lt;enumeration value="SCREENRULE_ACTION_INVALID_VALUE"/&gt;
 *     &lt;enumeration value="SCREENRULE_ACTION_MISSING_ATTRIBUTE"/&gt;
 *     &lt;enumeration value="SCREENRULE_ACTION_MISSING_FIELDREFERENCE"/&gt;
 *     &lt;enumeration value="SCREENRULE_ACTION_MISSING_VALUE"/&gt;
 *     &lt;enumeration value="SCREENRULE_ATTRIBUTE_NOT_SUPPORTED_FOR_SCREENFIELD"/&gt;
 *     &lt;enumeration value="SCREENRULE_FIELD_NOT_FOUND_ON_SCREEN"/&gt;
 *     &lt;enumeration value="SCREENRULE_MISSING_ACTION"/&gt;
 *     &lt;enumeration value="SCREENRULE_NOT_SUPPORTED_IN_ORG"/&gt;
 *     &lt;enumeration value="SCREENRULE_SCREENFIELD_NOT_VISIBLE"/&gt;
 *     &lt;enumeration value="SCREENRULE_VISIBILITY_NOT_SUPPORTED_IN_ORG"/&gt;
 *     &lt;enumeration value="SCREEN_ALLOWBACK_ALLOWFINISH_BOTH_FALSE"/&gt;
 *     &lt;enumeration value="SCREEN_CONTAINS_LIGHTNING_COMPONENT"/&gt;
 *     &lt;enumeration value="SCREEN_MISSING_FOOTER_AND_LIGHTNING_COMPONENT"/&gt;
 *     &lt;enumeration value="SCREEN_MISSING_LABEL"/&gt;
 *     &lt;enumeration value="SCREEN_MULTISELECTFIELD_DOESNT_SUPPORT_CHOICE_WITH_USERINPUT"/&gt;
 *     &lt;enumeration value="SCREEN_PAUSEDTEXT_NOT_SHOWN_WHEN_ALLOWPAUSE_IS_FALSE"/&gt;
 *     &lt;enumeration value="SETTING_FIELD_MAKES_OTHER_FIELD_REQUIRED"/&gt;
 *     &lt;enumeration value="SETTING_FIELD_MAKES_OTHER_FIELD_UNSUPPORTED"/&gt;
 *     &lt;enumeration value="SETTING_FIELD_VALUE_MAKES_OTHER_FIELD_UNSUPPORTED"/&gt;
 *     &lt;enumeration value="SETTING_FIELD_VALUE_MAKES_OTHER_FIELD_VALUE_UNSUPPORTED"/&gt;
 *     &lt;enumeration value="SOBJECT_ELEMENT_INCOMPATIBLE_DATATYPE"/&gt;
 *     &lt;enumeration value="SOBJECT_ELEMENT_MISMATCHED_OBJECTTYPE"/&gt;
 *     &lt;enumeration value="SORT_ENCRYPTED_FIELDS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SORT_FIELD_MISSING"/&gt;
 *     &lt;enumeration value="SORT_FIELD_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SORT_GEOLOCATION_FIELDS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SORT_LIMIT_INVALID"/&gt;
 *     &lt;enumeration value="SORT_ORDER_MISSING"/&gt;
 *     &lt;enumeration value="SPECIFIC_FIELD_VALUE_MAKES_OTHER_FIELD_REQUIRED"/&gt;
 *     &lt;enumeration value="STAGE_NAME_NOT_FULLY_QUALIFIED"/&gt;
 *     &lt;enumeration value="START_ELEMENT_MISSING"/&gt;
 *     &lt;enumeration value="SUBFLOW_DESKTOP_DESIGNER_FLOWS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SUBFLOW_DIFFERENT_RUNMODE"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_ELEMENT_INCOMPATIBLE_DATATYPES"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_INVALID_VALUE"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_MISMATCHED_APEX_CLASS"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_MISMATCHED_COLLECTIONTYPES"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_MISMATCHED_OBJECTS"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_MISSING_NAME"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_MULTIPLE_ASSIGNMENTS_TO_ONE_VARIABLE"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_REFERENCES_FIELD_ON_SOBJECT_VARIABLE"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_VALUE_INCOMPATIBLE_DATATYPES"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_VARIABLE_NOT_FOUND_IN_MASTERFLOW"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_VARIABLE_NOT_FOUND_IN_REFERENCEDFLOW"/&gt;
 *     &lt;enumeration value="SUBFLOW_INPUT_VARIABLE_NO_INPUT_ACCESS"/&gt;
 *     &lt;enumeration value="SUBFLOW_INVALID_NAME"/&gt;
 *     &lt;enumeration value="SUBFLOW_INVALID_REFERENCE"/&gt;
 *     &lt;enumeration value="SUBFLOW_MASTER_FLOW_TYPE_NOT_AUTOLAUNCHED"/&gt;
 *     &lt;enumeration value="SUBFLOW_MISSING_NAME"/&gt;
 *     &lt;enumeration value="SUBFLOW_NO_ACTIVE_VERSION"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_INCOMPATIBLE_DATATYPES"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_MISMATCHED_APEX_CLASS"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_MISMATCHED_COLLECTIONTYPES"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_MISMATCHED_OBJECTS"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_MISSING_ASSIGNTOREFERENCE"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_MISSING_NAME"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_MULTIPLE_ASSIGNMENTS_TO_ONE_VARIABLE"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_REFERENCES_FIELD_ON_SOBJECT_VARIABLE"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_TARGET_DOES_NOT_EXIST_IN_MASTER_FLOW"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_VARIABLE_NOT_FOUND_IN_MASTERFLOW"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_VARIABLE_NOT_FOUND_IN_REFERENCEDFLOW"/&gt;
 *     &lt;enumeration value="SUBFLOW_OUTPUT_VARIABLE_NO_OUTPUT_ACCESS"/&gt;
 *     &lt;enumeration value="SUBFLOW_PROCESSTYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SUBFLOW_PROCESS_TYPE_INCOMPATIBLE"/&gt;
 *     &lt;enumeration value="SUBFLOW_REFERENCES_MASTERFLOW"/&gt;
 *     &lt;enumeration value="SURVEY_ADVANCED_CONDITION_LOGIC_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SURVEY_CHOICE_NOT_REFERENCED_BY_A_QUESTION"/&gt;
 *     &lt;enumeration value="SURVEY_CHOICE_REFERENCED_BY_MULTIPLE_QUESTIONS"/&gt;
 *     &lt;enumeration value="SURVEY_ELEMENT_NEVER_REACHED"/&gt;
 *     &lt;enumeration value="SURVEY_ENRICH_INVALID_CONFIGURATION"/&gt;
 *     &lt;enumeration value="SURVEY_INACTIVE_SUBFLOWS"/&gt;
 *     &lt;enumeration value="SURVEY_INVALID_MERGE_FIELD_CONFIGURATION"/&gt;
 *     &lt;enumeration value="SURVEY_MISSING_QUESTION_OR_SUBFLOW"/&gt;
 *     &lt;enumeration value="SURVEY_MISSING_REQUIRED_VARIABLES"/&gt;
 *     &lt;enumeration value="SURVEY_MULTIPLE_SCREENS_CANNOT_CONNECT_TO_SAME_DECISION"/&gt;
 *     &lt;enumeration value="SURVEY_NESTED_SUBFLOWS"/&gt;
 *     &lt;enumeration value="SURVEY_NONSURVEY_SUBFLOWS"/&gt;
 *     &lt;enumeration value="SURVEY_RULE_INVALID_RIGHT_OPERAND"/&gt;
 *     &lt;enumeration value="SURVEY_SCREENFIELD_TYPE_NOT_SUPPORTED_FOR_QUESTION"/&gt;
 *     &lt;enumeration value="SURVEY_START_ELEMENT_INVALID"/&gt;
 *     &lt;enumeration value="SURVEY_VARIABLE_ACCESS_INVALID"/&gt;
 *     &lt;enumeration value="SYSTEM_MODE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="TRIGGERED_FLOW_REDUNDANT_QUERY"/&gt;
 *     &lt;enumeration value="TRIGGER_TYPE_CONTEXT_OBJECT_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="TRIGGER_TYPE_ELEMENT_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="TRIGGER_TYPE_INCOMPATIBLE_WITH_PROCESS_TYPE"/&gt;
 *     &lt;enumeration value="TRIGGER_TYPE_NOT_ALLOWED_FOR_SUBFLOW"/&gt;
 *     &lt;enumeration value="TYPE_MAPPING_DUPLICATED"/&gt;
 *     &lt;enumeration value="TYPE_MAPPING_NAME_MISSING"/&gt;
 *     &lt;enumeration value="TYPE_MAPPING_NOT_FOUND"/&gt;
 *     &lt;enumeration value="TYPE_MAPPING_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="TYPE_MAPPING_NOT_SUPPORTED_FOR_API_VERSION"/&gt;
 *     &lt;enumeration value="TYPE_MAPPING_NOT_SUPPORTED_FOR_PROCESS_TYPE"/&gt;
 *     &lt;enumeration value="UNEXPECTED_ERROR"/&gt;
 *     &lt;enumeration value="VALUE_CHAR_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="VARIABLE_FIELD_NOT_SUPPORTED_FOR_DATATYPE"/&gt;
 *     &lt;enumeration value="VARIABLE_FIELD_NOT_SUPPORTED_FOR_DATATYPE_AND_COLLECTION"/&gt;
 *     &lt;enumeration value="VARIABLE_FIELD_REQUIRED_FOR_DATATYPE"/&gt;
 *     &lt;enumeration value="VARIABLE_SCALE_EXCEEDS_LIMIT"/&gt;
 *     &lt;enumeration value="VARIABLE_SCALE_NEGATIVE_INTEGER"/&gt;
 *     &lt;enumeration value="VARIABLE_SCALE_NULL"/&gt;
 *     &lt;enumeration value="VISIBILITY_RULE_EXCEEDS_CONDITION_LIMIT"/&gt;
 *     &lt;enumeration value="VISIBILITY_RULE_NOT_AVAILABLE_IN_ORG"/&gt;
 *     &lt;enumeration value="VISIBILITY_RULE_NOT_SUPPORTED_FOR_API_VERSION"/&gt;
 *     &lt;enumeration value="VISIBILITY_RULE_NOT_SUPPORTED_FOR_PROCESSTYPE"/&gt;
 *     &lt;enumeration value="VISIBILITY_RULE_NO_CONDITIONS"/&gt;
 *     &lt;enumeration value="WAITEVENT_DEFAULT_CONNECTOR_MISSING_LABEL"/&gt;
 *     &lt;enumeration value="WAITEVENT_DUPLICATE_INPUT_PARAM"/&gt;
 *     &lt;enumeration value="WAITEVENT_INPUT_NOT_SUPPORTED_FOR_EVENTTYPE"/&gt;
 *     &lt;enumeration value="WAITEVENT_INPUT_REQUIRES_LITERAL_VALUE"/&gt;
 *     &lt;enumeration value="WAITEVENT_INVALID_CONDITION_LOGIC"/&gt;
 *     &lt;enumeration value="WAITEVENT_MISSING"/&gt;
 *     &lt;enumeration value="WAITEVENT_MISSING_CONNECTOR"/&gt;
 *     &lt;enumeration value="WAITEVENT_MISSING_EVENTTYPE"/&gt;
 *     &lt;enumeration value="WAITEVENT_OBJECT_NOT_SUPPORTED_FOR_EVENTTYPE"/&gt;
 *     &lt;enumeration value="WAITEVENT_OUTPUT_NOT_SUPPORTED_FOR_EVENTTYPE"/&gt;
 *     &lt;enumeration value="WAITEVENT_RELATIVEALARM_INVALID_DATETIME_FIELD"/&gt;
 *     &lt;enumeration value="WAITEVENT_RELATIVEALARM_INVALID_FIELD"/&gt;
 *     &lt;enumeration value="WAITEVENT_RELATIVEALARM_INVALID_OBJECTTYPE"/&gt;
 *     &lt;enumeration value="WAITEVENT_RELATIVEALARM_INVALID_OFFSETNUMBER"/&gt;
 *     &lt;enumeration value="WAITEVENT_RELATIVEALARM_INVALID_OFFSETUNIT"/&gt;
 *     &lt;enumeration value="WAITEVENT_REQUIRED_INPUT_MISSING"/&gt;
 *     &lt;enumeration value="WAITEVENT_TYPE_INVALID_OR_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="WORKFLOW_MISSING_PROCESSMETADATAVALUES"/&gt;
 *     &lt;enumeration value="WORKFLOW_OBJECTTYPE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="WORKFLOW_OBJECTTYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="WORKFLOW_OBJECTVARIABLE_AND_OLDOBJECTVARIABLE_REFERENCE_SAME_SOBJECT_VARIABLE"/&gt;
 *     &lt;enumeration value="WORKFLOW_OBJECTVARIABLE_DOESNT_SUPPORT_INPUT"/&gt;
 *     &lt;enumeration value="WORKFLOW_OLDOBJECTVARIABLE_DOESNT_SUPPORT_INPUT"/&gt;
 *     &lt;enumeration value="WORKFLOW_PROCESSMETADATAVALUES_MORE_THAN_ONE_NAME"/&gt;
 *     &lt;enumeration value="WORKFLOW_PROCESS_METADATAVALUES_MISSING_NAME"/&gt;
 *     &lt;enumeration value="WORKFLOW_RECURSIVECOUNTVARIABLE_DOESNT_SUPPORT_INPUT"/&gt;
 *     &lt;enumeration value="WORKFLOW_TRIGGERTYPE_INVALID_VALUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtendedErrorCode")
@XmlEnum
public enum ExtendedErrorCode {


    /**
     * Errors with this extended error code have the following properties: severity, actionCallName, parameterName
     * 
     */
    ACTIONCALL_DUPLICATE_INPUT_PARAM,

    /**
     * Errors with this extended error code have the following properties: severity, actionCallName, parameterName
     * 
     */
    ACTIONCALL_DUPLICATE_OUTPUT_PARAM,

    /**
     * Errors with this extended error code have the following properties: severity, actionCallName, parameterName
     * 
     */
    ACTIONCALL_INVALID_INPUT_PARAM_NAME,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    ACTIONCALL_MISSING_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, actionCallName, parameterName
     * 
     */
    ACTIONCALL_MISSING_REQUIRED_PARAM,

    /**
     * Errors with this extended error code have the following properties: severity, actionCallName
     * 
     */
    ACTIONCALL_MISSING_REQUIRED_TYPE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    ACTIONCALL_NOT_FOUND_WITH_NAME_AND_TYPE,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    ACTIONCALL_NOT_SUPPORTED_FOR_PROCESSTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, cause
     * 
     */
    ACTION_CALL_INVALID_CONFIGURATION,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName, parameterName
     * 
     */
    APEXCALLOUT_INPUT_DUPLICATE,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName, parameterName
     * 
     */
    APEXCALLOUT_INPUT_INCOMPATIBLE_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName
     * 
     */
    APEXCALLOUT_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName
     * 
     */
    APEXCALLOUT_MISSING_CLASSNAME,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName
     * 
     */
    APEXCALLOUT_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName, parameterName
     * 
     */
    APEXCALLOUT_OUTPUT_INCOMPATIBLE_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName, parameterName
     * 
     */
    APEXCALLOUT_OUTPUT_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName, parameterName
     * 
     */
    APEXCALLOUT_REQUIRED_INPUT_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, apexClassName, parentScreenFieldName
     * 
     */
    APEXCLASS_MISSING_INTERFACE,

    /**
     * Errors with this extended error code have the following properties: severity, apexClass
     * 
     */
    APEX_CLASS_VARIABLE_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName, operatorName, elementName
     * 
     */
    ASSIGNMENTITEM_ELEMENT_MISSING_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, assignmentName, elementType
     * 
     */
    ASSIGNMENTITEM_ELEMENT_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldValue, dataType, incompatibleDataType
     * 
     */
    ASSIGNMENTITEM_FIELD_INVALID_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, acceptedDataType, dataType, fieldValue
     * 
     */
    ASSIGNMENTITEM_FIELD_INVALID_DATATYPE_WITH_ELEMENT,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName, operatorName, leftElementName, leftElementType, rightElementName, rightElementType
     * 
     */
    ASSIGNMENTITEM_INCOMPATIBLE_DATATYPES,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName
     * 
     */
    ASSIGNMENTITEM_INVALID_ASSIGNTOREFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName, operatorName, leftElementName, rightElementName
     * 
     */
    ASSIGNMENTITEM_INVALID_COLLECTION,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, dataType, incompatibleDataType
     * 
     */
    ASSIGNMENTITEM_INVALID_DATATYPE_IN_ELEMENT,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName
     * 
     */
    ASSIGNMENTITEM_INVALID_ELEMENTREFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName, operatorName
     * 
     */
    ASSIGNMENTITEM_INVALID_MERGE_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName
     * 
     */
    ASSIGNMENTITEM_INVALID_OPERATOR,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName, operatorName
     * 
     */
    ASSIGNMENTITEM_INVALID_REFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName
     * 
     */
    ASSIGNMENTITEM_INVALID_VALUE,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName, operatorName, dataType, elementName
     * 
     */
    ASSIGNMENTITEM_LEFT_DATATYPE_INVALID_FOR_OPERATOR,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName
     * 
     */
    ASSIGNMENTITEM_MODIFIES_NONVARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName, operatorName
     * 
     */
    ASSIGNMENTITEM_NONEXISTENT_REFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, assignmentName
     * 
     */
    ASSIGNMENTITEM_REQUIRED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ASSIGNMENTITEM_RIGHT_DATATYPE_INVALID_FOR_OPERATOR,

    /**
     * Errors with this extended error code have the following properties: severity, choiceLookupName
     * 
     */
    AUTOLAUNCHED_CHOICELOOKUP_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName
     * 
     */
    AUTOLAUNCHED_CHOICE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    AUTOLAUNCHED_SCREEN_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    AUTOLAUNCHED_STEP_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, subflowType
     * 
     */
    AUTOLAUNCHED_SUBFLOW_INCOMPATIBLE_FLOWTYPE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    AUTOLAUNCHED_WAIT_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    BOTH_START_NODE_AND_REFERENCE_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, screenFieldName
     * 
     */
    CHOICEFIELD_DEFAULT_CHOICE_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, questionName
     * 
     */
    CHOICEFIELD_MISSING_CHOICE,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName, parentScreenFieldName
     * 
     */
    CHOICELOOKUP_DATATYPE_INCOMPATIBLE_WITH_CHOICEFIELD,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName, parentScreenFieldName
     * 
     */
    CHOICE_DATATYPE_INCOMPATIBLE_WITH_CHOICEFIELD,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, screenFieldName
     * 
     */
    CHOICE_NOT_SUPPORTED_FOR_SCREENFIELDTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName
     * 
     */
    CHOICE_USED_MULTIPLE_TIMES_IN_SAME_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    CONDITION_BUILDER_MISSING_FLOW_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    CONDITION_BUILDER_MISSING_REQUIRED_PERMISSIONS,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    CONDITION_BUILDER_UNSUPPORTED_FLOW_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, elementReference, operatorName, ruleName, screenFieldName
     * 
     */
    CONDITION_INVALID_LEFTOPERAND,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, characterLimit
     * 
     */
    CONDITION_LOGIC_EXCEEDS_LIMIT,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    CONDITION_LOGIC_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    CONDITION_LOGIC_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, elementReference, operatorName, ruleName, screenFieldName
     * 
     */
    CONDITION_MISSING_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, ruleName
     * 
     */
    CONDITION_MISSING_OPERATOR,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, elementReference, operatorName, ruleName, screenFieldName, elementReferenceOrValue
     * 
     */
    CONDITION_OPERAND_DATATYPES_INCOMPATIBLE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, elementReference, operatorName, ruleName, screenFieldName
     * 
     */
    CONDITION_OPERATOR_INCOMPATIBLE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, elementReference, ruleName, screenFieldName
     * 
     */
    CONDITION_REFERENCED_ELEMENT_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, elementReference, elementReferenceOrValue, operatorName, ruleName, screenFieldName
     * 
     */
    CONDITION_RIGHTOPERAND_NULL,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    CONNECTOR_MISSING_TARGET,

    /**
     * Errors with this extended error code have the following properties: severity, constantName
     * 
     */
    CONSTANT_INCLUDES_REFERENCES,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    CUSTOMEVENTS_NOT_ENABLED,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    CUSTOMEVENT_MISSING_PROCESSMETADATAVALUES,

    /**
     * Errors with this extended error code have the following properties: severity, objectType
     * 
     */
    CUSTOMEVENT_OBJECTTYPE_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, objectType
     * 
     */
    CUSTOMEVENT_OBJECTTYPE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, metadataValue
     * 
     */
    CUSTOMEVENT_PROCESSMETADATAVALUES_MISSING_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, metadataValue
     * 
     */
    CUSTOMEVENT_PROCESSMETADATAVALUES_MORE_THAN_ONE_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, dataType
     * 
     */
    DATATYPE_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    DATATYPE_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, processType, dataType, elementType
     * 
     */
    DATA_TYPE_NOT_SUPPORTED_FOR_PROCESSTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, flowDecision
     * 
     */
    DECISION_DEFAULT_CONNECTOR_MISSING_LABEL,

    /**
     * Errors with this extended error code have the following properties: severity, flowDecision
     * 
     */
    DECISION_MISSING_OUTCOME,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    DYNAMIC_TYPE_MAPPING_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ELEMENT_CONNECTS_TO_SELF,

    /**
     * Errors with this extended error code have the following properties: severity, coordinateLimit, coordinateName
     * 
     */
    ELEMENT_COORDINATES_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ELEMENT_INVALID_CONNECTOR,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ELEMENT_INVALID_REFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ELEMENT_MISSING_CONNECTOR,

    /**
     * Errors with this extended error code have the following properties: severity, characterLimit, elementName
     * 
     */
    ELEMENT_MISSING_LABEL,

    /**
     * Errors with this extended error code have the following properties: severity, characterLimit
     * 
     */
    ELEMENT_MISSING_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ELEMENT_MISSING_REFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ELEMENT_MORE_THAN_ONE_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    ELEMENT_NAME_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ELEMENT_NEVER_USED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    ELEMENT_SCALE_SMALLER_THAN_DEFAULTVALUE,

    /**
     * Errors with this extended error code have the following properties: severity, objectName
     * 
     */
    EXTERNAL_OBJECTS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldReference
     * 
     */
    EXTERNAL_OBJECT_FIELDS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, subflowType
     * 
     */
    EX_AUTOLAUNCHED_SUBFLOW_INCOMPATIBLE_FLOWTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, elementName
     * 
     */
    FIELDASSIGNMENT_FIELD_INCOMPATIBLE_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, elementName, assignmentName
     * 
     */
    FIELDASSIGNMENT_INVALID_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, elementName, elementType
     * 
     */
    FIELDASSIGNMENT_INVALID_ELEMENT,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, parameterName
     * 
     */
    FIELDASSIGNMENT_INVALID_REFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    FIELDASSIGNMENT_MULTIPLE_REFERENCES_SAME_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, dataType
     * 
     */
    FIELDASSIGNMENT_PICKLISTFIELD_INCOMPATIBLE_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, elementName, elementType
     * 
     */
    FIELDASSIGNMENT_REFERENCED_ELEMENT_MISSING_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    FIELDSERVICE_UNSUPPORTED_FIELD_TYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, parameterName
     * 
     */
    FIELD_INVALID_VALUE,

    /**
     * Errors with this extended error code have the following properties: severity, objectName, fieldName
     * 
     */
    FIELD_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, fieldRelationshipName
     * 
     */
    FIELD_RELATIONSHIP_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    FIELD_TYPE_NOT_SUPPORTED_AS_CHILD_OF_SCREENFIELD_REGION_OR_REGIONCONTAINER,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    FIELD_TYPE_NOT_SUPPORTED_AS_PARENT,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    FIELD_VALUE_REQUIRES_PERM,

    /**
     * Errors with this extended error code have the following properties: componentName, propertyName, propertyType, errorCode, invalidTokens
     * 
     */
    FLEXIPAGE_COMPONENT_ATTRIBUTE_EXPRESSION_EXCEPTION,

    /**
     * Errors with this extended error code have the following properties: componentName, propertyName, propertyType, errorIdentifier, errorParams
     * 
     */
    FLEXIPAGE_COMPONENT_ATTRIBUTE_GENERIC_EXCEPTION,

    /**
     * Errors with this extended error code have the following properties: componentName, propertyName, propertyType
     * 
     */
    FLEXIPAGE_COMPONENT_ATTRIBUTE_MISSING_REQUIRED,

    /**
     * Errors with this extended error code have the following properties: componentName, propertyName, propertyType, maxLength
     * 
     */
    FLEXIPAGE_COMPONENT_ATTRIBUTE_TOO_LONG,

    /**
     * Errors with this extended error code have the following properties: componentName
     * 
     */
    FLEXIPAGE_COMPONENT_CUSTOM_VALIDATION_EXCEPTION,

    /**
     * Errors with this extended error code have the following properties: 
     * 
     */
    FLEXIPAGE_COMPONENT_MAX_LIMIT_EXCEPTION,

    /**
     * Errors with this extended error code have the following properties: componentName, criterionIndex
     * 
     */
    FLEXIPAGE_COMPONENT_RULE_VALIDATION_EXCEPTION,

    /**
     * Errors with this extended error code have the following properties: componentName, propertyName, propertyType, invalidValue
     * 
     */
    FLEXIPAGE_PICKLIST_INVALID_VALUE_EXCEPTION,

    /**
     * Errors with this extended error code have the following properties: newTemplate, oldTemplate
     * 
     */
    FLEXIPAGE_TEMPLATE_INVALID_SWITCH,

    /**
     * Errors with this extended error code have the following properties: severity, flowName, triggerType
     * 
     */
    FLOW_CONTEXT_RECORD_ASSIGNMENT_VARIABLE_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    FLOW_ELEMENT_SCALE_LESS_THAN_ZERO,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    FLOW_INCLUDES_STEP,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_BULK_EXECUTION,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_HANDLED_ERROR,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_INPUT_VALIDATION,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_INTERACTION_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_INVALID_CHOICE_USER_INPUT,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_INVALID_FIELD_VALUE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_INVALID_START_REQUEST,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_LIMIT_EXCEEDED,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_MISSING_CHOICE_FOR_REQUIRED_CHOICE_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_MISSING_VALUE_FOR_REQUIRED_INPUT_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_NAVIGATE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_RANGE_VALIDATION,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_REGEX_VALIDATION,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_RESUME_INTERVIEW,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_SAVE_RESULT,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_SET_CHOICE_SELECTED,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_START_INTERVIEW,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_INTERVIEW_TYPE_CONVERSION,

    /**
     * Errors with this extended error code have the following properties: severity, maxDevNameLength
     * 
     */
    FLOW_INVALID_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, flowName
     * 
     */
    FLOW_NAME_USED_IN_OTHER_CLIENT,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    FLOW_REFERENCES_APEX_CLASS_NOT_IN_SAME_PACKAGE,

    /**
     * Errors with this extended error code have the following properties: severity, processType, flowStartFrequency, flowTriggerType
     * 
     */
    FLOW_SCHEDULE_INFORMATION_INCOMPLETE,

    /**
     * Errors with this extended error code have the following properties: severity, variableName
     * 
     */
    FLOW_SOBJECT_VARIABLE_NOT_PERSISTED,

    /**
     * Errors with this extended error code have the following properties: severity, stageName
     * 
     */
    FLOW_STAGE_INCLUDES_REFERENCES,

    /**
     * Errors with this extended error code have the following properties: severity, stageName, stageOrder, stageWithSameOrder
     * 
     */
    FLOW_STAGE_ORDER_DUPLICATE,

    /**
     * Errors with this extended error code have the following properties: severity, stageName, invalidStageOrder, maxOrder, minOrder
     * 
     */
    FLOW_STAGE_ORDER_OUT_OF_RANGE,

    /**
     * Errors with this extended error code have the following properties: severity, processType, systemVariable, triggerType
     * 
     */
    FLOW_SYSTEM_VARIABLE_NOT_SUPPORTED_FOR_TRIGGERTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, formulaExpression
     * 
     */
    FORMULA_CMT_LIMIT_EXCEEDED,

    /**
     * Errors with this extended error code have the following properties: severity, formulaExpression
     * 
     */
    FORMULA_EXPRESSION_INVALID,

    /**
     * Errors with this extended error code have the following properties: FTestName, ftestClass
     * 
     */
    FTEST_EXTENSION_CODE_FOR_TEST,

    /**
     * Errors with this extended error code have the following properties: severity, processType, systemVariable
     * 
     */
    GLOBAL_VARIABLE_NOT_SUPPORTED_FOR_PROCESSTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    INCONSISTENT_DYNAMIC_TYPE_MAPPING,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, extensionName, parameterName
     * 
     */
    INCONSISTENT_VALUE_FOR_DYNAMIC_VALUE_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    INPUTPARAM_CONFIGURATION_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    INPUTPARAM_INCOMPATIBLE_CONFIGURATION_ONLY,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    INPUTPARAM_INCOMPATIBLE_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    INPUTPARAM_INCOMPATIBLE_WITH_COLLECTION_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    INPUTPARAM_INCOMPATIBLE_WITH_NONCOLLECTION_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    INPUTPARAM_MISMATCHED_OBJECTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    INVALID_FLOW,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    INVALID_FLOW_INTERVIEW,

    /**
     * Errors with this extended error code have the following properties: severity, surveyName
     * 
     */
    INVALID_SURVEY_VARIABLE_NAME_OR_TYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    LOOP_ASSIGNNEXTVALUETO_MISMATCHED_APEXCLASSTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    LOOP_ASSIGNNEXTVALUETO_MISMATCHED_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    LOOP_ASSIGNNEXTVALUETO_MISMATCHED_OBJECTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    LOOP_ASSIGNNEXTVALUETO_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    LOOP_ASSIGNNEXTVALUETO_MISSING_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldRelationshipName
     * 
     */
    LOOP_ASSIGNNEXTVALUETO_REFERENCE_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    LOOP_COLLECTION_ELEMENT_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    LOOP_COLLECTION_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    LOOP_COLLECTION_NOT_SUPPORTED_FOR_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    LOOP_MISSING_COLLECTION,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    NON_EXPOSED_COMPONENT_IN_FLOW,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    NON_GLOBAL_COMPONENT_IN_EXPORTED_FLOW,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    NUMBER_OF_SCREENFIELD_REGIONS_EXCEEDS_LIMIT,

    /**
     * Errors with this extended error code have the following properties: severity, objectType
     * 
     */
    OBJECTTYPE_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, objectName
     * 
     */
    OBJECT_CANNOT_BE_CREATED,

    /**
     * Errors with this extended error code have the following properties: severity, objectName
     * 
     */
    OBJECT_CANNOT_BE_DELETED,

    /**
     * Errors with this extended error code have the following properties: severity, objectName
     * 
     */
    OBJECT_CANNOT_BE_QUERIED,

    /**
     * Errors with this extended error code have the following properties: severity, objectName
     * 
     */
    OBJECT_CANNOT_BE_UPDATED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    OBJECT_ENCRYPTED_FIELDS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, objectName
     * 
     */
    OBJECT_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    OBJECT_TYPE_DOES_NOT_EXIST,

    /**
     * Errors with this extended error code have the following properties: severity, orgWideEmailAddress
     * 
     */
    ORG_WIDE_EMAIL_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    ORG_WIDE_EMAIL_NOT_USED,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    OUTPUTPARAM_ASSIGNTOREFERENCE_NOTFOUND,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    OUTPUTPARAM_INCOMPATIBLE_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    OUTPUTPARAM_MISMATCHED_OBJECTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    OUTPUTPARAM_MISMATCHED_WITH_COLLECTION_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    OUTPUTPARAM_MISSING_ASSIGNTOREFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    OUTPUTPARAM_MISTMATCHED_WITH_NONCOLLECTION_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    PARAM_DATATYPE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    PAST_SCHEDULE_FLOW_WILL_NOT_RUN,

    /**
     * Errors with this extended error code have the following properties: severity, processType, metadataValue
     * 
     */
    PROCESSMETADATAVALUES_NOT_SUPPORTED_FOR_PROCESSTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, metadataValue
     * 
     */
    PROCESSMETADATAVALUE_NONEXISTENT_ELEMENT,

    /**
     * Errors with this extended error code have the following properties: severity, processType, fieldType
     * 
     */
    PROCESSTYPE_COMPONENTTYPE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, processType, attributeSet, elementType
     * 
     */
    PROCESSTYPE_ELEMENT_CONFIG_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, processType, elementType
     * 
     */
    PROCESSTYPE_ELEMENT_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    PROCESSTYPE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, processType, fieldType
     * 
     */
    PROCESSTYPE_SCREEN_FIELDTYPE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, currentProcessType, flowName, incompatibleProcessType
     * 
     */
    PROCESS_TYPE_INCOMPATIBLE,

    /**
     * Errors with this extended error code have the following properties: errorArguments, errorCode
     * 
     */
    RECOMMENDATION_STRATEGY_EXCEPTION,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    RECORDFILTER_ENCRYPTED_FIELDS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, objectName
     * 
     */
    RECORDFILTER_GEOLOCATION_FIELDS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, elementName, elementType, operatorName
     * 
     */
    RECORDFILTER_INVALID_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, assignmentName, elementName, elementType
     * 
     */
    RECORDFILTER_INVALID_ELEMENT,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, operatorName
     * 
     */
    RECORDFILTER_INVALID_OPERATOR,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, operatorName
     * 
     */
    RECORDFILTER_INVALID_REFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, elementName, elementType, operatorName
     * 
     */
    RECORDFILTER_MISSING_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    RECORDFILTER_MULTIPLE_QUERIES_SAME_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    RECORDFILTER_NON_PRIMITIVE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    RECORDLOOKUP_IDASSIGNMENT_VARIABLE_INCOMPATIBLE_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    RECORDLOOKUP_IDASSIGNMENT_VARIABLE_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, objectName
     * 
     */
    RECORDUPDATE_MISSING_FILTERS,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, mergeFieldReference
     * 
     */
    REFERENCED_ELEMENT_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, ruleName
     * 
     */
    RULE_MISSING_CONDITION,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENCOMPONENT_CONTAINS_VISIBILITY_RULE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENFIELD_API_VERSION_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENFIELD_BOOLEAN_ISREQUIRED_IS_FALSE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SCREENFIELD_DEFAULTVALUE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, extensionName, parameterName
     * 
     */
    SCREENFIELD_EXTENSION_DUPLICATE_INPUT_PARAM,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, extensionName, parameterName
     * 
     */
    SCREENFIELD_EXTENSION_DUPLICATE_OUTPUT_PARAM,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, extensionName
     * 
     */
    SCREENFIELD_EXTENSION_IMPLEMENTATION_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, extensionName, parameterName
     * 
     */
    SCREENFIELD_EXTENSION_INPUT_ATTRIBUTE_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, extensionName
     * 
     */
    SCREENFIELD_EXTENSION_NAME_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, fieldType
     * 
     */
    SCREENFIELD_EXTENSION_NAME_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, fieldType
     * 
     */
    SCREENFIELD_EXTENSION_NAME_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, extensionName, parameterName
     * 
     */
    SCREENFIELD_EXTENSION_OUTPUT_ATTRIBUTE_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, extensionName, parameterName
     * 
     */
    SCREENFIELD_EXTENSION_REQUIRED_INPUT_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, fieldType
     * 
     */
    SCREENFIELD_INPUTS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, dataType, fieldType
     * 
     */
    SCREENFIELD_INVALID_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName
     * 
     */
    SCREENFIELD_MULTISELECTCHOICE_SEMICOLON_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, fieldType
     * 
     */
    SCREENFIELD_OUTPUTS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENFIELD_REGION_CONTAINS_DUPLICATE_INPUT_PARAMETER_VALUES,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENFIELD_REGION_INPUT_PARAMETER_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SCREENFIELD_REGION_MISSING_REQUIRED_PERMISSIONS,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENFIELD_REGION_NOT_IN_CONTAINER,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENFIELD_REGION_REQUIRED_INPUT_PARAMETER_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENFIELD_REGION_WIDTH_SUM_EXCEEDS_LIMIT,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENFIELD_REGION_WIDTH_VALUE_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, fieldType
     * 
     */
    SCREENFIELD_TYPE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SCREENFIELD_TYPE_NOT_SUPPORTED_FOR_API_VERSION,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName
     * 
     */
    SCREENFIELD_USERINPUT_NOT_SUPPORTED_FOR_CHOICETYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SCREENFIELD_VALIDATIONRULE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName, attributeName
     * 
     */
    SCREENRULE_ACTION_INVALID_ATTRIBUTE,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName, attributeName
     * 
     */
    SCREENRULE_ACTION_INVALID_ATTRIBUTE_FOR_API_VERSION,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName, acceptedValues, actionValue
     * 
     */
    SCREENRULE_ACTION_INVALID_VALUE,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName
     * 
     */
    SCREENRULE_ACTION_MISSING_ATTRIBUTE,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName
     * 
     */
    SCREENRULE_ACTION_MISSING_FIELDREFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName
     * 
     */
    SCREENRULE_ACTION_MISSING_VALUE,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName, attributeName, fieldName
     * 
     */
    SCREENRULE_ATTRIBUTE_NOT_SUPPORTED_FOR_SCREENFIELD,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName, fieldValue
     * 
     */
    SCREENRULE_FIELD_NOT_FOUND_ON_SCREEN,

    /**
     * Errors with this extended error code have the following properties: severity, screenRuleName
     * 
     */
    SCREENRULE_MISSING_ACTION,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    SCREENRULE_NOT_SUPPORTED_IN_ORG,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREENRULE_SCREENFIELD_NOT_VISIBLE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    SCREENRULE_VISIBILITY_NOT_SUPPORTED_IN_ORG,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    SCREEN_ALLOWBACK_ALLOWFINISH_BOTH_FALSE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SCREEN_CONTAINS_LIGHTNING_COMPONENT,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    SCREEN_MISSING_FOOTER_AND_LIGHTNING_COMPONENT,

    /**
     * Errors with this extended error code have the following properties: severity, characterLimit
     * 
     */
    SCREEN_MISSING_LABEL,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName
     * 
     */
    SCREEN_MULTISELECTFIELD_DOESNT_SUPPORT_CHOICE_WITH_USERINPUT,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SCREEN_PAUSEDTEXT_NOT_SHOWN_WHEN_ALLOWPAUSE_IS_FALSE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, requiredField
     * 
     */
    SETTING_FIELD_MAKES_OTHER_FIELD_REQUIRED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, otherFieldName
     * 
     */
    SETTING_FIELD_MAKES_OTHER_FIELD_UNSUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, otherFieldName, value
     * 
     */
    SETTING_FIELD_VALUE_MAKES_OTHER_FIELD_UNSUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, fieldValue, otherFieldName, otherFieldValue
     * 
     */
    SETTING_FIELD_VALUE_MAKES_OTHER_FIELD_VALUE_UNSUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, fieldValue
     * 
     */
    SOBJECT_ELEMENT_INCOMPATIBLE_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, objectType, sobjectName
     * 
     */
    SOBJECT_ELEMENT_MISMATCHED_OBJECTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, objectType
     * 
     */
    SORT_ENCRYPTED_FIELDS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, sortOrder
     * 
     */
    SORT_FIELD_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, objectName
     * 
     */
    SORT_FIELD_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, objectName
     * 
     */
    SORT_GEOLOCATION_FIELDS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, maxLimit
     * 
     */
    SORT_LIMIT_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    SORT_ORDER_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, fieldType, requiedField
     * 
     */
    SPECIFIC_FIELD_VALUE_MAKES_OTHER_FIELD_REQUIRED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, parameterName
     * 
     */
    STAGE_NAME_NOT_FULLY_QUALIFIED,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    START_ELEMENT_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, flowName
     * 
     */
    SUBFLOW_DESKTOP_DESIGNER_FLOWS_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, flowName
     * 
     */
    SUBFLOW_DIFFERENT_RUNMODE,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputAssignmentNames
     * 
     */
    SUBFLOW_INPUT_ELEMENT_INCOMPATIBLE_DATATYPES,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputAssignmentNames
     * 
     */
    SUBFLOW_INPUT_INVALID_VALUE,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputParameterNames
     * 
     */
    SUBFLOW_INPUT_MISMATCHED_APEX_CLASS,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputParameterNames
     * 
     */
    SUBFLOW_INPUT_MISMATCHED_COLLECTIONTYPES,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputParameterNames
     * 
     */
    SUBFLOW_INPUT_MISMATCHED_OBJECTS,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName
     * 
     */
    SUBFLOW_INPUT_MISSING_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, inputVariableName
     * 
     */
    SUBFLOW_INPUT_MULTIPLE_ASSIGNMENTS_TO_ONE_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, inputVariableName
     * 
     */
    SUBFLOW_INPUT_REFERENCES_FIELD_ON_SOBJECT_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputAssignmentNames
     * 
     */
    SUBFLOW_INPUT_VALUE_INCOMPATIBLE_DATATYPES,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputAssignmentNames
     * 
     */
    SUBFLOW_INPUT_VARIABLE_NOT_FOUND_IN_MASTERFLOW,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputAssignmentNames
     * 
     */
    SUBFLOW_INPUT_VARIABLE_NOT_FOUND_IN_REFERENCEDFLOW,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, inputAssignmentNames
     * 
     */
    SUBFLOW_INPUT_VARIABLE_NO_INPUT_ACCESS,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    SUBFLOW_INVALID_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, flowName
     * 
     */
    SUBFLOW_INVALID_REFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, parentFlowName
     * 
     */
    SUBFLOW_MASTER_FLOW_TYPE_NOT_AUTOLAUNCHED,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    SUBFLOW_MISSING_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, flowName
     * 
     */
    SUBFLOW_NO_ACTIVE_VERSION,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, flowVersion, outputParameterNames
     * 
     */
    SUBFLOW_OUTPUT_INCOMPATIBLE_DATATYPES,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, flowVersion, outputParameterNames
     * 
     */
    SUBFLOW_OUTPUT_MISMATCHED_APEX_CLASS,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, flowVersion, outputParameterNames
     * 
     */
    SUBFLOW_OUTPUT_MISMATCHED_COLLECTIONTYPES,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, flowVersion, outputParameterNames
     * 
     */
    SUBFLOW_OUTPUT_MISMATCHED_OBJECTS,

    /**
     * Errors with this extended error code have the following properties: severity, outputAssignment
     * 
     */
    SUBFLOW_OUTPUT_MISSING_ASSIGNTOREFERENCE,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName
     * 
     */
    SUBFLOW_OUTPUT_MISSING_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, outputVariableName
     * 
     */
    SUBFLOW_OUTPUT_MULTIPLE_ASSIGNMENTS_TO_ONE_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, outputAssignment
     * 
     */
    SUBFLOW_OUTPUT_REFERENCES_FIELD_ON_SOBJECT_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, outputAssignmentName
     * 
     */
    SUBFLOW_OUTPUT_TARGET_DOES_NOT_EXIST_IN_MASTER_FLOW,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, variableName
     * 
     */
    SUBFLOW_OUTPUT_VARIABLE_NOT_FOUND_IN_MASTERFLOW,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, flowVersion, outputParameterNames
     * 
     */
    SUBFLOW_OUTPUT_VARIABLE_NOT_FOUND_IN_REFERENCEDFLOW,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, variableName
     * 
     */
    SUBFLOW_OUTPUT_VARIABLE_NO_OUTPUT_ACCESS,

    /**
     * Errors with this extended error code have the following properties: severity, processType, subflowElementName, subflowName, subflowProcessType
     * 
     */
    SUBFLOW_PROCESSTYPE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, flowName, processType
     * 
     */
    SUBFLOW_PROCESS_TYPE_INCOMPATIBLE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    SUBFLOW_REFERENCES_MASTERFLOW,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SURVEY_ADVANCED_CONDITION_LOGIC_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName
     * 
     */
    SURVEY_CHOICE_NOT_REFERENCED_BY_A_QUESTION,

    /**
     * Errors with this extended error code have the following properties: severity, choiceName
     * 
     */
    SURVEY_CHOICE_REFERENCED_BY_MULTIPLE_QUESTIONS,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SURVEY_ELEMENT_NEVER_REACHED,

    /**
     * Errors with this extended error code have the following properties: severity, surveyName
     * 
     */
    SURVEY_ENRICH_INVALID_CONFIGURATION,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName
     * 
     */
    SURVEY_INACTIVE_SUBFLOWS,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SURVEY_INVALID_MERGE_FIELD_CONFIGURATION,

    /**
     * Errors with this extended error code have the following properties: severity, surveyName
     * 
     */
    SURVEY_MISSING_QUESTION_OR_SUBFLOW,

    /**
     * Errors with this extended error code have the following properties: severity, surveyName
     * 
     */
    SURVEY_MISSING_REQUIRED_VARIABLES,

    /**
     * Errors with this extended error code have the following properties: severity, flowDecision
     * 
     */
    SURVEY_MULTIPLE_SCREENS_CANNOT_CONNECT_TO_SAME_DECISION,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName
     * 
     */
    SURVEY_NESTED_SUBFLOWS,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName
     * 
     */
    SURVEY_NONSURVEY_SUBFLOWS,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SURVEY_RULE_INVALID_RIGHT_OPERAND,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    SURVEY_SCREENFIELD_TYPE_NOT_SUPPORTED_FOR_QUESTION,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    SURVEY_START_ELEMENT_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, surveyName
     * 
     */
    SURVEY_VARIABLE_ACCESS_INVALID,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    SYSTEM_MODE_NOT_ALLOWED,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    TRIGGERED_FLOW_REDUNDANT_QUERY,

    /**
     * Errors with this extended error code have the following properties: severity, objectName, triggerType
     * 
     */
    TRIGGER_TYPE_CONTEXT_OBJECT_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, elementType, triggerType
     * 
     */
    TRIGGER_TYPE_ELEMENT_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    TRIGGER_TYPE_INCOMPATIBLE_WITH_PROCESS_TYPE,

    /**
     * Errors with this extended error code have the following properties: severity, subflowName, triggerType
     * 
     */
    TRIGGER_TYPE_NOT_ALLOWED_FOR_SUBFLOW,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    TYPE_MAPPING_DUPLICATED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    TYPE_MAPPING_NAME_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    TYPE_MAPPING_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    TYPE_MAPPING_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    TYPE_MAPPING_NOT_SUPPORTED_FOR_API_VERSION,

    /**
     * Errors with this extended error code have the following properties: severity, processType
     * 
     */
    TYPE_MAPPING_NOT_SUPPORTED_FOR_PROCESS_TYPE,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    UNEXPECTED_ERROR,

    /**
     * Errors with this extended error code have the following properties: severity, elementName, characterLimit
     * 
     */
    VALUE_CHAR_LIMIT_EXCEEDED,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, datatype
     * 
     */
    VARIABLE_FIELD_NOT_SUPPORTED_FOR_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName, datatype
     * 
     */
    VARIABLE_FIELD_NOT_SUPPORTED_FOR_DATATYPE_AND_COLLECTION,

    /**
     * Errors with this extended error code have the following properties: severity, datatype, fieldName
     * 
     */
    VARIABLE_FIELD_REQUIRED_FOR_DATATYPE,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    VARIABLE_SCALE_EXCEEDS_LIMIT,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    VARIABLE_SCALE_NEGATIVE_INTEGER,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    VARIABLE_SCALE_NULL,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    VISIBILITY_RULE_EXCEEDS_CONDITION_LIMIT,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    VISIBILITY_RULE_NOT_AVAILABLE_IN_ORG,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    VISIBILITY_RULE_NOT_SUPPORTED_FOR_API_VERSION,

    /**
     * Errors with this extended error code have the following properties: severity, processType, screenFieldName
     * 
     */
    VISIBILITY_RULE_NOT_SUPPORTED_FOR_PROCESSTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, fieldName
     * 
     */
    VISIBILITY_RULE_NO_CONDITIONS,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName
     * 
     */
    WAITEVENT_DEFAULT_CONNECTOR_MISSING_LABEL,

    /**
     * Errors with this extended error code have the following properties: severity, parameterName
     * 
     */
    WAITEVENT_DUPLICATE_INPUT_PARAM,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, inputParameterName
     * 
     */
    WAITEVENT_INPUT_NOT_SUPPORTED_FOR_EVENTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, parameterName
     * 
     */
    WAITEVENT_INPUT_REQUIRES_LITERAL_VALUE,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName
     * 
     */
    WAITEVENT_INVALID_CONDITION_LOGIC,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    WAITEVENT_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName
     * 
     */
    WAITEVENT_MISSING_CONNECTOR,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName
     * 
     */
    WAITEVENT_MISSING_EVENTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName
     * 
     */
    WAITEVENT_OBJECT_NOT_SUPPORTED_FOR_EVENTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, outputParameter
     * 
     */
    WAITEVENT_OUTPUT_NOT_SUPPORTED_FOR_EVENTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, eventParameterName, incompatibleValue
     * 
     */
    WAITEVENT_RELATIVEALARM_INVALID_DATETIME_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, eventParameterName, incompatibleValue
     * 
     */
    WAITEVENT_RELATIVEALARM_INVALID_FIELD,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, inputParameterName
     * 
     */
    WAITEVENT_RELATIVEALARM_INVALID_OBJECTTYPE,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, eventParameterName, incompatibleValue
     * 
     */
    WAITEVENT_RELATIVEALARM_INVALID_OFFSETNUMBER,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, eventParameterName, incompatibleValue
     * 
     */
    WAITEVENT_RELATIVEALARM_INVALID_OFFSETUNIT,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName, parameterName
     * 
     */
    WAITEVENT_REQUIRED_INPUT_MISSING,

    /**
     * Errors with this extended error code have the following properties: severity, waitEventName
     * 
     */
    WAITEVENT_TYPE_INVALID_OR_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, flowName
     * 
     */
    WORKFLOW_MISSING_PROCESSMETADATAVALUES,

    /**
     * Errors with this extended error code have the following properties: severity, objectType
     * 
     */
    WORKFLOW_OBJECTTYPE_NOT_FOUND,

    /**
     * Errors with this extended error code have the following properties: severity, objectType
     * 
     */
    WORKFLOW_OBJECTTYPE_NOT_SUPPORTED,

    /**
     * Errors with this extended error code have the following properties: severity, objectVariableName, oldObjectVariableName
     * 
     */
    WORKFLOW_OBJECTVARIABLE_AND_OLDOBJECTVARIABLE_REFERENCE_SAME_SOBJECT_VARIABLE,

    /**
     * Errors with this extended error code have the following properties: severity, objectType, objectVariableName
     * 
     */
    WORKFLOW_OBJECTVARIABLE_DOESNT_SUPPORT_INPUT,

    /**
     * Errors with this extended error code have the following properties: severity, objectType, oldObjectVariableName
     * 
     */
    WORKFLOW_OLDOBJECTVARIABLE_DOESNT_SUPPORT_INPUT,

    /**
     * Errors with this extended error code have the following properties: severity, metadataValue
     * 
     */
    WORKFLOW_PROCESSMETADATAVALUES_MORE_THAN_ONE_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, metadataValue
     * 
     */
    WORKFLOW_PROCESS_METADATAVALUES_MISSING_NAME,

    /**
     * Errors with this extended error code have the following properties: severity, elementName
     * 
     */
    WORKFLOW_RECURSIVECOUNTVARIABLE_DOESNT_SUPPORT_INPUT,

    /**
     * Errors with this extended error code have the following properties: severity
     * 
     */
    WORKFLOW_TRIGGERTYPE_INVALID_VALUE;

    public String value() {
        return name();
    }

    public static ExtendedErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
