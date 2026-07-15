package com.ardrawing.ardrawing.ui.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ardrawing.ardrawing.R
import com.ardrawing.ardrawing.drawing.DrawingGuide
import com.ardrawing.ardrawing.databinding.LayoutGuideSelectorBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class GuideSelectorBottomSheet : BottomSheetDialogFragment() {

    private var _binding: LayoutGuideSelectorBinding? = null
    private val binding get() = _binding!!
    private var selectedGuide: DrawingGuide? = null
    private var onGuideSelected: ((DrawingGuide?) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LayoutGuideSelectorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val guides = DrawingGuide.ALL
        val adapter = GuideAdapter(guides, selectedGuide) { guide ->
            selectedGuide = guide
            onGuideSelected?.invoke(guide)
            notifyGuideChange()
        }

        binding.rvGuides.layoutManager = LinearLayoutManager(context)
        binding.rvGuides.adapter = adapter

        binding.sliderGuideOpacity.addOnChangeListener { slider, value, fromUser ->
            // Update guide opacity
        }
    }

    private fun notifyGuideChange() {
        (binding.rvGuides.adapter as? GuideAdapter)?.notifyDataSetChanged()
    }

    fun setCurrentGuide(guide: DrawingGuide?) {
        selectedGuide = guide
    }

    fun setOnGuideSelected(listener: (DrawingGuide?) -> Unit) {
        onGuideSelected = listener
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class GuideAdapter(
    private val guides: List<DrawingGuide>,
    private var selectedGuide: DrawingGuide?,
    private val onClick: (DrawingGuide) -> Unit
) : RecyclerView.Adapter<GuideAdapter.GuideViewHolder>() {

    inner class GuideViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(guide: DrawingGuide) {
            itemView.findViewById<TextView>(R.id.tvGuideName).text = guide.name
            itemView.findViewById<TextView>(R.id.tvGuideDescription).text = guide.description
            itemView.findViewById<ImageView>(R.id.ivGuideIcon).setImageResource(guide.iconRes)

            val isSelected = guide == selectedGuide
            itemView.findViewById<View>(R.id.guideSelectionIndicator).visibility = if (isSelected) View.VISIBLE else View.GONE
            itemView.setBackgroundResource(if (isSelected) R.drawable.guide_item_selected else R.drawable.guide_item_default)

            itemView.setOnClickListener { onClick(guide) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuideViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_guide, parent, false)
        return GuideViewHolder(view)
    }

    override fun onBindViewHolder(holder: GuideViewHolder, position: Int) {
        holder.bind(guides[position])
    }

    override fun getItemCount(): Int = guides.size
}