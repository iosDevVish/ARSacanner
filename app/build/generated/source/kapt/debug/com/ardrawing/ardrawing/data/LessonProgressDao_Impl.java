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
public final class LessonProgressDao_Impl implements LessonProgressDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<LessonProgressEntity> __insertAdapterOfLessonProgressEntity;

  private final EntityDeleteOrUpdateAdapter<LessonProgressEntity> __updateAdapterOfLessonProgressEntity;

  public LessonProgressDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfLessonProgressEntity = new EntityInsertAdapter<LessonProgressEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `lesson_progress` (`lessonId`,`currentStep`,`completedSteps`,`totalTimeSpent`,`lastAccessed`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final LessonProgressEntity entity) {
        if (entity.getLessonId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getLessonId());
        }
        statement.bindLong(2, entity.getCurrentStep());
        if (entity.getCompletedSteps() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getCompletedSteps());
        }
        statement.bindLong(4, entity.getTotalTimeSpent());
        statement.bindLong(5, entity.getLastAccessed());
      }
    };
    this.__updateAdapterOfLessonProgressEntity = new EntityDeleteOrUpdateAdapter<LessonProgressEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `lesson_progress` SET `lessonId` = ?,`currentStep` = ?,`completedSteps` = ?,`totalTimeSpent` = ?,`lastAccessed` = ? WHERE `lessonId` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final LessonProgressEntity entity) {
        if (entity.getLessonId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getLessonId());
        }
        statement.bindLong(2, entity.getCurrentStep());
        if (entity.getCompletedSteps() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getCompletedSteps());
        }
        statement.bindLong(4, entity.getTotalTimeSpent());
        statement.bindLong(5, entity.getLastAccessed());
        if (entity.getLessonId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getLessonId());
        }
      }
    };
  }

  @Override
  public Object insert(final LessonProgressEntity progress,
      final Continuation<? super Unit> $completion) {
    if (progress == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfLessonProgressEntity.insert(_connection, progress);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object update(final LessonProgressEntity progress,
      final Continuation<? super Unit> $completion) {
    if (progress == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfLessonProgressEntity.handle(_connection, progress);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object getProgress(final String lessonId,
      final Continuation<? super LessonProgressEntity> $completion) {
    final String _sql = "SELECT * FROM lesson_progress WHERE lessonId = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (lessonId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, lessonId);
        }
        final int _columnIndexOfLessonId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lessonId");
        final int _columnIndexOfCurrentStep = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "currentStep");
        final int _columnIndexOfCompletedSteps = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "completedSteps");
        final int _columnIndexOfTotalTimeSpent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "totalTimeSpent");
        final int _columnIndexOfLastAccessed = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastAccessed");
        final LessonProgressEntity _result;
        if (_stmt.step()) {
          final String _tmpLessonId;
          if (_stmt.isNull(_columnIndexOfLessonId)) {
            _tmpLessonId = null;
          } else {
            _tmpLessonId = _stmt.getText(_columnIndexOfLessonId);
          }
          final int _tmpCurrentStep;
          _tmpCurrentStep = (int) (_stmt.getLong(_columnIndexOfCurrentStep));
          final String _tmpCompletedSteps;
          if (_stmt.isNull(_columnIndexOfCompletedSteps)) {
            _tmpCompletedSteps = null;
          } else {
            _tmpCompletedSteps = _stmt.getText(_columnIndexOfCompletedSteps);
          }
          final long _tmpTotalTimeSpent;
          _tmpTotalTimeSpent = _stmt.getLong(_columnIndexOfTotalTimeSpent);
          final long _tmpLastAccessed;
          _tmpLastAccessed = _stmt.getLong(_columnIndexOfLastAccessed);
          _result = new LessonProgressEntity(_tmpLessonId,_tmpCurrentStep,_tmpCompletedSteps,_tmpTotalTimeSpent,_tmpLastAccessed);
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
  public Flow<List<LessonProgressEntity>> getAllProgress() {
    final String _sql = "SELECT * FROM lesson_progress";
    return FlowUtil.createFlow(__db, false, new String[] {"lesson_progress"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfLessonId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lessonId");
        final int _columnIndexOfCurrentStep = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "currentStep");
        final int _columnIndexOfCompletedSteps = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "completedSteps");
        final int _columnIndexOfTotalTimeSpent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "totalTimeSpent");
        final int _columnIndexOfLastAccessed = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastAccessed");
        final List<LessonProgressEntity> _result = new ArrayList<LessonProgressEntity>();
        while (_stmt.step()) {
          final LessonProgressEntity _item;
          final String _tmpLessonId;
          if (_stmt.isNull(_columnIndexOfLessonId)) {
            _tmpLessonId = null;
          } else {
            _tmpLessonId = _stmt.getText(_columnIndexOfLessonId);
          }
          final int _tmpCurrentStep;
          _tmpCurrentStep = (int) (_stmt.getLong(_columnIndexOfCurrentStep));
          final String _tmpCompletedSteps;
          if (_stmt.isNull(_columnIndexOfCompletedSteps)) {
            _tmpCompletedSteps = null;
          } else {
            _tmpCompletedSteps = _stmt.getText(_columnIndexOfCompletedSteps);
          }
          final long _tmpTotalTimeSpent;
          _tmpTotalTimeSpent = _stmt.getLong(_columnIndexOfTotalTimeSpent);
          final long _tmpLastAccessed;
          _tmpLastAccessed = _stmt.getLong(_columnIndexOfLastAccessed);
          _item = new LessonProgressEntity(_tmpLessonId,_tmpCurrentStep,_tmpCompletedSteps,_tmpTotalTimeSpent,_tmpLastAccessed);
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
