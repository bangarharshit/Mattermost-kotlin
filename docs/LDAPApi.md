# LDAPApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ldapSyncPost**](LDAPApi.md#ldapSyncPost) | **POST** /ldap/sync | Sync with LDAP
[**ldapTestPost**](LDAPApi.md#ldapTestPost) | **POST** /ldap/test | Test LDAP configuration


<a name="ldapSyncPost"></a>
# **ldapSyncPost**
> StatusOK ldapSyncPost()

Sync with LDAP

Synchronize any user attribute changes in the configured AD/LDAP server with Mattermost. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LDAPApi()
try {
    val result : StatusOK = apiInstance.ldapSyncPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LDAPApi#ldapSyncPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LDAPApi#ldapSyncPost")
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

<a name="ldapTestPost"></a>
# **ldapTestPost**
> StatusOK ldapTestPost()

Test LDAP configuration

Test the current AD/LDAP configuration to see if the AD/LDAP server can be contacted successfully. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LDAPApi()
try {
    val result : StatusOK = apiInstance.ldapTestPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LDAPApi#ldapTestPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LDAPApi#ldapTestPost")
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

