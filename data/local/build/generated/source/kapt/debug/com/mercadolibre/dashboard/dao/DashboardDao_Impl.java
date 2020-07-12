package com.mercadolibre.dashboard.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mercadolibre.dashboard.converter.Converter;
import com.mercadolibre.dashboard.model.Flavor;
import com.mercadolibre.dashboard.model.Metric;
import com.mercadolibre.dashboard.model.Release;
import com.mercadolibre.dashboard.model.ReleaseManager;
import com.mercadolibre.dashboard.model.VersionPatches;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DashboardDao_Impl extends DashboardDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Release> __insertionAdapterOfRelease;

  private final Converter __converter = new Converter();

  private final EntityInsertionAdapter<Metric> __insertionAdapterOfMetric;

  public DashboardDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRelease = new EntityInsertionAdapter<Release>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `release` (`_id`,`open`,`major`,`minor`,`endDevelopmentDate`,`flavorId`,`releaseManagerId`,`versionPatches`,`releaseManager`,`flavor`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Release value) {
        stmt.bindLong(1, value.get_id());
        final int _tmp;
        _tmp = value.getOpen() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        stmt.bindLong(3, value.getMajor());
        stmt.bindLong(4, value.getMinor());
        if (value.getEndDevelopmentDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEndDevelopmentDate());
        }
        stmt.bindLong(6, value.getFlavorId());
        stmt.bindLong(7, value.getReleaseManagerId());
        final String _tmp_1;
        _tmp_1 = __converter.versionPatchesToJson(value.getVersionPatches());
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __converter.releaseManagerToJson(value.getReleaseManager());
        if (_tmp_2 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __converter.flavorToJson(value.getFlavor());
        if (_tmp_3 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_3);
        }
      }
    };
    this.__insertionAdapterOfMetric = new EntityInsertionAdapter<Metric>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `metric` (`_id`,`flavorId`,`display`,`major`,`minor`,`number`,`crashRateThreshold`,`canejoUrl`,`status`,`errorsIntroducedCount`,`errorsSeenCount`,`sessionsCountInLast24H`,`releaseSessionsCount`,`totalSessionsCount`,`unhandledSessionsCount`,`sessionsCount`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Metric value) {
        stmt.bindLong(1, value.get_id());
        stmt.bindLong(2, value.getFlavorId());
        if (value.getDisplay() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDisplay());
        }
        stmt.bindLong(4, value.getMajor());
        stmt.bindLong(5, value.getMinor());
        stmt.bindLong(6, value.getNumber());
        stmt.bindDouble(7, value.getCrashRateThreshold());
        if (value.getCanejoUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCanejoUrl());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStatus());
        }
        stmt.bindLong(10, value.getErrorsIntroducedCount());
        stmt.bindLong(11, value.getErrorsSeenCount());
        stmt.bindLong(12, value.getSessionsCountInLast24H());
        stmt.bindLong(13, value.getReleaseSessionsCount());
        stmt.bindLong(14, value.getTotalSessionsCount());
        stmt.bindLong(15, value.getUnhandledSessionsCount());
        stmt.bindLong(16, value.getSessionsCount());
      }
    };
  }

  @Override
  protected Object insert(final List<? extends Release> releases,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRelease.insert(releases);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  protected Object insert(final Release release, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRelease.insert(release);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object saveMetric(final Metric metric, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMetric.insert(metric);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getAll(final Continuation<? super List<Release>> p0) {
    final String _sql = "SELECT * FROM 'release' ORDER BY _id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Release>>() {
      @Override
      public List<Release> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfOpen = CursorUtil.getColumnIndexOrThrow(_cursor, "open");
          final int _cursorIndexOfMajor = CursorUtil.getColumnIndexOrThrow(_cursor, "major");
          final int _cursorIndexOfMinor = CursorUtil.getColumnIndexOrThrow(_cursor, "minor");
          final int _cursorIndexOfEndDevelopmentDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDevelopmentDate");
          final int _cursorIndexOfFlavorId = CursorUtil.getColumnIndexOrThrow(_cursor, "flavorId");
          final int _cursorIndexOfReleaseManagerId = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseManagerId");
          final int _cursorIndexOfVersionPatches = CursorUtil.getColumnIndexOrThrow(_cursor, "versionPatches");
          final int _cursorIndexOfReleaseManager = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseManager");
          final int _cursorIndexOfFlavor = CursorUtil.getColumnIndexOrThrow(_cursor, "flavor");
          final List<Release> _result = new ArrayList<Release>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Release _item;
            final int _tmp_id;
            _tmp_id = _cursor.getInt(_cursorIndexOfId);
            final boolean _tmpOpen;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfOpen);
            _tmpOpen = _tmp != 0;
            final int _tmpMajor;
            _tmpMajor = _cursor.getInt(_cursorIndexOfMajor);
            final int _tmpMinor;
            _tmpMinor = _cursor.getInt(_cursorIndexOfMinor);
            final String _tmpEndDevelopmentDate;
            _tmpEndDevelopmentDate = _cursor.getString(_cursorIndexOfEndDevelopmentDate);
            final int _tmpFlavorId;
            _tmpFlavorId = _cursor.getInt(_cursorIndexOfFlavorId);
            final int _tmpReleaseManagerId;
            _tmpReleaseManagerId = _cursor.getInt(_cursorIndexOfReleaseManagerId);
            final List<VersionPatches> _tmpVersionPatches;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfVersionPatches);
            _tmpVersionPatches = __converter.versionPatchesFromJson(_tmp_1);
            final ReleaseManager _tmpReleaseManager;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfReleaseManager);
            _tmpReleaseManager = __converter.releaseManagerFromJson(_tmp_2);
            final Flavor _tmpFlavor;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfFlavor);
            _tmpFlavor = __converter.flavorFromJson(_tmp_3);
            _item = new Release(_tmp_id,_tmpOpen,_tmpMajor,_tmpMinor,_tmpEndDevelopmentDate,_tmpFlavorId,_tmpReleaseManagerId,_tmpVersionPatches,_tmpReleaseManager,_tmpFlavor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getReleaseDetail(final int id, final Continuation<? super Release> p1) {
    final String _sql = "SELECT * FROM 'release' WHERE _id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.execute(__db, false, new Callable<Release>() {
      @Override
      public Release call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfOpen = CursorUtil.getColumnIndexOrThrow(_cursor, "open");
          final int _cursorIndexOfMajor = CursorUtil.getColumnIndexOrThrow(_cursor, "major");
          final int _cursorIndexOfMinor = CursorUtil.getColumnIndexOrThrow(_cursor, "minor");
          final int _cursorIndexOfEndDevelopmentDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDevelopmentDate");
          final int _cursorIndexOfFlavorId = CursorUtil.getColumnIndexOrThrow(_cursor, "flavorId");
          final int _cursorIndexOfReleaseManagerId = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseManagerId");
          final int _cursorIndexOfVersionPatches = CursorUtil.getColumnIndexOrThrow(_cursor, "versionPatches");
          final int _cursorIndexOfReleaseManager = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseManager");
          final int _cursorIndexOfFlavor = CursorUtil.getColumnIndexOrThrow(_cursor, "flavor");
          final Release _result;
          if(_cursor.moveToFirst()) {
            final int _tmp_id;
            _tmp_id = _cursor.getInt(_cursorIndexOfId);
            final boolean _tmpOpen;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfOpen);
            _tmpOpen = _tmp != 0;
            final int _tmpMajor;
            _tmpMajor = _cursor.getInt(_cursorIndexOfMajor);
            final int _tmpMinor;
            _tmpMinor = _cursor.getInt(_cursorIndexOfMinor);
            final String _tmpEndDevelopmentDate;
            _tmpEndDevelopmentDate = _cursor.getString(_cursorIndexOfEndDevelopmentDate);
            final int _tmpFlavorId;
            _tmpFlavorId = _cursor.getInt(_cursorIndexOfFlavorId);
            final int _tmpReleaseManagerId;
            _tmpReleaseManagerId = _cursor.getInt(_cursorIndexOfReleaseManagerId);
            final List<VersionPatches> _tmpVersionPatches;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfVersionPatches);
            _tmpVersionPatches = __converter.versionPatchesFromJson(_tmp_1);
            final ReleaseManager _tmpReleaseManager;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfReleaseManager);
            _tmpReleaseManager = __converter.releaseManagerFromJson(_tmp_2);
            final Flavor _tmpFlavor;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfFlavor);
            _tmpFlavor = __converter.flavorFromJson(_tmp_3);
            _result = new Release(_tmp_id,_tmpOpen,_tmpMajor,_tmpMinor,_tmpEndDevelopmentDate,_tmpFlavorId,_tmpReleaseManagerId,_tmpVersionPatches,_tmpReleaseManager,_tmpFlavor);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getReleaseMetrics(final int id, final Continuation<? super Metric> p1) {
    final String _sql = "SELECT * FROM 'metric' WHERE _id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.execute(__db, false, new Callable<Metric>() {
      @Override
      public Metric call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfFlavorId = CursorUtil.getColumnIndexOrThrow(_cursor, "flavorId");
          final int _cursorIndexOfDisplay = CursorUtil.getColumnIndexOrThrow(_cursor, "display");
          final int _cursorIndexOfMajor = CursorUtil.getColumnIndexOrThrow(_cursor, "major");
          final int _cursorIndexOfMinor = CursorUtil.getColumnIndexOrThrow(_cursor, "minor");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfCrashRateThreshold = CursorUtil.getColumnIndexOrThrow(_cursor, "crashRateThreshold");
          final int _cursorIndexOfCanejoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "canejoUrl");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfErrorsIntroducedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "errorsIntroducedCount");
          final int _cursorIndexOfErrorsSeenCount = CursorUtil.getColumnIndexOrThrow(_cursor, "errorsSeenCount");
          final int _cursorIndexOfSessionsCountInLast24H = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionsCountInLast24H");
          final int _cursorIndexOfReleaseSessionsCount = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseSessionsCount");
          final int _cursorIndexOfTotalSessionsCount = CursorUtil.getColumnIndexOrThrow(_cursor, "totalSessionsCount");
          final int _cursorIndexOfUnhandledSessionsCount = CursorUtil.getColumnIndexOrThrow(_cursor, "unhandledSessionsCount");
          final int _cursorIndexOfSessionsCount = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionsCount");
          final Metric _result;
          if(_cursor.moveToFirst()) {
            final int _tmp_id;
            _tmp_id = _cursor.getInt(_cursorIndexOfId);
            final int _tmpFlavorId;
            _tmpFlavorId = _cursor.getInt(_cursorIndexOfFlavorId);
            final String _tmpDisplay;
            _tmpDisplay = _cursor.getString(_cursorIndexOfDisplay);
            final int _tmpMajor;
            _tmpMajor = _cursor.getInt(_cursorIndexOfMajor);
            final int _tmpMinor;
            _tmpMinor = _cursor.getInt(_cursorIndexOfMinor);
            final int _tmpNumber;
            _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
            final double _tmpCrashRateThreshold;
            _tmpCrashRateThreshold = _cursor.getDouble(_cursorIndexOfCrashRateThreshold);
            final String _tmpCanejoUrl;
            _tmpCanejoUrl = _cursor.getString(_cursorIndexOfCanejoUrl);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final int _tmpErrorsIntroducedCount;
            _tmpErrorsIntroducedCount = _cursor.getInt(_cursorIndexOfErrorsIntroducedCount);
            final int _tmpErrorsSeenCount;
            _tmpErrorsSeenCount = _cursor.getInt(_cursorIndexOfErrorsSeenCount);
            final int _tmpSessionsCountInLast24H;
            _tmpSessionsCountInLast24H = _cursor.getInt(_cursorIndexOfSessionsCountInLast24H);
            final int _tmpReleaseSessionsCount;
            _tmpReleaseSessionsCount = _cursor.getInt(_cursorIndexOfReleaseSessionsCount);
            final int _tmpTotalSessionsCount;
            _tmpTotalSessionsCount = _cursor.getInt(_cursorIndexOfTotalSessionsCount);
            final int _tmpUnhandledSessionsCount;
            _tmpUnhandledSessionsCount = _cursor.getInt(_cursorIndexOfUnhandledSessionsCount);
            final int _tmpSessionsCount;
            _tmpSessionsCount = _cursor.getInt(_cursorIndexOfSessionsCount);
            _result = new Metric(_tmp_id,_tmpFlavorId,_tmpDisplay,_tmpMajor,_tmpMinor,_tmpNumber,_tmpCrashRateThreshold,_tmpCanejoUrl,_tmpStatus,_tmpErrorsIntroducedCount,_tmpErrorsSeenCount,_tmpSessionsCountInLast24H,_tmpReleaseSessionsCount,_tmpTotalSessionsCount,_tmpUnhandledSessionsCount,_tmpSessionsCount);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
