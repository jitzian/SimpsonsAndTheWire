package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.squareup.moshi.Json

class Icon {

    @Json(name = "Width")
    var width: String? = null
    @Json(name = "Height")
    var height: String? = null
    @Json(name = "URL")
    var url: String? = null

}
