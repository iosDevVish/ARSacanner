package com.ardrawing.ardrawing.ui.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ardrawing.ardrawing.R
import com.ardrawing.ardrawing.drawing.Lesson
import com.ardrawing.ardrawing.databinding.LayoutLessonSelectorBinding
import com.ardrawing.ardrawing.ui.adapters.LessonAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class LessonSelectorBottomSheet : BottomSheetDialogFragment() {

    private var _binding: LayoutLessonSelectorBinding? = null
    private val binding get() = _binding!!
    private var lessons: List<Lesson> = emptyList()
    private var onLessonSelected: ((Lesson) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LayoutLessonSelectorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = LessonAdapter(lessons) { lesson ->
            if (lesson.isUnlocked || lesson.isCompleted) {
                onLessonSelected?.invoke(lesson)
                dismiss()
            }
        }

        binding.rvLessons.layoutManager = GridLayoutManager(context, 2)
        binding.rvLessons.adapter = adapter
    }

    fun setLessons(lessons: List<Lesson>) {
        this.lessons = lessons
        (binding.rvLessons.adapter as? LessonAdapter)?.notifyDataSetChanged()
    }

    fun setOnLessonSelected(listener: (Lesson) -> Unit) {
        onLessonSelected = listener
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}