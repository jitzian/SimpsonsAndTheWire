package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SrcOptions {

    @SerializedName("skip_qr")
    @Expose
    var skipQr: String? = null
    @SerializedName("is_mediawiki")
    @Expose
    var isMediawiki: Int = 0
    @SerializedName("directory")
    @Expose
    var directory: String? = null
    @SerializedName("is_fanon")
    @Expose
    var isFanon: Int = 0
    @SerializedName("skip_abstract_paren")
    @Expose
    var skipAbstractParen: Int = 0
    @SerializedName("skip_icon")
    @Expose
    var skipIcon: Int = 0
    @SerializedName("source_skip")
    @Expose
    var sourceSkip: String? = null
    @SerializedName("skip_abstract")
    @Expose
    var skipAbstract: Int = 0
    @SerializedName("skip_image_name")
    @Expose
    var skipImageName: Int = 0
    @SerializedName("language")
    @Expose
    var language: String? = null
    @SerializedName("is_wikipedia")
    @Expose
    var isWikipedia: Int = 0
    @SerializedName("min_abstract_length")
    @Expose
    var minAbstractLength: String? = null
    @SerializedName("skip_end")
    @Expose
    var skipEnd: String? = null
    @SerializedName("src_info")
    @Expose
    var srcInfo: String? = null

}
