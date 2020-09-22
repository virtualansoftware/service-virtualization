
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL_OR_NONE_OPERATION_ROLLED_BACK"/&gt;
 *     &lt;enumeration value="ALREADY_IN_PROCESS"/&gt;
 *     &lt;enumeration value="APEX_DATA_ACCESS_RESTRICTION"/&gt;
 *     &lt;enumeration value="ASSIGNEE_TYPE_REQUIRED"/&gt;
 *     &lt;enumeration value="AURA_COMPILE_ERROR"/&gt;
 *     &lt;enumeration value="AUTH_PROVIDER_NEEDS_AUTH"/&gt;
 *     &lt;enumeration value="AUTH_PROVIDER_NOT_FOUND"/&gt;
 *     &lt;enumeration value="BAD_CUSTOM_ENTITY_PARENT_DOMAIN"/&gt;
 *     &lt;enumeration value="BCC_NOT_ALLOWED_IF_BCC_COMPLIANCE_ENABLED"/&gt;
 *     &lt;enumeration value="CANNOT_CASCADE_PRODUCT_ACTIVE"/&gt;
 *     &lt;enumeration value="CANNOT_CHANGE_FIELD_TYPE_OF_APEX_REFERENCED_FIELD"/&gt;
 *     &lt;enumeration value="CANNOT_CHANGE_FIELD_TYPE_OF_REFERENCED_FIELD"/&gt;
 *     &lt;enumeration value="CANNOT_CREATE_ANOTHER_MANAGED_PACKAGE"/&gt;
 *     &lt;enumeration value="CANNOT_DEACTIVATE_DIVISION"/&gt;
 *     &lt;enumeration value="CANNOT_DELETE_GLOBAL_ACTION_LIST"/&gt;
 *     &lt;enumeration value="CANNOT_DELETE_LAST_DATED_CONVERSION_RATE"/&gt;
 *     &lt;enumeration value="CANNOT_DELETE_MANAGED_OBJECT"/&gt;
 *     &lt;enumeration value="CANNOT_DISABLE_LAST_ADMIN"/&gt;
 *     &lt;enumeration value="CANNOT_ENABLE_IP_RESTRICT_REQUESTS"/&gt;
 *     &lt;enumeration value="CANNOT_EXECUTE_FLOW_TRIGGER"/&gt;
 *     &lt;enumeration value="CANNOT_FREEZE_SELF"/&gt;
 *     &lt;enumeration value="CANNOT_INSERT_UPDATE_ACTIVATE_ENTITY"/&gt;
 *     &lt;enumeration value="CANNOT_MODIFY_MANAGED_OBJECT"/&gt;
 *     &lt;enumeration value="CANNOT_PASSWORD_LOCKOUT"/&gt;
 *     &lt;enumeration value="CANNOT_POST_TO_ARCHIVED_GROUP"/&gt;
 *     &lt;enumeration value="CANNOT_RENAME_APEX_REFERENCED_FIELD"/&gt;
 *     &lt;enumeration value="CANNOT_RENAME_APEX_REFERENCED_OBJECT"/&gt;
 *     &lt;enumeration value="CANNOT_RENAME_REFERENCED_FIELD"/&gt;
 *     &lt;enumeration value="CANNOT_RENAME_REFERENCED_OBJECT"/&gt;
 *     &lt;enumeration value="CANNOT_REPARENT_RECORD"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE_CONVERTED_LEAD"/&gt;
 *     &lt;enumeration value="CANT_DISABLE_CORP_CURRENCY"/&gt;
 *     &lt;enumeration value="CANT_UNSET_CORP_CURRENCY"/&gt;
 *     &lt;enumeration value="CHILD_SHARE_FAILS_PARENT"/&gt;
 *     &lt;enumeration value="CIRCULAR_DEPENDENCY"/&gt;
 *     &lt;enumeration value="CLEAN_SERVICE_ERROR"/&gt;
 *     &lt;enumeration value="CLONE_FIELD_INTEGRITY_EXCEPTION"/&gt;
 *     &lt;enumeration value="CLONE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="COLLISION_DETECTED"/&gt;
 *     &lt;enumeration value="COMMERCIAL_CONTROL_ERROR"/&gt;
 *     &lt;enumeration value="COMMUNITY_NOT_ACCESSIBLE"/&gt;
 *     &lt;enumeration value="CONFLICTING_ENVIRONMENT_HUB_MEMBER"/&gt;
 *     &lt;enumeration value="CONFLICTING_SSO_USER_MAPPING"/&gt;
 *     &lt;enumeration value="CONTENT_TYPE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="CUSTOM_APEX_ERROR"/&gt;
 *     &lt;enumeration value="CUSTOM_CLOB_FIELD_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="CUSTOM_ENTITY_OR_FIELD_LIMIT"/&gt;
 *     &lt;enumeration value="CUSTOM_FIELD_INDEX_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="CUSTOM_INDEX_EXISTS"/&gt;
 *     &lt;enumeration value="CUSTOM_LINK_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="CUSTOM_METADATA_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="CUSTOM_METADATA_REL_FIELD_MANAGEABILITY"/&gt;
 *     &lt;enumeration value="CUSTOM_SETTINGS_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="CUSTOM_TAB_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="DATAASSESSMENT_CONFIG_ASSESSMENT_IN_PROGRESS_ERROR"/&gt;
 *     &lt;enumeration value="DATAASSESSMENT_CONFIG_SERVICE_ERROR"/&gt;
 *     &lt;enumeration value="DATACLOUDADDRESS_NO_RECORDS_FOUND"/&gt;
 *     &lt;enumeration value="DATACLOUDADDRESS_PROCESSING_ERROR"/&gt;
 *     &lt;enumeration value="DATACLOUDADDRESS_SERVER_ERROR"/&gt;
 *     &lt;enumeration value="DELETE_FAILED"/&gt;
 *     &lt;enumeration value="DELETE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="DELETE_OPERATION_TOO_LARGE"/&gt;
 *     &lt;enumeration value="DELETE_REQUIRED_ON_CASCADE"/&gt;
 *     &lt;enumeration value="DEPENDENCY_EXISTS"/&gt;
 *     &lt;enumeration value="DUPLICATES_DETECTED"/&gt;
 *     &lt;enumeration value="DUPLICATE_CASE_SOLUTION"/&gt;
 *     &lt;enumeration value="DUPLICATE_COMM_NICKNAME"/&gt;
 *     &lt;enumeration value="DUPLICATE_CUSTOM_ENTITY_DEFINITION"/&gt;
 *     &lt;enumeration value="DUPLICATE_CUSTOM_TAB_MOTIF"/&gt;
 *     &lt;enumeration value="DUPLICATE_DEVELOPER_NAME"/&gt;
 *     &lt;enumeration value="DUPLICATE_EXTERNAL_ID"/&gt;
 *     &lt;enumeration value="DUPLICATE_MASTER_LABEL"/&gt;
 *     &lt;enumeration value="DUPLICATE_SENDER_DISPLAY_NAME"/&gt;
 *     &lt;enumeration value="DUPLICATE_USERNAME"/&gt;
 *     &lt;enumeration value="DUPLICATE_VALUE"/&gt;
 *     &lt;enumeration value="EMAIL_ADDRESS_BOUNCED"/&gt;
 *     &lt;enumeration value="EMAIL_EXTERNAL_TRANSPORT_CONNECTION_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_EXTERNAL_TRANSPORT_PERMISSION_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_EXTERNAL_TRANSPORT_TOKEN_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_EXTERNAL_TRANSPORT_TOO_MANY_REQUESTS_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_EXTERNAL_TRANSPORT_UNKNOWN_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_NOT_PROCESSED_DUE_TO_PRIOR_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_OPTED_OUT"/&gt;
 *     &lt;enumeration value="EMAIL_TEMPLATE_FORMULA_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_TEMPLATE_MERGEFIELD_ACCESS_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_TEMPLATE_MERGEFIELD_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_TEMPLATE_MERGEFIELD_VALUE_ERROR"/&gt;
 *     &lt;enumeration value="EMAIL_TEMPLATE_PROCESSING_ERROR"/&gt;
 *     &lt;enumeration value="EMPTY_SCONTROL_FILE_NAME"/&gt;
 *     &lt;enumeration value="ENHANCED_EMAIL_TEMPLATE_COMPILATION_ERROR"/&gt;
 *     &lt;enumeration value="ENTITY_FAILED_IFLASTMODIFIED_ON_UPDATE"/&gt;
 *     &lt;enumeration value="ENTITY_IS_ARCHIVED"/&gt;
 *     &lt;enumeration value="ENTITY_IS_DELETED"/&gt;
 *     &lt;enumeration value="ENTITY_IS_LOCKED"/&gt;
 *     &lt;enumeration value="ENTITY_SAVE_ERROR"/&gt;
 *     &lt;enumeration value="ENTITY_SAVE_VALIDATION_ERROR"/&gt;
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT"/&gt;
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_ERROR_JOINING_HUB"/&gt;
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_USER_ALREADY_IN_HUB"/&gt;
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_USER_NOT_ORG_ADMIN"/&gt;
 *     &lt;enumeration value="ERROR_IN_MAILER"/&gt;
 *     &lt;enumeration value="EXCEEDED_MAX_SEMIJOIN_SUBSELECTS_WRITE"/&gt;
 *     &lt;enumeration value="EXCHANGE_WEB_SERVICES_URL_INVALID"/&gt;
 *     &lt;enumeration value="EXTERNAL_RESOURCE_FORBIDDEN"/&gt;
 *     &lt;enumeration value="FAILED_ACTIVATION"/&gt;
 *     &lt;enumeration value="FIELD_CUSTOM_VALIDATION_EXCEPTION"/&gt;
 *     &lt;enumeration value="FIELD_FILTER_VALIDATION_EXCEPTION"/&gt;
 *     &lt;enumeration value="FIELD_INTEGRITY_EXCEPTION"/&gt;
 *     &lt;enumeration value="FIELD_KEYWORD_LIST_MATCH_LIMIT"/&gt;
 *     &lt;enumeration value="FIELD_MAPPING_ERROR"/&gt;
 *     &lt;enumeration value="FIELD_MODERATION_RULE_BLOCK"/&gt;
 *     &lt;enumeration value="FIELD_NOT_UPDATABLE"/&gt;
 *     &lt;enumeration value="FILE_EXTENSION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="FILE_SIZE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="FILTERED_LOOKUP_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="FIND_DUPLICATES_ERROR"/&gt;
 *     &lt;enumeration value="FLOW_EXCEPTION"/&gt;
 *     &lt;enumeration value="FUNCTIONALITY_NOT_ENABLED"/&gt;
 *     &lt;enumeration value="HAS_PUBLIC_REFERENCES"/&gt;
 *     &lt;enumeration value="HTML_FILE_UPLOAD_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="IMAGE_TOO_LARGE"/&gt;
 *     &lt;enumeration value="INACTIVE_OWNER_OR_USER"/&gt;
 *     &lt;enumeration value="INACTIVE_RULE_ERROR"/&gt;
 *     &lt;enumeration value="INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_ACCESS_ON_CROSS_REFERENCE_ENTITY"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_ACCESS_OR_READONLY"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_ACCESS_TO_INSIGHTSEXTERNALDATA"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_CREDITS"/&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *     &lt;enumeration value="INVALID_ACCESS_LEVEL"/&gt;
 *     &lt;enumeration value="INVALID_ACCESS_TOKEN"/&gt;
 *     &lt;enumeration value="INVALID_API_INPUT"/&gt;
 *     &lt;enumeration value="INVALID_ARGUMENT_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_ASSIGNEE_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_ASSIGNMENT_RULE"/&gt;
 *     &lt;enumeration value="INVALID_AUTH_HEADER"/&gt;
 *     &lt;enumeration value="INVALID_BATCH_OPERATION"/&gt;
 *     &lt;enumeration value="INVALID_CONTENT_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_CREDIT_CARD_INFO"/&gt;
 *     &lt;enumeration value="INVALID_CROSS_REFERENCE_KEY"/&gt;
 *     &lt;enumeration value="INVALID_CROSS_REFERENCE_TYPE_FOR_FIELD"/&gt;
 *     &lt;enumeration value="INVALID_CURRENCY_CONV_RATE"/&gt;
 *     &lt;enumeration value="INVALID_CURRENCY_CORP_RATE"/&gt;
 *     &lt;enumeration value="INVALID_CURRENCY_ISO"/&gt;
 *     &lt;enumeration value="INVALID_DATASET_REFERENCE_INPUT"/&gt;
 *     &lt;enumeration value="INVALID_DATA_CATEGORY_GROUP_REFERENCE"/&gt;
 *     &lt;enumeration value="INVALID_DATA_URI"/&gt;
 *     &lt;enumeration value="INVALID_EMAIL_ADDRESS"/&gt;
 *     &lt;enumeration value="INVALID_EMPTY_KEY_OWNER"/&gt;
 *     &lt;enumeration value="INVALID_ENTITY_FOR_MATCH_ENGINE_ERROR"/&gt;
 *     &lt;enumeration value="INVALID_ENTITY_FOR_MATCH_OPERATION_ERROR"/&gt;
 *     &lt;enumeration value="INVALID_ENTITY_FOR_UPSERT"/&gt;
 *     &lt;enumeration value="INVALID_ENVIRONMENT_HUB_MEMBER"/&gt;
 *     &lt;enumeration value="INVALID_EVENT_DELIVERY"/&gt;
 *     &lt;enumeration value="INVALID_EVENT_INPUT"/&gt;
 *     &lt;enumeration value="INVALID_EVENT_SUBSCRIPTION"/&gt;
 *     &lt;enumeration value="INVALID_EXTENSION_ID"/&gt;
 *     &lt;enumeration value="INVALID_FIELD"/&gt;
 *     &lt;enumeration value="INVALID_FIELD_FOR_INSERT_UPDATE"/&gt;
 *     &lt;enumeration value="INVALID_FIELD_WHEN_USING_TEMPLATE"/&gt;
 *     &lt;enumeration value="INVALID_FILTER_ACTION"/&gt;
 *     &lt;enumeration value="INVALID_GOOGLE_DOCS_URL"/&gt;
 *     &lt;enumeration value="INVALID_ID_FIELD"/&gt;
 *     &lt;enumeration value="INVALID_INET_ADDRESS"/&gt;
 *     &lt;enumeration value="INVALID_INPUT"/&gt;
 *     &lt;enumeration value="INVALID_INPUT_FORMAT"/&gt;
 *     &lt;enumeration value="INVALID_KEY_FIELD_INPUT"/&gt;
 *     &lt;enumeration value="INVALID_LINEITEM_CLONE_STATE"/&gt;
 *     &lt;enumeration value="INVALID_MARKUP"/&gt;
 *     &lt;enumeration value="INVALID_MASTER_OR_TRANSLATED_SOLUTION"/&gt;
 *     &lt;enumeration value="INVALID_MESSAGE_ID_REFERENCE"/&gt;
 *     &lt;enumeration value="INVALID_NAMESPACE_PREFIX"/&gt;
 *     &lt;enumeration value="INVALID_OAUTH_URL"/&gt;
 *     &lt;enumeration value="INVALID_OPERATION"/&gt;
 *     &lt;enumeration value="INVALID_OPERATOR"/&gt;
 *     &lt;enumeration value="INVALID_OR_NULL_FOR_RESTRICTED_PICKLIST"/&gt;
 *     &lt;enumeration value="INVALID_OWNER"/&gt;
 *     &lt;enumeration value="INVALID_PACKAGE_LICENSE"/&gt;
 *     &lt;enumeration value="INVALID_PACKAGE_VERSION"/&gt;
 *     &lt;enumeration value="INVALID_PARTNER_NETWORK_STATUS"/&gt;
 *     &lt;enumeration value="INVALID_PAYLOAD_VERSION"/&gt;
 *     &lt;enumeration value="INVALID_PERSON_ACCOUNT_OPERATION"/&gt;
 *     &lt;enumeration value="INVALID_PROVIDER_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_QUERY_KEY"/&gt;
 *     &lt;enumeration value="INVALID_QUERY_LOCATOR"/&gt;
 *     &lt;enumeration value="INVALID_QUERY_VALUE"/&gt;
 *     &lt;enumeration value="INVALID_READ_ONLY_USER_DML"/&gt;
 *     &lt;enumeration value="INVALID_REFRESH_TOKEN"/&gt;
 *     &lt;enumeration value="INVALID_REQUEST_STATE"/&gt;
 *     &lt;enumeration value="INVALID_RUNTIME_VALUE"/&gt;
 *     &lt;enumeration value="INVALID_SAVE_AS_ACTIVITY_FLAG"/&gt;
 *     &lt;enumeration value="INVALID_SCS_INBOUND_USER"/&gt;
 *     &lt;enumeration value="INVALID_SESSION_ID"/&gt;
 *     &lt;enumeration value="INVALID_SETUP_OWNER"/&gt;
 *     &lt;enumeration value="INVALID_SIGNUP_COUNTRY"/&gt;
 *     &lt;enumeration value="INVALID_SIGNUP_OPTION"/&gt;
 *     &lt;enumeration value="INVALID_SITE_DELETE_EXCEPTION"/&gt;
 *     &lt;enumeration value="INVALID_SITE_FILE_IMPORTED_EXCEPTION"/&gt;
 *     &lt;enumeration value="INVALID_SITE_FILE_TYPE_EXCEPTION"/&gt;
 *     &lt;enumeration value="INVALID_STATUS"/&gt;
 *     &lt;enumeration value="INVALID_SUBDOMAIN"/&gt;
 *     &lt;enumeration value="INVALID_TEXT_REPRESENTATION"/&gt;
 *     &lt;enumeration value="INVALID_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_TYPE_FOR_OPERATION"/&gt;
 *     &lt;enumeration value="INVALID_TYPE_ON_FIELD_IN_RECORD"/&gt;
 *     &lt;enumeration value="INVALID_USERID"/&gt;
 *     &lt;enumeration value="IP_RANGE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="ITEM_NOT_FOUND"/&gt;
 *     &lt;enumeration value="JIGSAW_IMPORT_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="LICENSE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="LIGHT_PORTAL_USER_EXCEPTION"/&gt;
 *     &lt;enumeration value="LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="LIST_PRICE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="MALFORMED_ID"/&gt;
 *     &lt;enumeration value="MANAGER_NOT_DEFINED"/&gt;
 *     &lt;enumeration value="MASSMAIL_RETRY_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="MASS_MAIL_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="MATCH_DEFINITION_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_INVALID_ENGINE_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_INVALID_RULE_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_MISSING_ENGINE_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_MISSING_OBJECT_TYPE_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_MISSING_OPTIONS_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_MISSING_RULE_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_UNKNOWN_RULE_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_OPERATION_UNSUPPORTED_VERSION_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_PRECONDITION_FAILED"/&gt;
 *     &lt;enumeration value="MATCH_RUNTIME_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_SERVICE_ERROR"/&gt;
 *     &lt;enumeration value="MATCH_SERVICE_TIMED_OUT"/&gt;
 *     &lt;enumeration value="MATCH_SERVICE_UNAVAILABLE_ERROR"/&gt;
 *     &lt;enumeration value="MAXIMUM_CCEMAILS_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAXIMUM_DASHBOARD_COMPONENTS_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAXIMUM_HIERARCHY_CHILDREN_REACHED"/&gt;
 *     &lt;enumeration value="MAXIMUM_HIERARCHY_LEVELS_REACHED"/&gt;
 *     &lt;enumeration value="MAXIMUM_HIERARCHY_TREE_SIZE_REACHED"/&gt;
 *     &lt;enumeration value="MAXIMUM_SIZE_OF_ATTACHMENT"/&gt;
 *     &lt;enumeration value="MAXIMUM_SIZE_OF_DOCUMENT"/&gt;
 *     &lt;enumeration value="MAX_ACTIONS_PER_RULE_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_ACTIVE_RULES_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_APPROVAL_STEPS_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_DEPTH_IN_FLOW_EXECUTION"/&gt;
 *     &lt;enumeration value="MAX_FORMULAS_PER_RULE_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_RULES_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_RULE_ENTRIES_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_TASK_DESCRIPTION_EXCEEEDED"/&gt;
 *     &lt;enumeration value="MAX_TM_RULES_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_TM_RULE_ITEMS_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_TRIGGERS_EXCEEDED"/&gt;
 *     &lt;enumeration value="MERGE_FAILED"/&gt;
 *     &lt;enumeration value="METADATA_FIELD_UPDATE_ERROR"/&gt;
 *     &lt;enumeration value="MISSING_ARGUMENT"/&gt;
 *     &lt;enumeration value="MISSING_RECORD"/&gt;
 *     &lt;enumeration value="MIXED_DML_OPERATION"/&gt;
 *     &lt;enumeration value="NONUNIQUE_SHIPPING_ADDRESS"/&gt;
 *     &lt;enumeration value="NO_ACCESS_TOKEN"/&gt;
 *     &lt;enumeration value="NO_ACCESS_TOKEN_FROM_REFRESH"/&gt;
 *     &lt;enumeration value="NO_APPLICABLE_PROCESS"/&gt;
 *     &lt;enumeration value="NO_ATTACHMENT_PERMISSION"/&gt;
 *     &lt;enumeration value="NO_AUTH_PROVIDER"/&gt;
 *     &lt;enumeration value="NO_INACTIVE_DIVISION_MEMBERS"/&gt;
 *     &lt;enumeration value="NO_MASS_MAIL_PERMISSION"/&gt;
 *     &lt;enumeration value="NO_PARTNER_PERMISSION"/&gt;
 *     &lt;enumeration value="NO_REFRESH_TOKEN"/&gt;
 *     &lt;enumeration value="NO_SUCH_USER_EXISTS"/&gt;
 *     &lt;enumeration value="NO_TOKEN_ENDPOINT"/&gt;
 *     &lt;enumeration value="NUMBER_OUTSIDE_VALID_RANGE"/&gt;
 *     &lt;enumeration value="NUM_HISTORY_FIELDS_BY_SOBJECT_EXCEEDED"/&gt;
 *     &lt;enumeration value="OPERATION_ENQUEUED"/&gt;
 *     &lt;enumeration value="OPTED_OUT_OF_MASS_MAIL"/&gt;
 *     &lt;enumeration value="OP_WITH_INVALID_USER_TYPE_EXCEPTION"/&gt;
 *     &lt;enumeration value="ORCHESTRATION_INVALID"/&gt;
 *     &lt;enumeration value="ORDER_MANAGEMENT_ACTION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ORDER_MANAGEMENT_RECORD_EXISTS"/&gt;
 *     &lt;enumeration value="ORDER_MANAGEMENT_RECORD_NOT_FOUND"/&gt;
 *     &lt;enumeration value="PACKAGE_DISABLED"/&gt;
 *     &lt;enumeration value="PACKAGE_LICENSE_REQUIRED"/&gt;
 *     &lt;enumeration value="PACKAGING_API_INSTALL_FAILED"/&gt;
 *     &lt;enumeration value="PACKAGING_API_UNINSTALL_FAILED"/&gt;
 *     &lt;enumeration value="PALI_INVALID_ACTION_ID"/&gt;
 *     &lt;enumeration value="PALI_INVALID_ACTION_NAME"/&gt;
 *     &lt;enumeration value="PALI_INVALID_ACTION_TYPE"/&gt;
 *     &lt;enumeration value="PAL_INVALID_ASSISTANT_RECOMMENDATION_TYPE_ID"/&gt;
 *     &lt;enumeration value="PAL_INVALID_ENTITY_ID"/&gt;
 *     &lt;enumeration value="PAL_INVALID_FLEXIPAGE_ID"/&gt;
 *     &lt;enumeration value="PAL_INVALID_LAYOUT_ID"/&gt;
 *     &lt;enumeration value="PAL_INVALID_PARAMETERS"/&gt;
 *     &lt;enumeration value="PAYLOAD_SIZE_EXCEEDED"/&gt;
 *     &lt;enumeration value="PA_API_EXCEPTION"/&gt;
 *     &lt;enumeration value="PA_AXIS_FAULT"/&gt;
 *     &lt;enumeration value="PA_INVALID_ID_EXCEPTION"/&gt;
 *     &lt;enumeration value="PA_NO_ACCESS_EXCEPTION"/&gt;
 *     &lt;enumeration value="PA_NO_DATA_FOUND_EXCEPTION"/&gt;
 *     &lt;enumeration value="PA_URI_SYNTAX_EXCEPTION"/&gt;
 *     &lt;enumeration value="PA_VISIBLE_ACTIONS_FILTER_ORDERING_EXCEPTION"/&gt;
 *     &lt;enumeration value="PLATFORM_EVENT_ENCRYPTION_ERROR"/&gt;
 *     &lt;enumeration value="PLATFORM_EVENT_PUBLISHING_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="PLATFORM_EVENT_PUBLISH_FAILED"/&gt;
 *     &lt;enumeration value="PORTAL_NO_ACCESS"/&gt;
 *     &lt;enumeration value="PORTAL_USER_ALREADY_EXISTS_FOR_CONTACT"/&gt;
 *     &lt;enumeration value="PORTAL_USER_CREATION_RESTRICTED_WITH_ENCRYPTION"/&gt;
 *     &lt;enumeration value="PRICE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="PRIVATE_CONTACT_ON_ASSET"/&gt;
 *     &lt;enumeration value="PROCESSING_HALTED"/&gt;
 *     &lt;enumeration value="QA_INVALID_CREATE_FEED_ITEM"/&gt;
 *     &lt;enumeration value="QA_INVALID_SUCCESS_MESSAGE"/&gt;
 *     &lt;enumeration value="QUERY_TIMEOUT"/&gt;
 *     &lt;enumeration value="QUICK_ACTION_LIST_ITEM_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="QUICK_ACTION_LIST_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="RECORD_IN_USE_BY_WORKFLOW"/&gt;
 *     &lt;enumeration value="RELATED_ENTITY_FILTER_VALIDATION_EXCEPTION"/&gt;
 *     &lt;enumeration value="REL_FIELD_BAD_ACCESSIBILITY"/&gt;
 *     &lt;enumeration value="REPUTATION_MINIMUM_NUMBER_NOT_REACHED"/&gt;
 *     &lt;enumeration value="REQUEST_RUNNING_TOO_LONG"/&gt;
 *     &lt;enumeration value="REQUIRED_FEATURE_MISSING"/&gt;
 *     &lt;enumeration value="REQUIRED_FIELD_MISSING"/&gt;
 *     &lt;enumeration value="REQUIRE_CONNECTED_APP_SCS"/&gt;
 *     &lt;enumeration value="REQUIRE_CONNECTED_APP_SESSION_SCS"/&gt;
 *     &lt;enumeration value="REQUIRE_RUNAS_USER"/&gt;
 *     &lt;enumeration value="RETRIEVE_EXCHANGE_ATTACHMENT_FAILED"/&gt;
 *     &lt;enumeration value="RETRIEVE_EXCHANGE_EMAIL_FAILED"/&gt;
 *     &lt;enumeration value="RETRIEVE_EXCHANGE_EVENT_FAILED"/&gt;
 *     &lt;enumeration value="RETRIEVE_GOOGLE_EMAIL_FAILED"/&gt;
 *     &lt;enumeration value="RETRIEVE_GOOGLE_EVENT_FAILED"/&gt;
 *     &lt;enumeration value="RETRIEVE_USER_CONFIG_ERROR"/&gt;
 *     &lt;enumeration value="SALESFORCE_INBOX_TRANSPORT_CONNECTION_ERROR"/&gt;
 *     &lt;enumeration value="SALESFORCE_INBOX_TRANSPORT_INVALID_INPUT_ERROR"/&gt;
 *     &lt;enumeration value="SALESFORCE_INBOX_TRANSPORT_TOKEN_ERROR"/&gt;
 *     &lt;enumeration value="SALESFORCE_INBOX_TRANSPORT_UNKNOWN_ERROR"/&gt;
 *     &lt;enumeration value="SELF_REFERENCE_FROM_FLOW"/&gt;
 *     &lt;enumeration value="SELF_REFERENCE_FROM_TRIGGER"/&gt;
 *     &lt;enumeration value="SHARE_NEEDED_FOR_CHILD_OWNER"/&gt;
 *     &lt;enumeration value="SINGLE_EMAIL_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="SOCIAL_ACCOUNT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="SOCIAL_ACTION_INVALID"/&gt;
 *     &lt;enumeration value="SOCIAL_PERSONA_NOT_FOUND"/&gt;
 *     &lt;enumeration value="SOCIAL_POST_INVALID"/&gt;
 *     &lt;enumeration value="SOCIAL_POST_NOT_FOUND"/&gt;
 *     &lt;enumeration value="STANDARD_PRICE_NOT_DEFINED"/&gt;
 *     &lt;enumeration value="STORAGE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="STRING_TOO_LONG"/&gt;
 *     &lt;enumeration value="SUBDOMAIN_IN_USE"/&gt;
 *     &lt;enumeration value="TABSET_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="TEMPLATE_NOT_ACTIVE"/&gt;
 *     &lt;enumeration value="TEMPLATE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="TERMS_OF_SERVICE_UNREAD"/&gt;
 *     &lt;enumeration value="TERRITORY_REALIGN_IN_PROGRESS"/&gt;
 *     &lt;enumeration value="TEXT_DATA_OUTSIDE_SUPPORTED_CHARSET"/&gt;
 *     &lt;enumeration value="TOO_MANY_APEX_REQUESTS"/&gt;
 *     &lt;enumeration value="TOO_MANY_ENUM_VALUE"/&gt;
 *     &lt;enumeration value="TOO_MANY_JOBS"/&gt;
 *     &lt;enumeration value="TOO_MANY_POSSIBLE_USERS_EXIST"/&gt;
 *     &lt;enumeration value="TRANSFER_REQUIRES_READ"/&gt;
 *     &lt;enumeration value="UNABLE_TO_LOCK_ROW"/&gt;
 *     &lt;enumeration value="UNAVAILABLE_RECORDTYPE_EXCEPTION"/&gt;
 *     &lt;enumeration value="UNAVAILABLE_REF"/&gt;
 *     &lt;enumeration value="UNDELETE_FAILED"/&gt;
 *     &lt;enumeration value="UNKNOWN_EXCEPTION"/&gt;
 *     &lt;enumeration value="UNKNOWN_TOKEN_ERROR"/&gt;
 *     &lt;enumeration value="UNSAFE_HTML_CONTENT"/&gt;
 *     &lt;enumeration value="UNSPECIFIED_EMAIL_ADDRESS"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_APEX_TRIGGER_OPERATON"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_SOCIAL_PROVIDER"/&gt;
 *     &lt;enumeration value="UNVERIFIED_SENDER_ADDRESS"/&gt;
 *     &lt;enumeration value="UPDATE_GOOGLE_EMAIL_LABEL_FAILED"/&gt;
 *     &lt;enumeration value="USER_OWNS_PORTAL_ACCOUNT_EXCEPTION"/&gt;
 *     &lt;enumeration value="USER_WITH_APEX_SHARES_EXCEPTION"/&gt;
 *     &lt;enumeration value="VF_COMPILE_ERROR"/&gt;
 *     &lt;enumeration value="WEBLINK_SIZE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="WEBLINK_URL_INVALID"/&gt;
 *     &lt;enumeration value="WRONG_CONTROLLER_TYPE"/&gt;
 *     &lt;enumeration value="XCLEAN_DJ_MATCH_IGNORABLE_ERROR"/&gt;
 *     &lt;enumeration value="XCLEAN_DJ_MATCH_INTERNAL_DJ_ERROR"/&gt;
 *     &lt;enumeration value="XCLEAN_DJ_MATCH_NON_RETRIABLE_ERROR"/&gt;
 *     &lt;enumeration value="XCLEAN_DJ_MATCH_RETRIABLE_ERROR"/&gt;
 *     &lt;enumeration value="XCLEAN_DJ_MATCH_UNKNOWN_ERROR"/&gt;
 *     &lt;enumeration value="XCLEAN_UNEXPECTED_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusCode")
@XmlEnum
public enum StatusCode {

    ALL_OR_NONE_OPERATION_ROLLED_BACK,
    ALREADY_IN_PROCESS,
    APEX_DATA_ACCESS_RESTRICTION,
    ASSIGNEE_TYPE_REQUIRED,
    AURA_COMPILE_ERROR,
    AUTH_PROVIDER_NEEDS_AUTH,
    AUTH_PROVIDER_NOT_FOUND,
    BAD_CUSTOM_ENTITY_PARENT_DOMAIN,
    BCC_NOT_ALLOWED_IF_BCC_COMPLIANCE_ENABLED,
    CANNOT_CASCADE_PRODUCT_ACTIVE,
    CANNOT_CHANGE_FIELD_TYPE_OF_APEX_REFERENCED_FIELD,
    CANNOT_CHANGE_FIELD_TYPE_OF_REFERENCED_FIELD,
    CANNOT_CREATE_ANOTHER_MANAGED_PACKAGE,
    CANNOT_DEACTIVATE_DIVISION,
    CANNOT_DELETE_GLOBAL_ACTION_LIST,
    CANNOT_DELETE_LAST_DATED_CONVERSION_RATE,
    CANNOT_DELETE_MANAGED_OBJECT,
    CANNOT_DISABLE_LAST_ADMIN,
    CANNOT_ENABLE_IP_RESTRICT_REQUESTS,
    CANNOT_EXECUTE_FLOW_TRIGGER,
    CANNOT_FREEZE_SELF,
    CANNOT_INSERT_UPDATE_ACTIVATE_ENTITY,
    CANNOT_MODIFY_MANAGED_OBJECT,
    CANNOT_PASSWORD_LOCKOUT,
    CANNOT_POST_TO_ARCHIVED_GROUP,
    CANNOT_RENAME_APEX_REFERENCED_FIELD,
    CANNOT_RENAME_APEX_REFERENCED_OBJECT,
    CANNOT_RENAME_REFERENCED_FIELD,
    CANNOT_RENAME_REFERENCED_OBJECT,
    CANNOT_REPARENT_RECORD,
    CANNOT_UPDATE_CONVERTED_LEAD,
    CANT_DISABLE_CORP_CURRENCY,
    CANT_UNSET_CORP_CURRENCY,
    CHILD_SHARE_FAILS_PARENT,
    CIRCULAR_DEPENDENCY,
    CLEAN_SERVICE_ERROR,
    CLONE_FIELD_INTEGRITY_EXCEPTION,
    CLONE_NOT_SUPPORTED,
    COLLISION_DETECTED,
    COMMERCIAL_CONTROL_ERROR,
    COMMUNITY_NOT_ACCESSIBLE,
    CONFLICTING_ENVIRONMENT_HUB_MEMBER,
    CONFLICTING_SSO_USER_MAPPING,
    CONTENT_TYPE_NOT_FOUND,
    CUSTOM_APEX_ERROR,
    CUSTOM_CLOB_FIELD_LIMIT_EXCEEDED,
    CUSTOM_ENTITY_OR_FIELD_LIMIT,
    CUSTOM_FIELD_INDEX_LIMIT_EXCEEDED,
    CUSTOM_INDEX_EXISTS,
    CUSTOM_LINK_LIMIT_EXCEEDED,
    CUSTOM_METADATA_LIMIT_EXCEEDED,
    CUSTOM_METADATA_REL_FIELD_MANAGEABILITY,
    CUSTOM_SETTINGS_LIMIT_EXCEEDED,
    CUSTOM_TAB_LIMIT_EXCEEDED,
    DATAASSESSMENT_CONFIG_ASSESSMENT_IN_PROGRESS_ERROR,
    DATAASSESSMENT_CONFIG_SERVICE_ERROR,
    DATACLOUDADDRESS_NO_RECORDS_FOUND,
    DATACLOUDADDRESS_PROCESSING_ERROR,
    DATACLOUDADDRESS_SERVER_ERROR,
    DELETE_FAILED,
    DELETE_NOT_ALLOWED,
    DELETE_OPERATION_TOO_LARGE,
    DELETE_REQUIRED_ON_CASCADE,
    DEPENDENCY_EXISTS,
    DUPLICATES_DETECTED,
    DUPLICATE_CASE_SOLUTION,
    DUPLICATE_COMM_NICKNAME,
    DUPLICATE_CUSTOM_ENTITY_DEFINITION,
    DUPLICATE_CUSTOM_TAB_MOTIF,
    DUPLICATE_DEVELOPER_NAME,
    DUPLICATE_EXTERNAL_ID,
    DUPLICATE_MASTER_LABEL,
    DUPLICATE_SENDER_DISPLAY_NAME,
    DUPLICATE_USERNAME,
    DUPLICATE_VALUE,
    EMAIL_ADDRESS_BOUNCED,
    EMAIL_EXTERNAL_TRANSPORT_CONNECTION_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_PERMISSION_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_TOKEN_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_TOO_MANY_REQUESTS_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_UNKNOWN_ERROR,
    EMAIL_NOT_PROCESSED_DUE_TO_PRIOR_ERROR,
    EMAIL_OPTED_OUT,
    EMAIL_TEMPLATE_FORMULA_ERROR,
    EMAIL_TEMPLATE_MERGEFIELD_ACCESS_ERROR,
    EMAIL_TEMPLATE_MERGEFIELD_ERROR,
    EMAIL_TEMPLATE_MERGEFIELD_VALUE_ERROR,
    EMAIL_TEMPLATE_PROCESSING_ERROR,
    EMPTY_SCONTROL_FILE_NAME,
    ENHANCED_EMAIL_TEMPLATE_COMPILATION_ERROR,
    ENTITY_FAILED_IFLASTMODIFIED_ON_UPDATE,
    ENTITY_IS_ARCHIVED,
    ENTITY_IS_DELETED,
    ENTITY_IS_LOCKED,
    ENTITY_SAVE_ERROR,
    ENTITY_SAVE_VALIDATION_ERROR,
    ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT,
    ENVIRONMENT_HUB_MEMBERSHIP_ERROR_JOINING_HUB,
    ENVIRONMENT_HUB_MEMBERSHIP_USER_ALREADY_IN_HUB,
    ENVIRONMENT_HUB_MEMBERSHIP_USER_NOT_ORG_ADMIN,
    ERROR_IN_MAILER,
    EXCEEDED_MAX_SEMIJOIN_SUBSELECTS_WRITE,
    EXCHANGE_WEB_SERVICES_URL_INVALID,
    EXTERNAL_RESOURCE_FORBIDDEN,
    FAILED_ACTIVATION,
    FIELD_CUSTOM_VALIDATION_EXCEPTION,
    FIELD_FILTER_VALIDATION_EXCEPTION,
    FIELD_INTEGRITY_EXCEPTION,
    FIELD_KEYWORD_LIST_MATCH_LIMIT,
    FIELD_MAPPING_ERROR,
    FIELD_MODERATION_RULE_BLOCK,
    FIELD_NOT_UPDATABLE,
    FILE_EXTENSION_NOT_ALLOWED,
    FILE_SIZE_LIMIT_EXCEEDED,
    FILTERED_LOOKUP_LIMIT_EXCEEDED,
    FIND_DUPLICATES_ERROR,
    FLOW_EXCEPTION,
    FUNCTIONALITY_NOT_ENABLED,
    HAS_PUBLIC_REFERENCES,
    HTML_FILE_UPLOAD_NOT_ALLOWED,
    IMAGE_TOO_LARGE,
    INACTIVE_OWNER_OR_USER,
    INACTIVE_RULE_ERROR,
    INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE,
    INSUFFICIENT_ACCESS_ON_CROSS_REFERENCE_ENTITY,
    INSUFFICIENT_ACCESS_OR_READONLY,
    INSUFFICIENT_ACCESS_TO_INSIGHTSEXTERNALDATA,
    INSUFFICIENT_CREDITS,
    INTERNAL_ERROR,
    INVALID_ACCESS_LEVEL,
    INVALID_ACCESS_TOKEN,
    INVALID_API_INPUT,
    INVALID_ARGUMENT_TYPE,
    INVALID_ASSIGNEE_TYPE,
    INVALID_ASSIGNMENT_RULE,
    INVALID_AUTH_HEADER,
    INVALID_BATCH_OPERATION,
    INVALID_CONTENT_TYPE,
    INVALID_CREDIT_CARD_INFO,
    INVALID_CROSS_REFERENCE_KEY,
    INVALID_CROSS_REFERENCE_TYPE_FOR_FIELD,
    INVALID_CURRENCY_CONV_RATE,
    INVALID_CURRENCY_CORP_RATE,
    INVALID_CURRENCY_ISO,
    INVALID_DATASET_REFERENCE_INPUT,
    INVALID_DATA_CATEGORY_GROUP_REFERENCE,
    INVALID_DATA_URI,
    INVALID_EMAIL_ADDRESS,
    INVALID_EMPTY_KEY_OWNER,
    INVALID_ENTITY_FOR_MATCH_ENGINE_ERROR,
    INVALID_ENTITY_FOR_MATCH_OPERATION_ERROR,
    INVALID_ENTITY_FOR_UPSERT,
    INVALID_ENVIRONMENT_HUB_MEMBER,
    INVALID_EVENT_DELIVERY,
    INVALID_EVENT_INPUT,
    INVALID_EVENT_SUBSCRIPTION,
    INVALID_EXTENSION_ID,
    INVALID_FIELD,
    INVALID_FIELD_FOR_INSERT_UPDATE,
    INVALID_FIELD_WHEN_USING_TEMPLATE,
    INVALID_FILTER_ACTION,
    INVALID_GOOGLE_DOCS_URL,
    INVALID_ID_FIELD,
    INVALID_INET_ADDRESS,
    INVALID_INPUT,
    INVALID_INPUT_FORMAT,
    INVALID_KEY_FIELD_INPUT,
    INVALID_LINEITEM_CLONE_STATE,
    INVALID_MARKUP,
    INVALID_MASTER_OR_TRANSLATED_SOLUTION,
    INVALID_MESSAGE_ID_REFERENCE,
    INVALID_NAMESPACE_PREFIX,
    INVALID_OAUTH_URL,
    INVALID_OPERATION,
    INVALID_OPERATOR,
    INVALID_OR_NULL_FOR_RESTRICTED_PICKLIST,
    INVALID_OWNER,
    INVALID_PACKAGE_LICENSE,
    INVALID_PACKAGE_VERSION,
    INVALID_PARTNER_NETWORK_STATUS,
    INVALID_PAYLOAD_VERSION,
    INVALID_PERSON_ACCOUNT_OPERATION,
    INVALID_PROVIDER_TYPE,
    INVALID_QUERY_KEY,
    INVALID_QUERY_LOCATOR,
    INVALID_QUERY_VALUE,
    INVALID_READ_ONLY_USER_DML,
    INVALID_REFRESH_TOKEN,
    INVALID_REQUEST_STATE,
    INVALID_RUNTIME_VALUE,
    INVALID_SAVE_AS_ACTIVITY_FLAG,
    INVALID_SCS_INBOUND_USER,
    INVALID_SESSION_ID,
    INVALID_SETUP_OWNER,
    INVALID_SIGNUP_COUNTRY,
    INVALID_SIGNUP_OPTION,
    INVALID_SITE_DELETE_EXCEPTION,
    INVALID_SITE_FILE_IMPORTED_EXCEPTION,
    INVALID_SITE_FILE_TYPE_EXCEPTION,
    INVALID_STATUS,
    INVALID_SUBDOMAIN,
    INVALID_TEXT_REPRESENTATION,
    INVALID_TYPE,
    INVALID_TYPE_FOR_OPERATION,
    INVALID_TYPE_ON_FIELD_IN_RECORD,
    INVALID_USERID,
    IP_RANGE_LIMIT_EXCEEDED,
    ITEM_NOT_FOUND,
    JIGSAW_IMPORT_LIMIT_EXCEEDED,
    LICENSE_LIMIT_EXCEEDED,
    LIGHT_PORTAL_USER_EXCEPTION,
    LIMIT_EXCEEDED,
    LIST_PRICE_NOT_FOUND,
    MALFORMED_ID,
    MANAGER_NOT_DEFINED,
    MASSMAIL_RETRY_LIMIT_EXCEEDED,
    MASS_MAIL_LIMIT_EXCEEDED,
    MATCH_DEFINITION_ERROR,
    MATCH_OPERATION_ERROR,
    MATCH_OPERATION_INVALID_ENGINE_ERROR,
    MATCH_OPERATION_INVALID_RULE_ERROR,
    MATCH_OPERATION_MISSING_ENGINE_ERROR,
    MATCH_OPERATION_MISSING_OBJECT_TYPE_ERROR,
    MATCH_OPERATION_MISSING_OPTIONS_ERROR,
    MATCH_OPERATION_MISSING_RULE_ERROR,
    MATCH_OPERATION_UNKNOWN_RULE_ERROR,
    MATCH_OPERATION_UNSUPPORTED_VERSION_ERROR,
    MATCH_PRECONDITION_FAILED,
    MATCH_RUNTIME_ERROR,
    MATCH_SERVICE_ERROR,
    MATCH_SERVICE_TIMED_OUT,
    MATCH_SERVICE_UNAVAILABLE_ERROR,
    MAXIMUM_CCEMAILS_EXCEEDED,
    MAXIMUM_DASHBOARD_COMPONENTS_EXCEEDED,
    MAXIMUM_HIERARCHY_CHILDREN_REACHED,
    MAXIMUM_HIERARCHY_LEVELS_REACHED,
    MAXIMUM_HIERARCHY_TREE_SIZE_REACHED,
    MAXIMUM_SIZE_OF_ATTACHMENT,
    MAXIMUM_SIZE_OF_DOCUMENT,
    MAX_ACTIONS_PER_RULE_EXCEEDED,
    MAX_ACTIVE_RULES_EXCEEDED,
    MAX_APPROVAL_STEPS_EXCEEDED,
    MAX_DEPTH_IN_FLOW_EXECUTION,
    MAX_FORMULAS_PER_RULE_EXCEEDED,
    MAX_LIMIT_EXCEEDED,
    MAX_RULES_EXCEEDED,
    MAX_RULE_ENTRIES_EXCEEDED,
    MAX_TASK_DESCRIPTION_EXCEEEDED,
    MAX_TM_RULES_EXCEEDED,
    MAX_TM_RULE_ITEMS_EXCEEDED,
    MAX_TRIGGERS_EXCEEDED,
    MERGE_FAILED,
    METADATA_FIELD_UPDATE_ERROR,
    MISSING_ARGUMENT,
    MISSING_RECORD,
    MIXED_DML_OPERATION,
    NONUNIQUE_SHIPPING_ADDRESS,
    NO_ACCESS_TOKEN,
    NO_ACCESS_TOKEN_FROM_REFRESH,
    NO_APPLICABLE_PROCESS,
    NO_ATTACHMENT_PERMISSION,
    NO_AUTH_PROVIDER,
    NO_INACTIVE_DIVISION_MEMBERS,
    NO_MASS_MAIL_PERMISSION,
    NO_PARTNER_PERMISSION,
    NO_REFRESH_TOKEN,
    NO_SUCH_USER_EXISTS,
    NO_TOKEN_ENDPOINT,
    NUMBER_OUTSIDE_VALID_RANGE,
    NUM_HISTORY_FIELDS_BY_SOBJECT_EXCEEDED,
    OPERATION_ENQUEUED,
    OPTED_OUT_OF_MASS_MAIL,
    OP_WITH_INVALID_USER_TYPE_EXCEPTION,
    ORCHESTRATION_INVALID,
    ORDER_MANAGEMENT_ACTION_NOT_ALLOWED,
    ORDER_MANAGEMENT_RECORD_EXISTS,
    ORDER_MANAGEMENT_RECORD_NOT_FOUND,
    PACKAGE_DISABLED,
    PACKAGE_LICENSE_REQUIRED,
    PACKAGING_API_INSTALL_FAILED,
    PACKAGING_API_UNINSTALL_FAILED,
    PALI_INVALID_ACTION_ID,
    PALI_INVALID_ACTION_NAME,
    PALI_INVALID_ACTION_TYPE,
    PAL_INVALID_ASSISTANT_RECOMMENDATION_TYPE_ID,
    PAL_INVALID_ENTITY_ID,
    PAL_INVALID_FLEXIPAGE_ID,
    PAL_INVALID_LAYOUT_ID,
    PAL_INVALID_PARAMETERS,
    PAYLOAD_SIZE_EXCEEDED,
    PA_API_EXCEPTION,
    PA_AXIS_FAULT,
    PA_INVALID_ID_EXCEPTION,
    PA_NO_ACCESS_EXCEPTION,
    PA_NO_DATA_FOUND_EXCEPTION,
    PA_URI_SYNTAX_EXCEPTION,
    PA_VISIBLE_ACTIONS_FILTER_ORDERING_EXCEPTION,
    PLATFORM_EVENT_ENCRYPTION_ERROR,
    PLATFORM_EVENT_PUBLISHING_UNAVAILABLE,
    PLATFORM_EVENT_PUBLISH_FAILED,
    PORTAL_NO_ACCESS,
    PORTAL_USER_ALREADY_EXISTS_FOR_CONTACT,
    PORTAL_USER_CREATION_RESTRICTED_WITH_ENCRYPTION,
    PRICE_NOT_FOUND,
    PRIVATE_CONTACT_ON_ASSET,
    PROCESSING_HALTED,
    QA_INVALID_CREATE_FEED_ITEM,
    QA_INVALID_SUCCESS_MESSAGE,
    QUERY_TIMEOUT,
    QUICK_ACTION_LIST_ITEM_NOT_ALLOWED,
    QUICK_ACTION_LIST_NOT_ALLOWED,
    RECORD_IN_USE_BY_WORKFLOW,
    RELATED_ENTITY_FILTER_VALIDATION_EXCEPTION,
    REL_FIELD_BAD_ACCESSIBILITY,
    REPUTATION_MINIMUM_NUMBER_NOT_REACHED,
    REQUEST_RUNNING_TOO_LONG,
    REQUIRED_FEATURE_MISSING,
    REQUIRED_FIELD_MISSING,
    REQUIRE_CONNECTED_APP_SCS,
    REQUIRE_CONNECTED_APP_SESSION_SCS,
    REQUIRE_RUNAS_USER,
    RETRIEVE_EXCHANGE_ATTACHMENT_FAILED,
    RETRIEVE_EXCHANGE_EMAIL_FAILED,
    RETRIEVE_EXCHANGE_EVENT_FAILED,
    RETRIEVE_GOOGLE_EMAIL_FAILED,
    RETRIEVE_GOOGLE_EVENT_FAILED,
    RETRIEVE_USER_CONFIG_ERROR,
    SALESFORCE_INBOX_TRANSPORT_CONNECTION_ERROR,
    SALESFORCE_INBOX_TRANSPORT_INVALID_INPUT_ERROR,
    SALESFORCE_INBOX_TRANSPORT_TOKEN_ERROR,
    SALESFORCE_INBOX_TRANSPORT_UNKNOWN_ERROR,
    SELF_REFERENCE_FROM_FLOW,
    SELF_REFERENCE_FROM_TRIGGER,
    SHARE_NEEDED_FOR_CHILD_OWNER,
    SINGLE_EMAIL_LIMIT_EXCEEDED,
    SOCIAL_ACCOUNT_NOT_FOUND,
    SOCIAL_ACTION_INVALID,
    SOCIAL_PERSONA_NOT_FOUND,
    SOCIAL_POST_INVALID,
    SOCIAL_POST_NOT_FOUND,
    STANDARD_PRICE_NOT_DEFINED,
    STORAGE_LIMIT_EXCEEDED,
    STRING_TOO_LONG,
    SUBDOMAIN_IN_USE,
    TABSET_LIMIT_EXCEEDED,
    TEMPLATE_NOT_ACTIVE,
    TEMPLATE_NOT_FOUND,
    TERMS_OF_SERVICE_UNREAD,
    TERRITORY_REALIGN_IN_PROGRESS,
    TEXT_DATA_OUTSIDE_SUPPORTED_CHARSET,
    TOO_MANY_APEX_REQUESTS,
    TOO_MANY_ENUM_VALUE,
    TOO_MANY_JOBS,
    TOO_MANY_POSSIBLE_USERS_EXIST,
    TRANSFER_REQUIRES_READ,
    UNABLE_TO_LOCK_ROW,
    UNAVAILABLE_RECORDTYPE_EXCEPTION,
    UNAVAILABLE_REF,
    UNDELETE_FAILED,
    UNKNOWN_EXCEPTION,
    UNKNOWN_TOKEN_ERROR,
    UNSAFE_HTML_CONTENT,
    UNSPECIFIED_EMAIL_ADDRESS,
    UNSUPPORTED_APEX_TRIGGER_OPERATON,
    UNSUPPORTED_SOCIAL_PROVIDER,
    UNVERIFIED_SENDER_ADDRESS,
    UPDATE_GOOGLE_EMAIL_LABEL_FAILED,
    USER_OWNS_PORTAL_ACCOUNT_EXCEPTION,
    USER_WITH_APEX_SHARES_EXCEPTION,
    VF_COMPILE_ERROR,
    WEBLINK_SIZE_LIMIT_EXCEEDED,
    WEBLINK_URL_INVALID,
    WRONG_CONTROLLER_TYPE,
    XCLEAN_DJ_MATCH_IGNORABLE_ERROR,
    XCLEAN_DJ_MATCH_INTERNAL_DJ_ERROR,
    XCLEAN_DJ_MATCH_NON_RETRIABLE_ERROR,
    XCLEAN_DJ_MATCH_RETRIABLE_ERROR,
    XCLEAN_DJ_MATCH_UNKNOWN_ERROR,
    XCLEAN_UNEXPECTED_ERROR;

    public String value() {
        return name();
    }

    public static StatusCode fromValue(String v) {
        return valueOf(v);
    }

}
