package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.squareup.moshi.Json

class RelatedTopic {

    @Json(name = "Result")
    var result: String? = null
    @Json(name = "Icon")
    var icon: Icon? = null
    @Json(name = "Text")
    var text: String? = null
    @Json(name = "FirstURL")
    var firstURL: String? = null

}
