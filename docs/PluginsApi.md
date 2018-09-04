# PluginsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pluginsGet**](PluginsApi.md#pluginsGet) | **GET** /plugins | Get plugins
[**pluginsPluginIdActivatePost**](PluginsApi.md#pluginsPluginIdActivatePost) | **POST** /plugins/{plugin_id}/activate | Activate plugin
[**pluginsPluginIdDeactivatePost**](PluginsApi.md#pluginsPluginIdDeactivatePost) | **POST** /plugins/{plugin_id}/deactivate | Deactivate plugin
[**pluginsPluginIdDelete**](PluginsApi.md#pluginsPluginIdDelete) | **DELETE** /plugins/{plugin_id} | Remove plugin
[**pluginsPost**](PluginsApi.md#pluginsPost) | **POST** /plugins | Upload plugin
[**pluginsWebappGet**](PluginsApi.md#pluginsWebappGet) | **GET** /plugins/webapp | Get webapp plugins


<a name="pluginsGet"></a>
# **pluginsGet**
> Inline_response_200_9 pluginsGet()

Get plugins

Get a list of inactive and a list of active plugin manifests. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PluginsApi()
try {
    val result : Inline_response_200_9 = apiInstance.pluginsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PluginsApi#pluginsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PluginsApi#pluginsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Inline_response_200_9**](Inline_response_200_9.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pluginsPluginIdActivatePost"></a>
# **pluginsPluginIdActivatePost**
> StatusOK pluginsPluginIdActivatePost(pluginId)

Activate plugin

Activate a previously uploaded plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PluginsApi()
val pluginId : kotlin.String = pluginId_example // kotlin.String | 
try {
    val result : StatusOK = apiInstance.pluginsPluginIdActivatePost(pluginId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PluginsApi#pluginsPluginIdActivatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PluginsApi#pluginsPluginIdActivatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **kotlin.String**|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pluginsPluginIdDeactivatePost"></a>
# **pluginsPluginIdDeactivatePost**
> StatusOK pluginsPluginIdDeactivatePost(pluginId)

Deactivate plugin

Deactivate a previously activated plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PluginsApi()
val pluginId : kotlin.String = pluginId_example // kotlin.String | 
try {
    val result : StatusOK = apiInstance.pluginsPluginIdDeactivatePost(pluginId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PluginsApi#pluginsPluginIdDeactivatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PluginsApi#pluginsPluginIdDeactivatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **kotlin.String**|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pluginsPluginIdDelete"></a>
# **pluginsPluginIdDelete**
> StatusOK pluginsPluginIdDelete(pluginId)

Remove plugin

Remove the plugin with the provided ID from the server. All plugin files are deleted. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PluginsApi()
val pluginId : kotlin.String = pluginId_example // kotlin.String | 
try {
    val result : StatusOK = apiInstance.pluginsPluginIdDelete(pluginId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PluginsApi#pluginsPluginIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PluginsApi#pluginsPluginIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pluginId** | **kotlin.String**|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pluginsPost"></a>
# **pluginsPost**
> StatusOK pluginsPost(plugin)

Upload plugin

Upload a plugin compressed in a .tar.gz file. Plugins and plugin uploads must be enabled in the server&#39;s config settings.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  __Minimum server version__: 4.4 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PluginsApi()
val plugin : java.io.File = /path/to/file.txt // java.io.File | The plugin image to be uploaded
try {
    val result : StatusOK = apiInstance.pluginsPost(plugin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PluginsApi#pluginsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PluginsApi#pluginsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin** | **java.io.File**| The plugin image to be uploaded |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="pluginsWebappGet"></a>
# **pluginsWebappGet**
> kotlin.Array&lt;PluginManifestWebapp&gt; pluginsWebappGet()

Get webapp plugins

Deactivate a previously activated plugin. Plugins must be enabled in the server&#39;s config settings.  ##### Permissions No permissions required.  __Minimum server version__: 4.4 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PluginsApi()
try {
    val result : kotlin.Array<PluginManifestWebapp> = apiInstance.pluginsWebappGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PluginsApi#pluginsWebappGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PluginsApi#pluginsWebappGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;PluginManifestWebapp&gt;**](PluginManifestWebapp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

