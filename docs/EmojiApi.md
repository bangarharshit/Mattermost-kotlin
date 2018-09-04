# EmojiApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emojiAutocompleteGet**](EmojiApi.md#emojiAutocompleteGet) | **GET** /emoji/autocomplete | Autocomplete custom emoji
[**emojiEmojiIdDelete**](EmojiApi.md#emojiEmojiIdDelete) | **DELETE** /emoji/{emoji_id} | Delete a custom emoji
[**emojiEmojiIdGet**](EmojiApi.md#emojiEmojiIdGet) | **GET** /emoji/{emoji_id} | Get a custom emoji
[**emojiEmojiIdImageGet**](EmojiApi.md#emojiEmojiIdImageGet) | **GET** /emoji/{emoji_id}/image | Get custom emoji image
[**emojiGet**](EmojiApi.md#emojiGet) | **GET** /emoji | Get a list of custom emoji
[**emojiNameEmojiNameGet**](EmojiApi.md#emojiNameEmojiNameGet) | **GET** /emoji/name/{emoji_name} | Get a custom emoji by name
[**emojiPost**](EmojiApi.md#emojiPost) | **POST** /emoji | Create a custom emoji
[**emojiSearchPost**](EmojiApi.md#emojiSearchPost) | **POST** /emoji/search | Search custom emoji


<a name="emojiAutocompleteGet"></a>
# **emojiAutocompleteGet**
> Emoji emojiAutocompleteGet(name)

Autocomplete custom emoji

Get a list of custom emoji with names starting with or matching the provided name. Returns a maximum of 100 results. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmojiApi()
val name : kotlin.String = name_example // kotlin.String | The emoji name to search.
try {
    val result : Emoji = apiInstance.emojiAutocompleteGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiAutocompleteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiAutocompleteGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| The emoji name to search. |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiEmojiIdDelete"></a>
# **emojiEmojiIdDelete**
> Emoji emojiEmojiIdDelete(emojiId)

Delete a custom emoji

Delete a custom emoji. ##### Permissions Must have the &#x60;manage_team&#x60; or &#x60;manage_system&#x60; permissions or be the user who created the emoji. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmojiApi()
val emojiId : kotlin.String = emojiId_example // kotlin.String | Emoji GUID
try {
    val result : Emoji = apiInstance.emojiEmojiIdDelete(emojiId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiEmojiIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiEmojiIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiId** | **kotlin.String**| Emoji GUID |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiEmojiIdGet"></a>
# **emojiEmojiIdGet**
> Emoji emojiEmojiIdGet(emojiId)

Get a custom emoji

Get some metadata for a custom emoji. ##### Permissions Must be authenticated. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmojiApi()
val emojiId : kotlin.String = emojiId_example // kotlin.String | Emoji GUID
try {
    val result : Emoji = apiInstance.emojiEmojiIdGet(emojiId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiEmojiIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiEmojiIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiId** | **kotlin.String**| Emoji GUID |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiEmojiIdImageGet"></a>
# **emojiEmojiIdImageGet**
> emojiEmojiIdImageGet(emojiId)

Get custom emoji image

Get the image for a custom emoji. ##### Permissions Must be authenticated. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmojiApi()
val emojiId : kotlin.String = emojiId_example // kotlin.String | Emoji GUID
try {
    apiInstance.emojiEmojiIdImageGet(emojiId)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiEmojiIdImageGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiEmojiIdImageGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiId** | **kotlin.String**| Emoji GUID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiGet"></a>
# **emojiGet**
> Emoji emojiGet(page, perPage, sort)

Get a list of custom emoji

Get a page of metadata for custom emoji on the system. Since server version 4.7, sort using the &#x60;sort&#x60; query parameter. ##### Permissions Must be authenticated. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmojiApi()
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of users per page.
val sort : kotlin.String = sort_example // kotlin.String | Either blank for no sorting or \"name\" to sort by emoji names. Minimum server version for sorting is 4.7.
try {
    val result : Emoji = apiInstance.emojiGet(page, perPage, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of users per page. | [optional] [default to 60]
 **sort** | **kotlin.String**| Either blank for no sorting or \&quot;name\&quot; to sort by emoji names. Minimum server version for sorting is 4.7. | [optional] [default to ]

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiNameEmojiNameGet"></a>
# **emojiNameEmojiNameGet**
> Emoji emojiNameEmojiNameGet(emojiName)

Get a custom emoji by name

Get some metadata for a custom emoji using its name. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmojiApi()
val emojiName : kotlin.String = emojiName_example // kotlin.String | Emoji name
try {
    val result : Emoji = apiInstance.emojiNameEmojiNameGet(emojiName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiNameEmojiNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiNameEmojiNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiName** | **kotlin.String**| Emoji name |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emojiPost"></a>
# **emojiPost**
> Emoji emojiPost(image, emoji)

Create a custom emoji

Create a custom emoji for the team. ##### Permissions Must be authenticated. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmojiApi()
val image : java.io.File = /path/to/file.txt // java.io.File | A file to be uploaded
val emoji : kotlin.String = emoji_example // kotlin.String | A JSON object containing a `name` field with the name of the emoji and a `creator_id` field with the id of the authenticated user.
try {
    val result : Emoji = apiInstance.emojiPost(image, emoji)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **java.io.File**| A file to be uploaded |
 **emoji** | **kotlin.String**| A JSON object containing a &#x60;name&#x60; field with the name of the emoji and a &#x60;creator_id&#x60; field with the id of the authenticated user. |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="emojiSearchPost"></a>
# **emojiSearchPost**
> kotlin.Array&lt;Emoji&gt; emojiSearchPost(body)

Search custom emoji

Search for custom emoji by name based on search criteria provided in the request body. A maximum of 200 results are returned. ##### Permissions Must be authenticated.  __Minimum server version__: 4.7 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = EmojiApi()
val body : Body_33 =  // Body_33 | Search criteria
try {
    val result : kotlin.Array<Emoji> = apiInstance.emojiSearchPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiSearchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_33**](Body_33.md)| Search criteria |

### Return type

[**kotlin.Array&lt;Emoji&gt;**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

