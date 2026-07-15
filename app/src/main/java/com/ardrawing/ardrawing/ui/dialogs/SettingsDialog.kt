package com.ardrawing.ardrawing.ui.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.DialogFragment
import com.ardrawing.ardrawing.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class SettingsDialog : DialogFragment() {

    private var prefs: SharedPreferences? = null
    private var onSettingsChanged: (() -> Unit)? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        prefs = context.getSharedPreferences("ardrawing_settings", Context.MODE_PRIVATE)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_settings_simple, null)
        setupViews(view)

        return MaterialAlertDialogBuilder(requireContext())
            .setView(view)
            .setTitle(R.string.settings_title)
            .setPositiveButton(R.string.save) { _, _ ->
                saveSettings(view)
                onSettingsChanged?.invoke()
            }
            .setNegativeButton(R.string.cancel, null)
            .create()
    }

    private fun setupViews(view: View) {
        if (prefs == null) return

        val switchBrushPreview = view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchBrushPreview)
        switchBrushPreview?.isChecked = prefs?.getBoolean("brush_preview", true) ?: true

        val switchAutoSave = view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchAutoSave)
        switchAutoSave?.isChecked = prefs?.getBoolean("auto_save", true) ?: true

        val switchHapticFeedback = view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchHapticFeedback)
        switchHapticFeedback?.isChecked = prefs?.getBoolean("haptic_feedback", true) ?: true

        val switchShowFps = view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchShowFps)
        switchShowFps?.isChecked = prefs?.getBoolean("show_fps", false) ?: false

        val switchPlaneDetection = view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchPlaneDetection)
        switchPlaneDetection?.isChecked = prefs?.getBoolean("plane_detection", true) ?: true

        val switchAutoRotateCanvas = view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchAutoRotateCanvas)
        switchAutoRotateCanvas?.isChecked = prefs?.getBoolean("auto_rotate_canvas", false) ?: false

        val switchLessonHints = view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchLessonHints)
        switchLessonHints?.isChecked = prefs?.getBoolean("lesson_hints", true) ?: true
    }

    private fun saveSettings(view: View) {
        val prefs = requireContext().getSharedPreferences("ardrawing_settings", Context.MODE_PRIVATE)
        prefs.edit().apply {
            putBoolean("brush_preview", view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchBrushPreview)?.isChecked ?: true)
            putBoolean("auto_save", view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchAutoSave)?.isChecked ?: true)
            putBoolean("haptic_feedback", view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchHapticFeedback)?.isChecked ?: true)
            putBoolean("show_fps", view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchShowFps)?.isChecked ?: false)
            putBoolean("plane_detection", view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchPlaneDetection)?.isChecked ?: true)
            putBoolean("auto_rotate_canvas", view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchAutoRotateCanvas)?.isChecked ?: false)
            putBoolean("lesson_hints", view.findViewById<androidx.appcompat.widget.SwitchCompat>(R.id.switchLessonHints)?.isChecked ?: true)
            apply()
        }
    }

    fun setOnSettingsChanged(listener: () -> Unit) {
        onSettingsChanged = listener
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}