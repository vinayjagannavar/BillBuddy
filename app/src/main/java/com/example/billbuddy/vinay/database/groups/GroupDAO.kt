package com.example.billbuddy.vinay.database.groups

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface GroupDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addGroup(groupEntity: GroupEntity)

    @Query("select * from group_table")
    fun getGroupList(): LiveData<List<GroupEntity>>

    @Update
    suspend fun updateGroup(groupEntity: GroupEntity)

    @Delete
    fun deleteGroup(groupEntity: GroupEntity)


}