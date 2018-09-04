# ClusterApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clusterStatusGet**](ClusterApi.md#clusterStatusGet) | **GET** /cluster/status | Get cluster status


<a name="clusterStatusGet"></a>
# **clusterStatusGet**
> kotlin.Array&lt;ClusterInfo&gt; clusterStatusGet()

Get cluster status

Get a set of information for each node in the cluster, useful for checking the status and health of each node. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ClusterApi()
try {
    val result : kotlin.Array<ClusterInfo> = apiInstance.clusterStatusGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClusterApi#clusterStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClusterApi#clusterStatusGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ClusterInfo&gt;**](ClusterInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

