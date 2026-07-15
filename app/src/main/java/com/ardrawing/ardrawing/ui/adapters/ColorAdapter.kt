package com.ardrawing.ardrawing.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.ardrawing.ardrawing.R
import com.ardrawing.ardrawing.drawing.ColorSwatch
import com.ardrawing.ardrawing.databinding.ItemColorSwatchBinding

class ColorAdapter(
    private val colors: List<ColorSwatch>,
    private val selectedIndex: Int,
    private val onColorClick: (Int) -> Unit
) : RecyclerView.Adapter<ColorAdapter.ColorViewHolder>() {

    inner class ColorViewHolder(private val binding: ItemColorSwatchBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(color: ColorSwatch, position: Int) {
            binding.colorView.setBackgroundColor(color.color)
            binding.colorView.setSelected(position == selectedIndex)
            binding.root.setOnClickListener { onColorClick(position) }
            if (color.isCustom) {
                binding.ivCustom.visibility = View.VISIBLE
            } else {
                binding.ivCustom.visibility = View.GONE
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        val binding = ItemColorSwatchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ColorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        holder.bind(colors[position], position)
    }

    override fun getItemCount(): Int = colors.size

    fun updateSelection(newIndex: Int) {
        val oldIndex = selectedIndex
        notifyItemChanged(oldIndex)
        notifyItemChanged(newIndex)
    }
}