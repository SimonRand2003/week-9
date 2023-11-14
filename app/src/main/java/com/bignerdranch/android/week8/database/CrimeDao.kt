package com.bignerdranch.android.week8.database

import androidx.room.Dao
import androidx.room.Query
import com.bignerdranch.android.week8.Crime
import java.util.UUID

@Dao
interface CrimeDao{
    @Query("Select * from crime")
    suspend fun getCrimes(): List<Crime>

    @Query("select * from crime where id=(:id)")
    suspend fun getCrime(id: UUID): Crime
}