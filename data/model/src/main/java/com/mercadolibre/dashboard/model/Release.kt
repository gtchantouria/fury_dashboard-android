package com.mercadolibre.dashboard.model

import androidx.room.*

@Entity(tableName = "release")
data class Release (
	@PrimaryKey
	var _id : Int,
	var open : Boolean,
	var major : Int,
	var minor : Int,
	var endDevelopmentDate : String,
	var flavorId : Int,
	var releaseManagerId : Int,
	var versionPatches : List<VersionPatches>,
	var releaseManager : ReleaseManager,
	var flavor : Flavor
)