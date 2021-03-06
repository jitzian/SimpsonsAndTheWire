package org.com.castcodechallenge.comcastcodechallenge.constants

class GlobalConstants {
    companion object {
        const val baseUrl = "https://api.duckduckgo.com"
        //http://api.duckduckgo.com/?q=simpsons+characters&format=json
        //http://api.duckduckgo.com/?q=the+wire+characters&format=json
        const val format = "json"

        //Constants for saving RoomDB
        const val dataBaseName = "comcast.db"
        const val dataBaseVersion = 1

        //Null or Empty url
        const val fallbackURL = "https://techpinite.com/themes/default/images/web/notfoundimg.png"
        const val noTitleFallback = "No title"
    }
}