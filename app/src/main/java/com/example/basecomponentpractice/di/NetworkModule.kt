package com.example.basecomponentpractice.di

import android.content.Context
import com.example.basecomponentpractice.BuildConfig
import com.example.basecomponentpractice.api.ApiServices
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.OkHttpClient

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {


//    @Provides
//    fun provideGsonConverterFactory(): GsonConverterFactory = GsonConverterFactory.create()




//    @Provides
//    fun provideCache(@ApplicationContext context: BaseApplication): Cache {
//        val cacheSize = 10 * 1024 * 1024
//        return Cache(context.cacheDir, cacheSize.toLong())
//    }

//    @Provides
//    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
//        val httpLoggingInterceptor = HttpLoggingInterceptor()
//        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
//        return httpLoggingInterceptor
//    }

//    @Provides
//    fun provideRetrofit(
//    ): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl("https://fakestoreapi.com")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//
//    @Provides
//    fun provideApiServices(retrofit: Retrofit): ApiServices {
//        return retrofit.create(ApiServices::class.java)
//    }
//
//    @Binds
//     abstract fun bindApiServices(retrofit: Retrofit):ApiServices

}