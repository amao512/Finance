package com.aslnstbk.finance.presentation.models

data class SpendingModel(
    val id: Int,
    val category: String,
    val icon: Int,
    val cost: Int,
    val date: String
)