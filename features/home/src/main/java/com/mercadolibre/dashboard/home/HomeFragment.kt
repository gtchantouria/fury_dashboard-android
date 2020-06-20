package com.mercadolibre.dashboard.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mercadolibre.dashboard.common.base.BaseFragment
import com.mercadolibre.dashboard.common.base.BaseViewModel
import com.mercadolibre.dashboard.features.home.databinding.FragmentHomeBinding
import com.mercadolibre.dashboard.home.views.HomeAdapter
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment() {

    private val viewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureRecyclerView()
    }

    override fun getViewModel(): BaseViewModel = viewModel

    private fun configureRecyclerView() {
        binding.fragmentHomeRv.adapter = HomeAdapter(viewModel)
    }
}