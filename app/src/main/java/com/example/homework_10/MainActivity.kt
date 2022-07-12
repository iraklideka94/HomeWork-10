package com.example.homework_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val productsAdapter: ClothesAdapter by lazy {
        ClothesAdapter()
    }
    private val categoryAdapter: ItemAdapter by lazy {
        ItemAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RvCategories.adapter = categoryAdapter
        binding.RvItems.adapter = productsAdapter
        selectClothes.addAll(productList)

        categoryAdapter.onCategoryClick = { category ->
            CatListener(category)
        }

    }
    fun CatListener(category: FilterCategory) {
        selectClothes.clear()
        productList.forEach {
            if (it.category.contains(category)) {
                selectClothes.add(it)
            }
        }
    }
}