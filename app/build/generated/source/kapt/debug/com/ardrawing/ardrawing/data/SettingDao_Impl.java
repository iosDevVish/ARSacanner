package com.ardrawing.ardrawing.data;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import java.lang.Class;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class SettingDao_Impl implements SettingDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<SettingEntity> __insertAdapterOfSettingEntity;

  private final EntityDeleteOrUpdateAdapter<SettingEntity> __deleteAdapterOfSettingEntity;

  public SettingDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfSettingEntity = new EntityInsertAdapter<SettingEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `settings` (`key`,`value`) VALUES (?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final SettingEntity entity) {
        if (entity.getKey() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getKey());
        }
        if (entity.getValue() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getValue());
        }
      }
    };
    this.__deleteAdapterOfSettingEntity = new EntityDeleteOrUpdateAdapter<SettingEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `settings` WHERE `key` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final SettingEntity entity) {
        if (entity.getKey() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getKey());
        }
      }
    };
  }

  @Override
  public Object insert(final SettingEntity setting, final Continuation<? super Unit> $completion) {
    if (setting == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfSettingEntity.insert(_connection, setting);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object delete(final SettingEntity setting, final Continuation<? super Unit> $completion) {
    if (setting == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __deleteAdapterOfSettingEntity.handle(_connection, setting);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object getValue(final String key, final Continuation<? super String> $completion) {
    final String _sql = "SELECT value FROM settings WHERE key = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (key == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, key);
        }
        final String _result;
        if (_stmt.step()) {
          if (_stmt.isNull(0)) {
            _result = null;
          } else {
            _result = _stmt.getText(0);
          }
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Flow<List<SettingEntity>> getAllSettings() {
    final String _sql = "SELECT * FROM settings";
    return FlowUtil.createFlow(__db, false, new String[] {"settings"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfKey = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "key");
        final int _columnIndexOfValue = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "value");
        final List<SettingEntity> _result = new ArrayList<SettingEntity>();
        while (_stmt.step()) {
          final SettingEntity _item;
          final String _tmpKey;
          if (_stmt.isNull(_columnIndexOfKey)) {
            _tmpKey = null;
          } else {
            _tmpKey = _stmt.getText(_columnIndexOfKey);
          }
          final String _tmpValue;
          if (_stmt.isNull(_columnIndexOfValue)) {
            _tmpValue = null;
          } else {
            _tmpValue = _stmt.getText(_columnIndexOfValue);
          }
          _item = new SettingEntity(_tmpKey,_tmpValue);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
