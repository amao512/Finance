package com.aslnstbk.finance.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aslnstbk.finance.R
import com.aslnstbk.finance.presentation.models.SpendingModel

class SpendingAdapter : RecyclerView.Adapter<SpendingViewHolder>() {

    private val currentList: MutableList<SpendingModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpendingViewHolder {
        return SpendingViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_spending,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SpendingViewHolder, position: Int) {
        holder.onBind(currentList[position])
    }

    override fun getItemCount(): Int = currentList.size

    fun updateList(list: List<SpendingModel>) {
        currentList.clear()
        currentList.addAll(list)

        notifyDataSetChanged()
    }
}