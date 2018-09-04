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

import io.swagger.client.models.OpenGraph_article_authors

/**
 * Article object used in OpenGraph metadata of a webpage, if type is article
 * @param published_time 
 * @param modified_time 
 * @param expiration_time 
 * @param section 
 * @param tags 
 * @param authors 
 */
data class OpenGraph_article (
    val published_time: kotlin.String? = null,
    val modified_time: kotlin.String? = null,
    val expiration_time: kotlin.String? = null,
    val section: kotlin.String? = null,
    val tags: kotlin.Array<kotlin.String>? = null,
    val authors: kotlin.Array<OpenGraph_article_authors>? = null
) {

}

