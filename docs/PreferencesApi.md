# PreferencesApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUserIdPreferencesCategoryGet**](PreferencesApi.md#usersUserIdPreferencesCategoryGet) | **GET** /users/{user_id}/preferences/{category} | List a user&#39;s preferences by category
[**usersUserIdPreferencesCategoryNamePreferenceNameGet**](PreferencesApi.md#usersUserIdPreferencesCategoryNamePreferenceNameGet) | **GET** /users/{user_id}/preferences/{category}/name/{preference_name} | Get a specific user preference
[**usersUserIdPreferencesDeletePost**](PreferencesApi.md#usersUserIdPreferencesDeletePost) | **POST** /users/{user_id}/preferences/delete | Delete user&#39;s preferences
[**usersUserIdPreferencesGet**](PreferencesApi.md#usersUserIdPreferencesGet) | **GET** /users/{user_id}/preferences | Get the user&#39;s preferences
[**usersUserIdPreferencesPut**](PreferencesApi.md#usersUserIdPreferencesPut) | **PUT** /users/{user_id}/preferences | Save the user&#39;s preferences


<a name="usersUserIdPreferencesCategoryGet"></a>
# **usersUserIdPreferencesCategoryGet**
> kotlin.Array&lt;Preference&gt; usersUserIdPreferencesCategoryGet(userId, category)

List a user&#39;s preferences by category

Lists the current user&#39;s stored preferences in the given category. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PreferencesApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val category : kotlin.String = category_example // kotlin.String | The category of a group of preferences
try {
    val result : kotlin.Array<Preference> = apiInstance.usersUserIdPreferencesCategoryGet(userId, category)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PreferencesApi#usersUserIdPreferencesCategoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PreferencesApi#usersUserIdPreferencesCategoryGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |
 **category** | **kotlin.String**| The category of a group of preferences |

### Return type

[**kotlin.Array&lt;Preference&gt;**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPreferencesCategoryNamePreferenceNameGet"></a>
# **usersUserIdPreferencesCategoryNamePreferenceNameGet**
> Preference usersUserIdPreferencesCategoryNamePreferenceNameGet(userId, category, preferenceName)

Get a specific user preference

Gets a single preference for the current user with the given category and name. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PreferencesApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val category : kotlin.String = category_example // kotlin.String | The category of a group of preferences
val preferenceName : kotlin.String = preferenceName_example // kotlin.String | The name of the preference
try {
    val result : Preference = apiInstance.usersUserIdPreferencesCategoryNamePreferenceNameGet(userId, category, preferenceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PreferencesApi#usersUserIdPreferencesCategoryNamePreferenceNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PreferencesApi#usersUserIdPreferencesCategoryNamePreferenceNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |
 **category** | **kotlin.String**| The category of a group of preferences |
 **preferenceName** | **kotlin.String**| The name of the preference |

### Return type

[**Preference**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPreferencesDeletePost"></a>
# **usersUserIdPreferencesDeletePost**
> StatusOK usersUserIdPreferencesDeletePost(userId, body)

Delete user&#39;s preferences

Delete a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PreferencesApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val body : kotlin.Array<Preference> =  // kotlin.Array<Preference> | List of preference object
try {
    val result : StatusOK = apiInstance.usersUserIdPreferencesDeletePost(userId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PreferencesApi#usersUserIdPreferencesDeletePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PreferencesApi#usersUserIdPreferencesDeletePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |
 **body** | [**kotlin.Array&lt;Preference&gt;**](Preference.md)| List of preference object |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPreferencesGet"></a>
# **usersUserIdPreferencesGet**
> kotlin.Array&lt;Preference&gt; usersUserIdPreferencesGet(userId)

Get the user&#39;s preferences

Get a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PreferencesApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
try {
    val result : kotlin.Array<Preference> = apiInstance.usersUserIdPreferencesGet(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PreferencesApi#usersUserIdPreferencesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PreferencesApi#usersUserIdPreferencesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |

### Return type

[**kotlin.Array&lt;Preference&gt;**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPreferencesPut"></a>
# **usersUserIdPreferencesPut**
> StatusOK usersUserIdPreferencesPut(userId, body)

Save the user&#39;s preferences

Save a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PreferencesApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val body : kotlin.Array<Preference> =  // kotlin.Array<Preference> | List of preference object
try {
    val result : StatusOK = apiInstance.usersUserIdPreferencesPut(userId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PreferencesApi#usersUserIdPreferencesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PreferencesApi#usersUserIdPreferencesPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |
 **body** | [**kotlin.Array&lt;Preference&gt;**](Preference.md)| List of preference object |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

