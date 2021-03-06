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
 * @param id The unique ID for the node
 * @param version The server version the node is on
 * @param config_hash The hash of the configuartion file the node is using
 * @param internode_url The URL used to communicate with those node from other nodes
 * @param hostname The hostname for this node
 * @param last_ping The time of the last ping to this node
 * @param is_alive Whether or not the node is alive and well
 */
data class ClusterInfo (
    /* The unique ID for the node */
    val id: kotlin.String? = null,
    /* The server version the node is on */
    val version: kotlin.String? = null,
    /* The hash of the configuartion file the node is using */
    val config_hash: kotlin.String? = null,
    /* The URL used to communicate with those node from other nodes */
    val internode_url: kotlin.String? = null,
    /* The hostname for this node */
    val hostname: kotlin.String? = null,
    /* The time of the last ping to this node */
    val last_ping: kotlin.Int? = null,
    /* Whether or not the node is alive and well */
    val is_alive: kotlin.Boolean? = null
) {

}

