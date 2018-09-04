# OAuthApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthAppsAppIdDelete**](OAuthApi.md#oauthAppsAppIdDelete) | **DELETE** /oauth/apps/{app_id} | Delete an OAuth app
[**oauthAppsAppIdGet**](OAuthApi.md#oauthAppsAppIdGet) | **GET** /oauth/apps/{app_id} | Get an OAuth app
[**oauthAppsAppIdInfoGet**](OAuthApi.md#oauthAppsAppIdInfoGet) | **GET** /oauth/apps/{app_id}/info | Get info on an OAuth app
[**oauthAppsAppIdPut**](OAuthApi.md#oauthAppsAppIdPut) | **PUT** /oauth/apps/{app_id} | Update an OAuth app
[**oauthAppsAppIdRegenSecretPost**](OAuthApi.md#oauthAppsAppIdRegenSecretPost) | **POST** /oauth/apps/{app_id}/regen_secret | Regenerate OAuth app secret
[**oauthAppsGet**](OAuthApi.md#oauthAppsGet) | **GET** /oauth/apps | Get OAuth apps
[**oauthAppsPost**](OAuthApi.md#oauthAppsPost) | **POST** /oauth/apps | Register OAuth app
[**usersUserIdOauthAppsAuthorizedGet**](OAuthApi.md#usersUserIdOauthAppsAuthorizedGet) | **GET** /users/{user_id}/oauth/apps/authorized | Get authorized OAuth apps


<a name="oauthAppsAppIdDelete"></a>
# **oauthAppsAppIdDelete**
> StatusOK oauthAppsAppIdDelete(appId)

Delete an OAuth app

Delete and unregister an OAuth 2.0 client application  ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = OAuthApi()
val appId : kotlin.String = appId_example // kotlin.String | Application client id
try {
    val result : StatusOK = apiInstance.oauthAppsAppIdDelete(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#oauthAppsAppIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#oauthAppsAppIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**| Application client id |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsAppIdGet"></a>
# **oauthAppsAppIdGet**
> OAuthApp oauthAppsAppIdGet(appId)

Get an OAuth app

Get an OAuth 2.0 client application registered with Mattermost. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = OAuthApi()
val appId : kotlin.String = appId_example // kotlin.String | Application client id
try {
    val result : OAuthApp = apiInstance.oauthAppsAppIdGet(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#oauthAppsAppIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#oauthAppsAppIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**| Application client id |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsAppIdInfoGet"></a>
# **oauthAppsAppIdInfoGet**
> OAuthApp oauthAppsAppIdInfoGet(appId)

Get info on an OAuth app

Get public information about an OAuth 2.0 client application registered with Mattermost. The application&#39;s client secret will be blanked out. ##### Permissions Must be authenticated. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = OAuthApi()
val appId : kotlin.String = appId_example // kotlin.String | Application client id
try {
    val result : OAuthApp = apiInstance.oauthAppsAppIdInfoGet(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#oauthAppsAppIdInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#oauthAppsAppIdInfoGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**| Application client id |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsAppIdPut"></a>
# **oauthAppsAppIdPut**
> OAuthApp oauthAppsAppIdPut(appId, body)

Update an OAuth app

Update an OAuth 2.0 client application based on OAuth struct. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = OAuthApi()
val appId : kotlin.String = appId_example // kotlin.String | Application client id
val body : Body_41 =  // Body_41 | OAuth application to update
try {
    val result : OAuthApp = apiInstance.oauthAppsAppIdPut(appId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#oauthAppsAppIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#oauthAppsAppIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**| Application client id |
 **body** | [**Body_41**](Body_41.md)| OAuth application to update |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsAppIdRegenSecretPost"></a>
# **oauthAppsAppIdRegenSecretPost**
> OAuthApp oauthAppsAppIdRegenSecretPost(appId)

Regenerate OAuth app secret

Regenerate the client secret for an OAuth 2.0 client application registered with Mattermost. ##### Permissions If app creator, must have &#x60;mange_oauth&#x60; permission otherwise &#x60;manage_system_wide_oauth&#x60; permission is required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = OAuthApi()
val appId : kotlin.String = appId_example // kotlin.String | Application client id
try {
    val result : OAuthApp = apiInstance.oauthAppsAppIdRegenSecretPost(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#oauthAppsAppIdRegenSecretPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#oauthAppsAppIdRegenSecretPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**| Application client id |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsGet"></a>
# **oauthAppsGet**
> kotlin.Array&lt;OAuthApp&gt; oauthAppsGet(page, perPage)

Get OAuth apps

Get a page of OAuth 2.0 client applications registered with Mattermost. ##### Permissions With &#x60;manage_oauth&#x60; permission, the apps registered by the logged in user are returned. With &#x60;manage_system_wide_oauth&#x60; permission, all apps regardless of creator are returned. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = OAuthApi()
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of apps per page.
try {
    val result : kotlin.Array<OAuthApp> = apiInstance.oauthAppsGet(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#oauthAppsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#oauthAppsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of apps per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;OAuthApp&gt;**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauthAppsPost"></a>
# **oauthAppsPost**
> OAuthApp oauthAppsPost(body)

Register OAuth app

Register an OAuth 2.0 client application with Mattermost as the service provider. ##### Permissions Must have &#x60;manage_oauth&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = OAuthApi()
val body : Body_40 =  // Body_40 | OAuth application to register
try {
    val result : OAuthApp = apiInstance.oauthAppsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#oauthAppsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#oauthAppsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_40**](Body_40.md)| OAuth application to register |

### Return type

[**OAuthApp**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdOauthAppsAuthorizedGet"></a>
# **usersUserIdOauthAppsAuthorizedGet**
> kotlin.Array&lt;OAuthApp&gt; usersUserIdOauthAppsAuthorizedGet(userId, page, perPage)

Get authorized OAuth apps

Get a page of OAuth 2.0 client applications authorized to access a user&#39;s account. ##### Permissions Must be authenticated as the user or have &#x60;edit_other_users&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = OAuthApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of apps per page.
try {
    val result : kotlin.Array<OAuthApp> = apiInstance.usersUserIdOauthAppsAuthorizedGet(userId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#usersUserIdOauthAppsAuthorizedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#usersUserIdOauthAppsAuthorizedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of apps per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;OAuthApp&gt;**](OAuthApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

