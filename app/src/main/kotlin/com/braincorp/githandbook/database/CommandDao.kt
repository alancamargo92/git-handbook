package com.braincorp.githandbook.database

import androidx.room.Dao
import androidx.room.Query
import com.braincorp.githandbook.model.Command

@Dao
interface CommandDao {

    @Query("SELECT * FROM Command ORDER BY name")
    fun select(): List<Command>

    @Query("SELECT * FROM Command WHERE name = :commandName")
    fun select(commandName: String): List<Command>

}