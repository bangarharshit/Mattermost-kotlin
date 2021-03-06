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
 * @param user_id The ID of the user that owns this preference
 * @param category 
 * @param name 
 * @param value 
 */
data class Preference (
    /* The ID of the user that owns this preference */
    val user_id: kotlin.String? = null,
    val category: kotlin.String? = null,
    val name: kotlin.String? = null,
    val value: kotlin.String? = null
) {

}

