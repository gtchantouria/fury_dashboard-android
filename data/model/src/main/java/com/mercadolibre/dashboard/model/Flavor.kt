package com.mercadolibre.dashboard.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flavor")
data class Flavor (
	@PrimaryKey
	@ColumnInfo(name = "id")
	val _id : Int,
	val display : String,
	val name : String,
	val repo : String,
	val owner : String,
	val packageName : String,
	val appId : Int,
	val projectId : String,
	val crashRateThreshold : Double,
	val canejoUrl : String
)