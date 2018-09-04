# ChannelsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**channelsChannelIdDelete**](ChannelsApi.md#channelsChannelIdDelete) | **DELETE** /channels/{channel_id} | Delete a channel
[**channelsChannelIdGet**](ChannelsApi.md#channelsChannelIdGet) | **GET** /channels/{channel_id} | Get a channel
[**channelsChannelIdMembersGet**](ChannelsApi.md#channelsChannelIdMembersGet) | **GET** /channels/{channel_id}/members | Get channel members
[**channelsChannelIdMembersIdsPost**](ChannelsApi.md#channelsChannelIdMembersIdsPost) | **POST** /channels/{channel_id}/members/ids | Get channel members by ids
[**channelsChannelIdMembersPost**](ChannelsApi.md#channelsChannelIdMembersPost) | **POST** /channels/{channel_id}/members | Add user to channel
[**channelsChannelIdMembersUserIdDelete**](ChannelsApi.md#channelsChannelIdMembersUserIdDelete) | **DELETE** /channels/{channel_id}/members/{user_id} | Remove user from channel
[**channelsChannelIdMembersUserIdGet**](ChannelsApi.md#channelsChannelIdMembersUserIdGet) | **GET** /channels/{channel_id}/members/{user_id} | Get channel member
[**channelsChannelIdMembersUserIdNotifyPropsPut**](ChannelsApi.md#channelsChannelIdMembersUserIdNotifyPropsPut) | **PUT** /channels/{channel_id}/members/{user_id}/notify_props | Update channel notifications
[**channelsChannelIdMembersUserIdRolesPut**](ChannelsApi.md#channelsChannelIdMembersUserIdRolesPut) | **PUT** /channels/{channel_id}/members/{user_id}/roles | Update channel roles
[**channelsChannelIdPatchPut**](ChannelsApi.md#channelsChannelIdPatchPut) | **PUT** /channels/{channel_id}/patch | Patch a channel
[**channelsChannelIdPinnedGet**](ChannelsApi.md#channelsChannelIdPinnedGet) | **GET** /channels/{channel_id}/pinned | Get a channel&#39;s pinned posts
[**channelsChannelIdPut**](ChannelsApi.md#channelsChannelIdPut) | **PUT** /channels/{channel_id} | Update a channel
[**channelsChannelIdRestorePost**](ChannelsApi.md#channelsChannelIdRestorePost) | **POST** /channels/{channel_id}/restore | Restore a channel
[**channelsChannelIdStatsGet**](ChannelsApi.md#channelsChannelIdStatsGet) | **GET** /channels/{channel_id}/stats | Get channel statistics
[**channelsDirectPost**](ChannelsApi.md#channelsDirectPost) | **POST** /channels/direct | Create a direct message channel
[**channelsGroupPost**](ChannelsApi.md#channelsGroupPost) | **POST** /channels/group | Create a group message channel
[**channelsMembersUserIdViewPost**](ChannelsApi.md#channelsMembersUserIdViewPost) | **POST** /channels/members/{user_id}/view | View channel
[**channelsPost**](ChannelsApi.md#channelsPost) | **POST** /channels | Create a channel
[**teamsNameTeamNameChannelsNameChannelNameGet**](ChannelsApi.md#teamsNameTeamNameChannelsNameChannelNameGet) | **GET** /teams/name/{team_name}/channels/name/{channel_name} | Get a channel by name and team name
[**teamsTeamIdChannelsAutocompleteGet**](ChannelsApi.md#teamsTeamIdChannelsAutocompleteGet) | **GET** /teams/{team_id}/channels/autocomplete | Autocomplete channels
[**teamsTeamIdChannelsDeletedGet**](ChannelsApi.md#teamsTeamIdChannelsDeletedGet) | **GET** /teams/{team_id}/channels/deleted | Get deleted channels
[**teamsTeamIdChannelsGet**](ChannelsApi.md#teamsTeamIdChannelsGet) | **GET** /teams/{team_id}/channels | Get public channels
[**teamsTeamIdChannelsIdsPost**](ChannelsApi.md#teamsTeamIdChannelsIdsPost) | **POST** /teams/{team_id}/channels/ids | Get a list of channels by ids
[**teamsTeamIdChannelsNameChannelNameGet**](ChannelsApi.md#teamsTeamIdChannelsNameChannelNameGet) | **GET** /teams/{team_id}/channels/name/{channel_name} | Get a channel by name
[**teamsTeamIdChannelsSearchPost**](ChannelsApi.md#teamsTeamIdChannelsSearchPost) | **POST** /teams/{team_id}/channels/search | Search channels
[**usersUserIdChannelsChannelIdUnreadGet**](ChannelsApi.md#usersUserIdChannelsChannelIdUnreadGet) | **GET** /users/{user_id}/channels/{channel_id}/unread | Get unread messages
[**usersUserIdTeamsTeamIdChannelsGet**](ChannelsApi.md#usersUserIdTeamsTeamIdChannelsGet) | **GET** /users/{user_id}/teams/{team_id}/channels | Get channels for user
[**usersUserIdTeamsTeamIdChannelsMembersGet**](ChannelsApi.md#usersUserIdTeamsTeamIdChannelsMembersGet) | **GET** /users/{user_id}/teams/{team_id}/channels/members | Get channel members for user


<a name="channelsChannelIdDelete"></a>
# **channelsChannelIdDelete**
> StatusOK channelsChannelIdDelete(channelId)

Delete a channel

Delete a channel based from provided channel id string. ##### Permissions &#x60;delete_public_channel&#x60; permission if the channel is public, &#x60;delete_private_channel&#x60; permission if the channel is private, or have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
try {
    val result : StatusOK = apiInstance.channelsChannelIdDelete(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdGet"></a>
# **channelsChannelIdGet**
> Channel channelsChannelIdGet(channelId)

Get a channel

Get channel from the provided channel id string. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
try {
    val result : Channel = apiInstance.channelsChannelIdGet(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdMembersGet"></a>
# **channelsChannelIdMembersGet**
> kotlin.Array&lt;ChannelMember&gt; channelsChannelIdMembersGet(channelId, page, perPage)

Get channel members

Get a page of members for a channel. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of members per page.
try {
    val result : kotlin.Array<ChannelMember> = apiInstance.channelsChannelIdMembersGet(channelId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdMembersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdMembersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of members per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;ChannelMember&gt;**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdMembersIdsPost"></a>
# **channelsChannelIdMembersIdsPost**
> kotlin.Array&lt;ChannelMember&gt; channelsChannelIdMembersIdsPost(channelId, userIds)

Get channel members by ids

Get a list of channel members based on the provided user ids. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
val userIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of user ids
try {
    val result : kotlin.Array<ChannelMember> = apiInstance.channelsChannelIdMembersIdsPost(channelId, userIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdMembersIdsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdMembersIdsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |
 **userIds** | **kotlin.Array&lt;kotlin.String&gt;**| List of user ids |

### Return type

[**kotlin.Array&lt;ChannelMember&gt;**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdMembersPost"></a>
# **channelsChannelIdMembersPost**
> ChannelMember channelsChannelIdMembersPost(channelId, body)

Add user to channel

Add a user to a channel by creating a channel member object.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | The channel ID
val body : Body_26 =  // Body_26 | 
try {
    val result : ChannelMember = apiInstance.channelsChannelIdMembersPost(channelId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdMembersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdMembersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| The channel ID |
 **body** | [**Body_26**](Body_26.md)|  |

### Return type

[**ChannelMember**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdMembersUserIdDelete"></a>
# **channelsChannelIdMembersUserIdDelete**
> StatusOK channelsChannelIdMembersUserIdDelete(channelId, userId)

Remove user from channel

Delete a channel member, effectively removing them from a channel. ##### Permissions &#x60;manage_public_channel_members&#x60; permission if the channel is public. &#x60;manage_private_channel_members&#x60; permission if the channel is private. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
val userId : kotlin.String = userId_example // kotlin.String | User GUID
try {
    val result : StatusOK = apiInstance.channelsChannelIdMembersUserIdDelete(channelId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdMembersUserIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdMembersUserIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |
 **userId** | **kotlin.String**| User GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdMembersUserIdGet"></a>
# **channelsChannelIdMembersUserIdGet**
> ChannelMember channelsChannelIdMembersUserIdGet(channelId, userId)

Get channel member

Get a channel member. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
val userId : kotlin.String = userId_example // kotlin.String | User GUID
try {
    val result : ChannelMember = apiInstance.channelsChannelIdMembersUserIdGet(channelId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdMembersUserIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdMembersUserIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |
 **userId** | **kotlin.String**| User GUID |

### Return type

[**ChannelMember**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdMembersUserIdNotifyPropsPut"></a>
# **channelsChannelIdMembersUserIdNotifyPropsPut**
> StatusOK channelsChannelIdMembersUserIdNotifyPropsPut(channelId, userId, notifyProps)

Update channel notifications

Update a user&#39;s notification properties for a channel. Only the provided fields are updated. ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val notifyProps : ChannelNotifyProps =  // ChannelNotifyProps | 
try {
    val result : StatusOK = apiInstance.channelsChannelIdMembersUserIdNotifyPropsPut(channelId, userId, notifyProps)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdMembersUserIdNotifyPropsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdMembersUserIdNotifyPropsPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |
 **userId** | **kotlin.String**| User GUID |
 **notifyProps** | [**ChannelNotifyProps**](ChannelNotifyProps.md)|  |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdMembersUserIdRolesPut"></a>
# **channelsChannelIdMembersUserIdRolesPut**
> StatusOK channelsChannelIdMembersUserIdRolesPut(channelId, userId, roles)

Update channel roles

Update a user&#39;s roles for a channel. ##### Permissions Must have &#x60;manage_channel_roles&#x60; permission for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val roles : Roles_1 =  // Roles_1 | Space-delimited channel roles to assign to the user
try {
    val result : StatusOK = apiInstance.channelsChannelIdMembersUserIdRolesPut(channelId, userId, roles)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdMembersUserIdRolesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdMembersUserIdRolesPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |
 **userId** | **kotlin.String**| User GUID |
 **roles** | [**Roles_1**](Roles_1.md)| Space-delimited channel roles to assign to the user |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdPatchPut"></a>
# **channelsChannelIdPatchPut**
> Channel channelsChannelIdPatchPut(channelId, body)

Patch a channel

Partially update a channel by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
val body : Body_24 =  // Body_24 | Channel object to be updated
try {
    val result : Channel = apiInstance.channelsChannelIdPatchPut(channelId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdPatchPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdPatchPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |
 **body** | [**Body_24**](Body_24.md)| Channel object to be updated |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdPinnedGet"></a>
# **channelsChannelIdPinnedGet**
> PostList channelsChannelIdPinnedGet(channelId)

Get a channel&#39;s pinned posts

Get a list of pinned posts for channel.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
try {
    val result : PostList = apiInstance.channelsChannelIdPinnedGet(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdPinnedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdPinnedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdPut"></a>
# **channelsChannelIdPut**
> Channel channelsChannelIdPut(channelId, body)

Update a channel

Update a channel. The fields that can be updated are listed as paramters. Omitted fields will be treated as blanks. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
val body : Body_23 =  // Body_23 | Channel object to be updated
try {
    val result : Channel = apiInstance.channelsChannelIdPut(channelId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |
 **body** | [**Body_23**](Body_23.md)| Channel object to be updated |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdRestorePost"></a>
# **channelsChannelIdRestorePost**
> Channel channelsChannelIdRestorePost(channelId)

Restore a channel

Restore channel from the provided channel id string.  __Minimum server version__: 3.10  ##### Permissions &#x60;manage_team&#x60; permission for the team of channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
try {
    val result : Channel = apiInstance.channelsChannelIdRestorePost(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdRestorePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdRestorePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsChannelIdStatsGet"></a>
# **channelsChannelIdStatsGet**
> ChannelStats channelsChannelIdStatsGet(channelId)

Get channel statistics

Get statistics for a channel. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
try {
    val result : ChannelStats = apiInstance.channelsChannelIdStatsGet(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsChannelIdStatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsChannelIdStatsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| Channel GUID |

### Return type

[**ChannelStats**](ChannelStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsDirectPost"></a>
# **channelsDirectPost**
> Channel channelsDirectPost(body)

Create a direct message channel

Create a new direct message channel between two users. ##### Permissions Must be one of the two users and have &#x60;create_direct_channel&#x60; permission. Having the &#x60;manage_system&#x60; permission voids the previous requirements. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val body : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | The two user ids to be in the direct message
try {
    val result : Channel = apiInstance.channelsDirectPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsDirectPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsDirectPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.Array&lt;kotlin.String&gt;**| The two user ids to be in the direct message |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsGroupPost"></a>
# **channelsGroupPost**
> Channel channelsGroupPost(body)

Create a group message channel

Create a new group message channel to group of users. If the logged in user&#39;s id is not included in the list, it will be appended to the end. ##### Permissions Must have &#x60;create_group_channel&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val body : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | User ids to be in the group message channel
try {
    val result : Channel = apiInstance.channelsGroupPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.Array&lt;kotlin.String&gt;**| User ids to be in the group message channel |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsMembersUserIdViewPost"></a>
# **channelsMembersUserIdViewPost**
> Inline_response_200_5 channelsMembersUserIdViewPost(userId, body)

View channel

Perform all the actions involved in viewing a channel. This includes marking channels as read, clearing push notifications, and updating the active channel. ##### Permissions Must be logged in as user or have &#x60;edit_other_users&#x60; permission.  __Response only includes &#x60;last_viewed_at_times&#x60; in Mattermost server 4.3 and newer.__ 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val userId : kotlin.String = userId_example // kotlin.String | User ID to perform the view action for
val body : Body_27 =  // Body_27 | Paremeters affecting how and which channels to view
try {
    val result : Inline_response_200_5 = apiInstance.channelsMembersUserIdViewPost(userId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsMembersUserIdViewPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsMembersUserIdViewPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User ID to perform the view action for |
 **body** | [**Body_27**](Body_27.md)| Paremeters affecting how and which channels to view |

### Return type

[**Inline_response_200_5**](Inline_response_200_5.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="channelsPost"></a>
# **channelsPost**
> Channel channelsPost(body)

Create a channel

Create a new channel. ##### Permissions If creating a public channel, &#x60;create_public_channel&#x60; permission is required. If creating a private channel, &#x60;create_private_channel&#x60; permission is required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val body : Body_22 =  // Body_22 | Channel object to be created
try {
    val result : Channel = apiInstance.channelsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#channelsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#channelsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body_22**](Body_22.md)| Channel object to be created |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsNameTeamNameChannelsNameChannelNameGet"></a>
# **teamsNameTeamNameChannelsNameChannelNameGet**
> Channel teamsNameTeamNameChannelsNameChannelNameGet(teamName, channelName)

Get a channel by name and team name

Gets a channel from the provided team name and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val teamName : kotlin.String = teamName_example // kotlin.String | Team Name
val channelName : kotlin.String = channelName_example // kotlin.String | Channel Name
try {
    val result : Channel = apiInstance.teamsNameTeamNameChannelsNameChannelNameGet(teamName, channelName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#teamsNameTeamNameChannelsNameChannelNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#teamsNameTeamNameChannelsNameChannelNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamName** | **kotlin.String**| Team Name |
 **channelName** | **kotlin.String**| Channel Name |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdChannelsAutocompleteGet"></a>
# **teamsTeamIdChannelsAutocompleteGet**
> kotlin.Array&lt;Channel&gt; teamsTeamIdChannelsAutocompleteGet(teamId, name)

Autocomplete channels

Autocomplete public channels on a team based on the search term provided in the request URL.  __Minimum server version__: 4.7  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
val name : kotlin.String = name_example // kotlin.String | Name or display name
try {
    val result : kotlin.Array<Channel> = apiInstance.teamsTeamIdChannelsAutocompleteGet(teamId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#teamsTeamIdChannelsAutocompleteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#teamsTeamIdChannelsAutocompleteGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| Team GUID |
 **name** | **kotlin.String**| Name or display name |

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdChannelsDeletedGet"></a>
# **teamsTeamIdChannelsDeletedGet**
> kotlin.Array&lt;Channel&gt; teamsTeamIdChannelsDeletedGet(teamId, page, perPage)

Get deleted channels

Get a page of deleted channels on a team based on query string parameters - team_id, page and per_page.  __Minimum server version__: 3.10  ##### Permissions Must be authenticated and have the &#x60;manage_team&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of public channels per page.
try {
    val result : kotlin.Array<Channel> = apiInstance.teamsTeamIdChannelsDeletedGet(teamId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#teamsTeamIdChannelsDeletedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#teamsTeamIdChannelsDeletedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| Team GUID |
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of public channels per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdChannelsGet"></a>
# **teamsTeamIdChannelsGet**
> kotlin.Array&lt;Channel&gt; teamsTeamIdChannelsGet(teamId, page, perPage)

Get public channels

Get a page of public channels on a team based on query string parameters - page and per_page. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
val page : kotlin.String = page_example // kotlin.String | The page to select.
val perPage : kotlin.String = perPage_example // kotlin.String | The number of public channels per page.
try {
    val result : kotlin.Array<Channel> = apiInstance.teamsTeamIdChannelsGet(teamId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#teamsTeamIdChannelsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#teamsTeamIdChannelsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| Team GUID |
 **page** | **kotlin.String**| The page to select. | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of public channels per page. | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdChannelsIdsPost"></a>
# **teamsTeamIdChannelsIdsPost**
> kotlin.Array&lt;Channel&gt; teamsTeamIdChannelsIdsPost(teamId, body)

Get a list of channels by ids

Get a list of public channels on a team by id. ##### Permissions &#x60;view_team&#x60; for the team the channels are on. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
val body : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of channel ids
try {
    val result : kotlin.Array<Channel> = apiInstance.teamsTeamIdChannelsIdsPost(teamId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#teamsTeamIdChannelsIdsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#teamsTeamIdChannelsIdsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| Team GUID |
 **body** | **kotlin.Array&lt;kotlin.String&gt;**| List of channel ids |

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdChannelsNameChannelNameGet"></a>
# **teamsTeamIdChannelsNameChannelNameGet**
> Channel teamsTeamIdChannelsNameChannelNameGet(teamId, channelName)

Get a channel by name

Gets channel from the provided team id and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
val channelName : kotlin.String = channelName_example // kotlin.String | Channel Name
try {
    val result : Channel = apiInstance.teamsTeamIdChannelsNameChannelNameGet(teamId, channelName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#teamsTeamIdChannelsNameChannelNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#teamsTeamIdChannelsNameChannelNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| Team GUID |
 **channelName** | **kotlin.String**| Channel Name |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdChannelsSearchPost"></a>
# **teamsTeamIdChannelsSearchPost**
> kotlin.Array&lt;Channel&gt; teamsTeamIdChannelsSearchPost(teamId, body)

Search channels

Search public channels on a team based on the search term provided in the request body. ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
val body : Body_25 =  // Body_25 | Search criteria
try {
    val result : kotlin.Array<Channel> = apiInstance.teamsTeamIdChannelsSearchPost(teamId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#teamsTeamIdChannelsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#teamsTeamIdChannelsSearchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| Team GUID |
 **body** | [**Body_25**](Body_25.md)| Search criteria |

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdChannelsChannelIdUnreadGet"></a>
# **usersUserIdChannelsChannelIdUnreadGet**
> ChannelUnread usersUserIdChannelsChannelIdUnreadGet(userId, channelId)

Get unread messages

Get the total unread messages and mentions for a channel for a user. ##### Permissions Must be logged in as user and have the &#x60;read_channel&#x60; permission, or have &#x60;edit_other_usrs&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val channelId : kotlin.String = channelId_example // kotlin.String | Channel GUID
try {
    val result : ChannelUnread = apiInstance.usersUserIdChannelsChannelIdUnreadGet(userId, channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#usersUserIdChannelsChannelIdUnreadGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#usersUserIdChannelsChannelIdUnreadGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |
 **channelId** | **kotlin.String**| Channel GUID |

### Return type

[**ChannelUnread**](ChannelUnread.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdTeamsTeamIdChannelsGet"></a>
# **usersUserIdTeamsTeamIdChannelsGet**
> kotlin.Array&lt;Channel&gt; usersUserIdTeamsTeamIdChannelsGet(userId, teamId)

Get channels for user

Get all the channels on a team for a user. ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission, and &#x60;view_team&#x60; permission for the team. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
try {
    val result : kotlin.Array<Channel> = apiInstance.usersUserIdTeamsTeamIdChannelsGet(userId, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#usersUserIdTeamsTeamIdChannelsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#usersUserIdTeamsTeamIdChannelsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |
 **teamId** | **kotlin.String**| Team GUID |

### Return type

[**kotlin.Array&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdTeamsTeamIdChannelsMembersGet"></a>
# **usersUserIdTeamsTeamIdChannelsMembersGet**
> kotlin.Array&lt;ChannelMember&gt; usersUserIdTeamsTeamIdChannelsMembersGet(userId, teamId)

Get channel members for user

Get all channel members on a team for a user. ##### Permissions Logged in as the user and &#x60;view_team&#x60; permission for the team. Having &#x60;manage_system&#x60; permission voids the previous requirements. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ChannelsApi()
val userId : kotlin.String = userId_example // kotlin.String | User GUID
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
try {
    val result : kotlin.Array<ChannelMember> = apiInstance.usersUserIdTeamsTeamIdChannelsMembersGet(userId, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelsApi#usersUserIdTeamsTeamIdChannelsMembersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelsApi#usersUserIdTeamsTeamIdChannelsMembersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| User GUID |
 **teamId** | **kotlin.String**| Team GUID |

### Return type

[**kotlin.Array&lt;ChannelMember&gt;**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

