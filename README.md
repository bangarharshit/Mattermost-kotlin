# io.swagger.client - Kotlin client library for Mattermost API Reference

## Command to generate
`swagger-codegen generate -i mattermost-openapi-v4.yaml -l kotlin  -o kotlin/`
## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://your-mattermost-url.com/api/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandApi* | [**brandImageGet**](docs/BrandApi.md#brandimageget) | **GET** /brand/image | Get brand image
*BrandApi* | [**brandImagePost**](docs/BrandApi.md#brandimagepost) | **POST** /brand/image | Upload brand image
*ChannelsApi* | [**channelsChannelIdDelete**](docs/ChannelsApi.md#channelschanneliddelete) | **DELETE** /channels/{channel_id} | Delete a channel
*ChannelsApi* | [**channelsChannelIdGet**](docs/ChannelsApi.md#channelschannelidget) | **GET** /channels/{channel_id} | Get a channel
*ChannelsApi* | [**channelsChannelIdMembersGet**](docs/ChannelsApi.md#channelschannelidmembersget) | **GET** /channels/{channel_id}/members | Get channel members
*ChannelsApi* | [**channelsChannelIdMembersIdsPost**](docs/ChannelsApi.md#channelschannelidmembersidspost) | **POST** /channels/{channel_id}/members/ids | Get channel members by ids
*ChannelsApi* | [**channelsChannelIdMembersPost**](docs/ChannelsApi.md#channelschannelidmemberspost) | **POST** /channels/{channel_id}/members | Add user to channel
*ChannelsApi* | [**channelsChannelIdMembersUserIdDelete**](docs/ChannelsApi.md#channelschannelidmembersuseriddelete) | **DELETE** /channels/{channel_id}/members/{user_id} | Remove user from channel
*ChannelsApi* | [**channelsChannelIdMembersUserIdGet**](docs/ChannelsApi.md#channelschannelidmembersuseridget) | **GET** /channels/{channel_id}/members/{user_id} | Get channel member
*ChannelsApi* | [**channelsChannelIdMembersUserIdNotifyPropsPut**](docs/ChannelsApi.md#channelschannelidmembersuseridnotifypropsput) | **PUT** /channels/{channel_id}/members/{user_id}/notify_props | Update channel notifications
*ChannelsApi* | [**channelsChannelIdMembersUserIdRolesPut**](docs/ChannelsApi.md#channelschannelidmembersuseridrolesput) | **PUT** /channels/{channel_id}/members/{user_id}/roles | Update channel roles
*ChannelsApi* | [**channelsChannelIdPatchPut**](docs/ChannelsApi.md#channelschannelidpatchput) | **PUT** /channels/{channel_id}/patch | Patch a channel
*ChannelsApi* | [**channelsChannelIdPinnedGet**](docs/ChannelsApi.md#channelschannelidpinnedget) | **GET** /channels/{channel_id}/pinned | Get a channel's pinned posts
*ChannelsApi* | [**channelsChannelIdPut**](docs/ChannelsApi.md#channelschannelidput) | **PUT** /channels/{channel_id} | Update a channel
*ChannelsApi* | [**channelsChannelIdRestorePost**](docs/ChannelsApi.md#channelschannelidrestorepost) | **POST** /channels/{channel_id}/restore | Restore a channel
*ChannelsApi* | [**channelsChannelIdStatsGet**](docs/ChannelsApi.md#channelschannelidstatsget) | **GET** /channels/{channel_id}/stats | Get channel statistics
*ChannelsApi* | [**channelsDirectPost**](docs/ChannelsApi.md#channelsdirectpost) | **POST** /channels/direct | Create a direct message channel
*ChannelsApi* | [**channelsGroupPost**](docs/ChannelsApi.md#channelsgrouppost) | **POST** /channels/group | Create a group message channel
*ChannelsApi* | [**channelsMembersUserIdViewPost**](docs/ChannelsApi.md#channelsmembersuseridviewpost) | **POST** /channels/members/{user_id}/view | View channel
*ChannelsApi* | [**channelsPost**](docs/ChannelsApi.md#channelspost) | **POST** /channels | Create a channel
*ChannelsApi* | [**teamsNameTeamNameChannelsNameChannelNameGet**](docs/ChannelsApi.md#teamsnameteamnamechannelsnamechannelnameget) | **GET** /teams/name/{team_name}/channels/name/{channel_name} | Get a channel by name and team name
*ChannelsApi* | [**teamsTeamIdChannelsAutocompleteGet**](docs/ChannelsApi.md#teamsteamidchannelsautocompleteget) | **GET** /teams/{team_id}/channels/autocomplete | Autocomplete channels
*ChannelsApi* | [**teamsTeamIdChannelsDeletedGet**](docs/ChannelsApi.md#teamsteamidchannelsdeletedget) | **GET** /teams/{team_id}/channels/deleted | Get deleted channels
*ChannelsApi* | [**teamsTeamIdChannelsGet**](docs/ChannelsApi.md#teamsteamidchannelsget) | **GET** /teams/{team_id}/channels | Get public channels
*ChannelsApi* | [**teamsTeamIdChannelsIdsPost**](docs/ChannelsApi.md#teamsteamidchannelsidspost) | **POST** /teams/{team_id}/channels/ids | Get a list of channels by ids
*ChannelsApi* | [**teamsTeamIdChannelsNameChannelNameGet**](docs/ChannelsApi.md#teamsteamidchannelsnamechannelnameget) | **GET** /teams/{team_id}/channels/name/{channel_name} | Get a channel by name
*ChannelsApi* | [**teamsTeamIdChannelsSearchPost**](docs/ChannelsApi.md#teamsteamidchannelssearchpost) | **POST** /teams/{team_id}/channels/search | Search channels
*ChannelsApi* | [**usersUserIdChannelsChannelIdUnreadGet**](docs/ChannelsApi.md#usersuseridchannelschannelidunreadget) | **GET** /users/{user_id}/channels/{channel_id}/unread | Get unread messages
*ChannelsApi* | [**usersUserIdTeamsTeamIdChannelsGet**](docs/ChannelsApi.md#usersuseridteamsteamidchannelsget) | **GET** /users/{user_id}/teams/{team_id}/channels | Get channels for user
*ChannelsApi* | [**usersUserIdTeamsTeamIdChannelsMembersGet**](docs/ChannelsApi.md#usersuseridteamsteamidchannelsmembersget) | **GET** /users/{user_id}/teams/{team_id}/channels/members | Get channel members for user
*ClusterApi* | [**clusterStatusGet**](docs/ClusterApi.md#clusterstatusget) | **GET** /cluster/status | Get cluster status
*CommandsApi* | [**commandsCommandIdDelete**](docs/CommandsApi.md#commandscommandiddelete) | **DELETE** /commands/{command_id} | Delete a command
*CommandsApi* | [**commandsCommandIdPut**](docs/CommandsApi.md#commandscommandidput) | **PUT** /commands/{command_id} | Update a command
*CommandsApi* | [**commandsCommandIdRegenTokenPut**](docs/CommandsApi.md#commandscommandidregentokenput) | **PUT** /commands/{command_id}/regen_token | Generate a new token
*CommandsApi* | [**commandsExecutePost**](docs/CommandsApi.md#commandsexecutepost) | **POST** /commands/execute | Execute a command
*CommandsApi* | [**commandsGet**](docs/CommandsApi.md#commandsget) | **GET** /commands | List commands for a team
*CommandsApi* | [**commandsPost**](docs/CommandsApi.md#commandspost) | **POST** /commands | Create a command
*CommandsApi* | [**teamsTeamIdCommandsAutocompleteGet**](docs/CommandsApi.md#teamsteamidcommandsautocompleteget) | **GET** /teams/{team_id}/commands/autocomplete | List autocomplete commands
*ComplianceApi* | [**complianceReportsGet**](docs/ComplianceApi.md#compliancereportsget) | **GET** /compliance/reports | Get reports
*ComplianceApi* | [**complianceReportsPost**](docs/ComplianceApi.md#compliancereportspost) | **POST** /compliance/reports | Create report
*ComplianceApi* | [**complianceReportsReportIdDownloadGet**](docs/ComplianceApi.md#compliancereportsreportiddownloadget) | **GET** /compliance/reports/{report_id}/download | Download a report
*ComplianceApi* | [**complianceReportsReportIdGet**](docs/ComplianceApi.md#compliancereportsreportidget) | **GET** /compliance/reports/{report_id} | Get a report
*DataretentionApi* | [**dataRetentionPolicyGet**](docs/DataretentionApi.md#dataretentionpolicyget) | **GET** /data_retention/policy | Get the data retention policy details.
*ElasticsearchApi* | [**elasticsearchPurgeIndexesPost**](docs/ElasticsearchApi.md#elasticsearchpurgeindexespost) | **POST** /elasticsearch/purge_indexes | Purge all Elasticsearch indexes
*ElasticsearchApi* | [**elasticsearchTestPost**](docs/ElasticsearchApi.md#elasticsearchtestpost) | **POST** /elasticsearch/test | Test Elasticsearch configuration
*EmojiApi* | [**emojiAutocompleteGet**](docs/EmojiApi.md#emojiautocompleteget) | **GET** /emoji/autocomplete | Autocomplete custom emoji
*EmojiApi* | [**emojiEmojiIdDelete**](docs/EmojiApi.md#emojiemojiiddelete) | **DELETE** /emoji/{emoji_id} | Delete a custom emoji
*EmojiApi* | [**emojiEmojiIdGet**](docs/EmojiApi.md#emojiemojiidget) | **GET** /emoji/{emoji_id} | Get a custom emoji
*EmojiApi* | [**emojiEmojiIdImageGet**](docs/EmojiApi.md#emojiemojiidimageget) | **GET** /emoji/{emoji_id}/image | Get custom emoji image
*EmojiApi* | [**emojiGet**](docs/EmojiApi.md#emojiget) | **GET** /emoji | Get a list of custom emoji
*EmojiApi* | [**emojiNameEmojiNameGet**](docs/EmojiApi.md#emojinameemojinameget) | **GET** /emoji/name/{emoji_name} | Get a custom emoji by name
*EmojiApi* | [**emojiPost**](docs/EmojiApi.md#emojipost) | **POST** /emoji | Create a custom emoji
*EmojiApi* | [**emojiSearchPost**](docs/EmojiApi.md#emojisearchpost) | **POST** /emoji/search | Search custom emoji
*FilesApi* | [**filesFileIdGet**](docs/FilesApi.md#filesfileidget) | **GET** /files/{file_id} | Get a file
*FilesApi* | [**filesFileIdInfoGet**](docs/FilesApi.md#filesfileidinfoget) | **GET** /files/{file_id}/info | Get metadata for a file
*FilesApi* | [**filesFileIdLinkGet**](docs/FilesApi.md#filesfileidlinkget) | **GET** /files/{file_id}/link | Get a public file link
*FilesApi* | [**filesFileIdPreviewGet**](docs/FilesApi.md#filesfileidpreviewget) | **GET** /files/{file_id}/preview | Get a file's preview
*FilesApi* | [**filesFileIdThumbnailGet**](docs/FilesApi.md#filesfileidthumbnailget) | **GET** /files/{file_id}/thumbnail | Get a file's thumbnail
*FilesApi* | [**filesPost**](docs/FilesApi.md#filespost) | **POST** /files | Upload a file
*JobsApi* | [**jobsGet**](docs/JobsApi.md#jobsget) | **GET** /jobs | Get the jobs.
*JobsApi* | [**jobsJobIdCancelPost**](docs/JobsApi.md#jobsjobidcancelpost) | **POST** /jobs/{job_id}/cancel | Cancel a job.
*JobsApi* | [**jobsJobIdGet**](docs/JobsApi.md#jobsjobidget) | **GET** /jobs/{job_id} | Get a job.
*JobsApi* | [**jobsPost**](docs/JobsApi.md#jobspost) | **POST** /jobs | Create a new job.
*JobsApi* | [**jobsTypeTypeGet**](docs/JobsApi.md#jobstypetypeget) | **GET** /jobs/type/{type} | Get the jobs of the given type.
*LDAPApi* | [**ldapSyncPost**](docs/LDAPApi.md#ldapsyncpost) | **POST** /ldap/sync | Sync with LDAP
*LDAPApi* | [**ldapTestPost**](docs/LDAPApi.md#ldaptestpost) | **POST** /ldap/test | Test LDAP configuration
*OAuthApi* | [**oauthAppsAppIdDelete**](docs/OAuthApi.md#oauthappsappiddelete) | **DELETE** /oauth/apps/{app_id} | Delete an OAuth app
*OAuthApi* | [**oauthAppsAppIdGet**](docs/OAuthApi.md#oauthappsappidget) | **GET** /oauth/apps/{app_id} | Get an OAuth app
*OAuthApi* | [**oauthAppsAppIdInfoGet**](docs/OAuthApi.md#oauthappsappidinfoget) | **GET** /oauth/apps/{app_id}/info | Get info on an OAuth app
*OAuthApi* | [**oauthAppsAppIdPut**](docs/OAuthApi.md#oauthappsappidput) | **PUT** /oauth/apps/{app_id} | Update an OAuth app
*OAuthApi* | [**oauthAppsAppIdRegenSecretPost**](docs/OAuthApi.md#oauthappsappidregensecretpost) | **POST** /oauth/apps/{app_id}/regen_secret | Regenerate OAuth app secret
*OAuthApi* | [**oauthAppsGet**](docs/OAuthApi.md#oauthappsget) | **GET** /oauth/apps | Get OAuth apps
*OAuthApi* | [**oauthAppsPost**](docs/OAuthApi.md#oauthappspost) | **POST** /oauth/apps | Register OAuth app
*OAuthApi* | [**usersUserIdOauthAppsAuthorizedGet**](docs/OAuthApi.md#usersuseridoauthappsauthorizedget) | **GET** /users/{user_id}/oauth/apps/authorized | Get authorized OAuth apps
*PluginsApi* | [**pluginsGet**](docs/PluginsApi.md#pluginsget) | **GET** /plugins | Get plugins
*PluginsApi* | [**pluginsPluginIdActivatePost**](docs/PluginsApi.md#pluginspluginidactivatepost) | **POST** /plugins/{plugin_id}/activate | Activate plugin
*PluginsApi* | [**pluginsPluginIdDeactivatePost**](docs/PluginsApi.md#pluginspluginiddeactivatepost) | **POST** /plugins/{plugin_id}/deactivate | Deactivate plugin
*PluginsApi* | [**pluginsPluginIdDelete**](docs/PluginsApi.md#pluginspluginiddelete) | **DELETE** /plugins/{plugin_id} | Remove plugin
*PluginsApi* | [**pluginsPost**](docs/PluginsApi.md#pluginspost) | **POST** /plugins | Upload plugin
*PluginsApi* | [**pluginsWebappGet**](docs/PluginsApi.md#pluginswebappget) | **GET** /plugins/webapp | Get webapp plugins
*PostsApi* | [**channelsChannelIdPostsGet**](docs/PostsApi.md#channelschannelidpostsget) | **GET** /channels/{channel_id}/posts | Get posts for a channel
*PostsApi* | [**postsPost**](docs/PostsApi.md#postspost) | **POST** /posts | Create a post
*PostsApi* | [**postsPostIdActionsActionIdPost**](docs/PostsApi.md#postspostidactionsactionidpost) | **POST** /posts/{post_id}/actions/{action_id} | Perform a post action
*PostsApi* | [**postsPostIdDelete**](docs/PostsApi.md#postspostiddelete) | **DELETE** /posts/{post_id} | Delete a post
*PostsApi* | [**postsPostIdFilesInfoGet**](docs/PostsApi.md#postspostidfilesinfoget) | **GET** /posts/{post_id}/files/info | Get file info for post
*PostsApi* | [**postsPostIdGet**](docs/PostsApi.md#postspostidget) | **GET** /posts/{post_id} | Get a post
*PostsApi* | [**postsPostIdPatchPut**](docs/PostsApi.md#postspostidpatchput) | **PUT** /posts/{post_id}/patch | Patch a post
*PostsApi* | [**postsPostIdPinPost**](docs/PostsApi.md#postspostidpinpost) | **POST** /posts/{post_id}/pin | Pin a post to the channel
*PostsApi* | [**postsPostIdPut**](docs/PostsApi.md#postspostidput) | **PUT** /posts/{post_id} | Update a post
*PostsApi* | [**postsPostIdThreadGet**](docs/PostsApi.md#postspostidthreadget) | **GET** /posts/{post_id}/thread | Get a thread
*PostsApi* | [**postsPostIdUnpinPost**](docs/PostsApi.md#postspostidunpinpost) | **POST** /posts/{post_id}/unpin | Unpin a post to the channel
*PostsApi* | [**teamsTeamIdPostsSearchPost**](docs/PostsApi.md#teamsteamidpostssearchpost) | **POST** /teams/{team_id}/posts/search | Search for team posts
*PostsApi* | [**usersUserIdPostsFlaggedGet**](docs/PostsApi.md#usersuseridpostsflaggedget) | **GET** /users/{user_id}/posts/flagged | Get a list of flagged posts
*PreferencesApi* | [**usersUserIdPreferencesCategoryGet**](docs/PreferencesApi.md#usersuseridpreferencescategoryget) | **GET** /users/{user_id}/preferences/{category} | List a user's preferences by category
*PreferencesApi* | [**usersUserIdPreferencesCategoryNamePreferenceNameGet**](docs/PreferencesApi.md#usersuseridpreferencescategorynamepreferencenameget) | **GET** /users/{user_id}/preferences/{category}/name/{preference_name} | Get a specific user preference
*PreferencesApi* | [**usersUserIdPreferencesDeletePost**](docs/PreferencesApi.md#usersuseridpreferencesdeletepost) | **POST** /users/{user_id}/preferences/delete | Delete user's preferences
*PreferencesApi* | [**usersUserIdPreferencesGet**](docs/PreferencesApi.md#usersuseridpreferencesget) | **GET** /users/{user_id}/preferences | Get the user's preferences
*PreferencesApi* | [**usersUserIdPreferencesPut**](docs/PreferencesApi.md#usersuseridpreferencesput) | **PUT** /users/{user_id}/preferences | Save the user's preferences
*SAMLApi* | [**samlCertificateIdpDelete**](docs/SAMLApi.md#samlcertificateidpdelete) | **DELETE** /saml/certificate/idp | Remove IDP certificate
*SAMLApi* | [**samlCertificateIdpPost**](docs/SAMLApi.md#samlcertificateidppost) | **POST** /saml/certificate/idp | Upload IDP certificate
*SAMLApi* | [**samlCertificatePrivateDelete**](docs/SAMLApi.md#samlcertificateprivatedelete) | **DELETE** /saml/certificate/private | Remove private key
*SAMLApi* | [**samlCertificatePrivatePost**](docs/SAMLApi.md#samlcertificateprivatepost) | **POST** /saml/certificate/private | Upload private key
*SAMLApi* | [**samlCertificatePublicDelete**](docs/SAMLApi.md#samlcertificatepublicdelete) | **DELETE** /saml/certificate/public | Remove public certificate
*SAMLApi* | [**samlCertificatePublicPost**](docs/SAMLApi.md#samlcertificatepublicpost) | **POST** /saml/certificate/public | Upload public certificate
*SAMLApi* | [**samlCertificateStatusGet**](docs/SAMLApi.md#samlcertificatestatusget) | **GET** /saml/certificate/status | Get certificate status
*SAMLApi* | [**samlMetadataGet**](docs/SAMLApi.md#samlmetadataget) | **GET** /saml/metadata | Get metadata
*StatusApi* | [**usersStatusIdsGet**](docs/StatusApi.md#usersstatusidsget) | **GET** /users/status/ids | Get user statuses by id
*StatusApi* | [**usersUserIdStatusGet**](docs/StatusApi.md#usersuseridstatusget) | **GET** /users/{user_id}/status | Get user status
*StatusApi* | [**usersUserIdStatusPut**](docs/StatusApi.md#usersuseridstatusput) | **PUT** /users/{user_id}/status | Update user status
*SystemApi* | [**analyticsOldGet**](docs/SystemApi.md#analyticsoldget) | **GET** /analytics/old | Get analytics
*SystemApi* | [**auditsGet**](docs/SystemApi.md#auditsget) | **GET** /audits | Get audits
*SystemApi* | [**cachesInvalidatePost**](docs/SystemApi.md#cachesinvalidatepost) | **POST** /caches/invalidate | Invalidate all the caches
*SystemApi* | [**configClientGet**](docs/SystemApi.md#configclientget) | **GET** /config/client | Get client configuration
*SystemApi* | [**configGet**](docs/SystemApi.md#configget) | **GET** /config | Get configuration
*SystemApi* | [**configPut**](docs/SystemApi.md#configput) | **PUT** /config | Update configuration
*SystemApi* | [**configReloadPost**](docs/SystemApi.md#configreloadpost) | **POST** /config/reload | Reload configuration
*SystemApi* | [**databaseRecyclePost**](docs/SystemApi.md#databaserecyclepost) | **POST** /database/recycle | Recycle database connections
*SystemApi* | [**emailTestPost**](docs/SystemApi.md#emailtestpost) | **POST** /email/test | Send a test email
*SystemApi* | [**licenseClientGet**](docs/SystemApi.md#licenseclientget) | **GET** /license/client | Get client license
*SystemApi* | [**licenseDelete**](docs/SystemApi.md#licensedelete) | **DELETE** /license | Remove license file
*SystemApi* | [**licensePost**](docs/SystemApi.md#licensepost) | **POST** /license | Upload license file
*SystemApi* | [**logsGet**](docs/SystemApi.md#logsget) | **GET** /logs | Get logs
*SystemApi* | [**logsPost**](docs/SystemApi.md#logspost) | **POST** /logs | Add log message
*SystemApi* | [**systemPingGet**](docs/SystemApi.md#systempingget) | **GET** /system/ping | Check system health
*SystemApi* | [**webrtcTokenGet**](docs/SystemApi.md#webrtctokenget) | **GET** /webrtc/token | Get WebRTC token
*TeamsApi* | [**teamsGet**](docs/TeamsApi.md#teamsget) | **GET** /teams | Get teams
*TeamsApi* | [**teamsInviteInviteIdGet**](docs/TeamsApi.md#teamsinviteinviteidget) | **GET** /teams/invite/{invite_id} | Get invite info for a team
*TeamsApi* | [**teamsMembersInvitePost**](docs/TeamsApi.md#teamsmembersinvitepost) | **POST** /teams/members/invite | Add user to team from invite
*TeamsApi* | [**teamsNameNameExistsGet**](docs/TeamsApi.md#teamsnamenameexistsget) | **GET** /teams/name/{name}/exists | Check if team exists
*TeamsApi* | [**teamsNameNameGet**](docs/TeamsApi.md#teamsnamenameget) | **GET** /teams/name/{name} | Get a team by name
*TeamsApi* | [**teamsPost**](docs/TeamsApi.md#teamspost) | **POST** /teams | Create a team
*TeamsApi* | [**teamsSearchPost**](docs/TeamsApi.md#teamssearchpost) | **POST** /teams/search | Search teams
*TeamsApi* | [**teamsTeamIdDelete**](docs/TeamsApi.md#teamsteamiddelete) | **DELETE** /teams/{team_id} | Delete a team
*TeamsApi* | [**teamsTeamIdGet**](docs/TeamsApi.md#teamsteamidget) | **GET** /teams/{team_id} | Get a team
*TeamsApi* | [**teamsTeamIdImportPost**](docs/TeamsApi.md#teamsteamidimportpost) | **POST** /teams/{team_id}/import | Import a Team from other application
*TeamsApi* | [**teamsTeamIdInviteEmailPost**](docs/TeamsApi.md#teamsteamidinviteemailpost) | **POST** /teams/{team_id}/invite/email | Invite users to the team by email
*TeamsApi* | [**teamsTeamIdMembersBatchPost**](docs/TeamsApi.md#teamsteamidmembersbatchpost) | **POST** /teams/{team_id}/members/batch | Add multiple users to team
*TeamsApi* | [**teamsTeamIdMembersGet**](docs/TeamsApi.md#teamsteamidmembersget) | **GET** /teams/{team_id}/members | Get team members
*TeamsApi* | [**teamsTeamIdMembersIdsPost**](docs/TeamsApi.md#teamsteamidmembersidspost) | **POST** /teams/{team_id}/members/ids | Get team members by ids
*TeamsApi* | [**teamsTeamIdMembersPost**](docs/TeamsApi.md#teamsteamidmemberspost) | **POST** /teams/{team_id}/members | Add user to team
*TeamsApi* | [**teamsTeamIdMembersUserIdDelete**](docs/TeamsApi.md#teamsteamidmembersuseriddelete) | **DELETE** /teams/{team_id}/members/{user_id} | Remove user from team
*TeamsApi* | [**teamsTeamIdMembersUserIdGet**](docs/TeamsApi.md#teamsteamidmembersuseridget) | **GET** /teams/{team_id}/members/{user_id} | Get a team member
*TeamsApi* | [**teamsTeamIdMembersUserIdRolesPut**](docs/TeamsApi.md#teamsteamidmembersuseridrolesput) | **PUT** /teams/{team_id}/members/{user_id}/roles | Update a team member roles
*TeamsApi* | [**teamsTeamIdPatchPut**](docs/TeamsApi.md#teamsteamidpatchput) | **PUT** /teams/{team_id}/patch | Patch a team
*TeamsApi* | [**teamsTeamIdPut**](docs/TeamsApi.md#teamsteamidput) | **PUT** /teams/{team_id} | Update a team
*TeamsApi* | [**teamsTeamIdStatsGet**](docs/TeamsApi.md#teamsteamidstatsget) | **GET** /teams/{team_id}/stats | Get a team stats
*TeamsApi* | [**usersUserIdTeamsGet**](docs/TeamsApi.md#usersuseridteamsget) | **GET** /users/{user_id}/teams | Get a user's teams
*TeamsApi* | [**usersUserIdTeamsMembersGet**](docs/TeamsApi.md#usersuseridteamsmembersget) | **GET** /users/{user_id}/teams/members | Get team members for a user
*TeamsApi* | [**usersUserIdTeamsTeamIdUnreadGet**](docs/TeamsApi.md#usersuseridteamsteamidunreadget) | **GET** /users/{user_id}/teams/{team_id}/unread | Get unreads for a team
*TeamsApi* | [**usersUserIdTeamsUnreadGet**](docs/TeamsApi.md#usersuseridteamsunreadget) | **GET** /users/{user_id}/teams/unread | Get team unreads for a user
*UsersApi* | [**usersAutocompleteGet**](docs/UsersApi.md#usersautocompleteget) | **GET** /users/autocomplete | Autocomplete users
*UsersApi* | [**usersEmailEmailGet**](docs/UsersApi.md#usersemailemailget) | **GET** /users/email/{email} | Get a user by email
*UsersApi* | [**usersEmailVerifyPost**](docs/UsersApi.md#usersemailverifypost) | **POST** /users/email/verify | Verify user email
*UsersApi* | [**usersEmailVerifySendPost**](docs/UsersApi.md#usersemailverifysendpost) | **POST** /users/email/verify/send | Send verification email
*UsersApi* | [**usersGet**](docs/UsersApi.md#usersget) | **GET** /users | Get users
*UsersApi* | [**usersIdsPost**](docs/UsersApi.md#usersidspost) | **POST** /users/ids | Get users by ids
*UsersApi* | [**usersLoginSwitchPost**](docs/UsersApi.md#usersloginswitchpost) | **POST** /users/login/switch | Switch login method
*UsersApi* | [**usersMfaPost**](docs/UsersApi.md#usersmfapost) | **POST** /users/mfa | Check MFA
*UsersApi* | [**usersPasswordResetPost**](docs/UsersApi.md#userspasswordresetpost) | **POST** /users/password/reset | Reset password
*UsersApi* | [**usersPasswordResetSendPost**](docs/UsersApi.md#userspasswordresetsendpost) | **POST** /users/password/reset/send | Send password reset email
*UsersApi* | [**usersPost**](docs/UsersApi.md#userspost) | **POST** /users | Create a user
*UsersApi* | [**usersSearchPost**](docs/UsersApi.md#userssearchpost) | **POST** /users/search | Search users
*UsersApi* | [**usersSessionsDevicePut**](docs/UsersApi.md#userssessionsdeviceput) | **PUT** /users/sessions/device | Attach mobile device
*UsersApi* | [**usersTokensDisablePost**](docs/UsersApi.md#userstokensdisablepost) | **POST** /users/tokens/disable | Disable personal access token
*UsersApi* | [**usersTokensEnablePost**](docs/UsersApi.md#userstokensenablepost) | **POST** /users/tokens/enable | Enable personal access token
*UsersApi* | [**usersTokensGet**](docs/UsersApi.md#userstokensget) | **GET** /users/tokens | Get user access tokens
*UsersApi* | [**usersTokensRevokePost**](docs/UsersApi.md#userstokensrevokepost) | **POST** /users/tokens/revoke | Revoke a user access token
*UsersApi* | [**usersTokensSearchPost**](docs/UsersApi.md#userstokenssearchpost) | **POST** /users/tokens/search | Search tokens
*UsersApi* | [**usersTokensTokenIdGet**](docs/UsersApi.md#userstokenstokenidget) | **GET** /users/tokens/{token_id} | Get a user access token
*UsersApi* | [**usersUserIdActivePut**](docs/UsersApi.md#usersuseridactiveput) | **PUT** /users/{user_id}/active | Update user active status
*UsersApi* | [**usersUserIdAuditsGet**](docs/UsersApi.md#usersuseridauditsget) | **GET** /users/{user_id}/audits | Get user's audits
*UsersApi* | [**usersUserIdAuthPut**](docs/UsersApi.md#usersuseridauthput) | **PUT** /users/{user_id}/auth | Update a user's authentication method
*UsersApi* | [**usersUserIdDelete**](docs/UsersApi.md#usersuseriddelete) | **DELETE** /users/{user_id} | Deactivate a user account.
*UsersApi* | [**usersUserIdGet**](docs/UsersApi.md#usersuseridget) | **GET** /users/{user_id} | Get a user
*UsersApi* | [**usersUserIdImageGet**](docs/UsersApi.md#usersuseridimageget) | **GET** /users/{user_id}/image | Get user's profile image
*UsersApi* | [**usersUserIdImagePost**](docs/UsersApi.md#usersuseridimagepost) | **POST** /users/{user_id}/image | Set user's profile image
*UsersApi* | [**usersUserIdMfaGeneratePost**](docs/UsersApi.md#usersuseridmfageneratepost) | **POST** /users/{user_id}/mfa/generate | Generate MFA secret
*UsersApi* | [**usersUserIdMfaPut**](docs/UsersApi.md#usersuseridmfaput) | **PUT** /users/{user_id}/mfa | Update a user's MFA
*UsersApi* | [**usersUserIdPasswordPut**](docs/UsersApi.md#usersuseridpasswordput) | **PUT** /users/{user_id}/password | Update a user's password
*UsersApi* | [**usersUserIdPatchPut**](docs/UsersApi.md#usersuseridpatchput) | **PUT** /users/{user_id}/patch | Patch a user
*UsersApi* | [**usersUserIdPut**](docs/UsersApi.md#usersuseridput) | **PUT** /users/{user_id} | Update a user
*UsersApi* | [**usersUserIdRolesPut**](docs/UsersApi.md#usersuseridrolesput) | **PUT** /users/{user_id}/roles | Update a user's roles
*UsersApi* | [**usersUserIdSessionsGet**](docs/UsersApi.md#usersuseridsessionsget) | **GET** /users/{user_id}/sessions | Get user's sessions
*UsersApi* | [**usersUserIdSessionsRevokeAllPost**](docs/UsersApi.md#usersuseridsessionsrevokeallpost) | **POST** /users/{user_id}/sessions/revoke/all | Revoke all active sessions for a user
*UsersApi* | [**usersUserIdSessionsRevokePost**](docs/UsersApi.md#usersuseridsessionsrevokepost) | **POST** /users/{user_id}/sessions/revoke | Revoke a user session
*UsersApi* | [**usersUserIdTokensGet**](docs/UsersApi.md#usersuseridtokensget) | **GET** /users/{user_id}/tokens | Get user access tokens
*UsersApi* | [**usersUserIdTokensPost**](docs/UsersApi.md#usersuseridtokenspost) | **POST** /users/{user_id}/tokens | Create a user access token
*UsersApi* | [**usersUsernameUsernameGet**](docs/UsersApi.md#usersusernameusernameget) | **GET** /users/username/{username} | Get a user by username
*UsersApi* | [**usersUsernamesPost**](docs/UsersApi.md#usersusernamespost) | **POST** /users/usernames | Get users by usernames
*WebhooksApi* | [**hooksIncomingGet**](docs/WebhooksApi.md#hooksincomingget) | **GET** /hooks/incoming | List incoming webhooks
*WebhooksApi* | [**hooksIncomingHookIdGet**](docs/WebhooksApi.md#hooksincominghookidget) | **GET** /hooks/incoming/{hook_id} | Get an incoming webhook
*WebhooksApi* | [**hooksIncomingHookIdPut**](docs/WebhooksApi.md#hooksincominghookidput) | **PUT** /hooks/incoming/{hook_id} | Update an incoming webhook
*WebhooksApi* | [**hooksIncomingPost**](docs/WebhooksApi.md#hooksincomingpost) | **POST** /hooks/incoming | Create an incoming webhook
*WebhooksApi* | [**hooksOutgoingGet**](docs/WebhooksApi.md#hooksoutgoingget) | **GET** /hooks/outgoing | List outgoing webhooks
*WebhooksApi* | [**hooksOutgoingHookIdDelete**](docs/WebhooksApi.md#hooksoutgoinghookiddelete) | **DELETE** /hooks/outgoing/{hook_id} | Delete an outgoing webhook
*WebhooksApi* | [**hooksOutgoingHookIdGet**](docs/WebhooksApi.md#hooksoutgoinghookidget) | **GET** /hooks/outgoing/{hook_id} | Get an outgoing webhook
*WebhooksApi* | [**hooksOutgoingHookIdPut**](docs/WebhooksApi.md#hooksoutgoinghookidput) | **PUT** /hooks/outgoing/{hook_id} | Update an outgoing webhook
*WebhooksApi* | [**hooksOutgoingHookIdRegenTokenPost**](docs/WebhooksApi.md#hooksoutgoinghookidregentokenpost) | **POST** /hooks/outgoing/{hook_id}/regen_token | Regenerate the token for the outgoing webhook.
*WebhooksApi* | [**hooksOutgoingPost**](docs/WebhooksApi.md#hooksoutgoingpost) | **POST** /hooks/outgoing | Create an outgoing webhook


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.AppError](docs/AppError.md)
 - [io.swagger.client.models.Audit](docs/Audit.md)
 - [io.swagger.client.models.Body](docs/Body.md)
 - [io.swagger.client.models.Body_1](docs/Body_1.md)
 - [io.swagger.client.models.Body_10](docs/Body_10.md)
 - [io.swagger.client.models.Body_11](docs/Body_11.md)
 - [io.swagger.client.models.Body_12](docs/Body_12.md)
 - [io.swagger.client.models.Body_13](docs/Body_13.md)
 - [io.swagger.client.models.Body_14](docs/Body_14.md)
 - [io.swagger.client.models.Body_15](docs/Body_15.md)
 - [io.swagger.client.models.Body_16](docs/Body_16.md)
 - [io.swagger.client.models.Body_17](docs/Body_17.md)
 - [io.swagger.client.models.Body_18](docs/Body_18.md)
 - [io.swagger.client.models.Body_19](docs/Body_19.md)
 - [io.swagger.client.models.Body_2](docs/Body_2.md)
 - [io.swagger.client.models.Body_20](docs/Body_20.md)
 - [io.swagger.client.models.Body_21](docs/Body_21.md)
 - [io.swagger.client.models.Body_22](docs/Body_22.md)
 - [io.swagger.client.models.Body_23](docs/Body_23.md)
 - [io.swagger.client.models.Body_24](docs/Body_24.md)
 - [io.swagger.client.models.Body_25](docs/Body_25.md)
 - [io.swagger.client.models.Body_26](docs/Body_26.md)
 - [io.swagger.client.models.Body_27](docs/Body_27.md)
 - [io.swagger.client.models.Body_28](docs/Body_28.md)
 - [io.swagger.client.models.Body_29](docs/Body_29.md)
 - [io.swagger.client.models.Body_3](docs/Body_3.md)
 - [io.swagger.client.models.Body_30](docs/Body_30.md)
 - [io.swagger.client.models.Body_31](docs/Body_31.md)
 - [io.swagger.client.models.Body_32](docs/Body_32.md)
 - [io.swagger.client.models.Body_33](docs/Body_33.md)
 - [io.swagger.client.models.Body_34](docs/Body_34.md)
 - [io.swagger.client.models.Body_35](docs/Body_35.md)
 - [io.swagger.client.models.Body_36](docs/Body_36.md)
 - [io.swagger.client.models.Body_37](docs/Body_37.md)
 - [io.swagger.client.models.Body_38](docs/Body_38.md)
 - [io.swagger.client.models.Body_39](docs/Body_39.md)
 - [io.swagger.client.models.Body_4](docs/Body_4.md)
 - [io.swagger.client.models.Body_40](docs/Body_40.md)
 - [io.swagger.client.models.Body_41](docs/Body_41.md)
 - [io.swagger.client.models.Body_5](docs/Body_5.md)
 - [io.swagger.client.models.Body_6](docs/Body_6.md)
 - [io.swagger.client.models.Body_7](docs/Body_7.md)
 - [io.swagger.client.models.Body_8](docs/Body_8.md)
 - [io.swagger.client.models.Body_9](docs/Body_9.md)
 - [io.swagger.client.models.Channel](docs/Channel.md)
 - [io.swagger.client.models.ChannelData](docs/ChannelData.md)
 - [io.swagger.client.models.ChannelMember](docs/ChannelMember.md)
 - [io.swagger.client.models.ChannelNotifyProps](docs/ChannelNotifyProps.md)
 - [io.swagger.client.models.ChannelStats](docs/ChannelStats.md)
 - [io.swagger.client.models.ChannelUnread](docs/ChannelUnread.md)
 - [io.swagger.client.models.ClusterInfo](docs/ClusterInfo.md)
 - [io.swagger.client.models.Command](docs/Command.md)
 - [io.swagger.client.models.CommandResponse](docs/CommandResponse.md)
 - [io.swagger.client.models.Compliance](docs/Compliance.md)
 - [io.swagger.client.models.Config](docs/Config.md)
 - [io.swagger.client.models.Config_AnalyticsSettings](docs/Config_AnalyticsSettings.md)
 - [io.swagger.client.models.Config_ClusterSettings](docs/Config_ClusterSettings.md)
 - [io.swagger.client.models.Config_ComplianceSettings](docs/Config_ComplianceSettings.md)
 - [io.swagger.client.models.Config_EmailSettings](docs/Config_EmailSettings.md)
 - [io.swagger.client.models.Config_FileSettings](docs/Config_FileSettings.md)
 - [io.swagger.client.models.Config_GitLabSettings](docs/Config_GitLabSettings.md)
 - [io.swagger.client.models.Config_LdapSettings](docs/Config_LdapSettings.md)
 - [io.swagger.client.models.Config_LocalizationSettings](docs/Config_LocalizationSettings.md)
 - [io.swagger.client.models.Config_LogSettings](docs/Config_LogSettings.md)
 - [io.swagger.client.models.Config_MetricsSettings](docs/Config_MetricsSettings.md)
 - [io.swagger.client.models.Config_NativeAppSettings](docs/Config_NativeAppSettings.md)
 - [io.swagger.client.models.Config_PasswordSettings](docs/Config_PasswordSettings.md)
 - [io.swagger.client.models.Config_PrivacySettings](docs/Config_PrivacySettings.md)
 - [io.swagger.client.models.Config_RateLimitSettings](docs/Config_RateLimitSettings.md)
 - [io.swagger.client.models.Config_SamlSettings](docs/Config_SamlSettings.md)
 - [io.swagger.client.models.Config_ServiceSettings](docs/Config_ServiceSettings.md)
 - [io.swagger.client.models.Config_SqlSettings](docs/Config_SqlSettings.md)
 - [io.swagger.client.models.Config_SupportSettings](docs/Config_SupportSettings.md)
 - [io.swagger.client.models.Config_TeamSettings](docs/Config_TeamSettings.md)
 - [io.swagger.client.models.Config_WebrtcSettings](docs/Config_WebrtcSettings.md)
 - [io.swagger.client.models.DataRetentionPolicy](docs/DataRetentionPolicy.md)
 - [io.swagger.client.models.Emoji](docs/Emoji.md)
 - [io.swagger.client.models.FileInfo](docs/FileInfo.md)
 - [io.swagger.client.models.IncomingWebhook](docs/IncomingWebhook.md)
 - [io.swagger.client.models.Inline_response_200](docs/Inline_response_200.md)
 - [io.swagger.client.models.Inline_response_200_1](docs/Inline_response_200_1.md)
 - [io.swagger.client.models.Inline_response_200_2](docs/Inline_response_200_2.md)
 - [io.swagger.client.models.Inline_response_200_3](docs/Inline_response_200_3.md)
 - [io.swagger.client.models.Inline_response_200_4](docs/Inline_response_200_4.md)
 - [io.swagger.client.models.Inline_response_200_5](docs/Inline_response_200_5.md)
 - [io.swagger.client.models.Inline_response_200_6](docs/Inline_response_200_6.md)
 - [io.swagger.client.models.Inline_response_200_7](docs/Inline_response_200_7.md)
 - [io.swagger.client.models.Inline_response_200_8](docs/Inline_response_200_8.md)
 - [io.swagger.client.models.Inline_response_200_9](docs/Inline_response_200_9.md)
 - [io.swagger.client.models.Job](docs/Job.md)
 - [io.swagger.client.models.OAuthApp](docs/OAuthApp.md)
 - [io.swagger.client.models.OpenGraph](docs/OpenGraph.md)
 - [io.swagger.client.models.OpenGraph_article](docs/OpenGraph_article.md)
 - [io.swagger.client.models.OpenGraph_article_authors](docs/OpenGraph_article_authors.md)
 - [io.swagger.client.models.OpenGraph_audios](docs/OpenGraph_audios.md)
 - [io.swagger.client.models.OpenGraph_book](docs/OpenGraph_book.md)
 - [io.swagger.client.models.OpenGraph_images](docs/OpenGraph_images.md)
 - [io.swagger.client.models.OpenGraph_videos](docs/OpenGraph_videos.md)
 - [io.swagger.client.models.OutgoingWebhook](docs/OutgoingWebhook.md)
 - [io.swagger.client.models.PluginManifest](docs/PluginManifest.md)
 - [io.swagger.client.models.PluginManifestWebapp](docs/PluginManifestWebapp.md)
 - [io.swagger.client.models.PluginManifest_backend](docs/PluginManifest_backend.md)
 - [io.swagger.client.models.PluginManifest_webapp](docs/PluginManifest_webapp.md)
 - [io.swagger.client.models.Post](docs/Post.md)
 - [io.swagger.client.models.PostList](docs/PostList.md)
 - [io.swagger.client.models.Preference](docs/Preference.md)
 - [io.swagger.client.models.Reaction](docs/Reaction.md)
 - [io.swagger.client.models.Roles](docs/Roles.md)
 - [io.swagger.client.models.Roles_1](docs/Roles_1.md)
 - [io.swagger.client.models.SamlCertificateStatus](docs/SamlCertificateStatus.md)
 - [io.swagger.client.models.Session](docs/Session.md)
 - [io.swagger.client.models.SlackAttachment](docs/SlackAttachment.md)
 - [io.swagger.client.models.SlackAttachmentField](docs/SlackAttachmentField.md)
 - [io.swagger.client.models.Status](docs/Status.md)
 - [io.swagger.client.models.StatusOK](docs/StatusOK.md)
 - [io.swagger.client.models.Team](docs/Team.md)
 - [io.swagger.client.models.TeamExists](docs/TeamExists.md)
 - [io.swagger.client.models.TeamMap](docs/TeamMap.md)
 - [io.swagger.client.models.TeamMember](docs/TeamMember.md)
 - [io.swagger.client.models.TeamStats](docs/TeamStats.md)
 - [io.swagger.client.models.TeamUnread](docs/TeamUnread.md)
 - [io.swagger.client.models.Token](docs/Token.md)
 - [io.swagger.client.models.Token_1](docs/Token_1.md)
 - [io.swagger.client.models.Token_2](docs/Token_2.md)
 - [io.swagger.client.models.Token_3](docs/Token_3.md)
 - [io.swagger.client.models.User](docs/User.md)
 - [io.swagger.client.models.UserAccessToken](docs/UserAccessToken.md)
 - [io.swagger.client.models.UserAccessTokenSanitized](docs/UserAccessTokenSanitized.md)
 - [io.swagger.client.models.UserAuthData](docs/UserAuthData.md)
 - [io.swagger.client.models.UserAutocomplete](docs/UserAutocomplete.md)
 - [io.swagger.client.models.UserAutocompleteInChannel](docs/UserAutocompleteInChannel.md)
 - [io.swagger.client.models.UserAutocompleteInTeam](docs/UserAutocompleteInTeam.md)
 - [io.swagger.client.models.UserNotifyProps](docs/UserNotifyProps.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
