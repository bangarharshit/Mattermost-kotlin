# JobsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobsGet**](JobsApi.md#jobsGet) | **GET** /jobs | Get the jobs.
[**jobsJobIdCancelPost**](JobsApi.md#jobsJobIdCancelPost) | **POST** /jobs/{job_id}/cancel | Cancel a job.
[**jobsJobIdGet**](JobsApi.md#jobsJobIdGet) | **GET** /jobs/{job_id} | Get a job.
[**jobsPost**](JobsApi.md#jobsPost) | **POST** /jobs | Create a new job.
[**jobsTypeTypeGet**](JobsApi.md#jobsTypeTypeGet) | **GET** /jobs/type/{type} | Get the jobs of the given type.


<a name="jobsGet"></a>
# **jobsGet**
> kotlin.Array&lt;Job&gt; jobsGet(page, perPage)

Get the jobs.

Get a page of jobs. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = JobsApi()
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of jobs per page.
try {
    val result : kotlin.Array<Job> = apiInstance.jobsGet(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of jobs per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;Job&gt;**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jobsJobIdCancelPost"></a>
# **jobsJobIdCancelPost**
> StatusOK jobsJobIdCancelPost(jobId)

Cancel a job.

Cancel a job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = JobsApi()
val jobId : kotlin.String = jobId_example // kotlin.String | Job GUID
try {
    val result : StatusOK = apiInstance.jobsJobIdCancelPost(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobsJobIdCancelPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobsJobIdCancelPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **kotlin.String**| Job GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jobsJobIdGet"></a>
# **jobsJobIdGet**
> Job jobsJobIdGet(jobId)

Get a job.

Gets a single job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = JobsApi()
val jobId : kotlin.String = jobId_example // kotlin.String | Job GUID
try {
    val result : Job = apiInstance.jobsJobIdGet(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobsJobIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobsJobIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **kotlin.String**| Job GUID |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jobsPost"></a>
# **jobsPost**
> Job jobsPost(body)

Create a new job.

Create a new job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = JobsApi()
val body : Body_31 =  // Body_31 | Job object to be created
try {
    val result : Job = apiInstance.jobsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_31**](Body_31.md)| Job object to be created |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jobsTypeTypeGet"></a>
# **jobsTypeTypeGet**
> kotlin.Array&lt;Job&gt; jobsTypeTypeGet(type, page, perPage)

Get the jobs of the given type.

Get a page of jobs of the given type. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = JobsApi()
val type : kotlin.String = type_example // kotlin.String | Job type
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of jobs per page.
try {
    val result : kotlin.Array<Job> = apiInstance.jobsTypeTypeGet(type, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobsApi#jobsTypeTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobsApi#jobsTypeTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| Job type |
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of jobs per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;Job&gt;**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

