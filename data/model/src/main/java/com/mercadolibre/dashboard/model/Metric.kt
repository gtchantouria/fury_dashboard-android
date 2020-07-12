package com.mercadolibre.dashboard.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "metric")
data class Metric (
    @PrimaryKey
    @SerializedName("releases.versionPatches._id")
    val _id : Int,
    val flavorId : Int,
    val display : String,
    val major : Int,
    val minor : Int,
    val number : Int,
    val crashRateThreshold : Double,
    val canejoUrl : String,
    val status : String,
    val errorsIntroducedCount : Int,
    val errorsSeenCount : Int,
    val sessionsCountInLast24H : Int,
    val releaseSessionsCount : Int,
    val totalSessionsCount : Int,
    val unhandledSessionsCount : Int,
    val sessionsCount : Int
)