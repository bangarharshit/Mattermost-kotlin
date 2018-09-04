# ComplianceApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complianceReportsGet**](ComplianceApi.md#complianceReportsGet) | **GET** /compliance/reports | Get reports
[**complianceReportsPost**](ComplianceApi.md#complianceReportsPost) | **POST** /compliance/reports | Create report
[**complianceReportsReportIdDownloadGet**](ComplianceApi.md#complianceReportsReportIdDownloadGet) | **GET** /compliance/reports/{report_id}/download | Download a report
[**complianceReportsReportIdGet**](ComplianceApi.md#complianceReportsReportIdGet) | **GET** /compliance/reports/{report_id} | Get a report


<a name="complianceReportsGet"></a>
# **complianceReportsGet**
> kotlin.Array&lt;Compliance&gt; complianceReportsGet(page, perPage)

Get reports

Get a list of compliance reports previously created by page, selected with &#x60;page&#x60; and &#x60;per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ComplianceApi()
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of reports per page.
try {
    val result : kotlin.Array<Compliance> = apiInstance.complianceReportsGet(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ComplianceApi#complianceReportsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ComplianceApi#complianceReportsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of reports per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;Compliance&gt;**](Compliance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="complianceReportsPost"></a>
# **complianceReportsPost**
> Compliance complianceReportsPost()

Create report

Create and save a compliance report. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ComplianceApi()
try {
    val result : Compliance = apiInstance.complianceReportsPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ComplianceApi#complianceReportsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ComplianceApi#complianceReportsPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Compliance**](Compliance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="complianceReportsReportIdDownloadGet"></a>
# **complianceReportsReportIdDownloadGet**
> complianceReportsReportIdDownloadGet(reportId)

Download a report

Download the full contents of a report as a file. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ComplianceApi()
val reportId : kotlin.String = reportId_example // kotlin.String | Compliance report GUID
try {
    apiInstance.complianceReportsReportIdDownloadGet(reportId)
} catch (e: ClientException) {
    println("4xx response calling ComplianceApi#complianceReportsReportIdDownloadGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ComplianceApi#complianceReportsReportIdDownloadGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **kotlin.String**| Compliance report GUID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="complianceReportsReportIdGet"></a>
# **complianceReportsReportIdGet**
> Compliance complianceReportsReportIdGet(reportId)

Get a report

Get a compliance reports previously created. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ComplianceApi()
val reportId : kotlin.String = reportId_example // kotlin.String | Compliance report GUID
try {
    val result : Compliance = apiInstance.complianceReportsReportIdGet(reportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ComplianceApi#complianceReportsReportIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ComplianceApi#complianceReportsReportIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **kotlin.String**| Compliance report GUID |

### Return type

[**Compliance**](Compliance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

