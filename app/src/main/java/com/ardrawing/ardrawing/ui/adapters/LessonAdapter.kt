package com.ardrawing.ardrawing.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ardrawing.ardrawing.R
import com.ardrawing.ardrawing.databinding.ItemLessonBinding
import com.ardrawing.ardrawing.drawing.Lesson
import com.ardrawing.ardrawing.drawing.LessonCategory
import com.bumptech.glide.Glide

class LessonAdapter(
    private val lessons: List<Lesson>,
    private val onLessonClick: (Lesson) -> Unit
) : ListAdapter<Lesson, LessonAdapter.LessonViewHolder>(LessonDiffCallback()) {

    inner class LessonViewHolder(private val binding: ItemLessonBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(lesson: Lesson) {
            binding.tvTitle.text = lesson.title
            binding.tvDescription.text = lesson.description
            binding.tvDifficulty.text = "Level ${lesson.difficulty}"
            binding.progressBar.progress = (lesson.progress * 100).toInt()

            val category = lesson.getCategoryEnum()
            binding.cardLesson.setCardBackgroundColor(binding.root.context.getColor(category.colorRes))

            if (lesson.isCompleted) {
                binding.ivStatus.setImageResource(R.drawable.ic_check)
                binding.ivStatus.setColorFilter(binding.root.context.getColor(R.color.lesson_completed))
            } else if (lesson.isUnlocked) {
                binding.ivStatus.setImageResource(R.drawable.ic_play_arrow)
                binding.ivStatus.setColorFilter(binding.root.context.getColor(R.color.lesson_unlocked))
            } else {
                binding.ivStatus.setImageResource(R.drawable.ic_lock)
                binding.ivStatus.setColorFilter(binding.root.context.getColor(R.color.lesson_locked))
            }

            binding.root.setOnClickListener {
                if (lesson.isUnlocked || lesson.isCompleted) {
                    onLessonClick(lesson)
                }
            }
            binding.root.alpha = if (lesson.isUnlocked || lesson.isCompleted) 1f else 0.5f
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val binding = ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LessonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class LessonDiffCallback : DiffUtil.ItemCallback<Lesson>() {
        override fun areItemsTheSame(oldItem: Lesson, newItem: Lesson): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Lesson, newItem: Lesson): Boolean {
            return oldItem == newItem
        }
    }
}