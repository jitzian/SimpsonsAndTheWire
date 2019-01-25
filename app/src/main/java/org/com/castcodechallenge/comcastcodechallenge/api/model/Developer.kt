package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.squareup.moshi.Json

class Developer {

    @Json(name = "type")
    var type: String? = null
    @Json(name = "name")
    var name: String? = null
    @Json(name = "url")
    var url: String? = null

}
