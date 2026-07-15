package com.ardrawing.ardrawing.util

data class Point3D(
    val x: Float,
    val y: Float,
    val z: Float,
    val pressure: Float = 1f,
    val timestamp: Long = System.currentTimeMillis()
)

data class StrokeData(
    val points: List<Point3D>,
    val color: Int,
    val brushSize: Float,
    val opacity: Float,
    val toolType: Int = 0
)