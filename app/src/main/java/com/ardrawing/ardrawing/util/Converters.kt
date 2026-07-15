package com.ardrawing.ardrawing.util

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class Converters {
    private val gson = Gson()

    @TypeConverter
    fun fromPointList(list: List<Point3D>?): String? {
        return if (list == null) null else gson.toJson(list)
    }

    @TypeConverter
    fun toPointList(json: String?): List<Point3D>? {
        return if (json == null) null else {
            val type: Type = object : TypeToken<List<Point3D>>() {}.type
            gson.fromJson(json, type)
        }
    }

    @TypeConverter
    fun fromColorList(list: List<Int>?): String? {
        return if (list == null) null else gson.toJson(list)
    }

    @TypeConverter
    fun toColorList(json: String?): List<Int>? {
        return if (json == null) null else {
            val type: Type = object : TypeToken<List<Int>>() {}.type
            gson.fromJson(json, type)
        }
    }

    @TypeConverter
    fun fromFloatList(list: List<Float>?): String? {
        return if (list == null) null else gson.toJson(list)
    }

    @TypeConverter
    fun toFloatList(json: String?): List<Float>? {
        return if (json == null) null else {
            val type: Type = object : TypeToken<List<Float>>() {}.type
            gson.fromJson(json, type)
        }
    }

    @TypeConverter
    fun fromStringList(list: List<String>?): String? {
        return if (list == null) null else gson.toJson(list)
    }

    @TypeConverter
    fun toStringList(json: String?): List<String>? {
        return if (json == null) null else {
            val type: Type = object : TypeToken<List<String>>() {}.type
            gson.fromJson(json, type)
        }
    }

    @TypeConverter
    fun fromStrokeData(stroke: StrokeData?): String? {
        return if (stroke == null) null else gson.toJson(stroke)
    }

    @TypeConverter
    fun toStrokeData(json: String?): StrokeData? {
        return if (json == null) null else gson.fromJson(json, StrokeData::class.java)
    }

    @TypeConverter
    fun fromStrokeDataList(list: List<StrokeData>?): String? {
        return if (list == null) null else gson.toJson(list)
    }

    @TypeConverter
    fun toStrokeDataList(json: String?): List<StrokeData>? {
        return if (json == null) null else {
            val type: Type = object : TypeToken<List<StrokeData>>() {}.type
            gson.fromJson(json, type)
        }
    }
}