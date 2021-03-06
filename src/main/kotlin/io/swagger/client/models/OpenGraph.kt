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

import io.swagger.client.models.OpenGraph_article
import io.swagger.client.models.OpenGraph_article_authors
import io.swagger.client.models.OpenGraph_audios
import io.swagger.client.models.OpenGraph_book
import io.swagger.client.models.OpenGraph_images
import io.swagger.client.models.OpenGraph_videos

/**
 * OpenGraph metadata of a webpage
 * @param type 
 * @param url 
 * @param title 
 * @param description 
 * @param determiner 
 * @param site_name 
 * @param locale 
 * @param locales_alternate 
 * @param images 
 * @param videos 
 * @param audios 
 * @param article 
 * @param book 
 * @param profile 
 */
data class OpenGraph (
    val type: kotlin.String? = null,
    val url: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val determiner: kotlin.String? = null,
    val site_name: kotlin.String? = null,
    val locale: kotlin.String? = null,
    val locales_alternate: kotlin.Array<kotlin.String>? = null,
    val images: kotlin.Array<OpenGraph_images>? = null,
    val videos: kotlin.Array<OpenGraph_videos>? = null,
    val audios: kotlin.Array<OpenGraph_audios>? = null,
    val article: OpenGraph_article? = null,
    val book: OpenGraph_book? = null,
    val profile: OpenGraph_article_authors? = null
) {

}

