# PostsApi

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**channelsChannelIdPostsGet**](PostsApi.md#channelsChannelIdPostsGet) | **GET** /channels/{channel_id}/posts | Get posts for a channel
[**postsPost**](PostsApi.md#postsPost) | **POST** /posts | Create a post
[**postsPostIdActionsActionIdPost**](PostsApi.md#postsPostIdActionsActionIdPost) | **POST** /posts/{post_id}/actions/{action_id} | Perform a post action
[**postsPostIdDelete**](PostsApi.md#postsPostIdDelete) | **DELETE** /posts/{post_id} | Delete a post
[**postsPostIdFilesInfoGet**](PostsApi.md#postsPostIdFilesInfoGet) | **GET** /posts/{post_id}/files/info | Get file info for post
[**postsPostIdGet**](PostsApi.md#postsPostIdGet) | **GET** /posts/{post_id} | Get a post
[**postsPostIdPatchPut**](PostsApi.md#postsPostIdPatchPut) | **PUT** /posts/{post_id}/patch | Patch a post
[**postsPostIdPinPost**](PostsApi.md#postsPostIdPinPost) | **POST** /posts/{post_id}/pin | Pin a post to the channel
[**postsPostIdPut**](PostsApi.md#postsPostIdPut) | **PUT** /posts/{post_id} | Update a post
[**postsPostIdThreadGet**](PostsApi.md#postsPostIdThreadGet) | **GET** /posts/{post_id}/thread | Get a thread
[**postsPostIdUnpinPost**](PostsApi.md#postsPostIdUnpinPost) | **POST** /posts/{post_id}/unpin | Unpin a post to the channel
[**teamsTeamIdPostsSearchPost**](PostsApi.md#teamsTeamIdPostsSearchPost) | **POST** /teams/{team_id}/posts/search | Search for team posts
[**usersUserIdPostsFlaggedGet**](PostsApi.md#usersUserIdPostsFlaggedGet) | **GET** /users/{user_id}/posts/flagged | Get a list of flagged posts


<a name="channelsChannelIdPostsGet"></a>
# **channelsChannelIdPostsGet**
> PostList channelsChannelIdPostsGet(channelId, page, perPage, since, before, after)

Get posts for a channel

Get a page of posts in a channel. Use the query parameters to modify the behaviour of this endpoint. The parameters &#x60;since&#x60;, &#x60;before&#x60; and &#x60;after&#x60; must not be used together. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val channelId : kotlin.String = channelId_example // kotlin.String | The channel ID to get the posts for
val page : kotlin.String = page_example // kotlin.String | The page to select
val perPage : kotlin.String = perPage_example // kotlin.String | The number of posts per page
val since : kotlin.Int = 56 // kotlin.Int | Provide a non-zero value in Unix time milliseconds to select posts created after that time
val before : kotlin.String = before_example // kotlin.String | A post id to select the posts that came before this one
val after : kotlin.String = after_example // kotlin.String | A post id to select the posts that came after this one
try {
    val result : PostList = apiInstance.channelsChannelIdPostsGet(channelId, page, perPage, since, before, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#channelsChannelIdPostsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#channelsChannelIdPostsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| The channel ID to get the posts for |
 **page** | **kotlin.String**| The page to select | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of posts per page | [optional] [default to 60]
 **since** | **kotlin.Int**| Provide a non-zero value in Unix time milliseconds to select posts created after that time | [optional]
 **before** | **kotlin.String**| A post id to select the posts that came before this one | [optional]
 **after** | **kotlin.String**| A post id to select the posts that came after this one | [optional]

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPost"></a>
# **postsPost**
> Post postsPost(post)

Create a post

Create a new post in a channel. To create the post as a comment on another post, provide &#x60;root_id&#x60;. ##### Permissions Must have &#x60;create_post&#x60; permission for the channel the post is being created in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val post : Post =  // Post | Post object to create
try {
    val result : Post = apiInstance.postsPost(post)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | [**Post**](Post.md)| Post object to create |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdActionsActionIdPost"></a>
# **postsPostIdActionsActionIdPost**
> StatusOK postsPostIdActionsActionIdPost(postId, actionId)

Perform a post action

Perform a post action, which allows users to interact with integrations through posts. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | Post GUID
val actionId : kotlin.String = actionId_example // kotlin.String | Action GUID
try {
    val result : StatusOK = apiInstance.postsPostIdActionsActionIdPost(postId, actionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdActionsActionIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdActionsActionIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| Post GUID |
 **actionId** | **kotlin.String**| Action GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdDelete"></a>
# **postsPostIdDelete**
> StatusOK postsPostIdDelete(postId)

Delete a post

Soft deletes a post, by marking the post as deleted in the database. Soft deleted posts will not be returned in post queries. ##### Permissions Must be logged in as the user or have &#x60;delete_others_posts&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | ID of the post to delete
try {
    val result : StatusOK = apiInstance.postsPostIdDelete(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| ID of the post to delete |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdFilesInfoGet"></a>
# **postsPostIdFilesInfoGet**
> kotlin.Array&lt;FileInfo&gt; postsPostIdFilesInfoGet(postId)

Get file info for post

Gets a list of file information objects for the files attached to a post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | ID of the post
try {
    val result : kotlin.Array<FileInfo> = apiInstance.postsPostIdFilesInfoGet(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdFilesInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdFilesInfoGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| ID of the post |

### Return type

[**kotlin.Array&lt;FileInfo&gt;**](FileInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdGet"></a>
# **postsPostIdGet**
> Post postsPostIdGet(postId)

Get a post

Get a single post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | ID of the post to get
try {
    val result : Post = apiInstance.postsPostIdGet(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| ID of the post to get |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdPatchPut"></a>
# **postsPostIdPatchPut**
> Post postsPostIdPatchPut(postId, body)

Patch a post

Partially update a post by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;edit_post&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | Post GUID
val body : Body_29 =  // Body_29 | Post object that is to be updated
try {
    val result : Post = apiInstance.postsPostIdPatchPut(postId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdPatchPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdPatchPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| Post GUID |
 **body** | [**Body_29**](Body_29.md)| Post object that is to be updated |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdPinPost"></a>
# **postsPostIdPinPost**
> StatusOK postsPostIdPinPost(postId)

Pin a post to the channel

Pin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | Post GUID
try {
    val result : StatusOK = apiInstance.postsPostIdPinPost(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdPinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdPinPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| Post GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdPut"></a>
# **postsPostIdPut**
> Post postsPostIdPut(postId, body)

Update a post

Update a post. Only the fields listed below are updatable, omitted fields will be treated as blank. ##### Permissions Must have &#x60;edit_post&#x60; permission for the channel the post is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | ID of the post to update
val body : Body_28 =  // Body_28 | Post object that is to be updated
try {
    val result : Post = apiInstance.postsPostIdPut(postId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| ID of the post to update |
 **body** | [**Body_28**](Body_28.md)| Post object that is to be updated |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdThreadGet"></a>
# **postsPostIdThreadGet**
> PostList postsPostIdThreadGet(postId)

Get a thread

Get a post and the rest of the posts in the same thread. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | ID of a post in the thread
try {
    val result : PostList = apiInstance.postsPostIdThreadGet(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdThreadGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdThreadGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| ID of a post in the thread |

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdUnpinPost"></a>
# **postsPostIdUnpinPost**
> StatusOK postsPostIdUnpinPost(postId)

Unpin a post to the channel

Unpin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val postId : kotlin.String = postId_example // kotlin.String | Post GUID
try {
    val result : StatusOK = apiInstance.postsPostIdUnpinPost(postId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#postsPostIdUnpinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#postsPostIdUnpinPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **kotlin.String**| Post GUID |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsTeamIdPostsSearchPost"></a>
# **teamsTeamIdPostsSearchPost**
> PostList teamsTeamIdPostsSearchPost(teamId, body)

Search for team posts

Search posts in the team and from the provided terms string. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val teamId : kotlin.String = teamId_example // kotlin.String | Team GUID
val body : Body_30 =  // Body_30 | The search terms and logic to use in the search.
try {
    val result : PostList = apiInstance.teamsTeamIdPostsSearchPost(teamId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#teamsTeamIdPostsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#teamsTeamIdPostsSearchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.String**| Team GUID |
 **body** | [**Body_30**](Body_30.md)| The search terms and logic to use in the search. |

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdPostsFlaggedGet"></a>
# **usersUserIdPostsFlaggedGet**
> kotlin.Array&lt;PostList&gt; usersUserIdPostsFlaggedGet(userId, teamId, channelId, page, perPage)

Get a list of flagged posts

Get a page of flagged posts of a user provided user id string. Selects from a channel, team or all flagged posts by a user. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PostsApi()
val userId : kotlin.String = userId_example // kotlin.String | ID of the user
val teamId : kotlin.String = teamId_example // kotlin.String | Team ID
val channelId : kotlin.String = channelId_example // kotlin.String | Channel ID
val page : kotlin.String = page_example // kotlin.String | The page to select
val perPage : kotlin.String = perPage_example // kotlin.String | The number of posts per page
try {
    val result : kotlin.Array<PostList> = apiInstance.usersUserIdPostsFlaggedGet(userId, teamId, channelId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostsApi#usersUserIdPostsFlaggedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostsApi#usersUserIdPostsFlaggedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| ID of the user |
 **teamId** | **kotlin.String**| Team ID | [optional]
 **channelId** | **kotlin.String**| Channel ID | [optional]
 **page** | **kotlin.String**| The page to select | [optional] [default to 0]
 **perPage** | **kotlin.String**| The number of posts per page | [optional] [default to 60]

### Return type

[**kotlin.Array&lt;PostList&gt;**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

