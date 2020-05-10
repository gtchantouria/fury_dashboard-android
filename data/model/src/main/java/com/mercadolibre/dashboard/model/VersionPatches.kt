package com.mercadolibre.dashboard.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "version_patches")
data class VersionPatches (
	@PrimaryKey
	val _id : Int,
	val versionCodes : String?,
	val number : Int,
	val milestone : Int,
	val status : String,
	val rolloutPercentage : String?,
	val releaseId : Int
)