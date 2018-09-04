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
 * @param id 
 * @param create_at 
 * @param update_at 
 * @param delete_at 
 * @param display_name 
 * @param name 
 * @param description 
 * @param email 
 * @param type 
 * @param allowed_domains 
 * @param invite_id 
 * @param allow_open_invite 
 */
data class Team (
    val id: kotlin.String? = null,
    val create_at: kotlin.Int? = null,
    val update_at: kotlin.Int? = null,
    val delete_at: kotlin.Int? = null,
    val display_name: kotlin.String? = null,
    val name: kotlin.String? = null,
    val description: kotlin.String? = null,
    val email: kotlin.String? = null,
    val type: kotlin.String? = null,
    val allowed_domains: kotlin.String? = null,
    val invite_id: kotlin.String? = null,
    val allow_open_invite: kotlin.Boolean? = null
) {

}

