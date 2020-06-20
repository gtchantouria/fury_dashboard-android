package com.mercadolibre.dashboard.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mercadolibre.dashboard.converter.Converter
import com.mercadolibre.dashboard.dao.DashboardDao
import com.mercadolibre.dashboard.model.*

@Database(
    entities = [
        Release::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class DashboardDatabase : RoomDatabase() {
    abstract fun releaseDao(): DashboardDao

    companion object {
        // Singleton prevents multiple instances of database opening at the same time.
        @Volatile
        private var INSTANCE: DashboardDatabase? = null
        private val DATABASE_NAME: String = "releases_database"

        fun getDatabase(context: Context): DashboardDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DashboardDatabase::class.java,
                    DATABASE_NAME
                ).build()

                INSTANCE = instance

                return instance
            }
        }
    }
}