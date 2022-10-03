package com.example.pagin3demo.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pagin3demo.ui.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage (
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    @Contextual
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
)