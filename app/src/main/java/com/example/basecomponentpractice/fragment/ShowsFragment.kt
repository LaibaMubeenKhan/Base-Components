package com.example.basecomponentpractice.fragment

import android.view.LayoutInflater
import com.example.basecomponentpractice.base.BaseFragment
import com.example.basecomponentpractice.databinding.FragmentShowsBinding
import com.example.basecomponentpractice.viewModel.BottomBaseViewModel

class ShowsFragment : BaseFragment<FragmentShowsBinding, BottomBaseViewModel>() {
    override fun inflateLayout(layoutInflater: LayoutInflater)= FragmentShowsBinding.inflate(layoutInflater)


    override fun getViewModelClass(): Class<BottomBaseViewModel> = BottomBaseViewModel::class.java

    override fun initViews() {
        _binding.tvTeamName.text=_viewModel.nameShows


    }
}

