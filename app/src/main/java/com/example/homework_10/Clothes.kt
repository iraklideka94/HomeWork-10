package com.example.homework_10

data class Clothes (
    val title:String,
    val image: Int,
    val price: String,
    val category: List<FilterCategory>
)


val productList = listOf(
    Clothes(
        "men pink shirt",
        R.drawable.m_p_j,
        "450$",
        listOf(
            FilterCategory.ALL,
            FilterCategory.MEN,
        )
    ),

    Clothes(
        "Pink woman dress",
        R.drawable.w_p_d,
        "100$",
        listOf(
            FilterCategory.PARTY,
            FilterCategory.ALL,
        )
    ),

    Clothes(
        "D&G dress",
        R.drawable.d_g,
        "700$",
        listOf(
            FilterCategory.ALL,
            FilterCategory.PARTY,
        )
    ),

    Clothes(
        "Burberry",
        R.drawable.burberry,
        "2000$",
        listOf(
            FilterCategory.ALL,
            FilterCategory.MEN,
        )
    ),

    Clothes(
        "camping",
        R.drawable.camp,
        "200$",
        listOf(
            FilterCategory.ALL,
            FilterCategory.CAMPING,
        )
    ),
    Clothes(
        "camping jackets",
        R.drawable.camp2,
        "400$",
        listOf(
            FilterCategory.ALL,
            FilterCategory.CAMPING,
        )
    ),


    Clothes(
        "children hoodie",
        R.drawable.hoodie,
        "220$",
        listOf(
            FilterCategory.ALL,
            FilterCategory.CHILDREN,
        )
    ),

    Clothes(
        "dress",
        R.drawable.dress,
        "90$",
        listOf(
            FilterCategory.ALL,
            FilterCategory.CHILDREN,
        )
    )
)

val selectClothes = mutableListOf<Clothes>()