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
 * @param term The term to match against the emoji name.
 * @param prefix_only Set to only search for names starting with the search term.
 */
data class Body_33 (
    /* The term to match against the emoji name. */
    val term: kotlin.String,
    /* Set to only search for names starting with the search term. */
    val prefix_only: kotlin.String? = null
) {

}

