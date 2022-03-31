package com.example.basecomponentpractice.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding


abstract class BaseActivity<VB: ViewBinding,VM:ViewModel>:AppCompatActivity() {
    lateinit var binding: VB
    abstract fun inflateLayout(layoutInflater: LayoutInflater): VB
    lateinit var viewModel:VM
    abstract fun getViewModelClass(): Class<VM>
    abstract fun initViews()
//    var progressBar: ProgressBar? = binding.root.findViewById<ProgressBar>(R.id.progressBar)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // for viewBinding
        binding = inflateLayout(layoutInflater)
        setContentView(binding.root)
        //for view model
        viewModel= ViewModelProvider(this).get(getViewModelClass())


        // calling Abstract method
        initViews()
    }

//    fun progress(status:Status,view: View){
//  when(status){
//       is Status.Loading ->{
//           Log.e("progress","Loading")
//           view?.visibility=View.VISIBLE
//
//      }
//      is Status.Success->{
//          Log.e("progress","Success")
//          view?.visibility=View.GONE
//
//      }
//      is Status.Failed->{
//          Log.e("progress","Failed")
//          view?.visibility=View.GONE
//          Toast.makeText(this,"No Network",Toast.LENGTH_LONG).show()
//      }
//  }
////
////
////
////
//}


}