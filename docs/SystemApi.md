# SystemApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsOldGet**](SystemApi.md#analyticsOldGet) | **GET** /analytics/old | Get analytics
[**auditsGet**](SystemApi.md#auditsGet) | **GET** /audits | Get audits
[**cachesInvalidatePost**](SystemApi.md#cachesInvalidatePost) | **POST** /caches/invalidate | Invalidate all the caches
[**configClientGet**](SystemApi.md#configClientGet) | **GET** /config/client | Get client configuration
[**configGet**](SystemApi.md#configGet) | **GET** /config | Get configuration
[**configPut**](SystemApi.md#configPut) | **PUT** /config | Update configuration
[**configReloadPost**](SystemApi.md#configReloadPost) | **POST** /config/reload | Reload configuration
[**databaseRecyclePost**](SystemApi.md#databaseRecyclePost) | **POST** /database/recycle | Recycle database connections
[**emailTestPost**](SystemApi.md#emailTestPost) | **POST** /email/test | Send a test email
[**licenseClientGet**](SystemApi.md#licenseClientGet) | **GET** /license/client | Get client license
[**licenseDelete**](SystemApi.md#licenseDelete) | **DELETE** /license | Remove license file
[**licensePost**](SystemApi.md#licensePost) | **POST** /license | Upload license file
[**logsGet**](SystemApi.md#logsGet) | **GET** /logs | Get logs
[**logsPost**](SystemApi.md#logsPost) | **POST** /logs | Add log message
[**systemPingGet**](SystemApi.md#systemPingGet) | **GET** /system/ping | Check system health
[**webrtcTokenGet**](SystemApi.md#webrtcTokenGet) | **GET** /webrtc/token | Get WebRTC token


<a name="analyticsOldGet"></a>
# **analyticsOldGet**
> analyticsOldGet(name, teamId)

Get analytics

Get some analytics data about the system. This endpoint uses the old format, the &#x60;/analytics&#x60; route is reserved for the new format when it gets implemented.  The returned JSON changes based on the &#x60;name&#x60; query parameter but is always key/value pairs.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
val name : kotlin.String = name_example // kotlin.String | Possible values are \"standard\", \"post_counts_day\", \"user_counts_with_posts_day\" or \"extra_counts\"
val teamId : kotlin.String = teamId_example // kotlin.String | The team ID to filter the data by
try {
    apiInstance.analyticsOldGet(name, teamId)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#analyticsOldGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#analyticsOldGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| Possible values are \&quot;standard\&quot;, \&quot;post_counts_day\&quot;, \&quot;user_counts_with_posts_day\&quot; or \&quot;extra_counts\&quot; | [optional] [default to standard]
 **teamId** | **kotlin.String**| The team ID to filter the data by | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditsGet"></a>
# **auditsGet**
> kotlin.Array&lt;Audit&gt; auditsGet(page, perPage)

Get audits

Get a page of audits for all users on the system, selected with &#x60;page&#x60; and &#x60;per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of audits per page.
try {
    val result : kotlin.Array<Audit> = apiInstance.auditsGet(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#auditsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#auditsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of audits per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;Audit&gt;**](Audit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cachesInvalidatePost"></a>
# **cachesInvalidatePost**
> StatusOK cachesInvalidatePost()

Invalidate all the caches

Purge all the in-memory caches for the Mattermost server. This can have a temporary negative effect on performance while the caches are re-populated. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
try {
    val result : StatusOK = apiInstance.cachesInvalidatePost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#cachesInvalidatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#cachesInvalidatePost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configClientGet"></a>
# **configClientGet**
> configClientGet(format)

Get client configuration

Get a subset of the server configuration needed by the client. ##### Permissions No permission required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
val format : kotlin.String = format_example // kotlin.String | Must be `old`, other formats not implemented yet
try {
    apiInstance.configClientGet(format)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#configClientGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#configClientGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**| Must be &#x60;old&#x60;, other formats not implemented yet |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configGet"></a>
# **configGet**
> Config configGet()

Get configuration

Retrieve the current server configuration ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
try {
    val result : Config = apiInstance.configGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#configGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#configGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Config**](Config.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configPut"></a>
# **configPut**
> Config configPut(body)

Update configuration

Submit a new configuration for the server to use. As of server version 4.8, the &#x60;PluginSettings.EnableUploads&#x60; setting cannot be modified by this endpoint. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
val body : Config =  // Config | Mattermost configuration
try {
    val result : Config = apiInstance.configPut(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#configPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#configPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Config**](Config.md)| Mattermost configuration |

### Return type

[**Config**](Config.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configReloadPost"></a>
# **configReloadPost**
> StatusOK configReloadPost()

Reload configuration

Reload the configuration file to pick up on any changes made to it. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
try {
    val result : StatusOK = apiInstance.configReloadPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#configReloadPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#configReloadPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="databaseRecyclePost"></a>
# **databaseRecyclePost**
> StatusOK databaseRecyclePost()

Recycle database connections

Recycle database connections by closing and reconnecting all connections to master and read replica databases. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
try {
    val result : StatusOK = apiInstance.databaseRecyclePost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#databaseRecyclePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#databaseRecyclePost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailTestPost"></a>
# **emailTestPost**
> StatusOK emailTestPost()

Send a test email

Send a test email to make sure you have your email settings configured correctly. Optionally provide a configuration in the request body to test. If no valid configuration is present in the request body the current server configuration will be tested. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
try {
    val result : StatusOK = apiInstance.emailTestPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#emailTestPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#emailTestPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="licenseClientGet"></a>
# **licenseClientGet**
> licenseClientGet(format)

Get client license

Get a subset of the server license needed by the client. ##### Permissions No permission required but having the &#x60;manage_system&#x60; permission returns more information. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
val format : kotlin.String = format_example // kotlin.String | Must be `old`, other formats not implemented yet
try {
    apiInstance.licenseClientGet(format)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#licenseClientGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#licenseClientGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**| Must be &#x60;old&#x60;, other formats not implemented yet |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="licenseDelete"></a>
# **licenseDelete**
> licenseDelete()

Remove license file

Remove the license file from the server. This will disable all enterprise features.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
try {
    apiInstance.licenseDelete()
} catch (e: ClientException) {
    println("4xx response calling SystemApi#licenseDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#licenseDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="licensePost"></a>
# **licensePost**
> StatusOK licensePost(license)

Upload license file

Upload a license to enable enterprise features.  __Minimum server version__: 4.0  ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
val license : java.io.File = /path/to/file.txt // java.io.File | The license to be uploaded
try {
    val result : StatusOK = apiInstance.licensePost(license)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#licensePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#licensePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **license** | **java.io.File**| The license to be uploaded |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="logsGet"></a>
# **logsGet**
> kotlin.Array&lt;kotlin.String&gt; logsGet(page, logsPerPage)

Get logs

Get a page of server logs, selected with &#x60;page&#x60; and &#x60;logs_per_page&#x60; query parameters. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
val page : kotlin.String = page_example // kotlin.String | The page to select.
val logsPerPage : kotlin.String = logsPerPage_example // kotlin.String | The number of logs per page. There is a maximum limit of 10000 logs per page.
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.logsGet(page, logsPerPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#logsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#logsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **logsPerPage** | **kotlin.String**| The number of logs per page. There is a maximum limit of 10000 logs per page. | [optional] [default to 10000]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logsPost"></a>
# **logsPost**
> kotlin.Any logsPost(body)

Add log message

Add log messages to the server logs. ##### Permissions Users with &#x60;manage_system&#x60; permission can log ERROR or DEBUG messages. Logged in users can log ERROR or DEBUG messages when &#x60;ServiceSettings.EnableDeveloper&#x60; is &#x60;true&#x60; or just DEBUG messages when &#x60;false&#x60;. Non-logged in users can log ERROR or DEBUG messages when &#x60;ServiceSettings.EnableDeveloper&#x60; is &#x60;true&#x60; and cannot log when &#x60;false&#x60;. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
val body : Body_32 =  // Body_32 | 
try {
    val result : kotlin.Any = apiInstance.logsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#logsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#logsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_32**](Body_32.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemPingGet"></a>
# **systemPingGet**
> kotlin.Any systemPingGet()

Check system health

Check if the server is up and healthy based on the configuration setting &#x60;GoRoutineHealthThreshold&#x60;. If &#x60;GoRoutineHealthThreshold&#x60; and the number of goroutines on the server exceeds that threshold the server is considered unhealthy. If &#x60;GoRoutineHealthThreshold&#x60; is not set or the number of goroutines is below the threshold the server is considered healthy. __Minimum server version__: 3.10 ##### Permissions Must be logged in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
try {
    val result : kotlin.Any = apiInstance.systemPingGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#systemPingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#systemPingGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webrtcTokenGet"></a>
# **webrtcTokenGet**
> Inline_response_200_7 webrtcTokenGet()

Get WebRTC token

Get a valid WebRTC token, STUN and TURN server URLs along with TURN credentials to use with the Mattermost WebRTC service. See https://docs.mattermost.com/administration/config-settings.html#webrtc-beta for WebRTC configutation settings. The token returned is for the current user&#39;s session. ##### Permissions Must be authenticated. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SystemApi()
try {
    val result : Inline_response_200_7 = apiInstance.webrtcTokenGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#webrtcTokenGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#webrtcTokenGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Inline_response_200_7**](Inline_response_200_7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

