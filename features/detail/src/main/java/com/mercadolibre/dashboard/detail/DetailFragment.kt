package com.mercadolibre.dashboard.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.mercadolibre.dashboard.common.base.BaseFragment
import com.mercadolibre.dashboard.common.base.BaseViewModel
import com.mercadolibre.dashboard.features.detail.databinding.FragmentDetailBinding
import org.koin.android.viewmodel.ext.android.viewModel

class DetailFragment : BaseFragment() {

    // FOR DATA
    private val viewModel: DetailViewModel by viewModel()
    private lateinit var binding: FragmentDetailBinding

    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.loadDataWhenActivityStarts(args.releaseId)
    }
    override fun getViewModel(): BaseViewModel = viewModel
}