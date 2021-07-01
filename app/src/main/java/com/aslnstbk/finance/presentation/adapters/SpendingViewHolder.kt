package com.aslnstbk.finance.presentation.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aslnstbk.finance.R
import com.aslnstbk.finance.presentation.models.SpendingModel

class SpendingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private lateinit var iconImageView: ImageView
    private lateinit var categoryTextView: TextView
    private lateinit var costTextView: TextView
    private lateinit var dateTextView: TextView

    fun onBind(spendingModel: SpendingModel) {
        initializeViews()
        processSpendingModel(spendingModel)
    }

    private fun initializeViews() {
        with(itemView) {
            iconImageView = findViewById(R.id.item_spending_category_icon_image_view)
            categoryTextView = findViewById(R.id.item_spending_category_text_view)
            costTextView = findViewById(R.id.item_spending_cost_text_view)
            dateTextView = findViewById(R.id.item_spending_date_text_view)
        }
    }

    private fun processSpendingModel(spendingModel: SpendingModel) {
        iconImageView.setImageResource(spendingModel.icon)
        categoryTextView.text = spendingModel.category
        costTextView.text = "- ${spendingModel.cost} KZT"
        dateTextView.text = spendingModel.date
    }
}