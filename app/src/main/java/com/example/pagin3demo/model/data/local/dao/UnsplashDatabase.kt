package com.example.pagin3demo.model.data.local.dao

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pagin3demo.model.UnsplashImage
import com.example.pagin3demo.model.UnsplashedRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashedRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}