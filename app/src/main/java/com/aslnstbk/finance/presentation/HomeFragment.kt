package com.aslnstbk.finance.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aslnstbk.finance.R
import com.aslnstbk.finance.databinding.FragmentHomeBinding
import com.aslnstbk.finance.presentation.adapters.SpendingAdapter
import com.aslnstbk.finance.presentation.models.SpendingModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var spendingAdapter: SpendingAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewsData()
        initViews()
    }

    private fun initViewsData() {
        spendingAdapter = SpendingAdapter()
    }

    private fun initViews() {
        binding.fragmentHomeRecyclerView.adapter = spendingAdapter
        spendingAdapter.updateList(getTestList())
    }

    private fun getTestList(): List<SpendingModel> {
        val list: MutableList<SpendingModel> = mutableListOf()

        list.add(
            SpendingModel(
                id = 1,
                icon = R.drawable.ic_shopping_basket,
                category = "Shopping",
                cost = 1000,
                date = "30 June"
            )
        )
        list.add(
            SpendingModel(
                id = 1,
                icon = R.drawable.ic_shopping_basket,
                category = "Shopping",
                cost = 1000,
                date = "30 June"
            )
        )
        list.add(
            SpendingModel(
                id = 1,
                icon = R.drawable.ic_shopping_basket,
                category = "Shopping",
                cost = 1000,
                date = "30 June"
            )
        )
        list.add(
            SpendingModel(
                id = 1,
                icon = R.drawable.ic_shopping_basket,
                category = "Shopping",
                cost = 1000,
                date = "30 June"
            )
        )
        list.add(
            SpendingModel(
                id = 1,
                icon = R.drawable.ic_shopping_basket,
                category = "Shopping",
                cost = 1000,
                date = "30 June"
            )
        )
        list.add(
            SpendingModel(
                id = 1,
                icon = R.drawable.ic_shopping_basket,
                category = "Shopping",
                cost = 1000,
                date = "30 June"
            )
        )


        return list
    }
}