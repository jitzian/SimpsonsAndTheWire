package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.squareup.moshi.Json

class CharactersResult {

    @Json(name = "Results")
    @JvmSuppressWildcards var results: List<Any>? = null
    @Json(name = "Redirect")
    var redirect: String? = null
    @Json(name = "DefinitionSource")
    var definitionSource: String? = null
    @Json(name = "Abstract")
    var abstract: String? = null
    @Json(name = "RelatedTopics")
    var relatedTopics: List<RelatedTopic>? = null
    @Json(name = "ImageHeight")
    var imageHeight: Int? = null
    @Json(name = "meta")
    var meta: Meta? = null
    @Json(name = "AbstractText")
    var abstractText: String? = null
    @Json(name = "DefinitionURL")
    var definitionURL: String? = null
    @Json(name = "ImageIsLogo")
    var imageIsLogo: Int? = null
    @Json(name = "Entity")
    var entity: String? = null
    @Json(name = "ImageWidth")
    var imageWidth: Int? = null
    @Json(name = "Image")
    var image: String? = null
    @Json(name = "Answer")
    var answer: String? = null
    @Json(name = "Heading")
    var heading: String? = null
    @Json(name = "Definition")
    var definition: String? = null
    @Json(name = "AnswerType")
    var answerType: String? = null
    @Json(name = "AbstractSource")
    var abstractSource: String? = null
    @Json(name = "Type")
    var type: String? = null
    @Json(name = "AbstractURL")
    var abstractURL: String? = null
    @Json(name = "Infobox")
    var infobox: String? = null

}
