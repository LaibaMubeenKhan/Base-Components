package com.example.basecomponentpractice.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Vb:ViewBinding,Vm:ViewModel>():Fragment() {

    lateinit var _binding : Vb
    abstract fun inflateLayout(layoutInflater: LayoutInflater): Vb
    lateinit var _viewModel: Vm
    protected abstract fun getViewModelClass(): Class<Vm>
    abstract fun initViews()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = inflateLayout(layoutInflater)
        _viewModel= ViewModelProvider(this).get(getViewModelClass())
        initViews()

        return _binding!!.root
    }



}