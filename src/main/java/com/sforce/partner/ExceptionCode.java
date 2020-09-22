
package com.sforce.partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APEX_REST_SERVICES_DISABLED"/&gt;
 *     &lt;enumeration value="APEX_TRIGGER_COUPLING_LIMIT"/&gt;
 *     &lt;enumeration value="API_CURRENTLY_DISABLED"/&gt;
 *     &lt;enumeration value="API_DISABLED_FOR_ORG"/&gt;
 *     &lt;enumeration value="ARGUMENT_OBJECT_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="ASYNC_OPERATION_LOCATOR"/&gt;
 *     &lt;enumeration value="ASYNC_QUERY_UNSUPPORTED_QUERY"/&gt;
 *     &lt;enumeration value="BATCH_PROCESSING_HALTED"/&gt;
 *     &lt;enumeration value="BIG_OBJECT_UNSUPPORTED_OPERATION"/&gt;
 *     &lt;enumeration value="CANNOT_DELETE_ENTITY"/&gt;
 *     &lt;enumeration value="CANNOT_DELETE_OWNER"/&gt;
 *     &lt;enumeration value="CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY"/&gt;
 *     &lt;enumeration value="CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY"/&gt;
 *     &lt;enumeration value="CATEGORY_NOT_FOUND"/&gt;
 *     &lt;enumeration value="CIRCULAR_OBJECT_GRAPH"/&gt;
 *     &lt;enumeration value="CLIENT_NOT_ACCESSIBLE_FOR_USER"/&gt;
 *     &lt;enumeration value="CLIENT_REQUIRE_UPDATE_FOR_USER"/&gt;
 *     &lt;enumeration value="CLONE_FIELD_INTEGRITY_EXCEPTION"/&gt;
 *     &lt;enumeration value="CLONE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="CONTENT_ALREADY_AN_ASSET_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_CUSTOM_DOWNLOAD_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_AUTHENTICATION_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_FILE_HAS_NO_URL_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_INVALID_PAYLOAD"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_SECURITY_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_TIMEOUT_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_HUB_UNEXPECTED_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_IMAGE_SCALING_INVALID_ARGUMENTS_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_IMAGE_SCALING_INVALID_IMAGE_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_IMAGE_SCALING_MAX_RENDITIONS_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_IMAGE_SCALING_TIMEOUT_EXCEPTION"/&gt;
 *     &lt;enumeration value="CONTENT_IMAGE_SCALING_UNKNOWN_EXCEPTION"/&gt;
 *     &lt;enumeration value="CUSTOM_METADATA_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="CUSTOM_SETTINGS_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="DATACLOUD_API_CLIENT_EXCEPTION"/&gt;
 *     &lt;enumeration value="DATACLOUD_API_DISABLED_EXCEPTION"/&gt;
 *     &lt;enumeration value="DATACLOUD_API_INVALID_QUERY_EXCEPTION"/&gt;
 *     &lt;enumeration value="DATACLOUD_API_SERVER_BUSY_EXCEPTION"/&gt;
 *     &lt;enumeration value="DATACLOUD_API_SERVER_EXCEPTION"/&gt;
 *     &lt;enumeration value="DATACLOUD_API_TIMEOUT_EXCEPTION"/&gt;
 *     &lt;enumeration value="DATACLOUD_API_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="DATA_INTEGRATION_INPUT_ERROR"/&gt;
 *     &lt;enumeration value="DATA_INTEGRATION_NOT_FOUND"/&gt;
 *     &lt;enumeration value="DATA_INTEGRATION_NO_ACCESS"/&gt;
 *     &lt;enumeration value="DATA_INTEGRATION_PACKAGE_ERROR"/&gt;
 *     &lt;enumeration value="DATA_INTEGRATION_SERVER_ERROR"/&gt;
 *     &lt;enumeration value="DATA_INTEGRATION_VENDOR_SETUP_ERROR"/&gt;
 *     &lt;enumeration value="DEPENDENCY_API_UNSUPPORTED_EXCEPTION"/&gt;
 *     &lt;enumeration value="DUPLICATE_ARGUMENT_VALUE"/&gt;
 *     &lt;enumeration value="DUPLICATE_VALUE"/&gt;
 *     &lt;enumeration value="EMAIL_BATCH_SIZE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="EMAIL_TO_CASE_INVALID_ROUTING"/&gt;
 *     &lt;enumeration value="EMAIL_TO_CASE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="EMAIL_TO_CASE_NOT_ENABLED"/&gt;
 *     &lt;enumeration value="ENTITY_NOT_QUERYABLE"/&gt;
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT"/&gt;
 *     &lt;enumeration value="EXCEEDED_ID_LIMIT"/&gt;
 *     &lt;enumeration value="EXCEEDED_LEAD_CONVERT_LIMIT"/&gt;
 *     &lt;enumeration value="EXCEEDED_MAX_FILTER_ENTITIES"/&gt;
 *     &lt;enumeration value="EXCEEDED_MAX_SEMIJOIN_SUBSELECTS"/&gt;
 *     &lt;enumeration value="EXCEEDED_MAX_SIZE_REQUEST"/&gt;
 *     &lt;enumeration value="EXCEEDED_MAX_SOBJECTS"/&gt;
 *     &lt;enumeration value="EXCEEDED_MAX_TYPES_LIMIT"/&gt;
 *     &lt;enumeration value="EXCEEDED_QUOTA"/&gt;
 *     &lt;enumeration value="EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_OBJECT_CONNECTION_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_OBJECT_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_SERVICE_AUTHENTICATION_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_SERVICE_CONNECTION_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_SERVICE_DATA_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_SERVICE_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_SERVICE_INVALID_STATE_EXCEPTION"/&gt;
 *     &lt;enumeration value="EXTERNAL_SERVICE_UNSUPPORTED_EXCEPTION"/&gt;
 *     &lt;enumeration value="FEDERATED_SEARCH_ERROR"/&gt;
 *     &lt;enumeration value="FEED_NOT_ENABLED_FOR_OBJECT"/&gt;
 *     &lt;enumeration value="FUNCTIONALITY_NOT_ENABLED"/&gt;
 *     &lt;enumeration value="FUNCTIONALITY_TEMPORARILY_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="GMAIL_ROUTING_CREATION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ID_REQUIRED"/&gt;
 *     &lt;enumeration value="ILLEGAL_QUERY_PARAMETER_VALUE"/&gt;
 *     &lt;enumeration value="INACTIVE_OWNER_OR_USER"/&gt;
 *     &lt;enumeration value="INACTIVE_PORTAL"/&gt;
 *     &lt;enumeration value="INDEX_NOT_FOUND"/&gt;
 *     &lt;enumeration value="INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE"/&gt;
 *     &lt;enumeration value="INSTALL_KEY_INVALID"/&gt;
 *     &lt;enumeration value="INSTALL_KEY_REQUIRED"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_ACCESS"/&gt;
 *     &lt;enumeration value="INSUFFICIENT_ACCESS_APEX_METADATA_DEPLOY"/&gt;
 *     &lt;enumeration value="INTERNAL_CANVAS_ERROR"/&gt;
 *     &lt;enumeration value="INVALID_ASSIGNMENT_RULE"/&gt;
 *     &lt;enumeration value="INVALID_AUTH_HEADER"/&gt;
 *     &lt;enumeration value="INVALID_BATCH_REQUEST"/&gt;
 *     &lt;enumeration value="INVALID_BATCH_SIZE"/&gt;
 *     &lt;enumeration value="INVALID_CLIENT"/&gt;
 *     &lt;enumeration value="INVALID_CROSS_REFERENCE_KEY"/&gt;
 *     &lt;enumeration value="INVALID_DATE_FORMAT"/&gt;
 *     &lt;enumeration value="INVALID_FIELD"/&gt;
 *     &lt;enumeration value="INVALID_FILTER_LANGUAGE"/&gt;
 *     &lt;enumeration value="INVALID_FILTER_VALUE"/&gt;
 *     &lt;enumeration value="INVALID_ID_FIELD"/&gt;
 *     &lt;enumeration value="INVALID_INPUT_COMBINATION"/&gt;
 *     &lt;enumeration value="INVALID_LOCALE_LANGUAGE"/&gt;
 *     &lt;enumeration value="INVALID_LOCATOR"/&gt;
 *     &lt;enumeration value="INVALID_LOGIN"/&gt;
 *     &lt;enumeration value="INVALID_MULTIPART_REQUEST"/&gt;
 *     &lt;enumeration value="INVALID_NEW_PASSWORD"/&gt;
 *     &lt;enumeration value="INVALID_OLD_PASSWORD"/&gt;
 *     &lt;enumeration value="INVALID_OPERATION"/&gt;
 *     &lt;enumeration value="INVALID_OPERATION_WITH_EXPIRED_PASSWORD"/&gt;
 *     &lt;enumeration value="INVALID_PACKAGE_VERSION"/&gt;
 *     &lt;enumeration value="INVALID_PAGING_OPTION"/&gt;
 *     &lt;enumeration value="INVALID_QUERY_FILTER_OPERATOR"/&gt;
 *     &lt;enumeration value="INVALID_QUERY_KEY"/&gt;
 *     &lt;enumeration value="INVALID_QUERY_LOCATOR"/&gt;
 *     &lt;enumeration value="INVALID_QUERY_SCOPE"/&gt;
 *     &lt;enumeration value="INVALID_QUERY_VALUE"/&gt;
 *     &lt;enumeration value="INVALID_REPLICATION_DATE"/&gt;
 *     &lt;enumeration value="INVALID_SEARCH"/&gt;
 *     &lt;enumeration value="INVALID_SEARCH_SCOPE"/&gt;
 *     &lt;enumeration value="INVALID_SESSION_ID"/&gt;
 *     &lt;enumeration value="INVALID_SOAP_HEADER"/&gt;
 *     &lt;enumeration value="INVALID_SORT_OPTION"/&gt;
 *     &lt;enumeration value="INVALID_SSO_GATEWAY_URL"/&gt;
 *     &lt;enumeration value="INVALID_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_TYPE_FOR_OPERATION"/&gt;
 *     &lt;enumeration value="JIGSAW_ACTION_DISABLED"/&gt;
 *     &lt;enumeration value="JIGSAW_IMPORT_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="JIGSAW_REQUEST_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="JSON_PARSER_ERROR"/&gt;
 *     &lt;enumeration value="KEY_HAS_BEEN_DESTROYED"/&gt;
 *     &lt;enumeration value="LICENSING_DATA_ERROR"/&gt;
 *     &lt;enumeration value="LICENSING_UNKNOWN_ERROR"/&gt;
 *     &lt;enumeration value="LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="LOGIN_CHALLENGE_ISSUED"/&gt;
 *     &lt;enumeration value="LOGIN_CHALLENGE_PENDING"/&gt;
 *     &lt;enumeration value="LOGIN_DURING_RESTRICTED_DOMAIN"/&gt;
 *     &lt;enumeration value="LOGIN_DURING_RESTRICTED_TIME"/&gt;
 *     &lt;enumeration value="LOGIN_MUST_USE_SECURITY_TOKEN"/&gt;
 *     &lt;enumeration value="MALFORMED_ID"/&gt;
 *     &lt;enumeration value="MALFORMED_QUERY"/&gt;
 *     &lt;enumeration value="MALFORMED_SEARCH"/&gt;
 *     &lt;enumeration value="MISMATCHING_VERSIONS"/&gt;
 *     &lt;enumeration value="MISSING_ARGUMENT"/&gt;
 *     &lt;enumeration value="MISSING_RECORD"/&gt;
 *     &lt;enumeration value="MODIFIED"/&gt;
 *     &lt;enumeration value="MULTIPLE_RECORDS_FOUND"/&gt;
 *     &lt;enumeration value="MUTUAL_AUTHENTICATION_FAILED"/&gt;
 *     &lt;enumeration value="NOT_ACCEPTABLE"/&gt;
 *     &lt;enumeration value="NOT_MODIFIED"/&gt;
 *     &lt;enumeration value="NO_ACTIVE_DUPLICATE_RULE"/&gt;
 *     &lt;enumeration value="NO_RECIPIENTS"/&gt;
 *     &lt;enumeration value="NO_SOFTPHONE_LAYOUT"/&gt;
 *     &lt;enumeration value="NUMBER_OUTSIDE_VALID_RANGE"/&gt;
 *     &lt;enumeration value="OPERATION_TOO_LARGE"/&gt;
 *     &lt;enumeration value="ORDER_MANAGEMENT_ACTION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ORG_IN_MAINTENANCE"/&gt;
 *     &lt;enumeration value="ORG_IS_DOT_ORG"/&gt;
 *     &lt;enumeration value="ORG_IS_SIGNING_UP"/&gt;
 *     &lt;enumeration value="ORG_LOCKED"/&gt;
 *     &lt;enumeration value="ORG_NOT_OWNED_BY_INSTANCE"/&gt;
 *     &lt;enumeration value="PASSWORD_LOCKOUT"/&gt;
 *     &lt;enumeration value="PORTAL_NO_ACCESS"/&gt;
 *     &lt;enumeration value="POST_BODY_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="PRODUCT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="QAT_HETEROGENOUS_CONTEXT_IDS"/&gt;
 *     &lt;enumeration value="QAT_INVALID_CONTEXT_ID"/&gt;
 *     &lt;enumeration value="QAT_INVALID_QUICK_ACTION"/&gt;
 *     &lt;enumeration value="QUERY_TIMEOUT"/&gt;
 *     &lt;enumeration value="QUERY_TOO_COMPLICATED"/&gt;
 *     &lt;enumeration value="REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT"/&gt;
 *     &lt;enumeration value="RECORD_NOT_FOUND"/&gt;
 *     &lt;enumeration value="REPORT_EXPORT_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="REQUEST_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="REQUEST_RUNNING_TOO_LONG"/&gt;
 *     &lt;enumeration value="SERVER_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="SERVICE_DESK_NOT_ENABLED"/&gt;
 *     &lt;enumeration value="SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION"/&gt;
 *     &lt;enumeration value="SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION"/&gt;
 *     &lt;enumeration value="SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="SSO_SERVICE_DOWN"/&gt;
 *     &lt;enumeration value="SST_ADMIN_FILE_DOWNLOAD_EXCEPTION"/&gt;
 *     &lt;enumeration value="STATE_TRANSITION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="TOO_MANY_APEX_REQUESTS"/&gt;
 *     &lt;enumeration value="TOO_MANY_JOBS"/&gt;
 *     &lt;enumeration value="TOO_MANY_RECIPIENTS"/&gt;
 *     &lt;enumeration value="TOO_MANY_RECORDS"/&gt;
 *     &lt;enumeration value="TRIAL_EXPIRED"/&gt;
 *     &lt;enumeration value="TXN_SECURITY_APEX_ERROR"/&gt;
 *     &lt;enumeration value="TXN_SECURITY_END_A_SESSION"/&gt;
 *     &lt;enumeration value="TXN_SECURITY_FAIL_CLOSE"/&gt;
 *     &lt;enumeration value="TXN_SECURITY_METERING_ERROR"/&gt;
 *     &lt;enumeration value="TXN_SECURITY_NO_ACCESS"/&gt;
 *     &lt;enumeration value="TXN_SECURITY_RUNTIME_ERROR"/&gt;
 *     &lt;enumeration value="TXN_SECURITY_TWO_FA_REQUIRED"/&gt;
 *     &lt;enumeration value="UNABLE_TO_LOCK_ROW"/&gt;
 *     &lt;enumeration value="UNKNOWN_ATTACHMENT_EXCEPTION"/&gt;
 *     &lt;enumeration value="UNKNOWN_EXCEPTION"/&gt;
 *     &lt;enumeration value="UNKNOWN_ORG_SETTING"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_API_VERSION"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_ATTACHMENT_ENCODING"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_CLIENT"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_MEDIA_TYPE"/&gt;
 *     &lt;enumeration value="WEBSTORE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="XML_PARSER_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExceptionCode", namespace = "urn:fault.partner.soap.sforce.com")
@XmlEnum
public enum ExceptionCode {

    APEX_REST_SERVICES_DISABLED,
    APEX_TRIGGER_COUPLING_LIMIT,
    API_CURRENTLY_DISABLED,
    API_DISABLED_FOR_ORG,
    ARGUMENT_OBJECT_PARSE_ERROR,
    ASYNC_OPERATION_LOCATOR,
    ASYNC_QUERY_UNSUPPORTED_QUERY,
    BATCH_PROCESSING_HALTED,
    BIG_OBJECT_UNSUPPORTED_OPERATION,
    CANNOT_DELETE_ENTITY,
    CANNOT_DELETE_OWNER,
    CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY,
    CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY,
    CATEGORY_NOT_FOUND,
    CIRCULAR_OBJECT_GRAPH,
    CLIENT_NOT_ACCESSIBLE_FOR_USER,
    CLIENT_REQUIRE_UPDATE_FOR_USER,
    CLONE_FIELD_INTEGRITY_EXCEPTION,
    CLONE_NOT_SUPPORTED,
    CONTENT_ALREADY_AN_ASSET_EXCEPTION,
    CONTENT_CUSTOM_DOWNLOAD_EXCEPTION,
    CONTENT_HUB_AUTHENTICATION_EXCEPTION,
    CONTENT_HUB_FILE_DOWNLOAD_EXCEPTION,
    CONTENT_HUB_FILE_HAS_NO_URL_EXCEPTION,
    CONTENT_HUB_FILE_NOT_FOUND_EXCEPTION,
    CONTENT_HUB_INVALID_OBJECT_TYPE_EXCEPTION,
    CONTENT_HUB_INVALID_PAGE_NUMBER_EXCEPTION,
    CONTENT_HUB_INVALID_PAYLOAD,
    CONTENT_HUB_INVALID_RENDITION_PAGE_NUMBER_EXCEPTION,
    CONTENT_HUB_ITEM_TYPE_NOT_FOUND_EXCEPTION,
    CONTENT_HUB_OBJECT_NOT_FOUND_EXCEPTION,
    CONTENT_HUB_OPERATION_NOT_SUPPORTED_EXCEPTION,
    CONTENT_HUB_SECURITY_EXCEPTION,
    CONTENT_HUB_TIMEOUT_EXCEPTION,
    CONTENT_HUB_UNEXPECTED_EXCEPTION,
    CONTENT_IMAGE_SCALING_INVALID_ARGUMENTS_EXCEPTION,
    CONTENT_IMAGE_SCALING_INVALID_IMAGE_EXCEPTION,
    CONTENT_IMAGE_SCALING_MAX_RENDITIONS_EXCEPTION,
    CONTENT_IMAGE_SCALING_TIMEOUT_EXCEPTION,
    CONTENT_IMAGE_SCALING_UNKNOWN_EXCEPTION,
    CUSTOM_METADATA_LIMIT_EXCEEDED,
    CUSTOM_SETTINGS_LIMIT_EXCEEDED,
    DATACLOUD_API_CLIENT_EXCEPTION,
    DATACLOUD_API_DISABLED_EXCEPTION,
    DATACLOUD_API_INVALID_QUERY_EXCEPTION,
    DATACLOUD_API_SERVER_BUSY_EXCEPTION,
    DATACLOUD_API_SERVER_EXCEPTION,
    DATACLOUD_API_TIMEOUT_EXCEPTION,
    DATACLOUD_API_UNAVAILABLE,
    DATA_INTEGRATION_INPUT_ERROR,
    DATA_INTEGRATION_NOT_FOUND,
    DATA_INTEGRATION_NO_ACCESS,
    DATA_INTEGRATION_PACKAGE_ERROR,
    DATA_INTEGRATION_SERVER_ERROR,
    DATA_INTEGRATION_VENDOR_SETUP_ERROR,
    DEPENDENCY_API_UNSUPPORTED_EXCEPTION,
    DUPLICATE_ARGUMENT_VALUE,
    DUPLICATE_VALUE,
    EMAIL_BATCH_SIZE_LIMIT_EXCEEDED,
    EMAIL_TO_CASE_INVALID_ROUTING,
    EMAIL_TO_CASE_LIMIT_EXCEEDED,
    EMAIL_TO_CASE_NOT_ENABLED,
    ENTITY_NOT_QUERYABLE,
    ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT,
    EXCEEDED_ID_LIMIT,
    EXCEEDED_LEAD_CONVERT_LIMIT,
    EXCEEDED_MAX_FILTER_ENTITIES,
    EXCEEDED_MAX_SEMIJOIN_SUBSELECTS,
    EXCEEDED_MAX_SIZE_REQUEST,
    EXCEEDED_MAX_SOBJECTS,
    EXCEEDED_MAX_TYPES_LIMIT,
    EXCEEDED_QUOTA,
    EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION,
    EXTERNAL_OBJECT_CONNECTION_EXCEPTION,
    EXTERNAL_OBJECT_EXCEPTION,
    EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION,
    EXTERNAL_SERVICE_AUTHENTICATION_EXCEPTION,
    EXTERNAL_SERVICE_CONNECTION_EXCEPTION,
    EXTERNAL_SERVICE_DATA_EXCEPTION,
    EXTERNAL_SERVICE_EXCEPTION,
    EXTERNAL_SERVICE_INVALID_STATE_EXCEPTION,
    EXTERNAL_SERVICE_UNSUPPORTED_EXCEPTION,
    FEDERATED_SEARCH_ERROR,
    FEED_NOT_ENABLED_FOR_OBJECT,
    FUNCTIONALITY_NOT_ENABLED,
    FUNCTIONALITY_TEMPORARILY_UNAVAILABLE,
    GMAIL_ROUTING_CREATION_NOT_ALLOWED,
    ID_REQUIRED,
    ILLEGAL_QUERY_PARAMETER_VALUE,
    INACTIVE_OWNER_OR_USER,
    INACTIVE_PORTAL,
    INDEX_NOT_FOUND,
    INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE,
    INSTALL_KEY_INVALID,
    INSTALL_KEY_REQUIRED,
    INSUFFICIENT_ACCESS,
    INSUFFICIENT_ACCESS_APEX_METADATA_DEPLOY,
    INTERNAL_CANVAS_ERROR,
    INVALID_ASSIGNMENT_RULE,
    INVALID_AUTH_HEADER,
    INVALID_BATCH_REQUEST,
    INVALID_BATCH_SIZE,
    INVALID_CLIENT,
    INVALID_CROSS_REFERENCE_KEY,
    INVALID_DATE_FORMAT,
    INVALID_FIELD,
    INVALID_FILTER_LANGUAGE,
    INVALID_FILTER_VALUE,
    INVALID_ID_FIELD,
    INVALID_INPUT_COMBINATION,
    INVALID_LOCALE_LANGUAGE,
    INVALID_LOCATOR,
    INVALID_LOGIN,
    INVALID_MULTIPART_REQUEST,
    INVALID_NEW_PASSWORD,
    INVALID_OLD_PASSWORD,
    INVALID_OPERATION,
    INVALID_OPERATION_WITH_EXPIRED_PASSWORD,
    INVALID_PACKAGE_VERSION,
    INVALID_PAGING_OPTION,
    INVALID_QUERY_FILTER_OPERATOR,
    INVALID_QUERY_KEY,
    INVALID_QUERY_LOCATOR,
    INVALID_QUERY_SCOPE,
    INVALID_QUERY_VALUE,
    INVALID_REPLICATION_DATE,
    INVALID_SEARCH,
    INVALID_SEARCH_SCOPE,
    INVALID_SESSION_ID,
    INVALID_SOAP_HEADER,
    INVALID_SORT_OPTION,
    INVALID_SSO_GATEWAY_URL,
    INVALID_TYPE,
    INVALID_TYPE_FOR_OPERATION,
    JIGSAW_ACTION_DISABLED,
    JIGSAW_IMPORT_LIMIT_EXCEEDED,
    JIGSAW_REQUEST_NOT_SUPPORTED,
    JSON_PARSER_ERROR,
    KEY_HAS_BEEN_DESTROYED,
    LICENSING_DATA_ERROR,
    LICENSING_UNKNOWN_ERROR,
    LIMIT_EXCEEDED,
    LOGIN_CHALLENGE_ISSUED,
    LOGIN_CHALLENGE_PENDING,
    LOGIN_DURING_RESTRICTED_DOMAIN,
    LOGIN_DURING_RESTRICTED_TIME,
    LOGIN_MUST_USE_SECURITY_TOKEN,
    MALFORMED_ID,
    MALFORMED_QUERY,
    MALFORMED_SEARCH,
    MISMATCHING_VERSIONS,
    MISSING_ARGUMENT,
    MISSING_RECORD,
    MODIFIED,
    MULTIPLE_RECORDS_FOUND,
    MUTUAL_AUTHENTICATION_FAILED,
    NOT_ACCEPTABLE,
    NOT_MODIFIED,
    NO_ACTIVE_DUPLICATE_RULE,
    NO_RECIPIENTS,
    NO_SOFTPHONE_LAYOUT,
    NUMBER_OUTSIDE_VALID_RANGE,
    OPERATION_TOO_LARGE,
    ORDER_MANAGEMENT_ACTION_NOT_ALLOWED,
    ORG_IN_MAINTENANCE,
    ORG_IS_DOT_ORG,
    ORG_IS_SIGNING_UP,
    ORG_LOCKED,
    ORG_NOT_OWNED_BY_INSTANCE,
    PASSWORD_LOCKOUT,
    PORTAL_NO_ACCESS,
    POST_BODY_PARSE_ERROR,
    PRODUCT_NOT_FOUND,
    QAT_HETEROGENOUS_CONTEXT_IDS,
    QAT_INVALID_CONTEXT_ID,
    QAT_INVALID_QUICK_ACTION,
    QUERY_TIMEOUT,
    QUERY_TOO_COMPLICATED,
    REALTIME_PROCESSING_TIME_EXCEEDED_LIMIT,
    RECORD_NOT_FOUND,
    REPORT_EXPORT_LIMIT_EXCEEDED,
    REQUEST_LIMIT_EXCEEDED,
    REQUEST_RUNNING_TOO_LONG,
    SERVER_UNAVAILABLE,
    SERVICE_DESK_NOT_ENABLED,
    SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION,
    SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION,
    SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE,
    SSO_SERVICE_DOWN,
    SST_ADMIN_FILE_DOWNLOAD_EXCEPTION,
    STATE_TRANSITION_NOT_ALLOWED,
    TOO_MANY_APEX_REQUESTS,
    TOO_MANY_JOBS,
    TOO_MANY_RECIPIENTS,
    TOO_MANY_RECORDS,
    TRIAL_EXPIRED,
    TXN_SECURITY_APEX_ERROR,
    TXN_SECURITY_END_A_SESSION,
    TXN_SECURITY_FAIL_CLOSE,
    TXN_SECURITY_METERING_ERROR,
    TXN_SECURITY_NO_ACCESS,
    TXN_SECURITY_RUNTIME_ERROR,
    TXN_SECURITY_TWO_FA_REQUIRED,
    UNABLE_TO_LOCK_ROW,
    UNKNOWN_ATTACHMENT_EXCEPTION,
    UNKNOWN_EXCEPTION,
    UNKNOWN_ORG_SETTING,
    UNSUPPORTED_API_VERSION,
    UNSUPPORTED_ATTACHMENT_ENCODING,
    UNSUPPORTED_CLIENT,
    UNSUPPORTED_MEDIA_TYPE,
    WEBSTORE_NOT_FOUND,
    XML_PARSER_ERROR;

    public String value() {
        return name();
    }

    public static ExceptionCode fromValue(String v) {
        return valueOf(v);
    }

}
