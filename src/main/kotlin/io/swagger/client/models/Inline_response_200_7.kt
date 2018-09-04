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
 * @param token The WebRTC token
 * @param gateway_url The URL to the gateway server
 * @param stun_uri The URI to the STUN server
 * @param turn_uri The URI to the TURN server
 * @param turn_password The password to use with the TURN server
 * @param turn_username The username to use with the TURN server
 */
data class Inline_response_200_7 (
    /* The WebRTC token */
    val token: kotlin.String? = null,
    /* The URL to the gateway server */
    val gateway_url: kotlin.String? = null,
    /* The URI to the STUN server */
    val stun_uri: kotlin.String? = null,
    /* The URI to the TURN server */
    val turn_uri: kotlin.String? = null,
    /* The password to use with the TURN server */
    val turn_password: kotlin.String? = null,
    /* The username to use with the TURN server */
    val turn_username: kotlin.String? = null
) {

}
