
package com.sforce.partner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sforce.partner package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.partner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SObject }
     * 
     */
    public SObject createSObject() {
        return new SObject();
    }

    /**
     * Create an instance of {@link FindDuplicates }
     * 
     */
    public FindDuplicates createFindDuplicates() {
        return new FindDuplicates();
    }

    /**
     * Create an instance of {@link FindDuplicatesByIds }
     * 
     */
    public FindDuplicatesByIds createFindDuplicatesByIds() {
        return new FindDuplicatesByIds();
    }

    /**
     * Create an instance of {@link FindDuplicatesByIdsResponse }
     * 
     */
    public FindDuplicatesByIdsResponse createFindDuplicatesByIdsResponse() {
        return new FindDuplicatesByIdsResponse();
    }

    /**
     * Create an instance of {@link FindDuplicatesResult }
     * 
     */
    public FindDuplicatesResult createFindDuplicatesResult() {
        return new FindDuplicatesResult();
    }

    /**
     * Create an instance of {@link FindDuplicatesResponse }
     * 
     */
    public FindDuplicatesResponse createFindDuplicatesResponse() {
        return new FindDuplicatesResponse();
    }

    /**
     * Create an instance of {@link CreateSnapshot }
     * 
     */
    public CreateSnapshot createCreateSnapshot() {
        return new CreateSnapshot();
    }

    /**
     * Create an instance of {@link CreateSnapshotResponse }
     * 
     */
    public CreateSnapshotResponse createCreateSnapshotResponse() {
        return new CreateSnapshotResponse();
    }

    /**
     * Create an instance of {@link SnapshotResult }
     * 
     */
    public SnapshotResult createSnapshotResult() {
        return new SnapshotResult();
    }

    /**
     * Create an instance of {@link MoreSnapshot }
     * 
     */
    public MoreSnapshot createMoreSnapshot() {
        return new MoreSnapshot();
    }

    /**
     * Create an instance of {@link MoreSnapshotResponse }
     * 
     */
    public MoreSnapshotResponse createMoreSnapshotResponse() {
        return new MoreSnapshotResponse();
    }

    /**
     * Create an instance of {@link AckSnapshot }
     * 
     */
    public AckSnapshot createAckSnapshot() {
        return new AckSnapshot();
    }

    /**
     * Create an instance of {@link AckSnapshotResponse }
     * 
     */
    public AckSnapshotResponse createAckSnapshotResponse() {
        return new AckSnapshotResponse();
    }

    /**
     * Create an instance of {@link SyncOfflineData }
     * 
     */
    public SyncOfflineData createSyncOfflineData() {
        return new SyncOfflineData();
    }

    /**
     * Create an instance of {@link SyncOfflineDataResponse }
     * 
     */
    public SyncOfflineDataResponse createSyncOfflineDataResponse() {
        return new SyncOfflineDataResponse();
    }

    /**
     * Create an instance of {@link SyncOfflineDataResult }
     * 
     */
    public SyncOfflineDataResult createSyncOfflineDataResult() {
        return new SyncOfflineDataResult();
    }

    /**
     * Create an instance of {@link AckSyncOfflineData }
     * 
     */
    public AckSyncOfflineData createAckSyncOfflineData() {
        return new AckSyncOfflineData();
    }

    /**
     * Create an instance of {@link AckSyncOfflineDataResponse }
     * 
     */
    public AckSyncOfflineDataResponse createAckSyncOfflineDataResponse() {
        return new AckSyncOfflineDataResponse();
    }

    /**
     * Create an instance of {@link DescribeMobile }
     * 
     */
    public DescribeMobile createDescribeMobile() {
        return new DescribeMobile();
    }

    /**
     * Create an instance of {@link DescribeMobileResponse }
     * 
     */
    public DescribeMobileResponse createDescribeMobileResponse() {
        return new DescribeMobileResponse();
    }

    /**
     * Create an instance of {@link DescribeMobileResult }
     * 
     */
    public DescribeMobileResult createDescribeMobileResult() {
        return new DescribeMobileResult();
    }

    /**
     * Create an instance of {@link LoginXi }
     * 
     */
    public LoginXi createLoginXi() {
        return new LoginXi();
    }

    /**
     * Create an instance of {@link LoginXiResponse }
     * 
     */
    public LoginXiResponse createLoginXiResponse() {
        return new LoginXiResponse();
    }

    /**
     * Create an instance of {@link LoginResult }
     * 
     */
    public LoginResult createLoginResult() {
        return new LoginResult();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link DescribeSObject }
     * 
     */
    public DescribeSObject createDescribeSObject() {
        return new DescribeSObject();
    }

    /**
     * Create an instance of {@link DescribeSObjectResponse }
     * 
     */
    public DescribeSObjectResponse createDescribeSObjectResponse() {
        return new DescribeSObjectResponse();
    }

    /**
     * Create an instance of {@link DescribeSObjectResult }
     * 
     */
    public DescribeSObjectResult createDescribeSObjectResult() {
        return new DescribeSObjectResult();
    }

    /**
     * Create an instance of {@link DescribePicklists }
     * 
     */
    public DescribePicklists createDescribePicklists() {
        return new DescribePicklists();
    }

    /**
     * Create an instance of {@link DescribePicklistsParam }
     * 
     */
    public DescribePicklistsParam createDescribePicklistsParam() {
        return new DescribePicklistsParam();
    }

    /**
     * Create an instance of {@link DescribePicklistsResponse }
     * 
     */
    public DescribePicklistsResponse createDescribePicklistsResponse() {
        return new DescribePicklistsResponse();
    }

    /**
     * Create an instance of {@link DescribePicklistResult }
     * 
     */
    public DescribePicklistResult createDescribePicklistResult() {
        return new DescribePicklistResult();
    }

    /**
     * Create an instance of {@link CaptureCommonEvent }
     * 
     */
    public CaptureCommonEvent createCaptureCommonEvent() {
        return new CaptureCommonEvent();
    }

    /**
     * Create an instance of {@link CaptureCommonEventResponse }
     * 
     */
    public CaptureCommonEventResponse createCaptureCommonEventResponse() {
        return new CaptureCommonEventResponse();
    }

    /**
     * Create an instance of {@link CommonEventResult }
     * 
     */
    public CommonEventResult createCommonEventResult() {
        return new CommonEventResult();
    }

    /**
     * Create an instance of {@link DescribeSObjects }
     * 
     */
    public DescribeSObjects createDescribeSObjects() {
        return new DescribeSObjects();
    }

    /**
     * Create an instance of {@link DescribeSObjectsResponse }
     * 
     */
    public DescribeSObjectsResponse createDescribeSObjectsResponse() {
        return new DescribeSObjectsResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobal }
     * 
     */
    public DescribeGlobal createDescribeGlobal() {
        return new DescribeGlobal();
    }

    /**
     * Create an instance of {@link DescribeGlobalResponse }
     * 
     */
    public DescribeGlobalResponse createDescribeGlobalResponse() {
        return new DescribeGlobalResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalResult }
     * 
     */
    public DescribeGlobalResult createDescribeGlobalResult() {
        return new DescribeGlobalResult();
    }

    /**
     * Create an instance of {@link DescribeGlobalTheme }
     * 
     */
    public DescribeGlobalTheme createDescribeGlobalTheme() {
        return new DescribeGlobalTheme();
    }

    /**
     * Create an instance of {@link DescribeGlobalThemeResponse }
     * 
     */
    public DescribeGlobalThemeResponse createDescribeGlobalThemeResponse() {
        return new DescribeGlobalThemeResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalTheme2 }
     * 
     */
    public DescribeGlobalTheme2 createDescribeGlobalTheme2() {
        return new DescribeGlobalTheme2();
    }

    /**
     * Create an instance of {@link DescribeTheme }
     * 
     */
    public DescribeTheme createDescribeTheme() {
        return new DescribeTheme();
    }

    /**
     * Create an instance of {@link DescribeThemeResponse }
     * 
     */
    public DescribeThemeResponse createDescribeThemeResponse() {
        return new DescribeThemeResponse();
    }

    /**
     * Create an instance of {@link DescribeThemeResult }
     * 
     */
    public DescribeThemeResult createDescribeThemeResult() {
        return new DescribeThemeResult();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroups }
     * 
     */
    public DescribeDataCategoryGroups createDescribeDataCategoryGroups() {
        return new DescribeDataCategoryGroups();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupsResponse }
     * 
     */
    public DescribeDataCategoryGroupsResponse createDescribeDataCategoryGroupsResponse() {
        return new DescribeDataCategoryGroupsResponse();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupResult }
     * 
     */
    public DescribeDataCategoryGroupResult createDescribeDataCategoryGroupResult() {
        return new DescribeDataCategoryGroupResult();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructures }
     * 
     */
    public DescribeDataCategoryGroupStructures createDescribeDataCategoryGroupStructures() {
        return new DescribeDataCategoryGroupStructures();
    }

    /**
     * Create an instance of {@link DataCategoryGroupSobjectTypePair }
     * 
     */
    public DataCategoryGroupSobjectTypePair createDataCategoryGroupSobjectTypePair() {
        return new DataCategoryGroupSobjectTypePair();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructuresResponse }
     * 
     */
    public DescribeDataCategoryGroupStructuresResponse createDescribeDataCategoryGroupStructuresResponse() {
        return new DescribeDataCategoryGroupStructuresResponse();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructureResult }
     * 
     */
    public DescribeDataCategoryGroupStructureResult createDescribeDataCategoryGroupStructureResult() {
        return new DescribeDataCategoryGroupStructureResult();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryMappings }
     * 
     */
    public DescribeDataCategoryMappings createDescribeDataCategoryMappings() {
        return new DescribeDataCategoryMappings();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryMappingsResponse }
     * 
     */
    public DescribeDataCategoryMappingsResponse createDescribeDataCategoryMappingsResponse() {
        return new DescribeDataCategoryMappingsResponse();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryMappingResult }
     * 
     */
    public DescribeDataCategoryMappingResult createDescribeDataCategoryMappingResult() {
        return new DescribeDataCategoryMappingResult();
    }

    /**
     * Create an instance of {@link DescribeKnowledgeSettings }
     * 
     */
    public DescribeKnowledgeSettings createDescribeKnowledgeSettings() {
        return new DescribeKnowledgeSettings();
    }

    /**
     * Create an instance of {@link DescribeKnowledgeSettingsResponse }
     * 
     */
    public DescribeKnowledgeSettingsResponse createDescribeKnowledgeSettingsResponse() {
        return new DescribeKnowledgeSettingsResponse();
    }

    /**
     * Create an instance of {@link KnowledgeSettings }
     * 
     */
    public KnowledgeSettings createKnowledgeSettings() {
        return new KnowledgeSettings();
    }

    /**
     * Create an instance of {@link DescribeDuplicateRules }
     * 
     */
    public DescribeDuplicateRules createDescribeDuplicateRules() {
        return new DescribeDuplicateRules();
    }

    /**
     * Create an instance of {@link DescribeDuplicateRulesResponse }
     * 
     */
    public DescribeDuplicateRulesResponse createDescribeDuplicateRulesResponse() {
        return new DescribeDuplicateRulesResponse();
    }

    /**
     * Create an instance of {@link DescribeDuplicateRuleResult }
     * 
     */
    public DescribeDuplicateRuleResult createDescribeDuplicateRuleResult() {
        return new DescribeDuplicateRuleResult();
    }

    /**
     * Create an instance of {@link FtestPatch }
     * 
     */
    public FtestPatch createFtestPatch() {
        return new FtestPatch();
    }

    /**
     * Create an instance of {@link FtestPatchResponse }
     * 
     */
    public FtestPatchResponse createFtestPatchResponse() {
        return new FtestPatchResponse();
    }

    /**
     * Create an instance of {@link SaveResult }
     * 
     */
    public SaveResult createSaveResult() {
        return new SaveResult();
    }

    /**
     * Create an instance of {@link FtestPatchPreviousVersion }
     * 
     */
    public FtestPatchPreviousVersion createFtestPatchPreviousVersion() {
        return new FtestPatchPreviousVersion();
    }

    /**
     * Create an instance of {@link FtestPatchPreviousVersionResponse }
     * 
     */
    public FtestPatchPreviousVersionResponse createFtestPatchPreviousVersionResponse() {
        return new FtestPatchPreviousVersionResponse();
    }

    /**
     * Create an instance of {@link DescribeFlexiPages }
     * 
     */
    public DescribeFlexiPages createDescribeFlexiPages() {
        return new DescribeFlexiPages();
    }

    /**
     * Create an instance of {@link FlexipageContext }
     * 
     */
    public FlexipageContext createFlexipageContext() {
        return new FlexipageContext();
    }

    /**
     * Create an instance of {@link DescribeFlexiPagesResponse }
     * 
     */
    public DescribeFlexiPagesResponse createDescribeFlexiPagesResponse() {
        return new DescribeFlexiPagesResponse();
    }

    /**
     * Create an instance of {@link DescribeFlexiPageResult }
     * 
     */
    public DescribeFlexiPageResult createDescribeFlexiPageResult() {
        return new DescribeFlexiPageResult();
    }

    /**
     * Create an instance of {@link DescribeAppMenu }
     * 
     */
    public DescribeAppMenu createDescribeAppMenu() {
        return new DescribeAppMenu();
    }

    /**
     * Create an instance of {@link DescribeAppMenuResponse }
     * 
     */
    public DescribeAppMenuResponse createDescribeAppMenuResponse() {
        return new DescribeAppMenuResponse();
    }

    /**
     * Create an instance of {@link DescribeAppMenuResult }
     * 
     */
    public DescribeAppMenuResult createDescribeAppMenuResult() {
        return new DescribeAppMenuResult();
    }

    /**
     * Create an instance of {@link DescribeLayout }
     * 
     */
    public DescribeLayout createDescribeLayout() {
        return new DescribeLayout();
    }

    /**
     * Create an instance of {@link DescribeLayoutByUiType }
     * 
     */
    public DescribeLayoutByUiType createDescribeLayoutByUiType() {
        return new DescribeLayoutByUiType();
    }

    /**
     * Create an instance of {@link DescribeLayoutByUiTypeResponse }
     * 
     */
    public DescribeLayoutByUiTypeResponse createDescribeLayoutByUiTypeResponse() {
        return new DescribeLayoutByUiTypeResponse();
    }

    /**
     * Create an instance of {@link DescribeLayoutResult }
     * 
     */
    public DescribeLayoutResult createDescribeLayoutResult() {
        return new DescribeLayoutResult();
    }

    /**
     * Create an instance of {@link DescribeLayoutResponse }
     * 
     */
    public DescribeLayoutResponse createDescribeLayoutResponse() {
        return new DescribeLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeMiniLayout }
     * 
     */
    public DescribeMiniLayout createDescribeMiniLayout() {
        return new DescribeMiniLayout();
    }

    /**
     * Create an instance of {@link DescribeMiniLayoutResponse }
     * 
     */
    public DescribeMiniLayoutResponse createDescribeMiniLayoutResponse() {
        return new DescribeMiniLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeMiniLayoutResult }
     * 
     */
    public DescribeMiniLayoutResult createDescribeMiniLayoutResult() {
        return new DescribeMiniLayoutResult();
    }

    /**
     * Create an instance of {@link DescribeCompactLayouts }
     * 
     */
    public DescribeCompactLayouts createDescribeCompactLayouts() {
        return new DescribeCompactLayouts();
    }

    /**
     * Create an instance of {@link DescribeCompactLayoutsResponse }
     * 
     */
    public DescribeCompactLayoutsResponse createDescribeCompactLayoutsResponse() {
        return new DescribeCompactLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeCompactLayoutsResult }
     * 
     */
    public DescribeCompactLayoutsResult createDescribeCompactLayoutsResult() {
        return new DescribeCompactLayoutsResult();
    }

    /**
     * Create an instance of {@link DescribePrimaryCompactLayouts }
     * 
     */
    public DescribePrimaryCompactLayouts createDescribePrimaryCompactLayouts() {
        return new DescribePrimaryCompactLayouts();
    }

    /**
     * Create an instance of {@link DescribePrimaryCompactLayoutsResponse }
     * 
     */
    public DescribePrimaryCompactLayoutsResponse createDescribePrimaryCompactLayoutsResponse() {
        return new DescribePrimaryCompactLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeCompactLayout }
     * 
     */
    public DescribeCompactLayout createDescribeCompactLayout() {
        return new DescribeCompactLayout();
    }

    /**
     * Create an instance of {@link DescribePathAssistants }
     * 
     */
    public DescribePathAssistants createDescribePathAssistants() {
        return new DescribePathAssistants();
    }

    /**
     * Create an instance of {@link DescribePathAssistantsResponse }
     * 
     */
    public DescribePathAssistantsResponse createDescribePathAssistantsResponse() {
        return new DescribePathAssistantsResponse();
    }

    /**
     * Create an instance of {@link DescribePathAssistantsResult }
     * 
     */
    public DescribePathAssistantsResult createDescribePathAssistantsResult() {
        return new DescribePathAssistantsResult();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayout }
     * 
     */
    public DescribeApprovalLayout createDescribeApprovalLayout() {
        return new DescribeApprovalLayout();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayoutResponse }
     * 
     */
    public DescribeApprovalLayoutResponse createDescribeApprovalLayoutResponse() {
        return new DescribeApprovalLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayoutResult }
     * 
     */
    public DescribeApprovalLayoutResult createDescribeApprovalLayoutResult() {
        return new DescribeApprovalLayoutResult();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayout }
     * 
     */
    public DescribeSoftphoneLayout createDescribeSoftphoneLayout() {
        return new DescribeSoftphoneLayout();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutResponse }
     * 
     */
    public DescribeSoftphoneLayoutResponse createDescribeSoftphoneLayoutResponse() {
        return new DescribeSoftphoneLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutResult }
     * 
     */
    public DescribeSoftphoneLayoutResult createDescribeSoftphoneLayoutResult() {
        return new DescribeSoftphoneLayoutResult();
    }

    /**
     * Create an instance of {@link DescribeListViews }
     * 
     */
    public DescribeListViews createDescribeListViews() {
        return new DescribeListViews();
    }

    /**
     * Create an instance of {@link DescribeListViewsResponse }
     * 
     */
    public DescribeListViewsResponse createDescribeListViewsResponse() {
        return new DescribeListViewsResponse();
    }

    /**
     * Create an instance of {@link DescribeListViewResult }
     * 
     */
    public DescribeListViewResult createDescribeListViewResult() {
        return new DescribeListViewResult();
    }

    /**
     * Create an instance of {@link DescribeLookupLayouts }
     * 
     */
    public DescribeLookupLayouts createDescribeLookupLayouts() {
        return new DescribeLookupLayouts();
    }

    /**
     * Create an instance of {@link DescribeLookupLayoutsResponse }
     * 
     */
    public DescribeLookupLayoutsResponse createDescribeLookupLayoutsResponse() {
        return new DescribeLookupLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeLookupLayoutResult }
     * 
     */
    public DescribeLookupLayoutResult createDescribeLookupLayoutResult() {
        return new DescribeLookupLayoutResult();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViews }
     * 
     */
    public DescribeSoqlListViews createDescribeSoqlListViews() {
        return new DescribeSoqlListViews();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewsRequest }
     * 
     */
    public DescribeSoqlListViewsRequest createDescribeSoqlListViewsRequest() {
        return new DescribeSoqlListViewsRequest();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewsResponse }
     * 
     */
    public DescribeSoqlListViewsResponse createDescribeSoqlListViewsResponse() {
        return new DescribeSoqlListViewsResponse();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewResult }
     * 
     */
    public DescribeSoqlListViewResult createDescribeSoqlListViewResult() {
        return new DescribeSoqlListViewResult();
    }

    /**
     * Create an instance of {@link ExecuteListView }
     * 
     */
    public ExecuteListView createExecuteListView() {
        return new ExecuteListView();
    }

    /**
     * Create an instance of {@link ExecuteListViewRequest }
     * 
     */
    public ExecuteListViewRequest createExecuteListViewRequest() {
        return new ExecuteListViewRequest();
    }

    /**
     * Create an instance of {@link ExecuteListViewResponse }
     * 
     */
    public ExecuteListViewResponse createExecuteListViewResponse() {
        return new ExecuteListViewResponse();
    }

    /**
     * Create an instance of {@link ExecuteListViewResult }
     * 
     */
    public ExecuteListViewResult createExecuteListViewResult() {
        return new ExecuteListViewResult();
    }

    /**
     * Create an instance of {@link DescribeSObjectListViews }
     * 
     */
    public DescribeSObjectListViews createDescribeSObjectListViews() {
        return new DescribeSObjectListViews();
    }

    /**
     * Create an instance of {@link DescribeSObjectListViewsResponse }
     * 
     */
    public DescribeSObjectListViewsResponse createDescribeSObjectListViewsResponse() {
        return new DescribeSObjectListViewsResponse();
    }

    /**
     * Create an instance of {@link DescribeSearchLayouts }
     * 
     */
    public DescribeSearchLayouts createDescribeSearchLayouts() {
        return new DescribeSearchLayouts();
    }

    /**
     * Create an instance of {@link DescribeSearchLayoutsResponse }
     * 
     */
    public DescribeSearchLayoutsResponse createDescribeSearchLayoutsResponse() {
        return new DescribeSearchLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeSearchLayoutResult }
     * 
     */
    public DescribeSearchLayoutResult createDescribeSearchLayoutResult() {
        return new DescribeSearchLayoutResult();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrder }
     * 
     */
    public DescribeSearchScopeOrder createDescribeSearchScopeOrder() {
        return new DescribeSearchScopeOrder();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrderResponse }
     * 
     */
    public DescribeSearchScopeOrderResponse createDescribeSearchScopeOrderResponse() {
        return new DescribeSearchScopeOrderResponse();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrderResult }
     * 
     */
    public DescribeSearchScopeOrderResult createDescribeSearchScopeOrderResult() {
        return new DescribeSearchScopeOrderResult();
    }

    /**
     * Create an instance of {@link DescribeSearchableEntities }
     * 
     */
    public DescribeSearchableEntities createDescribeSearchableEntities() {
        return new DescribeSearchableEntities();
    }

    /**
     * Create an instance of {@link DescribeSearchableEntitiesResponse }
     * 
     */
    public DescribeSearchableEntitiesResponse createDescribeSearchableEntitiesResponse() {
        return new DescribeSearchableEntitiesResponse();
    }

    /**
     * Create an instance of {@link DescribeSearchableEntityResult }
     * 
     */
    public DescribeSearchableEntityResult createDescribeSearchableEntityResult() {
        return new DescribeSearchableEntityResult();
    }

    /**
     * Create an instance of {@link DescribeTabs }
     * 
     */
    public DescribeTabs createDescribeTabs() {
        return new DescribeTabs();
    }

    /**
     * Create an instance of {@link DescribeTabsResponse }
     * 
     */
    public DescribeTabsResponse createDescribeTabsResponse() {
        return new DescribeTabsResponse();
    }

    /**
     * Create an instance of {@link DescribeTabSetResult }
     * 
     */
    public DescribeTabSetResult createDescribeTabSetResult() {
        return new DescribeTabSetResult();
    }

    /**
     * Create an instance of {@link DescribeAllTabs }
     * 
     */
    public DescribeAllTabs createDescribeAllTabs() {
        return new DescribeAllTabs();
    }

    /**
     * Create an instance of {@link DescribeAllTabsResponse }
     * 
     */
    public DescribeAllTabsResponse createDescribeAllTabsResponse() {
        return new DescribeAllTabsResponse();
    }

    /**
     * Create an instance of {@link DescribeTab }
     * 
     */
    public DescribeTab createDescribeTab() {
        return new DescribeTab();
    }

    /**
     * Create an instance of {@link DescribeNouns }
     * 
     */
    public DescribeNouns createDescribeNouns() {
        return new DescribeNouns();
    }

    /**
     * Create an instance of {@link DescribeNounsResponse }
     * 
     */
    public DescribeNounsResponse createDescribeNounsResponse() {
        return new DescribeNounsResponse();
    }

    /**
     * Create an instance of {@link DescribeNounResult }
     * 
     */
    public DescribeNounResult createDescribeNounResult() {
        return new DescribeNounResult();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link HandleEmailMessage }
     * 
     */
    public HandleEmailMessage createHandleEmailMessage() {
        return new HandleEmailMessage();
    }

    /**
     * Create an instance of {@link HandledEmailMessage }
     * 
     */
    public HandledEmailMessage createHandledEmailMessage() {
        return new HandledEmailMessage();
    }

    /**
     * Create an instance of {@link HandleEmailMessageResponse }
     * 
     */
    public HandleEmailMessageResponse createHandleEmailMessageResponse() {
        return new HandleEmailMessageResponse();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmailResult }
     * 
     */
    public SendEmailResult createSendEmailResult() {
        return new SendEmailResult();
    }

    /**
     * Create an instance of {@link RenderEmailTemplate }
     * 
     */
    public RenderEmailTemplate createRenderEmailTemplate() {
        return new RenderEmailTemplate();
    }

    /**
     * Create an instance of {@link RenderEmailTemplateRequest }
     * 
     */
    public RenderEmailTemplateRequest createRenderEmailTemplateRequest() {
        return new RenderEmailTemplateRequest();
    }

    /**
     * Create an instance of {@link RenderEmailTemplateResponse }
     * 
     */
    public RenderEmailTemplateResponse createRenderEmailTemplateResponse() {
        return new RenderEmailTemplateResponse();
    }

    /**
     * Create an instance of {@link RenderEmailTemplateResult }
     * 
     */
    public RenderEmailTemplateResult createRenderEmailTemplateResult() {
        return new RenderEmailTemplateResult();
    }

    /**
     * Create an instance of {@link RenderStoredEmailTemplate }
     * 
     */
    public RenderStoredEmailTemplate createRenderStoredEmailTemplate() {
        return new RenderStoredEmailTemplate();
    }

    /**
     * Create an instance of {@link RenderStoredEmailTemplateRequest }
     * 
     */
    public RenderStoredEmailTemplateRequest createRenderStoredEmailTemplateRequest() {
        return new RenderStoredEmailTemplateRequest();
    }

    /**
     * Create an instance of {@link RenderStoredEmailTemplateResponse }
     * 
     */
    public RenderStoredEmailTemplateResponse createRenderStoredEmailTemplateResponse() {
        return new RenderStoredEmailTemplateResponse();
    }

    /**
     * Create an instance of {@link RenderStoredEmailTemplateResult }
     * 
     */
    public RenderStoredEmailTemplateResult createRenderStoredEmailTemplateResult() {
        return new RenderStoredEmailTemplateResult();
    }

    /**
     * Create an instance of {@link SendEmailMessage }
     * 
     */
    public SendEmailMessage createSendEmailMessage() {
        return new SendEmailMessage();
    }

    /**
     * Create an instance of {@link SendEmailMessageResponse }
     * 
     */
    public SendEmailMessageResponse createSendEmailMessageResponse() {
        return new SendEmailMessageResponse();
    }

    /**
     * Create an instance of {@link EmailMerge }
     * 
     */
    public EmailMerge createEmailMerge() {
        return new EmailMerge();
    }

    /**
     * Create an instance of {@link EmailMergeResponse }
     * 
     */
    public EmailMergeResponse createEmailMergeResponse() {
        return new EmailMergeResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Upsert }
     * 
     */
    public Upsert createUpsert() {
        return new Upsert();
    }

    /**
     * Create an instance of {@link UpsertResponse }
     * 
     */
    public UpsertResponse createUpsertResponse() {
        return new UpsertResponse();
    }

    /**
     * Create an instance of {@link UpsertResult }
     * 
     */
    public UpsertResult createUpsertResult() {
        return new UpsertResult();
    }

    /**
     * Create an instance of {@link Merge }
     * 
     */
    public Merge createMerge() {
        return new Merge();
    }

    /**
     * Create an instance of {@link MergeRequest }
     * 
     */
    public MergeRequest createMergeRequest() {
        return new MergeRequest();
    }

    /**
     * Create an instance of {@link MergeResponse }
     * 
     */
    public MergeResponse createMergeResponse() {
        return new MergeResponse();
    }

    /**
     * Create an instance of {@link MergeResult }
     * 
     */
    public MergeResult createMergeResult() {
        return new MergeResult();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link DeleteResult }
     * 
     */
    public DeleteResult createDeleteResult() {
        return new DeleteResult();
    }

    /**
     * Create an instance of {@link DeleteByExample }
     * 
     */
    public DeleteByExample createDeleteByExample() {
        return new DeleteByExample();
    }

    /**
     * Create an instance of {@link DeleteByExampleResponse }
     * 
     */
    public DeleteByExampleResponse createDeleteByExampleResponse() {
        return new DeleteByExampleResponse();
    }

    /**
     * Create an instance of {@link DeleteByExampleResult }
     * 
     */
    public DeleteByExampleResult createDeleteByExampleResult() {
        return new DeleteByExampleResult();
    }

    /**
     * Create an instance of {@link Undelete }
     * 
     */
    public Undelete createUndelete() {
        return new Undelete();
    }

    /**
     * Create an instance of {@link UndeleteResponse }
     * 
     */
    public UndeleteResponse createUndeleteResponse() {
        return new UndeleteResponse();
    }

    /**
     * Create an instance of {@link UndeleteResult }
     * 
     */
    public UndeleteResult createUndeleteResult() {
        return new UndeleteResult();
    }

    /**
     * Create an instance of {@link UpdateSettings }
     * 
     */
    public UpdateSettings createUpdateSettings() {
        return new UpdateSettings();
    }

    /**
     * Create an instance of {@link UpdateSettingsResponse }
     * 
     */
    public UpdateSettingsResponse createUpdateSettingsResponse() {
        return new UpdateSettingsResponse();
    }

    /**
     * Create an instance of {@link EmptyRecycleBin }
     * 
     */
    public EmptyRecycleBin createEmptyRecycleBin() {
        return new EmptyRecycleBin();
    }

    /**
     * Create an instance of {@link EmptyRecycleBinResponse }
     * 
     */
    public EmptyRecycleBinResponse createEmptyRecycleBinResponse() {
        return new EmptyRecycleBinResponse();
    }

    /**
     * Create an instance of {@link EmptyRecycleBinResult }
     * 
     */
    public EmptyRecycleBinResult createEmptyRecycleBinResult() {
        return new EmptyRecycleBinResult();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link ProcessRequest }
     * 
     */
    public ProcessRequest createProcessRequest() {
        return new ProcessRequest();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link ProcessResult }
     * 
     */
    public ProcessResult createProcessResult() {
        return new ProcessResult();
    }

    /**
     * Create an instance of {@link PerformQuickActions }
     * 
     */
    public PerformQuickActions createPerformQuickActions() {
        return new PerformQuickActions();
    }

    /**
     * Create an instance of {@link PerformQuickActionRequest }
     * 
     */
    public PerformQuickActionRequest createPerformQuickActionRequest() {
        return new PerformQuickActionRequest();
    }

    /**
     * Create an instance of {@link PerformQuickActionsResponse }
     * 
     */
    public PerformQuickActionsResponse createPerformQuickActionsResponse() {
        return new PerformQuickActionsResponse();
    }

    /**
     * Create an instance of {@link PerformQuickActionResult }
     * 
     */
    public PerformQuickActionResult createPerformQuickActionResult() {
        return new PerformQuickActionResult();
    }

    /**
     * Create an instance of {@link RetrieveMassQuickActionTemplates }
     * 
     */
    public RetrieveMassQuickActionTemplates createRetrieveMassQuickActionTemplates() {
        return new RetrieveMassQuickActionTemplates();
    }

    /**
     * Create an instance of {@link RetrieveMassQuickActionTemplatesResponse }
     * 
     */
    public RetrieveMassQuickActionTemplatesResponse createRetrieveMassQuickActionTemplatesResponse() {
        return new RetrieveMassQuickActionTemplatesResponse();
    }

    /**
     * Create an instance of {@link QuickActionTemplateResult }
     * 
     */
    public QuickActionTemplateResult createQuickActionTemplateResult() {
        return new QuickActionTemplateResult();
    }

    /**
     * Create an instance of {@link RetrieveQuickActionTemplates }
     * 
     */
    public RetrieveQuickActionTemplates createRetrieveQuickActionTemplates() {
        return new RetrieveQuickActionTemplates();
    }

    /**
     * Create an instance of {@link RetrieveQuickActionTemplatesResponse }
     * 
     */
    public RetrieveQuickActionTemplatesResponse createRetrieveQuickActionTemplatesResponse() {
        return new RetrieveQuickActionTemplatesResponse();
    }

    /**
     * Create an instance of {@link DescribeQuickActions }
     * 
     */
    public DescribeQuickActions createDescribeQuickActions() {
        return new DescribeQuickActions();
    }

    /**
     * Create an instance of {@link DescribeQuickActionsResponse }
     * 
     */
    public DescribeQuickActionsResponse createDescribeQuickActionsResponse() {
        return new DescribeQuickActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeQuickActionResult }
     * 
     */
    public DescribeQuickActionResult createDescribeQuickActionResult() {
        return new DescribeQuickActionResult();
    }

    /**
     * Create an instance of {@link DescribeQuickActionsForRecordType }
     * 
     */
    public DescribeQuickActionsForRecordType createDescribeQuickActionsForRecordType() {
        return new DescribeQuickActionsForRecordType();
    }

    /**
     * Create an instance of {@link DescribeQuickActionsForRecordTypeResponse }
     * 
     */
    public DescribeQuickActionsForRecordTypeResponse createDescribeQuickActionsForRecordTypeResponse() {
        return new DescribeQuickActionsForRecordTypeResponse();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActions }
     * 
     */
    public DescribeAvailableQuickActions createDescribeAvailableQuickActions() {
        return new DescribeAvailableQuickActions();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActionsResponse }
     * 
     */
    public DescribeAvailableQuickActionsResponse createDescribeAvailableQuickActionsResponse() {
        return new DescribeAvailableQuickActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActionResult }
     * 
     */
    public DescribeAvailableQuickActionResult createDescribeAvailableQuickActionResult() {
        return new DescribeAvailableQuickActionResult();
    }

    /**
     * Create an instance of {@link DescribeVisualForce }
     * 
     */
    public DescribeVisualForce createDescribeVisualForce() {
        return new DescribeVisualForce();
    }

    /**
     * Create an instance of {@link DescribeVisualForceResponse }
     * 
     */
    public DescribeVisualForceResponse createDescribeVisualForceResponse() {
        return new DescribeVisualForceResponse();
    }

    /**
     * Create an instance of {@link DescribeVisualForceResult }
     * 
     */
    public DescribeVisualForceResult createDescribeVisualForceResult() {
        return new DescribeVisualForceResult();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActions }
     * 
     */
    public DescribeWorkitemActions createDescribeWorkitemActions() {
        return new DescribeWorkitemActions();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActionsResponse }
     * 
     */
    public DescribeWorkitemActionsResponse createDescribeWorkitemActionsResponse() {
        return new DescribeWorkitemActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActionResult }
     * 
     */
    public DescribeWorkitemActionResult createDescribeWorkitemActionResult() {
        return new DescribeWorkitemActionResult();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link RetrieveDefaultValues }
     * 
     */
    public RetrieveDefaultValues createRetrieveDefaultValues() {
        return new RetrieveDefaultValues();
    }

    /**
     * Create an instance of {@link RetrieveDefaultValuesResponse }
     * 
     */
    public RetrieveDefaultValuesResponse createRetrieveDefaultValuesResponse() {
        return new RetrieveDefaultValuesResponse();
    }

    /**
     * Create an instance of {@link ConvertLead }
     * 
     */
    public ConvertLead createConvertLead() {
        return new ConvertLead();
    }

    /**
     * Create an instance of {@link LeadConvert }
     * 
     */
    public LeadConvert createLeadConvert() {
        return new LeadConvert();
    }

    /**
     * Create an instance of {@link ConvertLeadResponse }
     * 
     */
    public ConvertLeadResponse createConvertLeadResponse() {
        return new ConvertLeadResponse();
    }

    /**
     * Create an instance of {@link LeadConvertResult }
     * 
     */
    public LeadConvertResult createLeadConvertResult() {
        return new LeadConvertResult();
    }

    /**
     * Create an instance of {@link AddCampaignMember }
     * 
     */
    public AddCampaignMember createAddCampaignMember() {
        return new AddCampaignMember();
    }

    /**
     * Create an instance of {@link AddCampaignMemberOptions }
     * 
     */
    public AddCampaignMemberOptions createAddCampaignMemberOptions() {
        return new AddCampaignMemberOptions();
    }

    /**
     * Create an instance of {@link AddCampaignMemberResponse }
     * 
     */
    public AddCampaignMemberResponse createAddCampaignMemberResponse() {
        return new AddCampaignMemberResponse();
    }

    /**
     * Create an instance of {@link AddCampaignMemberResult }
     * 
     */
    public AddCampaignMemberResult createAddCampaignMemberResult() {
        return new AddCampaignMemberResult();
    }

    /**
     * Create an instance of {@link GetUpdated }
     * 
     */
    public GetUpdated createGetUpdated() {
        return new GetUpdated();
    }

    /**
     * Create an instance of {@link GetUpdatedResponse }
     * 
     */
    public GetUpdatedResponse createGetUpdatedResponse() {
        return new GetUpdatedResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedResult }
     * 
     */
    public GetUpdatedResult createGetUpdatedResult() {
        return new GetUpdatedResult();
    }

    /**
     * Create an instance of {@link GetDeleted }
     * 
     */
    public GetDeleted createGetDeleted() {
        return new GetDeleted();
    }

    /**
     * Create an instance of {@link GetDeletedResponse }
     * 
     */
    public GetDeletedResponse createGetDeletedResponse() {
        return new GetDeletedResponse();
    }

    /**
     * Create an instance of {@link GetDeletedResult }
     * 
     */
    public GetDeletedResult createGetDeletedResult() {
        return new GetDeletedResult();
    }

    /**
     * Create an instance of {@link ImpersonateUser }
     * 
     */
    public ImpersonateUser createImpersonateUser() {
        return new ImpersonateUser();
    }

    /**
     * Create an instance of {@link ImpersonateUserResponse }
     * 
     */
    public ImpersonateUserResponse createImpersonateUserResponse() {
        return new ImpersonateUserResponse();
    }

    /**
     * Create an instance of {@link ImpersonateUserResult }
     * 
     */
    public ImpersonateUserResult createImpersonateUserResult() {
        return new ImpersonateUserResult();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link InvalidateSessions }
     * 
     */
    public InvalidateSessions createInvalidateSessions() {
        return new InvalidateSessions();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResponse }
     * 
     */
    public InvalidateSessionsResponse createInvalidateSessionsResponse() {
        return new InvalidateSessionsResponse();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResult }
     * 
     */
    public InvalidateSessionsResult createInvalidateSessionsResult() {
        return new InvalidateSessionsResult();
    }

    /**
     * Create an instance of {@link StartFlowInterview }
     * 
     */
    public StartFlowInterview createStartFlowInterview() {
        return new StartFlowInterview();
    }

    /**
     * Create an instance of {@link StartFlowInterviewRequest }
     * 
     */
    public StartFlowInterviewRequest createStartFlowInterviewRequest() {
        return new StartFlowInterviewRequest();
    }

    /**
     * Create an instance of {@link StartFlowInterviewResponse }
     * 
     */
    public StartFlowInterviewResponse createStartFlowInterviewResponse() {
        return new StartFlowInterviewResponse();
    }

    /**
     * Create an instance of {@link NavigateFlowInterviewResult }
     * 
     */
    public NavigateFlowInterviewResult createNavigateFlowInterviewResult() {
        return new NavigateFlowInterviewResult();
    }

    /**
     * Create an instance of {@link ResumeFlowInterview }
     * 
     */
    public ResumeFlowInterview createResumeFlowInterview() {
        return new ResumeFlowInterview();
    }

    /**
     * Create an instance of {@link ResumeFlowInterviewRequest }
     * 
     */
    public ResumeFlowInterviewRequest createResumeFlowInterviewRequest() {
        return new ResumeFlowInterviewRequest();
    }

    /**
     * Create an instance of {@link ResumeFlowInterviewResponse }
     * 
     */
    public ResumeFlowInterviewResponse createResumeFlowInterviewResponse() {
        return new ResumeFlowInterviewResponse();
    }

    /**
     * Create an instance of {@link NavigateFlowInterview }
     * 
     */
    public NavigateFlowInterview createNavigateFlowInterview() {
        return new NavigateFlowInterview();
    }

    /**
     * Create an instance of {@link NavigateFlowInterviewRequest }
     * 
     */
    public NavigateFlowInterviewRequest createNavigateFlowInterviewRequest() {
        return new NavigateFlowInterviewRequest();
    }

    /**
     * Create an instance of {@link NavigateFlowInterviewResponse }
     * 
     */
    public NavigateFlowInterviewResponse createNavigateFlowInterviewResponse() {
        return new NavigateFlowInterviewResponse();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link QueryResult }
     * 
     */
    public QueryResult createQueryResult() {
        return new QueryResult();
    }

    /**
     * Create an instance of {@link QueryAll }
     * 
     */
    public QueryAll createQueryAll() {
        return new QueryAll();
    }

    /**
     * Create an instance of {@link QueryAllResponse }
     * 
     */
    public QueryAllResponse createQueryAllResponse() {
        return new QueryAllResponse();
    }

    /**
     * Create an instance of {@link QueryMore }
     * 
     */
    public QueryMore createQueryMore() {
        return new QueryMore();
    }

    /**
     * Create an instance of {@link QueryMoreResponse }
     * 
     */
    public QueryMoreResponse createQueryMoreResponse() {
        return new QueryMoreResponse();
    }

    /**
     * Create an instance of {@link SetupBriefcase }
     * 
     */
    public SetupBriefcase createSetupBriefcase() {
        return new SetupBriefcase();
    }

    /**
     * Create an instance of {@link SetupBriefcaseResponse }
     * 
     */
    public SetupBriefcaseResponse createSetupBriefcaseResponse() {
        return new SetupBriefcaseResponse();
    }

    /**
     * Create an instance of {@link SetupBriefcaseResult }
     * 
     */
    public SetupBriefcaseResult createSetupBriefcaseResult() {
        return new SetupBriefcaseResult();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link OutlookSearch }
     * 
     */
    public OutlookSearch createOutlookSearch() {
        return new OutlookSearch();
    }

    /**
     * Create an instance of {@link OutlookSearchResponse }
     * 
     */
    public OutlookSearchResponse createOutlookSearchResponse() {
        return new OutlookSearchResponse();
    }

    /**
     * Create an instance of {@link OutlookSearchResult }
     * 
     */
    public OutlookSearchResult createOutlookSearchResult() {
        return new OutlookSearchResult();
    }

    /**
     * Create an instance of {@link OutlookDescribe }
     * 
     */
    public OutlookDescribe createOutlookDescribe() {
        return new OutlookDescribe();
    }

    /**
     * Create an instance of {@link OutlookDescribeResponse }
     * 
     */
    public OutlookDescribeResponse createOutlookDescribeResponse() {
        return new OutlookDescribeResponse();
    }

    /**
     * Create an instance of {@link OutlookDescribeResult }
     * 
     */
    public OutlookDescribeResult createOutlookDescribeResult() {
        return new OutlookDescribeResult();
    }

    /**
     * Create an instance of {@link GetServerTimestamp }
     * 
     */
    public GetServerTimestamp createGetServerTimestamp() {
        return new GetServerTimestamp();
    }

    /**
     * Create an instance of {@link GetServerTimestampResponse }
     * 
     */
    public GetServerTimestampResponse createGetServerTimestampResponse() {
        return new GetServerTimestampResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestampResult }
     * 
     */
    public GetServerTimestampResult createGetServerTimestampResult() {
        return new GetServerTimestampResult();
    }

    /**
     * Create an instance of {@link SetPassword }
     * 
     */
    public SetPassword createSetPassword() {
        return new SetPassword();
    }

    /**
     * Create an instance of {@link SetPasswordResponse }
     * 
     */
    public SetPasswordResponse createSetPasswordResponse() {
        return new SetPasswordResponse();
    }

    /**
     * Create an instance of {@link SetPasswordResult }
     * 
     */
    public SetPasswordResult createSetPasswordResult() {
        return new SetPasswordResult();
    }

    /**
     * Create an instance of {@link ChangeOwnPassword }
     * 
     */
    public ChangeOwnPassword createChangeOwnPassword() {
        return new ChangeOwnPassword();
    }

    /**
     * Create an instance of {@link ChangeOwnPasswordResponse }
     * 
     */
    public ChangeOwnPasswordResponse createChangeOwnPasswordResponse() {
        return new ChangeOwnPasswordResponse();
    }

    /**
     * Create an instance of {@link ChangeOwnPasswordResult }
     * 
     */
    public ChangeOwnPasswordResult createChangeOwnPasswordResult() {
        return new ChangeOwnPasswordResult();
    }

    /**
     * Create an instance of {@link ResetPassword }
     * 
     */
    public ResetPassword createResetPassword() {
        return new ResetPassword();
    }

    /**
     * Create an instance of {@link ResetPasswordResponse }
     * 
     */
    public ResetPasswordResponse createResetPasswordResponse() {
        return new ResetPasswordResponse();
    }

    /**
     * Create an instance of {@link ResetPasswordResult }
     * 
     */
    public ResetPasswordResult createResetPasswordResult() {
        return new ResetPasswordResult();
    }

    /**
     * Create an instance of {@link GetAccessInfo }
     * 
     */
    public GetAccessInfo createGetAccessInfo() {
        return new GetAccessInfo();
    }

    /**
     * Create an instance of {@link GetAccessInfoResponse }
     * 
     */
    public GetAccessInfoResponse createGetAccessInfoResponse() {
        return new GetAccessInfoResponse();
    }

    /**
     * Create an instance of {@link GetAccessInfoResult }
     * 
     */
    public GetAccessInfoResult createGetAccessInfoResult() {
        return new GetAccessInfoResult();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResult }
     * 
     */
    public GetUserInfoResult createGetUserInfoResult() {
        return new GetUserInfoResult();
    }

    /**
     * Create an instance of {@link Activate }
     * 
     */
    public Activate createActivate() {
        return new Activate();
    }

    /**
     * Create an instance of {@link ActivateResponse }
     * 
     */
    public ActivateResponse createActivateResponse() {
        return new ActivateResponse();
    }

    /**
     * Create an instance of {@link ActivateResult }
     * 
     */
    public ActivateResult createActivateResult() {
        return new ActivateResult();
    }

    /**
     * Create an instance of {@link GenerateJwtToken }
     * 
     */
    public GenerateJwtToken createGenerateJwtToken() {
        return new GenerateJwtToken();
    }

    /**
     * Create an instance of {@link ClaimsMapping }
     * 
     */
    public ClaimsMapping createClaimsMapping() {
        return new ClaimsMapping();
    }

    /**
     * Create an instance of {@link GenerateJwtTokenResponse }
     * 
     */
    public GenerateJwtTokenResponse createGenerateJwtTokenResponse() {
        return new GenerateJwtTokenResponse();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link LoginScopeHeader }
     * 
     */
    public LoginScopeHeader createLoginScopeHeader() {
        return new LoginScopeHeader();
    }

    /**
     * Create an instance of {@link CallOptions }
     * 
     */
    public CallOptions createCallOptions() {
        return new CallOptions();
    }

    /**
     * Create an instance of {@link QueryOptions }
     * 
     */
    public QueryOptions createQueryOptions() {
        return new QueryOptions();
    }

    /**
     * Create an instance of {@link APIPerformanceInfo }
     * 
     */
    public APIPerformanceInfo createAPIPerformanceInfo() {
        return new APIPerformanceInfo();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link MetadataVersionCheck }
     * 
     */
    public MetadataVersionCheck createMetadataVersionCheck() {
        return new MetadataVersionCheck();
    }

    /**
     * Create an instance of {@link Fact }
     * 
     */
    public Fact createFact() {
        return new Fact();
    }

    /**
     * Create an instance of {@link DebuggingHeader }
     * 
     */
    public DebuggingHeader createDebuggingHeader() {
        return new DebuggingHeader();
    }

    /**
     * Create an instance of {@link LogInfo }
     * 
     */
    public LogInfo createLogInfo() {
        return new LogInfo();
    }

    /**
     * Create an instance of {@link DebuggingInfo }
     * 
     */
    public DebuggingInfo createDebuggingInfo() {
        return new DebuggingInfo();
    }

    /**
     * Create an instance of {@link PackageVersionHeader }
     * 
     */
    public PackageVersionHeader createPackageVersionHeader() {
        return new PackageVersionHeader();
    }

    /**
     * Create an instance of {@link PackageVersion }
     * 
     */
    public PackageVersion createPackageVersion() {
        return new PackageVersion();
    }

    /**
     * Create an instance of {@link AllowFieldTruncationHeader }
     * 
     */
    public AllowFieldTruncationHeader createAllowFieldTruncationHeader() {
        return new AllowFieldTruncationHeader();
    }

    /**
     * Create an instance of {@link DisableFeedTrackingHeader }
     * 
     */
    public DisableFeedTrackingHeader createDisableFeedTrackingHeader() {
        return new DisableFeedTrackingHeader();
    }

    /**
     * Create an instance of {@link StreamingEnabledHeader }
     * 
     */
    public StreamingEnabledHeader createStreamingEnabledHeader() {
        return new StreamingEnabledHeader();
    }

    /**
     * Create an instance of {@link AllOrNoneHeader }
     * 
     */
    public AllOrNoneHeader createAllOrNoneHeader() {
        return new AllOrNoneHeader();
    }

    /**
     * Create an instance of {@link CurrencyConversionHeader }
     * 
     */
    public CurrencyConversionHeader createCurrencyConversionHeader() {
        return new CurrencyConversionHeader();
    }

    /**
     * Create an instance of {@link DuplicateRuleHeader }
     * 
     */
    public DuplicateRuleHeader createDuplicateRuleHeader() {
        return new DuplicateRuleHeader();
    }

    /**
     * Create an instance of {@link LimitInfoHeader }
     * 
     */
    public LimitInfoHeader createLimitInfoHeader() {
        return new LimitInfoHeader();
    }

    /**
     * Create an instance of {@link LimitInfo }
     * 
     */
    public LimitInfo createLimitInfo() {
        return new LimitInfo();
    }

    /**
     * Create an instance of {@link PatchHeader }
     * 
     */
    public PatchHeader createPatchHeader() {
        return new PatchHeader();
    }

    /**
     * Create an instance of {@link Match }
     * 
     */
    public Match createMatch() {
        return new Match();
    }

    /**
     * Create an instance of {@link MatchOptions }
     * 
     */
    public MatchOptions createMatchOptions() {
        return new MatchOptions();
    }

    /**
     * Create an instance of {@link MatchResponse }
     * 
     */
    public MatchResponse createMatchResponse() {
        return new MatchResponse();
    }

    /**
     * Create an instance of {@link MatchResult }
     * 
     */
    public MatchResult createMatchResult() {
        return new MatchResult();
    }

    /**
     * Create an instance of {@link MruHeader }
     * 
     */
    public MruHeader createMruHeader() {
        return new MruHeader();
    }

    /**
     * Create an instance of {@link EmailHeader }
     * 
     */
    public EmailHeader createEmailHeader() {
        return new EmailHeader();
    }

    /**
     * Create an instance of {@link AssignmentRuleHeader }
     * 
     */
    public AssignmentRuleHeader createAssignmentRuleHeader() {
        return new AssignmentRuleHeader();
    }

    /**
     * Create an instance of {@link ConditionalRequestHeader }
     * 
     */
    public ConditionalRequestHeader createConditionalRequestHeader() {
        return new ConditionalRequestHeader();
    }

    /**
     * Create an instance of {@link UserTerritoryDeleteHeader }
     * 
     */
    public UserTerritoryDeleteHeader createUserTerritoryDeleteHeader() {
        return new UserTerritoryDeleteHeader();
    }

    /**
     * Create an instance of {@link PartnerNetworkHeader }
     * 
     */
    public PartnerNetworkHeader createPartnerNetworkHeader() {
        return new PartnerNetworkHeader();
    }

    /**
     * Create an instance of {@link LocaleOptions }
     * 
     */
    public LocaleOptions createLocaleOptions() {
        return new LocaleOptions();
    }

    /**
     * Create an instance of {@link OwnerChangeOptions }
     * 
     */
    public OwnerChangeOptions createOwnerChangeOptions() {
        return new OwnerChangeOptions();
    }

    /**
     * Create an instance of {@link OwnerChangeOption }
     * 
     */
    public OwnerChangeOption createOwnerChangeOption() {
        return new OwnerChangeOption();
    }

    /**
     * Create an instance of {@link CommonEventRequestInformation }
     * 
     */
    public CommonEventRequestInformation createCommonEventRequestInformation() {
        return new CommonEventRequestInformation();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link SearchRecord }
     * 
     */
    public SearchRecord createSearchRecord() {
        return new SearchRecord();
    }

    /**
     * Create an instance of {@link SearchRecordMetadata }
     * 
     */
    public SearchRecordMetadata createSearchRecordMetadata() {
        return new SearchRecordMetadata();
    }

    /**
     * Create an instance of {@link SearchSnippet }
     * 
     */
    public SearchSnippet createSearchSnippet() {
        return new SearchSnippet();
    }

    /**
     * Create an instance of {@link SearchResultsMetadata }
     * 
     */
    public SearchResultsMetadata createSearchResultsMetadata() {
        return new SearchResultsMetadata();
    }

    /**
     * Create an instance of {@link LabelsSearchMetadata }
     * 
     */
    public LabelsSearchMetadata createLabelsSearchMetadata() {
        return new LabelsSearchMetadata();
    }

    /**
     * Create an instance of {@link EntitySearchMetadata }
     * 
     */
    public EntitySearchMetadata createEntitySearchMetadata() {
        return new EntitySearchMetadata();
    }

    /**
     * Create an instance of {@link FieldLevelSearchMetadata }
     * 
     */
    public FieldLevelSearchMetadata createFieldLevelSearchMetadata() {
        return new FieldLevelSearchMetadata();
    }

    /**
     * Create an instance of {@link EntitySpellCorrectionMetadata }
     * 
     */
    public EntitySpellCorrectionMetadata createEntitySpellCorrectionMetadata() {
        return new EntitySpellCorrectionMetadata();
    }

    /**
     * Create an instance of {@link EntitySearchPromotionMetadata }
     * 
     */
    public EntitySearchPromotionMetadata createEntitySearchPromotionMetadata() {
        return new EntitySearchPromotionMetadata();
    }

    /**
     * Create an instance of {@link EntityIntentQueryMetadata }
     * 
     */
    public EntityIntentQueryMetadata createEntityIntentQueryMetadata() {
        return new EntityIntentQueryMetadata();
    }

    /**
     * Create an instance of {@link EntityErrorMetadata }
     * 
     */
    public EntityErrorMetadata createEntityErrorMetadata() {
        return new EntityErrorMetadata();
    }

    /**
     * Create an instance of {@link RelationshipReferenceTo }
     * 
     */
    public RelationshipReferenceTo createRelationshipReferenceTo() {
        return new RelationshipReferenceTo();
    }

    /**
     * Create an instance of {@link RecordTypesSupported }
     * 
     */
    public RecordTypesSupported createRecordTypesSupported() {
        return new RecordTypesSupported();
    }

    /**
     * Create an instance of {@link JunctionIdListNames }
     * 
     */
    public JunctionIdListNames createJunctionIdListNames() {
        return new JunctionIdListNames();
    }

    /**
     * Create an instance of {@link SearchLayoutButtonsDisplayed }
     * 
     */
    public SearchLayoutButtonsDisplayed createSearchLayoutButtonsDisplayed() {
        return new SearchLayoutButtonsDisplayed();
    }

    /**
     * Create an instance of {@link SearchLayoutButton }
     * 
     */
    public SearchLayoutButton createSearchLayoutButton() {
        return new SearchLayoutButton();
    }

    /**
     * Create an instance of {@link SearchLayoutFieldsDisplayed }
     * 
     */
    public SearchLayoutFieldsDisplayed createSearchLayoutFieldsDisplayed() {
        return new SearchLayoutFieldsDisplayed();
    }

    /**
     * Create an instance of {@link SearchLayoutField }
     * 
     */
    public SearchLayoutField createSearchLayoutField() {
        return new SearchLayoutField();
    }

    /**
     * Create an instance of {@link NameObjectValuePair }
     * 
     */
    public NameObjectValuePair createNameObjectValuePair() {
        return new NameObjectValuePair();
    }

    /**
     * Create an instance of {@link FlowInterviewAction }
     * 
     */
    public FlowInterviewAction createFlowInterviewAction() {
        return new FlowInterviewAction();
    }

    /**
     * Create an instance of {@link FlowInterviewScreenField }
     * 
     */
    public FlowInterviewScreenField createFlowInterviewScreenField() {
        return new FlowInterviewScreenField();
    }

    /**
     * Create an instance of {@link FlowInterviewScreenFieldInput }
     * 
     */
    public FlowInterviewScreenFieldInput createFlowInterviewScreenFieldInput() {
        return new FlowInterviewScreenFieldInput();
    }

    /**
     * Create an instance of {@link FlowInterviewScreenFieldOutput }
     * 
     */
    public FlowInterviewScreenFieldOutput createFlowInterviewScreenFieldOutput() {
        return new FlowInterviewScreenFieldOutput();
    }

    /**
     * Create an instance of {@link FlowInterviewLocalActionInput }
     * 
     */
    public FlowInterviewLocalActionInput createFlowInterviewLocalActionInput() {
        return new FlowInterviewLocalActionInput();
    }

    /**
     * Create an instance of {@link FlowInterviewLocalActionOutput }
     * 
     */
    public FlowInterviewLocalActionOutput createFlowInterviewLocalActionOutput() {
        return new FlowInterviewLocalActionOutput();
    }

    /**
     * Create an instance of {@link FlowInterviewMetadataValue }
     * 
     */
    public FlowInterviewMetadataValue createFlowInterviewMetadataValue() {
        return new FlowInterviewMetadataValue();
    }

    /**
     * Create an instance of {@link FlowInterviewChoice }
     * 
     */
    public FlowInterviewChoice createFlowInterviewChoice() {
        return new FlowInterviewChoice();
    }

    /**
     * Create an instance of {@link FlowInterviewChoiceUserInput }
     * 
     */
    public FlowInterviewChoiceUserInput createFlowInterviewChoiceUserInput() {
        return new FlowInterviewChoiceUserInput();
    }

    /**
     * Create an instance of {@link FlowInterviewOutputVariable }
     * 
     */
    public FlowInterviewOutputVariable createFlowInterviewOutputVariable() {
        return new FlowInterviewOutputVariable();
    }

    /**
     * Create an instance of {@link FlowInterviewStage }
     * 
     */
    public FlowInterviewStage createFlowInterviewStage() {
        return new FlowInterviewStage();
    }

    /**
     * Create an instance of {@link FlowInterviewDebugInput }
     * 
     */
    public FlowInterviewDebugInput createFlowInterviewDebugInput() {
        return new FlowInterviewDebugInput();
    }

    /**
     * Create an instance of {@link FlowInterviewDebugOutput }
     * 
     */
    public FlowInterviewDebugOutput createFlowInterviewDebugOutput() {
        return new FlowInterviewDebugOutput();
    }

    /**
     * Create an instance of {@link DeletedRecord }
     * 
     */
    public DeletedRecord createDeletedRecord() {
        return new DeletedRecord();
    }

    /**
     * Create an instance of {@link AccessMapping }
     * 
     */
    public AccessMapping createAccessMapping() {
        return new AccessMapping();
    }

    /**
     * Create an instance of {@link ExtendedErrorDetails }
     * 
     */
    public ExtendedErrorDetails createExtendedErrorDetails() {
        return new ExtendedErrorDetails();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link SendEmailError }
     * 
     */
    public SendEmailError createSendEmailError() {
        return new SendEmailError();
    }

    /**
     * Create an instance of {@link RenderEmailTemplateError }
     * 
     */
    public RenderEmailTemplateError createRenderEmailTemplateError() {
        return new RenderEmailTemplateError();
    }

    /**
     * Create an instance of {@link ProcessSubmitRequest }
     * 
     */
    public ProcessSubmitRequest createProcessSubmitRequest() {
        return new ProcessSubmitRequest();
    }

    /**
     * Create an instance of {@link ProcessWorkitemRequest }
     * 
     */
    public ProcessWorkitemRequest createProcessWorkitemRequest() {
        return new ProcessWorkitemRequest();
    }

    /**
     * Create an instance of {@link DescribeQuickActionDefaultValue }
     * 
     */
    public DescribeQuickActionDefaultValue createDescribeQuickActionDefaultValue() {
        return new DescribeQuickActionDefaultValue();
    }

    /**
     * Create an instance of {@link ProcessArticleRequest }
     * 
     */
    public ProcessArticleRequest createProcessArticleRequest() {
        return new ProcessArticleRequest();
    }

    /**
     * Create an instance of {@link AllowedWorkitemAction }
     * 
     */
    public AllowedWorkitemAction createAllowedWorkitemAction() {
        return new AllowedWorkitemAction();
    }

    /**
     * Create an instance of {@link DescribeGlobalSObjectResult }
     * 
     */
    public DescribeGlobalSObjectResult createDescribeGlobalSObjectResult() {
        return new DescribeGlobalSObjectResult();
    }

    /**
     * Create an instance of {@link ChildRelationship }
     * 
     */
    public ChildRelationship createChildRelationship() {
        return new ChildRelationship();
    }

    /**
     * Create an instance of {@link ScopeInfo }
     * 
     */
    public ScopeInfo createScopeInfo() {
        return new ScopeInfo();
    }

    /**
     * Create an instance of {@link DurableIdList }
     * 
     */
    public DurableIdList createDurableIdList() {
        return new DurableIdList();
    }

    /**
     * Create an instance of {@link StringList }
     * 
     */
    public StringList createStringList() {
        return new StringList();
    }

    /**
     * Create an instance of {@link ChangeEventHeader }
     * 
     */
    public ChangeEventHeader createChangeEventHeader() {
        return new ChangeEventHeader();
    }

    /**
     * Create an instance of {@link FilteredLookupInfo }
     * 
     */
    public FilteredLookupInfo createFilteredLookupInfo() {
        return new FilteredLookupInfo();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link PicklistEntry }
     * 
     */
    public PicklistEntry createPicklistEntry() {
        return new PicklistEntry();
    }

    /**
     * Create an instance of {@link DataCategory }
     * 
     */
    public DataCategory createDataCategory() {
        return new DataCategory();
    }

    /**
     * Create an instance of {@link KnowledgeLanguageItem }
     * 
     */
    public KnowledgeLanguageItem createKnowledgeLanguageItem() {
        return new KnowledgeLanguageItem();
    }

    /**
     * Create an instance of {@link FieldDiff }
     * 
     */
    public FieldDiff createFieldDiff() {
        return new FieldDiff();
    }

    /**
     * Create an instance of {@link AdditionalInformationMap }
     * 
     */
    public AdditionalInformationMap createAdditionalInformationMap() {
        return new AdditionalInformationMap();
    }

    /**
     * Create an instance of {@link MatchRecord }
     * 
     */
    public MatchRecord createMatchRecord() {
        return new MatchRecord();
    }

    /**
     * Create an instance of {@link DuplicateResult }
     * 
     */
    public DuplicateResult createDuplicateResult() {
        return new DuplicateResult();
    }

    /**
     * Create an instance of {@link DuplicateError }
     * 
     */
    public DuplicateError createDuplicateError() {
        return new DuplicateError();
    }

    /**
     * Create an instance of {@link NameCaseValue }
     * 
     */
    public NameCaseValue createNameCaseValue() {
        return new NameCaseValue();
    }

    /**
     * Create an instance of {@link ObjectMapping }
     * 
     */
    public ObjectMapping createObjectMapping() {
        return new ObjectMapping();
    }

    /**
     * Create an instance of {@link ObjectMappingField }
     * 
     */
    public ObjectMappingField createObjectMappingField() {
        return new ObjectMappingField();
    }

    /**
     * Create an instance of {@link DuplicateRuleFilter }
     * 
     */
    public DuplicateRuleFilter createDuplicateRuleFilter() {
        return new DuplicateRuleFilter();
    }

    /**
     * Create an instance of {@link DuplicateRuleFilterItem }
     * 
     */
    public DuplicateRuleFilterItem createDuplicateRuleFilterItem() {
        return new DuplicateRuleFilterItem();
    }

    /**
     * Create an instance of {@link DuplicateRuleMatchInfo }
     * 
     */
    public DuplicateRuleMatchInfo createDuplicateRuleMatchInfo() {
        return new DuplicateRuleMatchInfo();
    }

    /**
     * Create an instance of {@link DescribeFlexiPageRegion }
     * 
     */
    public DescribeFlexiPageRegion createDescribeFlexiPageRegion() {
        return new DescribeFlexiPageRegion();
    }

    /**
     * Create an instance of {@link DescribeComponentInstance }
     * 
     */
    public DescribeComponentInstance createDescribeComponentInstance() {
        return new DescribeComponentInstance();
    }

    /**
     * Create an instance of {@link DescribeComponentInstanceProperty }
     * 
     */
    public DescribeComponentInstanceProperty createDescribeComponentInstanceProperty() {
        return new DescribeComponentInstanceProperty();
    }

    /**
     * Create an instance of {@link DescribeAppMenuItem }
     * 
     */
    public DescribeAppMenuItem createDescribeAppMenuItem() {
        return new DescribeAppMenuItem();
    }

    /**
     * Create an instance of {@link DescribeThemeItem }
     * 
     */
    public DescribeThemeItem createDescribeThemeItem() {
        return new DescribeThemeItem();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutCallType }
     * 
     */
    public DescribeSoftphoneLayoutCallType createDescribeSoftphoneLayoutCallType() {
        return new DescribeSoftphoneLayoutCallType();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneScreenPopOption }
     * 
     */
    public DescribeSoftphoneScreenPopOption createDescribeSoftphoneScreenPopOption() {
        return new DescribeSoftphoneScreenPopOption();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutInfoField }
     * 
     */
    public DescribeSoftphoneLayoutInfoField createDescribeSoftphoneLayoutInfoField() {
        return new DescribeSoftphoneLayoutInfoField();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutSection }
     * 
     */
    public DescribeSoftphoneLayoutSection createDescribeSoftphoneLayoutSection() {
        return new DescribeSoftphoneLayoutSection();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutItem }
     * 
     */
    public DescribeSoftphoneLayoutItem createDescribeSoftphoneLayoutItem() {
        return new DescribeSoftphoneLayoutItem();
    }

    /**
     * Create an instance of {@link RecordTypeCompactLayoutMapping }
     * 
     */
    public RecordTypeCompactLayoutMapping createRecordTypeCompactLayoutMapping() {
        return new RecordTypeCompactLayoutMapping();
    }

    /**
     * Create an instance of {@link DescribePathAssistant }
     * 
     */
    public DescribePathAssistant createDescribePathAssistant() {
        return new DescribePathAssistant();
    }

    /**
     * Create an instance of {@link DescribePathAssistantStep }
     * 
     */
    public DescribePathAssistantStep createDescribePathAssistantStep() {
        return new DescribePathAssistantStep();
    }

    /**
     * Create an instance of {@link DescribePathAssistantField }
     * 
     */
    public DescribePathAssistantField createDescribePathAssistantField() {
        return new DescribePathAssistantField();
    }

    /**
     * Create an instance of {@link DescribeAnimationRule }
     * 
     */
    public DescribeAnimationRule createDescribeAnimationRule() {
        return new DescribeAnimationRule();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayout2 }
     * 
     */
    public DescribeApprovalLayout2 createDescribeApprovalLayout2() {
        return new DescribeApprovalLayout2();
    }

    /**
     * Create an instance of {@link DescribeLayout2 }
     * 
     */
    public DescribeLayout2 createDescribeLayout2() {
        return new DescribeLayout2();
    }

    /**
     * Create an instance of {@link DescribeQuickActionListResult }
     * 
     */
    public DescribeQuickActionListResult createDescribeQuickActionListResult() {
        return new DescribeQuickActionListResult();
    }

    /**
     * Create an instance of {@link DescribeQuickActionListItemResult }
     * 
     */
    public DescribeQuickActionListItemResult createDescribeQuickActionListItemResult() {
        return new DescribeQuickActionListItemResult();
    }

    /**
     * Create an instance of {@link DescribeLayoutFeedView }
     * 
     */
    public DescribeLayoutFeedView createDescribeLayoutFeedView() {
        return new DescribeLayoutFeedView();
    }

    /**
     * Create an instance of {@link DescribeLayoutFeedFilter }
     * 
     */
    public DescribeLayoutFeedFilter createDescribeLayoutFeedFilter() {
        return new DescribeLayoutFeedFilter();
    }

    /**
     * Create an instance of {@link DescribeLayoutSaveOption }
     * 
     */
    public DescribeLayoutSaveOption createDescribeLayoutSaveOption() {
        return new DescribeLayoutSaveOption();
    }

    /**
     * Create an instance of {@link DescribeLayoutSection }
     * 
     */
    public DescribeLayoutSection createDescribeLayoutSection() {
        return new DescribeLayoutSection();
    }

    /**
     * Create an instance of {@link DescribeLayoutButtonSection }
     * 
     */
    public DescribeLayoutButtonSection createDescribeLayoutButtonSection() {
        return new DescribeLayoutButtonSection();
    }

    /**
     * Create an instance of {@link DescribeLayoutRow }
     * 
     */
    public DescribeLayoutRow createDescribeLayoutRow() {
        return new DescribeLayoutRow();
    }

    /**
     * Create an instance of {@link DescribeLayoutItem }
     * 
     */
    public DescribeLayoutItem createDescribeLayoutItem() {
        return new DescribeLayoutItem();
    }

    /**
     * Create an instance of {@link DescribeLayoutButton }
     * 
     */
    public DescribeLayoutButton createDescribeLayoutButton() {
        return new DescribeLayoutButton();
    }

    /**
     * Create an instance of {@link DescribeLayoutComponent }
     * 
     */
    public DescribeLayoutComponent createDescribeLayoutComponent() {
        return new DescribeLayoutComponent();
    }

    /**
     * Create an instance of {@link FieldComponent }
     * 
     */
    public FieldComponent createFieldComponent() {
        return new FieldComponent();
    }

    /**
     * Create an instance of {@link FieldLayoutComponent }
     * 
     */
    public FieldLayoutComponent createFieldLayoutComponent() {
        return new FieldLayoutComponent();
    }

    /**
     * Create an instance of {@link VisualforcePage }
     * 
     */
    public VisualforcePage createVisualforcePage() {
        return new VisualforcePage();
    }

    /**
     * Create an instance of {@link Canvas }
     * 
     */
    public Canvas createCanvas() {
        return new Canvas();
    }

    /**
     * Create an instance of {@link ReportChartComponent }
     * 
     */
    public ReportChartComponent createReportChartComponent() {
        return new ReportChartComponent();
    }

    /**
     * Create an instance of {@link AnalyticsCloudComponent }
     * 
     */
    public AnalyticsCloudComponent createAnalyticsCloudComponent() {
        return new AnalyticsCloudComponent();
    }

    /**
     * Create an instance of {@link FieldCriteria }
     * 
     */
    public FieldCriteria createFieldCriteria() {
        return new FieldCriteria();
    }

    /**
     * Create an instance of {@link FieldCriterion }
     * 
     */
    public FieldCriterion createFieldCriterion() {
        return new FieldCriterion();
    }

    /**
     * Create an instance of {@link CustomLinkComponent }
     * 
     */
    public CustomLinkComponent createCustomLinkComponent() {
        return new CustomLinkComponent();
    }

    /**
     * Create an instance of {@link NamedLayoutInfo }
     * 
     */
    public NamedLayoutInfo createNamedLayoutInfo() {
        return new NamedLayoutInfo();
    }

    /**
     * Create an instance of {@link RecordTypeInfo }
     * 
     */
    public RecordTypeInfo createRecordTypeInfo() {
        return new RecordTypeInfo();
    }

    /**
     * Create an instance of {@link RecordTypeMapping }
     * 
     */
    public RecordTypeMapping createRecordTypeMapping() {
        return new RecordTypeMapping();
    }

    /**
     * Create an instance of {@link PicklistForRecordType }
     * 
     */
    public PicklistForRecordType createPicklistForRecordType() {
        return new PicklistForRecordType();
    }

    /**
     * Create an instance of {@link RelatedContent }
     * 
     */
    public RelatedContent createRelatedContent() {
        return new RelatedContent();
    }

    /**
     * Create an instance of {@link DescribeRelatedContentItem }
     * 
     */
    public DescribeRelatedContentItem createDescribeRelatedContentItem() {
        return new DescribeRelatedContentItem();
    }

    /**
     * Create an instance of {@link RelatedList }
     * 
     */
    public RelatedList createRelatedList() {
        return new RelatedList();
    }

    /**
     * Create an instance of {@link RelatedListColumn }
     * 
     */
    public RelatedListColumn createRelatedListColumn() {
        return new RelatedListColumn();
    }

    /**
     * Create an instance of {@link RelatedListSort }
     * 
     */
    public RelatedListSort createRelatedListSort() {
        return new RelatedListSort();
    }

    /**
     * Create an instance of {@link OfflineLink }
     * 
     */
    public OfflineLink createOfflineLink() {
        return new OfflineLink();
    }

    /**
     * Create an instance of {@link EmailAttachment }
     * 
     */
    public EmailAttachment createEmailAttachment() {
        return new EmailAttachment();
    }

    /**
     * Create an instance of {@link EmailFileAttachment }
     * 
     */
    public EmailFileAttachment createEmailFileAttachment() {
        return new EmailFileAttachment();
    }

    /**
     * Create an instance of {@link MassEmailMessage }
     * 
     */
    public MassEmailMessage createMassEmailMessage() {
        return new MassEmailMessage();
    }

    /**
     * Create an instance of {@link SingleEmailMessage }
     * 
     */
    public SingleEmailMessage createSingleEmailMessage() {
        return new SingleEmailMessage();
    }

    /**
     * Create an instance of {@link DescribeListView }
     * 
     */
    public DescribeListView createDescribeListView() {
        return new DescribeListView();
    }

    /**
     * Create an instance of {@link DescribeFilter }
     * 
     */
    public DescribeFilter createDescribeFilter() {
        return new DescribeFilter();
    }

    /**
     * Create an instance of {@link DescribeColumn }
     * 
     */
    public DescribeColumn createDescribeColumn() {
        return new DescribeColumn();
    }

    /**
     * Create an instance of {@link DescribeSort }
     * 
     */
    public DescribeSort createDescribeSort() {
        return new DescribeSort();
    }

    /**
     * Create an instance of {@link ListViewColumn }
     * 
     */
    public ListViewColumn createListViewColumn() {
        return new ListViewColumn();
    }

    /**
     * Create an instance of {@link ListViewOrderBy }
     * 
     */
    public ListViewOrderBy createListViewOrderBy() {
        return new ListViewOrderBy();
    }

    /**
     * Create an instance of {@link DescribeSoqlListView }
     * 
     */
    public DescribeSoqlListView createDescribeSoqlListView() {
        return new DescribeSoqlListView();
    }

    /**
     * Create an instance of {@link DescribeSoqlListViewParams }
     * 
     */
    public DescribeSoqlListViewParams createDescribeSoqlListViewParams() {
        return new DescribeSoqlListViewParams();
    }

    /**
     * Create an instance of {@link ListViewRecord }
     * 
     */
    public ListViewRecord createListViewRecord() {
        return new ListViewRecord();
    }

    /**
     * Create an instance of {@link ListViewRecordColumn }
     * 
     */
    public ListViewRecordColumn createListViewRecordColumn() {
        return new ListViewRecordColumn();
    }

    /**
     * Create an instance of {@link SoqlWhereCondition }
     * 
     */
    public SoqlWhereCondition createSoqlWhereCondition() {
        return new SoqlWhereCondition();
    }

    /**
     * Create an instance of {@link SoqlCondition }
     * 
     */
    public SoqlCondition createSoqlCondition() {
        return new SoqlCondition();
    }

    /**
     * Create an instance of {@link SoqlNotCondition }
     * 
     */
    public SoqlNotCondition createSoqlNotCondition() {
        return new SoqlNotCondition();
    }

    /**
     * Create an instance of {@link SoqlConditionGroup }
     * 
     */
    public SoqlConditionGroup createSoqlConditionGroup() {
        return new SoqlConditionGroup();
    }

    /**
     * Create an instance of {@link SoqlSubQueryCondition }
     * 
     */
    public SoqlSubQueryCondition createSoqlSubQueryCondition() {
        return new SoqlSubQueryCondition();
    }

    /**
     * Create an instance of {@link DescribeColor }
     * 
     */
    public DescribeColor createDescribeColor() {
        return new DescribeColor();
    }

    /**
     * Create an instance of {@link DescribeIcon }
     * 
     */
    public DescribeIcon createDescribeIcon() {
        return new DescribeIcon();
    }

    /**
     * Create an instance of {@link ActionOverride }
     * 
     */
    public ActionOverride createActionOverride() {
        return new ActionOverride();
    }

    /**
     * Create an instance of {@link SnapshotItem }
     * 
     */
    public SnapshotItem createSnapshotItem() {
        return new SnapshotItem();
    }

    /**
     * Create an instance of {@link EmailSyncAdvancedSetting }
     * 
     */
    public EmailSyncAdvancedSetting createEmailSyncAdvancedSetting() {
        return new EmailSyncAdvancedSetting();
    }

    /**
     * Create an instance of {@link EmailSyncEntity }
     * 
     */
    public EmailSyncEntity createEmailSyncEntity() {
        return new EmailSyncEntity();
    }

    /**
     * Create an instance of {@link EmailSyncFieldMapping }
     * 
     */
    public EmailSyncFieldMapping createEmailSyncFieldMapping() {
        return new EmailSyncFieldMapping();
    }

    /**
     * Create an instance of {@link EmailSyncFieldValueMapping }
     * 
     */
    public EmailSyncFieldValueMapping createEmailSyncFieldValueMapping() {
        return new EmailSyncFieldValueMapping();
    }

    /**
     * Create an instance of {@link EmailSyncRoutingAddress }
     * 
     */
    public EmailSyncRoutingAddress createEmailSyncRoutingAddress() {
        return new EmailSyncRoutingAddress();
    }

    /**
     * Create an instance of {@link DescribeEmailSyncSettings }
     * 
     */
    public DescribeEmailSyncSettings createDescribeEmailSyncSettings() {
        return new DescribeEmailSyncSettings();
    }

    /**
     * Create an instance of {@link DescribeMobileSObject }
     * 
     */
    public DescribeMobileSObject createDescribeMobileSObject() {
        return new DescribeMobileSObject();
    }

    /**
     * Create an instance of {@link DescribeMobileView }
     * 
     */
    public DescribeMobileView createDescribeMobileView() {
        return new DescribeMobileView();
    }

    /**
     * Create an instance of {@link DescribeMobileViewDispColumn }
     * 
     */
    public DescribeMobileViewDispColumn createDescribeMobileViewDispColumn() {
        return new DescribeMobileViewDispColumn();
    }

    /**
     * Create an instance of {@link DescribeMobileViewFilter }
     * 
     */
    public DescribeMobileViewFilter createDescribeMobileViewFilter() {
        return new DescribeMobileViewFilter();
    }

    /**
     * Create an instance of {@link DescribeMobileViewSortOrder }
     * 
     */
    public DescribeMobileViewSortOrder createDescribeMobileViewSortOrder() {
        return new DescribeMobileViewSortOrder();
    }

    /**
     * Create an instance of {@link DescribeMobileSettings }
     * 
     */
    public DescribeMobileSettings createDescribeMobileSettings() {
        return new DescribeMobileSettings();
    }

    /**
     * Create an instance of {@link RenderEmailTemplateBodyResult }
     * 
     */
    public RenderEmailTemplateBodyResult createRenderEmailTemplateBodyResult() {
        return new RenderEmailTemplateBodyResult();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link LoginFault }
     * 
     */
    public LoginFault createLoginFault() {
        return new LoginFault();
    }

    /**
     * Create an instance of {@link InvalidQueryLocatorFault }
     * 
     */
    public InvalidQueryLocatorFault createInvalidQueryLocatorFault() {
        return new InvalidQueryLocatorFault();
    }

    /**
     * Create an instance of {@link InvalidNewPasswordFault }
     * 
     */
    public InvalidNewPasswordFault createInvalidNewPasswordFault() {
        return new InvalidNewPasswordFault();
    }

    /**
     * Create an instance of {@link InvalidOldPasswordFault }
     * 
     */
    public InvalidOldPasswordFault createInvalidOldPasswordFault() {
        return new InvalidOldPasswordFault();
    }

    /**
     * Create an instance of {@link InvalidIdFault }
     * 
     */
    public InvalidIdFault createInvalidIdFault() {
        return new InvalidIdFault();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFault }
     * 
     */
    public UnexpectedErrorFault createUnexpectedErrorFault() {
        return new UnexpectedErrorFault();
    }

    /**
     * Create an instance of {@link InvalidFieldFault }
     * 
     */
    public InvalidFieldFault createInvalidFieldFault() {
        return new InvalidFieldFault();
    }

    /**
     * Create an instance of {@link ApiQueryFault }
     * 
     */
    public ApiQueryFault createApiQueryFault() {
        return new ApiQueryFault();
    }

    /**
     * Create an instance of {@link InvalidSObjectFault }
     * 
     */
    public InvalidSObjectFault createInvalidSObjectFault() {
        return new InvalidSObjectFault();
    }

    /**
     * Create an instance of {@link MalformedQueryFault }
     * 
     */
    public MalformedQueryFault createMalformedQueryFault() {
        return new MalformedQueryFault();
    }

    /**
     * Create an instance of {@link MalformedSearchFault }
     * 
     */
    public MalformedSearchFault createMalformedSearchFault() {
        return new MalformedSearchFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "fault")
    public JAXBElement<ApiFault> createFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_Fault_QNAME, ApiFault.class, null, value);
    }

}
