package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao {
    @Query("select * from schedule order by arrival_time")
    fun getAll(): Flow<List<Schedule>>

    @Query("select * from schedule where stop_name = :stopName order by arrival_time")
    fun getByStopName(stopName: String) : Flow<List<Schedule>>
}