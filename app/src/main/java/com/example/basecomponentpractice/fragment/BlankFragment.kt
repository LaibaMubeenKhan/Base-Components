package com.example.basecomponentpractice.fragment

import android.view.LayoutInflater
import com.example.basecomponentpractice.base.BaseFragment
import com.example.basecomponentpractice.databinding.FragmentHomeBinding
import com.example.basecomponentpractice.viewModel.BottomBaseViewModel

class BlankFragment : BaseFragment<FragmentHomeBinding,BottomBaseViewModel>() {
    override fun inflateLayout(layoutInflater: LayoutInflater) = FragmentHomeBinding.inflate(layoutInflater)

    override fun getViewModelClass(): Class<BottomBaseViewModel> = BottomBaseViewModel::class.java

    override fun initViews() {
        _binding.tvTeamName.text=_viewModel.nameHome
    }


}