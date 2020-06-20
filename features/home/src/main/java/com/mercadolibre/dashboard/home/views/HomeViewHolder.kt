package com.mercadolibre.dashboard.home.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mercadolibre.dashboard.features.home.databinding.ItemHomeBinding
import com.mercadolibre.dashboard.home.HomeViewModel
import com.mercadolibre.dashboard.model.Release


class HomeViewHolder(parent: View): RecyclerView.ViewHolder(parent) {

    private val binding = ItemHomeBinding.bind(parent)

    fun bindTo(release: Release, viewModel: HomeViewModel) {
        binding.release = release
        binding.vm = viewModel
    }
}