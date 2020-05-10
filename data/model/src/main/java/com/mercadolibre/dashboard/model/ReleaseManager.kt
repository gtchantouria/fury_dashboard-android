package com.mercadolibre.dashboard.model

import androidx.room.*

@Entity(tableName = "release_manager")
data class ReleaseManager (
	@PrimaryKey
	val _id : Int,
	@Ignore
	val profile : Profile,
	@Ignore
	val token : Token,
	val name : String,
	val email : String,
	val github : String
)