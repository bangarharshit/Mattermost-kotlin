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
 * Video object used in OpenGraph metadata of a webpage
 * @param url 
 * @param secure_url 
 * @param type 
 * @param width 
 * @param height 
 */
data class OpenGraph_videos (
    val url: kotlin.String? = null,
    val secure_url: kotlin.String? = null,
    val type: kotlin.String? = null,
    val width: kotlin.Int? = null,
    val height: kotlin.Int? = null
) {

}

