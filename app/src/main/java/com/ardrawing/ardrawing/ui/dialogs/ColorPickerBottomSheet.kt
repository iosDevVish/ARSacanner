package com.ardrawing.ardrawing.ui.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.ardrawing.ardrawing.R
import com.ardrawing.ardrawing.databinding.LayoutColorPickerBinding
import com.ardrawing.ardrawing.drawing.ColorSwatch
import com.ardrawing.ardrawing.drawing.DefaultColors
import com.ardrawing.ardrawing.ui.adapters.ColorAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.slider.Slider

class ColorPickerBottomSheet : BottomSheetDialogFragment() {

    private var _binding: LayoutColorPickerBinding? = null
    private val binding get() = _binding!!
    private var selectedColor: Int = 0xFF6750A4.toInt()
    private var onColorSelected: ((Int) -> Unit)? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = LayoutColorPickerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ColorAdapter(DefaultColors.PALETTE, 0) { index ->
            selectedColor = DefaultColors.PALETTE[index].color
            onColorSelected?.invoke(selectedColor)
            dismiss()
        }

        binding.rvColors.layoutManager = GridLayoutManager(context, 8)
        binding.rvColors.adapter = adapter

        binding.sliderOpacity.addOnChangeListener { slider, value, fromUser ->
            binding.tvOpacity.text = "Opacity: ${(value * 100).toInt()}%"
        }
    }

    fun setCurrentColor(color: Int) {
        selectedColor = color
        val index = DefaultColors.PALETTE.indexOfFirst { it.color == color }
        if (index >= 0) {
            // Update selection
        }
    }

    fun setOnColorSelected(listener: (Int) -> Unit) {
        onColorSelected = listener
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}