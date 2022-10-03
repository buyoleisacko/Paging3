package com.example.pagin3demo.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("links")
    val userLinks: UserLinks,
    val userName: String


)