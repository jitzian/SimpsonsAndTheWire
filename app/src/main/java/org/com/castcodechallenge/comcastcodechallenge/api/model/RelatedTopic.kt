package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RelatedTopic {

    @SerializedName("FirstURL")
    @Expose
    var firstURL: String? = null
    @SerializedName("Icon")
    @Expose
    var icon: Icon? = null
    @SerializedName("Result")
    @Expose
    var result: String? = null
    @SerializedName("Text")
    @Expose
    var text: String? = null

}
