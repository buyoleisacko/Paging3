package com.example.pagin3demo.model

import androidx.room.Embedded
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class User(
    @SerialName("links")
    @Embedded
    val userLinks: UserLinks,
    val userName: String,


) {
     val username: String = ""
}