package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Maintainer {

    @SerializedName("github")
    @Expose
    var github: String? = null

}
