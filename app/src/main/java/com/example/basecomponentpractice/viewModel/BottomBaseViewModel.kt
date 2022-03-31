package com.example.basecomponentpractice.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.basecomponentpractice.Model.ProductWrapper
import com.example.basecomponentpractice.api.ApiServices
import com.example.basecomponentpractice.helper.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class BottomBaseViewModel :ViewModel() {
//    var productList= MutableLiveData<ProductWrapper>()
//    var _productList: LiveData<ProductWrapper> = productList
//
//    init {
//        viewModelScope.launch(Dispatchers.IO)
//        {
//            try{
//                var result=apiServices.getProduct()
//                if(result.body() !=null) {
//                    productList.postValue(result.body())
//                }
//            }
//            catch (e:Exception){
//                e.printStackTrace()
//            }
//
//        }
//    }


}