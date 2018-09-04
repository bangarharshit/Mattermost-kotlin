# StatusApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersStatusIdsGet**](StatusApi.md#usersStatusIdsGet) | **GET** /users/status/ids | Get user statuses by id
[**usersUserIdStatusGet**](StatusApi.md#usersUserIdStatusGet) | **GET** /users/{user_id}/status | Get user status
[**usersUserIdStatusPut**](StatusApi.md#usersUserIdStatusPut) | **PUT** /users/{user_id}/status | Update user status


<a name="usersStatusIdsGet"></a>
# **usersStatusIdsGet**
> kotlin.Array&lt;Status&gt; usersStatusIdsGet()

Get user statuses by id

Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StatusApi()
try {
    val result : kotlin.Array<Status> = apiInstance.usersStatusIdsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatusApi#usersStatusIdsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusApi#usersStatusIdsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Status&gt;**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdStatusGet"></a>
# **usersUserIdStatusGet**
> Status usersUserIdStatusGet(userId)

Get user status

Get user status by id from the server. ##### Permissions Must be authenticated. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StatusApi()
val userId : kotlin.String = userId_example // kotlin.String | User ID
try {
    val result : Status = apiInstance.usersUserIdStatusGet(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatusApi#usersUserIdStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusApi#usersUserIdStatusGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User ID |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdStatusPut"></a>
# **usersUserIdStatusPut**
> Status usersUserIdStatusPut(userId, body)

Update user status

Manually set a user&#39;s status. When setting a user&#39;s status, the status will remain that value until set \&quot;online\&quot; again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have &#x60;edit_other_users&#x60; permission for the team. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StatusApi()
val userId : kotlin.String = userId_example // kotlin.String | User ID
val body : Body_16 =  // Body_16 | Status object that is to be updated
try {
    val result : Status = apiInstance.usersUserIdStatusPut(userId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatusApi#usersUserIdStatusPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusApi#usersUserIdStatusPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User ID |
 **body** | [**Body_16**](Body_16.md)| Status object that is to be updated |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

