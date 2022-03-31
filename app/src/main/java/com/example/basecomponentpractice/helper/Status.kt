package com.example.basecomponentpractice.helper

sealed class Status {
    object Loading : Status() {}
    object Success : Status() {}
    object Failed : Status() {}
}