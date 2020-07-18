package com.anangkur.budgetku.data.model.budget

data class CategoryProjectEntity(
    var id: String,
    val title: String,
    val image: String,
    val value: Double,
    val spend: Double
)