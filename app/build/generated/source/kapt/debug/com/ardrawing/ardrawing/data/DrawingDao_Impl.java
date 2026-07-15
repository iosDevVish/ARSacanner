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
import java.lang.Long;
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
public final class DrawingDao_Impl implements DrawingDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<DrawingEntity> __insertAdapterOfDrawingEntity;

  private final EntityDeleteOrUpdateAdapter<DrawingEntity> __deleteAdapterOfDrawingEntity;

  private final EntityDeleteOrUpdateAdapter<DrawingEntity> __updateAdapterOfDrawingEntity;

  public DrawingDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfDrawingEntity = new EntityInsertAdapter<DrawingEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `drawings` (`id`,`name`,`timestamp`,`imagePath`,`thumbnailPath`,`strokeData`,`lessonId`,`isCompleted`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final DrawingEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getName());
        }
        statement.bindLong(3, entity.getTimestamp());
        if (entity.getImagePath() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getImagePath());
        }
        if (entity.getThumbnailPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getThumbnailPath());
        }
        if (entity.getStrokeData() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getStrokeData());
        }
        if (entity.getLessonId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindText(7, entity.getLessonId());
        }
        final int _tmp = entity.isCompleted() ? 1 : 0;
        statement.bindLong(8, _tmp);
      }
    };
    this.__deleteAdapterOfDrawingEntity = new EntityDeleteOrUpdateAdapter<DrawingEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `drawings` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final DrawingEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfDrawingEntity = new EntityDeleteOrUpdateAdapter<DrawingEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `drawings` SET `id` = ?,`name` = ?,`timestamp` = ?,`imagePath` = ?,`thumbnailPath` = ?,`strokeData` = ?,`lessonId` = ?,`isCompleted` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final DrawingEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getName());
        }
        statement.bindLong(3, entity.getTimestamp());
        if (entity.getImagePath() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getImagePath());
        }
        if (entity.getThumbnailPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getThumbnailPath());
        }
        if (entity.getStrokeData() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getStrokeData());
        }
        if (entity.getLessonId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindText(7, entity.getLessonId());
        }
        final int _tmp = entity.isCompleted() ? 1 : 0;
        statement.bindLong(8, _tmp);
        statement.bindLong(9, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final DrawingEntity drawing, final Continuation<? super Long> $completion) {
    if (drawing == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      return __insertAdapterOfDrawingEntity.insertAndReturnId(_connection, drawing);
    }, $completion);
  }

  @Override
  public Object delete(final DrawingEntity drawing, final Continuation<? super Unit> $completion) {
    if (drawing == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __deleteAdapterOfDrawingEntity.handle(_connection, drawing);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object update(final DrawingEntity drawing, final Continuation<? super Unit> $completion) {
    if (drawing == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfDrawingEntity.handle(_connection, drawing);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Flow<List<DrawingEntity>> getAllDrawings() {
    final String _sql = "SELECT * FROM drawings ORDER BY timestamp DESC";
    return FlowUtil.createFlow(__db, false, new String[] {"drawings"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
        final int _columnIndexOfImagePath = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "imagePath");
        final int _columnIndexOfThumbnailPath = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "thumbnailPath");
        final int _columnIndexOfStrokeData = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "strokeData");
        final int _columnIndexOfLessonId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lessonId");
        final int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
        final List<DrawingEntity> _result = new ArrayList<DrawingEntity>();
        while (_stmt.step()) {
          final DrawingEntity _item;
          final long _tmpId;
          _tmpId = _stmt.getLong(_columnIndexOfId);
          final String _tmpName;
          if (_stmt.isNull(_columnIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_columnIndexOfName);
          }
          final long _tmpTimestamp;
          _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
          final String _tmpImagePath;
          if (_stmt.isNull(_columnIndexOfImagePath)) {
            _tmpImagePath = null;
          } else {
            _tmpImagePath = _stmt.getText(_columnIndexOfImagePath);
          }
          final String _tmpThumbnailPath;
          if (_stmt.isNull(_columnIndexOfThumbnailPath)) {
            _tmpThumbnailPath = null;
          } else {
            _tmpThumbnailPath = _stmt.getText(_columnIndexOfThumbnailPath);
          }
          final String _tmpStrokeData;
          if (_stmt.isNull(_columnIndexOfStrokeData)) {
            _tmpStrokeData = null;
          } else {
            _tmpStrokeData = _stmt.getText(_columnIndexOfStrokeData);
          }
          final String _tmpLessonId;
          if (_stmt.isNull(_columnIndexOfLessonId)) {
            _tmpLessonId = null;
          } else {
            _tmpLessonId = _stmt.getText(_columnIndexOfLessonId);
          }
          final boolean _tmpIsCompleted;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_columnIndexOfIsCompleted));
          _tmpIsCompleted = _tmp != 0;
          _item = new DrawingEntity(_tmpId,_tmpName,_tmpTimestamp,_tmpImagePath,_tmpThumbnailPath,_tmpStrokeData,_tmpLessonId,_tmpIsCompleted);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Flow<List<DrawingEntity>> getDrawingsByLesson(final String lessonId) {
    final String _sql = "SELECT * FROM drawings WHERE lessonId = ? ORDER BY timestamp DESC";
    return FlowUtil.createFlow(__db, false, new String[] {"drawings"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (lessonId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, lessonId);
        }
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
        final int _columnIndexOfImagePath = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "imagePath");
        final int _columnIndexOfThumbnailPath = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "thumbnailPath");
        final int _columnIndexOfStrokeData = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "strokeData");
        final int _columnIndexOfLessonId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lessonId");
        final int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
        final List<DrawingEntity> _result = new ArrayList<DrawingEntity>();
        while (_stmt.step()) {
          final DrawingEntity _item;
          final long _tmpId;
          _tmpId = _stmt.getLong(_columnIndexOfId);
          final String _tmpName;
          if (_stmt.isNull(_columnIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_columnIndexOfName);
          }
          final long _tmpTimestamp;
          _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
          final String _tmpImagePath;
          if (_stmt.isNull(_columnIndexOfImagePath)) {
            _tmpImagePath = null;
          } else {
            _tmpImagePath = _stmt.getText(_columnIndexOfImagePath);
          }
          final String _tmpThumbnailPath;
          if (_stmt.isNull(_columnIndexOfThumbnailPath)) {
            _tmpThumbnailPath = null;
          } else {
            _tmpThumbnailPath = _stmt.getText(_columnIndexOfThumbnailPath);
          }
          final String _tmpStrokeData;
          if (_stmt.isNull(_columnIndexOfStrokeData)) {
            _tmpStrokeData = null;
          } else {
            _tmpStrokeData = _stmt.getText(_columnIndexOfStrokeData);
          }
          final String _tmpLessonId;
          if (_stmt.isNull(_columnIndexOfLessonId)) {
            _tmpLessonId = null;
          } else {
            _tmpLessonId = _stmt.getText(_columnIndexOfLessonId);
          }
          final boolean _tmpIsCompleted;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_columnIndexOfIsCompleted));
          _tmpIsCompleted = _tmp != 0;
          _item = new DrawingEntity(_tmpId,_tmpName,_tmpTimestamp,_tmpImagePath,_tmpThumbnailPath,_tmpStrokeData,_tmpLessonId,_tmpIsCompleted);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object getDrawingById(final long id,
      final Continuation<? super DrawingEntity> $completion) {
    final String _sql = "SELECT * FROM drawings WHERE id = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
        final int _columnIndexOfImagePath = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "imagePath");
        final int _columnIndexOfThumbnailPath = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "thumbnailPath");
        final int _columnIndexOfStrokeData = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "strokeData");
        final int _columnIndexOfLessonId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lessonId");
        final int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
        final DrawingEntity _result;
        if (_stmt.step()) {
          final long _tmpId;
          _tmpId = _stmt.getLong(_columnIndexOfId);
          final String _tmpName;
          if (_stmt.isNull(_columnIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_columnIndexOfName);
          }
          final long _tmpTimestamp;
          _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
          final String _tmpImagePath;
          if (_stmt.isNull(_columnIndexOfImagePath)) {
            _tmpImagePath = null;
          } else {
            _tmpImagePath = _stmt.getText(_columnIndexOfImagePath);
          }
          final String _tmpThumbnailPath;
          if (_stmt.isNull(_columnIndexOfThumbnailPath)) {
            _tmpThumbnailPath = null;
          } else {
            _tmpThumbnailPath = _stmt.getText(_columnIndexOfThumbnailPath);
          }
          final String _tmpStrokeData;
          if (_stmt.isNull(_columnIndexOfStrokeData)) {
            _tmpStrokeData = null;
          } else {
            _tmpStrokeData = _stmt.getText(_columnIndexOfStrokeData);
          }
          final String _tmpLessonId;
          if (_stmt.isNull(_columnIndexOfLessonId)) {
            _tmpLessonId = null;
          } else {
            _tmpLessonId = _stmt.getText(_columnIndexOfLessonId);
          }
          final boolean _tmpIsCompleted;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_columnIndexOfIsCompleted));
          _tmpIsCompleted = _tmp != 0;
          _result = new DrawingEntity(_tmpId,_tmpName,_tmpTimestamp,_tmpImagePath,_tmpThumbnailPath,_tmpStrokeData,_tmpLessonId,_tmpIsCompleted);
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
  public Object deleteById(final long id, final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM drawings WHERE id = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
