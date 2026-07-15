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
public final class LessonDao_Impl implements LessonDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<LessonEntity> __insertAdapterOfLessonEntity;

  private final EntityDeleteOrUpdateAdapter<LessonEntity> __updateAdapterOfLessonEntity;

  public LessonDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfLessonEntity = new EntityInsertAdapter<LessonEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `lessons` (`id`,`title`,`description`,`category`,`stepsJson`,`difficulty`,`isUnlocked`,`isCompleted`,`progress`,`thumbnailResource`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final LessonEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getId());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getTitle());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getDescription());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getCategory());
        }
        if (entity.getStepsJson() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getStepsJson());
        }
        statement.bindLong(6, entity.getDifficulty());
        final int _tmp = entity.isUnlocked() ? 1 : 0;
        statement.bindLong(7, _tmp);
        final int _tmp_1 = entity.isCompleted() ? 1 : 0;
        statement.bindLong(8, _tmp_1);
        statement.bindDouble(9, entity.getProgress());
        statement.bindLong(10, entity.getThumbnailResource());
      }
    };
    this.__updateAdapterOfLessonEntity = new EntityDeleteOrUpdateAdapter<LessonEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `lessons` SET `id` = ?,`title` = ?,`description` = ?,`category` = ?,`stepsJson` = ?,`difficulty` = ?,`isUnlocked` = ?,`isCompleted` = ?,`progress` = ?,`thumbnailResource` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final LessonEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getId());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getTitle());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getDescription());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getCategory());
        }
        if (entity.getStepsJson() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getStepsJson());
        }
        statement.bindLong(6, entity.getDifficulty());
        final int _tmp = entity.isUnlocked() ? 1 : 0;
        statement.bindLong(7, _tmp);
        final int _tmp_1 = entity.isCompleted() ? 1 : 0;
        statement.bindLong(8, _tmp_1);
        statement.bindDouble(9, entity.getProgress());
        statement.bindLong(10, entity.getThumbnailResource());
        if (entity.getId() == null) {
          statement.bindNull(11);
        } else {
          statement.bindText(11, entity.getId());
        }
      }
    };
  }

  @Override
  public Object insertAll(final List<LessonEntity> lessons,
      final Continuation<? super Unit> $completion) {
    if (lessons == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfLessonEntity.insert(_connection, lessons);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object update(final LessonEntity lesson, final Continuation<? super Unit> $completion) {
    if (lesson == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfLessonEntity.handle(_connection, lesson);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Flow<List<LessonEntity>> getAllLessons() {
    final String _sql = "SELECT * FROM lessons ORDER BY category, difficulty";
    return FlowUtil.createFlow(__db, false, new String[] {"lessons"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfDescription = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "description");
        final int _columnIndexOfCategory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "category");
        final int _columnIndexOfStepsJson = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stepsJson");
        final int _columnIndexOfDifficulty = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "difficulty");
        final int _columnIndexOfIsUnlocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isUnlocked");
        final int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
        final int _columnIndexOfProgress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "progress");
        final int _columnIndexOfThumbnailResource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "thumbnailResource");
        final List<LessonEntity> _result = new ArrayList<LessonEntity>();
        while (_stmt.step()) {
          final LessonEntity _item;
          final String _tmpId;
          if (_stmt.isNull(_columnIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _stmt.getText(_columnIndexOfId);
          }
          final String _tmpTitle;
          if (_stmt.isNull(_columnIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _stmt.getText(_columnIndexOfTitle);
          }
          final String _tmpDescription;
          if (_stmt.isNull(_columnIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _stmt.getText(_columnIndexOfDescription);
          }
          final String _tmpCategory;
          if (_stmt.isNull(_columnIndexOfCategory)) {
            _tmpCategory = null;
          } else {
            _tmpCategory = _stmt.getText(_columnIndexOfCategory);
          }
          final String _tmpStepsJson;
          if (_stmt.isNull(_columnIndexOfStepsJson)) {
            _tmpStepsJson = null;
          } else {
            _tmpStepsJson = _stmt.getText(_columnIndexOfStepsJson);
          }
          final int _tmpDifficulty;
          _tmpDifficulty = (int) (_stmt.getLong(_columnIndexOfDifficulty));
          final boolean _tmpIsUnlocked;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_columnIndexOfIsUnlocked));
          _tmpIsUnlocked = _tmp != 0;
          final boolean _tmpIsCompleted;
          final int _tmp_1;
          _tmp_1 = (int) (_stmt.getLong(_columnIndexOfIsCompleted));
          _tmpIsCompleted = _tmp_1 != 0;
          final float _tmpProgress;
          _tmpProgress = (float) (_stmt.getDouble(_columnIndexOfProgress));
          final int _tmpThumbnailResource;
          _tmpThumbnailResource = (int) (_stmt.getLong(_columnIndexOfThumbnailResource));
          _item = new LessonEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpCategory,_tmpStepsJson,_tmpDifficulty,_tmpIsUnlocked,_tmpIsCompleted,_tmpProgress,_tmpThumbnailResource);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Flow<List<LessonEntity>> getLessonsByCategory(final String category) {
    final String _sql = "SELECT * FROM lessons WHERE category = ? ORDER BY difficulty";
    return FlowUtil.createFlow(__db, false, new String[] {"lessons"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (category == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, category);
        }
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfDescription = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "description");
        final int _columnIndexOfCategory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "category");
        final int _columnIndexOfStepsJson = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stepsJson");
        final int _columnIndexOfDifficulty = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "difficulty");
        final int _columnIndexOfIsUnlocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isUnlocked");
        final int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
        final int _columnIndexOfProgress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "progress");
        final int _columnIndexOfThumbnailResource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "thumbnailResource");
        final List<LessonEntity> _result = new ArrayList<LessonEntity>();
        while (_stmt.step()) {
          final LessonEntity _item;
          final String _tmpId;
          if (_stmt.isNull(_columnIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _stmt.getText(_columnIndexOfId);
          }
          final String _tmpTitle;
          if (_stmt.isNull(_columnIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _stmt.getText(_columnIndexOfTitle);
          }
          final String _tmpDescription;
          if (_stmt.isNull(_columnIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _stmt.getText(_columnIndexOfDescription);
          }
          final String _tmpCategory;
          if (_stmt.isNull(_columnIndexOfCategory)) {
            _tmpCategory = null;
          } else {
            _tmpCategory = _stmt.getText(_columnIndexOfCategory);
          }
          final String _tmpStepsJson;
          if (_stmt.isNull(_columnIndexOfStepsJson)) {
            _tmpStepsJson = null;
          } else {
            _tmpStepsJson = _stmt.getText(_columnIndexOfStepsJson);
          }
          final int _tmpDifficulty;
          _tmpDifficulty = (int) (_stmt.getLong(_columnIndexOfDifficulty));
          final boolean _tmpIsUnlocked;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_columnIndexOfIsUnlocked));
          _tmpIsUnlocked = _tmp != 0;
          final boolean _tmpIsCompleted;
          final int _tmp_1;
          _tmp_1 = (int) (_stmt.getLong(_columnIndexOfIsCompleted));
          _tmpIsCompleted = _tmp_1 != 0;
          final float _tmpProgress;
          _tmpProgress = (float) (_stmt.getDouble(_columnIndexOfProgress));
          final int _tmpThumbnailResource;
          _tmpThumbnailResource = (int) (_stmt.getLong(_columnIndexOfThumbnailResource));
          _item = new LessonEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpCategory,_tmpStepsJson,_tmpDifficulty,_tmpIsUnlocked,_tmpIsCompleted,_tmpProgress,_tmpThumbnailResource);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object getLessonById(final String id,
      final Continuation<? super LessonEntity> $completion) {
    final String _sql = "SELECT * FROM lessons WHERE id = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, id);
        }
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfDescription = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "description");
        final int _columnIndexOfCategory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "category");
        final int _columnIndexOfStepsJson = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stepsJson");
        final int _columnIndexOfDifficulty = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "difficulty");
        final int _columnIndexOfIsUnlocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isUnlocked");
        final int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
        final int _columnIndexOfProgress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "progress");
        final int _columnIndexOfThumbnailResource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "thumbnailResource");
        final LessonEntity _result;
        if (_stmt.step()) {
          final String _tmpId;
          if (_stmt.isNull(_columnIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _stmt.getText(_columnIndexOfId);
          }
          final String _tmpTitle;
          if (_stmt.isNull(_columnIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _stmt.getText(_columnIndexOfTitle);
          }
          final String _tmpDescription;
          if (_stmt.isNull(_columnIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _stmt.getText(_columnIndexOfDescription);
          }
          final String _tmpCategory;
          if (_stmt.isNull(_columnIndexOfCategory)) {
            _tmpCategory = null;
          } else {
            _tmpCategory = _stmt.getText(_columnIndexOfCategory);
          }
          final String _tmpStepsJson;
          if (_stmt.isNull(_columnIndexOfStepsJson)) {
            _tmpStepsJson = null;
          } else {
            _tmpStepsJson = _stmt.getText(_columnIndexOfStepsJson);
          }
          final int _tmpDifficulty;
          _tmpDifficulty = (int) (_stmt.getLong(_columnIndexOfDifficulty));
          final boolean _tmpIsUnlocked;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_columnIndexOfIsUnlocked));
          _tmpIsUnlocked = _tmp != 0;
          final boolean _tmpIsCompleted;
          final int _tmp_1;
          _tmp_1 = (int) (_stmt.getLong(_columnIndexOfIsCompleted));
          _tmpIsCompleted = _tmp_1 != 0;
          final float _tmpProgress;
          _tmpProgress = (float) (_stmt.getDouble(_columnIndexOfProgress));
          final int _tmpThumbnailResource;
          _tmpThumbnailResource = (int) (_stmt.getLong(_columnIndexOfThumbnailResource));
          _result = new LessonEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpCategory,_tmpStepsJson,_tmpDifficulty,_tmpIsUnlocked,_tmpIsCompleted,_tmpProgress,_tmpThumbnailResource);
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
  public Flow<List<LessonEntity>> getUnlockedLessons() {
    final String _sql = "SELECT * FROM lessons WHERE isUnlocked = 1 ORDER BY category, difficulty";
    return FlowUtil.createFlow(__db, false, new String[] {"lessons"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfTitle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "title");
        final int _columnIndexOfDescription = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "description");
        final int _columnIndexOfCategory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "category");
        final int _columnIndexOfStepsJson = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stepsJson");
        final int _columnIndexOfDifficulty = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "difficulty");
        final int _columnIndexOfIsUnlocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isUnlocked");
        final int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
        final int _columnIndexOfProgress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "progress");
        final int _columnIndexOfThumbnailResource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "thumbnailResource");
        final List<LessonEntity> _result = new ArrayList<LessonEntity>();
        while (_stmt.step()) {
          final LessonEntity _item;
          final String _tmpId;
          if (_stmt.isNull(_columnIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _stmt.getText(_columnIndexOfId);
          }
          final String _tmpTitle;
          if (_stmt.isNull(_columnIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _stmt.getText(_columnIndexOfTitle);
          }
          final String _tmpDescription;
          if (_stmt.isNull(_columnIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _stmt.getText(_columnIndexOfDescription);
          }
          final String _tmpCategory;
          if (_stmt.isNull(_columnIndexOfCategory)) {
            _tmpCategory = null;
          } else {
            _tmpCategory = _stmt.getText(_columnIndexOfCategory);
          }
          final String _tmpStepsJson;
          if (_stmt.isNull(_columnIndexOfStepsJson)) {
            _tmpStepsJson = null;
          } else {
            _tmpStepsJson = _stmt.getText(_columnIndexOfStepsJson);
          }
          final int _tmpDifficulty;
          _tmpDifficulty = (int) (_stmt.getLong(_columnIndexOfDifficulty));
          final boolean _tmpIsUnlocked;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_columnIndexOfIsUnlocked));
          _tmpIsUnlocked = _tmp != 0;
          final boolean _tmpIsCompleted;
          final int _tmp_1;
          _tmp_1 = (int) (_stmt.getLong(_columnIndexOfIsCompleted));
          _tmpIsCompleted = _tmp_1 != 0;
          final float _tmpProgress;
          _tmpProgress = (float) (_stmt.getDouble(_columnIndexOfProgress));
          final int _tmpThumbnailResource;
          _tmpThumbnailResource = (int) (_stmt.getLong(_columnIndexOfThumbnailResource));
          _item = new LessonEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpCategory,_tmpStepsJson,_tmpDifficulty,_tmpIsUnlocked,_tmpIsCompleted,_tmpProgress,_tmpThumbnailResource);
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
