/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import com.fasterxml.jackson.annotation.JsonProperty

import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.WebClientResponseException
import org.springframework.http.codec.json.Jackson2JsonDecoder
import org.springframework.http.codec.json.Jackson2JsonEncoder
import org.springframework.http.ResponseEntity
import org.springframework.http.MediaType
import reactor.core.publisher.Mono
import org.springframework.util.LinkedMultiValueMap

import org.openapitools.client.models.Pet
import org.openapitools.client.models.StringEnumRef
import org.openapitools.client.models.TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter
import org.openapitools.client.infrastructure.*

class QueryApi(client: WebClient) : ApiClient(client) {

    constructor(baseUrl: String) : this(WebClient.builder()
        .baseUrl(baseUrl)
        .codecs {
            it.defaultCodecs().jackson2JsonEncoder(Jackson2JsonEncoder(Serializer.jacksonObjectMapper, MediaType.APPLICATION_JSON))
            it.defaultCodecs().jackson2JsonDecoder(Jackson2JsonDecoder(Serializer.jacksonObjectMapper, MediaType.APPLICATION_JSON))
        }
        .build()
    )

    /**
     * enum for parameter enumNonrefStringQuery
     */
    enum class EnumNonrefStringQueryTestEnumRefString(val value: kotlin.String) {
        @JsonProperty(value = "success") success("success"),
        @JsonProperty(value = "failure") failure("failure"),
        @JsonProperty(value = "unclassified") unclassified("unclassified"),
    }


    @Throws(WebClientResponseException::class)
    fun testEnumRefString(enumNonrefStringQuery: EnumNonrefStringQueryTestEnumRefString? = null, enumRefStringQuery: StringEnumRef? = null): Mono<kotlin.String> {
        return testEnumRefStringWithHttpInfo(enumNonrefStringQuery = enumNonrefStringQuery, enumRefStringQuery = enumRefStringQuery)
            .map { it.body }
    }

    @Throws(WebClientResponseException::class)
    fun testEnumRefStringWithHttpInfo(enumNonrefStringQuery: EnumNonrefStringQueryTestEnumRefString? = null, enumRefStringQuery: StringEnumRef? = null): Mono<ResponseEntity<kotlin.String>> {
        val localVariableConfig = testEnumRefStringRequestConfig(enumNonrefStringQuery = enumNonrefStringQuery, enumRefStringQuery = enumRefStringQuery)
        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    fun testEnumRefStringRequestConfig(enumNonrefStringQuery: EnumNonrefStringQueryTestEnumRefString? = null, enumRefStringQuery: StringEnumRef? = null) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (enumNonrefStringQuery != null) {
                    put("enum_nonref_string_query", listOf(enumNonrefStringQuery.toString()))
                }
                if (enumRefStringQuery != null) {
                    put("enum_ref_string_query", listOf(enumRefStringQuery.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/query/enum_ref_string",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    @Throws(WebClientResponseException::class)
    fun testQueryDatetimeDateString(datetimeQuery: java.time.OffsetDateTime? = null, dateQuery: java.time.LocalDate? = null, stringQuery: kotlin.String? = null): Mono<kotlin.String> {
        return testQueryDatetimeDateStringWithHttpInfo(datetimeQuery = datetimeQuery, dateQuery = dateQuery, stringQuery = stringQuery)
            .map { it.body }
    }

    @Throws(WebClientResponseException::class)
    fun testQueryDatetimeDateStringWithHttpInfo(datetimeQuery: java.time.OffsetDateTime? = null, dateQuery: java.time.LocalDate? = null, stringQuery: kotlin.String? = null): Mono<ResponseEntity<kotlin.String>> {
        val localVariableConfig = testQueryDatetimeDateStringRequestConfig(datetimeQuery = datetimeQuery, dateQuery = dateQuery, stringQuery = stringQuery)
        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    fun testQueryDatetimeDateStringRequestConfig(datetimeQuery: java.time.OffsetDateTime? = null, dateQuery: java.time.LocalDate? = null, stringQuery: kotlin.String? = null) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (datetimeQuery != null) {
                    put("datetime_query", listOf(parseDateToQueryString(datetimeQuery)))
                }
                if (dateQuery != null) {
                    put("date_query", listOf(parseDateToQueryString(dateQuery)))
                }
                if (stringQuery != null) {
                    put("string_query", listOf(stringQuery.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/query/datetime/date/string",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    @Throws(WebClientResponseException::class)
    fun testQueryIntegerBooleanString(integerQuery: kotlin.Int? = null, booleanQuery: kotlin.Boolean? = null, stringQuery: kotlin.String? = null): Mono<kotlin.String> {
        return testQueryIntegerBooleanStringWithHttpInfo(integerQuery = integerQuery, booleanQuery = booleanQuery, stringQuery = stringQuery)
            .map { it.body }
    }

    @Throws(WebClientResponseException::class)
    fun testQueryIntegerBooleanStringWithHttpInfo(integerQuery: kotlin.Int? = null, booleanQuery: kotlin.Boolean? = null, stringQuery: kotlin.String? = null): Mono<ResponseEntity<kotlin.String>> {
        val localVariableConfig = testQueryIntegerBooleanStringRequestConfig(integerQuery = integerQuery, booleanQuery = booleanQuery, stringQuery = stringQuery)
        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    fun testQueryIntegerBooleanStringRequestConfig(integerQuery: kotlin.Int? = null, booleanQuery: kotlin.Boolean? = null, stringQuery: kotlin.String? = null) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (integerQuery != null) {
                    put("integer_query", listOf(integerQuery.toString()))
                }
                if (booleanQuery != null) {
                    put("boolean_query", listOf(booleanQuery.toString()))
                }
                if (stringQuery != null) {
                    put("string_query", listOf(stringQuery.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/query/integer/boolean/string",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    @Throws(WebClientResponseException::class)
    fun testQueryStyleDeepObjectExplodeTrueObject(queryObject: Pet? = null): Mono<kotlin.String> {
        return testQueryStyleDeepObjectExplodeTrueObjectWithHttpInfo(queryObject = queryObject)
            .map { it.body }
    }

    @Throws(WebClientResponseException::class)
    fun testQueryStyleDeepObjectExplodeTrueObjectWithHttpInfo(queryObject: Pet? = null): Mono<ResponseEntity<kotlin.String>> {
        val localVariableConfig = testQueryStyleDeepObjectExplodeTrueObjectRequestConfig(queryObject = queryObject)
        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    fun testQueryStyleDeepObjectExplodeTrueObjectRequestConfig(queryObject: Pet? = null) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (queryObject != null) {
                    put("query_object", listOf(queryObject.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/query/style_deepObject/explode_true/object",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    @Throws(WebClientResponseException::class)
    fun testQueryStyleFormExplodeTrueArrayString(queryObject: TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter? = null): Mono<kotlin.String> {
        return testQueryStyleFormExplodeTrueArrayStringWithHttpInfo(queryObject = queryObject)
            .map { it.body }
    }

    @Throws(WebClientResponseException::class)
    fun testQueryStyleFormExplodeTrueArrayStringWithHttpInfo(queryObject: TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter? = null): Mono<ResponseEntity<kotlin.String>> {
        val localVariableConfig = testQueryStyleFormExplodeTrueArrayStringRequestConfig(queryObject = queryObject)
        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    fun testQueryStyleFormExplodeTrueArrayStringRequestConfig(queryObject: TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter? = null) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (queryObject != null) {
                    put("query_object", listOf(queryObject.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/query/style_form/explode_true/array_string",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    @Throws(WebClientResponseException::class)
    fun testQueryStyleFormExplodeTrueObject(queryObject: Pet? = null): Mono<kotlin.String> {
        return testQueryStyleFormExplodeTrueObjectWithHttpInfo(queryObject = queryObject)
            .map { it.body }
    }

    @Throws(WebClientResponseException::class)
    fun testQueryStyleFormExplodeTrueObjectWithHttpInfo(queryObject: Pet? = null): Mono<ResponseEntity<kotlin.String>> {
        val localVariableConfig = testQueryStyleFormExplodeTrueObjectRequestConfig(queryObject = queryObject)
        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    fun testQueryStyleFormExplodeTrueObjectRequestConfig(queryObject: Pet? = null) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (queryObject != null) {
                    put("query_object", listOf(queryObject.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/query/style_form/explode_true/object",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

}
