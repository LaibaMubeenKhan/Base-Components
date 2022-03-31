package com.example.basecomponentpractice.api

import com.example.basecomponentpractice.Model.ProductWrapper
import okhttp3.Response
import retrofit2.http.GET

interface ApiServices {

    @GET("products")
    suspend fun getProduct(): retrofit2.Response<ProductWrapper>
}