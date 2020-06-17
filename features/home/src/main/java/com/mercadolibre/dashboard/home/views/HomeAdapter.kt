package com.mercadolibre.dashboard.home.views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mercadolibre.dashboard.features.home.R
import com.mercadolibre.dashboard.home.HomeViewModel
import com.mercadolibre.dashboard.model.Release



class HomeAdapter(private val viewModel: HomeViewModel): RecyclerView.Adapter<HomeViewHolder>() {

    private val users: MutableList<Release> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false))

    override fun getItemCount(): Int
            = users.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int)
            = holder.bindTo(users[position], viewModel)

    // ---

    fun updateData(items: List<Release>) {
        val diffCallback = HomeItemDiffCallback(users, items)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        users.clear()
        users.addAll(items)
        diffResult.dispatchUpdatesTo(this)
    }
}