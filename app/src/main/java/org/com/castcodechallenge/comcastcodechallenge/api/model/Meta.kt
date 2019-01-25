package org.com.castcodechallenge.comcastcodechallenge.api.model

import com.squareup.moshi.Json

class Meta {

    @Json(name = "repo")
    var repo: String? = null
    @Json(name = "js_callback_name")
    var jsCallbackName: String? = null
    @Json(name = "developer")
    var developer: List<Developer>? = null
    @Json(name = "example_query")
    var exampleQuery: String? = null
    @Json(name = "id")
    var id: String? = null
    @Json(name = "blockgroup")
    @JvmSuppressWildcards var blockgroup: Any? = null
    @Json(name = "producer")
    @JvmSuppressWildcards var producer: Any? = null
    @Json(name = "created_date")
    @JvmSuppressWildcards var createdDate: Any? = null
    @Json(name = "attribution")
    @JvmSuppressWildcards var attribution: Any? = null
    @Json(name = "src_domain")
    var srcDomain: String? = null
    @Json(name = "production_state")
    var productionState: String? = null
    @Json(name = "name")
    var name: String? = null
    @Json(name = "perl_module")
    var perlModule: String? = null
    @Json(name = "src_id")
    var srcId: Int? = null
    @Json(name = "live_date")
    @JvmSuppressWildcards var liveDate: Any? = null
    @Json(name = "designer")
    @JvmSuppressWildcards var designer: Any? = null
    @Json(name = "maintainer")
    var maintainer: Maintainer? = null
    @Json(name = "status")
    var status: String? = null
    @Json(name = "is_stackexchange")
    @JvmSuppressWildcards var isStackexchange: Any? = null
    @Json(name = "src_name")
    var srcName: String? = null
    @Json(name = "dev_milestone")
    var devMilestone: String? = null
    @Json(name = "tab")
    var tab: String? = null
    @Json(name = "description")
    var description: String? = null
    @Json(name = "topic")
    var topic: List<String>? = null
    @Json(name = "signal_from")
    var signalFrom: String? = null
    @Json(name = "src_url")
    @JvmSuppressWildcards var srcUrl: Any? = null
    @Json(name = "dev_date")
    @JvmSuppressWildcards var devDate: Any? = null
    @Json(name = "src_options")
    var srcOptions: SrcOptions? = null
    @Json(name = "unsafe")
    var unsafe: Int? = null

}
