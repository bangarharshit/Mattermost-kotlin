
# DataRetentionPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_deletion_enabled** | **kotlin.Boolean** | Indicates whether data retention policy deletion of messages is enabled. |  [optional]
**file_deletion_enabled** | **kotlin.Boolean** | Indicates whether data retention policy deletion of file attachments is enabled. |  [optional]
**message_retention_cutoff** | **kotlin.Int** | The current server timestamp before which messages should be deleted. |  [optional]
**file_retention_cutoff** | **kotlin.Int** | The current server timestamp before which files should be deleted. |  [optional]



