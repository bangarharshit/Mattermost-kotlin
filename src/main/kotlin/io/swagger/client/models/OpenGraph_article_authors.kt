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
 * @param first_name 
 * @param last_name 
 * @param username 
 * @param gender 
 */
data class OpenGraph_article_authors (
    val first_name: kotlin.String? = null,
    val last_name: kotlin.String? = null,
    val username: kotlin.String? = null,
    val gender: kotlin.String? = null
) {

}
