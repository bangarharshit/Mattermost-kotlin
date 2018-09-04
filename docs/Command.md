
# Command

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The ID of the slash command |  [optional]
**token** | **kotlin.String** | The token which is used to verify the source of the payload |  [optional]
**create_at** | **kotlin.Int** | Timestamp when the command was created |  [optional]
**updated_at** | **kotlin.Int** | Timestamp when the command was last updated |  [optional]
**deleted_at** | **kotlin.Int** | Timestamp when the command was deleted, 0 if never deleted |  [optional]
**creator_id** | **kotlin.String** | The user id for the commands creator |  [optional]
**team_id** | **kotlin.String** | The team id for which this command is configured |  [optional]
**trigger** | **kotlin.String** | The string that triggers this command |  [optional]
**method** | **kotlin.String** | Is the trigger done with HTTP Get (&#39;G&#39;) or HTTP Post (&#39;P&#39;) |  [optional]
**username** | **kotlin.String** | What is the username for the response post |  [optional]
**icon_url** | **kotlin.String** | The url to find the icon for this users avatar |  [optional]
**auto_complete** | **kotlin.Boolean** | Use auto complete for this command |  [optional]
**auto_complete_desc** | **kotlin.String** | The description for this command shown when selecting the command |  [optional]
**auto_complete_hint** | **kotlin.String** | The hint for this command |  [optional]
**display_name** | **kotlin.String** | Display name for the command |  [optional]
**description** | **kotlin.String** | Description for this command |  [optional]
**url** | **kotlin.String** | The URL that is triggered |  [optional]



