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
 * @param Enable 
 * @param GatewayWebsocketUrl 
 * @param GatewayAdminUrl 
 * @param GatewayAdminSecret 
 * @param StunURI 
 * @param TurnURI 
 * @param TurnUsername 
 * @param TurnSharedKey 
 */
data class Config_WebrtcSettings (
    val Enable: kotlin.Boolean? = null,
    val GatewayWebsocketUrl: kotlin.String? = null,
    val GatewayAdminUrl: kotlin.String? = null,
    val GatewayAdminSecret: kotlin.String? = null,
    val StunURI: kotlin.String? = null,
    val TurnURI: kotlin.String? = null,
    val TurnUsername: kotlin.String? = null,
    val TurnSharedKey: kotlin.String? = null
) {

}

