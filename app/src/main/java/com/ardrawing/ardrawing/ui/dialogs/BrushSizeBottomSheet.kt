package com.ardrawing.ardrawing.ui.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.ardrawing.ardrawing.R
import com.ardrawing.ardrawing.databinding.LayoutBrushSizeBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.coroutines.launch

class BrushSizeBottomSheet : BottomSheetDialogFragment() {

    private var _binding: LayoutBrushSizeBinding? = null
    private val binding get() = _binding!!
    private var onSizeChanged: ((Float) -> Unit)? = null
    private var onHardnessChanged: ((Float) -> Unit)? = null
    private var onSmoothingChanged: ((Float) -> Unit)? = null
    private var currentSize: Float = 8f
    private var currentHardness: Float = 0.8f
    private var currentSmoothing: Float = 0.5f

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LayoutBrushSizeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSliders()
    }

    private fun setupSliders() {
        binding.sliderBrushSize.addOnChangeListener { slider, value, fromUser ->
            if (fromUser) {
                currentSize = value
                binding.tvBrushSize.text = "Size: ${value.toInt()}px"
                onSizeChanged?.invoke(value)
            }
        }

        binding.sliderBrushHardness.addOnChangeListener { slider, value, fromUser ->
            if (fromUser) {
                currentHardness = value / 100f
                binding.tvBrushHardness.text = "Hardness: ${value.toInt()}%"
                onHardnessChanged?.invoke(currentHardness)
            }
        }

        binding.sliderBrushSmoothing.addOnChangeListener { slider, value, fromUser ->
            if (fromUser) {
                currentSmoothing = value / 10f
                binding.tvBrushSmoothing.text = "Smoothing: ${value.toInt()}"
                onSmoothingChanged?.invoke(currentSmoothing)
            }
        }
    }

    fun setOnSizeChanged(listener: (Float) -> Unit) {
        onSizeChanged = listener
    }

    fun setOnHardnessChanged(listener: (Float) -> Unit) {
        onHardnessChanged = listener
    }

    fun setOnSmoothingChanged(listener: (Float) -> Unit) {
        onSmoothingChanged = listener
    }

    fun setCurrentValues(size: Float, hardness: Float, smoothing: Float) {
        currentSize = size
        currentHardness = hardness
        currentSmoothing = smoothing

        binding.sliderBrushSize.value = size
        binding.sliderBrushHardness.value = hardness * 100
        binding.sliderBrushSmoothing.value = smoothing * 10

        binding.tvBrushSize.text = "Size: ${size.toInt()}px"
        binding.tvBrushHardness.text = "Hardness: ${(hardness * 100).toInt()}%"
        binding.tvBrushSmoothing.text = "Smoothing: ${(smoothing * 10).toInt()}"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}