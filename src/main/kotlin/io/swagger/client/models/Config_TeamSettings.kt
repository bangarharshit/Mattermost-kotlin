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
 * @param SiteName 
 * @param MaxUsersPerTeam 
 * @param EnableTeamCreation 
 * @param EnableUserCreation 
 * @param EnableOpenServer 
 * @param RestrictCreationToDomains 
 * @param EnableCustomBrand 
 * @param CustomBrandText 
 * @param CustomDescriptionText 
 * @param RestrictDirectMessage 
 * @param RestrictTeamInvite 
 * @param RestrictPublicChannelManagement 
 * @param RestrictPrivateChannelManagement 
 * @param RestrictPublicChannelCreation 
 * @param RestrictPrivateChannelCreation 
 * @param RestrictPublicChannelDeletion 
 * @param RestrictPrivateChannelDeletion 
 * @param UserStatusAwayTimeout 
 * @param MaxChannelsPerTeam 
 * @param MaxNotificationsPerChannel 
 */
data class Config_TeamSettings (
    val SiteName: kotlin.String? = null,
    val MaxUsersPerTeam: kotlin.Int? = null,
    val EnableTeamCreation: kotlin.Boolean? = null,
    val EnableUserCreation: kotlin.Boolean? = null,
    val EnableOpenServer: kotlin.Boolean? = null,
    val RestrictCreationToDomains: kotlin.String? = null,
    val EnableCustomBrand: kotlin.Boolean? = null,
    val CustomBrandText: kotlin.String? = null,
    val CustomDescriptionText: kotlin.String? = null,
    val RestrictDirectMessage: kotlin.String? = null,
    val RestrictTeamInvite: kotlin.String? = null,
    val RestrictPublicChannelManagement: kotlin.String? = null,
    val RestrictPrivateChannelManagement: kotlin.String? = null,
    val RestrictPublicChannelCreation: kotlin.String? = null,
    val RestrictPrivateChannelCreation: kotlin.String? = null,
    val RestrictPublicChannelDeletion: kotlin.String? = null,
    val RestrictPrivateChannelDeletion: kotlin.String? = null,
    val UserStatusAwayTimeout: kotlin.Int? = null,
    val MaxChannelsPerTeam: kotlin.Int? = null,
    val MaxNotificationsPerChannel: kotlin.Int? = null
) {

}
