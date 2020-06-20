package com.mercadolibre.dashboard.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mercadolibre.dashboard.model.Flavor
import com.mercadolibre.dashboard.model.ReleaseManager
import com.mercadolibre.dashboard.model.VersionPatches

class Converter {

    @TypeConverter
    fun versionPatchesFromJson(value: String): List<VersionPatches> {
        val type = object : TypeToken<List<VersionPatches>>() {}.type
        return Gson().fromJson<List<VersionPatches>>(value, type)
    }

    @TypeConverter
    fun versionPatchesToJson(value: List<VersionPatches>): String {
        return Gson().toJson(value)
    }

    @TypeConverter
    fun releaseManagerFromJson(value: String): ReleaseManager {
        val type = object : TypeToken<ReleaseManager>() {}.type
        return Gson().fromJson<ReleaseManager>(value, type)
    }

    @TypeConverter
    fun releaseManagerToJson(value: ReleaseManager): String {
        return Gson().toJson(value)
    }

    @TypeConverter
    fun flavorFromJson(value: String): Flavor {
        val type = object : TypeToken<Flavor>() {}.type
        return Gson().fromJson<Flavor>(value, type)
    }

    @TypeConverter
    fun flavorToJson(value: Flavor): String {
        return Gson().toJson(value)
    }
}