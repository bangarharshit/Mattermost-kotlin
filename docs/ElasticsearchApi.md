# ElasticsearchApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**elasticsearchPurgeIndexesPost**](ElasticsearchApi.md#elasticsearchPurgeIndexesPost) | **POST** /elasticsearch/purge_indexes | Purge all Elasticsearch indexes
[**elasticsearchTestPost**](ElasticsearchApi.md#elasticsearchTestPost) | **POST** /elasticsearch/test | Test Elasticsearch configuration


<a name="elasticsearchPurgeIndexesPost"></a>
# **elasticsearchPurgeIndexesPost**
> StatusOK elasticsearchPurgeIndexesPost()

Purge all Elasticsearch indexes

Deletes all Elasticsearch indexes and their contents. After calling this endpoint, it is necessary to schedule a new Elasticsearch indexing job to repopulate the indexes. __Minimum server version__: 4.1 ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ElasticsearchApi()
try {
    val result : StatusOK = apiInstance.elasticsearchPurgeIndexesPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElasticsearchApi#elasticsearchPurgeIndexesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElasticsearchApi#elasticsearchPurgeIndexesPost")
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

<a name="elasticsearchTestPost"></a>
# **elasticsearchTestPost**
> StatusOK elasticsearchTestPost()

Test Elasticsearch configuration

Test the current Elasticsearch configuration to see if the Elasticsearch server can be contacted successfully. Optionally provide a configuration in the request body to test. If no valid configuration is present in the request body the current server configuration will be tested.  __Minimum server version__: 4.1 ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ElasticsearchApi()
try {
    val result : StatusOK = apiInstance.elasticsearchTestPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElasticsearchApi#elasticsearchTestPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElasticsearchApi#elasticsearchTestPost")
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

