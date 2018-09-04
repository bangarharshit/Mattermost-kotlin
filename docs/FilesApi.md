# FilesApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesFileIdGet**](FilesApi.md#filesFileIdGet) | **GET** /files/{file_id} | Get a file
[**filesFileIdInfoGet**](FilesApi.md#filesFileIdInfoGet) | **GET** /files/{file_id}/info | Get metadata for a file
[**filesFileIdLinkGet**](FilesApi.md#filesFileIdLinkGet) | **GET** /files/{file_id}/link | Get a public file link
[**filesFileIdPreviewGet**](FilesApi.md#filesFileIdPreviewGet) | **GET** /files/{file_id}/preview | Get a file&#39;s preview
[**filesFileIdThumbnailGet**](FilesApi.md#filesFileIdThumbnailGet) | **GET** /files/{file_id}/thumbnail | Get a file&#39;s thumbnail
[**filesPost**](FilesApi.md#filesPost) | **POST** /files | Upload a file


<a name="filesFileIdGet"></a>
# **filesFileIdGet**
> filesFileIdGet(fileId)

Get a file

Gets a file that has been uploaded previously. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to get
try {
    apiInstance.filesFileIdGet(fileId)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesFileIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesFileIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to get |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesFileIdInfoGet"></a>
# **filesFileIdInfoGet**
> FileInfo filesFileIdInfoGet(fileId)

Get metadata for a file

Gets a file&#39;s info. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file info to get
try {
    val result : FileInfo = apiInstance.filesFileIdInfoGet(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesFileIdInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesFileIdInfoGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file info to get |

### Return type

[**FileInfo**](FileInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesFileIdLinkGet"></a>
# **filesFileIdLinkGet**
> kotlin.String filesFileIdLinkGet(fileId)

Get a public file link

Gets a public link for a file that can be accessed without logging into Mattermost.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to get a link for
try {
    val result : kotlin.String = apiInstance.filesFileIdLinkGet(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesFileIdLinkGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesFileIdLinkGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to get a link for |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesFileIdPreviewGet"></a>
# **filesFileIdPreviewGet**
> filesFileIdPreviewGet(fileId)

Get a file&#39;s preview

Gets a file&#39;s preview. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to get
try {
    apiInstance.filesFileIdPreviewGet(fileId)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesFileIdPreviewGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesFileIdPreviewGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to get |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesFileIdThumbnailGet"></a>
# **filesFileIdThumbnailGet**
> filesFileIdThumbnailGet(fileId)

Get a file&#39;s thumbnail

Gets a file&#39;s thumbnail. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to get
try {
    apiInstance.filesFileIdThumbnailGet(fileId)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesFileIdThumbnailGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesFileIdThumbnailGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to get |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesPost"></a>
# **filesPost**
> Inline_response_200_6 filesPost(files, channelId, clientIds, channelId2, filename)

Upload a file

Uploads a file that can later be attached to a post.  This request can either be a multipart/form-data request with a channel_id, files and optional client_ids defined in the FormData, or it can be a request with the channel_id and filename defined as query parameters with the contents of a single file in the body of the request.  Only multipart/form-data requests are supported by server versions up to and including 4.7. Server versions 4.8 and higher support both types of requests.  ##### Permissions Must have &#x60;upload_file&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FilesApi()
val files : java.io.File = /path/to/file.txt // java.io.File | A file to be uploaded
val channelId : kotlin.String = channelId_example // kotlin.String | The ID of the channel that this file will be uploaded to
val clientIds : kotlin.String = clientIds_example // kotlin.String | A unique identifier for the file that will be returned in the response
val channelId2 : kotlin.String = channelId_example // kotlin.String | The ID of the channel that this file will be uploaded to
val filename : kotlin.String = filename_example // kotlin.String | The ID of the channel that this file will be uploaded to
try {
    val result : Inline_response_200_6 = apiInstance.filesPost(files, channelId, clientIds, channelId2, filename)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **java.io.File**| A file to be uploaded | [optional]
 **channelId** | **kotlin.String**| The ID of the channel that this file will be uploaded to | [optional]
 **clientIds** | **kotlin.String**| A unique identifier for the file that will be returned in the response | [optional]
 **channelId2** | **kotlin.String**| The ID of the channel that this file will be uploaded to | [optional]
 **filename** | **kotlin.String**| The ID of the channel that this file will be uploaded to | [optional]

### Return type

[**Inline_response_200_6**](Inline_response_200_6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data, */*
 - **Accept**: application/json

