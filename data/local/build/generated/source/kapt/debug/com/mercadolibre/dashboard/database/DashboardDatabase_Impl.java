package com.mercadolibre.dashboard.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.mercadolibre.dashboard.dao.DashboardDao;
import com.mercadolibre.dashboard.dao.DashboardDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DashboardDatabase_Impl extends DashboardDatabase {
  private volatile DashboardDao _dashboardDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `release` (`_id` INTEGER NOT NULL, `open` INTEGER NOT NULL, `major` INTEGER NOT NULL, `minor` INTEGER NOT NULL, `endDevelopmentDate` TEXT NOT NULL, `flavorId` INTEGER NOT NULL, `releaseManagerId` INTEGER NOT NULL, `versionPatches` TEXT NOT NULL, `releaseManager` TEXT NOT NULL, `flavor` TEXT NOT NULL, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `metric` (`_id` INTEGER NOT NULL, `flavorId` INTEGER NOT NULL, `display` TEXT NOT NULL, `major` INTEGER NOT NULL, `minor` INTEGER NOT NULL, `number` INTEGER NOT NULL, `crashRateThreshold` REAL NOT NULL, `canejoUrl` TEXT NOT NULL, `status` TEXT NOT NULL, `errorsIntroducedCount` INTEGER NOT NULL, `errorsSeenCount` INTEGER NOT NULL, `sessionsCountInLast24H` INTEGER NOT NULL, `releaseSessionsCount` INTEGER NOT NULL, `totalSessionsCount` INTEGER NOT NULL, `unhandledSessionsCount` INTEGER NOT NULL, `sessionsCount` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '13231cc104a5f46640818042d4219129')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `release`");
        _db.execSQL("DROP TABLE IF EXISTS `metric`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRelease = new HashMap<String, TableInfo.Column>(10);
        _columnsRelease.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("open", new TableInfo.Column("open", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("major", new TableInfo.Column("major", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("minor", new TableInfo.Column("minor", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("endDevelopmentDate", new TableInfo.Column("endDevelopmentDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("flavorId", new TableInfo.Column("flavorId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("releaseManagerId", new TableInfo.Column("releaseManagerId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("versionPatches", new TableInfo.Column("versionPatches", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("releaseManager", new TableInfo.Column("releaseManager", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRelease.put("flavor", new TableInfo.Column("flavor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRelease = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRelease = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRelease = new TableInfo("release", _columnsRelease, _foreignKeysRelease, _indicesRelease);
        final TableInfo _existingRelease = TableInfo.read(_db, "release");
        if (! _infoRelease.equals(_existingRelease)) {
          return new RoomOpenHelper.ValidationResult(false, "release(com.mercadolibre.dashboard.model.Release).\n"
                  + " Expected:\n" + _infoRelease + "\n"
                  + " Found:\n" + _existingRelease);
        }
        final HashMap<String, TableInfo.Column> _columnsMetric = new HashMap<String, TableInfo.Column>(16);
        _columnsMetric.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("flavorId", new TableInfo.Column("flavorId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("display", new TableInfo.Column("display", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("major", new TableInfo.Column("major", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("minor", new TableInfo.Column("minor", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("number", new TableInfo.Column("number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("crashRateThreshold", new TableInfo.Column("crashRateThreshold", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("canejoUrl", new TableInfo.Column("canejoUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("errorsIntroducedCount", new TableInfo.Column("errorsIntroducedCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("errorsSeenCount", new TableInfo.Column("errorsSeenCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("sessionsCountInLast24H", new TableInfo.Column("sessionsCountInLast24H", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("releaseSessionsCount", new TableInfo.Column("releaseSessionsCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("totalSessionsCount", new TableInfo.Column("totalSessionsCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("unhandledSessionsCount", new TableInfo.Column("unhandledSessionsCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMetric.put("sessionsCount", new TableInfo.Column("sessionsCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMetric = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMetric = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMetric = new TableInfo("metric", _columnsMetric, _foreignKeysMetric, _indicesMetric);
        final TableInfo _existingMetric = TableInfo.read(_db, "metric");
        if (! _infoMetric.equals(_existingMetric)) {
          return new RoomOpenHelper.ValidationResult(false, "metric(com.mercadolibre.dashboard.model.Metric).\n"
                  + " Expected:\n" + _infoMetric + "\n"
                  + " Found:\n" + _existingMetric);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "13231cc104a5f46640818042d4219129", "452c71916015ea6e489c983c78e47ff4");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "release","metric");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `release`");
      _db.execSQL("DELETE FROM `metric`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public DashboardDao releaseDao() {
    if (_dashboardDao != null) {
      return _dashboardDao;
    } else {
      synchronized(this) {
        if(_dashboardDao == null) {
          _dashboardDao = new DashboardDao_Impl(this);
        }
        return _dashboardDao;
      }
    }
  }
}
