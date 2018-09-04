# BrandApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandImageGet**](BrandApi.md#brandImageGet) | **GET** /brand/image | Get brand image
[**brandImagePost**](BrandApi.md#brandImagePost) | **POST** /brand/image | Upload brand image


<a name="brandImageGet"></a>
# **brandImageGet**
> kotlin.String brandImageGet()

Get brand image

Get the previously uploaded brand image. Returns 404 if no brand image has been uploaded. ##### Permissions No permission required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = BrandApi()
try {
    val result : kotlin.String = apiInstance.brandImageGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#brandImageGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#brandImageGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="brandImagePost"></a>
# **brandImagePost**
> StatusOK brandImagePost(image)

Upload brand image

Uploads a brand image. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = BrandApi()
val image : java.io.File = /path/to/file.txt // java.io.File | The image to be uploaded
try {
    val result : StatusOK = apiInstance.brandImagePost(image)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#brandImagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#brandImagePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **java.io.File**| The image to be uploaded |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

