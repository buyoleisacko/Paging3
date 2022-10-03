package com.example.pagin3demo.model.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pagin3demo.model.UnsplashedRemoteKeys

@Dao
interface UnsplashRemoteKeysDao {
    @Query("SELECT * FROM unsplash_remote_keys_table WHERE id =:id")
    suspend fun getRemoteKeys(id: String): UnsplashedRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashedRemoteKeys>)

    @Query("DELETE FROM unsplash_remote_keys_table")
    suspend fun deleteAllRemoteKeys()
}