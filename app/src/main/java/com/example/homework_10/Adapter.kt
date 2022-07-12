package com.example.homework_10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_10.databinding.CategoryLayoutBinding

typealias onCategoryClick= (category:FilterCategory) -> Unit

class ItemAdapter: RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    private val category = FilterCategory.values().toList()
    lateinit var onCategoryClick: onCategoryClick

    inner class ViewHolder(var binding: CategoryLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CategoryLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val selectedItmes = category[position]
        holder.binding.category.text = selectedItmes.categoryName
        holder.binding.root.setOnClickListener { onCategoryClick(selectedItmes) }
    }

    override fun getItemCount(): Int = selectClothes.size
}