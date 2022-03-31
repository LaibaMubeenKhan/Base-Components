package com.example.basecomponentpractice.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.basecomponentpractice.helper.Status

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

    fun progress(status: Status, view: View){
        when(status){
            is Status.Loading ->{
                Log.e("progress","Loading")
                view?.visibility=View.VISIBLE

            }
            is Status.Success->{
                Log.e("progress","Success")
                view?.visibility=View.GONE

            }
            is Status.Failed->{
                Log.e("progress","Failed")
                view?.visibility=View.GONE
                Toast.makeText(context,"No Network", Toast.LENGTH_LONG).show()
            }
        }
//
//
//
//
    }



}