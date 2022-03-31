package com.example.basecomponentpractice.helper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

interface Recycler<T>{
    fun  inflate (layoutInflater: LayoutInflater, parent: ViewGroup?, attachToParent: Boolean):ViewBinding
    fun bind(item: T, binding: ViewBinding, position: Int):Unit


}