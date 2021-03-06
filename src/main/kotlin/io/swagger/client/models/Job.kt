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
 * @param id The unique id of the job
 * @param type The type of job
 * @param create_at The time at which the job was created
 * @param start_at The time at which the job was started
 * @param last_activity_at The last time at which the job had activity
 * @param status The status of the job
 * @param progress The progress (as a percentage) of the job
 * @param &#x60;data&#x60; A freeform data field containing additional information about the job
 */
data class Job (
    /* The unique id of the job */
    val id: kotlin.String? = null,
    /* The type of job */
    val type: kotlin.String? = null,
    /* The time at which the job was created */
    val create_at: kotlin.Int? = null,
    /* The time at which the job was started */
    val start_at: kotlin.Int? = null,
    /* The last time at which the job had activity */
    val last_activity_at: kotlin.Int? = null,
    /* The status of the job */
    val status: kotlin.String? = null,
    /* The progress (as a percentage) of the job */
    val progress: kotlin.Int? = null,
    /* A freeform data field containing additional information about the job */
    val `data`: kotlin.Any? = null
) {

}

