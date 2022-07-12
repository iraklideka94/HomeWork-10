package com.example.homework_10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_10.databinding.ItemLayoutBinding

class ClothesAdapter : RecyclerView.Adapter<ClothesAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = productList[position]
        holder.binding.title.text = item.title
        holder.binding.price.text = item.price
        holder.binding.image.setImageResource(item.image)
    }

    override fun getItemCount(): Int = productList.size
}
