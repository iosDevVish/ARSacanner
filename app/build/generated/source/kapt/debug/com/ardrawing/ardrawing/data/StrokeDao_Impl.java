package com.ardrawing.ardrawing.data;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
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

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class StrokeDao_Impl implements StrokeDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<StrokeEntity> __insertAdapterOfStrokeEntity;

  public StrokeDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfStrokeEntity = new EntityInsertAdapter<StrokeEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `drawing_strokes` (`id`,`drawingId`,`pointsJson`,`color`,`brushSize`,`opacity`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final StrokeEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getDrawingId());
        if (entity.getPointsJson() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getPointsJson());
        }
        statement.bindLong(4, entity.getColor());
        statement.bindDouble(5, entity.getBrushSize());
        statement.bindDouble(6, entity.getOpacity());
        statement.bindLong(7, entity.getTimestamp());
      }
    };
  }

  @Override
  public Object insertAll(final List<StrokeEntity> strokes,
      final Continuation<? super Unit> $completion) {
    if (strokes == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfStrokeEntity.insert(_connection, strokes);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object getStrokesByDrawing(final long drawingId,
      final Continuation<? super List<StrokeEntity>> $completion) {
    final String _sql = "SELECT * FROM drawing_strokes WHERE drawingId = ? ORDER BY timestamp";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, drawingId);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfDrawingId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "drawingId");
        final int _columnIndexOfPointsJson = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pointsJson");
        final int _columnIndexOfColor = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "color");
        final int _columnIndexOfBrushSize = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brushSize");
        final int _columnIndexOfOpacity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "opacity");
        final int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
        final List<StrokeEntity> _result = new ArrayList<StrokeEntity>();
        while (_stmt.step()) {
          final StrokeEntity _item;
          final long _tmpId;
          _tmpId = _stmt.getLong(_columnIndexOfId);
          final long _tmpDrawingId;
          _tmpDrawingId = _stmt.getLong(_columnIndexOfDrawingId);
          final String _tmpPointsJson;
          if (_stmt.isNull(_columnIndexOfPointsJson)) {
            _tmpPointsJson = null;
          } else {
            _tmpPointsJson = _stmt.getText(_columnIndexOfPointsJson);
          }
          final int _tmpColor;
          _tmpColor = (int) (_stmt.getLong(_columnIndexOfColor));
          final float _tmpBrushSize;
          _tmpBrushSize = (float) (_stmt.getDouble(_columnIndexOfBrushSize));
          final float _tmpOpacity;
          _tmpOpacity = (float) (_stmt.getDouble(_columnIndexOfOpacity));
          final long _tmpTimestamp;
          _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
          _item = new StrokeEntity(_tmpId,_tmpDrawingId,_tmpPointsJson,_tmpColor,_tmpBrushSize,_tmpOpacity,_tmpTimestamp);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object deleteByDrawingId(final long drawingId,
      final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM drawing_strokes WHERE drawingId = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, drawingId);
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
