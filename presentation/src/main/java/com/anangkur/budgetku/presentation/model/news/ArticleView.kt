package com.anangkur.budgetku.presentation.model.news

data class ArticleView(
    val id: Int = 0,
    val author: String? = "",
    val title: String? = "",
    val description: String? = "",
    val url: String? = "",
    val urlToImage: String? = "",
    val publishedAt: String? = "",
    val content: String? = "",
    var category: String? = ""
)