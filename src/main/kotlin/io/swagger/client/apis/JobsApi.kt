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
package io.swagger.client.apis

import io.swagger.client.models.AppError
import io.swagger.client.models.Body_31
import io.swagger.client.models.Job
import io.swagger.client.models.StatusOK

import io.swagger.client.infrastructure.*

class JobsApi(basePath: kotlin.String = "http://your-mattermost-url.com/api/v4") : ApiClient(basePath) {

    /**
    * Get the jobs.
    * Get a page of jobs. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
    * @param page The page to select. (optional, default to 0)
    * @param perPage The number of jobs per page. (optional, default to 60)
    * @return kotlin.Array<Job>
    */
    @Suppress("UNCHECKED_CAST")
    fun jobsGet(page: kotlin.String, perPage: kotlin.String) : kotlin.Array<Job> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "perPage" to listOf("$perPage"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/jobs",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Job>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Job>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Cancel a job.
    * Cancel a job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
    * @param jobId Job GUID 
    * @return StatusOK
    */
    @Suppress("UNCHECKED_CAST")
    fun jobsJobIdCancelPost(jobId: kotlin.String) : StatusOK {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/jobs/{job_id}/cancel".replace("{"+"job_id"+"}", "$jobId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<StatusOK>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as StatusOK
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get a job.
    * Gets a single job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
    * @param jobId Job GUID 
    * @return Job
    */
    @Suppress("UNCHECKED_CAST")
    fun jobsJobIdGet(jobId: kotlin.String) : Job {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/jobs/{job_id}".replace("{"+"job_id"+"}", "$jobId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Job>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Job
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Create a new job.
    * Create a new job. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
    * @param body Job object to be created 
    * @return Job
    */
    @Suppress("UNCHECKED_CAST")
    fun jobsPost(body: Body_31) : Job {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/jobs",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Job>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Job
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get the jobs of the given type.
    * Get a page of jobs of the given type. Use the query parameters to modify the behaviour of this endpoint. __Minimum server version: 4.1__ ##### Permissions Must have &#x60;manage_jobs&#x60; permission. 
    * @param type Job type 
    * @param page The page to select. (optional, default to 0)
    * @param perPage The number of jobs per page. (optional, default to 60)
    * @return kotlin.Array<Job>
    */
    @Suppress("UNCHECKED_CAST")
    fun jobsTypeTypeGet(type: kotlin.String, page: kotlin.String, perPage: kotlin.String) : kotlin.Array<Job> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "perPage" to listOf("$perPage"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/jobs/type/{type}".replace("{"+"type"+"}", "$type"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Job>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Job>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
