package com.example.basecomponentpractice.fragment

import android.app.Activity
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.example.basecomponentpractice.*
import com.example.basecomponentpractice.base.BaseFragment
import com.example.basecomponentpractice.databinding.FragmentBlankBinding
import com.example.basecomponentpractice.databinding.ItemMainRecyclerBinding
import com.example.basecomponentpractice.databinding.ItemTopRecyclerBinding
import com.example.basecomponentpractice.recyclerView.GenericRecyclerView
import com.example.basecomponentpractice.viewModel.BottomBaseViewModel

class BlankFragment : BaseFragment<FragmentBlankBinding,BottomBaseViewModel>() {

    override fun inflateLayout(layoutInflater: LayoutInflater) =
        FragmentBlankBinding.inflate(layoutInflater)

    override fun getViewModelClass(): Class<BottomBaseViewModel> = BottomBaseViewModel::class.java

    override fun initViews() {


    }

}