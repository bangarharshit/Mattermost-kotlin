
# OutgoingWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier for this outgoing webhook |  [optional]
**create_at** | **kotlin.Int** |  |  [optional]
**update_at** | **kotlin.Int** |  |  [optional]
**delete_at** | **kotlin.Int** |  |  [optional]
**creator_id** | **kotlin.String** | The Id of the user who created the webhook |  [optional]
**team_id** | **kotlin.String** | The ID of the team that the webhook watchs |  [optional]
**channel_id** | **kotlin.String** | The ID of a public channel that the webhook watchs |  [optional]
**description** | **kotlin.String** | The description for this outgoing webhook |  [optional]
**display_name** | **kotlin.String** | The display name for this outgoing webhook |  [optional]
**trigger_words** | **kotlin.Array&lt;kotlin.String&gt;** | List of words for the webhook to trigger on |  [optional]
**trigger_when** | **kotlin.Int** | When to trigger the webhook, &#x60;0&#x60; when a trigger word is present at all and &#x60;1&#x60; if the message starts with a trigger word |  [optional]
**callback_urls** | **kotlin.Array&lt;kotlin.String&gt;** | The URLs to POST the payloads to when the webhook is triggered |  [optional]
**content_type** | **kotlin.String** | The format to POST the data in, either &#x60;application/json&#x60; or &#x60;application/x-www-form-urlencoded&#x60; |  [optional]



