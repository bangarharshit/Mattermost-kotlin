# SAMLApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**samlCertificateIdpDelete**](SAMLApi.md#samlCertificateIdpDelete) | **DELETE** /saml/certificate/idp | Remove IDP certificate
[**samlCertificateIdpPost**](SAMLApi.md#samlCertificateIdpPost) | **POST** /saml/certificate/idp | Upload IDP certificate
[**samlCertificatePrivateDelete**](SAMLApi.md#samlCertificatePrivateDelete) | **DELETE** /saml/certificate/private | Remove private key
[**samlCertificatePrivatePost**](SAMLApi.md#samlCertificatePrivatePost) | **POST** /saml/certificate/private | Upload private key
[**samlCertificatePublicDelete**](SAMLApi.md#samlCertificatePublicDelete) | **DELETE** /saml/certificate/public | Remove public certificate
[**samlCertificatePublicPost**](SAMLApi.md#samlCertificatePublicPost) | **POST** /saml/certificate/public | Upload public certificate
[**samlCertificateStatusGet**](SAMLApi.md#samlCertificateStatusGet) | **GET** /saml/certificate/status | Get certificate status
[**samlMetadataGet**](SAMLApi.md#samlMetadataGet) | **GET** /saml/metadata | Get metadata


<a name="samlCertificateIdpDelete"></a>
# **samlCertificateIdpDelete**
> StatusOK samlCertificateIdpDelete()

Remove IDP certificate

Delete the current IDP certificate being used with your SAML configuration. This will also disable SAML on your system as this certificate is required for SAML. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SAMLApi()
try {
    val result : StatusOK = apiInstance.samlCertificateIdpDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SAMLApi#samlCertificateIdpDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SAMLApi#samlCertificateIdpDelete")
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

<a name="samlCertificateIdpPost"></a>
# **samlCertificateIdpPost**
> StatusOK samlCertificateIdpPost(certificate)

Upload IDP certificate

Upload the IDP certificate to be used with your SAML configuration. This will also set the filename for the IdpCertificateFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SAMLApi()
val certificate : java.io.File = /path/to/file.txt // java.io.File | The IDP certificate file
try {
    val result : StatusOK = apiInstance.samlCertificateIdpPost(certificate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SAMLApi#samlCertificateIdpPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SAMLApi#samlCertificateIdpPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificate** | **java.io.File**| The IDP certificate file |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="samlCertificatePrivateDelete"></a>
# **samlCertificatePrivateDelete**
> StatusOK samlCertificatePrivateDelete()

Remove private key

Delete the current private key being used with your SAML configuration. This will also disable encryption for SAML on your system as this key is required for that. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SAMLApi()
try {
    val result : StatusOK = apiInstance.samlCertificatePrivateDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SAMLApi#samlCertificatePrivateDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SAMLApi#samlCertificatePrivateDelete")
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

<a name="samlCertificatePrivatePost"></a>
# **samlCertificatePrivatePost**
> StatusOK samlCertificatePrivatePost(certificate)

Upload private key

Upload the private key to be used for encryption with your SAML configuration. This will also set the filename for the PrivateKeyFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SAMLApi()
val certificate : java.io.File = /path/to/file.txt // java.io.File | The private key file
try {
    val result : StatusOK = apiInstance.samlCertificatePrivatePost(certificate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SAMLApi#samlCertificatePrivatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SAMLApi#samlCertificatePrivatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificate** | **java.io.File**| The private key file |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="samlCertificatePublicDelete"></a>
# **samlCertificatePublicDelete**
> StatusOK samlCertificatePublicDelete()

Remove public certificate

Delete the current public certificate being used with your SAML configuration. This will also disable encryption for SAML on your system as this certificate is required for that. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SAMLApi()
try {
    val result : StatusOK = apiInstance.samlCertificatePublicDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SAMLApi#samlCertificatePublicDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SAMLApi#samlCertificatePublicDelete")
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

<a name="samlCertificatePublicPost"></a>
# **samlCertificatePublicPost**
> StatusOK samlCertificatePublicPost(certificate)

Upload public certificate

Upload the public certificate to be used for encryption with your SAML configuration. This will also set the filename for the PublicCertificateFile setting in your &#x60;config.json&#x60;. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SAMLApi()
val certificate : java.io.File = /path/to/file.txt // java.io.File | The public certificate file
try {
    val result : StatusOK = apiInstance.samlCertificatePublicPost(certificate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SAMLApi#samlCertificatePublicPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SAMLApi#samlCertificatePublicPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificate** | **java.io.File**| The public certificate file |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="samlCertificateStatusGet"></a>
# **samlCertificateStatusGet**
> SamlCertificateStatus samlCertificateStatusGet()

Get certificate status

Get the status of the uploaded certificates and keys in use by your SAML configuration. ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SAMLApi()
try {
    val result : SamlCertificateStatus = apiInstance.samlCertificateStatusGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SAMLApi#samlCertificateStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SAMLApi#samlCertificateStatusGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SamlCertificateStatus**](SamlCertificateStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="samlMetadataGet"></a>
# **samlMetadataGet**
> kotlin.String samlMetadataGet()

Get metadata

Get SAML metadata from the server. SAML must be configured properly. ##### Permissions No permission required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SAMLApi()
try {
    val result : kotlin.String = apiInstance.samlMetadataGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SAMLApi#samlMetadataGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SAMLApi#samlMetadataGet")
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

