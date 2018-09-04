# WebhooksApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hooksIncomingGet**](WebhooksApi.md#hooksIncomingGet) | **GET** /hooks/incoming | List incoming webhooks
[**hooksIncomingHookIdGet**](WebhooksApi.md#hooksIncomingHookIdGet) | **GET** /hooks/incoming/{hook_id} | Get an incoming webhook
[**hooksIncomingHookIdPut**](WebhooksApi.md#hooksIncomingHookIdPut) | **PUT** /hooks/incoming/{hook_id} | Update an incoming webhook
[**hooksIncomingPost**](WebhooksApi.md#hooksIncomingPost) | **POST** /hooks/incoming | Create an incoming webhook
[**hooksOutgoingGet**](WebhooksApi.md#hooksOutgoingGet) | **GET** /hooks/outgoing | List outgoing webhooks
[**hooksOutgoingHookIdDelete**](WebhooksApi.md#hooksOutgoingHookIdDelete) | **DELETE** /hooks/outgoing/{hook_id} | Delete an outgoing webhook
[**hooksOutgoingHookIdGet**](WebhooksApi.md#hooksOutgoingHookIdGet) | **GET** /hooks/outgoing/{hook_id} | Get an outgoing webhook
[**hooksOutgoingHookIdPut**](WebhooksApi.md#hooksOutgoingHookIdPut) | **PUT** /hooks/outgoing/{hook_id} | Update an outgoing webhook
[**hooksOutgoingHookIdRegenTokenPost**](WebhooksApi.md#hooksOutgoingHookIdRegenTokenPost) | **POST** /hooks/outgoing/{hook_id}/regen_token | Regenerate the token for the outgoing webhook.
[**hooksOutgoingPost**](WebhooksApi.md#hooksOutgoingPost) | **POST** /hooks/outgoing | Create an outgoing webhook


<a name="hooksIncomingGet"></a>
# **hooksIncomingGet**
> kotlin.Array&lt;IncomingWebhook&gt; hooksIncomingGet(page, perPage, teamId)

List incoming webhooks

Get a page of a list of incoming webhooks. Optionally filter for a specific team using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of hooks per page.
val teamId : kotlin.String = teamId_example // kotlin.String | The ID of the team to get hooks for.
try {
    val result : kotlin.Array<IncomingWebhook> = apiInstance.hooksIncomingGet(page, perPage, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksIncomingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksIncomingGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of hooks per page. | [optional] [default to 60]
 **teamId** | **kotlin.String**| The ID of the team to get hooks for. | [optional]

### Return type

[**kotlin.Array&lt;IncomingWebhook&gt;**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksIncomingHookIdGet"></a>
# **hooksIncomingHookIdGet**
> IncomingWebhook hooksIncomingHookIdGet(hookId)

Get an incoming webhook

Get an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = hookId_example // kotlin.String | Incoming Webhook GUID
try {
    val result : IncomingWebhook = apiInstance.hooksIncomingHookIdGet(hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksIncomingHookIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksIncomingHookIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **kotlin.String**| Incoming Webhook GUID |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksIncomingHookIdPut"></a>
# **hooksIncomingHookIdPut**
> IncomingWebhook hooksIncomingHookIdPut(hookId, body)

Update an incoming webhook

Update an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = hookId_example // kotlin.String | Incoming Webhook GUID
val body : Body_35 =  // Body_35 | Incoming webhook to be updated
try {
    val result : IncomingWebhook = apiInstance.hooksIncomingHookIdPut(hookId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksIncomingHookIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksIncomingHookIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **kotlin.String**| Incoming Webhook GUID |
 **body** | [**Body_35**](Body_35.md)| Incoming webhook to be updated |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksIncomingPost"></a>
# **hooksIncomingPost**
> IncomingWebhook hooksIncomingPost(body)

Create an incoming webhook

Create an incoming webhook for a channel. ##### Permissions &#x60;manage_webhooks&#x60; for the channel the webhook is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val body : Body_34 =  // Body_34 | Incoming webhook to be created
try {
    val result : IncomingWebhook = apiInstance.hooksIncomingPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksIncomingPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksIncomingPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_34**](Body_34.md)| Incoming webhook to be created |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingGet"></a>
# **hooksOutgoingGet**
> kotlin.Array&lt;OutgoingWebhook&gt; hooksOutgoingGet(page, perPage, teamId, channelId)

List outgoing webhooks

Get a page of a list of outgoing webhooks. Optionally filter for a specific team or channel using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team/channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of hooks per page.
val teamId : kotlin.String = teamId_example // kotlin.String | The ID of the team to get hooks for.
val channelId : kotlin.String = channelId_example // kotlin.String | The ID of the channel to get hooks for.
try {
    val result : kotlin.Array<OutgoingWebhook> = apiInstance.hooksOutgoingGet(page, perPage, teamId, channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksOutgoingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksOutgoingGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of hooks per page. | [optional] [default to 60]
 **teamId** | **kotlin.String**| The ID of the team to get hooks for. | [optional]
 **channelId** | **kotlin.String**| The ID of the channel to get hooks for. | [optional]

### Return type

[**kotlin.Array&lt;OutgoingWebhook&gt;**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingHookIdDelete"></a>
# **hooksOutgoingHookIdDelete**
> StatusOK hooksOutgoingHookIdDelete(hookId)

Delete an outgoing webhook

Delete an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = hookId_example // kotlin.String | Outgoing webhook GUID
try {
    val result : StatusOK = apiInstance.hooksOutgoingHookIdDelete(hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksOutgoingHookIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksOutgoingHookIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **kotlin.String**| Outgoing webhook GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingHookIdGet"></a>
# **hooksOutgoingHookIdGet**
> OutgoingWebhook hooksOutgoingHookIdGet(hookId)

Get an outgoing webhook

Get an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = hookId_example // kotlin.String | Outgoing webhook GUID
try {
    val result : OutgoingWebhook = apiInstance.hooksOutgoingHookIdGet(hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksOutgoingHookIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksOutgoingHookIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **kotlin.String**| Outgoing webhook GUID |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingHookIdPut"></a>
# **hooksOutgoingHookIdPut**
> OutgoingWebhook hooksOutgoingHookIdPut(hookId, body)

Update an outgoing webhook

Update an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = hookId_example // kotlin.String | outgoing Webhook GUID
val body : Body_37 =  // Body_37 | Outgoing webhook to be updated
try {
    val result : OutgoingWebhook = apiInstance.hooksOutgoingHookIdPut(hookId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksOutgoingHookIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksOutgoingHookIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **kotlin.String**| outgoing Webhook GUID |
 **body** | [**Body_37**](Body_37.md)| Outgoing webhook to be updated |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingHookIdRegenTokenPost"></a>
# **hooksOutgoingHookIdRegenTokenPost**
> StatusOK hooksOutgoingHookIdRegenTokenPost(hookId)

Regenerate the token for the outgoing webhook.

Regenerate the token for the outgoing webhook. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = hookId_example // kotlin.String | Outgoing webhook GUID
try {
    val result : StatusOK = apiInstance.hooksOutgoingHookIdRegenTokenPost(hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksOutgoingHookIdRegenTokenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksOutgoingHookIdRegenTokenPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **kotlin.String**| Outgoing webhook GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hooksOutgoingPost"></a>
# **hooksOutgoingPost**
> OutgoingWebhook hooksOutgoingPost(body)

Create an outgoing webhook

Create an outgoing webhook for a team. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = WebhooksApi()
val body : Body_36 =  // Body_36 | Outgoing webhook to be created
try {
    val result : OutgoingWebhook = apiInstance.hooksOutgoingPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#hooksOutgoingPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#hooksOutgoingPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_36**](Body_36.md)| Outgoing webhook to be created |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

