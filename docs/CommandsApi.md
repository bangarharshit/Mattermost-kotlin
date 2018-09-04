# CommandsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commandsCommandIdDelete**](CommandsApi.md#commandsCommandIdDelete) | **DELETE** /commands/{command_id} | Delete a command
[**commandsCommandIdPut**](CommandsApi.md#commandsCommandIdPut) | **PUT** /commands/{command_id} | Update a command
[**commandsCommandIdRegenTokenPut**](CommandsApi.md#commandsCommandIdRegenTokenPut) | **PUT** /commands/{command_id}/regen_token | Generate a new token
[**commandsExecutePost**](CommandsApi.md#commandsExecutePost) | **POST** /commands/execute | Execute a command
[**commandsGet**](CommandsApi.md#commandsGet) | **GET** /commands | List commands for a team
[**commandsPost**](CommandsApi.md#commandsPost) | **POST** /commands | Create a command
[**teamsTeamIdCommandsAutocompleteGet**](CommandsApi.md#teamsTeamIdCommandsAutocompleteGet) | **GET** /teams/{team_id}/commands/autocomplete | List autocomplete commands


<a name="commandsCommandIdDelete"></a>
# **commandsCommandIdDelete**
> StatusOK commandsCommandIdDelete(commandId)

Delete a command

Delete a command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CommandsApi()
val commandId : kotlin.String = commandId_example // kotlin.String | ID of the command to delete
try {
    val result : StatusOK = apiInstance.commandsCommandIdDelete(commandId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommandsApi#commandsCommandIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommandsApi#commandsCommandIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandId** | **kotlin.String**| ID of the command to delete |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsCommandIdPut"></a>
# **commandsCommandIdPut**
> Command commandsCommandIdPut(commandId, body)

Update a command

Update a single command based on command id string and Command struct. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CommandsApi()
val commandId : kotlin.String = commandId_example // kotlin.String | ID of the command to update
val body : Command =  // Command | 
try {
    val result : Command = apiInstance.commandsCommandIdPut(commandId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommandsApi#commandsCommandIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommandsApi#commandsCommandIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandId** | **kotlin.String**| ID of the command to update |
 **body** | [**Command**](Command.md)|  |

### Return type

[**Command**](Command.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsCommandIdRegenTokenPut"></a>
# **commandsCommandIdRegenTokenPut**
> Inline_response_200_8 commandsCommandIdRegenTokenPut(commandId)

Generate a new token

Generate a new token for the command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CommandsApi()
val commandId : kotlin.String = commandId_example // kotlin.String | ID of the command to generate the new token
try {
    val result : Inline_response_200_8 = apiInstance.commandsCommandIdRegenTokenPut(commandId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommandsApi#commandsCommandIdRegenTokenPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommandsApi#commandsCommandIdRegenTokenPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandId** | **kotlin.String**| ID of the command to generate the new token |

### Return type

[**Inline_response_200_8**](Inline_response_200_8.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsExecutePost"></a>
# **commandsExecutePost**
> CommandResponse commandsExecutePost(body)

Execute a command

Execute a command on a team. ##### Permissions Must have &#x60;use_slash_commands&#x60; permission for the team the command is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CommandsApi()
val body : Body_39 =  // Body_39 | command to be executed
try {
    val result : CommandResponse = apiInstance.commandsExecutePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommandsApi#commandsExecutePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommandsApi#commandsExecutePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_39**](Body_39.md)| command to be executed |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsGet"></a>
# **commandsGet**
> kotlin.Array&lt;Command&gt; commandsGet(teamId, customOnly)

List commands for a team

List commands for a team. ##### Permissions &#x60;manage_slash_commands&#x60; if need list custom commands. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CommandsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | The team id.
val customOnly : kotlin.String = customOnly_example // kotlin.String | To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands. 
try {
    val result : kotlin.Array<Command> = apiInstance.commandsGet(teamId, customOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommandsApi#commandsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommandsApi#commandsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| The team id. | [optional]
 **customOnly** | **kotlin.String**| To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands.  | [optional] [default to false]

### Return type

[**kotlin.Array&lt;Command&gt;**](Command.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commandsPost"></a>
# **commandsPost**
> Command commandsPost(body)

Create a command

Create a command for a team. ##### Permissions &#x60;manage_slash_commands&#x60; for the team the command is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CommandsApi()
val body : Body_38 =  // Body_38 | command to be created
try {
    val result : Command = apiInstance.commandsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommandsApi#commandsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommandsApi#commandsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_38**](Body_38.md)| command to be created |

### Return type

[**Command**](Command.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdCommandsAutocompleteGet"></a>
# **teamsTeamIdCommandsAutocompleteGet**
> kotlin.Array&lt;Command&gt; teamsTeamIdCommandsAutocompleteGet(teamId)

List autocomplete commands

List autocomplete commands in the team. ##### Permissions &#x60;view_team&#x60; for the team. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CommandsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
try {
    val result : kotlin.Array<Command> = apiInstance.teamsTeamIdCommandsAutocompleteGet(teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommandsApi#teamsTeamIdCommandsAutocompleteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommandsApi#teamsTeamIdCommandsAutocompleteGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| Team GUID |

### Return type

[**kotlin.Array&lt;Command&gt;**](Command.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

