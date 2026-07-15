package com.ardrawing.ardrawing.data;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile DrawingDao _drawingDao;

  private volatile LessonDao _lessonDao;

  private volatile LessonProgressDao _lessonProgressDao;

  private volatile SettingDao _settingDao;

  private volatile StrokeDao _strokeDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(1, "7dc4c95a837a21f776135c9fc3950e35", "862b14a40de4184881d492358f1a6908") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `drawings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `imagePath` TEXT NOT NULL, `thumbnailPath` TEXT, `strokeData` TEXT NOT NULL, `lessonId` TEXT, `isCompleted` INTEGER NOT NULL)");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `lessons` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `category` TEXT NOT NULL, `stepsJson` TEXT NOT NULL, `difficulty` INTEGER NOT NULL, `isUnlocked` INTEGER NOT NULL, `isCompleted` INTEGER NOT NULL, `progress` REAL NOT NULL, `thumbnailResource` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `lesson_progress` (`lessonId` TEXT NOT NULL, `currentStep` INTEGER NOT NULL, `completedSteps` TEXT NOT NULL, `totalTimeSpent` INTEGER NOT NULL, `lastAccessed` INTEGER NOT NULL, PRIMARY KEY(`lessonId`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `settings` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `drawing_strokes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `drawingId` INTEGER NOT NULL, `pointsJson` TEXT NOT NULL, `color` INTEGER NOT NULL, `brushSize` REAL NOT NULL, `opacity` REAL NOT NULL, `timestamp` INTEGER NOT NULL)");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7dc4c95a837a21f776135c9fc3950e35')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `drawings`");
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `lessons`");
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `lesson_progress`");
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `settings`");
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `drawing_strokes`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsDrawings = new HashMap<String, TableInfo.Column>(8);
        _columnsDrawings.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawings.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawings.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawings.put("imagePath", new TableInfo.Column("imagePath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawings.put("thumbnailPath", new TableInfo.Column("thumbnailPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawings.put("strokeData", new TableInfo.Column("strokeData", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawings.put("lessonId", new TableInfo.Column("lessonId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawings.put("isCompleted", new TableInfo.Column("isCompleted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysDrawings = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesDrawings = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDrawings = new TableInfo("drawings", _columnsDrawings, _foreignKeysDrawings, _indicesDrawings);
        final TableInfo _existingDrawings = TableInfo.read(connection, "drawings");
        if (!_infoDrawings.equals(_existingDrawings)) {
          return new RoomOpenDelegate.ValidationResult(false, "drawings(com.ardrawing.ardrawing.data.DrawingEntity).\n"
                  + " Expected:\n" + _infoDrawings + "\n"
                  + " Found:\n" + _existingDrawings);
        }
        final Map<String, TableInfo.Column> _columnsLessons = new HashMap<String, TableInfo.Column>(10);
        _columnsLessons.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("stepsJson", new TableInfo.Column("stepsJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("difficulty", new TableInfo.Column("difficulty", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("isUnlocked", new TableInfo.Column("isUnlocked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("isCompleted", new TableInfo.Column("isCompleted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("progress", new TableInfo.Column("progress", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessons.put("thumbnailResource", new TableInfo.Column("thumbnailResource", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysLessons = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesLessons = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLessons = new TableInfo("lessons", _columnsLessons, _foreignKeysLessons, _indicesLessons);
        final TableInfo _existingLessons = TableInfo.read(connection, "lessons");
        if (!_infoLessons.equals(_existingLessons)) {
          return new RoomOpenDelegate.ValidationResult(false, "lessons(com.ardrawing.ardrawing.data.LessonEntity).\n"
                  + " Expected:\n" + _infoLessons + "\n"
                  + " Found:\n" + _existingLessons);
        }
        final Map<String, TableInfo.Column> _columnsLessonProgress = new HashMap<String, TableInfo.Column>(5);
        _columnsLessonProgress.put("lessonId", new TableInfo.Column("lessonId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessonProgress.put("currentStep", new TableInfo.Column("currentStep", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessonProgress.put("completedSteps", new TableInfo.Column("completedSteps", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessonProgress.put("totalTimeSpent", new TableInfo.Column("totalTimeSpent", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLessonProgress.put("lastAccessed", new TableInfo.Column("lastAccessed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysLessonProgress = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesLessonProgress = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLessonProgress = new TableInfo("lesson_progress", _columnsLessonProgress, _foreignKeysLessonProgress, _indicesLessonProgress);
        final TableInfo _existingLessonProgress = TableInfo.read(connection, "lesson_progress");
        if (!_infoLessonProgress.equals(_existingLessonProgress)) {
          return new RoomOpenDelegate.ValidationResult(false, "lesson_progress(com.ardrawing.ardrawing.data.LessonProgressEntity).\n"
                  + " Expected:\n" + _infoLessonProgress + "\n"
                  + " Found:\n" + _existingLessonProgress);
        }
        final Map<String, TableInfo.Column> _columnsSettings = new HashMap<String, TableInfo.Column>(2);
        _columnsSettings.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSettings.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysSettings = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesSettings = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSettings = new TableInfo("settings", _columnsSettings, _foreignKeysSettings, _indicesSettings);
        final TableInfo _existingSettings = TableInfo.read(connection, "settings");
        if (!_infoSettings.equals(_existingSettings)) {
          return new RoomOpenDelegate.ValidationResult(false, "settings(com.ardrawing.ardrawing.data.SettingEntity).\n"
                  + " Expected:\n" + _infoSettings + "\n"
                  + " Found:\n" + _existingSettings);
        }
        final Map<String, TableInfo.Column> _columnsDrawingStrokes = new HashMap<String, TableInfo.Column>(7);
        _columnsDrawingStrokes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawingStrokes.put("drawingId", new TableInfo.Column("drawingId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawingStrokes.put("pointsJson", new TableInfo.Column("pointsJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawingStrokes.put("color", new TableInfo.Column("color", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawingStrokes.put("brushSize", new TableInfo.Column("brushSize", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawingStrokes.put("opacity", new TableInfo.Column("opacity", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDrawingStrokes.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysDrawingStrokes = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesDrawingStrokes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDrawingStrokes = new TableInfo("drawing_strokes", _columnsDrawingStrokes, _foreignKeysDrawingStrokes, _indicesDrawingStrokes);
        final TableInfo _existingDrawingStrokes = TableInfo.read(connection, "drawing_strokes");
        if (!_infoDrawingStrokes.equals(_existingDrawingStrokes)) {
          return new RoomOpenDelegate.ValidationResult(false, "drawing_strokes(com.ardrawing.ardrawing.data.StrokeEntity).\n"
                  + " Expected:\n" + _infoDrawingStrokes + "\n"
                  + " Found:\n" + _existingDrawingStrokes);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "drawings", "lessons", "lesson_progress", "settings", "drawing_strokes");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "drawings", "lessons", "lesson_progress", "settings", "drawing_strokes");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DrawingDao.class, DrawingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LessonDao.class, LessonDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LessonProgressDao.class, LessonProgressDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SettingDao.class, SettingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(StrokeDao.class, StrokeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public DrawingDao drawingDao() {
    if (_drawingDao != null) {
      return _drawingDao;
    } else {
      synchronized(this) {
        if(_drawingDao == null) {
          _drawingDao = new DrawingDao_Impl(this);
        }
        return _drawingDao;
      }
    }
  }

  @Override
  public LessonDao lessonDao() {
    if (_lessonDao != null) {
      return _lessonDao;
    } else {
      synchronized(this) {
        if(_lessonDao == null) {
          _lessonDao = new LessonDao_Impl(this);
        }
        return _lessonDao;
      }
    }
  }

  @Override
  public LessonProgressDao lessonProgressDao() {
    if (_lessonProgressDao != null) {
      return _lessonProgressDao;
    } else {
      synchronized(this) {
        if(_lessonProgressDao == null) {
          _lessonProgressDao = new LessonProgressDao_Impl(this);
        }
        return _lessonProgressDao;
      }
    }
  }

  @Override
  public SettingDao settingDao() {
    if (_settingDao != null) {
      return _settingDao;
    } else {
      synchronized(this) {
        if(_settingDao == null) {
          _settingDao = new SettingDao_Impl(this);
        }
        return _settingDao;
      }
    }
  }

  @Override
  public StrokeDao strokeDao() {
    if (_strokeDao != null) {
      return _strokeDao;
    } else {
      synchronized(this) {
        if(_strokeDao == null) {
          _strokeDao = new StrokeDao_Impl(this);
        }
        return _strokeDao;
      }
    }
  }
}
