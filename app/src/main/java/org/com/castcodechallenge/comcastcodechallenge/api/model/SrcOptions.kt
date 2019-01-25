package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.squareup.moshi.Json

class SrcOptions {

    @Json(name = "language")
    var language: String? = null
    @Json(name = "source_skip")
    var sourceSkip: String? = null
    @Json(name = "skip_icon")
    var skipIcon: Int? = null
    @Json(name = "min_abstract_length")
    var minAbstractLength: String? = null
    @Json(name = "skip_abstract_paren")
    var skipAbstractParen: Int? = null
    @Json(name = "skip_image_name")
    var skipImageName: Int? = null
    @Json(name = "src_info")
    var srcInfo: String? = null
    @Json(name = "is_wikipedia")
    var isWikipedia: Int? = null
    @Json(name = "directory")
    var directory: String? = null
    @Json(name = "skip_abstract")
    var skipAbstract: Int? = null
    @Json(name = "is_fanon")
    var isFanon: Int? = null
    @Json(name = "skip_qr")
    var skipQr: String? = null
    @Json(name = "skip_end")
    var skipEnd: String? = null
    @Json(name = "is_mediawiki")
    var isMediawiki: Int? = null

}
