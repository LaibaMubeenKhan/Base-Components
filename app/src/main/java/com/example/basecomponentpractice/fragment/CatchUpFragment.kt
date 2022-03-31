package com.example.basecomponentpractice.fragment

import android.view.LayoutInflater
import com.example.basecomponentpractice.base.BaseFragment
import com.example.basecomponentpractice.databinding.FragmentCatchUpBinding
import com.example.basecomponentpractice.viewModel.BottomBaseViewModel

class CatchUpFragment : BaseFragment<FragmentCatchUpBinding, BottomBaseViewModel>() {
    override fun inflateLayout(layoutInflater: LayoutInflater)=FragmentCatchUpBinding.inflate(layoutInflater)

    override fun getViewModelClass(): Class<BottomBaseViewModel> = BottomBaseViewModel::class.java

    override fun initViews() {


    }

}