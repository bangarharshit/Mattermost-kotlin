/**
* Mattermost API Reference
* ### API version 4 is stable with the Mattermost server 4.0 release. API version 3 is scheduled for deprecation on January 16th, 2018. [Details here](/#tag/APIv3-Deprecation). Looking for the APIv3 reference? It has moved [here](https://api.mattermost.com/v3). 
*
* OpenAPI spec version: 4.0.0
* Contact: feedback@mattermost.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models


/**
 * 
 * @param EnableSignUpWithEmail 
 * @param EnableSignInWithEmail 
 * @param EnableSignInWithUsername 
 * @param SendEmailNotifications 
 * @param RequireEmailVerification 
 * @param FeedbackName 
 * @param FeedbackEmail 
 * @param FeedbackOrganization 
 * @param SMTPUsername 
 * @param SMTPPassword 
 * @param SMTPServer 
 * @param SMTPPort 
 * @param ConnectionSecurity 
 * @param InviteSalt 
 * @param PasswordResetSalt 
 * @param SendPushNotifications 
 * @param PushNotificationServer 
 * @param PushNotificationContents 
 * @param EnableEmailBatching 
 * @param EmailBatchingBufferSize 
 * @param EmailBatchingInterval 
 */
data class Config_EmailSettings (
    val EnableSignUpWithEmail: kotlin.Boolean? = null,
    val EnableSignInWithEmail: kotlin.Boolean? = null,
    val EnableSignInWithUsername: kotlin.Boolean? = null,
    val SendEmailNotifications: kotlin.Boolean? = null,
    val RequireEmailVerification: kotlin.Boolean? = null,
    val FeedbackName: kotlin.String? = null,
    val FeedbackEmail: kotlin.String? = null,
    val FeedbackOrganization: kotlin.String? = null,
    val SMTPUsername: kotlin.String? = null,
    val SMTPPassword: kotlin.String? = null,
    val SMTPServer: kotlin.String? = null,
    val SMTPPort: kotlin.String? = null,
    val ConnectionSecurity: kotlin.String? = null,
    val InviteSalt: kotlin.String? = null,
    val PasswordResetSalt: kotlin.String? = null,
    val SendPushNotifications: kotlin.Boolean? = null,
    val PushNotificationServer: kotlin.String? = null,
    val PushNotificationContents: kotlin.String? = null,
    val EnableEmailBatching: kotlin.Boolean? = null,
    val EmailBatchingBufferSize: kotlin.Int? = null,
    val EmailBatchingInterval: kotlin.Int? = null
) {

}

